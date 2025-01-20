package com.twilio.voice;

public class RemoteAudioTrackStats extends RemoteTrackStats {
    public final int audioLevel;
    public final int jitter;
    public final float mos;

    public RemoteAudioTrackStats(String s, int v, String s1, String s2, double f, long v1, int v2, int v3, int v4, float f1) {
        super(s, v, s1, s2, f, v1, v2);
        this.audioLevel = v3;
        this.jitter = v4;
        this.mos = f1;
    }
}

