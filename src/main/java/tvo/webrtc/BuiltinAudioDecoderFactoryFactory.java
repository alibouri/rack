package tvo.webrtc;

public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {
    @Override  // tvo.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
    }

    private static native long nativeCreateBuiltinAudioDecoderFactory() {
    }
}

