package s;

import Nb.j;
import java.util.ConcurrentModificationException;
import t.a;

public abstract class p {
    public static final Object a;
    public static final Object[] b;
    public static final Object c;

    static {
        p.a = new Object();
        p.b = new Object[0];
        p.c = new Object();
    }

    public static final void a(f f0, int v) {
        j.f(f0, "<this>");
        f0.X = new int[v];
        f0.Y = new Object[v];
    }

    public static final int b(f f0, Object object0, int v) {
        int v2;
        j.f(f0, "<this>");
        int v1 = f0.Z;
        if(v1 == 0) {
            return -1;
        }
        try {
            v2 = a.a(f0.Z, v, f0.X);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new ConcurrentModificationException();
        }
        if(v2 < 0) {
            return v2;
        }
        if(j.a(object0, f0.Y[v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && f0.X[v3] == v; ++v3) {
            if(j.a(object0, f0.Y[v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && f0.X[v4] == v; --v4) {
            if(j.a(object0, f0.Y[v4])) {
                return v4;
            }
        }
        return ~v3;
    }
}

