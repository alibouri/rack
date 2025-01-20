package x;

import E.E;
import I.M;
import I.v;
import U.l0;
import c0.b;
import e0.p;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

public final class i {
    public final p a;

    public i() {
        this.a = new p();
    }

    public final void a(c c0, U.p p0, int v) {
        p0.S(1320309496);
        int v1 = (v & 6) == 0 ? (p0.f(c0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(this) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            p p1 = this.a;
            int v2 = p1.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((Function3)p1.get(v3)).h(c0, p0, ((int)(v1 & 14)));
            }
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 13, this, c0);
        }
    }

    public static void b(i i0, v v0, boolean z, Function0 function00) {
        i0.getClass();
        b b0 = new b(0xF9F600C, new M(v0, z, l.X, null, function00), true);
        i0.a.add(b0);
    }
}

