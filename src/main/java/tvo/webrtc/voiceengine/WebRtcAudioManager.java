package tvo.webrtc.voiceengine;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;

public class WebRtcAudioManager {
    static class VolumeLogger {
        class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(VolumeLogger webRtcAudioManager$VolumeLogger0, int v, int v1) {
            }

            @Override
            public void run() {
            }
        }

        private static final String THREAD_NAME;
        private static final int TIMER_PERIOD_IN_SECONDS;
        private final AudioManager audioManager;
        private Timer timer;

        public VolumeLogger(AudioManager audioManager0) {
        }

        public static AudioManager access$000(VolumeLogger webRtcAudioManager$VolumeLogger0) {
        }

        public static void access$100(VolumeLogger webRtcAudioManager$VolumeLogger0) {
        }

        public void start() {
        }

        private void stop() {
        }
    }

    private static final int BITS_PER_SAMPLE;
    private static final boolean DEBUG;
    private static final int DEFAULT_FRAME_PER_BUFFER;
    private static final String TAG;
    private boolean aAudio;
    private final AudioManager audioManager;
    private static final boolean blacklistDeviceForAAudioUsage;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private final VolumeLogger volumeLogger;

    public WebRtcAudioManager(long v) {
    }

    private static void assertTrue(boolean z) {
    }

    private void dispose() {
    }

    private int getLowLatencyInputFramesPerBuffer() {
    }

    private int getLowLatencyOutputFramesPerBuffer() {
    }

    private static int getMinInputFrameSize(int v, int v1) {
    }

    private static int getMinOutputFrameSize(int v, int v1) {
    }

    private int getNativeOutputSampleRate() {
    }

    private int getSampleRateForApiLevel() {
    }

    public static boolean getStereoInput() {
    }

    public static boolean getStereoOutput() {
    }

    private boolean hasEarpiece() {
    }

    private boolean init() {
    }

    private boolean isAAudioSupported() {
    }

    private static boolean isAcousticEchoCancelerSupported() {
    }

    private boolean isCommunicationModeEnabled() {
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
    }

    public boolean isLowLatencyInputSupported() {
    }

    private boolean isLowLatencyOutputSupported() {
    }

    private static boolean isNoiseSuppressorSupported() {
    }

    private boolean isProAudioSupported() {
    }

    private native void nativeCacheAudioParameters(int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10, int arg11, int arg12, long arg13) {
    }

    public static void setBlacklistDeviceForOpenSLESUsage(boolean z) {
    }

    public static void setStereoInput(boolean z) {
    }

    public static void setStereoOutput(boolean z) {
    }

    private void storeAudioParameters() {
    }
}

