package m1;

import g1.k;
import l1.h;

public final class g implements h, d {
    public final k a;
    public int b;
    public o1.h c;
    public int d;
    public int e;
    public float f;
    public String g;

    public g(k k0) {
        this.d = -1;
        this.e = -1;
        this.f = 0.0f;
        this.a = k0;
    }

    @Override  // l1.h
    public final o1.d a() {
        if(this.c == null) {
            this.c = new o1.h();
        }
        return this.c;
    }

    @Override  // m1.d, l1.h
    public final void apply() {
        this.c.W(this.b);
        int v = this.d;
        if(v != -1) {
            o1.h h0 = this.c;
            if(v > -1) {
                h0.r0 = -1.0f;
                h0.s0 = v;
                h0.t0 = -1;
                return;
            }
            h0.getClass();
            return;
        }
        int v1 = this.e;
        if(v1 != -1) {
            o1.h h1 = this.c;
            if(v1 > -1) {
                h1.r0 = -1.0f;
                h1.s0 = -1;
                h1.t0 = v1;
                return;
            }
            h1.getClass();
            return;
        }
        o1.h h2 = this.c;
        float f = this.f;
        if(f > -1.0f) {
            h2.r0 = f;
            h2.s0 = -1;
            h2.t0 = -1;
            return;
        }
        h2.getClass();
    }

    @Override  // l1.h
    public final void b(o1.d d0) {
        if(d0 instanceof o1.h) {
            this.c = (o1.h)d0;
            return;
        }
        this.c = null;
    }

    @Override  // l1.h
    public final d c() {
        return null;
    }

    @Override  // l1.h
    public final Object getKey() {
        return this.g;
    }
}

