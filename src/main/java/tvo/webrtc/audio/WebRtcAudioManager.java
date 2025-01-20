package tvo.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;

class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE;
    private static final int DEFAULT_FRAME_PER_BUFFER;
    private static final int DEFAULT_SAMPLE_RATE_HZ;
    private static final String TAG;

    public static AudioManager getAudioManager(Context context0) {
    }

    public static int getInputBufferSize(Context context0, AudioManager audioManager0, int v, int v1) {
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager0) {
    }

    private static int getMinInputFrameSize(int v, int v1) {
    }

    private static int getMinOutputFrameSize(int v, int v1) {
    }

    public static int getOutputBufferSize(Context context0, AudioManager audioManager0, int v, int v1) {
    }

    public static int getSampleRate(AudioManager audioManager0) {
    }

    private static int getSampleRateForApiLevel(AudioManager audioManager0) {
    }

    private static boolean isLowLatencyInputSupported(Context context0) {
    }

    private static boolean isLowLatencyOutputSupported(Context context0) {
    }
}

