package z7;

import Z6.g;
import Z6.i;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public final class b {
    public final SharedPreferences a;
    public final String b;
    public static final String[] c;

    static {
        b.c = new String[]{"*", "FCM", "GCM", ""};
    }

    public b(g g0) {
        g0.a();
        this.a = g0.a.getSharedPreferences("com.google.android.gms.appid", 0);
        g0.a();
        i i0 = g0.c;
        String s = i0.e;
        if(s == null) {
            g0.a();
            s = i0.b;
            if(s.startsWith("1:") || s.startsWith("2:")) {
                String[] arr_s = s.split(":");
                if(arr_s.length == 4) {
                    s = arr_s[1];
                    if(s.isEmpty()) {
                        s = null;
                    }
                }
                else {
                    s = null;
                }
            }
        }
        this.b = s;
    }

    public final String a() {
        synchronized(this.a) {
        }
        return this.a.getString("|S|id", null);
    }

    public final String b() {
        PublicKey publicKey0;
        synchronized(this.a) {
            String s = null;
            String s1 = this.a.getString("|S||P|", null);
            if(s1 == null) {
                return null;
            }
            try {
                byte[] arr_b = Base64.decode(s1, 8);
                publicKey0 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
            }
            catch(IllegalArgumentException | InvalidKeySpecException | NoSuchAlgorithmException illegalArgumentException0) {
                Log.w("ContentValues", "Invalid key stored " + illegalArgumentException0);
                publicKey0 = null;
            }
            if(publicKey0 == null) {
                return null;
            }
            byte[] arr_b1 = publicKey0.getEncoded();
            try {
                byte[] arr_b2 = MessageDigest.getInstance("SHA1").digest(arr_b1);
                arr_b2[0] = (byte)((arr_b2[0] & 15) + 0x70 & 0xFF);
                s = Base64.encodeToString(arr_b2, 0, 8, 11);
            }
            catch(NoSuchAlgorithmException unused_ex) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return s;
        }
    }
}

