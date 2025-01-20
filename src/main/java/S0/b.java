package s0;

import J2.w;
import Nb.j;
import androidx.compose.ui.unit.LayoutDirection;
import m0.c;
import m0.e;
import n0.M;
import n0.h;
import n0.n;
import n0.t;
import p0.d;
import yc.l;

public abstract class b {
    public h X;
    public boolean Y;
    public n Z;
    public float b0;
    public LayoutDirection c0;

    public b() {
        this.b0 = 1.0f;
        this.c0 = LayoutDirection.X;
    }

    public abstract boolean b(float arg1);

    public abstract boolean e(n arg1);

    public void f(LayoutDirection layoutDirection0) {
    }

    public final void g(d d0, long v, float f, n n0) {
        if(Float.compare(this.b0, f) != 0) {
            if(!this.b(f)) {
                if(f == 1.0f) {
                    h h0 = this.X;
                    if(h0 != null) {
                        h0.u(1.0f);
                    }
                    this.Y = false;
                }
                else {
                    h h1 = this.X;
                    if(h1 == null) {
                        h1 = M.g();
                        this.X = h1;
                    }
                    h1.u(f);
                    this.Y = true;
                }
            }
            this.b0 = f;
        }
        if(!j.a(this.Z, n0)) {
            if(!this.e(n0)) {
                if(n0 == null) {
                    h h2 = this.X;
                    if(h2 != null) {
                        h2.x(null);
                    }
                    this.Y = false;
                }
                else {
                    h h3 = this.X;
                    if(h3 == null) {
                        h3 = M.g();
                        this.X = h3;
                    }
                    h3.x(n0);
                    this.Y = true;
                }
            }
            this.Z = n0;
        }
        LayoutDirection layoutDirection0 = d0.getLayoutDirection();
        if(this.c0 != layoutDirection0) {
            this.f(layoutDirection0);
            this.c0 = layoutDirection0;
        }
        float f1 = e.d(d0.d()) - e.d(v);
        float f2 = e.b(d0.d()) - e.b(v);
        ((g3.b)d0.A().Y).k(0.0f, 0.0f, f1, f2);
        try {
            if(Float.compare(f, 0.0f) > 0 && (e.d(v) <= 0.0f && e.b(v) <= 0.0f)) {
                if(this.Y) {
                    c c0 = l.g(0L, w.m(e.d(v), e.b(v)));
                    t t0 = d0.A().o();
                    h h4 = this.X;
                    if(h4 == null) {
                        h4 = M.g();
                        this.X = h4;
                    }
                    try {
                        t0.g(c0, h4);
                        this.i(d0);
                    }
                    catch(Throwable throwable0) {
                        t0.l();
                        throw throwable0;
                    }
                    t0.l();
                }
                else {
                    this.i(d0);
                }
            }
        }
        finally {
            ((g3.b)d0.A().Y).k(-0.0f, -0.0f, -f1, -f2);
        }
    }

    public abstract long h();

    public abstract void i(d arg1);
}

