package t3;

import A3.b;
import java.util.List;
import r3.j;
import u3.a;
import u3.e;
import u3.f;
import z3.k;

public final class p implements c, a {
    public final j a;
    public final e b;
    public k c;

    public p(j j0, b b0, z3.j j1) {
        this.a = j0;
        j1.getClass();
        f f0 = j1.a.r();
        this.b = f0;
        b0.d(f0);
        f0.a(this);
    }

    @Override  // u3.a
    public final void b() {
        this.a.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
    }

    public static int d(int v, int v1) {
        int v2 = v / v1;
        if((v ^ v1) < 0 && v2 * v1 != v) {
            --v2;
        }
        return v - v2 * v1;
    }
}

