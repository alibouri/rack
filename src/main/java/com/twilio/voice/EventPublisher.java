package com.twilio.voice;

import M.J;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

class EventPublisher {
    interface EventPublisherEventListener {
        void onEventPublished(SeverityLevel arg1, String arg2, String arg3);

        void onMetricEventPublished(MetricEvent arg1);
    }

    interface EventPublisherListener {
        void onError(VoiceException arg1);
    }

    class EventPublisherStatus {
        private int errorCode;
        private String explanation;
        private volatile boolean invalidatePublishing;
        private String responseMessage;

        public EventPublisherStatus() {
            this.invalidatePublishing = false;
            this.errorCode = 0;
            this.responseMessage = "";
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        public String getExplanation() {
            return this.explanation;
        }

        public String getResponseMessage() {
            return this.responseMessage;
        }

        public void invalidatePublishing(boolean z) {
            this.invalidatePublishing = z;
        }

        public boolean isPublishingInvalidated() {
            return this.invalidatePublishing;
        }

        public void setErrorDetails(int v, String s, String s1) {
            this.errorCode = v;
            this.responseMessage = s;
            this.explanation = s1;
        }
    }

    private static final String TAG;
    private String accessToken;
    private Context context;
    List errorCodeList;
    private EventPublisherStatus eventPublisherStatus;
    private String homeRegion;
    private Map listenerMap;
    private static final Logger logger;
    private String publisherName;
    private EventPublisherEventListener publisherPublishEventListener;
    int result;
    String twilioProdSdkEventGatewayURL;
    String twilioProdSdkMetricsGatewayURL;

    static {
        EventPublisher.logger = Logger.getLogger(EventPublisher.class);
        EventPublisher.TAG = "EventPublisher";
    }

    public EventPublisher(Context context0, String s, String s1) {
        this.listenerMap = new HashMap();
        this.result = 0;
        this.eventPublisherStatus = new EventPublisherStatus(this);
        this.errorCodeList = Arrays.asList(new Integer[]{403});
        if(s1 == null) {
            throw new NullPointerException("accessToken must not be null.");
        }
        if(s == null) {
            throw new NullPointerException("publisherName must not be null.");
        }
        this.context = context0;
        this.accessToken = s1;
        this.publisherName = s;
        this.twilioProdSdkMetricsGatewayURL = Constants.getKeyKibanaMetricsHostUrl();
        this.twilioProdSdkEventGatewayURL = Constants.getKeyKibanaEventGatewayHostUrl();
        try {
            this.homeRegion = new AccessTokenParser(s1).getHomeRegion();
        }
        catch(AccessTokenParseException accessTokenParseException0) {
            accessTokenParseException0.printStackTrace();
        }
        String s2 = this.homeRegion;
        if(s2 != null) {
            this.updateServiceHostUrlsWithHomeRegion(s2);
        }
    }

    public EventPublisher(String s, String s1) {
        this(null, s, s1);
    }

    public void addEventPublisherEventListener(EventPublisherEventListener eventPublisher$EventPublisherEventListener0) {
        this.publisherPublishEventListener = eventPublisher$EventPublisherEventListener0;
    }

    public void addListener(EventPublisherListener eventPublisher$EventPublisherListener0) {
        Handler handler0 = Utils.createHandler();
        this.listenerMap.put(eventPublisher$EventPublisherListener0, handler0);
    }

    public Event createEvent(SeverityLevel constants$SeverityLevel0, String s, String s1, JSONObject jSONObject0) {
        return new Builder().productName(this.publisherName).eventName(s1).groupName(s).level(constants$SeverityLevel0).payLoadType("application/json").payLoad(jSONObject0).build();
    }

    public MetricEvent createMetricEvent(String s, String s1, JSONArray jSONArray0) {
        return new com.twilio.voice.MetricEvent.Builder().productName(this.publisherName).eventName(s1).groupName(s).level(SeverityLevel.INFO).payLoadType("application/json").payLoad(jSONArray0).build();
    }

    private void notifyListeners(int v, String s, String s1) {
        for(Object object0: this.listenerMap.entrySet()) {
            EventPublisherListener eventPublisher$EventPublisherListener0 = (EventPublisherListener)((Map.Entry)object0).getKey();
            Handler handler0 = (Handler)((Map.Entry)object0).getValue();
            if(handler0 != null) {
                handler0.post(new Runnable() {
                    @Override
                    public void run() {
                        EventPublisherListener eventPublisher$EventPublisherListener0 = eventPublisher$EventPublisherListener0;
                        if(eventPublisher$EventPublisherListener0 != null) {
                            eventPublisher$EventPublisherListener0.onError(new VoiceException(v, s, s1) {
                            });
                        }
                    }
                });
            }
        }
    }

