package com.twilio.voice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcceptOptions extends CallOptions {
    public static class Builder extends com.twilio.voice.CallOptions.Builder {
        private final CallInvite callInvite;

        public Builder() {
            this.callInvite = null;
        }

        public Builder(CallInvite callInvite0, boolean z) {
            Preconditions.checkNotNull(callInvite0);
            this.callInvite = callInvite0;
        }

        public static CallInvite a(Builder acceptOptions$Builder0) {
            return acceptOptions$Builder0.callInvite;
        }

        public Builder audioTracks(List list0) {
            Preconditions.checkNotNull(list0, "audioTracks must not be null");
            super.audioTracks(list0);
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder audioTracks(List list0) {
            return this.audioTracks(list0);
        }

        public AcceptOptions build() {
            CallOptions.checkAudioTracksReleased(this.audioTracks);
            return new AcceptOptions(this, 0);
        }

        public Builder enableDscp(boolean z) {
            super.enableDscp(z);
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder enableDscp(boolean z) {
            return this.enableDscp(z);
        }

        public Builder enableIceGatheringOnAnyAddressPorts(boolean z) {
            super.enableIceGatheringOnAnyAddressPorts(z);
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder enableIceGatheringOnAnyAddressPorts(boolean z) {
            return this.enableIceGatheringOnAnyAddressPorts(z);
        }

        public Builder iceOptions(IceOptions iceOptions0) {
            Preconditions.checkNotNull(iceOptions0, "iceOptions must not be null");
            super.iceOptions(iceOptions0);
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder iceOptions(IceOptions iceOptions0) {
            return this.iceOptions(iceOptions0);
        }

        public Builder preferAudioCodecs(List list0) {
            Preconditions.checkNotNull(list0, "preferredAudioCodecs must not be null");
            CallOptions.checkAudioCodecs(list0);
            super.preferAudioCodecs(list0);
            return this;
        }

        @Override  // com.twilio.voice.CallOptions$Builder
        public com.twilio.voice.CallOptions.Builder preferAudioCodecs(List list0) {
            return this.preferAudioCodecs(list0);
        }
    }

    private final Map callInviteMessage;

    private AcceptOptions() {
        this.callInviteMessage = null;
    }

    private AcceptOptions(Builder acceptOptions$Builder0) {
        List list0 = acceptOptions$Builder0.audioTracks;
        if(list0 == null) {
            list0 = new ArrayList();
        }
        this.audioTracks = list0;
        this.iceOptions = acceptOptions$Builder0.iceOptions;
        this.enableDscp = acceptOptions$Builder0.enableDscp;
        this.enableIceGatheringOnAnyAddressPorts = acceptOptions$Builder0.enableIceGatheringOnAnyAddressPorts;
        this.preferredAudioCodecs = acceptOptions$Builder0.preferredAudioCodecs;
        Map map0 = Builder.a(acceptOptions$Builder0) == null ? new HashMap() : Builder.a(acceptOptions$Builder0).callInviteMessage;
        this.callInviteMessage = map0;
        this.platformInfo = new PlatformInfo();
    }

    public AcceptOptions(Builder acceptOptions$Builder0, int v) {
        this(acceptOptions$Builder0);
    }

    private long createNativeAcceptOptionsBuilder() {
        CallOptions.checkAudioTracksReleased(this.audioTracks);
        return this.nativeCreate(this.getLocalAudioTracksArray(), this.iceOptions, this.enableDscp, this.enableIceGatheringOnAnyAddressPorts, this.getAudioCodecsArray(), this.platformInfo);
    }

    private native long nativeCreate(LocalAudioTrack[] arg1, IceOptions arg2, boolean arg3, boolean arg4, AudioCodec[] arg5, PlatformInfo arg6) {
    }
}

