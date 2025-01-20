package com.twilio.voice;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Pair;
import java.util.Map;

class CallInviteProxy implements MessageListener {
    private Call call;
    private CallInvite callInvite;
    String codecParams;
    private ConnectivityReceiver connectivityReceiver;
    private final Context context;
    private EventListener eventListener;
    private final EventListener eventListenerProxy;
    private String gateway;
    private final Handler handler;
    private static final Logger logger;
    private final MediaFactory mediaFactory;
    private final MessageListener messageListener;
    long nativeCallInviteProxy;
    private EventPublisher publisher;
    private String region;
    private boolean released;
    String selectedCodec;
    private String selectedRegion;
    private final ThreadChecker threadChecker;

    static {
        CallInviteProxy.logger = Logger.getLogger(CallInviteProxy.class);
    }

    private CallInviteProxy(Context context0, long v, Handler handler0, MessageListener messageListener0, CallInvite callInvite0) {
        this.released = false;
        String s = null;
        this.connectivityReceiver = null;
        this.selectedRegion = Voice.region;
        this.eventListenerProxy = new EventListener() {
            @Override  // com.twilio.voice.Call$EventListener
            public void onEvent(Map map0) {
                CallInviteProxy.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        CallInviteProxy.logger.d("onEvent");
                        if(((String)((Pair)map0.get("group")).first).equals("registration") && ((String)((Pair)map0.get("name")).first).equals("unsupported-cancel-message-error")) {
                            String s = (String)((Pair)map0.get("call-sid")).first;
                            CallInviteProxy.this.release(s);
                        }
                        if(CallInviteProxy.this.eventListener != null) {
                            CallInviteProxy.this.eventListener.onEvent(map0);
                        }
                        CallInviteProxy.this.publishEvent(map0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$EventListener
            public void onMetric(Map map0) {
                com.twilio.voice.CallInviteProxy.1.2 callInviteProxy$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        CallInviteProxy.logger.d("onMetric");
                        if(CallInviteProxy.this.eventListener != null) {
                            CallInviteProxy.this.eventListener.onMetric(map0);
                        }
                        if(((String)((Pair)map0.get("group")).first).equals("quality-metrics-samples")) {
                            CallInviteProxy.this.call.onSample(InsightsUtils.createRtcSample(map0));
                        }
                    }
                };
                CallInviteProxy.this.handler.post(callInviteProxy$1$20);
            }
        };
        this.context = context0;
        this.nativeCallInviteProxy = v;
        this.handler = handler0;
        this.threadChecker = new ThreadChecker(handler0.getLooper().getThread());
        this.messageListener = messageListener0;
        this.mediaFactory = MediaFactory.instance(this, context0);
        this.callInvite = callInvite0;
        if(Voice.callSidBridgeTokenPair != null && ((String)Voice.callSidBridgeTokenPair.first).equals(callInvite0.getCallSid())) {
            s = (String)Voice.callSidBridgeTokenPair.second;
        }
        if(s != null) {
            EventPublisher eventPublisher0 = new EventPublisher(context0, "twilio-voice-android", s);
            this.publisher = eventPublisher0;
            eventPublisher0.addListener(new EventPublisherListener() {
                @Override  // com.twilio.voice.EventPublisher$EventPublisherListener
                public void onError(VoiceException voiceException0) {
                    CallInviteProxy.i().e("Error publishing data : " + voiceException0.getMessage() + ":" + voiceException0.getErrorCode());
                }
            });
        }
    }

    private Builder createEventPayloadBuilder() {
        return new Builder().callSid(this.callInvite.getCallSid()).messageSid(this.callInvite.getMessageSid()).direction(Direction.INCOMING).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName("twilio-voice-android").clientName(Utils.parseClientIdentity(this.callInvite.getTo())).payLoadType("application/json");
    }

