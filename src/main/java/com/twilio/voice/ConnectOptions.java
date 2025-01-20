package com.twilio.voice;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class ConnectOptions extends CallOptions {
    public static class Builder extends com.twilio.voice.CallOptions.Builder {
        private final String accessToken;
        private Map params;

        public Builder(String s) {
            Preconditions.checkNotNull(s, "accessToken must not be null");
            this.accessToken = s;
        }

        public static String a(Builder connectOptions$Builder0) {
            return connectOptions$Builder0.accessToken;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder audioTracks(List list0) {
            return this.audioTracks(list0);
        }

        public Builder audioTracks(List list0) {
            Preconditions.checkNotNull(list0, "audioTracks must not be null");
            super.audioTracks(list0);
            return this;
        }

        public static Map b(Builder connectOptions$Builder0) {
            return connectOptions$Builder0.params;
        }

        public ConnectOptions build() {
            CallOptions.checkAudioTracksReleased(this.audioTracks);
            Map map0 = this.params;
            if(map0 != null) {
                for(Object object0: map0.entrySet()) {
                    boolean z = true;
                    Preconditions.checkState(((Map.Entry)object0).getKey() != null, "params entry key should not be null");
                    if(((Map.Entry)object0).getValue() == null) {
                        z = false;
                    }
                    Preconditions.checkState(z, "params entry value should not be null");
                }
            }
            return new ConnectOptions(this, 0);
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder enableDscp(boolean z) {
            return this.enableDscp(z);
        }

        public Builder enableDscp(boolean z) {
            super.enableDscp(z);
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder enableIceGatheringOnAnyAddressPorts(boolean z) {
            return this.enableIceGatheringOnAnyAddressPorts(z);
        }

        public Builder enableIceGatheringOnAnyAddressPorts(boolean z) {
            super.enableIceGatheringOnAnyAddressPorts(z);
            return this;
        }

        public Builder eventListener(EventListener call$EventListener0) {
            this.eventListener = call$EventListener0;
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder iceOptions(IceOptions iceOptions0) {
            return this.iceOptions(iceOptions0);
        }

        public Builder iceOptions(IceOptions iceOptions0) {
            Preconditions.checkNotNull(iceOptions0, "iceOptions must not be null");
            super.iceOptions(iceOptions0);
            return this;
        }

        public Builder params(Map map0) {
            Preconditions.checkNotNull(map0, "params must not be null");
            this.params = map0;
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder preferAudioCodecs(List list0) {
            return this.preferAudioCodecs(list0);
        }

        public Builder preferAudioCodecs(List list0) {
            Preconditions.checkNotNull(list0, "preferredAudioCodecs must not be null");
            CallOptions.checkAudioCodecs(list0);
            super.preferAudioCodecs(list0);
            return this;
        }
    }

    private final String accessToken;
    private EventListener eventListener;
    private final Map params;

    private ConnectOptions() {
        this.accessToken = "";
        this.params = new HashMap();
    }

    private ConnectOptions(Builder connectOptions$Builder0) {
        this.accessToken = Builder.a(connectOptions$Builder0);
        List list0 = connectOptions$Builder0.audioTracks;
        if(list0 == null) {
            list0 = new ArrayList();
        }
        this.audioTracks = list0;
        this.iceOptions = connectOptions$Builder0.iceOptions;
        this.preferredAudioCodecs = connectOptions$Builder0.preferredAudioCodecs;
        Map map0 = Builder.b(connectOptions$Builder0) == null ? new HashMap() : Builder.b(connectOptions$Builder0);
        this.params = map0;
        this.platformInfo = new PlatformInfo();
        this.eventListener = connectOptions$Builder0.eventListener;
        this.enableDscp = connectOptions$Builder0.enableDscp;
        this.enableIceGatheringOnAnyAddressPorts = connectOptions$Builder0.enableIceGatheringOnAnyAddressPorts;
    }

    public ConnectOptions(Builder connectOptions$Builder0, int v) {
        this(connectOptions$Builder0);
    }

    private long createNativeConnectOptionsBuilder() {
        CallOptions.checkAudioTracksReleased(this.audioTracks);
        Pair pair0 = Utils.mapToArrays(this.params);
        String[] arr_s = (String[])pair0.first;
        String[] arr_s1 = (String[])pair0.second;
        LocalAudioTrack[] arr_localAudioTrack = this.getLocalAudioTracksArray();
        IceOptions iceOptions0 = this.iceOptions;
        boolean z = this.enableDscp;
        boolean z1 = this.enableIceGatheringOnAnyAddressPorts;
        AudioCodec[] arr_audioCodec = this.getAudioCodecsArray();
        return this.nativeCreate(this.accessToken, arr_s, arr_s1, arr_localAudioTrack, iceOptions0, z, z1, arr_audioCodec, this.platformInfo);
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public EventListener getEventListener() {
        return this.eventListener;
    }

    public Map getParams() {
        return this.params;
    }

    private native long nativeCreate(String arg1, String[] arg2, String[] arg3, LocalAudioTrack[] arg4, IceOptions arg5, boolean arg6, boolean arg7, AudioCodec[] arg8, PlatformInfo arg9) {
    }
}

