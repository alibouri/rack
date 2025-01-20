package tvo.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount;
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable0) {
    }

    @Override  // tvo.webrtc.RefCounted
    public void release() {
    }

    @Override  // tvo.webrtc.RefCounted
    public void retain() {
    }

    public boolean safeRetain() {
    }
}

