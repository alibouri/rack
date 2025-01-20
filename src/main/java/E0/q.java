package e0;

import B.L0;
import Bb.p;
import E7.w;
import U.d;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s.E;

public abstract class q {
    public static final Object a;

    static {
        q.a = new Object();
    }

    public static final void a(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index (" + v + ") is out of bound of [0, " + v1 + ')');
        }
    }

    public static final int b(int[] arr_v, int v) {
        int v1 = arr_v.length - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = arr_v[v3];
            if(v > v4) {
                v2 = v3 + 1;
                continue;
            }
            if(v < v4) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    public static g c() {
        return (g)m.a.p();
    }

    public static g d(g g0) {
        if(g0 instanceof x && ((x)g0).t == d.s()) {
            ((x)g0).r = null;
            return g0;
        }
        if(g0 instanceof y && ((y)g0).h == d.s()) {
            ((y)g0).g = null;
            return g0;
        }
        g0 = m.h(g0, null, false);
        g0.j();
        return g0;
    }

    public static Object e(Function0 function00, Function1 function10) {
        g g1;
        if(function10 == null) {
            return function00.invoke();
        }
        g g0 = (g)m.a.p();
        if(g0 instanceof x && ((x)g0).t == d.s()) {
            Function1 function11 = ((x)g0).r;
            Function1 function12 = ((x)g0).s;
            try {
                ((x)g0).r = m.l(function10, function11, true);
                ((x)g0).s = m.b(null, function12);
                return function00.invoke();
            }
            finally {
                ((x)g0).r = function11;
                ((x)g0).s = function12;
            }
        }
        if(g0 == null || g0 instanceof c) {
            g1 = new x((g0 instanceof c ? ((c)g0) : null), function10, null, true, false);
        }
        else {
            if(function10 == null) {
                return function00.invoke();
            }
            g1 = g0.t(function10);
        }
        try {
            g g2 = g1.j();
            try {
                return function00.invoke();
            }
            finally {
                g.p(g2);
            }
        }
        finally {
            g1.c();
        }
    }

    public static w f(L0 l00) {
        m.f(l.Z);
        synchronized(m.b) {
            m.g = p.G0(((Collection)m.g), l00);
        }
        return new w(l00);
    }

    public static void g(g g0, g g1, Function1 function10) {
        if(g0 == g1) {
            if(g0 instanceof x) {
                ((x)g0).r = function10;
                return;
            }
            if(!(g0 instanceof y)) {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + g0).toString());
            }
            ((y)g0).g = function10;
            return;
        }
        g1.getClass();
        g.p(g0);
        g1.c();
    }

    public static void h() {
        synchronized(m.b) {
            E e0 = ((b)m.i.get()).h;
        }
        if(e0 != null && e0.h()) {
            m.a();
        }
    }

    public static final void i() {
        throw new UnsupportedOperationException();
    }
}

