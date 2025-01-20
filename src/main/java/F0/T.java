package F0;

import D0.K;
import D0.V;
import M0.j;
import R2.c;
import androidx.compose.ui.node.LayoutNode;
import g0.n;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.h;
import n0.v;
import q0.b;

public final class t extends c0 {
    public final o0 I0;
    public s J0;
    public static final h K0;

    static {
        h h0 = M.g();
        h0.w(v.f);
        h0.D(1.0f);
        h0.E(1);
        t.K0 = h0;
    }

    public t(LayoutNode layoutNode0) {
        super(layoutNode0);
        o0 o00 = new o0();  // initializer: Lg0/n;-><init>()V
        o00.b0 = 0;
        this.I0 = o00;
        o00.f0 = this;
        this.J0 = layoutNode0.Z == null ? null : new s(this);  // initializer: LF0/P;-><init>(LF0/c0;)V
    }

    @Override  // F0.c0
    public final void B0() {
        if(this.J0 == null) {
            this.J0 = new s(this);  // initializer: LF0/P;-><init>(LF0/c0;)V
        }
    }

    @Override  // F0.c0
    public final P E0() {
        return this.J0;
    }

    @Override  // F0.c0
    public final n G0() {
        return this.I0;
    }

    @Override  // D0.J
    public final int H(int v) {
        c c0 = this.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.d(((c0)layoutNode0.u0.d), layoutNode0.m(), v);
    }

    @Override  // F0.c0
    public final void L0(d d0, long v, r r0, boolean z, boolean z1) {
        r r2;
        int v6;
        Object[] arr_object1;
        boolean z3;
        int v1;
        r r1 = r0;
        boolean z2 = false;
        LayoutNode layoutNode0 = this.j0;
        if(d0.X == 1) {
            v1 = 1;
        }
        else {
            j j0 = layoutNode0.o();
            v1 = (j0 == null || !j0.Z ? 0 : 1) ^ 1;
        }
        if(v1 == 0) {
            z3 = z1;
        }
        else if(yc.d.n(v) && (this.B0 == null || !this.n0 || this.B0.l(v))) {
            z3 = z1;
            z2 = true;
        }
        else if(z) {
            float f = this.x0(v, this.F0());
            if(Float.isInfinite(f) || Float.isNaN(f)) {
                z3 = z1;
            }
            else {
                z3 = false;
                z2 = true;
            }
        }
        else {
            z3 = z1;
        }
        if(z2) {
            int v2 = r1.Z;
            W.d d1 = layoutNode0.u();
            int v3 = d1.Z;
            if(v3 > 0) {
                Object[] arr_object = d1.X;
                int v4 = v3 - 1;
                while(true) {
                    LayoutNode layoutNode1 = (LayoutNode)arr_object[v4];
                    if(layoutNode1.F()) {
                        if(d0.X == 1) {
                            arr_object1 = arr_object;
                            v6 = v2;
                            r2 = r1;
                            layoutNode1.w(v, r0, z, z3);
                        }
                        else {
                            long v5 = ((c0)layoutNode1.u0.d).D0(v, true);
                            ((c0)layoutNode1.u0.d).K0(c0.H0, v5, r0, true, z3);
                            arr_object1 = arr_object;
                            v6 = v2;
                            r2 = r1;
                        }
                        long v7 = r0.a();
                        if(Float.intBitsToFloat(((int)(v7 >> 0x20))) >= 0.0f && ((int)(v7 & 0xFFFFFFFFL)) != 0) {
                            if(!r2.c0) {
                                break;
                            }
                            r2.Z = r2.b0 - true;
                        }
                    }
                    else {
                        arr_object1 = arr_object;
                        v6 = v2;
                        r2 = r1;
                    }
                    --v4;
                    if(v4 < 0) {
                        break;
                    }
                    arr_object = arr_object1;
                    v2 = v6;
                    r1 = r2;
                }
            }
            else {
                v6 = v2;
                r2 = r1;
            }
            r2.Z = v6;
        }
    }

    @Override  // D0.J
    public final int N(int v) {
        c c0 = this.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.a(((c0)layoutNode0.u0.d), layoutNode0.m(), v);
    }

    @Override  // D0.J
    public final int O(int v) {
        c c0 = this.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.c(((c0)layoutNode0.u0.d), layoutNode0.m(), v);
    }

    @Override  // F0.c0
    public final void S0(n0.t t0, b b0) {
        i0 i00 = G.a(this.j0);
        W.d d0 = this.j0.u();
        int v = d0.Z;
        if(v > 0) {
            Object[] arr_object = d0.X;
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.F()) {
                    layoutNode0.j(t0, b0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(i00.getShowLayoutBounds()) {
            this.z0(t0, t.K0);
        }
    }

    @Override  // D0.V
    public final void Z(long v, float f, Function1 function10) {
        this.T0(v, f, function10, null);
        if(!this.e0) {
            this.R0();
            this.j0.v0.r.o0();
        }
    }

    @Override  // D0.J
    public final V a(long v) {
        this.e0(v);
        LayoutNode layoutNode0 = this.j0;
        W.d d0 = layoutNode0.v();
        int v1 = d0.Z;
        if(v1 > 0) {
            Object[] arr_object = d0.X;
            int v2 = 0;
            while(true) {
                ((LayoutNode)arr_object[v2]).v0.r.i0 = 3;
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        this.V0(layoutNode0.n0.b(this, layoutNode0.m(), v));
        this.Q0();
        return this;
    }

    @Override  // D0.J
    public final int b(int v) {
        c c0 = this.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.e(((c0)layoutNode0.u0.d), layoutNode0.m(), v);
    }

    @Override  // F0.c0
    public final void b0(long v, float f, b b0) {
        this.T0(v, f, null, b0);
        if(!this.e0) {
            this.R0();
            this.j0.v0.r.o0();
        }
    }

    @Override  // F0.O
    public final int f0(D0.n n0) {
        s s0 = this.J0;
        if(s0 != null) {
            return s0.f0(n0);
        }
        J j0 = this.j0.v0.r;
        F f0 = j0.s0;
        if(!j0.j0) {
            L l0 = j0.F0;
            if(l0.c == 1) {
                f0.f = true;
                if(f0.b) {
                    l0.e = true;
                    l0.f = true;
                }
            }
            else {
                f0.g = true;
            }
        }
        j0.i().f0 = true;
        j0.l();
        j0.i().f0 = false;
        Integer integer0 = (Integer)f0.i.get(n0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }
}

