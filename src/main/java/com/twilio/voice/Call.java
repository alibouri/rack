package com.twilio.voice;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Pair;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import tvo.webrtc.voiceengine.WebRtcAudioManager;

public class Call extends InternalCall {
    public static enum CallQualityWarning {
        WARN_HIGH_RTT("high-rtt"),
        WARN_HIGH_JITTER("high-jitter"),
        WARN_HIGH_PACKET_LOSS("high-packet-loss"),
        WARN_LOW_MOS("low-mos"),
        WARN_CONSTANT_AUDIO_IN_LEVEL("constant-audio-input-level");

        private final String warningName;

        private CallQualityWarning(String s1) {
            this.warningName = s1;
        }

        public static CallQualityWarning fromString(String s) {
            CallQualityWarning call$CallQualityWarning0 = CallQualityWarning.WARN_HIGH_RTT;
            if(s.equals(call$CallQualityWarning0.warningName)) {
                return call$CallQualityWarning0;
            }
            CallQualityWarning call$CallQualityWarning1 = CallQualityWarning.WARN_HIGH_JITTER;
            if(s.equals(call$CallQualityWarning1.warningName)) {
                return call$CallQualityWarning1;
            }
            CallQualityWarning call$CallQualityWarning2 = CallQualityWarning.WARN_HIGH_PACKET_LOSS;
            if(s.equals(call$CallQualityWarning2.warningName)) {
                return call$CallQualityWarning2;
            }
            CallQualityWarning call$CallQualityWarning3 = CallQualityWarning.WARN_LOW_MOS;
            if(s.equals(call$CallQualityWarning3.warningName)) {
                return call$CallQualityWarning3;
            }
            CallQualityWarning call$CallQualityWarning4 = CallQualityWarning.WARN_CONSTANT_AUDIO_IN_LEVEL;
            if(!s.equals(call$CallQualityWarning4.warningName)) {
                throw new RuntimeException("Unsupported warning name string -> " + s);
            }
            return call$CallQualityWarning4;
        }

        @Override
        public String toString() {
            return this.warningName;
        }
    }

    interface EventListener {
        void onEvent(Map arg1);

        void onMetric(Map arg1);
    }

    public static enum Issue {
        NOT_REPORTED("not-reported"),
        DROPPED_CALL("dropped-call"),
        AUDIO_LATENCY("audio-latency"),
        ONE_WAY_AUDIO("one-way-audio"),
        CHOPPY_AUDIO("choppy-audio"),
        NOISY_CALL("noisy-call"),
        ECHO("echo");

        private final String issueName;

        private Issue(String s1) {
            this.issueName = s1;
        }

        @Override
        public String toString() {
            return this.issueName;
        }
    }

    public interface Listener {
        void onCallQualityWarningsChanged(Call arg1, Set arg2, Set arg3);

        void onConnectFailure(Call arg1, CallException arg2);

        void onConnected(Call arg1);

        void onDisconnected(Call arg1, CallException arg2);

        void onReconnected(Call arg1);

        void onReconnecting(Call arg1, CallException arg2);

        void onRinging(Call arg1);
    }

    public static enum Score {
        NOT_REPORTED(0),
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);

        private final int score;

        private Score(int v1) {
            this.score = v1;
        }

