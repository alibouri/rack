package d0;

import Ab.t;
import B.m0;
import D0.u;
import K.v;
import U.H;
import U.Z;
import U.l0;
import U.l;
import U.p;
import c0.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class h implements c {
    public final Map a;
    public final LinkedHashMap b;
    public j c;
    public static final v d;

    static {
        h.d = new v(d.Y, 11, e.Y);
    }

    public h(Map map0) {
        this.a = map0;
        this.b = new LinkedHashMap();
    }

    @Override  // d0.c
    public final void d(Object object0, b b0, p p0, int v) {
        p0.S(0xB88FC293);
        int v1 = (v & 6) == 0 ? (p0.h(object0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            p0.T(object0);
            Object object1 = p0.G();
            Z z0 = l.a;
            if(object1 == z0) {
                if(!(this.c == null ? true : this.c.a(object0))) {
                    throw new IllegalArgumentException(("Type of the key " + object0 + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                object1 = new f(this, object0);
                p0.a0(object1);
            }
            U.d.a(d0.l.a.a(((f)object1).c), b0, p0, v1 & 0x70 | 8);
            t t0 = t.a;
            boolean z1 = p0.h(this);
            boolean z2 = p0.h(object0);
            boolean z3 = p0.h(((f)object1));
            Object object2 = p0.G();
            if((z1 | z2 | z3) != 0 || object2 == z0) {
                object2 = new m0(this, object0, ((f)object1), 14);
                p0.a0(object2);
            }
            H.b(t0, ((Function1)object2), p0);
            if(p0.x && p0.F.i == p0.y) {
                p0.y = -1;
                p0.x = false;
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(this, object0, b0, v, 12);
        }
    }

    @Override  // d0.c
    public final void e(Object object0) {
        f f0 = (f)this.b.get(object0);
        if(f0 != null) {
            f0.b = false;
            return;
        }
        this.a.remove(object0);
    }
}

