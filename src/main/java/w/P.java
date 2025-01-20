package w;

import Bb.q;
import F0.e0;
import F0.f;
import F0.o;
import Nb.j;
import Nb.w;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import g0.n;
import m0.a;
import m0.e;
import m5.b;
import n0.H;
import n0.I;
import n0.J;
import n0.K;
import n0.M;
import n0.S;
import n0.r;
import n0.v;
import p0.g;
import yc.d;

public final class p extends n implements e0, o {
    public long l0;
    public r m0;
    public float n0;
    public S o0;
    public long p0;
    public LayoutDirection q0;
    public K r0;
    public S s0;

    @Override  // F0.e0
    public final void F() {
        this.p0 = 0x7FC000007FC00000L;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        f.n(this);
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        if(this.o0 == M.a) {
            if(!v.c(this.l0, v.i)) {
                b.l(layoutNodeDrawScope0, this.l0, 0L, 0L, 0.0f, 0x7E);
            }
            r r0 = this.m0;
            if(r0 != null) {
                b.k(layoutNodeDrawScope0, r0, 0L, 0L, this.n0, null, 0x76);
            }
        }
        else {
            w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
            p0.b b0 = layoutNodeDrawScope0.X;
            if(!e.a(b0.Y.A(), this.p0) || layoutNodeDrawScope0.getLayoutDirection() != this.q0 || !j.a(this.s0, this.o0)) {
                f.s(this, new C.n(w0, this, layoutNodeDrawScope0, 12));
            }
            else {
                K k0 = this.r0;
                j.c(k0);
                w0.X = k0;
            }
            this.r0 = (K)w0.X;
            this.p0 = b0.Y.A();
            this.q0 = layoutNodeDrawScope0.getLayoutDirection();
            this.s0 = this.o0;
            Object object0 = w0.X;
            j.c(object0);
            g g0 = g.a;
            if(!v.c(this.l0, v.i)) {
                long v = this.l0;
                if(((K)object0) instanceof I) {
                    layoutNodeDrawScope0.U(v, d.d(((I)(((K)object0))).a.a, ((I)(((K)object0))).a.b), J2.w.m(((I)(((K)object0))).a.d(), ((I)(((K)object0))).a.c()), 1.0f, g0, null, 3);
                }
                else if(((K)object0) instanceof J) {
                    n0.j j0 = ((J)(((K)object0))).b;
                    if(j0 == null) {
                        float f = a.b(((J)(((K)object0))).a.h);
                        layoutNodeDrawScope0.k0(v, d.d(((J)(((K)object0))).a.a, ((J)(((K)object0))).a.b), J2.w.m(((J)(((K)object0))).a.b(), ((J)(((K)object0))).a.a()), q.a(f, f), g0, 1.0f, null, 3);
                    }
                    else {
                        layoutNodeDrawScope0.S(j0, v, 1.0f, g0, null, 3);
                    }
                }
                else {
                    if(!(((K)object0) instanceof H)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    layoutNodeDrawScope0.S(((H)(((K)object0))).a, v, 1.0f, g0, null, 3);
                }
            }
            r r1 = this.m0;
            if(r1 != null) {
                float f1 = this.n0;
                if(((K)object0) instanceof I) {
                    layoutNodeDrawScope0.G(r1, d.d(((I)(((K)object0))).a.a, ((I)(((K)object0))).a.b), J2.w.m(((I)(((K)object0))).a.d(), ((I)(((K)object0))).a.c()), f1, g0, null, 3);
                }
                else if(((K)object0) instanceof J) {
                    n0.j j1 = ((J)(((K)object0))).b;
                    if(j1 == null) {
                        float f2 = a.b(((J)(((K)object0))).a.h);
                        layoutNodeDrawScope0.c(r1, d.d(((J)(((K)object0))).a.a, ((J)(((K)object0))).a.b), J2.w.m(((J)(((K)object0))).a.b(), ((J)(((K)object0))).a.a()), q.a(f2, f2), f1, g0, null, 3);
                    }
                    else {
                        layoutNodeDrawScope0.W(j1, r1, f1, g0, null, 3);
                    }
                }
                else {
                    if(!(((K)object0) instanceof H)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    layoutNodeDrawScope0.W(((H)(((K)object0))).a, r1, f1, g0, null, 3);
                }
            }
        }
        layoutNodeDrawScope0.a();
    }

    @Override  // F0.o
    public final void f0() {
    }
}

