package com.twilio.voice;

import java.nio.ByteBuffer;

public abstract class a {
    public static void a(AudioDeviceContext audioDeviceContext0, Runnable runnable0) {
        Preconditions.checkNotNull(audioDeviceContext0, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(runnable0, "runnable must not be null");
        ((AudioDeviceProxy)audioDeviceContext0).executeWorkerBlock(runnable0);
    }

    public static void b(AudioDeviceContext audioDeviceContext0) {
        Preconditions.checkNotNull(audioDeviceContext0, "audioDeviceContext must not be null");
        ((AudioDeviceProxy)audioDeviceContext0).formatChanged();
    }

    public static void c(AudioDeviceContext audioDeviceContext0, ByteBuffer byteBuffer0) {
        Preconditions.checkNotNull(audioDeviceContext0, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(byteBuffer0, "runnable must not be null");
        ((AudioDeviceProxy)audioDeviceContext0).readRenderData(byteBuffer0);
    }

    public static void d(AudioDeviceContext audioDeviceContext0, ByteBuffer byteBuffer0) {
        Preconditions.checkNotNull(audioDeviceContext0, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(byteBuffer0, "audioSample must not be null");
        ((AudioDeviceProxy)audioDeviceContext0).writeCaptureData(byteBuffer0);
    }
}

