package v;

import I.O;
import U.Z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public abstract class c {
    public static final m a;
    public static final n b;
    public static final o c;
    public static final p d;
    public static final m e;
    public static final n f;
    public static final o g;
    public static final p h;

    static {
        c.a = new m(Infinityf);
        c.b = new n(Infinityf, Infinityf);
        c.c = new o(Infinityf, Infinityf, Infinityf);
        c.d = new p(Infinityf, Infinityf, Infinityf, Infinityf);
        c.e = new m(-Infinityf);
        c.f = new n(-Infinityf, -Infinityf);
        c.g = new o(-Infinityf, -Infinityf, -Infinityf);
        c.h = new p(-Infinityf, -Infinityf, -Infinityf, -Infinityf);
    }

    public static b a(float f) {
        return new b(f, p0.a, 0.01f, 8);
    }

    public static l b(float f, float f1) {
        m m0 = new m(f1);
        return new l(p0.a, f, m0, 0x8000000000000000L, 0x8000000000000000L, false);
    }

    public static final H c(K k0, float f, G g0, String s, U.p p0, int v, int v1) {
        if((v1 & 8) != 0) {
            s = "FloatAnimation";
        }
        return c.d(k0, 0.0f, f, p0.a, g0, s, p0, v & 0x3FE | 0x8000 | v << 3 & 0x70000, 0);
    }

    public static final H d(K k0, Number number0, Number number1, o0 o00, G g0, String s, U.p p0, int v, int v1) {
        Object object0 = p0.G();
        Z z0 = U.l.a;
        if(object0 == z0) {
            object0 = new H(k0, number0, number1, o00, g0);
            p0.a0(object0);
        }
        int v2 = 1;
        int v3 = ((v & 0x70 ^ 0x30) <= 0x20 || !p0.h(number0)) && (v & 0x30) != 0x20 ? 0 : 1;
        int v4 = ((v & 0x380 ^ 0x180) <= 0x100 || !p0.h(number1)) && (v & 0x180) != 0x100 ? 0 : 1;
        if(((0xE000 & v ^ 0x6000) <= 0x4000 || !p0.h(g0)) && (v & 0x6000) != 0x4000) {
            v2 = 0;
        }
        Object object1 = p0.G();
        if((v3 | v4 | v2) != 0 || object1 == z0) {
            object1 = new O(number0, ((H)object0), number1, g0, 4);
            p0.a0(object1);
        }
        U.H.g(((Function0)object1), p0);
        boolean z1 = p0.h(k0);
        Object object2 = p0.G();
        if(z1 || object2 == z0) {
            object2 = new T0.G(k0, 23, ((H)object0));
            p0.a0(object2);
        }
        U.H.b(((H)object0), ((Function1)object2), p0);
        return (H)object0;
    }

    public static final float e(w w0, float f, float f1) {
        C c0 = w0.a;
        m m0 = new m(0.0f);
        int v = m0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            m0.e(v1, c0.d((v1 == 0 ? f : 0.0f), (v1 == 0 ? f1 : 0.0f)));
        }
        return m0.a;
    }

    public static final q f(q q0) {
        q q1 = q0.c();
        int v = q1.b();
        for(int v1 = 0; v1 < v; ++v1) {
            q1.e(v1, q0.a(v1));
        }
        return q1;
    }

    public static G g(x x0, int v, int v1) {
        if((v1 & 2) != 0) {
            v = 1;
        }
        return new G(x0, v, 0L);
    }

    public static final K h(String s, U.p p0, int v) {
        Object object0 = p0.G();
        if(object0 == U.l.a) {
            object0 = new K();
            p0.a0(object0);
        }
        ((K)object0).a(0, p0);
        return (K)object0;
    }

    public static U i(float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 1500.0f;
        }
        if((v & 4) != 0) {
            object0 = null;
        }
        return new U(1.0f, f, object0);
    }

    public static n0 j(int v, int v1, y y0, int v2) {
        if((v2 & 1) != 0) {
            v = 300;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            y0 = z.a;
        }
        return new n0(v, v1, y0);
    }
}

