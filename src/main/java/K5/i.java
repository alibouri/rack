package K5;

import N5.r;
import S5.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

public final class i implements Callable {
    public final boolean a;
    public final String b;
    public final l c;

    public i(boolean z, String s, l l0) {
        this.a = z;
        this.b = s;
        this.c = l0;
    }

    @Override
    public final Object call() {
        MessageDigest messageDigest0;
        l l0 = this.c;
        boolean z = this.a;
        String s = this.b;
        String s1 = z || !n.b(s, l0, true, false).a ? "not allowed" : "debug cert rejected";
        for(int v1 = 0; true; ++v1) {
            messageDigest0 = null;
            if(v1 >= 2) {
                break;
            }
            try {
                MessageDigest messageDigest1 = MessageDigest.getInstance("SHA-256");
                if(messageDigest1 != null) {
                    messageDigest0 = messageDigest1;
                    break;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        r.j(messageDigest0);
        byte[] arr_b = messageDigest0.digest(l0.g);
        char[] arr_c = new char[arr_b.length + arr_b.length];
        int v2 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v3 = arr_b[v];
            arr_c[v2] = c.b[(v3 & 0xFF) >>> 4];
            arr_c[v2 + 1] = c.b[v3 & 15];
            v2 += 2;
        }
        return s1 + ": pkg=" + s + ", sha256=" + new String(arr_c) + ", atk=" + z + ", ver=12451000.false";
    }
}

