package hb;

import Ab.o;
import Ea.e0;
import Vb.a;
import W4.f;
import org.libsodium.jni.SodiumJNI;
import q9.o0;

public final class d implements j {
    public final byte[] X;
    public static final o Y;

    static {
        d.Y = f.A(new e0(17));
    }

    public d() {
        B3.d d0 = new B3.d(29);
        super();
        this.X = (byte[])d0.Y;
        SodiumJNI.sodium_init();
    }

    @Override  // hb.j
    public final String a(String s) {
        Nb.j.f(s, "logLine");
        byte[] arr_b = s.getBytes(a.a);
        Nb.j.e(arr_b, "getBytes(...)");
        byte[] arr_b1 = new byte[((Number)d.Y.getValue()).intValue() + arr_b.length];
        SodiumJNI.crypto_box_seal(arr_b1, arr_b, arr_b.length, this.X);
        return o0.k(10, arr_b1);
    }
}

