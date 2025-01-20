package q9;

import Ab.k;
import E9.a;
import Nb.j;
import V6.f;
import a8.Q;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyGenParameterSpec;
import io.sentry.android.core.internal.util.g;
import java.security.Key;
import java.security.KeyStore;
import java.security.UnrecoverableKeyException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public final class t0 {
    public final s0 a;
    public final a b;
    public final Cipher c;
    public final Q d;

    public t0(s0 s00, a a0, Context context0) {
        j.f(s00, "biometricRepo");
        j.f(a0, "analytics");
        j.f(context0, "context");
        super();
        this.a = s00;
        this.b = a0;
        Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        j.e(cipher0, "getInstance(...)");
        this.c = cipher0;
        this.d = new Q(new f(context0, 1));
    }

    public static void a() {
        KeyGenParameterSpec keyGenParameterSpec0 = g.j(new KeyGenParameterSpec.Builder("fingerprint", 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS7Padding"}).setUserAuthenticationRequired(true)).build();
        j.e(keyGenParameterSpec0, "build(...)");
        KeyGenerator keyGenerator0 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator0.init(keyGenParameterSpec0);
        keyGenerator0.generateKey();
    }

    public final SecretKey b() {
        try {
            KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
            keyStore0.load(null);
            Key key0 = keyStore0.getKey("fingerprint", null);
            return key0 instanceof SecretKey ? ((SecretKey)key0) : null;
        }
        catch(Exception exception0) {
            k[] arr_k = {new k("javaClass", exception0.getClass().getName()), new k("message", exception0.getMessage())};
            this.b.a("biometrics: exception", arr_k);
            if(!(exception0 instanceof UnrecoverableKeyException)) {
                throw exception0;
            }
            return null;
        }
    }

    public final boolean c() {
        return this.d.g(15) == 0;
    }
}

