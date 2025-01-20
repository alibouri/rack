package tvo.webrtc.audio;

public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean arg1);

    void setSpeakerMute(boolean arg1);
}

