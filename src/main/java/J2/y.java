package J2;

import Ma.m;
import R2.p;
import R2.u;
import R2.w;
import Z6.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.List;
import java.util.Set;
import x2.g;

public final class y implements Runnable {
    public final WorkDatabase X;
    public final p Y;
    public final p Z;
    public final List b0;
    public final String c0;
    public final Set d0;
    public final boolean e0;

    public y(WorkDatabase workDatabase0, p p0, p p1, List list0, String s, Set set0, boolean z) {
        this.X = workDatabase0;
        this.Y = p0;
        this.Z = p1;
        this.b0 = list0;
        this.c0 = s;
        this.d0 = set0;
        this.e0 = z;
    }

    @Override
    public final void run() {
        u u0 = this.X.x();
        w w0 = this.X.y();
        WorkDatabase workDatabase0 = this.X;
        p p0 = this.Z;
        p p1 = p.b(this.Z, this.Y.b, null, null, this.Y.k, this.Y.n, this.Y.s, this.Y.t + 1, this.Y.u, this.Y.v, 0xC3DBFD);
        if(p0.v == 1) {
            p1.u = p0.u;
            ++p1.v;
        }
        p p2 = b.B(this.b0, p1);
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)u0.a;
        workDatabase_Impl0.b();
        workDatabase_Impl0.c();
        try {
            m m0 = (m)u0.c;
            g g0 = m0.a();
            try {
                m0.d(g0, p2);
                g0.b();
            }
            catch(Throwable throwable0) {
                m0.c(g0);
                throw throwable0;
            }
            m0.c(g0);
            workDatabase_Impl0.q();
        }
        finally {
            workDatabase_Impl0.k();
        }
        WorkDatabase_Impl workDatabase_Impl1 = (WorkDatabase_Impl)w0.Y;
        workDatabase_Impl1.b();
        m m1 = (m)w0.b0;
        g g1 = m1.a();
        String s = this.c0;
        g1.c(1, s);
        try {
            workDatabase_Impl1.c();
            try {
                g1.b();
                workDatabase_Impl1.q();
            }
            finally {
                workDatabase_Impl1.k();
            }
        }
        finally {
            m1.c(g1);
        }
        w0.w(s, this.d0);
        if(!this.e0) {
            u0.l(-1L, s);
            workDatabase0.w().c(s);
        }
    }
}

