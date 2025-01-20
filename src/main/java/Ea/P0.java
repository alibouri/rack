package Ea;

import Ab.t;
import B.B;
import B.C;
import B.h;
import B.z;
import F0.i;
import F0.j;
import F0.k;
import G0.r0;
import N.T;
import N.m2;
import R2.f;
import U.g0;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import c0.c;
import db.a;
import g0.l;
import kotlin.jvm.functions.Function2;
import yc.d;

public final class p0 implements Function2 {
    public final int X;
    public final b Y;

    public p0(b b0, int v) {
        this.X = v;
        this.Y = b0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Object object2 = t.a;
        b b0 = this.Y;
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                b0.j(((p)object0), 0);
                return object2;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                m2.a(((a)((p)object0).k(db.b.d)).h, b0, ((p)object0), 0);
                return object2;
            }
            case 2: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                m2.a(((a)((p)object0).k(db.b.d)).h, b0, ((p)object0), 0);
                return object2;
            }
            case 3: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                if(((Boolean)((p)object0).k(r0.a)).booleanValue()) {
                    ((p)object0).Q(0x5C1EFA5E);
                    Z6.b.d(T.c(0xFFE, d.h(0x7F060042, ((p)object0))), null, null, c.c(0xDEED8B0C, new p0(b0, 1), ((p)object0)), ((p)object0), 0xC00, 6);  // color:WaveBlue
                    ((p)object0).p(false);
                    return object2;
                }
                ((p)object0).Q(0x5C266FA7);
                f.b(null, false, false, null, c.c(0x210758, new p0(b0, 2), ((p)object0)), ((p)object0), 0x6000);
                ((p)object0).p(false);
                return object2;
            }
            default: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier0 = androidx.compose.foundation.layout.a.j(l.X, 16.0f);
                B b1 = z.a(new h(16.0f), g0.b.n, ((p)object0), 54);
                int v = ((p)object0).P;
                g0 g00 = ((p)object0).m();
                Modifier modifier1 = g0.a.d(((p)object0), modifier0);
                k.a.getClass();
                i i0 = j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i0);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b1, j.f);
                U.d.K(((p)object0), g00, j.e);
                F0.h h0 = j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v)) {
                    m5.b.F(v, ((p)object0), v, h0);
                }
                U.d.K(((p)object0), modifier1, j.d);
                b0.h(C.a, ((p)object0), 6);
                ((p)object0).p(true);
                return object2;
            }
        }
    }
}

