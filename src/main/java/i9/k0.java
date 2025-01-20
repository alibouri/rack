package i9;

import Nb.j;
import R1.c;
import R1.g;
import android.view.View;
import android.widget.TextView;
import o9.R0;
import o9.Z0;
import q9.P0;
import q9.U0;

public final class k0 extends g {
    public final TextView q;
    public Z0 r;
    public long s;

    public k0(c c0, View view0, TextView textView0) {
        super(c0, view0, 0);
        this.q = textView0;
    }

    @Override  // R1.g
    public final void f() {
        long v;
        R0 r01;
        R0 r00;
        synchronized(this) {
            v = this.s;
            this.s = 0L;
        }
        Z0 z00 = this.r;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || z00 == null) {
            r00 = null;
            r01 = null;
        }
        else {
            r00 = z00.b;
            r01 = z00.a;
        }
        if(v1 != 0) {
            U0.e(this.q, r01);
            j.f(this.q, "<this>");
            P0 p00 = new P0(this.q, 1);
            U0.a(this.q, r00, p00);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.s = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(16 == v) {
            this.u(((Z0)object0));
            return true;
        }
        return false;
    }

    public final void u(Z0 z00) {
        this.r = z00;
        synchronized(this) {
            this.s |= 1L;
        }
        this.o();
    }
}

