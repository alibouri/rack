package com.twilio.voice;

public class IceCandidateStats {
    public final String candidateType;
    public final boolean deleted;
    public final String ip;
    public final boolean isRemote;
    public final int port;
    public final int priority;
    public final String protocol;
    public final String transportId;
    public final String url;

    public IceCandidateStats(String s, boolean z, String s1, int v, String s2, String s3, int v1, String s4, boolean z1) {
        this.transportId = s;
        this.isRemote = z;
        this.ip = s1;
        this.port = v;
        this.protocol = s2;
        this.candidateType = s3;
        this.priority = v1;
        this.url = s4;
        this.deleted = z1;
    }
}

