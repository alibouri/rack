package tvo.webrtc.voiceengine;

import android.media.AudioRecord;
import java.nio.ByteBuffer;

public class WebRtcAudioRecord {
    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public static final class AudioRecordStartErrorCode extends Enum {
        private static final AudioRecordStartErrorCode[] $VALUES;
        public static final enum AudioRecordStartErrorCode AUDIO_RECORD_START_EXCEPTION;
        public static final enum AudioRecordStartErrorCode AUDIO_RECORD_START_STATE_MISMATCH;

        static {
        }

        private AudioRecordStartErrorCode(String s, int v) {
        }

        public static AudioRecordStartErrorCode valueOf(String s) {
        }

        public static AudioRecordStartErrorCode[] values() {
        }
    }

    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(WebRtcAudioRecord webRtcAudioRecord0, String s) {
        }

        @Override
        public void run() {
        }

        public void stopThread() {
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord0, byte[] arr_b) {
        }

        public AudioSamples(AudioRecord audioRecord0, byte[] arr_b, tvo.webrtc.voiceengine.WebRtcAudioRecord.1 webRtcAudioRecord$10) {
        }

        public int getAudioFormat() {
        }

        public int getChannelCount() {
        }

        public byte[] getData() {
        }

        public int getSampleRate() {
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String arg1);

        void onWebRtcAudioRecordInitError(String arg1);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode arg1, String arg2);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples arg1);
    }

    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS;
    private static final int BITS_PER_SAMPLE;
    private static final int BUFFERS_PER_SECOND;
    private static final int BUFFER_SIZE_FACTOR;
    private static final int CALLBACK_BUFFER_SIZE_MS;
    private static final boolean DEBUG;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG;
    private AudioRecord audioRecord;
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private final long nativeAudioRecord;

    static {
    }

    public WebRtcAudioRecord(long v) {
    }

    public static AudioRecord access$000(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static void access$100(boolean z) {
    }

    public static ByteBuffer access$200(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static boolean access$300() {
    }

    public static byte[] access$400(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static long access$500(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static void access$600(WebRtcAudioRecord webRtcAudioRecord0, int v, long v1) {
    }

    public static WebRtcAudioRecordSamplesReadyCallback access$700() {
    }

    public static void access$900(WebRtcAudioRecord webRtcAudioRecord0, String s) {
    }

    private static void assertTrue(boolean z) {
    }

    private int channelCountToConfiguration(int v) {
    }

    private boolean enableBuiltInAEC(boolean z) {
    }

    private boolean enableBuiltInNS(boolean z) {
    }

    private static int getDefaultAudioSource() {
    }

    private int initRecording(int v, int v1) {
    }

    private void logMainParameters() {
    }

    private void logMainParametersExtended() {
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer arg1, long arg2) {
    }

    private native void nativeDataIsRecorded(int arg1, long arg2) {
    }

    private void releaseAudioResources() {
    }

    private void reportWebRtcAudioRecordError(String s) {
    }

    private void reportWebRtcAudioRecordInitError(String s) {
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode webRtcAudioRecord$AudioRecordStartErrorCode0, String s) {
    }

    public static void setAudioSource(int v) {
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecord$WebRtcAudioRecordErrorCallback0) {
    }

    public static void setMicrophoneMute(boolean z) {
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback0) {
    }

    private boolean startRecording() {
    }

    private boolean stopRecording() {
    }

    class tvo.webrtc.voiceengine.WebRtcAudioRecord.1 {
    }

}