        public int getValue() {
            return this.score;
        }
    }

    public static enum State {
        CONNECTING,
        RINGING,
        CONNECTED,
        RECONNECTING,
        DISCONNECTED;

    }

    private static final Field blacklistDeviceForOpenSLESUsageField;
    private static final Field blacklistDeviceForOpenSLESUsageIsOverriddenField;
    private final Listener callListenerProxy;
    private ConnectivityReceiver connectivityReceiver;
    private Set currentCallQualityWarning;
    private EventListener eventListener;
    EventListener eventListenerProxy;
    private Listener listener;
    private List localAudioTracks;
    private static final Logger logger;
    private MediaFactory mediaFactory;
    private long nativeCallDelegate;
    private final StatsListener statsListenerProxy;
    private Queue statsListenersQueue;
    private final ThreadChecker threadChecker;

    static {
        try {
            Field field0 = WebRtcAudioManager.class.getDeclaredField("blacklistDeviceForOpenSLESUsage");
            Call.blacklistDeviceForOpenSLESUsageField = field0;
            Field field1 = WebRtcAudioManager.class.getDeclaredField("blacklistDeviceForOpenSLESUsageIsOverridden");
            Call.blacklistDeviceForOpenSLESUsageIsOverriddenField = field1;
            field0.setAccessible(true);
            field1.setAccessible(true);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0.getMessage());
        }
        Call.logger = Logger.getLogger(Call.class);
    }

    public Call(Context context0, CallInvite callInvite0, Listener call$Listener0) {
        this.localAudioTracks = Collections.emptyList();
        this.connectivityReceiver = null;
        this.callListenerProxy = new Listener() {
            @Override  // com.twilio.voice.Call$Listener
            public void onCallQualityWarningsChanged(Call call0, Set set0, Set set1) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onCallQualityWarningsChanged()");
                        Call.this.currentCallQualityWarning = set0;
                        Call.this.listener.onCallQualityWarningsChanged(call0, set0, set1);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnectFailure(Call call0, CallException callException0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.this.releaseCall();
                        Call.logger.d("onConnectFailure()");
                        Call.this.unregisterConnectivityBroadcastReceiver(Call.this.context);
                        Voice.calls.remove(Call.this);
                        Voice.rejects.remove(Call.this);
                        Call.this.state = State.DISCONNECTED;
                        Call.this.release();
                        Call.this.listener.onConnectFailure(call0, callException0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnected(Call call0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onConnected()");
                        Call.this.state = State.CONNECTED;
                        long v = Call.this.nativeCallDelegate;
                        call0.sid = Call.this.nativeGetSid(v);
                        Call.this.listener.onConnected(call0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onDisconnected(Call call0, CallException callException0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.this.releaseCall();
                        Call.logger.d("onDisconnected()");
                        Call.this.unregisterConnectivityBroadcastReceiver(Call.this.context);
                        Voice.calls.remove(Call.this);
                        Voice.rejects.remove(Call.this);
                        Call.this.state = State.DISCONNECTED;
                        Call.this.release();
                        Call.this.listener.onDisconnected(call0, callException0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnected(Call call0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onReconnected()");
                        Call.this.state = State.CONNECTED;
                        Call.this.listener.onReconnected(call0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnecting(Call call0, CallException callException0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onReconnecting()");
                        Call.this.state = State.RECONNECTING;
                        Call.this.listener.onReconnecting(call0, callException0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onRinging(Call call0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onRinging()");
                        Call.this.state = State.RINGING;
                        call0.sid = Call.this.nativeGetSid(Call.this.nativeCallDelegate);
                        Call.this.listener.onRinging(call0);
                    }
                });
            }
        };
        this.eventListenerProxy = new EventListener() {
            @Override  // com.twilio.voice.Call$EventListener
            public void onEvent(Map map0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(Call.this.eventListener != null) {
                            Call.this.eventListener.onEvent(map0);
                        }
                        if(!((String)((Pair)map0.get("group")).first).equals("audio-level-warning-raised") && !((String)((Pair)map0.get("group")).first).equals("network-quality-warning-raised")) {
                            if(((String)((Pair)map0.get("group")).first).equals("connection") && ((String)((Pair)map0.get("name")).first).equals("ringing")) {
                                Call.this.sid = (String)((Pair)map0.get("call-sid")).first;
                            }
                            if(((String)((Pair)map0.get("group")).first).equals("settings")) {
                                if(((String)((Pair)map0.get("name")).first).equals("codec")) {
                                    Call.this.codecParams = (String)((Pair)map0.get("codec_params")).first;
                                    Call.this.selectedCodec = (String)((Pair)map0.get("selected_codec")).first;
                                }
                                else if(((String)((Pair)map0.get("name")).first).equals("edge")) {
                                    Call.this.gateway = (String)((Pair)map0.get("edge-host-name")).first;
                                    Call.this.region = (String)((Pair)map0.get("edge")).first;
                                }
                                Builder eventPayload$Builder0 = Call.this.createEventPayloadBuilderForSettingsEvent();
                                InsightsUtils.processEvent(map0, eventPayload$Builder0, Call.this.publisher, Call.this.direction);
                                return;
                            }
                            Builder eventPayload$Builder1 = Call.this.createEventPayloadBuilder();
                            InsightsUtils.processEvent(map0, eventPayload$Builder1, Call.this.publisher, Call.this.direction);
                            return;
                        }
                        Builder eventPayload$Builder2 = Call.this.createEventPayloadBuilder();
                        InsightsUtils.processWarningEvent(map0, eventPayload$Builder2, Call.this.publisher);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$EventListener
            public void onMetric(Map map0) {
                if(Call.this.eventListener != null) {
                    Call.this.eventListener.onMetric(map0);
                }
                if(((String)((Pair)map0.get("group")).first).equals("quality-metrics-samples")) {
                    RTCStatsSample rTCStatsSample0 = InsightsUtils.createRtcSample(map0);
                    Call.this.onSample(rTCStatsSample0);
                }
            }
        };
        this.statsListenerProxy = new StatsListener() {
            @Override  // com.twilio.voice.StatsListener
            public void onStats(List list0) {
                Pair pair0 = (Pair)Call.this.statsListenersQueue.poll();
                if(pair0 != null) {
                    ((Handler)pair0.first).post(new Runnable() {
                        @Override
                        public void run() {
                            ((StatsListener)pair0.second).onStats(list0);
                        }
                    });
                }
            }
        };
        this.context = context0;
        this.listener = call$Listener0;
        this.from = callInvite0.getFrom();
        this.to = callInvite0.getTo();
        this.sid = callInvite0.getCallSid();
        this.bridgeToken = callInvite0.getBridgeToken();
        this.disconnectCalled = false;
        this.direction = Direction.INCOMING;
        Handler handler0 = Utils.createHandler();
        this.handler = handler0;
        this.threadChecker = new ThreadChecker(handler0.getLooper().getThread());
        this.state = State.CONNECTING;
        EventPublisher eventPublisher0 = new EventPublisher(context0, "twilio-voice-android", this.bridgeToken);
        this.publisher = eventPublisher0;
        eventPublisher0.addListener(this);
        this.statsListenersQueue = new ConcurrentLinkedQueue();
        Call.configureOpenSLES();
    }

    public Call(Context context0, String s, Listener call$Listener0) {
        this.localAudioTracks = Collections.emptyList();
        this.connectivityReceiver = null;
        this.callListenerProxy = new Listener() {
            @Override  // com.twilio.voice.Call$Listener
            public void onCallQualityWarningsChanged(Call call0, Set set0, Set set1) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onCallQualityWarningsChanged()");
                        Call.this.currentCallQualityWarning = set0;
                        Call.this.listener.onCallQualityWarningsChanged(call0, set0, set1);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnectFailure(Call call0, CallException callException0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.this.releaseCall();
                        Call.logger.d("onConnectFailure()");
                        Call.this.unregisterConnectivityBroadcastReceiver(Call.this.context);
                        Voice.calls.remove(Call.this);
                        Voice.rejects.remove(Call.this);
                        Call.this.state = State.DISCONNECTED;
                        Call.this.release();
                        Call.this.listener.onConnectFailure(call0, callException0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnected(Call call0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onConnected()");
                        Call.this.state = State.CONNECTED;
                        long v = Call.this.nativeCallDelegate;
                        call0.sid = Call.this.nativeGetSid(v);
                        Call.this.listener.onConnected(call0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onDisconnected(Call call0, CallException callException0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.this.releaseCall();
                        Call.logger.d("onDisconnected()");
                        Call.this.unregisterConnectivityBroadcastReceiver(Call.this.context);
                        Voice.calls.remove(Call.this);
                        Voice.rejects.remove(Call.this);
                        Call.this.state = State.DISCONNECTED;
                        Call.this.release();
                        Call.this.listener.onDisconnected(call0, callException0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnected(Call call0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onReconnected()");
                        Call.this.state = State.CONNECTED;
                        Call.this.listener.onReconnected(call0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnecting(Call call0, CallException callException0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onReconnecting()");
                        Call.this.state = State.RECONNECTING;
                        Call.this.listener.onReconnecting(call0, callException0);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onRinging(Call call0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Call.logger.d("onRinging()");
                        Call.this.state = State.RINGING;
                        call0.sid = Call.this.nativeGetSid(Call.this.nativeCallDelegate);
                        Call.this.listener.onRinging(call0);
                    }
                });
            }
        };
        this.eventListenerProxy = new EventListener() {
            @Override  // com.twilio.voice.Call$EventListener
            public void onEvent(Map map0) {
                Call.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(Call.this.eventListener != null) {
                            Call.this.eventListener.onEvent(map0);
                        }
                        if(!((String)((Pair)map0.get("group")).first).equals("audio-level-warning-raised") && !((String)((Pair)map0.get("group")).first).equals("network-quality-warning-raised")) {
                            if(((String)((Pair)map0.get("group")).first).equals("connection") && ((String)((Pair)map0.get("name")).first).equals("ringing")) {
                                Call.this.sid = (String)((Pair)map0.get("call-sid")).first;
                            }
                            if(((String)((Pair)map0.get("group")).first).equals("settings")) {
                                if(((String)((Pair)map0.get("name")).first).equals("codec")) {
                                    Call.this.codecParams = (String)((Pair)map0.get("codec_params")).first;
                                    Call.this.selectedCodec = (String)((Pair)map0.get("selected_codec")).first;
                                }
                                else if(((String)((Pair)map0.get("name")).first).equals("edge")) {
                                    Call.this.gateway = (String)((Pair)map0.get("edge-host-name")).first;
                                    Call.this.region = (String)((Pair)map0.get("edge")).first;
                                }
                                Builder eventPayload$Builder0 = Call.this.createEventPayloadBuilderForSettingsEvent();
                                InsightsUtils.processEvent(map0, eventPayload$Builder0, Call.this.publisher, Call.this.direction);
                                return;
                            }
                            Builder eventPayload$Builder1 = Call.this.createEventPayloadBuilder();
                            InsightsUtils.processEvent(map0, eventPayload$Builder1, Call.this.publisher, Call.this.direction);
                            return;
                        }
                        Builder eventPayload$Builder2 = Call.this.createEventPayloadBuilder();
                        InsightsUtils.processWarningEvent(map0, eventPayload$Builder2, Call.this.publisher);
                    }
                });
            }

            @Override  // com.twilio.voice.Call$EventListener
            public void onMetric(Map map0) {
                if(Call.this.eventListener != null) {
                    Call.this.eventListener.onMetric(map0);
                }
                if(((String)((Pair)map0.get("group")).first).equals("quality-metrics-samples")) {
                    RTCStatsSample rTCStatsSample0 = InsightsUtils.createRtcSample(map0);
                    Call.this.onSample(rTCStatsSample0);
                }
            }
        };
        this.statsListenerProxy = new StatsListener() {
            @Override  // com.twilio.voice.StatsListener
            public void onStats(List list0) {
                Pair pair0 = (Pair)Call.this.statsListenersQueue.poll();
                if(pair0 != null) {
                    ((Handler)pair0.first).post(new Runnable() {
                        @Override
                        public void run() {
                            ((StatsListener)pair0.second).onStats(list0);
                        }
                    });
                }
            }
        };
        this.context = context0;
        this.listener = call$Listener0;
        this.state = State.CONNECTING;
        this.direction = Direction.OUTGOING;
        Handler handler0 = Utils.createHandler();
        this.handler = handler0;
        this.threadChecker = new ThreadChecker(handler0.getLooper().getThread());
        EventPublisher eventPublisher0 = new EventPublisher(context0, "twilio-voice-android", s);
        this.publisher = eventPublisher0;
        eventPublisher0.addListener(this);
        this.statsListenersQueue = new ConcurrentLinkedQueue();
        Call.configureOpenSLES();
    }

    public void accept(AcceptOptions acceptOptions0, long v) {
        this.registerConnectivityBroadcastReceiver(this.context);
        Voice.calls.add(this);
        CallOptions.checkAudioTracksReleased(acceptOptions0.getAudioTracks());
        this.localAudioTracks = acceptOptions0.getAudioTracks();
        synchronized(this.callListenerProxy) {
            Voice.loadLibrary(this.context);
            this.mediaFactory = MediaFactory.instance(this, this.context);
            this.nativeCallDelegate = this.nativeAccept(acceptOptions0, this.callListenerProxy, this.statsListenerProxy, this.eventListenerProxy, this.handler, v);
        }
    }

    public static void configureOpenSLES() {
        if(!Call.openSLESEnabled()) {
            WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(true);
        }
    }

    public void connect(ConnectOptions connectOptions0) {
        this.registerConnectivityBroadcastReceiver(this.context);
        Voice.calls.add(this);
        CallOptions.checkAudioTracksReleased(connectOptions0.getAudioTracks());
        this.localAudioTracks = connectOptions0.getAudioTracks();
        synchronized(this.callListenerProxy) {
            Voice.loadLibrary(this.context);
            this.mediaFactory = MediaFactory.instance(this, this.context);
            if(connectOptions0.getEventListener() != null) {
                this.eventListener = connectOptions0.getEventListener();
            }
            this.nativeCallDelegate = this.nativeConnect(connectOptions0, this.callListenerProxy, this.statsListenerProxy, this.eventListenerProxy, this.mediaFactory.getNativeMediaFactoryHandle(), this.handler);
        }
    }

    @Override  // com.twilio.voice.InternalCall
    public void disconnect() {
        synchronized(this) {
            if(!this.disconnectCalled && this.isValidState() && this.nativeCallDelegate != 0L) {
                this.disconnectCalled = true;
                Call.logger.d("Calling disconnect " + this.state);
                this.nativeDisconnect(this.nativeCallDelegate);
            }
        }
    }

    public static ThreadChecker e(Call call0) {
        return call0.threadChecker;
    }

    public Set getCallQualityWarnings() {
        return this.currentCallQualityWarning;
    }

    public String getFrom() {
        return this.from;
    }

    @Override  // com.twilio.voice.InternalCall
    public String getSid() {
        return this.sid;
    }

    @Override  // com.twilio.voice.InternalCall
    public State getState() {
        return this.state;
    }

    public void getStats(StatsListener statsListener0) {
        synchronized(this) {
            Preconditions.checkNotNull(statsListener0, "statsListener must not be null");
            if(this.state == State.DISCONNECTED) {
                return;
            }
            this.statsListenersQueue.offer(new Pair(Utils.createHandler(), statsListener0));
            this.nativeGetStats(this.nativeCallDelegate);
        }
    }

    public String getTo() {
        return this.to;
    }

    public void hold(boolean z) {
        synchronized(this) {
            if(this.isValidState()) {
                this.isOnHold = z;
                this.nativeHold(this.nativeCallDelegate, z);
            }
        }
    }

    @Override  // com.twilio.voice.InternalCall
    public boolean isMuted() {
        return this.isMuted;
    }

    public boolean isOnHold() {
        return this.isOnHold;
    }

    private boolean isPermittedNetworkChangeEvent(NetworkChangeEvent voice$NetworkChangeEvent0) {
        return voice$NetworkChangeEvent0 != NetworkChangeEvent.CONNECTION_CHANGED || this.state != State.CONNECTING && this.state != State.RINGING;
    }

    @Override  // com.twilio.voice.InternalCall
    public void mute(boolean z) {
        synchronized(this) {
            if(this.isValidState()) {
                this.isMuted = z;
                this.nativeMute(this.nativeCallDelegate, z);
            }
        }
    }

    private native long nativeAccept(AcceptOptions arg1, Listener arg2, StatsListener arg3, EventListener arg4, Handler arg5, long arg6) {
    }

    private native long nativeConnect(ConnectOptions arg1, Listener arg2, StatsListener arg3, EventListener arg4, long arg5, Handler arg6) {
    }

    private native void nativeDisconnect(long arg1) {
    }

    private native String nativeGetSid(long arg1) {
    }

    private native void nativeGetStats(long arg1) {
    }

    private native void nativeHold(long arg1, boolean arg2) {
    }

    private native void nativeMute(long arg1, boolean arg2) {
    }

    private native void nativeNetworkChange(long arg1, NetworkChangeEvent arg2) {
    }

    private native long nativeReject(AcceptOptions arg1, Listener arg2, EventListener arg3, Handler arg4, long arg5) {
    }

    private native void nativeRelease(long arg1) {
    }

    private native void nativeReleaseCall(long arg1) {
    }

    private native void nativeSendDigits(long arg1, String arg2) {
    }

    public void networkChange(NetworkChangeEvent voice$NetworkChangeEvent0) {
        if(this.isValidState() && this.isPermittedNetworkChangeEvent(voice$NetworkChangeEvent0)) {
            this.nativeNetworkChange(this.nativeCallDelegate, voice$NetworkChangeEvent0);
            return;
        }
        Call.logger.d("Ignoring networkChangeEvent: " + voice$NetworkChangeEvent0.name() + " in Call.State: " + this.state);
    }

    @Override  // com.twilio.voice.InternalCall
    public void onError(VoiceException voiceException0) {
        super.onError(voiceException0);
    }

    public static boolean openSLESEnabled() {
        try {
            return !((Boolean)Call.blacklistDeviceForOpenSLESUsageField.get(null)).booleanValue() && ((Boolean)Call.blacklistDeviceForOpenSLESUsageIsOverriddenField.get(null)).booleanValue();
        }
        catch(Exception unused_ex) {
            throw new RuntimeException("Failed to determine if OpenSLES is enabled.");
        }
    }

    public void postFeedback(Score call$Score0, Issue call$Issue0) {
        Preconditions.checkNotNull(call$Score0, "score must not be null");
        Preconditions.checkNotNull(call$Issue0, "issue must not be null");
        this.publishFeedbackEvent(call$Score0, call$Issue0);
    }

    private void registerConnectivityBroadcastReceiver(Context context0) {
        ConnectivityReceiver connectivityReceiver0 = new ConnectivityReceiver();
        this.connectivityReceiver = connectivityReceiver0;
        context0.registerReceiver(connectivityReceiver0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void reject(AcceptOptions acceptOptions0, long v) {
        this.registerConnectivityBroadcastReceiver(this.context);
        Voice.rejects.add(this);
        this.localAudioTracks = acceptOptions0.getAudioTracks();
        synchronized(this.callListenerProxy) {
            Voice.loadLibrary(this.context);
            this.mediaFactory = MediaFactory.instance(this, this.context);
            this.nativeCallDelegate = this.nativeReject(acceptOptions0, this.callListenerProxy, this.eventListenerProxy, this.handler, v);
        }
    }

    public void release() {
        synchronized(this) {
            for(Object object0: this.localAudioTracks) {
                ((LocalAudioTrack)object0).release();
            }
            long v1 = this.nativeCallDelegate;
            if(v1 != 0L) {
                this.nativeRelease(v1);
                this.nativeCallDelegate = 0L;
                MediaFactory mediaFactory0 = this.mediaFactory;
                if(mediaFactory0 != null) {
                    mediaFactory0.release(this);
                }
            }
        }
    }

    private void releaseCall() {
        synchronized(this) {
            long v1 = this.nativeCallDelegate;
            if(v1 != 0L) {
                this.nativeReleaseCall(v1);
            }
        }
    }

    @Override  // com.twilio.voice.InternalCall
    public void sendDigits(String s) {
        synchronized(this) {
            Preconditions.checkNotNull(s, "digits must not be null");
            if(s.matches("^[0-9\\*\\#w]+$")) {
                if(this.isValidState()) {
                    this.nativeSendDigits(this.nativeCallDelegate, s);
                }
                return;
            }
        }
        throw new IllegalArgumentException("digits string must not be null and should only contains 0-9, *, #, or w characters");
    }

    private void unregisterConnectivityBroadcastReceiver(Context context0) {
        context0.unregisterReceiver(this.connectivityReceiver);
        this.connectivityReceiver = null;
    }
}

