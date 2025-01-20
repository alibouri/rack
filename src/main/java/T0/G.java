package t0;

import Bb.z;
import W4.f;
import android.graphics.Path;
import java.util.List;
import m5.b;
import n0.M;
import n0.j;
import n0.l;
import n0.r;
import p0.d;
import p0.h;

public final class g extends B {
    public r b;
    public float c;
    public Object d;
    public float e;
    public float f;
    public r g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public h q;
    public final j r;
    public j s;
    public final Object t;

    public g() {
        this.c = 1.0f;
        this.d = z.X;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        j j0 = M.h();
        this.r = j0;
        this.s = j0;
        this.t = f.z(t0.f.Y);
    }

    @Override  // t0.B
    public final void a(d d0) {
        if(this.n) {
            a.d(((List)this.d), this.r);
            this.e();
        }
        else if(this.p) {
            this.e();
        }
        this.n = false;
        this.p = false;
        r r0 = this.b;
        if(r0 != null) {
            b.i(d0, this.s, r0, this.c, null, 56);
        }
        r r1 = this.g;
        if(r1 != null) {
            h h0 = this.q;
            if(this.o || h0 == null) {
                h0 = new h(this.f, this.j, this.h, this.i, 16);
                this.q = h0;
                this.o = false;
            }
            b.i(d0, this.s, r1, this.e, h0, 0x30);
        }
    }

    public final void e() {
        Path path0;
        j j0 = this.r;
        if(Float.compare(this.k, 0.0f) == 0 && this.l == 1.0f) {
            this.s = j0;
            return;
        }
        if(Nb.j.a(this.s, j0)) {
            this.s = M.h();
        }
        else {
            int v = this.s.o();
            this.s.rewind();
            this.s.l(v);
        }
        Object object0 = this.t;
        l l0 = (l)((Ab.h)object0).getValue();
        if(j0 == null) {
            path0 = null;
        }
        else {
            l0.getClass();
            path0 = j0.a;
        }
        l0.a.setPath(path0, false);
        float f = ((l)((Ab.h)object0).getValue()).a.getLength();
        float f1 = (this.k + this.m) % 1.0f * f;
        float f2 = (this.l + this.m) % 1.0f * f;
        if(f1 > f2) {
            ((l)((Ab.h)object0).getValue()).a(f1, f, this.s);
            ((l)((Ab.h)object0).getValue()).a(0.0f, f2, this.s);
            return;
        }
        ((l)((Ab.h)object0).getValue()).a(f1, f2, this.s);
    }

    @Override
    public final String toString() {
        return this.r.toString();
    }
}

