package com.twilio.voice;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import tvo.webrtc.audio.AudioDeviceModule;
import tvo.webrtc.audio.JavaAudioDeviceModule;

class MediaFactory {
    private static final String RELEASE_MESSAGE_TEMPLATE = "MediaFactory released %s unavailable";
    private AudioDeviceModule audioDeviceModule;
    private AudioDeviceProxy audioDeviceProxy;
    private static volatile MediaFactory instance;
    private static final Logger logger;
    private static volatile Set mediaFactoryOwners;
    private long nativeMediaFactoryHandle;

    static {
        MediaFactory.logger = Logger.getLogger(MediaFactory.class);
        MediaFactory.mediaFactoryOwners = new HashSet();
    }

    public MediaFactory() {
    }

    private MediaFactory(AudioDeviceModule audioDeviceModule0, long v) {
        this.nativeMediaFactoryHandle = v;
        this.audioDeviceModule = audioDeviceModule0;
    }

    public LocalAudioTrack createAudioTrack(Context context0, boolean z, AudioOptions audioOptions0, String s) {
        synchronized(this) {
            Preconditions.checkNotNull(context0, "context must not be null");
            Preconditions.checkState(this.nativeMediaFactoryHandle != 0L, "MediaFactory released %s unavailable", "createAudioTrack");
            return this.nativeCreateAudioTrack(this.nativeMediaFactoryHandle, context0, z, audioOptions0, s);
        }
    }

    public long getNativeMediaFactoryHandle() {
        return this.nativeMediaFactoryHandle;
    }

    public static MediaFactory instance(Object object0, Context context0) {
        Preconditions.checkNotNull(object0, "owner must not be null");
        Preconditions.checkNotNull(context0, "context must not be null");
        synchronized(MediaFactory.class) {
            if(MediaFactory.instance == null) {
                Voice.loadLibrary(context0);
                AudioDevice audioDevice0 = Voice.getAudioDevice();
                if(audioDevice0 instanceof DefaultAudioDevice) {
                    JavaAudioDeviceModule javaAudioDeviceModule0 = JavaAudioDeviceModule.builder(context0).setUseHardwareNoiseSuppressor(((DefaultAudioDevice)audioDevice0).useHardwareNoiseSuppressor()).setUseHardwareAcousticEchoCanceler(((DefaultAudioDevice)audioDevice0).useHardwareAcousticEchoCanceler()).createAudioDeviceModule();
                    long v1 = MediaFactory.nativeCreate(context0, javaAudioDeviceModule0.getNativeAudioDeviceModulePointer());
                    if(v1 == 0L) {
                        MediaFactory.logger.e("Failed to instance MediaFactory");
                    }
                    else {
                        MediaFactory.instance = new MediaFactory(javaAudioDeviceModule0, v1);
                    }
                }
                else {
                    AudioFormat audioFormat0 = audioDevice0.getCapturerFormat();
                    AudioFormat audioFormat1 = audioDevice0.getRendererFormat();
                    MediaFactory.instance = new MediaFactory();
                    MediaFactory.instance.nativeMediaFactoryHandle = MediaFactory.nativeCreateWithCustomDevice(MediaFactory.instance, context0, audioDevice0, audioFormat0, audioFormat1);
                }
            }
            MediaFactory.mediaFactoryOwners.add(object0);
            return MediaFactory.instance;
        }
    }

    public static boolean isReleased() {
        synchronized(MediaFactory.class) {
        }
        return MediaFactory.instance == null;
    }

    public static void manualRelease() {
        synchronized(MediaFactory.class) {
            if(MediaFactory.instance != null) {
                MediaFactory.mediaFactoryOwners.clear();
                Object object0 = new Object();
                MediaFactory.instance.release(object0);
            }
        }
    }

    private static native long nativeCreate(Context arg0, long arg1) {
    }

    private native LocalAudioTrack nativeCreateAudioTrack(long arg1, Context arg2, boolean arg3, AudioOptions arg4, String arg5) {
    }

    private static native long nativeCreateWithCustomDevice(MediaFactory arg0, Context arg1, AudioDevice arg2, AudioFormat arg3, AudioFormat arg4) {
    }

    private native void nativeRelease(long arg1) {
    }

    public void release(Object object0) {
        if(MediaFactory.instance != null) {
            Class class0 = MediaFactory.class;
            synchronized(class0) {
                MediaFactory.mediaFactoryOwners.remove(object0);
                if(MediaFactory.instance != null && MediaFactory.mediaFactoryOwners.isEmpty()) {
                    AudioDeviceModule audioDeviceModule0 = this.audioDeviceModule;
                    if(audioDeviceModule0 != null) {
                        audioDeviceModule0.release();
                    }
                    AudioDeviceProxy audioDeviceProxy0 = this.audioDeviceProxy;
                    if(audioDeviceProxy0 != null) {
                        audioDeviceProxy0.release();
                    }
                    this.audioDeviceProxy = null;
                    this.nativeRelease(this.nativeMediaFactoryHandle);
                    this.nativeMediaFactoryHandle = 0L;
                    MediaFactory.instance = null;
                }
            }
        }
    }

    public void setAudioDeviceProxy(AudioDeviceProxy audioDeviceProxy0) {
        this.audioDeviceProxy = audioDeviceProxy0;
    }
}

