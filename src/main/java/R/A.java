package r;

import E7.C;
import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.os.Build.VERSION;
import android.security.identity.IdentityCredential;
import androidx.lifecycle.MutableLiveData;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class a extends BiometricPrompt.AuthenticationCallback {
    public final d a;

    public a(d d0) {
        this.a = d0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public void onAuthenticationError(int v, CharSequence charSequence0) {
        this.a.a(v, charSequence0);
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference0 = ((r)this.a).a;
        if(weakReference0.get() != null && ((s)weakReference0.get()).j0) {
            s s0 = (s)weakReference0.get();
            if(s0.q0 == null) {
                s0.q0 = new MutableLiveData();
            }
            s.u(s0.q0, Boolean.TRUE);
        }
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public void onAuthenticationHelp(int v, CharSequence charSequence0) {
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        C c0 = null;
        if(biometricPrompt$AuthenticationResult0 != null) {
            BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0 = biometricPrompt$AuthenticationResult0.getCryptoObject();
            if(biometricPrompt$CryptoObject0 != null) {
                Cipher cipher0 = w.d(biometricPrompt$CryptoObject0);
                if(cipher0 == null) {
                    Signature signature0 = w.f(biometricPrompt$CryptoObject0);
                    if(signature0 == null) {
                        Mac mac0 = w.e(biometricPrompt$CryptoObject0);
                        if(mac0 != null) {
                            c0 = new C(mac0);
                        }
                        else if(Build.VERSION.SDK_INT >= 30) {
                            IdentityCredential identityCredential0 = x.b(biometricPrompt$CryptoObject0);
                            if(identityCredential0 != null) {
                                c0 = new C();  // initializer: Ljava/lang/Object;-><init>()V
                                c0.X = null;
                                c0.Y = null;
                                c0.Z = null;
                                c0.b0 = identityCredential0;
                            }
                        }
                    }
                    else {
                        c0 = new C(signature0);
                    }
                }
                else {
                    c0 = new C(cipher0);
                }
            }
        }
        int v = Build.VERSION.SDK_INT;
        int v1 = -1;
        if(v < 30) {
            if(v != 29) {
                v1 = 2;
            }
        }
        else if(biometricPrompt$AuthenticationResult0 != null) {
            v1 = c.a(biometricPrompt$AuthenticationResult0);
        }
        p p0 = new p(c0, v1);
        this.a.b(p0);
    }
}

