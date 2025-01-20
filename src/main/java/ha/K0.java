package ha;

import Ab.t;
import B.q0;
import B.r0;
import B.r;
import Bb.q;
import C.E;
import C.H;
import D0.K;
import F0.h;
import F0.i;
import F0.k;
import G0.f0;
import I2.J;
import J2.w;
import Nb.j;
import P.g;
import P.n;
import R.J0;
import U.N0;
import U.Z;
import U.d;
import U.g0;
import U.p;
import U5.a;
import a9.x4;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.unit.Density;
import com.wave.accounts.AccountEvent.AccountAdded;
import com.wave.accounts.AccountEvent.AccountChangeAfterInvoluntaryLogout;
import com.wave.accounts.AccountEvent.AccountChangeAfterLogout;
import com.wave.accounts.AccountEvent.AccountSwitch;
import com.wave.accounts.AccountEvent;
import dc.e;
import g0.b;
import g0.l;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import q9.l1;
import v.f;

public final class k0 implements Function3 {
    public final n X;
    public final x4 Y;
    public final long Z;
    public final m0 b0;
    public final ha.n c0;
    public final e d0;
    public final long e0;
    public final J0 f0;

    public k0(n n0, x4 x40, long v, m0 m00, ha.n n1, e e0, long v1, J0 j00) {
        this.X = n0;
        this.Y = x40;
        this.Z = v;
        this.b0 = m00;
        this.c0 = n1;
        this.d0 = e0;
        this.e0 = v1;
        this.f0 = j00;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        ha.n n2;
        ha.n n1;
        Z z5;
        int v = ((Number)object2).intValue();
        j.f(((q0)object0), "it");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        l l0 = l.X;
        Modifier modifier0 = c.a(a.J(androidx.compose.foundation.layout.c.c(B.e.j(), 1.0f), this.X, true), "PersonalHomeScreen");
        K k0 = r.e(b.a, false);
        int v1 = ((p)object1).P;
        g0 g00 = ((p)object1).m();
        Modifier modifier1 = g0.a.d(((p)object1), modifier0);
        k.a.getClass();
        i i0 = F0.j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        d.K(((p)object1), k0, F0.j.f);
        d.K(((p)object1), g00, F0.j.e);
        h h0 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h0);
        }
        d.K(((p)object1), modifier1, F0.j.d);
        androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
        x4 x40 = this.Y;
        long v2 = this.Z;
        Y9.b b1 = x40 == null ? Y9.b.a : new Y9.c(v2, (x40.c == null ? v2 : x40.c.b));
        yc.d.c(b1, ((p)object1), 0);
        E e0 = H.a(0, ((p)object1), 0, 3);
        r0 r00 = androidx.compose.foundation.layout.a.b(0.0f, 0.0f, 8.0f, 7);
        ((p)object1).Q(0x53AC55B);
        m0 m00 = this.b0;
        boolean z = ((p)object1).f(m00);
        ha.n n0 = this.c0;
        boolean z1 = ((p)object1).h(n0);
        e e1 = this.d0;
        boolean z2 = ((p)object1).h(e1);
        boolean z3 = ((p)object1).f(e0);
        Object object3 = ((p)object1).G();
        Z z4 = U.l.a;
        if((z | z1 | z2 | z3) != 0 || object3 == z4) {
            z5 = z4;
            n1 = n0;
            com.apollographql.apollo.api.a a0 = new com.apollographql.apollo.api.a(m00, n0, e1, e0, 1);
            ((p)object1).a0(a0);
            object3 = a0;
        }
        else {
            z5 = z4;
            n1 = n0;
        }
        ((p)object1).p(false);
        J.c(null, e0, r00, false, null, null, null, false, ((Function1)object3), ((p)object1), 0x180, 0xF9);
        Density density0 = (Density)((p)object1).k(f0.f);
        ((p)object1).Q(0x53DF098);
        boolean z6 = ((p)object1).f(e0);
        boolean z7 = ((p)object1).f(m00.m);
        Object object4 = ((p)object1).G();
        if((z7 | z6) != 0 || object4 == z5) {
            object4 = d.w(new ha.f0(density0, e0, m00));
            ((p)object1).a0(object4);
        }
        ((p)object1).p(false);
        ((p)object1).Q(0x53E6081);
        boolean z8 = ((p)object1).f(e0);
        boolean z9 = ((p)object1).f(m00.m);
        Object object5 = ((p)object1).G();
        if((z8 | z9) != 0 || object5 == z5) {
            object5 = d.w(new ha.f0(e0, m00, density0));
            ((p)object1).a0(object5);
        }
        ((p)object1).p(false);
        ia.l.a(f.a((((Boolean)((N0)object5).getValue()).booleanValue() ? 4.0f : 0.0f), null, "toolbar elevation", ((p)object1), 0x180, 10), m00.a, m00.n, n1, v2, ((p)object1), 0x240, 0);
        Modifier modifier2 = g0.a.e(l0, 10.0f);
        ((p)object1).Q(88025705);
        boolean z10 = ((p)object1).f(m00);
        boolean z11 = ((p)object1).f(((N0)object4));
        Object object6 = ((p)object1).G();
        if((z10 | z11) != 0 || object6 == z5) {
            object6 = new ha.g0(m00, ((N0)object4), 0);
            ((p)object1).a0(object6);
        }
        ((p)object1).p(false);
        Modifier modifier3 = androidx.compose.foundation.layout.a.g(modifier2, ((Function1)object6));
        ((p)object1).Q(0x53F79AD);
        boolean z12 = ((p)object1).f(m00);
        boolean z13 = ((p)object1).f(((N0)object4));
        Object object7 = ((p)object1).G();
        if((z12 | z13) != 0 || object7 == z5) {
            object7 = new ha.g0(m00, ((N0)object4), 1);
            ((p)object1).a0(object7);
        }
        ((p)object1).p(false);
        Modifier modifier4 = androidx.compose.ui.graphics.a.a(modifier3, ((Function1)object7));
        ia.c.a(m00.b, m00.c, n1.c, modifier4, this.e0, ((p)object1), 0);
        long v3 = yc.d.h(0x7F060042, ((p)object1));  // color:WaveBlue
        Modifier modifier5 = g0.a.e(b0.a(l0, b.b), 20.0f);
        ((p)object1).Q(0x5404A28);
        boolean z14 = ((p)object1).f(m00);
        Object object8 = ((p)object1).G();
        if(z14 || object8 == z5) {
            object8 = new Ba.l(28, m00);
            ((p)object1).a0(object8);
        }
        ((p)object1).p(false);
        Modifier modifier6 = androidx.compose.foundation.layout.a.g(modifier5, ((Function1)object8));
        g.a(m00.j, this.X, modifier6, 0L, v3, false, ((p)object1), 0x40, 40);
        AccountEvent accountEvent0 = m00.p;
        if(accountEvent0 instanceof AccountAdded) {
            ((p)object1).Q(0xA2D0C3D0);
            ((p)object1).p(false);
            n2 = n1;
        }
        else {
            if(accountEvent0 instanceof AccountSwitch) {
                ((p)object1).Q(0x540945B);
                String s = w.T(0x7F12040E, new Object[]{l1.b(((AccountSwitch)accountEvent0).X)}, ((p)object1));  // string:switched_to_x "Switched to %s"
                ((p)object1).Q(0x540A937);
                boolean z15 = ((p)object1).h(n1);
                Object object9 = ((p)object1).G();
                if(z15 || object9 == z5) {
                    object9 = new d0(n1, 1);
                    ((p)object1).a0(object9);
                }
                ((p)object1).p(false);
                n2 = n1;
                T4.l.s(s, this.f0, ((Function0)object9), ((p)object1), 0x30);
                ((p)object1).p(false);
                yc.l.e(m00.k, null, ((p)object1), 6);
                l0.a(m00.l, n2.m, ((p)object1), 0);
                ((p)object1).p(true);
                return t.a;
            }
            n2 = n1;
            if(accountEvent0 instanceof AccountChangeAfterLogout) {
                ((p)object1).Q(0x540BDDD);
                String s1 = w.T(0x7F1204AC, new Object[]{l1.b(((AccountChangeAfterLogout)accountEvent0).Y)}, ((p)object1));  // string:you_are_now_viewing_x "You are now viewing %s"
                String s2 = w.T(0x7F1204AD, new Object[]{l1.b(((AccountChangeAfterLogout)accountEvent0).X)}, ((p)object1));  // string:you_logged_out_of_x "You\'ve logged out of %s"
                List list0 = q.K(new Va.c("Ok", false));
                ((p)object1).Q(0x54106D7);
                boolean z16 = ((p)object1).h(n2);
                Object object10 = ((p)object1).G();
                if(z16 || object10 == z5) {
                    object10 = new d0(n2, 2);
                    ((p)object1).a0(object10);
                }
                ((p)object1).p(false);
                ((p)object1).Q(0x54110F7);
                boolean z17 = ((p)object1).h(n2);
                Object object11 = ((p)object1).G();
                if(z17 || object11 == z5) {
                    object11 = new e0(n2, 1);
                    ((p)object1).a0(object11);
                }
                ((p)object1).p(false);
                W4.f.k(s1, s2, list0, ((Function0)object10), ((Function1)object11), ((p)object1), 0);
                ((p)object1).p(false);
                yc.l.e(m00.k, null, ((p)object1), 6);
                l0.a(m00.l, n2.m, ((p)object1), 0);
                ((p)object1).p(true);
                return t.a;
            }
            if(accountEvent0 instanceof AccountChangeAfterInvoluntaryLogout) {
                ((p)object1).Q(0x54126FD);
                String s3 = w.T(0x7F1204AC, new Object[]{l1.b(((AccountChangeAfterInvoluntaryLogout)accountEvent0).Y)}, ((p)object1));  // string:you_are_now_viewing_x "You are now viewing %s"
                String s4 = w.T(0x7F1204AD, new Object[]{l1.b(((AccountChangeAfterInvoluntaryLogout)accountEvent0).X)}, ((p)object1));  // string:you_logged_out_of_x "You\'ve logged out of %s"
                List list1 = q.K(new Va.c("Ok", false));
                ((p)object1).Q(0x5416FF7);
                boolean z18 = ((p)object1).h(n2);
                Object object12 = ((p)object1).G();
                if(z18 || object12 == z5) {
                    object12 = new d0(n2, 0);
                    ((p)object1).a0(object12);
                }
                ((p)object1).p(false);
                ((p)object1).Q(0x5417A17);
                boolean z19 = ((p)object1).h(n2);
                Object object13 = ((p)object1).G();
                if(z19 || object13 == z5) {
                    object13 = new e0(n2, 0);
                    ((p)object1).a0(object13);
                }
                ((p)object1).p(false);
                W4.f.k(s3, s4, list1, ((Function0)object12), ((Function1)object13), ((p)object1), 0);
                ((p)object1).p(false);
            }
            else if(accountEvent0 == null) {
                ((p)object1).Q(0xA2EF1570);
                ((p)object1).p(false);
            }
            else {
                throw M.J.c(0x540876D, ((p)object1), false);
            }
        }
        yc.l.e(m00.k, null, ((p)object1), 6);
        l0.a(m00.l, n2.m, ((p)object1), 0);
        ((p)object1).p(true);
        return t.a;
    }
}

