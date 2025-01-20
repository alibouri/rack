package M;

import Ab.h;
import Nb.k;
import O0.L;
import kotlin.jvm.functions.Function0;

public final class t extends k implements Function0 {
    public final o X;
    public final int Y;
    public final int Z;
    public final M b0;
    public final Object c0;

    public t(o o0, int v, int v1, M m0, h h0) {
        this.X = o0;
        this.Y = v;
        this.Z = v1;
        this.b0 = m0;
        this.c0 = h0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = ((Number)((h)this.c0).getValue()).intValue();
        boolean z = this.b0.a();
        boolean z1 = this.b0.l() == 1;
        o o0 = this.X;
        int v1 = this.Y;
        long v2 = o0.f.l(v1);
        int v3 = (int)(v2 >> 0x20);
        L l0 = o0.f;
        int v4 = l0.f(v3);
        int v5 = l0.b.f;
        if(v4 != v) {
            v3 = v < v5 ? l0.i(v) : l0.i(v5 - 1);
        }
        int v6 = (int)(v2 & 0xFFFFFFFFL);
        if(l0.f(v6) != v) {
            v6 = v < v5 ? l0.e(v, false) : l0.e(v5 - 1, false);
        }
        int v7 = this.Z;
        if(v3 == v7) {
            return o0.a(v6);
        }
        if(v6 == v7) {
            return o0.a(v3);
        }
        if((z ^ z1) != 0) {
            return v1 > v6 ? o0.a(v6) : o0.a(v3);
        }
        if(v1 >= v3) {
            v3 = v6;
        }
        return o0.a(v3);
    }
}

