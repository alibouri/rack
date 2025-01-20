package tvo.webrtc;

class Histogram {
    private final long handle;

    private Histogram(long v) {
    }

    public void addSample(int v) {
    }

    public static Histogram createCounts(String s, int v, int v1, int v2) {
    }

    public static Histogram createEnumeration(String s, int v) {
    }

    private static native void nativeAddSample(long arg0, int arg1) {
    }

    private static native long nativeCreateCounts(String arg0, int arg1, int arg2, int arg3) {
    }

    private static native long nativeCreateEnumeration(String arg0, int arg1) {
    }
}

