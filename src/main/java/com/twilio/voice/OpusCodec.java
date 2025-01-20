package com.twilio.voice;

public class OpusCodec extends AudioCodec {
    static int DEFAULT_BITRATE = 0;
    static int MAX_BITRATE = 510000;
    static int MIN_BITRATE = 6000;
    public static final String NAME = "opus";
    private int maxAverageBitrate;
    private boolean useDtx;

    public OpusCodec() {
        super("opus");
        this.maxAverageBitrate = OpusCodec.DEFAULT_BITRATE;
        this.useDtx = false;
    }

    public OpusCodec(int v) {
        super("opus");
        this.maxAverageBitrate = OpusCodec.DEFAULT_BITRATE;
        this.useDtx = false;
        if(v >= OpusCodec.MIN_BITRATE && v <= OpusCodec.MAX_BITRATE) {
            this.maxAverageBitrate = v;
        }
    }

    public OpusCodec(int v, boolean z) {
        super("opus");
        this.maxAverageBitrate = OpusCodec.DEFAULT_BITRATE;
        this.useDtx = false;
        if(v >= OpusCodec.MIN_BITRATE && v <= OpusCodec.MAX_BITRATE) {
            this.maxAverageBitrate = v;
        }
        this.useDtx = z;
    }

    public int getMaxAverageBitrate() {
        return this.maxAverageBitrate;
    }

    public boolean isDtxEnabled() {
        return this.useDtx;
    }
}

