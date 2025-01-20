package com.twilio.voice;

public abstract class RemoteTrackStats extends BaseTrackStats {
    public final long bytesReceived;
    public final int packetsReceived;

    public RemoteTrackStats(String s, int v, String s1, String s2, double f, long v1, int v2) {
        super(s, v, s1, s2, f);
        this.bytesReceived = v1;
        this.packetsReceived = v2;
    }
}

