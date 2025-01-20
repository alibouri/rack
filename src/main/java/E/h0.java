package E;

import L.g;
import M.g0;
import M.i0;
import M.j0;
import M.k;
import M.r;
import M.x;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.ui.layout.LayoutCoordinates;
import j6.V;
import j6.a1;
import j6.d0;
import j6.d1;
import j6.r1;
import j6.s;
import m0.b;
import s.A;

public final class h0 implements k {
    public long X;
    public long Y;
    public final Object Z;
    public final Object b0;

    public h0() {
        this.Z = new A(6);
        this.b0 = new A(6);
    }

    public h0(g g0, g0 g00, long v) {
        this.Z = g0;
        this.b0 = g00;
        this.Y = v;
        this.X = 0L;
    }

    public h0(a1 a10) {
        this.b0 = a10;
        this.Z = new d1(this, ((d0)a10.Y), 0);
        ((d0)a10.Y).l0.getClass();
        long v = SystemClock.elapsedRealtime();
        this.X = v;
        this.Y = v;
    }

    public static final long a(h0 h00, long v, long v1) {
        h00.getClass();
        return v1 == 0L ? v : v / 4L + v1 / 4L * 3L;
    }

    public boolean b(long v, boolean z, boolean z1) {
        a1 a10 = (a1)this.b0;
        a10.q();
        a10.u();
        d0 d00 = (d0)a10.Y;
        if(d00.i()) {
            V v1 = a10.o();
            d00.l0.getClass();
            v1.p0.b(System.currentTimeMillis());
        }
        long v2 = v - this.X;
        if(!z && v2 < 1000L) {
            a10.b().m0.b(v2, "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if(!z1) {
            v2 = v - this.Y;
            this.Y = v;
        }
        a10.b().m0.b(v2, "Recording user engagement, ms");
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_et", v2);
        boolean z2 = d00.e0.D();
        r1.R(a10.s().x(!z2), bundle0, true);
        if(!z1) {
            a10.r().U("auto", "_e", bundle0);
        }
        this.X = v;
        ((d1)this.Z).a();
        long v3 = (long)(((Long)s.d0.a(null)));
        ((d1)this.Z).b(v3);
        return true;
    }

    @Override  // M.k
    public void g() {
        x x0 = ((i0)(((g0)this.b0))).h;
        if(x0 != null) {
            x0.invoke();
        }
    }

    @Override  // M.k
    public boolean l(long v, r r0) {
        Object object0 = ((g)this.Z).invoke();
        if(((LayoutCoordinates)object0) != null) {
            if(!((LayoutCoordinates)object0).r()) {
                return false;
            }
            g0 g00 = (g0)this.b0;
            if(!j0.a(g00, this.Y)) {
                return false;
            }
            if(((i0)g00).b(((LayoutCoordinates)object0), v, this.X, r0, false)) {
                this.X = v;
            }
        }
        return true;
    }

    @Override  // M.k
    public boolean p(long v, r r0) {
        LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)((g)this.Z).invoke();
        if(layoutCoordinates0 == null || !layoutCoordinates0.r()) {
            return false;
        }
        i0 i00 = (i0)(((g0)this.b0));
        M.V v1 = i00.f;
        if(v1 != null) {
            v1.r(Boolean.FALSE, layoutCoordinates0, new b(v), r0);
        }
        this.X = v;
        return j0.a(i00, this.Y);
    }
}

