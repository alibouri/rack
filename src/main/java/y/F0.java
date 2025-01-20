package y;

import A.b;
import A.k;
import Ab.t;
import Eb.a;
import F0.l;
import F0.m0;
import F0.n;
import Fb.c;
import Nb.j;
import W5.f;
import Zb.i;
import kotlin.jvm.functions.Function1;
import z0.g;
import z0.z;

public abstract class f0 extends n implements l, m0 {
    public q0 n0;
    public Function1 o0;
    public boolean p0;
    public k q0;
    public i r0;
    public b s0;
    public boolean t0;
    public z u0;

    public f0(Function1 function10, boolean z, k k0, q0 q00) {
        this.n0 = q00;
        this.o0 = function10;
        this.p0 = z;
        this.q0 = k0;
    }

    public static final Object A0(f0 f00, c c0) {
        a0 a00;
        f00.getClass();
        if(c0 instanceof a0) {
            a00 = (a0)c0;
            int v = a00.e0;
            if((v & 0x80000000) == 0) {
                a00 = new a0(f00, c0);
            }
            else {
                a00.e0 = v ^ 0x80000000;
            }
        }
        else {
            a00 = new a0(f00, c0);
        }
        Object object0 = a00.c0;
        Object object1 = a.X;
        switch(a00.e0) {
            case 0: {
                f.b0(object0);
                b b0 = f00.s0;
                if(b0 != null) {
                    k k0 = f00.q0;
                    if(k0 != null) {
                        A.a a0 = new A.a(b0);
                        a00.b0 = f00;
                        a00.e0 = 1;
                        if(k0.a(a0, a00) == object1) {
                            return object1;
                        }
                    }
                    f00.s0 = null;
                }
                break;
            }
            case 1: {
                f00 = a00.b0;
                f.b0(object0);
                f00.s0 = null;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f00.G0(0L);
        return t.a;
    }

    public static final Object B0(f0 f00, M m0, c c0) {
        b b1;
        b0 b00;
        f00.getClass();
        if(c0 instanceof b0) {
            b00 = (b0)c0;
            int v = b00.g0;
            if((v & 0x80000000) == 0) {
                b00 = new b0(f00, c0);
            }
            else {
                b00.g0 = v ^ 0x80000000;
            }
        }
        else {
            b00 = new b0(f00, c0);
        }
        Object object0 = b00.e0;
        Object object1 = a.X;
        switch(b00.g0) {
            case 0: {
                f.b0(object0);
                b b0 = f00.s0;
                if(b0 != null) {
                    k k0 = f00.q0;
                    if(k0 != null) {
                        A.a a0 = new A.a(b0);
                        b00.b0 = f00;
                        b00.c0 = m0;
                        b00.g0 = 1;
                        if(k0.a(a0, b00) == object1) {
                            return object1;
                        }
                    }
                }
                goto label_28;
            }
            case 1: {
                m0 = b00.c0;
                f00 = b00.b0;
                f.b0(object0);
            label_28:
                b1 = new b();  // initializer: Ljava/lang/Object;-><init>()V
                k k1 = f00.q0;
                if(k1 != null) {
                    b00.b0 = f00;
                    b00.c0 = m0;
                    b00.d0 = b1;
                    b00.g0 = 2;
                    if(k1.a(b1, b00) != object1) {
                        b1 = b1;
                        f00 = f00;
                        break;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                b b2 = b00.d0;
                m0 = b00.c0;
                f0 f01 = b00.b0;
                f.b0(object0);
                b1 = b2;
                f00 = f01;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f00.s0 = b1;
        f00.F0(m0.a);
        return t.a;
    }

    public static final Object C0(f0 f00, N n0, c c0) {
        c0 c00;
        f00.getClass();
        if(c0 instanceof c0) {
            c00 = (c0)c0;
            int v = c00.f0;
            if((v & 0x80000000) == 0) {
                c00 = new c0(f00, c0);
            }
            else {
                c00.f0 = v ^ 0x80000000;
            }
        }
        else {
            c00 = new c0(f00, c0);
        }
        Object object0 = c00.d0;
        Object object1 = a.X;
        switch(c00.f0) {
            case 0: {
                f.b0(object0);
                b b0 = f00.s0;
                if(b0 != null) {
                    k k0 = f00.q0;
                    if(k0 != null) {
                        A.c c1 = new A.c(b0);
                        c00.b0 = f00;
                        c00.c0 = n0;
                        c00.f0 = 1;
                        if(k0.a(c1, c00) == object1) {
                            return object1;
                        }
                    }
                    f00.s0 = null;
                }
                break;
            }
            case 1: {
                n0 = c00.c0;
                f00 = c00.b0;
                f.b0(object0);
                f00.s0 = null;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f00.G0(n0.a);
        return t.a;
    }

    public final void D0() {
        b b0 = this.s0;
        if(b0 != null) {
            k k0 = this.q0;
            if(k0 != null) {
                k0.b(new A.a(b0));
            }
            this.s0 = null;
        }
    }

    public abstract Object E0(d0 arg1, e0 arg2);

    public abstract void F0(long arg1);

    public abstract void G0(long arg1);

    public abstract boolean H0();

    public final void I0(Function1 function10, boolean z, k k0, q0 q00, boolean z1) {
        this.o0 = function10;
        boolean z2 = true;
        if(this.p0 != z) {
            this.p0 = z;
            if(!z) {
                this.D0();
                z z3 = this.u0;
                if(z3 != null) {
                    this.y0(z3);
                }
                this.u0 = null;
            }
            z1 = true;
        }
        if(!j.a(this.q0, k0)) {
            this.D0();
            this.q0 = k0;
        }
        if(this.n0 == q00) {
            z2 = z1;
        }
        else {
            this.n0 = q00;
        }
        if(z2) {
            z z4 = this.u0;
            if(z4 != null) {
                z4.z0();
            }
        }
    }

    @Override  // F0.m0
    public final boolean N() {
        return false;
    }

    @Override  // F0.m0
    public final void R() {
        this.Y();
    }

    @Override  // F0.m0
    public final void Y() {
        z z0 = this.u0;
        if(z0 != null) {
            z0.Y();
        }
    }

    @Override  // F0.m0
    public final void h0() {
    }

    @Override  // F0.m0
    public final void j() {
        this.Y();
    }

    @Override  // F0.m0
    public void m(z0.f f0, g g0, long v) {
        if(this.p0 && this.u0 == null) {
            z z0 = new z(null, null, null, new Z(this, null));
            this.x0(z0);
            this.u0 = z0;
        }
        z z1 = this.u0;
        if(z1 != null) {
            z1.m(f0, g0, v);
        }
    }

    @Override  // g0.n
    public final void q0() {
        this.t0 = false;
        this.D0();
    }
}

