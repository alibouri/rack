package K;

import B.m0;
import Bb.F;
import G0.f0;
import I.x0;
import J.d;
import Nb.j;
import O0.L;
import O0.N;
import Pb.a;
import U0.n;
import U0.w;
import Xb.G;
import Xb.I0;
import Xb.I;
import Xb.J;
import ac.g0;
import ac.n0;
import ac.o0;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import java.lang.ref.WeakReference;
import m0.c;

public final class f implements w {
    public x a;
    public I0 b;
    public B c;
    public n0 d;

    @Override  // U0.w
    public final void a(U0.B b0, U0.B b1) {
        B b2 = this.c;
        if(b2 != null) {
            boolean z = !N.a(b2.h.b, b1.b) || !j.a(b2.h.c, b1.c);
            b2.h = b1;
            int v1 = b2.j.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                D d0 = (D)((WeakReference)b2.j.get(v2)).get();
                if(d0 != null) {
                    d0.g = b1;
                }
            }
            synchronized(b2.m.c) {
                b2.m.j = null;
                b2.m.l = null;
                b2.m.k = null;
                b2.m.m = null;
                b2.m.n = null;
            }
            int v3 = -1;
            if(!j.a(b0, b1)) {
                if(b0 != null && (!j.a(b0.a.X, b1.a.X) || N.a(b0.b, b1.b) && !j.a(b0.c, b1.c))) {
                    b2.b.t().restartInput(((View)b2.b.Y));
                    return;
                }
                int v8 = b2.j.size();
                for(int v = 0; v < v8; ++v) {
                    D d1 = (D)((WeakReference)b2.j.get(v)).get();
                    if(d1 != null) {
                        U0.B b3 = b2.h;
                        v v9 = b2.b;
                        if(d1.k) {
                            d1.g = b3;
                            if(d1.i) {
                                int v10 = d1.h;
                                ExtractedText extractedText0 = F.h(b3);
                                v9.t().updateExtractedText(((View)v9.Y), v10, extractedText0);
                            }
                            v9.t().updateSelection(((View)v9.Y), N.e(b3.b), N.d(b3.b), (b3.c == null ? -1 : N.e(b3.c.a)), (b3.c == null ? -1 : N.d(b3.c.a)));
                        }
                    }
                }
            }
            else if(z) {
                v v4 = b2.b;
                int v5 = N.e(b1.b);
                int v6 = N.d(b1.b);
                N n0 = b2.h.c;
                int v7 = n0 == null ? -1 : N.e(n0.a);
                N n1 = b2.h.c;
                if(n1 != null) {
                    v3 = N.d(n1.a);
                }
                v4.t().updateSelection(((View)v4.Y), v5, v6, v7, v3);
            }
        }
    }

    @Override  // U0.w
    public final void b(c c0) {
        B b0 = this.c;
        if(b0 != null) {
            b0.l = new Rect(a.H(c0.a), a.H(c0.b), a.H(c0.c), a.H(c0.d));
            if(b0.j.isEmpty()) {
                Rect rect0 = b0.l;
                if(rect0 != null) {
                    Rect rect1 = new Rect(rect0);
                    b0.a.requestRectangleOnScreen(rect1);
                }
            }
        }
    }

    @Override  // U0.w
    public final void c() {
        this.j(null);
    }

    @Override  // U0.w
    public final void d() {
        x x0 = this.a;
        if(x0 != null) {
            SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)F0.f.i(x0, f0.n);
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.a();
            }
        }
    }

    @Override  // U0.w
    public final void e() {
        x x0 = this.a;
        if(x0 != null) {
            SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)F0.f.i(x0, f0.n);
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.b();
            }
        }
    }

    @Override  // U0.w
    public final void f() {
        I0 i00 = this.b;
        if(i00 != null) {
            i00.f(null);
        }
        this.b = null;
        g0 g00 = this.i();
        if(g00 != null) {
            ((n0)g00).p();
        }
    }

    @Override  // U0.w
    public final void g(U0.B b0, n n0, m0 m00, I.F f0) {
        this.j(new x0(b0, this, n0, m00, f0));
    }

    @Override  // U0.w
    public final void h(U0.B b0, U0.v v0, L l0, Bb.a a0, c c0, c c1) {
        B b1 = this.c;
        if(b1 != null) {
            y y0 = b1.m;
            synchronized(y0.c) {
                y0.j = b0;
                y0.l = v0;
                y0.k = l0;
                y0.m = c0;
                y0.n = c1;
                if(y0.e || y0.d) {
                    y0.a();
                }
            }
        }
    }

    public final g0 i() {
        g0 g00 = this.d;
        if(g00 != null) {
            return g00;
        }
        if(!d.a) {
            return null;
        }
        n0 n00 = o0.b(1, 0, Zb.a.Z, 2);
        this.d = n00;
        return n00;
    }

    public final void j(x0 x00) {
        x x0 = this.a;
        if(x0 == null) {
            return;
        }
        I0 i00 = null;
        e e0 = new e(x00, this, x0, null);
        if(x0.k0) {
            G g0 = x0.l0();
            K.w w0 = new K.w(x0, e0, null);
            i00 = J.q(g0, null, I.b0, w0, 1);
        }
        this.b = i00;
    }

    public final void k(x x0) {
        if(this.a != x0) {
            throw new IllegalStateException(("Expected textInputModifierNode to be " + x0 + " but was " + this.a).toString());
        }
        this.a = null;
    }
}

