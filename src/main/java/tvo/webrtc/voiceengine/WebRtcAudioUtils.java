package tvo.webrtc.voiceengine;

import android.media.AudioManager;
import java.util.List;

public final class WebRtcAudioUtils {
    private static final String[] BLACKLISTED_AEC_MODELS;
    private static final String[] BLACKLISTED_NS_MODELS;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS;
    private static final int DEFAULT_SAMPLE_RATE_HZ;
    private static final String TAG;
    private static int defaultSampleRateHz;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;

    static {
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
    }

    private static String deviceTypeToString(int v) {
    }

    public static List getBlackListedModelsForAecUsage() {
    }

    public static List getBlackListedModelsForNsUsage() {
    }

    public static int getDefaultSampleRateHz() {
    }

    public static String getThreadInfo() {
    }

    private static boolean hasMicrophone() {
    }

    public static boolean isAcousticEchoCancelerSupported() {
    }

    public static boolean isAutomaticGainControlSupported() {
    }

    public static boolean isDefaultSampleRateOverridden() {
    }

    public static boolean isNoiseSuppressorSupported() {
    }

    private static boolean isVolumeFixed(AudioManager audioManager0) {
    }

    private static void logAudioDeviceInfo(String s, AudioManager audioManager0) {
    }

    public static void logAudioState(String s) {
    }

    private static void logAudioStateBasic(String s, AudioManager audioManager0) {
    }

    private static void logAudioStateVolume(String s, AudioManager audioManager0) {
    }

    public static void logDeviceInfo(String s) {
    }

    private static void logIsStreamMute(String s, AudioManager audioManager0, int v, StringBuilder stringBuilder0) {
    }

    public static String modeToString(int v) {
    }

    public static boolean runningOnEmulator() {
    }

    public static void setDefaultSampleRateHz(int v) {
    }

    public static void setWebRtcBasedAcousticEchoCanceler(boolean z) {
    }

    public static void setWebRtcBasedAutomaticGainControl(boolean z) {
    }

    public static void setWebRtcBasedNoiseSuppressor(boolean z) {
    }

    private static String streamTypeToString(int v) {
    }

    public static boolean useWebRtcBasedAcousticEchoCanceler() {
    }

    public static boolean useWebRtcBasedAutomaticGainControl() {
    }

    public static boolean useWebRtcBasedNoiseSuppressor() {
    }
}

