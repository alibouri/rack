package v9;

import Aa.J;
import Aa.K;
import F0.k;
import G0.e0;
import G0.f0;
import G0.r0;
import M0.t;
import U.H;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.n;
import U.p;
import W5.f;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import c0.b;
import c0.c;
import e1.x;
import g0.g;
import g0.l;
import io.sentry.M1;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import u9.i;
import u9.j;
import v1.r;

public abstract class h {
    public static final t a;

    static {
        h.a = new t("IsBalloon", new J(9));
    }

    public static final void a(Modifier modifier0, j j0, Object object0, Function1 function10, Function1 function11, Function2 function20, b b0, p p0, int v) {
        Function1 function13;
        Function1 function12;
        Object object1;
        Modifier modifier1;
        Function1 function15;
        a a1;
        Function1 function14;
        g g1;
        boolean z2;
        Nb.j.f(j0, "builder");
        p0.S(714093085);
        int v1 = (v & 0x30) == 0 ? v | 6 | (p0.h(j0) ? 0x20 : 16) : v | 6;
        int v2 = (v & 0x30000) == 0 ? v1 | 0x6D80 | (p0.h(function20) ? 0x20000 : 0x10000) : v1 | 0x6D80;
        if((v & 0x180000) == 0) {
            v2 |= (p0.h(b0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !p0.x()) {
            l l0 = l.X;
            Z z0 = U.l.a;
            p0.Q(0x1EDD37AD);
            Object object2 = p0.G();
            if(object2 == z0) {
                object2 = new lb.j(19);
                p0.a0(object2);
            }
            Object object3 = r.f(0x1EDD3F2D, p0, false);
            if(object3 == z0) {
                object3 = new lb.j(20);
                p0.a0(object3);
            }
            p0.p(false);
            Context context0 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
            View view0 = (View)p0.k(AndroidCompositionLocals_androidKt.f);
            p0.Q(0x1EDD5912);
            Object object4 = p0.G();
            if(object4 == z0) {
                object4 = new e0(context0);
                ViewTreeLifecycleOwner.b(((View)object4), ViewTreeLifecycleOwner.a(view0));
                ViewTreeViewModelStoreOwner.b(((View)object4), ViewTreeViewModelStoreOwner.a(view0));
                f.U(((View)object4), f.C(view0));
                ((View)object4).post(new M1(((Function1)object2), 19, object4));
                p0.a0(object4);
            }
            p0.p(false);
            n n0 = d.F(p0);
            MutableState mutableState0 = d.G(function20, p0);
            p0.Q(0x1EDDA120);
            Object object5 = p0.G();
            if(object5 == z0) {
                object5 = new i(1);
                p0.a0(object5);
            }
            p0.p(false);
            UUID uUID0 = (UUID)R2.f.y(new Object[0], null, ((Function0)object5), p0, 0xC00, 6);
            p0.Q(0x1EDDA8D6);
            boolean z1 = p0.f(null);
            Object object6 = p0.G();
            if(z1 || object6 == z0) {
                Nb.j.c(uUID0);
                z2 = function20 != null;
                object6 = new a(((e0)object4), z2, j0, uUID0);
                if(z2) {
                    ((a)object6).j(n0, new b(-1941258500, new K(11, mutableState0), true));
                }
                p0.a0(object6);
            }
            else {
                z2 = function20 != null;
            }
            p0.p(false);
            p0.Q(517856807);
            boolean z3 = ((Boolean)p0.k(r0.a)).booleanValue();
            g g0 = g0.b.a;
            if(z3) {
                Nb.j.c(uUID0);
                a a0 = new a(((e0)object4), true, j0, uUID0);
                D0.K k0 = B.r.e(g0, false);
                int v3 = p0.P;
                g0 g00 = p0.m();
                Modifier modifier2 = g0.a.d(p0, l0);
                k.a.getClass();
                F0.i i0 = F0.j.b;
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                d.K(p0, k0, F0.j.f);
                d.K(p0, g00, F0.j.e);
                F0.h h0 = F0.j.g;
                if(p0.O || !Nb.j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h0);
                }
                d.K(p0, modifier2, F0.j.d);
                b0.h(a0, p0, ((int)(v2 >> 15 & 0x70)));
                p0.p(true);
                p0.p(false);
                l0 l00 = p0.r();
                if(l00 != null) {
                    l00.d = new v9.b(l0, j0, null, ((Function1)object2), ((Function1)object3), function20, b0, v, 0);
                }
                return;
            }
            p0.p(false);
            Ab.t t0 = Ab.t.a;
            p0.Q(0x1EDE03EA);
            boolean z4 = p0.f(((a)object6));
            Object object7 = p0.G();
            if(((0xE000 & v2) == 0x4000 | z4) != 0 || object7 == z0) {
                object7 = new v9.d(((Function1)object3), ((a)object6), null);
                p0.a0(object7);
            }
            p0.p(false);
            H.d(p0, t0, ((Function2)object7));
            p0.Q(517870424);
            if(!z2 || ((a)object6).getBalloonLayoutInfo$balloon_compose_release().getValue() != null) {
                g1 = g0;
                function15 = (Function1)object3;
                function14 = (Function1)object2;
                a1 = (a)object6;
            }
            else {
                Configuration configuration0 = (Configuration)p0.k(AndroidCompositionLocals_androidKt.a);
                Object object8 = p0.k(f0.f);
                p0.Q(517874807);
                Object object9 = p0.G();
                if(object9 == z0) {
                    object9 = (int)((Density)object8).w(((float)configuration0.screenWidthDp));
                    p0.a0(object9);
                }
                int v4 = ((Number)object9).intValue();
                p0.p(false);
                p0.Q(517878203);
                Object object10 = p0.G();
                if(object10 == z0) {
                    a1.d d0 = new a1.d(((Density)object8).i0(j0.d));
                    p0.a0(d0);
                    object10 = d0;
                }
                float f = ((a1.d)object10).X;
                Object object11 = r.f(0x1EDE3F3D, p0, false);
                if(object11 == z0) {
                    a1.d d1 = new a1.d(((Density)object8).i0(j0.f));
                    p0.a0(d1);
                    object11 = d1;
                }
                p0.p(false);
                x x0 = new x(9, false);
                g1 = g0;
                function14 = (Function1)object2;
                a1 = (a)object6;
                function15 = (Function1)object3;
                e1.k.b(null, 0L, null, x0, c.c(371393006, new e(f, ((a1.d)object11).X, j0, ((Density)object8), ((a)object6), v4, function20), p0), p0, 0x6C00);
            }
            p0.p(false);
            p0.Q(517930206);
            boolean z5 = p0.h(((e0)object4));
            Object object12 = p0.G();
            if(z5 || object12 == z0) {
                object12 = new v9.c(((e0)object4), 0);
                p0.a0(object12);
            }
            p0.p(false);
            Modifier modifier3 = androidx.compose.ui.layout.a.e(l0, ((Function1)object12));
            D0.K k1 = B.r.e(g1, false);
            int v5 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier4 = g0.a.d(p0, modifier3);
            k.a.getClass();
            F0.i i1 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            d.K(p0, k1, F0.j.f);
            d.K(p0, g01, F0.j.e);
            F0.h h1 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v5)) {
                m5.b.F(v5, p0, v5, h1);
            }
            d.K(p0, modifier4, F0.j.d);
            Modifier modifier5 = androidx.compose.foundation.layout.b.a.b();
            p0.Q(0x50B37F18);
            boolean z6 = p0.h(((e0)object4));
            Object object13 = p0.G();
            if(z6 || object13 == z0) {
                object13 = new v9.c(((e0)object4), 1);
                p0.a0(object13);
            }
            p0.p(false);
            androidx.compose.ui.viewinterop.a.a(((Function1)object13), modifier5, null, p0, 0, 4);
            b0.h(a1, p0, ((int)(v2 >> 15 & 0x70)));
            p0.p(true);
            p0.Q(517940020);
            boolean z7 = p0.f(a1);
            boolean z8 = p0.h(((e0)object4));
            Object object14 = p0.G();
            if((z7 | z8) != 0 || object14 == z0) {
                object14 = new Ea.r(a1, 20, ((e0)object4));
                p0.a0(object14);
            }
            p0.p(false);
            H.b(null, ((Function1)object14), p0);
            function12 = function14;
            object1 = null;
            modifier1 = l0;
            function13 = function15;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            object1 = object0;
            function12 = function10;
            function13 = function11;
        }
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new v9.b(modifier1, j0, object1, function12, function13, function20, b0, v, 1);
        }
    }

    public static final void b(Modifier modifier0, b b0, p p0, int v) {
        p0.S(-1130020662);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            p0.Q(0xD461F69);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = v9.f.a;
                p0.a0(object0);
            }
            p0.p(false);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, ((D0.K)object0), F0.j.f);
            d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            d.K(p0, modifier1, F0.j.d);
            b0.j(p0, ((int)(((v1 << 3 & 0x70 | (v1 >> 3 & 14 | 0x180)) << 6 & 0x380 | 6) >> 6 & 14)));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ra.i(modifier0, b0, v, 1);
        }
    }
}

