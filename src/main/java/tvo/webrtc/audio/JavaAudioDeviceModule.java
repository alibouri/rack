package tvo.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.concurrent.ScheduledExecutorService;

public class JavaAudioDeviceModule implements AudioDeviceModule {
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String arg1);

        void onWebRtcAudioRecordInitError(String arg1);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode arg1, String arg2);
    }

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

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int v, int v1, int v2, byte[] arr_b) {
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

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String arg1);

        void onWebRtcAudioTrackInitError(String arg1);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode arg1, String arg2);
    }

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

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private int inputSampleRate;
        private int outputSampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        private Builder(Context context0) {
        }

        public Builder(Context context0, tvo.webrtc.audio.JavaAudioDeviceModule.1 javaAudioDeviceModule$10) {
        }

        public JavaAudioDeviceModule createAudioDeviceModule() {
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes0) {
        }

        public Builder setAudioFormat(int v) {
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback javaAudioDeviceModule$AudioRecordErrorCallback0) {
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback javaAudioDeviceModule$AudioRecordStateCallback0) {
        }

        public Builder setAudioSource(int v) {
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback javaAudioDeviceModule$AudioTrackErrorCallback0) {
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback javaAudioDeviceModule$AudioTrackStateCallback0) {
        }

        public Builder setInputSampleRate(int v) {
        }

        public Builder setOutputSampleRate(int v) {
        }

        public Builder setSampleRate(int v) {
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback javaAudioDeviceModule$SamplesReadyCallback0) {
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService0) {
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
        }

        public Builder setUseStereoInput(boolean z) {
        }

        public Builder setUseStereoOutput(boolean z) {
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples arg1);
    }

    private static final String TAG;
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    private JavaAudioDeviceModule(Context context0, AudioManager audioManager0, WebRtcAudioRecord webRtcAudioRecord0, WebRtcAudioTrack webRtcAudioTrack0, int v, int v1, boolean z, boolean z1) {
    }

    public JavaAudioDeviceModule(Context context0, AudioManager audioManager0, WebRtcAudioRecord webRtcAudioRecord0, WebRtcAudioTrack webRtcAudioTrack0, int v, int v1, boolean z, boolean z1, tvo.webrtc.audio.JavaAudioDeviceModule.1 javaAudioDeviceModule$10) {
    }

    public static Builder builder(Context context0) {
    }

    @Override  // tvo.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
    }

    private static native long nativeCreateAudioDeviceModule(Context arg0, AudioManager arg1, WebRtcAudioRecord arg2, WebRtcAudioTrack arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
    }

    @Override  // tvo.webrtc.audio.AudioDeviceModule
    public void release() {
    }

    @Override  // tvo.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
    }

    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo0) {
    }

    @Override  // tvo.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
    }

    class tvo.webrtc.audio.JavaAudioDeviceModule.1 {
    }

}

