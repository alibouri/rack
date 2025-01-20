package com.twilio.voice;

public class LocalAudioTrackStats extends LocalTrackStats {
    public final int audioLevel;
    public final int jitter;

    public LocalAudioTrackStats(String s, int v, String s1, String s2, double f, long v1, int v2, long v3, int v4, int v5) {
        super(s, v, s1, s2, f, v1, v2, v3);
        this.audioLevel = v4;
        this.jitter = v5;
    }
}

