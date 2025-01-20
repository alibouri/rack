package ia;

import Ab.t;
import B.e;
import B.r;
import B.y0;
import C.c;
import D0.K;
import F0.k;
import J2.w;
import N.b1;
import N.m2;
import Nb.j;
import O0.O;
import R2.f;
import U.g0;
import U.p;
import Z0.i;
import androidx.compose.ui.Modifier;
import db.a;
import db.b;
import g0.l;
import ha.l0;
import kotlin.jvm.functions.Function3;
import n0.M;
import yc.d;

public final class h implements Function3 {
    public final int X;
    public static final h Y;
    public static final h Z;
    public static final h b0;
    public static final h c0;
    public static final h d0;

    static {
        h.Y = new h(0);
        h.Z = new h(1);
        h.b0 = new h(2);
        h.c0 = new h(3);
        h.d0 = new h(4);
    }

    public h(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((c)object0), "$this$item");
                if((v1 & 6) == 0) {
                    v1 |= (((p)object1).f(((c)object0)) ? 4 : 2);
                }
                if((v1 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                String s = w.S(0x7F120324, ((p)object1));  // string:personal_history_no_recent_tx "You have no recent transactions"
                O o0 = ((a)((p)object1).k(b.d)).m;
                m2.b(s, androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(((c)object0).a(androidx.compose.foundation.layout.c.d(l.X, 1.0f), l0.a), 16.0f, 0.0f, 2), 0.0f, 32.0f, 0.0f, 16.0f, 5), 0L, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, o0, ((p)object1), 0, 0, 0xFDFC);
                return t.a;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                j.f(((c)object0), "$this$item");
                if((v2 & 6) == 0) {
                    v2 |= (((p)object1).f(((c)object0)) ? 4 : 2);
                }
                if((v2 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                e.b(((p)object1), ((c)object0).a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.e(l.X, 8.0f), 1.0f), d.h(0x7F06018F, ((p)object1)), M.a), l0.a));  // color:white
                return t.a;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                j.f(((c)object0), "$this$item");
                if((v3 & 6) == 0) {
                    v3 |= (((p)object1).f(((c)object0)) ? 4 : 2);
                }
                if((v3 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                l l0 = l.X;
                Modifier modifier0 = ((c)object0).a(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.b(l0, d.h(0x7F06018F, ((p)object1)), M.a), 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), l0.a);  // color:white
                K k0 = r.e(g0.b.a, false);
                int v4 = ((p)object1).P;
                g0 g00 = ((p)object1).m();
                Modifier modifier1 = g0.a.d(((p)object1), modifier0);
                k.a.getClass();
                F0.i i0 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                U.d.K(((p)object1), k0, F0.j.f);
                U.d.K(((p)object1), g00, F0.j.e);
                F0.h h0 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v4)) {
                    m5.b.F(v4, ((p)object1), v4, h0);
                }
                U.d.K(((p)object1), modifier1, F0.j.d);
                long v5 = d.h(0x7F06003E, ((p)object1));  // color:Violet600
                b1.b(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.b.a.a(l0, g0.b.e), 48.0f), 4.0f), v5, 0.0f, 0L, 0, ((p)object1), 0, 28);
                ((p)object1).p(true);
                return t.a;
            }
            case 3: {
                int v6 = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$SwipeToDismissBox");
                if((v6 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                f.m(androidx.compose.foundation.layout.c.c(l.X, 1.0f), d.h(0x7F060016, ((p)object1)), d.h(0x7F06018F, ((p)object1)), ((p)object1), 6, 0);  // color:Gray400
                return t.a;
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$WaveButton");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                M6.b.e(M6.b.W(0x7F080285, ((p)object1)), null, null, null, null, ((p)object1), 0x30, 0x7C);  // drawable:ic_search_history_button
                e.b(((p)object1), androidx.compose.foundation.layout.c.n(l.X, 4.0f));
                m2.b(w.S(0x7F120327, ((p)object1)), null, d.h(0x7F060023, ((p)object1)), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object1), 0, 0, 0x1FFFA);  // string:personal_history_search "Search"
                return t.a;
            }
        }
    }
}

