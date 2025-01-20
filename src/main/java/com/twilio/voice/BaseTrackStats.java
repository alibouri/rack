package com.twilio.voice;

public abstract class BaseTrackStats {
    public final String codec;
    public final int packetsLost;
    public final String ssrc;
    public final double timestamp;
    public final String trackId;

    public BaseTrackStats(String s, int v, String s1, String s2, double f) {
        this.trackId = s;
        this.packetsLost = v;
        this.codec = s1;
        this.ssrc = s2;
        this.timestamp = f;
    }
}

