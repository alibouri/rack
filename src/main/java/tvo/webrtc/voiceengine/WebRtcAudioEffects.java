package tvo.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect.Descriptor;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER;
    private static final UUID AOSP_NOISE_SUPPRESSOR;
    private static final boolean DEBUG;
    private static final String TAG;
    private AcousticEchoCanceler aec;
    private static AudioEffect.Descriptor[] cachedEffects;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    static {
    }

    private static void assertTrue(boolean z) {
    }

    public static boolean canUseAcousticEchoCanceler() {
    }

    public static boolean canUseNoiseSuppressor() {
    }

    public static WebRtcAudioEffects create() {
    }

    private boolean effectTypeIsVoIP(UUID uUID0) {
    }

    public void enable(int v) {
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
    }

    public static boolean isAcousticEchoCancelerSupported() {
    }

    private static boolean isEffectTypeAvailable(UUID uUID0) {
    }

    public static boolean isNoiseSuppressorBlacklisted() {
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
    }

    public static boolean isNoiseSuppressorSupported() {
    }

    public void release() {
    }

    public boolean setAEC(boolean z) {
    }

    public boolean setNS(boolean z) {
    }
}

