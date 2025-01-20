package tvo.webrtc;

import java.nio.ByteBuffer;

public class JniCommon {
    public static native void nativeAddRef(long arg0) {
    }

    public static native ByteBuffer nativeAllocateByteBuffer(int arg0) {
    }

    public static native void nativeFreeByteBuffer(ByteBuffer arg0) {
    }

    public static native void nativeReleaseRef(long arg0) {
    }
}

