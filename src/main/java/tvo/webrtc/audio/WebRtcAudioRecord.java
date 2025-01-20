package tvo.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

class WebRtcAudioRecord {
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

    private static final int AUDIO_RECORD_START;
    private static final int AUDIO_RECORD_STOP;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS;
    private static final int BUFFERS_PER_SECOND;
    private static final int BUFFER_SIZE_FACTOR;
    private static final int CALLBACK_BUFFER_SIZE_MS;
    private static final int CHECK_REC_STATUS_DELAY_MS;
    public static final int DEFAULT_AUDIO_FORMAT;
    public static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG;
    private final int audioFormat;
    private final AudioManager audioManager;
    private AudioRecord audioRecord;
    private final SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private static final AtomicInteger nextSchedulerId;
    private AudioDeviceInfo preferredDevice;
    private final AudioRecordStateCallback stateCallback;

    static {
    }

    public WebRtcAudioRecord(Context context0, AudioManager audioManager0) {
    }

    public WebRtcAudioRecord(Context context0, ScheduledExecutorService scheduledExecutorService0, AudioManager audioManager0, int v, int v1, AudioRecordErrorCallback javaAudioDeviceModule$AudioRecordErrorCallback0, AudioRecordStateCallback javaAudioDeviceModule$AudioRecordStateCallback0, SamplesReadyCallback javaAudioDeviceModule$SamplesReadyCallback0, boolean z, boolean z1) {
    }

    public static String a(WebRtcAudioRecord webRtcAudioRecord0, AudioRecord audioRecord0) {
    }

    public static AudioRecord access$000(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static void access$100(boolean z) {
    }

    public static AtomicInteger access$1000() {
    }

    public static void access$200(WebRtcAudioRecord webRtcAudioRecord0, int v) {
    }

    public static ByteBuffer access$300(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static boolean access$400(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static byte[] access$500(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static long access$600(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static void access$700(WebRtcAudioRecord webRtcAudioRecord0, long v, int v1) {
    }

    public static SamplesReadyCallback access$800(WebRtcAudioRecord webRtcAudioRecord0) {
    }

    public static void access$900(WebRtcAudioRecord webRtcAudioRecord0, String s) {
    }

    private static void assertTrue(boolean z) {
    }

    private static String audioStateToString(int v) {
    }

    private int channelCountToConfiguration(int v) {
    }

    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo0, AudioDeviceInfo audioDeviceInfo1) {
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int v, int v1, int v2, int v3, int v4) {
    }

    private static AudioRecord createAudioRecordOnMOrHigher(int v, int v1, int v2, int v3, int v4) {
    }

    private void doAudioRecordStateCallback(int v) {
    }

    private boolean enableBuiltInAEC(boolean z) {
    }

    private boolean enableBuiltInNS(boolean z) {
    }

    private static int getBytesPerSample(int v) {
    }

    private int initRecording(int v, int v1) {
    }

    public boolean isAcousticEchoCancelerSupported() {
    }

    public boolean isAudioConfigVerified() {
    }

    public boolean isAudioSourceMatchingRecordingSession() {
    }

    public boolean isNoiseSuppressorSupported() {
    }

    private String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord0) {
    }

    private static boolean logActiveRecordingConfigs(int v, List list0) {
    }

    private void logMainParameters() {
    }

    private void logMainParametersExtended() {
    }

    private int logRecordingConfigurations(AudioRecord audioRecord0, boolean z) {
    }

    private native void nativeCacheDirectBufferAddress(long arg1, ByteBuffer arg2) {
    }

    private native void nativeDataIsRecorded(long arg1, int arg2) {
    }

    public static ScheduledExecutorService newDefaultScheduler() {

        class tvo.webrtc.audio.WebRtcAudioRecord.1 implements ThreadFactory {
            final AtomicInteger val$nextThreadId;

            public tvo.webrtc.audio.WebRtcAudioRecord.1(AtomicInteger atomicInteger0) {
            }

            @Override
            public Thread newThread(Runnable runnable0) {
            }
        }

    }

    private void releaseAudioResources() {
    }

    private void reportWebRtcAudioRecordError(String s) {
    }

    private void reportWebRtcAudioRecordInitError(String s) {
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode javaAudioDeviceModule$AudioRecordStartErrorCode0, String s) {
    }

    private void scheduleLogRecordingConfigurationsTask(AudioRecord audioRecord0) {
    }

    public void setMicrophoneMute(boolean z) {
    }

    public void setNativeAudioRecord(long v) {
    }

    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo0) {
    }

    private boolean startRecording() {
    }

    private boolean stopRecording() {
    }

    private static boolean verifyAudioConfig(int v, int v1, AudioFormat audioFormat0, AudioDeviceInfo audioDeviceInfo0, List list0) {
    }
}

