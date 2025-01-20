package N;

import U.p;
import n0.M;
import n0.v;

public final class h0 {
    public static final h0 a;

    static {
        h0.a = new h0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final long a(long v, float f, p p0, int v1) {
        p0.Q(0x9B70B043);
        if(Float.compare(f, 0.0f) <= 0 || ((Q)p0.k(T.a)).h()) {
            p0.Q(0x45AFD9D7);
        }
        else {
            p0.Q(1169013963);
            v = M.m(v.b((((float)Math.log(f + 1.0f)) * 4.5f + 2.0f) / 100.0f, T.b(v, p0)), v);
        }
        p0.p(false);
        p0.p(false);
        return v;
    }
}

