package com.twilio.voice;

import java.util.ArrayList;
import java.util.List;

public class StatsReport {
    private List iceCandidatePairStats;
    private List iceCandidateStats;
    private List localAudioTrackStats;
    private final String peerConnectionId;
    private List remoteAudioTrackStats;

    public StatsReport(String s) {
        this.localAudioTrackStats = new ArrayList();
        this.remoteAudioTrackStats = new ArrayList();
        this.iceCandidatePairStats = new ArrayList();
        this.iceCandidateStats = new ArrayList();
        this.peerConnectionId = s;
    }

    public void addAudioTrackStats(RemoteAudioTrackStats remoteAudioTrackStats0) {
        this.remoteAudioTrackStats.add(remoteAudioTrackStats0);
    }

    public void addIceCandidatePairStats(IceCandidatePairStats iceCandidatePairStats0) {
        this.iceCandidatePairStats.add(iceCandidatePairStats0);
    }

    public void addIceCandidateStats(IceCandidateStats iceCandidateStats0) {
        this.iceCandidateStats.add(iceCandidateStats0);
    }

    public void addLocalAudioTrackStats(LocalAudioTrackStats localAudioTrackStats0) {
        this.localAudioTrackStats.add(localAudioTrackStats0);
    }

    public List getIceCandidatePairStats() {
        return this.iceCandidatePairStats;
    }

    public List getIceCandidateStats() {
        return this.iceCandidateStats;
    }

    public List getLocalAudioTrackStats() {
        return this.localAudioTrackStats;
    }

    public String getPeerConnectionId() {
        return this.peerConnectionId;
    }

    public List getRemoteAudioTrackStats() {
        return this.remoteAudioTrackStats;
    }
}

