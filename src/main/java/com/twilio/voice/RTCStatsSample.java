package com.twilio.voice;

import org.json.JSONObject;

class RTCStatsSample {
    Long audioInputLevel;
    Long audioOutputLevel;
    String callSid;
    String codec;
    Direction direction;
    float fractionLost;
    Long jitter;
    private static final Logger logger;
    float mos;
    Long packetsLost;
    Long packetsReceived;
    Long packetsSent;
    Long rtt;
    String timeStamp;
    String timestampMS;
    Long totalBytesReceived;
    Long totalBytesSent;
    Long totalPacketsLost;
    Long totalPacketsReceived;
    Long totalPacketsSent;

    static {
        RTCStatsSample.logger = Logger.getLogger(RTCStatsSample.class);
    }

    public Long getAudioInputLevel() {
        return (long)(((long)this.audioInputLevel) == -1L ? -1L : 0x80L * ((long)this.audioInputLevel));
    }

    public Long getAudioOutputLevel() {
        return (long)(((long)this.audioOutputLevel) == -1L ? -1L : 0x80L * ((long)this.audioOutputLevel));
    }

    public String getCallSid() {
        return this.callSid;
    }

    public String getCodec() {
        return this.codec;
    }

    public double getFractionLost() {
        return (double)this.fractionLost;
    }

    public Long getJitter() {
        return this.jitter;
    }

    public float getMos() {
        return this.mos;
    }

    public double getMosScore() {
        return (double)this.mos;
    }

    public Long getPacketsLost() {
        return this.packetsLost;
    }

    public Long getPacketsReceived() {
        return this.packetsReceived;
    }

    public Long getPacketsSent() {
        return this.packetsSent;
    }

    public Long getRtt() {
        return this.rtt;
    }

    public String getTimestamp() {
        return this.timeStamp;
    }

    public String getTimestampMillis() {
        return this.timestampMS;
    }

    public Long getTotalBytesReceived() {
        return this.totalBytesReceived;
    }

    public Long getTotalBytesSent() {
        return this.totalBytesSent;
    }

    public Long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    public Long getTotalPacketsReceived() {
        return this.totalPacketsReceived;
    }

    public Long getTotalPacketsSent() {
        return this.totalPacketsSent;
    }

    public void setCallSid(String s) {
        this.callSid = s;
    }

    public void setDirection(Direction constants$Direction0) {
        this.direction = constants$Direction0;
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("timestamp", this.getTimestamp());
            jSONObject0.put("timestamp_ms", this.getTimestampMillis());
            jSONObject0.put("call_sid", this.getCallSid());
            jSONObject0.put("sdk_version", "6.1.2");
            jSONObject0.put("packets_received", this.getPacketsReceived());
            jSONObject0.put("total_packets_lost", this.getTotalPacketsLost());
            jSONObject0.put("packets_lost_fraction", this.getFractionLost());
            jSONObject0.put("packets_lost", this.getPacketsLost());
            jSONObject0.put("total_packets_sent", this.getTotalPacketsSent());
            jSONObject0.put("total_packets_received", this.getTotalPacketsReceived());
            jSONObject0.put("total_bytes_received", this.getTotalBytesReceived());
            jSONObject0.put("total_bytes_sent", this.getTotalBytesSent());
            jSONObject0.put("jitter", this.getJitter());
            jSONObject0.put("rtt", this.getRtt());
            jSONObject0.put("audio_level_in", this.getAudioInputLevel());
            jSONObject0.put("audio_level_out", this.getAudioOutputLevel());
            jSONObject0.put("mos", ((double)this.getMos()));
            jSONObject0.put("audio_codec", this.getCodec());
            jSONObject0.put("direction", this.direction);
            RTCStatsSample.logger.v(jSONObject0.toString());
            return jSONObject0;
        }
        catch(Exception exception0) {
            RTCStatsSample.logger.e(exception0.toString());
            return null;
        }
    }

    @Override
    public String toString() {
        return "StatsExtended [timestamp=" + this.timeStamp + ", packetsReceived=" + this.packetsReceived + ", packetsLost=" + this.packetsLost + ", packetsSent=" + this.packetsSent + ", bytesReceived=" + this.totalBytesReceived + ", bytesSent=" + this.totalBytesSent + ", jitter=" + this.jitter + ", rtt=" + this.rtt + ", audioInputLevel=" + this.audioInputLevel + ", audioOutputLevel=" + this.audioOutputLevel + "]";
    }
}

