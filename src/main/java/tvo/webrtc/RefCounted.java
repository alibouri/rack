package tvo.webrtc;

public interface RefCounted {
    void release();

    void retain();
}

