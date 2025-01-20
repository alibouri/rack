package Fa;

import Ab.t;
import B.k;
import B.r;
import B.v0;
import B.x0;
import B.y0;
import B.y;
import B.z0;
import D0.K;
import F0.h;
import F0.i;
import J2.w;
import M6.b;
import N.M0;
import N.m2;
import Nb.j;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class l implements Function3 {
    public final int X;
    public final int Y;
    public final Object Z;

    public l(int v, int v1, Object object0) {
        this.X = v1;
        this.Y = v;
        this.Z = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((y)object0), "$this$Card");
                if((v1 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                b.d(yc.l.y(this.Y, ((p)object1), 0), null, c.c(g0.l.X, 1.0f), null, null, 0.0f, null, ((p)object1), 0x1B0, 120);
                ((Function2)this.Z).j(((p)object1), 0);
                return t.a;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$WaveSecondaryButton");
                if((v2 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g0.l l0 = g0.l.X;
                Modifier modifier0 = c.d(l0, 1.0f);
                x0 x00 = v0.b(k.e, g0.b.j, ((p)object1), 6);
                int v3 = ((p)object1).P;
                g0 g00 = ((p)object1).m();
                Modifier modifier1 = a.d(((p)object1), modifier0);
                F0.k.a.getClass();
                i i0 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                h h0 = F0.j.f;
                d.K(((p)object1), x00, h0);
                h h1 = F0.j.e;
                d.K(((p)object1), g00, h1);
                h h2 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v3)) {
                    m5.b.F(v3, ((p)object1), v3, h2);
                }
                h h3 = F0.j.d;
                d.K(((p)object1), modifier1, h3);
                z0 z00 = z0.a;
                Modifier modifier2 = c.d(z00.a(l0, 1.0f, true), 1.0f);
                K k0 = r.e(g0.b.e, false);
                int v4 = ((p)object1).P;
                g0 g01 = ((p)object1).m();
                Modifier modifier3 = a.d(((p)object1), modifier2);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), k0, h0);
                d.K(((p)object1), g01, h1);
                if(((p)object1).O || !j.a(((p)object1).G(), v4)) {
                    m5.b.F(v4, ((p)object1), v4, h2);
                }
                d.K(((p)object1), modifier3, h3);
                ((c0.b)this.Z).h(androidx.compose.foundation.layout.b.a, ((p)object1), 6);
                ((p)object1).p(true);
                m2.b(w.S(this.Y, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)((p)object1).k(db.b.d)).k, ((p)object1), 0, 0, 0xFFFE);
                r.a(c.d(z00.a(l0, 1.0f, true), 1.0f), ((p)object1), 0);
                ((p)object1).p(true);
                return t.a;
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$Button");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                M0.a(yc.l.y(this.Y, ((p)object1), 0), ((String)this.Z), null, 0L, ((p)object1), 0, 12);
                return t.a;
            }
        }
    }
}

