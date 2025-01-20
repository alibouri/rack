package com.twilio.voice;

import android.content.Context;
import java.nio.ByteBuffer;

class AudioDeviceProxy extends AudioDeviceContext implements AudioDevice {
    private AudioDevice audioDevice;
    private boolean capturingStopped;
    private static final Logger logger;
    private static long nativeAudioDeviceProxyHandle;
    private boolean released;
    private boolean renderingStopped;
    ThreadChecker threadChecker;

    static {
        AudioDeviceProxy.logger = Logger.getLogger(AudioDeviceProxy.class);
    }

    private AudioDeviceProxy(Context context0, long v, AudioDevice audioDevice0) {
        this.released = false;
        this.capturingStopped = false;
        this.renderingStopped = false;
        AudioDeviceProxy.nativeAudioDeviceProxyHandle = v;
        this.audioDevice = audioDevice0;
    }

    private void checkIsOnValidThread() {
        if(this.threadChecker == null) {
            this.threadChecker = new ThreadChecker(Thread.currentThread());
        }
    }

    public void executeWorkerBlock(Runnable runnable0) {
        if(this.isValid()) {
            AudioDeviceProxy.nativeExecuteWorkerBlock(AudioDeviceProxy.nativeAudioDeviceProxyHandle, runnable0);
            return;
        }
        AudioDeviceProxy.logger.w("Calling executeWorkerBlock not a valid operation");
    }

    public void formatChanged() {
        Logger logger0 = AudioDeviceProxy.logger;
        logger0.d("formatChanged");
        if(this.isValid()) {
            AudioDeviceProxy.nativeFormatChanged(AudioDeviceProxy.nativeAudioDeviceProxyHandle, this.audioDevice.getCapturerFormat(), this.audioDevice.getRendererFormat());
            return;
        }
        logger0.w("Calling formatChanged not a valid operation");
    }

    @Override  // com.twilio.voice.AudioDeviceCapturer
    public AudioFormat getCapturerFormat() {
        return null;
    }

    @Override  // com.twilio.voice.AudioDeviceRenderer
    public AudioFormat getRendererFormat() {
        return null;
    }

    // Deobfuscation rating: LOW(40)
    private boolean isValid() {
        return !this.renderingStopped && !this.released || !this.capturingStopped && !this.released;
    }

    private static native void nativeExecuteWorkerBlock(long arg0, Runnable arg1) {
    }

    private static native void nativeFormatChanged(long arg0, AudioFormat arg1, AudioFormat arg2) {
    }

    private static native void nativeReadData(long arg0, ByteBuffer arg1, int arg2) {
    }

    private static native void nativeRelease(long arg0) {
    }

    private static native void nativeWriteData(long arg0, ByteBuffer arg1, int arg2) {
    }

    @Override  // com.twilio.voice.AudioDeviceCapturer
    public boolean onInitCapturer() {
        AudioDeviceProxy.logger.d("onInitCapturer");
        this.checkIsOnValidThread();
        this.capturingStopped = false;
        if(!this.released) {
            this.audioDevice.onInitCapturer();
        }
        return true;
    }

    @Override  // com.twilio.voice.AudioDeviceRenderer
    public boolean onInitRenderer() {
        AudioDeviceProxy.logger.d("onInitRenderer");
        this.checkIsOnValidThread();
        this.renderingStopped = false;
        if(!this.released) {
            this.audioDevice.onInitRenderer();
        }
        return true;
    }

    @Override  // com.twilio.voice.AudioDeviceCapturer
    public boolean onStartCapturing(AudioDeviceContext audioDeviceContext0) {
        AudioDeviceProxy.logger.d("onStartCapturing");
        this.checkIsOnValidThread();
        if(!this.released) {
            this.audioDevice.onStartCapturing(this);
        }
        return true;
    }

    @Override  // com.twilio.voice.AudioDeviceRenderer
    public boolean onStartRendering(AudioDeviceContext audioDeviceContext0) {
        AudioDeviceProxy.logger.d("onStartRendering");
        this.checkIsOnValidThread();
        if(!this.released) {
            this.audioDevice.onStartRendering(this);
        }
        return true;
    }

    @Override  // com.twilio.voice.AudioDeviceCapturer
    public boolean onStopCapturing() {
        AudioDeviceProxy.logger.d("onStopCapturing");
        this.checkIsOnValidThread();
        this.capturingStopped = true;
        if(!this.released) {
            this.audioDevice.onStopCapturing();
        }
        return true;
    }

    @Override  // com.twilio.voice.AudioDeviceRenderer
    public boolean onStopRendering() {
        AudioDeviceProxy.logger.d("onStopRendering");
        this.checkIsOnValidThread();
        this.renderingStopped = true;
        if(!this.released) {
            this.audioDevice.onStopRendering();
        }
        return true;
    }

    public void readRenderData(ByteBuffer byteBuffer0) {
        if(!this.renderingStopped && !this.released) {
            AudioDeviceProxy.nativeReadData(AudioDeviceProxy.nativeAudioDeviceProxyHandle, byteBuffer0, byteBuffer0.capacity());
            return;
        }
        AudioDeviceProxy.logger.d("Ignoring readRenderData because either AudioDeviceProxy is released or rendering stopped");
    }

    public void release() {
        AudioDeviceProxy.logger.d("release");
        if(!this.released) {
            long v = AudioDeviceProxy.nativeAudioDeviceProxyHandle;
            if(v != 0L) {
                AudioDeviceProxy.nativeRelease(v);
                AudioDeviceProxy.nativeAudioDeviceProxyHandle = 0L;
            }
            this.released = true;
        }
    }

    public void writeCaptureData(ByteBuffer byteBuffer0) {
        if(!this.capturingStopped && !this.released) {
            AudioDeviceProxy.nativeWriteData(AudioDeviceProxy.nativeAudioDeviceProxyHandle, byteBuffer0, byteBuffer0.capacity());
            return;
        }
        AudioDeviceProxy.logger.d("Ignoring writeCaptureData because either AudioDeviceProxy is released or capturing stopped");
    }
}

