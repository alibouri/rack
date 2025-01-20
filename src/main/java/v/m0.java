package v;

import R2.k;
import T0.G;
import U.H;
import U.Z;
import U.l;
import U.p;
import W4.f;
import kotlin.jvm.functions.Function1;
import u.s;

public abstract class m0 {
    public static final int a;

    static {
        f.z(l0.X);
    }

    public static final e0 a(k0 k00, o0 o00, String s, p p0, int v, int v1) {
        if((v1 & 2) != 0) {
            s = "DeferredAnimation";
        }
        int v2 = v & 14 ^ 6;
        boolean z = true;
        boolean z1 = v2 <= 4 && p0.f(k00) || (v & 6) == 4;
        Object object0 = p0.G();
        Z z2 = l.a;
        if(z1 || object0 == z2) {
            object0 = new e0(k00, o00, s);
            p0.a0(object0);
        }
        if((v2 <= 4 || !p0.f(k00)) && (v & 6) != 4) {
            z = false;
        }
        boolean z3 = p0.h(((e0)object0));
        Object object1 = p0.G();
        if((z3 | z) != 0 || object1 == z2) {
            object1 = new G(k00, 26, ((e0)object0));
            p0.a0(object1);
        }
        H.b(((e0)object0), ((Function1)object1), p0);
        if(k00.g()) {
            d0 d00 = (d0)((e0)object0).b.getValue();
            if(d00 != null) {
                Object object2 = ((Function1)d00.Z).n(((e0)object0).c.f().b());
                Object object3 = ((Function1)d00.Z).n(((e0)object0).c.f().c());
                A a0 = (A)((Function1)d00.Y).n(((e0)object0).c.f());
                d00.X.e(object2, object3, a0);
            }
        }
        return (e0)object0;
    }

    public static final h0 b(k0 k00, Object object0, Object object1, A a0, o0 o00, p p0, int v) {
        boolean z = p0.f(k00);
        Object object2 = p0.G();
        Z z1 = l.a;
        if(z || object2 == z1) {
            q q0 = (q)o00.a.n(object1);
            q0.d();
            object2 = new h0(k00, object0, q0, o00);
            p0.a0(object2);
        }
        if(k00.g()) {
            ((h0)object2).e(object0, object1, a0);
        }
        else {
            ((h0)object2).g(object1, a0);
        }
        boolean z2 = p0.f(k00);
        boolean z3 = p0.f(((h0)object2));
        Object object3 = p0.G();
        if((z2 | z3) != 0 || object3 == z1) {
            object3 = new G(k00, 27, ((h0)object2));
            p0.a0(object3);
        }
        H.b(((h0)object2), ((Function1)object3), p0);
        return (h0)object2;
    }

    public static final k0 c(Object object0, String s, p p0, int v, int v1) {
        if((v1 & 2) != 0) {
            s = null;
        }
        Object object1 = p0.G();
        Z z0 = l.a;
        if(object1 == z0) {
            object1 = new k0(new k(object0), null, s);
            p0.a0(object1);
        }
        ((k0)object1).a(object0, p0, v & 8 | 0x30 | v & 14);
        Object object2 = p0.G();
        if(object2 == z0) {
            object2 = new s(((k0)object1), 1);
            p0.a0(object2);
        }
        H.b(((k0)object1), ((Function1)object2), p0);
        return (k0)object1;
    }
}

