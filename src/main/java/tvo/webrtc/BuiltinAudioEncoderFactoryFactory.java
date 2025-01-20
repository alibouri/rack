package tvo.webrtc;

public class BuiltinAudioEncoderFactoryFactory implements AudioEncoderFactoryFactory {
    @Override  // tvo.webrtc.AudioEncoderFactoryFactory
    public long createNativeAudioEncoderFactory() {
    }

    private static native long nativeCreateBuiltinAudioEncoderFactory() {
    }
}

