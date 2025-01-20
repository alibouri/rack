package com.twilio.voice;

public interface AudioDeviceRenderer {
    AudioFormat getRendererFormat();

    boolean onInitRenderer();

    boolean onStartRendering(AudioDeviceContext arg1);

    boolean onStopRendering();
}