    public Builder createEventPayloadBuilderForSettingsEvent() {
        return this.createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    public static ThreadChecker f(CallInviteProxy callInviteProxy0) {
        return callInviteProxy0.threadChecker;
    }

    private native void nativeNetworkChange(long arg1, NetworkChangeEvent arg2) {
    }

    private native void nativeRelease(long arg1) {
    }

    public void networkChange(NetworkChangeEvent voice$NetworkChangeEvent0) {
        if(!this.released) {
            this.nativeNetworkChange(this.nativeCallInviteProxy, voice$NetworkChangeEvent0);
            return;
        }
        CallInviteProxy.logger.d("Ignoring networkChangeEvent: " + voice$NetworkChangeEvent0.name() + " because CallInviteProxy is released");
    }

    @Override  // com.twilio.voice.MessageListener
    public void onCallInvite(CallInvite callInvite0) {
        com.twilio.voice.CallInviteProxy.2 callInviteProxy$20 = new Runnable() {
            @Override
            public void run() {
                CallInviteProxy.logger.d("onCallInvite");
                Voice.callInviteProxyMap.put(callInvite0.getCallSid(), CallInviteProxy.this);
                CallInviteProxy.this.registerConnectivityBroadcastReceiver();
                CallInviteProxy.this.messageListener.onCallInvite(callInvite0);
            }
        };
        this.handler.post(callInviteProxy$20);
    }

    @Override  // com.twilio.voice.MessageListener
    public void onCancelledCallInvite(CancelledCallInvite cancelledCallInvite0, CallException callException0) {
        com.twilio.voice.CallInviteProxy.3 callInviteProxy$30 = new Runnable() {
            @Override
            public void run() {
                Logger logger0 = CallInviteProxy.logger;
                StringBuilder stringBuilder0 = new StringBuilder("onCancelledCallInvite: CallException code: ");
                CallException callException0 = callException0;
                String s = callException0 == null ? "null" : callException0.getErrorCode();
                stringBuilder0.append(s);
                logger0.d(stringBuilder0.toString());
                CallInviteProxy.this.release(cancelledCallInvite0.getCallSid());
                if(!CallInviteProxy.this.released) {
                    CallInviteProxy.this.messageListener.onCancelledCallInvite(cancelledCallInvite0, callException0);
                }
            }
        };
        this.handler.post(callInviteProxy$30);
    }

    private void publishEvent(Map map0) {
        if(((String)((Pair)map0.get("group")).first).equals("settings")) {
            if(((String)((Pair)map0.get("name")).first).equals("codec")) {
                this.codecParams = (String)((Pair)map0.get("codec_params")).first;
                this.selectedCodec = (String)((Pair)map0.get("selected_codec")).first;
            }
            else if(((String)((Pair)map0.get("name")).first).equals("edge")) {
                this.gateway = (String)((Pair)map0.get("edge-host-name")).first;
                this.region = (String)((Pair)map0.get("edge")).first;
            }
            InsightsUtils.processEvent(map0, this.createEventPayloadBuilderForSettingsEvent(), this.publisher, Direction.INCOMING);
            return;
        }
        InsightsUtils.processEvent(map0, this.createEventPayloadBuilder(), this.publisher, Direction.INCOMING);
    }

    private void registerConnectivityBroadcastReceiver() {
        ConnectivityReceiver connectivityReceiver0 = new ConnectivityReceiver();
        this.connectivityReceiver = connectivityReceiver0;
        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.context.registerReceiver(connectivityReceiver0, intentFilter0);
    }

    public void release(String s) {
        synchronized(this) {
            CallInviteProxy.logger.d("release");
            if(!this.released) {
                this.unregisterConnectivityBroadcastReceiver();
                Voice.callInviteProxyMap.remove(s);
                long v1 = this.nativeCallInviteProxy;
                if(v1 != 0L) {
                    this.nativeRelease(v1);
                    this.nativeCallInviteProxy = 0L;
                }
                this.mediaFactory.release(this);
                this.released = true;
            }
        }
    }

    public void setCall(Call call0) {
        synchronized(this) {
            this.call = call0;
        }
    }

    public void setEventListener(EventListener call$EventListener0) {
        synchronized(this) {
            this.eventListener = call$EventListener0;
        }
    }

    private void unregisterConnectivityBroadcastReceiver() {
        ConnectivityReceiver connectivityReceiver0 = this.connectivityReceiver;
        if(connectivityReceiver0 != null) {
            this.context.unregisterReceiver(connectivityReceiver0);
        }
    }
}

