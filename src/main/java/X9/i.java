package X9;

import Aa.D;
import Aa.J;
import B.e;
import C.E;
import C.H;
import Ea.F0;
import Ea.l0;
import U.N0;
import U.Z;
import U.d;
import U.l;
import U.p;
import aa.b;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.compose.LifecycleEffectKt;
import c0.c;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import u.P;
import v.U;
import v.w;

public abstract class i {
    public static final J a;

    static {
        i.a = new J(5);
    }

    public static final void a(j j0, C3.i i0, Modifier modifier0, p p0, int v) {
        Nb.j.f(j0, "state");
        Nb.j.f(i0, "callbacks");
        p0.S(-735605026);
        int v1 = (v & 6) == 0 ? (p0.f(j0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            E e0 = H.a(0, p0, 0, 3);
            J j1 = i.a;
            Nb.j.f(e0, "lazyListState");
            p0.Q(0x239A4BB7);
            p0.Q(0x70DA44E4);
            boolean z = p0.f(e0);
            Object object0 = p0.G();
            Z z1 = l.a;
            if(z || object0 == z1) {
                object0 = new b(e0, j1);
                p0.a0(object0);
            }
            p0.p(false);
            p0.p(false);
            p0.Q(0x90D2D6BA);
            Object object1 = p0.G();
            if(object1 == z1) {
                object1 = new l0(1);
                p0.a0(object1);
            }
            p0.p(false);
            Nb.j.f(((b)object0), "layoutInfo");
            Nb.j.f(((Function3)object1), "snapIndex");
            p0.Q(0x89BF1817);
            w w0 = P.a(p0);
            U u0 = aa.j.a;
            p0.Q(0x2FCD87F9);
            boolean z2 = p0.f(((b)object0));
            boolean z3 = p0.f(w0);
            boolean z4 = p0.f(u0);
            Object object2 = p0.G();
            if((z2 | z3 | z4) != 0 || object2 == z1) {
                object2 = new aa.i(((b)object0), w0, u0, ((Function3)object1));
                p0.a0(object2);
            }
            p0.p(false);
            p0.p(false);
            p0.Q(0x90D2E94C);
            Object object3 = p0.G();
            if(object3 == z1) {
                object3 = d.w(new f(((b)object0), 0));
                p0.a0(object3);
            }
            p0.p(false);
            p0.Q(0x90D2F524);
            List list0 = j0.a;
            if(list0.size() > 0) {
                Integer integer0 = (Integer)((N0)object3).getValue();
                p0.Q(0x90D2FF59);
                int v2 = 1;
                int v3 = (v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && p0.h(i0) ? 1 : 0;
                Object object4 = p0.G();
                if((((v1 & 14) == 4 ? 1 : 0) | v3) != 0 || object4 == z1) {
                    object4 = new g(j0, i0, ((N0)object3), null);
                    p0.a0(object4);
                }
                p0.p(false);
                U.H.e(integer0, list0, ((Function2)object4), p0);
                Event lifecycle$Event0 = Event.ON_RESUME;
                p0.Q(0x90D33416);
                if((v1 & 0x70) != 0x20 && ((v1 & 0x40) == 0 || !p0.h(i0))) {
                    v2 = 0;
                }
                Object object5 = p0.G();
                if((((v1 & 14) == 4 ? 1 : 0) | v2) != 0 || object5 == z1) {
                    object5 = new F0(j0, i0, ((N0)object3), 3);
                    p0.a0(object5);
                }
                p0.p(false);
                LifecycleEffectKt.a(lifecycle$Event0, null, ((Function0)object5), p0, 6);
            }
            p0.p(false);
            e.a(modifier0, null, false, c.c(1920373704, new Ba.j(e0, ((aa.i)object2), j0, i0, 3), p0), p0, v1 >> 6 & 14 | 0xC00, 6);
        }
        else {
            p0.K();
        }
        U.l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(j0, i0, modifier0, v, 12);
        }
    }
}

