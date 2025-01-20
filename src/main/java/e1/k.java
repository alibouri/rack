package e1;

import B.w;
import D0.K;
import F0.h;
import G0.f0;
import I.U0;
import I.x0;
import N.T0;
import R2.f;
import T0.G;
import U.H;
import U.Z;
import U.g0;
import U.l0;
import U.l;
import U.n;
import U.p;
import U.x;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import c0.b;
import g0.c;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class k {
    public static final x a;

    static {
        k.a = new x(Z.e, d.Z);
    }

    public static final void a(PopupPositionProvider popupPositionProvider0, Function0 function00, e1.x x0, b b0, p p0, int v, int v1) {
        Z z6;
        int v3;
        Z z2;
        Function0 function01;
        p0.S(-830247068);
        int v2 = (v & 6) == 0 ? (p0.f(popupPositionProvider0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function01 = function00;
        }
        else if((v & 0x30) == 0) {
            function01 = function00;
            v2 |= (p0.h(function01) ? 0x20 : 16);
        }
        else {
            function01 = function00;
        }
        if((v & 0x180) == 0) {
            v2 |= (p0.f(x0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            Function0 function02 = (v1 & 2) == 0 ? function01 : null;
            Object object0 = p0.k(AndroidCompositionLocals_androidKt.f);
            Object object1 = p0.k(f0.f);
            Object object2 = p0.k(k.a);
            Object object3 = p0.k(f0.l);
            n n0 = U.d.F(p0);
            MutableState mutableState0 = U.d.G(b0, p0);
            boolean z = false;
            Object object4 = f.y(new Object[0], null, d.b0, p0, 0xC00, 6);
            Object object5 = p0.G();
            Z z1 = l.a;
            if(object5 == z1) {
                z2 = z1;
                v3 = v2;
                u u0 = new u(function02, x0, ((String)object2), ((View)object0), ((Density)object1), popupPositionProvider0, ((UUID)object4));
                u0.k(n0, new b(0x4DA88F2F, new w(u0, 17, mutableState0), true));
                p0.a0(u0);
                object5 = u0;
            }
            else {
                z2 = z1;
                v3 = v2;
            }
            boolean z3 = p0.h(((u)object5));
            boolean z4 = p0.f(((String)object2));
            boolean z5 = p0.f(((LayoutDirection)object3));
            Object object6 = p0.G();
            if((z3 | (v3 & 0x70) == 0x20 | ((v3 & 0x380) == 0x100 ? 1 : 0) | z4 | z5) == 0) {
                z6 = z2;
                if(object6 == z6) {
                    object6 = new x0(((u)object5), function02, x0, ((String)object2), ((LayoutDirection)object3), 2);
                    p0.a0(object6);
                }
            }
            else {
                z6 = z2;
                object6 = new x0(((u)object5), function02, x0, ((String)object2), ((LayoutDirection)object3), 2);
                p0.a0(object6);
            }
            H.b(((u)object5), ((Function1)object6), p0);
            boolean z7 = p0.h(((u)object5));
            boolean z8 = p0.f(((String)object2));
            boolean z9 = p0.f(((LayoutDirection)object3));
            Object object7 = p0.G();
            if(((v3 & 0x70) == 0x20 | z7 | ((v3 & 0x380) == 0x100 ? 1 : 0) | z8 | z9) != 0 || object7 == z6) {
                object7 = new g(((u)object5), function02, x0, ((String)object2), ((LayoutDirection)object3));
                p0.a0(object7);
            }
            H.g(((Function0)object7), p0);
            boolean z10 = p0.h(((u)object5));
            if((v3 & 14) == 4) {
                z = true;
            }
            Object object8 = p0.G();
            if((z10 | z) != 0 || object8 == z6) {
                object8 = new G(((u)object5), 9, popupPositionProvider0);
                p0.a0(object8);
            }
            H.b(popupPositionProvider0, ((Function1)object8), p0);
            boolean z11 = p0.h(((u)object5));
            Object object9 = p0.G();
            if(z11 || object9 == z6) {
                object9 = new i(((u)object5), null);
                p0.a0(object9);
            }
            H.d(p0, ((u)object5), ((Function2)object9));
            g0.l l0 = g0.l.X;
            boolean z12 = p0.h(((u)object5));
            Object object10 = p0.G();
            if(z12 || object10 == z6) {
                object10 = new j(((u)object5), 0);
                p0.a0(object10);
            }
            Modifier modifier0 = a.d(l0, ((Function1)object10));
            boolean z13 = p0.h(((u)object5));
            boolean z14 = p0.f(((LayoutDirection)object3));
            Object object11 = p0.G();
            if((z13 | z14) != 0 || object11 == z6) {
                object11 = new U0(((u)object5), 2, ((LayoutDirection)object3));
                p0.a0(object11);
            }
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, ((K)object11), F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            p0.p(true);
            function01 = function02;
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new T0(popupPositionProvider0, function01, x0, b0, v, v1, 1);
        }
    }

    public static final void b(c c0, long v, Function0 function00, e1.x x0, b b0, p p0, int v1) {
        Function0 function01;
        long v3;
        c c1;
        p0.S(0x119A1011);
        int v2 = (v1 & 0xC00) == 0 ? v1 | 438 | (p0.f(x0) ? 0x800 : 0x400) : v1 | 438;
        if((v1 & 0x6000) == 0) {
            v2 |= (p0.h(b0) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !p0.x()) {
            g0.g g0 = g0.b.a;
            Object object0 = p0.G();
            if((((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0)) != 0 || object0 == l.a) {
                object0 = new e1.a(g0, 0L);
                p0.a0(object0);
            }
            k.a(((e1.a)object0), null, x0, b0, p0, v2 >> 3 & 0x1FF0, 0);
            c1 = g0;
            v3 = 0L;
            function01 = null;
        }
        else {
            p0.K();
            c1 = c0;
            v3 = v;
            function01 = function00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new e1.f(c1, v3, function01, x0, b0, v1);
        }
    }

    public static final boolean c(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getRootView().getLayoutParams();
        WindowManager.LayoutParams windowManager$LayoutParams0 = viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams ? ((WindowManager.LayoutParams)viewGroup$LayoutParams0) : null;
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x2000) != 0;
    }
}

