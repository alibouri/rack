package com.twilio.voice;

import m5.b;

class AudioOptions {
    public static final class Builder {
        private boolean audioJitterBufferFastAccelerate;
        private boolean autoGainControl;
        private boolean echoCancellation;
        private boolean highpassFilter;
        private boolean noiseSuppression;
        private boolean stereoSwapping;
        private boolean typingDetection;

        public static boolean a(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.audioJitterBufferFastAccelerate;
        }

        public Builder audioJitterBufferFastAccelerate(boolean z) {
            this.audioJitterBufferFastAccelerate = z;
            return this;
        }

        public Builder autoGainControl(boolean z) {
            this.autoGainControl = z;
            return this;
        }

        public static boolean b(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.autoGainControl;
        }

        public AudioOptions build() {
            return new AudioOptions(this, 0);
        }

        public static boolean c(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.echoCancellation;
        }

        public static boolean d(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.highpassFilter;
        }

        public static boolean e(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.noiseSuppression;
        }

        public Builder echoCancellation(boolean z) {
            this.echoCancellation = z;
            return this;
        }

        public static boolean f(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.stereoSwapping;
        }

        public static boolean g(Builder audioOptions$Builder0) {
            return audioOptions$Builder0.typingDetection;
        }

        public Builder highpassFilter(boolean z) {
            this.highpassFilter = z;
            return this;
        }

        public Builder noiseSuppression(boolean z) {
            this.noiseSuppression = z;
            return this;
        }

        public Builder stereoSwapping(boolean z) {
            this.stereoSwapping = z;
            return this;
        }

        public Builder typingDetection(boolean z) {
            this.typingDetection = z;
            return this;
        }
    }

    public final boolean audioJitterBufferFastAccelerate;
    public final boolean autoGainControl;
    public final boolean echoCancellation;
    public final boolean highpassFilter;
    public final boolean noiseSuppression;
    public final boolean stereoSwapping;
    public final boolean typingDetection;

    private AudioOptions(Builder audioOptions$Builder0) {
        this.echoCancellation = Builder.c(audioOptions$Builder0);
        this.autoGainControl = Builder.b(audioOptions$Builder0);
        this.noiseSuppression = Builder.e(audioOptions$Builder0);
        this.highpassFilter = Builder.d(audioOptions$Builder0);
        this.stereoSwapping = Builder.f(audioOptions$Builder0);
        this.audioJitterBufferFastAccelerate = Builder.a(audioOptions$Builder0);
        this.typingDetection = Builder.g(audioOptions$Builder0);
    }

    public AudioOptions(Builder audioOptions$Builder0, int v) {
        this(audioOptions$Builder0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AudioOptions{echoCancellation=");
        stringBuilder0.append(this.echoCancellation);
        stringBuilder0.append(", autoGainControl=");
        stringBuilder0.append(this.autoGainControl);
        stringBuilder0.append(", noiseSuppression=");
        stringBuilder0.append(this.noiseSuppression);
        stringBuilder0.append(", highpassFilter=");
        stringBuilder0.append(this.highpassFilter);
        stringBuilder0.append(", stereoSwapping=");
        stringBuilder0.append(this.stereoSwapping);
        stringBuilder0.append(", audioJitterBufferFastAccelerate=");
        stringBuilder0.append(this.audioJitterBufferFastAccelerate);
        stringBuilder0.append(", typingDetection=");
        return b.z(stringBuilder0, this.typingDetection, '}');
    }
}

