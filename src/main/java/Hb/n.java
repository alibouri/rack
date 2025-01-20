package hb;

import io.sentry.M;
import io.sentry.i1;
import java.util.Map;

public final class n {
    public final int a;
    public static boolean b;

    static {
    }

    public n(int v) {
    }

    public static void a(String s, a a0, Map map0, i1 i10, String s1, int v) {
    }

    public static void b(Throwable throwable0, i1 i10, Map map0, int v) {
    }

    public static final void c(i1 i10, String s, Map map0, boolean z) {
    }

    public static void d(String s, i1 i10, Map map0, boolean z, int v) {
        if((v & 2) != 0) {
            i10 = i1.ERROR;
        }
        if((v & 4) != 0) {
            map0 = null;
        }
        if((v & 8) != 0) {
            z = false;
        }
        n.c(i10, s, map0, z);
    }

    public u e(String s) {
    }

    public static void f(M m0) {
    }
}

