package com.twilio.voice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m5.b;

public abstract class CallOptions {
    public static abstract class Builder {
        List audioTracks;
        boolean enableDscp;
        boolean enableIceGatheringOnAnyAddressPorts;
        EventListener eventListener;
        IceOptions iceOptions;
        List preferredAudioCodecs;

        public Builder() {
            this.enableDscp = true;
            this.enableIceGatheringOnAnyAddressPorts = false;
            this.eventListener = null;
        }

        public Builder audioTracks(List list0) {
            Preconditions.checkNotNull(list0, "audioTracks must not be null");
            this.audioTracks = new ArrayList(list0);
            return this;
        }

        public Builder enableDscp(boolean z) {
            this.enableDscp = z;
            return this;
        }

        public Builder enableIceGatheringOnAnyAddressPorts(boolean z) {
            this.enableIceGatheringOnAnyAddressPorts = z;
            return this;
        }

        public Builder iceOptions(IceOptions iceOptions0) {
            Preconditions.checkNotNull(iceOptions0, "iceOptions must not be null");
            this.iceOptions = iceOptions0;
            return this;
        }

        public Builder preferAudioCodecs(List list0) {
            Preconditions.checkNotNull(list0, "preferredAudioCodecs must not be null");
            this.preferredAudioCodecs = new ArrayList(list0);
            return this;
        }
    }

    private static final Set SUPPORTED_CODECS;
    List audioTracks;
    boolean enableDscp;
    boolean enableIceGatheringOnAnyAddressPorts;
    IceOptions iceOptions;
    PlatformInfo platformInfo;
    List preferredAudioCodecs;

    static {
        CallOptions.SUPPORTED_CODECS = new HashSet(Arrays.asList(new Class[]{OpusCodec.class, PcmuCodec.class}));
    }

    public static void checkAudioCodecs(List list0) {
        for(Object object0: list0) {
            Preconditions.checkNotNull(((AudioCodec)object0));
            Class class0 = ((AudioCodec)object0).getClass();
            Preconditions.checkArgument(CallOptions.SUPPORTED_CODECS.contains(class0), b.w("Unsupported audio codec ", ((AudioCodec)object0).getName()));
        }
    }

    public static void checkAudioTracksReleased(List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                Preconditions.checkState(!((LocalAudioTrack)object0).isReleased(), "LocalAudioTrack cannot be released");
            }
        }
    }

    public AudioCodec[] getAudioCodecsArray() {
        return this.preferredAudioCodecs == null || this.preferredAudioCodecs.isEmpty() ? new AudioCodec[0] : ((AudioCodec[])this.preferredAudioCodecs.toArray(new AudioCodec[this.preferredAudioCodecs.size()]));
    }

    public List getAudioTracks() {
        return this.audioTracks;
    }

    public IceOptions getIceOptions() {
        return this.iceOptions;
    }

    public LocalAudioTrack[] getLocalAudioTracksArray() {
        return this.audioTracks.size() <= 0 ? new LocalAudioTrack[0] : ((LocalAudioTrack[])this.audioTracks.toArray(new LocalAudioTrack[this.audioTracks.size()]));
    }

    public List getPreferredAudioCodecs() {
        return this.preferredAudioCodecs;
    }

    public boolean isDscpEnabled() {
        return this.enableDscp;
    }

    public boolean isIceGatheringOnAnyAddressPortsEnabled() {
        return this.enableIceGatheringOnAnyAddressPorts;
    }
}

