package c0;

import Nb.j;
import U.l0;
import U.l;
import U.p;

public abstract class c {
    public static final Object a;
    public static final g b;

    static {
        c.a = new Object();
        c.b = new g(0, new long[0], new Object[0]);
    }

    public static final int a(int v, int v1) {
        return v << v1 % 10 * 3 + 1;
    }

    public static final b b(int v, Ab.c c0, p p0) {
        b b0;
        p0.O(Integer.rotateLeft(v, 1), c.a);
        Object object0 = p0.G();
        if(object0 == l.a) {
            b0 = new b(v, c0, true);
            p0.a0(b0);
        }
        else {
            j.d(object0, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            b0 = (b)object0;
            b0.m(c0);
        }
        p0.p(false);
        return b0;
    }

    public static final b c(int v, Ab.c c0, p p0) {
        Object object0 = p0.G();
        if(object0 == l.a) {
            object0 = new b(v, c0, true);
            p0.a0(object0);
        }
        ((b)object0).m(c0);
        return (b)object0;
    }

    // Deobfuscation rating: LOW(40)
    public static final boolean d(l0 l00, l0 l01) {
        return l00 == null || l00 instanceof l0 && (!l00.b() || l00.equals(l01) || j.a(l00.c, l01.c));
    }
}

