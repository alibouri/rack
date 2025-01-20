package j6;

import E.h0;
import I3.e;

public final class c1 implements Runnable {
    public final int X;
    public final long Y;
    public final a1 Z;

    public c1(a1 a10, long v, int v1) {
        this.X = v1;
        this.Y = v;
        this.Z = a10;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            a1 a10 = this.Z;
            a10.q();
            a10.x();
            L l0 = a10.b();
            long v = this.Y;
            l0.m0.b(v, "Activity resumed, time");
            d0 d00 = (d0)a10.Y;
            boolean z = d00.e0.B(null, s.O0);
            d d0 = d00.e0;
            h0 h00 = a10.e0;
            if(!z) {
                if(d0.D() || a10.o().s0.b()) {
                    ((a1)h00.b0).q();
                    ((d1)h00.Z).a();
                    h00.X = v;
                    h00.Y = v;
                }
            }
            else if(d0.D() || a10.c0) {
                ((a1)h00.b0).q();
                ((d1)h00.Z).a();
                h00.X = v;
                h00.Y = v;
            }
            a1 a11 = (a1)a10.f0.Z;
            a11.q();
            e e0 = (e)a10.f0.Y;
            if(e0 != null) {
                a11.b0.removeCallbacks(e0);
            }
            a11.o().s0.a(false);
            a11.q();
            a11.c0 = false;
            if(((d0)a11.Y).e0.B(null, s.L0) && a11.r().l0) {
                a11.b().m0.d("Retrying trigger URI registration in foreground");
                a11.r().Q();
            }
            i.s s0 = a10.d0;
            ((a1)s0.X).q();
            a1 a12 = (a1)s0.X;
            if(((d0)a12.Y).i()) {
                ((d0)a12.Y).l0.getClass();
                s0.I(System.currentTimeMillis(), false);
            }
            return;
        }
        a1 a13 = this.Z;
        a13.q();
        a13.x();
        a13.b().m0.b(((long)this.Y), "Activity paused, time");
        a1 a14 = (a1)a13.f0.Z;
        ((d0)a14.Y).l0.getClass();
        e e1 = new e(a13.f0, System.currentTimeMillis(), this.Y, 1);
        a13.f0.Y = e1;
        a14.b0.postDelayed(e1, 2000L);
        if(((d0)a13.Y).e0.D()) {
            ((d1)a13.e0.Z).a();
        }
    }
}