    private void publish(String s, String s1) {
        new AsyncTask() {
            public Void doInBackground(Void[] arr_void) {
                HttpsURLConnection httpsURLConnection1;
                HttpsURLConnection httpsURLConnection0 = null;
                if(!EventPublisher.this.eventPublisherStatus.isPublishingInvalidated()) {
                    EventPublisher.logger.d("Start publishing events to : " + s1 + "\n" + s);
                    try {
                        httpsURLConnection1 = null;
                        httpsURLConnection1 = VoiceURLConnection.create(EventPublisher.this.accessToken, s1, "POST");
                        goto label_8;
                    }
                    catch(Exception exception0) {
                        goto label_38;
                    }
                    catch(Throwable throwable0) {
                    }
                    VoiceURLConnection.release(httpsURLConnection0);
                    throw throwable0;
                    try {
                        try {
                        label_8:
                            OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(httpsURLConnection1.getOutputStream());
                            outputStreamWriter0.write(s);
                            outputStreamWriter0.close();
                            EventPublisher.this.result = httpsURLConnection1.getResponseCode();
                            String s = httpsURLConnection1.getResponseMessage();
                            EventPublisher eventPublisher0 = EventPublisher.this;
                            int v = eventPublisher0.result;
                            if(v == 200) {
                                EventPublisher.logger.d("Response: " + EventPublisher.this.result + " - " + s);
                            }
                            else {
                                if(eventPublisher0.errorCodeList.contains(v)) {
                                    EventPublisher.logger.e("Invalidating further publishing : " + EventPublisher.this.result + " - " + s);
                                    EventPublisher.this.eventPublisherStatus.invalidatePublishing(true);
                                }
                                BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(httpsURLConnection1.getErrorStream()));
                                StringBuilder stringBuilder0 = new StringBuilder();
                                String s1;
                                while((s1 = bufferedReader0.readLine()) != null) {
                                    stringBuilder0.append(s1);
                                    stringBuilder0.append('\n');
                                }
                                bufferedReader0.close();
                                String s2 = EventPublisher.this.result + " - " + s + "-" + stringBuilder0.toString();
                                EventPublisher.logger.d("Response: " + s2);
                                EventPublisher.this.eventPublisherStatus.setErrorDetails(EventPublisher.this.result, s, s2);
                                EventPublisher.this.notifyListeners(EventPublisher.this.result, s, s2);
                            }
                        }
                        catch(Exception exception0) {
                        label_38:
                            Log.e(EventPublisher.TAG, " " + exception0.toString());
                            EventPublisher.logger.e(exception0.toString());
                        }
                    }
                    catch(Throwable throwable0) {
                        httpsURLConnection0 = httpsURLConnection1;
                        VoiceURLConnection.release(httpsURLConnection0);
                        throw throwable0;
                    }
                    VoiceURLConnection.release(httpsURLConnection1);
                    return null;
                }
                EventPublisher.this.notifyListeners(EventPublisher.this.result, EventPublisher.this.eventPublisherStatus.getResponseMessage(), EventPublisher.this.eventPublisherStatus.getExplanation());
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void publish(SeverityLevel constants$SeverityLevel0, String s, String s1, Event event0) {
        if(this.publisherPublishEventListener != null && !this.eventPublisherStatus.isPublishingInvalidated()) {
            this.publisherPublishEventListener.onEventPublished(constants$SeverityLevel0, s, s1);
        }
        this.publish(event0.toJSONObject(this.context).toString(), this.twilioProdSdkEventGatewayURL);
    }

    public void publishMetrics(MetricEvent metricEvent0) {
        if(metricEvent0 != null) {
            this.publish(metricEvent0.toJSONObject(this.context).toString(), this.twilioProdSdkMetricsGatewayURL);
            EventPublisherEventListener eventPublisher$EventPublisherEventListener0 = this.publisherPublishEventListener;
            if(eventPublisher$EventPublisherEventListener0 != null) {
                eventPublisher$EventPublisherEventListener0.onMetricEventPublished(metricEvent0);
            }
        }
    }

    public void removeListener(EventPublisherListener eventPublisher$EventPublisherListener0) {
        this.listenerMap.remove(eventPublisher$EventPublisherListener0);
    }

    private void updateServiceHostUrlsWithHomeRegion(String s) {
        this.twilioProdSdkMetricsGatewayURL = J.e("https://eventgw.", s, ".twilio.com/v4/EndpointMetrics");
        this.twilioProdSdkEventGatewayURL = J.e("https://eventgw.", s, ".twilio.com/v4/EndpointEvents");
    }
}

