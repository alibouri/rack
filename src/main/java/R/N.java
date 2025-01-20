package r;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import java.lang.reflect.Method;

public abstract class n {
    public static int a(BiometricManager biometricManager0) {
        return biometricManager0.canAuthenticate();
    }

    public static BiometricManager b(Context context0) {
        return (BiometricManager)context0.getSystemService(BiometricManager.class);
    }

    public static Method c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
    }
}

