package com.twilio.voice;

import java.util.Arrays;

public class AudioFormat {
    public static int AUDIO_SAMPLE_MONO = 1;
    public static final int AUDIO_SAMPLE_RATE_16000 = 16000;
    public static final int AUDIO_SAMPLE_RATE_24000 = 24000;
    public static final int AUDIO_SAMPLE_RATE_32000 = 32000;
    public static final int AUDIO_SAMPLE_RATE_44100 = 44100;
    public static final int AUDIO_SAMPLE_RATE_48000 = 48000;
    public static final int AUDIO_SAMPLE_RATE_8000 = 8000;
    public static final int AUDIO_SAMPLE_STEREO = 2;
    private int channelCount;
    private int sampleRate;
    static final Integer[] validChannelCounts;
    static final Integer[] validSampleRates;

    static {
        AudioFormat.validSampleRates = new Integer[]{8000, 16000, 24000, 32000, 44100, 48000};
        AudioFormat.validChannelCounts = new Integer[]{((int)AudioFormat.AUDIO_SAMPLE_MONO), 2};
    }

    public AudioFormat(int v, int v1) {
        this.sampleRate = -1;
        this.channelCount = -1;
        Preconditions.checkArgument(Arrays.asList(AudioFormat.validSampleRates).contains(v), "Unsupported sample rate " + v);
        Preconditions.checkArgument(Arrays.asList(AudioFormat.validChannelCounts).contains(v1), "Unsupported channel count " + v1);
        this.sampleRate = v;
        this.channelCount = v1;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }
}

