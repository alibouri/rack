package com.twilio.voice;

public abstract class LocalTrackStats extends BaseTrackStats {
    public final long bytesSent;
    public final int packetsSent;
    public final long roundTripTime;

    public LocalTrackStats(String s, int v, String s1, String s2, double f, long v1, int v2, long v3) {
        super(s, v, s1, s2, f);
        this.bytesSent = v1;
        this.packetsSent = v2;
        this.roundTripTime = v3;
    }
}

