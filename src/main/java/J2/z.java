package J2;

import I2.A;
import Ma.m;
import R2.p;
import R2.u;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.Callable;
import x2.g;

public final class z implements Callable {
    public final int a;
    public final I b;

    public z(I i0, int v) {
        this.a = v;
        this.b = i0;
        super();
    }

    @Override
    public final Object call() {
        if(this.a != 0) {
            u u0 = this.b.i;
            String s = this.b.c;
            if(u0.i(s) == 1) {
                u0.p(2, s);
                ((WorkDatabase_Impl)u0.a).b();
                g g0 = ((m)u0.j).a();
                g0.c(1, s);
                try {
                    ((WorkDatabase_Impl)u0.a).c();
                    try {
                        g0.b();
                        ((WorkDatabase_Impl)u0.a).q();
                    }
                    finally {
                        ((WorkDatabase_Impl)u0.a).k();
                    }
                }
                finally {
                    ((m)u0.j).c(g0);
                }
                u0.q(0xFFFFFF00, s);
                return Boolean.valueOf(true);
            }
            return Boolean.valueOf(false);
        }
        I i0 = this.b;
        p p0 = i0.a;
        String s1 = p0.c;
        if(p0.b != 1) {
            A.e().a(J.a, s1 + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if(p0.d() || p0.b == 1 && p0.k > 0) {
            i0.f.getClass();
            if(System.currentTimeMillis() < p0.a()) {
                A.e().a(J.a, "Delaying execution for " + s1 + " because it is being executed before schedule.");
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}

