package aa;

import C.E;
import I2.J;
import Nb.j;
import Nb.t;
import Pb.a;
import T3.d;
import U.Z;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import v.b0;
import v.k;
import v.l;
import v.w;
import y.R0;
import y.S0;
import y.m0;
import y.w0;

public final class i implements m0 {
    public final b a;
    public final w b;
    public final k c;
    public final Function3 d;
    public final d e;
    public final ParcelableSnapshotMutableState f;

    public i(b b0, w w0, k k0, Function3 function30) {
        j.f(w0, "decayAnimationSpec");
        j.f(k0, "springAnimationSpec");
        super();
        this.a = b0;
        this.b = w0;
        this.c = k0;
        this.d = function30;
        this.e = aa.j.b;
        this.f = U.d.D(null, Z.e);
    }

    @Override  // y.m0
    public final Object a(R0 r00, float f, S0 s00) {
        int v;
        b b0 = this.a;
        if(b0.b() && b0.a()) {
            this.e.n(b0);
            c c0 = b0.e();
            if(c0 == null) {
                return new Float(f);
            }
            w w0 = this.b;
            j.f(w0, "decayAnimationSpec");
            c c1 = b0.e();
            E e0 = b0.a;
            if(c1 == null) {
                v = -1;
            }
            else {
                float f1 = b0.d();
                if(f1 <= 0.0f) {
                    v = c1.a();
                }
                else {
                    int v1 = b0.c(c1.a());
                    int v2 = b0.c(c1.a() + 1);
                    if(Float.compare(Math.abs(f), 0.5f) < 0) {
                        v = J.r((Math.abs(v1) >= Math.abs(v2) ? c1.a() + 1 : c1.a()), 0, e0.g().m - 1);
                    }
                    else {
                        float f2 = J.q(v.c.e(w0, 0.0f, f), -3.402823E+38f, 3.402823E+38f);
                        v = J.r(c1.a() + a.G(((double)(f < 0.0f ? J.o(f2 + ((float)v2), 0.0f) : J.m(f2 + ((float)v1), 0.0f))) / ((double)f1) - ((double)v1) / ((double)f1)), 0, e0.g().m - 1);
                    }
                }
            }
            int v3 = ((Number)this.d.h(b0, new Integer((f < 0.0f ? c0.a() + 1 : c0.a())), new Integer(v))).intValue();
            if(v3 < 0 || v3 >= e0.g().m) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            return this.c(r00, v3, f, s00);
        }
        return new Float(f);
    }

    public final float b(float f) {
        b b0 = this.a;
        if(Float.compare(f, 0.0f) < 0 && !b0.b()) {
            return f;
        }
        return f <= 0.0f || b0.a() ? 0.0f : f;
    }

