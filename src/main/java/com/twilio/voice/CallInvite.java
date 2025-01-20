package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class CallInvite implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String bridgeToken;
    final Map callInviteMessage;
    private final Listener callListenerProxy;
    private final String callSid;
    private CallerInfo callerInfo;
    final Map customParameters;
    EventListener eventListenerProxy;
    private final String from;
    private static final Logger logger;
    private final String messageSid;
    private final String stirStatus;
    private final String to;

    static {
        CallInvite.logger = Logger.getLogger(InternalCall.class);
        CallInvite.CREATOR = new Parcelable.Creator() {
            public CallInvite createFromParcel(Parcel parcel0) {
                return new CallInvite(0, parcel0);
            }

            public CallInvite[] newArray(int v) {
                return new CallInvite[v];
            }
        };
    }

    public CallInvite(int v, Parcel parcel0) {
        this(parcel0);
    }

    private CallInvite(Parcel parcel0) {
        this.callListenerProxy = new Listener() {
            @Override  // com.twilio.voice.Call$Listener
            public void onCallQualityWarningsChanged(Call call0, Set set0, Set set1) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnectFailure(Call call0, CallException callException0) {
                call0.release();
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnected(Call call0) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onDisconnected(Call call0, CallException callException0) {
                call0.release();
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnected(Call call0) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnecting(Call call0, CallException callException0) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onRinging(Call call0) {
            }
        };
        this.eventListenerProxy = new EventListener() {
            @Override  // com.twilio.voice.Call$EventListener
            public void onEvent(Map map0) {
            }

            @Override  // com.twilio.voice.Call$EventListener
            public void onMetric(Map map0) {
            }
        };
        String[] arr_s = new String[6];
        parcel0.readStringArray(arr_s);
        this.from = arr_s[0];
        this.to = arr_s[1];
        this.callSid = arr_s[2];
        this.bridgeToken = arr_s[3];
        this.messageSid = arr_s[4];
        this.stirStatus = arr_s[5];
        this.callerInfo = new CallerInfo(arr_s[5]);
        int v1 = parcel0.readInt();
        this.callInviteMessage = new HashMap(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            this.callInviteMessage.put(s, s1);
        }
        int v3 = parcel0.readInt();
        this.customParameters = new HashMap(v3);
        for(int v = 0; v < v3; ++v) {
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            this.customParameters.put(s2, s3);
        }
    }

    private CallInvite(Map map0) {
        this.callListenerProxy = new Listener() {
            @Override  // com.twilio.voice.Call$Listener
            public void onCallQualityWarningsChanged(Call call0, Set set0, Set set1) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnectFailure(Call call0, CallException callException0) {
                call0.release();
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onConnected(Call call0) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onDisconnected(Call call0, CallException callException0) {
                call0.release();
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnected(Call call0) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onReconnecting(Call call0, CallException callException0) {
            }

            @Override  // com.twilio.voice.Call$Listener
            public void onRinging(Call call0) {
            }
        };
        this.eventListenerProxy = new EventListener() {
            @Override  // com.twilio.voice.Call$EventListener
            public void onEvent(Map map0) {
            }

            @Override  // com.twilio.voice.Call$EventListener
            public void onMetric(Map map0) {
            }
        };
        this.from = (String)map0.get("twi_from");
        this.to = (String)map0.get("twi_to");
        this.callSid = (String)map0.get("twi_call_sid");
        this.bridgeToken = (String)map0.get("twi_bridge_token");
        this.messageSid = (String)map0.get("twi_message_id");
        String s = (String)map0.get("twi_stir_status");
        this.stirStatus = s;
        this.callerInfo = new CallerInfo(s);
        HashMap hashMap0 = new HashMap();
        this.customParameters = hashMap0;
        String s1 = (String)map0.get("twi_params");
        if(s1 != null) {
            Utils.parseCustomParams(s1, hashMap0);
        }
        this.callInviteMessage = map0;
    }

    public Call accept(Context context0, AcceptOptions acceptOptions0, Listener call$Listener0) {
        synchronized(this) {
            return this.accept(context0, acceptOptions0, call$Listener0, this.eventListenerProxy);
        }
    }

    public Call accept(Context context0, AcceptOptions acceptOptions0, Listener call$Listener0, EventListener call$EventListener0) {
        synchronized(this) {
            Preconditions.checkNotNull(context0, "context must not be null");
            Preconditions.checkNotNull(acceptOptions0, "acceptOptions must not be null");
            Preconditions.checkNotNull(call$Listener0, "listener must not be null");
            if(Utils.isAudioPermissionGranted(context0)) {
                Call call0 = new Call(context0.getApplicationContext(), this, call$Listener0);
                CallInviteProxy callInviteProxy0 = (CallInviteProxy)Voice.callInviteProxyMap.get(this.callSid);
                if(callInviteProxy0 == null) {
                    Utils.createHandler().post(new Runnable() {
                        @Override
                        public void run() {
                            CallInvite.logger.d("Attempted to accept CallInvite that was previously accepted,rejected, or cancelled.");
                            call0.state = State.DISCONNECTED;
                            call$Listener0.onConnectFailure(call0, CallException.CallCancelledException);
                        }
                    });
                }
                else {
                    Builder acceptOptions$Builder0 = new Builder(this, false);
                    if(acceptOptions0.getIceOptions() != null) {
                        acceptOptions$Builder0.iceOptions(acceptOptions0.getIceOptions());
                    }
                    if(acceptOptions0.getPreferredAudioCodecs() != null) {
                        acceptOptions$Builder0.preferAudioCodecs(acceptOptions0.getPreferredAudioCodecs());
                    }
                    acceptOptions$Builder0.enableDscp(acceptOptions0.enableDscp);
                    acceptOptions$Builder0.enableIceGatheringOnAnyAddressPorts(acceptOptions0.enableIceGatheringOnAnyAddressPorts);
                    acceptOptions$Builder0.audioTracks(Collections.singletonList(LocalAudioTrack.create(context0, true)));
                    AcceptOptions acceptOptions1 = acceptOptions$Builder0.build();
                    callInviteProxy0.setCall(call0);
                    callInviteProxy0.setEventListener(call$EventListener0);
                    call0.accept(acceptOptions1, callInviteProxy0.nativeCallInviteProxy);
                    callInviteProxy0.release(this.callSid);
                }
                return call0;
            }
        }
        throw new SecurityException("Requires the RECORD_AUDIO permission");
    }

    public Call accept(Context context0, Listener call$Listener0) {
        synchronized(this) {
            return this.accept(context0, new Builder().build(), call$Listener0);
        }
    }

    public static CallInvite create(Map map0) {
        return new CallInvite(map0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CallInvite && this.getFrom().equals(((CallInvite)object0).getFrom()) && this.getTo().equals(((CallInvite)object0).getTo()) && this.getCallSid().equals(((CallInvite)object0).getCallSid());
    }

    public String getBridgeToken() {
        return this.bridgeToken;
    }

    public String getCallSid() {
        return this.callSid;
    }

    public CallerInfo getCallerInfo() {
        return this.callerInfo;
    }

    public Map getCustomParameters() {
        return this.customParameters;
    }

    public String getFrom() {
        return this.from;
    }

    public String getMessageSid() {
        return this.messageSid;
    }

    public String getTo() {
        return this.to;
    }

    public static boolean isValid(Context context0, Bundle bundle0) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkNotNull(bundle0, "data must not be null");
        return CallInvite.isValid(context0, Utils.bundleToMap(bundle0));
    }

    public static boolean isValid(Context context0, Map map0) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkNotNull(map0, "data must not be null");
        Pair pair0 = Utils.mapToArrays(map0);
        Voice.loadLibrary(context0);
        return CallInvite.nativeIsValid(((String[])pair0.first), ((String[])pair0.second));
    }

    private static native boolean nativeIsValid(String[] arg0, String[] arg1) {
    }

    public void reject(Context context0) {
        synchronized(this) {
            this.reject(context0, this.callListenerProxy, this.eventListenerProxy);
        }
    }

    public void reject(Context context0, Listener call$Listener0, EventListener call$EventListener0) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkNotNull(context0, "listener must not be null");
        Preconditions.checkNotNull(context0, "eventListener must not be null");
        Call call0 = new Call(context0.getApplicationContext(), this, call$Listener0);
        CallInviteProxy callInviteProxy0 = (CallInviteProxy)Voice.callInviteProxyMap.get(this.callSid);
        if(callInviteProxy0 != null) {
            AcceptOptions acceptOptions0 = new Builder(this, true).build();
            callInviteProxy0.setEventListener(call$EventListener0);
            call0.reject(acceptOptions0, callInviteProxy0.nativeCallInviteProxy);
            callInviteProxy0.release(this.callSid);
            return;
        }
        Utils.createHandler().post(new Runnable() {
            @Override
            public void run() {
                CallInvite.logger.d("Attempted to reject CallInvite that was previously accepted,rejected, or cancelled.");
                call0.state = State.DISCONNECTED;
                call$Listener0.onConnectFailure(call0, CallException.CallCancelledException);
            }
        });
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringArray(new String[]{this.from, this.to, this.callSid, this.bridgeToken, this.messageSid, this.stirStatus});
        parcel0.writeInt(this.callInviteMessage.size());
        for(Object object0: this.callInviteMessage.entrySet()) {
            parcel0.writeString(((String)((Map.Entry)object0).getKey()));
            parcel0.writeString(((String)((Map.Entry)object0).getValue()));
        }
        Map map0 = this.customParameters;
        if(map0 != null) {
            parcel0.writeInt(map0.size());
            for(Object object1: this.customParameters.entrySet()) {
                parcel0.writeString(((String)((Map.Entry)object1).getKey()));
                parcel0.writeString(((String)((Map.Entry)object1).getValue()));
            }
        }
    }
}

