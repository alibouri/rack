package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

abstract class InternalCall implements EventPublisherListener {
    private static final String TEMP_CALL_SID_PREFIX = "TSID";
    String bridgeToken;
    String codecParams;
    Context context;
    Direction direction;
    boolean disconnectCalled;
    String from;
    String gateway;
    Handler handler;
    boolean isMuted;
    boolean isOnHold;
    private static final Logger logger;
    private JSONArray payload;
    EventPublisher publisher;
    String region;
    private int sampleCounter;
    String selectedCodec;
    String selectedRegion;
    String sid;
    State state;
    private final String tempCallSid;
    String to;
    private final UUID uuid;

    static {
        InternalCall.logger = Logger.getLogger(InternalCall.class);
    }

    public InternalCall() {
        this.selectedRegion = Voice.region;
        UUID uUID0 = UUID.randomUUID();
        this.uuid = uUID0;
        this.tempCallSid = "TSID" + uUID0;
    }

    public Builder createEventPayloadBuilder() {
        return new Builder().callSid(this.sid).tempCallSid(this.tempCallSid).direction(this.direction).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName("twilio-voice-android").clientName(Utils.parseClientIdentity(this.to)).payLoadType("application/json");
    }

    public Builder createEventPayloadBuilderForSettingsEvent() {
        return this.createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    public abstract void disconnect();

    public EventPublisher getPublisher() {
        return this.publisher;
    }

    public abstract String getSid();

    public abstract State getState();

    public abstract boolean isMuted();

    public boolean isValidState() {
        return this.state != State.DISCONNECTED;
    }

    public abstract void mute(boolean arg1);

    @Override  // com.twilio.voice.EventPublisher$EventPublisherListener
    public void onError(VoiceException voiceException0) {
        InternalCall.logger.e("Error publishing data : " + voiceException0.getMessage() + ":" + voiceException0.getErrorCode());
    }

    public void onSample(RTCStatsSample rTCStatsSample0) {
        int v = this.sampleCounter + 1;
        this.sampleCounter = v;
        this.payload = InsightsUtils.publishMetrics(rTCStatsSample0, v, this.sid, this.direction, this.payload, this.publisher);
    }

    public void publishFeedbackEvent(Score call$Score0, Issue call$Issue0) {
        String s;
        EventPayload eventPayload0;
        InternalCall.logger.d("Publishing event feedback event");
        if(call$Score0 != Score.NOT_REPORTED || call$Issue0 != Issue.NOT_REPORTED) {
            eventPayload0 = this.createEventPayloadBuilder().score(call$Score0).issue(call$Issue0).build();
            s = "received";
        }
        else {
            eventPayload0 = this.createEventPayloadBuilder().build();
            s = "received-none";
        }
        try {
            JSONObject jSONObject0 = eventPayload0.getPayload();
            Event event0 = this.publisher.createEvent(SeverityLevel.INFO, "feedback", s, jSONObject0);
            this.publisher.publish(SeverityLevel.INFO, "feedback", s, event0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    public abstract void sendDigits(String arg1);

    public void setSid(String s) {
        this.sid = s;
    }
}

