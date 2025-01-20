package tvo.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import tvo.webrtc.ThreadUtils.ThreadChecker;

public class WebRtcAudioTrack {
    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public static final class AudioTrackStartErrorCode extends Enum {
        private static final AudioTrackStartErrorCode[] $VALUES;
        public static final enum AudioTrackStartErrorCode AUDIO_TRACK_START_EXCEPTION;
        public static final enum AudioTrackStartErrorCode AUDIO_TRACK_START_STATE_MISMATCH;

        static {
        }

        private AudioTrackStartErrorCode(String s, int v) {
        }

        public static AudioTrackStartErrorCode valueOf(String s) {
        }

        public static AudioTrackStartErrorCode[] values() {
        }
    }

    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(WebRtcAudioTrack webRtcAudioTrack0, String s) {
        }

        @Override
        public void run() {
        }

        public void stopThread() {
        }

        private int writeBytes(AudioTrack audioTrack0, ByteBuffer byteBuffer0, int v) {
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String arg1);

        void onWebRtcAudioTrackInitError(String arg1);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode arg1, String arg2);
    }

    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String arg1);

        void onWebRtcAudioTrackInitError(String arg1);

        void onWebRtcAudioTrackStartError(String arg1);
    }

    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS;
    private static final int BITS_PER_SAMPLE;
    private static final int BUFFERS_PER_SECOND;
    private static final int CALLBACK_BUFFER_SIZE_MS;
    private static final boolean DEBUG;
    private static final int DEFAULT_USAGE;
    private static final String TAG;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private final long nativeAudioTrack;
    private static volatile boolean speakerMute;
    private final ThreadChecker threadChecker;
    private static int usageAttribute;

    static {
    }

    public WebRtcAudioTrack(long v) {
    }

    public static AudioTrack access$000(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static void access$100(boolean z) {
    }

    public static ByteBuffer access$200(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static long access$300(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static void access$400(WebRtcAudioTrack webRtcAudioTrack0, int v, long v1) {
    }

    public static boolean access$500() {
    }

    public static byte[] access$600(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static void access$700(WebRtcAudioTrack webRtcAudioTrack0, String s) {
    }

    private static void assertTrue(boolean z) {
    }

    private int channelCountToConfiguration(int v) {
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int v, int v1, int v2) {
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int v, int v1, int v2) {
    }

    private int getBufferSizeInFrames() {
    }

    private static int getDefaultUsageAttribute() {
    }

    private int getStreamMaxVolume() {
    }

    private int getStreamVolume() {
    }

    private int initPlayout(int v, int v1, double f) {
    }

    private boolean isVolumeFixed() {
    }

    private void logBufferCapacityInFrames() {
    }

    private void logBufferSizeInFrames() {
    }

    private void logMainParameters() {
    }

    private void logMainParametersExtended() {
    }

    private void logUnderrunCount() {
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer arg1, long arg2) {
    }

    private native void nativeGetPlayoutData(int arg1, long arg2) {
    }

    private void releaseAudioResources() {
    }

    private void reportWebRtcAudioTrackError(String s) {
    }

    private void reportWebRtcAudioTrackInitError(String s) {
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode webRtcAudioTrack$AudioTrackStartErrorCode0, String s) {
    }

    public static void setAudioTrackUsageAttribute(int v) {
    }

    public static void setErrorCallback(ErrorCallback webRtcAudioTrack$ErrorCallback0) {
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrack$WebRtcAudioTrackErrorCallback0) {
    }

    public static void setSpeakerMute(boolean z) {
    }

    private boolean setStreamVolume(int v) {
    }

    private boolean startPlayout() {
    }

    private boolean stopPlayout() {
    }
}

