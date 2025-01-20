package v1;

import A.k;
import Fb.a;
import U.p;
import a8.Q;
import java.util.Iterator;
import n0.v;
import y.s;
import z0.g;
import z0.x;

public abstract class r {
    public static Object a(x x0, a a0) {
        return x0.c(g.Y, a0);
    }

    public static void b(s s0, float f) {
        s0.a(f, 0.0f);
    }

    public static int c(int v, long v1, int v2) {
        return (v.i(v1) + v) * v2;
    }

    public static k d(p p0) {
        k k0 = new k();
        p0.a0(k0);
        return k0;
    }

    public static ClassCastException e(Iterator iterator0) {
        Object object0 = iterator0.next();
        object0.getClass();
        return new ClassCastException();
    }

    public static Object f(int v, p p0, boolean z) {
        p0.p(z);
        p0.Q(v);
        return p0.G();
    }

    public static void g(int v, int v1, int v2, int v3, int v4) {
    }

    public static void h(long v, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(v.j(v));
        stringBuilder0.append(s);
    }

    public static void i(Q q0, long v) {
        q0.o().l();
        q0.T(v);
    }
}

