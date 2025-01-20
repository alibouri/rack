package r;

import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyGenParameterSpec;
import javax.crypto.KeyGenerator;

public abstract class v {
    public static KeyGenParameterSpec a(KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0) {
        return keyGenParameterSpec$Builder0.build();
    }

    public static KeyGenParameterSpec.Builder b(String s, int v) {
        return new KeyGenParameterSpec.Builder(s, v);
    }

    public static void c(KeyGenerator keyGenerator0, KeyGenParameterSpec keyGenParameterSpec0) {
        keyGenerator0.init(keyGenParameterSpec0);
    }

    public static void d(KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0) {
        keyGenParameterSpec$Builder0.setBlockModes(new String[]{"CBC"});
    }

    public static void e(KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0) {
        keyGenParameterSpec$Builder0.setEncryptionPaddings(new String[]{"PKCS7Padding"});
    }
}

