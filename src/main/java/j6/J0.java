package j6;

import N5.r;
import S5.b;
import com.google.android.gms.measurement.internal.zzo;

public final class j0 implements Runnable {
    public final int X;
    public h0 Y;
    public zzo Z;

    public j0(int v) {
        this.X = v;
        super();
    }

    public j0(h0 h00, zzo zzo0, int v) {
        this.X = v;
        this.Z = zzo0;
        this.Y = h00;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                k1 k10 = this.Y.d;
                k10.d0();
                k10.X(this.Z);
                return;
            }
            case 1: {
                k1 k11 = this.Y.d;
                k11.d0();
                k11.W(this.Z);
                return;
            }
            case 2: {
                h0 h01 = this.Y;
                h01.d.d0();
                h01.d.R(this.Z);
                return;
            }
            case 3: {
                h0 h02 = this.Y;
                h02.d.d0();
                h02.d.c().q();
                h02.d.e0();
                zzo zzo0 = this.Z;
                r.f(zzo0.X);
                h02.d.h(zzo0);
                return;
            }
            case 4: {
                int v = 0;
                h0 h03 = this.Y;
                h03.d.d0();
                k1 k12 = h03.d;
                k12.c().q();
                k12.e0();
                zzo zzo1 = this.Z;
                r.j(zzo1);
                String s = zzo1.X;
                r.f(s);
                if(k12.S().B(null, s.c1)) {
                    if(k12.S().B(null, s.k0)) {
                        ((b)k12.f()).getClass();
                        long v1 = System.currentTimeMillis();
                        int v2 = k12.S().v(null, s.V);
                        k12.S();
                        long v3 = (long)(((Long)s.e.a(null)));
                        while(v < v2 && k12.B(v1 - v3, null)) {
                            ++v;
                        }
                    }
                    else {
                        k12.S();
                        long v4 = (long)(((int)(((Integer)s.l.a(null)))));
                        while(((long)v) < v4 && k12.B(0L, s)) {
                            ++v;
                        }
                    }
                    if(k12.S().B(null, s.l0)) {
                        k12.F();
                    }
                }
                return;
            }
            case 5: {
                h0 h04 = this.Y;
                h04.d.d0();
                h04.d.c().q();
                h04.d.e0();
                zzo zzo2 = this.Z;
                r.f(zzo2.X);
                h04.d.X(zzo2);
                h04.d.W(zzo2);
                return;
            }
            default: {
                h0 h00 = this.Y;
                h00.d.d0();
                h00.d.T(this.Z);
            }
        }
    }
}

