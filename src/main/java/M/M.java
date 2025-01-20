package M;

import I2.J;
import L.g;
import O0.L;
import O0.f;
import O0.s;
import androidx.compose.ui.layout.LayoutCoordinates;

public final class m {
    public final long a;
    public final g b;
    public final g c;
    public L d;
    public int e;

    public m(long v, g g0, g g1) {
        this.a = v;
        this.b = g0;
        this.c = g1;
        this.e = -1;
    }

    public final long a(q q0, boolean z) {
        p p0 = q0.a;
        long v = this.a;
        if(!z || p0.c == v) {
            p p1 = q0.b;
            if(!z && p1.c != v || this.c() == null) {
                return 0x7FC000007FC00000L;
            }
            L l0 = (L)this.c.invoke();
            if(l0 == null) {
                return 0x7FC000007FC00000L;
            }
            return z ? c0.t(l0, J.r(p0.b, 0, this.b(l0)), z, q0.c) : c0.t(l0, J.r(p1.b, 0, this.b(l0)), z, q0.c);
        }
        return 0x7FC000007FC00000L;
    }

    public final int b(L l0) {
        synchronized(this) {
            if(this.d != l0) {
                s s0 = l0.b;
                int v1 = 0;
                if(!s0.c && ((float)(((int)(l0.c & 0xFFFFFFFFL)))) >= s0.e || s0.c) {
                    v1 = s0.f - 1;
                }
                else {
                    int v2 = s0.c(((float)(((int)(l0.c & 0xFFFFFFFFL)))));
                    int v3 = l0.b.f - 1;
                    if(v2 > v3) {
                        v2 = v3;
                    }
                    while(v2 >= 0 && l0.b.d(v2) < ((float)(((int)(l0.c & 0xFFFFFFFFL))))) {
                        --v2;
                    }
                    if(v2 >= 0) {
                        v1 = v2;
                    }
                }
                this.e = l0.e(v1, true);
                this.d = l0;
            }
            return this.e;
        }
    }

    public final LayoutCoordinates c() {
        LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.b.invoke();
        return layoutCoordinates0 == null || !layoutCoordinates0.r() ? null : layoutCoordinates0;
    }

    public final q d() {
        L l0 = (L)this.c.invoke();
        if(l0 == null) {
            return null;
        }
        int v = l0.a.a.X.length();
        return new q(new p(l0.a(0), 0, this.a), new p(l0.a(Math.max(v - 1, 0)), v, this.a), false);
    }

    public final f e() {
        L l0 = (L)this.c.invoke();
        return l0 == null ? new f(6, "", null) : l0.a.a;
    }
}