    public final Object c(R0 r00, int v, float f, Fb.c c0) {
        i i1;
        float f3;
        int v2;
        R0 r01;
        i i0;
        f f1;
        if(c0 instanceof f) {
            f1 = (f)c0;
            int v1 = f1.h0;
            if((v1 & 0x80000000) == 0) {
                f1 = new f(this, c0);
            }
            else {
                f1.h0 = v1 ^ 0x80000000;
            }
        }
        else {
            f1 = new f(this, c0);
        }
        Object object0 = f1.f0;
        Object object1 = Eb.a.X;
        switch(f1.h0) {
            case 0: {
                W5.f.b0(object0);
                b b0 = this.a;
                c c1 = b0.e();
                if(c1 == null) {
                    return new Float(f);
                }
                if(c1.a() == v && b0.c(c1.a()) == 0) {
                    return new Float(this.b(f));
                }
                if(Math.abs(f) >= 0.5f) {
                    float f2 = v.c.e(this.b, 0.0f, f);
                    if(f >= 0.0f) {
                        if(f2 >= ((float)b0.c(c1.a() + 1))) {
                        label_26:
                            f1.b0 = this;
                            f1.c0 = r00;
                            f1.d0 = v;
                            f1.e0 = f;
                            f1.h0 = 1;
                            object0 = this.d(r00, c1, v, f, true, f1);
                            if(object0 == object1) {
                                return object1;
                            }
                            i0 = this;
                            goto label_46;
                        }
                        goto label_36;
                    }
                    else if(f2 <= ((float)b0.c(c1.a()))) {
                        goto label_26;
                    }
                    else {
                        goto label_36;
                    }
                }
                else {
                label_36:
                    r01 = r00;
                    v2 = v;
                    f3 = f;
                    i1 = this;
                }
                goto label_50;
            }
            case 1: {
                f = f1.e0;
                v = f1.d0;
                r00 = f1.c0;
                i0 = f1.b0;
                W5.f.b0(object0);
            label_46:
                r01 = r00;
                v2 = v;
                f3 = ((Number)object0).floatValue();
                i1 = i0;
            label_50:
                c c2 = i1.a.e();
                if(c2 == null) {
                    return new Float(f);
                }
                if(c2.a() != v2 || i1.a.c(v2) != 0) {
                    f1.b0 = i1;
                    f1.c0 = null;
                    f1.h0 = 2;
                    object0 = i1.f(r01, c2, v2, f3, f1);
                    if(object0 == object1) {
                        return object1;
                    }
                    f3 = ((Number)object0).floatValue();
                    return new Float(i1.b(f3));
                }
                return new Float(i1.b(f3));
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i1 = f1.b0;
        W5.f.b0(object0);
        f3 = ((Number)object0).floatValue();
        return new Float(i1.b(f3));
    }

    public final Object d(R0 r00, c c0, int v, float f, boolean z, Fb.c c1) {
        t t2;
        i i0;
        g g0;
        if(c1 instanceof g) {
            g0 = (g)c1;
            int v1 = g0.f0;
            if((v1 & 0x80000000) == 0) {
                g0 = new g(this, c1);
            }
            else {
                g0.f0 = v1 ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, c1);
        }
        Object object0 = g0.d0;
        Object object1 = Eb.a.X;
        switch(g0.f0) {
            case 0: {
                W5.f.b0(object0);
                if(c0.a() == v && this.a.c(c0.a()) == 0) {
                    return new Float(this.b(f));
                }
                t t0 = new t();  // initializer: Ljava/lang/Object;-><init>()V
                t0.X = f;
                t t1 = new t();  // initializer: Ljava/lang/Object;-><init>()V
                try {
                    this.g(new Integer(v));
                    l l0 = v.c.b(0.0f, f);
                    g0.b0 = this;
                    g0.c0 = t0;
                    g0.f0 = 1;
                    if(b0.d(l0, this.b, new aa.d(t1, r00, t0, this, z && Math.abs(v - c0.a()) >= 2, v), g0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    i0 = this;
                    i0.g(null);
                    throw throwable0;
                }
                i0 = this;
                t2 = t0;
                break;
            }
            case 1: {
                try {
                    t2 = g0.c0;
                    i0 = g0.b0;
                    W5.f.b0(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                i0.g(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i0.g(null);
        return new Float(t2.X);
    }

    public final boolean e(v.j j0, c c0, int v, Function1 function10) {
        int v1;
        float f = ((Number)j0.b()).floatValue();
        b b0 = this.a;
        if(Float.compare(f, 0.0f) <= 0 || c0.a() < v) {
            v1 = f >= 0.0f || c0.a() > v - 1 ? 0 : b0.c(c0.a() + 1);
        }
        else {
            v1 = b0.c(c0.a());
        }
        if(v1 != 0) {
            function10.n(((float)v1));
            return true;
        }
        return false;
    }

    public final Object f(w0 w00, c c0, int v, float f, Fb.c c1) {
        i i2;
        i i1;
        i i0;
        t t2;
        h h0;
        if(c1 instanceof h) {
            h0 = (h)c1;
            int v1 = h0.f0;
            if((v1 & 0x80000000) == 0) {
                h0 = new h(this, c1);
            }
            else {
                h0.f0 = v1 ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, c1);
        }
        Object object0 = h0.d0;
        Object object1 = Eb.a.X;
        switch(h0.f0) {
            case 0: {
                W5.f.b0(object0);
                t t0 = new t();  // initializer: Ljava/lang/Object;-><init>()V
                t0.X = (v <= c0.a() || f <= 0.0f) && (v > c0.a() || f >= 0.0f) ? 0.0f : f;
                t t1 = new t();  // initializer: Ljava/lang/Object;-><init>()V
                try {
                    this.g(new Integer(v));
                    l l0 = v.c.b(t1.X, t0.X);
                    Float float0 = new Float(((float)this.a.c(v)));
                    e e0 = new e(t1, w00, t0, this, v);
                    h0.b0 = this;
                    h0.c0 = t0;
                    h0.f0 = 1;
                    t2 = t0;
                    if(b0.e(l0, float0, this.c, false, e0, h0, 4) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    i0 = this;
                    i0.g(null);
                    throw throwable0;
                }
                i1 = this;
                break;
            }
            case 1: {
                try {
                    t2 = h0.c0;
                    i2 = h0.b0;
                    W5.f.b0(object0);
                    i1 = i2;
                    break;
                }
                catch(Throwable throwable0) {
                    i0 = i2;
                }
                i0.g(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i1.g(null);
        return new Float(t2.X);
    }

    public final void g(Integer integer0) {
        this.f.setValue(integer0);
    }
}

