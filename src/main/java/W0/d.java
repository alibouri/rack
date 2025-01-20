package W0;

import F0.K;
import U.C;
import Z0.j;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import m0.e;
import n0.M;
import n0.P;
import n0.Q;
import n0.U;
import n0.h;
import n0.r;
import p0.g;

public final class d extends TextPaint {
    public h a;
    public j b;
    public int c;
    public Q d;
    public r e;
    public C f;
    public e g;
    public p0.e h;

    public final h a() {
        h h0 = this.a;
        if(h0 != null) {
            return h0;
        }
        h h1 = new h(this);
        this.a = h1;
        return h1;
    }

    public final void b(int v) {
        if(v == this.c) {
            return;
        }
        this.a().v(v);
        this.c = v;
    }

    public final void c(r r0, long v, float f) {
        boolean z = false;
        Shader shader0 = null;
        if(r0 == null) {
            this.f = null;
            this.e = null;
            this.g = null;
            this.setShader(null);
            return;
        }
        if(r0 instanceof U) {
            this.d(N4.j.A(f, ((U)r0).a));
            return;
        }
        if(r0 instanceof P) {
            if(!Nb.j.a(this.e, r0) || !(this.g == null ? false : e.a(this.g.a, v))) {
                if(v != 0x7FC000007FC00000L) {
                    z = true;
                }
                if(z) {
                    this.e = r0;
                    this.g = new e(v);
                    this.f = U.d.w(new K(1, v, r0));
                }
            }
            h h0 = this.a();
            C c0 = this.f;
            if(c0 != null) {
                shader0 = (Shader)c0.getValue();
            }
            h0.A(shader0);
            W0.h.b(this, f);
        }
    }

    public final void d(long v) {
        if(v != 16L) {
            this.setColor(M.G(v));
            this.f = null;
            this.e = null;
            this.g = null;
            this.setShader(null);
        }
    }

    public final void e(p0.e e0) {
        if(e0 == null) {
            return;
        }
        if(!Nb.j.a(this.h, e0)) {
            this.h = e0;
            if(e0.equals(g.a)) {
                this.setStyle(Paint.Style.FILL);
                return;
            }
            if(e0 instanceof p0.h) {
                this.a().E(1);
                this.a().D(((p0.h)e0).a);
                ((Paint)this.a().c).setStrokeMiter(((p0.h)e0).b);
                this.a().C(((p0.h)e0).d);
                this.a().B(((p0.h)e0).c);
                this.a().z(((p0.h)e0).e);
            }
        }
    }

    public final void f(Q q0) {
        if(q0 == null) {
            return;
        }
        if(!Nb.j.a(this.d, q0)) {
            this.d = q0;
            this.clearShadowLayer();
        }
    }

    public final void g(j j0) {
        if(j0 == null) {
            return;
        }
        if(!Nb.j.a(this.b, j0)) {
            this.b = j0;
            boolean z = false;
            this.setUnderlineText((j0.a | 1) == j0.a);
            j j1 = this.b;
            j1.getClass();
            if((j1.a | 2) == j1.a) {
                z = true;
            }
            this.setStrikeThruText(z);
        }
    }
}

