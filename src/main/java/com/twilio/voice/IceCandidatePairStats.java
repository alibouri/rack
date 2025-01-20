package com.twilio.voice;

public class IceCandidatePairStats {
    public final boolean activeCandidatePair;
    public final double availableIncomingBitrate;
    public final double availableOutgoingBitrate;
    public final long bytesReceived;
    public final long bytesSent;
    public final long consentRequestsReceived;
    public final long consentRequestsSent;
    public final long consentResponsesReceived;
    public final long consentResponsesSent;
    public final double currentRoundTripTime;
    public final String localCandidateId;
    public final String localCandidateIp;
    public final boolean nominated;
    public final long priority;
    public final boolean readable;
    public final String relayProtocol;
    public final String remoteCandidateId;
    public final String remoteCandidateIp;
    public final long requestsReceived;
    public final long requestsSent;
    public final long responsesReceived;
    public final long responsesSent;
    public final long retransmissionsReceived;
    public final long retransmissionsSent;
    public final IceCandidatePairState state;
    public final double totalRoundTripTime;
    public final String transportId;
    public final boolean writeable;

    public IceCandidatePairStats(String s, String s1, String s2, IceCandidatePairState iceCandidatePairState0, String s3, String s4, long v, boolean z, boolean z1, boolean z2, long v1, long v2, double f, double f1, double f2, double f3, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, boolean z3, String s5) {
        this.transportId = s;
        this.localCandidateId = s1;
        this.remoteCandidateId = s2;
        this.state = iceCandidatePairState0;
        this.localCandidateIp = s3;
        this.remoteCandidateIp = s4;
        this.priority = v;
        this.nominated = z;
        this.writeable = z1;
        this.readable = z2;
        this.bytesSent = v1;
        this.bytesReceived = v2;
        this.totalRoundTripTime = f;
        this.currentRoundTripTime = f1;
        Logger.getLogger(IceCandidatePairStats.class).d("stats.current_round_trip_time " + f1);
        this.availableOutgoingBitrate = f2;
        this.availableIncomingBitrate = f3;
        this.requestsReceived = v3;
        this.requestsSent = v4;
        this.responsesReceived = v5;
        this.responsesSent = v6;
        this.retransmissionsReceived = v7;
        this.retransmissionsSent = v8;
        this.consentRequestsReceived = v9;
        this.consentRequestsSent = v10;
        this.consentResponsesReceived = v11;
        this.consentResponsesSent = v12;
        this.activeCandidatePair = z3;
        this.relayProtocol = s5;
    }
}

