package com.twilio.voice;

public interface AudioDeviceCapturer {
    AudioFormat getCapturerFormat();

    boolean onInitCapturer();

    boolean onStartCapturing(AudioDeviceContext arg1);

    boolean onStopCapturing();
}

