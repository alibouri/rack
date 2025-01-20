package com.twilio.voice;

class MonitorThresholds {
    static class Builder {
        private int maxDurationConstantAudioInputLevel;
        private int maxDurationConstantAudioOutputLevel;
        private int maxJitterThreshold;
        private int maxPacketsLostFraction;
        private int maxRttThreshold;
        private int minMosScoreThreshhold;

        public Builder() {
            this.minMosScoreThreshhold = -1;
            this.maxDurationConstantAudioInputLevel = -1;
            this.maxDurationConstantAudioOutputLevel = -1;
            this.maxPacketsLostFraction = -1;
            this.maxJitterThreshold = -1;
            this.maxRttThreshold = -1;
        }

        public static int a(Builder monitorThresholds$Builder0) {
            return monitorThresholds$Builder0.maxDurationConstantAudioInputLevel;
        }

        public Builder audioConstantInputLevelSampleCounter(int v) {
            this.maxDurationConstantAudioInputLevel = v;
            return this;
        }

        public Builder audioConstantOutputLevelSampleCounter(int v) {
            this.maxDurationConstantAudioOutputLevel = v;
            return this;
        }

        public static int b(Builder monitorThresholds$Builder0) {
            return monitorThresholds$Builder0.maxDurationConstantAudioOutputLevel;
        }

        public MonitorThresholds build() {
            return new MonitorThresholds(this, 0);
        }

        public static int c(Builder monitorThresholds$Builder0) {
            return monitorThresholds$Builder0.maxJitterThreshold;
        }

        public static int d(Builder monitorThresholds$Builder0) {
            return monitorThresholds$Builder0.maxPacketsLostFraction;
        }

        public static int e(Builder monitorThresholds$Builder0) {
            return monitorThresholds$Builder0.maxRttThreshold;
        }

        public static int f(Builder monitorThresholds$Builder0) {
            return monitorThresholds$Builder0.minMosScoreThreshhold;
        }

        public Builder jitterThreshold(int v) {
            this.maxJitterThreshold = v;
            return this;
        }

        public Builder mosScoreThreshhold(int v) {
            this.minMosScoreThreshhold = v;
            return this;
        }

        public Builder packetsLostFraction(int v) {
            this.maxPacketsLostFraction = v;
            return this;
        }

        public Builder rttThreshold(int v) {
            this.maxRttThreshold = v;
            return this;
        }
    }

    private int maxDurationConstantAudioInputLevel;
    private int maxDurationConstantAudioOutputLevel;
    private int maxJitterThreshold;
    private int maxPacketsLostFraction;
    private int maxRttThreshold;
    private int minMosScoreThreshhold;

    private MonitorThresholds(Builder monitorThresholds$Builder0) {
        this.minMosScoreThreshhold = Builder.f(monitorThresholds$Builder0);
        this.maxDurationConstantAudioOutputLevel = Builder.b(monitorThresholds$Builder0);
        this.maxDurationConstantAudioInputLevel = Builder.a(monitorThresholds$Builder0);
        this.maxPacketsLostFraction = Builder.d(monitorThresholds$Builder0);
        this.maxJitterThreshold = Builder.c(monitorThresholds$Builder0);
        this.maxRttThreshold = Builder.e(monitorThresholds$Builder0);
    }

    public MonitorThresholds(Builder monitorThresholds$Builder0, int v) {
        this(monitorThresholds$Builder0);
    }

    public int getMaxDurationConstantAudioInputLevel() {
        return this.maxDurationConstantAudioInputLevel;
    }

    public int getMaxDurationConstantAudioOutputLevel() {
        return this.maxDurationConstantAudioOutputLevel;
    }

    public int getMaxJitterThreshold() {
        return this.maxJitterThreshold;
    }

    public int getMaxPacketsLostFraction() {
        return this.maxPacketsLostFraction;
    }

    public int getMaxRttThreshold() {
        return this.maxRttThreshold;
    }

    public int getMinMosScoreThreshhold() {
        return this.minMosScoreThreshhold;
    }
}

