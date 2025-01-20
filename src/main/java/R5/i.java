package r5;

import a8.Q;
import android.util.Base64;
import java.util.Arrays;
import o5.d;

public final class i {
    public final String a;
    public final byte[] b;
    public final d c;

    public i(String s, byte[] arr_b, d d0) {
        this.a = s;
        this.b = arr_b;
        this.c = d0;
    }

    public static Q a() {
        Q q0 = new Q(26, false);
        q0.b0 = d.X;
        return q0;
    }

    // Deobfuscation rating: MEDIUM(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof i && (this.a.equals(((i)object0).a) && Arrays.equals(this.b, ((i)object0).b) && this.c.equals(((i)object0).c));
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ v) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.b;
        if(arr_b == null) {
            return "TransportContext(" + this.a + ", " + this.c + ", " + "" + ")";
        }
        String s = Base64.encodeToString(arr_b, 2);
        return "TransportContext(" + this.a + ", " + this.c + ", " + s + ")";
    }
}

