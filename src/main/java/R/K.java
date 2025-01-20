package r;

import android.hardware.biometrics.BiometricPrompt.Builder;

public abstract class k {
    public static void a(BiometricPrompt.Builder biometricPrompt$Builder0, boolean z) {
        biometricPrompt$Builder0.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder biometricPrompt$Builder0, boolean z) {
        biometricPrompt$Builder0.setDeviceCredentialAllowed(z);
    }
}

