package r;

import android.hardware.biometrics.BiometricManager;

public abstract class o {
    public static int a(BiometricManager biometricManager0, int v) {
        return biometricManager0.canAuthenticate(v);
    }
}

