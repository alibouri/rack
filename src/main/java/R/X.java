package r;

import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.security.identity.IdentityCredential;

public abstract class x {
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential0) {
        return new BiometricPrompt.CryptoObject(identityCredential0);
    }

    public static IdentityCredential b(BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0) {
        return biometricPrompt$CryptoObject0.getIdentityCredential();
    }
}

