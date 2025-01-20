package r;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public abstract class j {
    public static void a(BiometricPrompt biometricPrompt0, BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0, CancellationSignal cancellationSignal0, Executor executor0, BiometricPrompt.AuthenticationCallback biometricPrompt$AuthenticationCallback0) {
        biometricPrompt0.authenticate(biometricPrompt$CryptoObject0, cancellationSignal0, executor0, biometricPrompt$AuthenticationCallback0);
    }

    public static void b(BiometricPrompt biometricPrompt0, CancellationSignal cancellationSignal0, Executor executor0, BiometricPrompt.AuthenticationCallback biometricPrompt$AuthenticationCallback0) {
        biometricPrompt0.authenticate(cancellationSignal0, executor0, biometricPrompt$AuthenticationCallback0);
    }

    public static BiometricPrompt c(BiometricPrompt.Builder biometricPrompt$Builder0) {
        return biometricPrompt$Builder0.build();
    }

    public static BiometricPrompt.Builder d(Context context0) {
        return new BiometricPrompt.Builder(context0);
    }

    public static void e(BiometricPrompt.Builder biometricPrompt$Builder0, CharSequence charSequence0, Executor executor0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        biometricPrompt$Builder0.setNegativeButton(charSequence0, executor0, dialogInterface$OnClickListener0);
    }

    public static void f(BiometricPrompt.Builder biometricPrompt$Builder0, CharSequence charSequence0) {
        biometricPrompt$Builder0.setTitle(charSequence0);
    }
}

