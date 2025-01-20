package tvo.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import tvo.webrtc.ThreadUtils.ThreadChecker;

class WebRtcAudioTrack {
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

    private static final int AUDIO_TRACK_START;
    private static final int AUDIO_TRACK_STOP;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS;
    private static final int BITS_PER_SAMPLE;
    private static final int BUFFERS_PER_SECOND;
    private static final int CALLBACK_BUFFER_SIZE_MS;
    private static final int DEFAULT_USAGE;
    private static final String TAG;
    private final AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;
    private final AudioTrackErrorCallback errorCallback;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final AudioTrackStateCallback stateCallback;
    private final ThreadChecker threadChecker;
    private final VolumeLogger volumeLogger;

    static {
    }

    public WebRtcAudioTrack(Context context0, AudioManager audioManager0) {
    }

    public WebRtcAudioTrack(Context context0, AudioManager audioManager0, AudioAttributes audioAttributes0, AudioTrackErrorCallback javaAudioDeviceModule$AudioTrackErrorCallback0, AudioTrackStateCallback javaAudioDeviceModule$AudioTrackStateCallback0) {
    }

    private int GetPlayoutUnderrunCount() {
    }

    public static AudioTrack access$000(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static void access$100(boolean z) {
    }

    public static void access$200(WebRtcAudioTrack webRtcAudioTrack0, int v) {
    }

    public static ByteBuffer access$300(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static long access$400(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static void access$500(long v, int v1) {
    }

    public static boolean access$600(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static byte[] access$700(WebRtcAudioTrack webRtcAudioTrack0) {
    }

    public static void access$800(WebRtcAudioTrack webRtcAudioTrack0, String s) {
    }

    private static void assertTrue(boolean z) {
    }

    private int channelCountToConfiguration(int v) {
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int v, int v1, int v2, AudioAttributes audioAttributes0) {
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int v, int v1, int v2) {
    }

    private void doAudioTrackStateCallback(int v) {
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

    private static native void nativeCacheDirectBufferAddress(long arg0, ByteBuffer arg1) {
    }

    private static native void nativeGetPlayoutData(long arg0, int arg1) {
    }

    private void releaseAudioResources() {
    }

    private void reportWebRtcAudioTrackError(String s) {
    }

    private void reportWebRtcAudioTrackInitError(String s) {
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode javaAudioDeviceModule$AudioTrackStartErrorCode0, String s) {
    }

    public void setNativeAudioTrack(long v) {
    }

    public void setSpeakerMute(boolean z) {
    }

    private boolean setStreamVolume(int v) {
    }

    private boolean startPlayout() {
    }

    private boolean stopPlayout() {
    }
}

