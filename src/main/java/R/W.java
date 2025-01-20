package r;

import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public abstract class w {
    public static BiometricPrompt.CryptoObject a(Signature signature0) {
        return new BiometricPrompt.CryptoObject(signature0);
    }

    public static BiometricPrompt.CryptoObject b(Cipher cipher0) {
        return new BiometricPrompt.CryptoObject(cipher0);
    }

    public static BiometricPrompt.CryptoObject c(Mac mac0) {
        return new BiometricPrompt.CryptoObject(mac0);
    }

    public static Cipher d(BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0) {
        return biometricPrompt$CryptoObject0.getCipher();
    }

    public static Mac e(BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0) {
        return biometricPrompt$CryptoObject0.getMac();
    }

    public static Signature f(BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0) {
        return biometricPrompt$CryptoObject0.getSignature();
    }
}

