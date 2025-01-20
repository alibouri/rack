package N9;

import Bb.z;
import Nb.j;
import Xb.G;
import ac.B0;
import ac.h;
import ac.j0;
import ac.o0;
import ac.r0;
import u9.u;

public final class n {
    public final a a;
    public final E9.a b;
    public final j0 c;
    public final B0 d;
    public c e;
    public final j0 f;

    public n(a a0, h h0, u u0, E9.a a1, G g0) {
        j.f(h0, "tooltipsFlow");
        j.f(a1, "analytics");
        j.f(g0, "scope");
        super();
        this.a = a0;
        this.b = a1;
        this.c = o0.D(h0, g0, r0.a, z.X);
        B0 b00 = o0.c(Boolean.FALSE);
        this.d = b00;
        this.f = o0.D(o0.F(b00, new l(null, this, 0)), g0, r0.a, null);
    }

    public final void a(c c0) {
        Object object0 = null;
        for(Object object1: ((Iterable)((B0)this.c.X).getValue())) {
            if(((d)object1).b.equals(c0)) {
                object0 = object1;
                break;
            }
        }
        if(((d)object0) == null) {
            return;
        }
        for(int v = 0; v < ((d)object0).e; ++v) {
            String s = ((d)object0).f;
            if(s == null) {
                s = ((d)object0).a;
            }
            u.a(s);
        }
        do {
            Object object2 = this.d.getValue();
            ((Boolean)object2).getClass();
        }
        while(!this.d.j(object2, Boolean.TRUE));
    }

    public final void b() {
        d d0 = (d)((B0)this.f.X).getValue();
        if(d0 == null) {
            return;
        }
        this.e = d0.b;
        for(int v = 0; v < d0.e; ++v) {
            u.a((d0.f == null ? d0.a : d0.f));
        }
        do {
            Object object0 = this.d.getValue();
            ((Boolean)object0).getClass();
        }
        while(!this.d.j(object0, Boolean.TRUE));
        yc.d.r(this.b, d0, b.Z);
    }

    public final void c() {
        d d0 = (d)((B0)this.f.X).getValue();
        if(d0 == null) {
            return;
        }
        this.e = d0.b;
        do {
            Object object0 = this.d.getValue();
            ((Boolean)object0).getClass();
        }
        while(!this.d.j(object0, Boolean.TRUE));
        yc.d.r(this.b, d0, b.b0);
    }

    public final void d() {
        d d0 = (d)((B0)this.f.X).getValue();
        if(d0 == null) {
            return;
        }
        yc.d.r(this.b, d0, b.Y);
    }
}

