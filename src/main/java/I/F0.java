package I;

import Aa.P;
import B.J0;
import B.L0;
import B.m0;
import Bb.A;
import Bb.z;
import E.E;
import F.c;
import F0.j;
import F0.k;
import G0.I;
import K.v;
import L.h;
import M.a0;
import M.g0;
import M.j0;
import M.n0;
import M.o0;
import M.u0;
import M.v0;
import O0.G;
import O0.L;
import O0.N;
import O0.O;
import O0.d;
import O0.f;
import O0.g;
import U.Z;
import U.l0;
import U.l;
import U.p;
import U0.B;
import U0.H;
import U0.K;
import Z6.b;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import dc.e;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.w;
import y.q0;
import z0.a;

public abstract class f0 {
    public static final c0 a;
    public static final a b;

    static {
        f0.a = new c0(1);
        f0.b = new a(0x3F0);
    }

    public static final void a(f f0, Modifier modifier0, O o0, Function1 function10, int v, boolean z, int v1, int v2, Map map0, w w0, p p0, int v3, int v4) {
        w w1;
        Map map2;
        int v7;
        int v14;
        boolean z7;
        boolean z6;
        h h0;
        Map map1;
        int v6;
        p0.S(0xC08FFDC4);
        int v5 = (v3 & 6) == 0 ? (p0.f(f0) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v5 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= (p0.f(o0) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            v5 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v3 & 0x6000) == 0) {
            v5 |= (p0.d(v) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v3) == 0) {
            v5 |= (p0.g(z) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x180000) == 0) {
            v5 |= (p0.d(v1) ? 0x100000 : 0x80000);
        }
        if((0x80 & v4) == 0) {
            v6 = v2;
            if((v3 & 0xC00000) == 0) {
                v5 |= (p0.d(v6) ? 0x800000 : 0x400000);
            }
        }
        else {
            v5 |= 0xC00000;
            v6 = v2;
        }
        if((0x100 & v4) == 0) {
            map1 = map0;
            if((v3 & 0x6000000) == 0) {
                v5 |= (p0.h(map1) ? 0x4000000 : 0x2000000);
            }
        }
        else {
            v5 |= 0x6000000;
            map1 = map0;
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v3 & 0x30000000) == 0) {
            v5 |= (p0.h(w0) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 306783379) != 306783378 || !p0.x()) {
            if((0x80 & v4) != 0) {
                v6 = 1;
            }
            Map map3 = (0x100 & v4) == 0 ? map1 : A.X;
            w w2 = (v4 & 0x200) == 0 ? w0 : null;
            f0.y(v6, v1);
            Object object0 = p0.k(j0.a);
            Z z1 = l.a;
            if(((g0)object0) == null) {
                p0.Q(0xA18EF1BA);
                p0.p(false);
                h0 = null;
            }
            else {
                p0.Q(0xA187127C);
                long v8 = ((u0)p0.k(v0.a)).b;
                Object[] arr_object = {((g0)object0)};
                v v9 = new v(new L0(5, ((g0)object0)), 11, i.Z);
                boolean z2 = p0.h(((g0)object0));
                Object object1 = p0.G();
                if(z2 || object1 == z1) {
                    object1 = new n(((g0)object0), 1);
                    p0.a0(object1);
                }
                long v10 = ((Number)R2.f.y(arr_object, v9, ((Function0)object1), p0, 0, 4)).longValue();
                boolean z3 = p0.e(v10);
                boolean z4 = p0.f(((g0)object0));
                boolean z5 = p0.e(v8);
                Object object2 = p0.G();
                if((z3 | z4 | z5) != 0 || object2 == z1) {
                    object2 = new h(v10, ((g0)object0), v8);
                    p0.a0(object2);
                }
                p0.p(false);
                h0 = (h)object2;
            }
            int v11 = f0.X.length();
            List list0 = f0.b0;
            if(list0 == null) {
                z7 = false;
            }
            else {
                int v12 = list0.size();
                for(int v13 = 0; true; ++v13) {
                    z6 = false;
                    if(v13 >= v12) {
                        break;
                    }
                    d d0 = (d)list0.get(v13);
                    if(d0.a instanceof String && "androidx.compose.foundation.text.inlineContent".equals(d0.d) && g.c(0, v11, d0.b, d0.c)) {
                        z6 = true;
                        break;
                    }
                }
                z7 = z6;
            }
            if(z7 || b.q(f0)) {
                v14 = v6;
                p0.Q(0xA19F5B70);
                Object object3 = p0.G();
                if((v5 & 14) == 4 || object3 == z1) {
                    object3 = U.d.D(f0, Z.e);
                    p0.a0(object3);
                }
                Object object4 = ((MutableState)object3).getValue();
                Object object5 = p0.k(G0.f0.i);
                boolean z8 = p0.f(((MutableState)object3));
                Object object6 = p0.G();
                if(z8 || object6 == z1) {
                    object6 = new I(((MutableState)object3), 1);
                    p0.a0(object6);
                }
                f0.h(modifier0, ((f)object4), function10, z7, map3, o0, v, z, v1, v14, ((FontFamily.Resolver)object5), h0, w2, ((Function1)object6), p0, v5 >> 3 & 910 | v5 >> 12 & 0xE000 | v5 << 9 & 0x70000 | 0x380000 & v5 << 6 | 0x1C00000 & v5 << 6 | 0xE000000 & v5 << 6 | v5 << 6 & 0x70000000, v5 >> 21 & 0x380);
            }
            else {
                p0.Q(0xA19195CB);
                v14 = v6;
                Modifier modifier1 = f0.x(androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0x1FFFF), f0, o0, function10, v, z, v1, v14, ((FontFamily.Resolver)p0.k(G0.f0.i)), null, null, h0, w2, null);
                I.g g0 = I.g.c;
                int v15 = p0.P;
                Modifier modifier2 = g0.a.d(p0, modifier1);
                U.g0 g00 = p0.m();
                k.a.getClass();
                F0.i i0 = j.b;
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, g0, j.f);
                U.d.K(p0, g00, j.e);
                U.d.K(p0, modifier2, j.d);
                F0.h h1 = j.g;
                if(p0.O || !Nb.j.a(p0.G(), v15)) {
                    m5.b.F(v15, p0, v15, h1);
                }
                p0.p(true);
            }
            p0.p(false);
            map2 = map3;
            w1 = w2;
            v7 = v14;
        }
        else {
            p0.K();
            v7 = v6;
            map2 = map1;
            w1 = w0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m(f0, modifier0, o0, function10, v, z, v1, v7, map2, w1, v3, v4);
        }
    }

    public static final void b(String s, Modifier modifier0, O o0, Function1 function10, int v, boolean z, int v1, int v2, w w0, p p0, int v3, int v4) {
        boolean z2;
        int v8;
        w w1;
        int v7;
        Function1 function11;
        int v14;
        p p1;
        Modifier modifier1;
        h h0;
        boolean z1;
        int v6;
        p0.S(0xB94271D2);
        int v5 = (v3 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v5 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= (p0.f(o0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((16 & v4) != 0) {
            v5 |= 0x6000;
            v6 = v;
        }
        else if((v3 & 0x6000) == 0) {
            v6 = v;
            v5 |= (p0.d(v6) ? 0x4000 : 0x2000);
        }
        else {
            v6 = v;
        }
        if((0x20 & v4) == 0) {
            z1 = z;
            if((v3 & 0x30000) == 0) {
                v5 |= (p0.g(z1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v5 |= 0x30000;
            z1 = z;
        }
        if((v3 & 0x180000) == 0) {
            v5 |= (p0.d(v1) ? 0x100000 : 0x80000);
        }
        if((0x80 & v4) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (p0.d(v2) ? 0x800000 : 0x400000);
        }
        if((0x100 & v4) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (p0.h(w0) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x2492493) != 0x2492492 || !p0.x()) {
            Function1 function12 = (v4 & 8) == 0 ? function10 : null;
            int v9 = (16 & v4) == 0 ? v6 : 1;
            boolean z3 = (0x20 & v4) == 0 ? z1 : true;
            int v10 = (0x80 & v4) == 0 ? v2 : 1;
            w1 = (0x100 & v4) == 0 ? w0 : null;
            f0.y(v10, v1);
            Object object0 = p0.k(j0.a);
            if(((g0)object0) == null) {
                p0.Q(-1588686502);
                p0.p(false);
                h0 = null;
            }
            else {
                p0.Q(-1589202404);
                long v11 = ((u0)p0.k(v0.a)).b;
                Object[] arr_object = {((g0)object0)};
                v v12 = new v(new L0(5, ((g0)object0)), 11, i.Z);
                boolean z4 = p0.h(((g0)object0));
                Object object1 = p0.G();
                Z z5 = l.a;
                if(z4 || object1 == z5) {
                    object1 = new n(((g0)object0), 0);
                    p0.a0(object1);
                }
                long v13 = ((Number)R2.f.y(arr_object, v12, ((Function0)object1), p0, 0, 4)).longValue();
                boolean z6 = p0.e(v13);
                boolean z7 = p0.f(((g0)object0));
                boolean z8 = p0.e(v11);
                Object object2 = p0.G();
                if((z6 | z7 | z8) != 0 || object2 == z5) {
                    object2 = new h(v13, ((g0)object0), v11);
                    p0.a0(object2);
                }
                h0 = (h)object2;
                p0.p(false);
            }
            if(h0 != null || function12 != null) {
                p0.Q(0xA1506FAC);
                v14 = v10;
                p1 = p0;
                Modifier modifier2 = f0.x(androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0x1FFFF), new f(6, s, null), o0, function12, v9, z3, v1, v14, ((FontFamily.Resolver)p0.k(G0.f0.i)), null, null, h0, w1, null);
                p1.p(false);
                modifier1 = modifier2;
            }
            else {
                p0.Q(0xA15B1521);
                modifier1 = androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0x1FFFF).d(new TextStringSimpleElement(s, o0, ((FontFamily.Resolver)p0.k(G0.f0.i)), v9, z3, v1, v10, w1));
                p0.p(false);
                p1 = p0;
                v14 = v10;
            }
            I.g g0 = I.g.c;
            int v15 = p1.P;
            Modifier modifier3 = g0.a.d(p1, modifier1);
            U.g0 g00 = p0.m();
            k.a.getClass();
            F0.i i0 = j.b;
            p0.U();
            if(p1.O) {
                p1.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p1, g0, j.f);
            U.d.K(p1, g00, j.e);
            U.d.K(p1, modifier3, j.d);
            F0.h h1 = j.g;
            if(p1.O || !Nb.j.a(p0.G(), v15)) {
                m5.b.F(v15, p1, v15, h1);
            }
            p1.p(true);
            v7 = v14;
            function11 = function12;
            v8 = v9;
            z2 = z3;
        }
        else {
            p0.K();
            function11 = function10;
            v7 = v2;
            w1 = w0;
            v8 = v6;
            z2 = z1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new I.l(s, modifier0, o0, function11, v8, z2, v1, v7, w1, v3, v4);
        }
    }

    public static final void c(f f0, Modifier modifier0, O o0, boolean z, int v, int v1, Function1 function10, Function1 function11, p p0, int v2, int v3) {
        Modifier modifier1;
        O o2;
        Function1 function12;
        int v8;
        int v7;
        boolean z1;
        O o1;
        p0.S(0xF14D09D7);
        int v4 = (v2 & 6) == 0 ? (p0.f(f0) ? 4 : 2) | v2 : v2;
        int v5 = v4 | 0x30;
        if((v3 & 4) != 0) {
            v5 = v4 | 0x1B0;
            o1 = o0;
        }
        else if((v2 & 0x180) == 0) {
            o1 = o0;
            v5 |= (p0.f(o1) ? 0x100 : 0x80);
        }
        else {
            o1 = o0;
        }
        int v6 = (0xC00000 & v2) == 0 ? v5 | 0x1B6C00 | (p0.h(function11) ? 0x800000 : 0x400000) : v5 | 0x1B6C00;
        if((0x492493 & v6) != 4793490 || !p0.x()) {
            g0.l l0 = g0.l.X;
            if((v3 & 4) != 0) {
                o1 = O.d;
            }
            i i0 = i.b0;
            Object object0 = p0.G();
            Z z2 = l.a;
            if(object0 == z2) {
                object0 = U.d.D(null, Z.e);
                p0.a0(object0);
            }
            boolean z3 = true;
            Object object1 = p0.G();
            if((0x1C00000 & v6) == 0x800000 || object1 == z2) {
                object1 = new t(((MutableState)object0), function11, null);
                p0.a0(object1);
            }
            SuspendPointerInputElement suspendPointerInputElement0 = new SuspendPointerInputElement(function11, null, ((Function2)object1), 6);
            if((v6 & 0x380000) != 0x100000) {
                z3 = false;
            }
            Object object2 = p0.G();
            if(z3 || object2 == z2) {
                object2 = new r(((MutableState)object0), i0, 0);
                p0.a0(object2);
            }
            f0.a(f0, suspendPointerInputElement0, o1, ((Function1)object2), 1, true, 0x7FFFFFFF, 0, null, null, p0, 0xE38E & v6 | v6 << 6 & 0x70000 | v6 << 3 & 0x380000, 0x380);
            function12 = i0;
            z1 = true;
            v8 = 0x7FFFFFFF;
            o2 = o1;
            modifier1 = l0;
            v7 = 1;
        }
        else {
            p0.K();
            z1 = z;
            v7 = v;
            v8 = v1;
            function12 = function10;
            o2 = o1;
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(f0, modifier1, o2, z1, v7, v8, function12, function11, v2, v3);
        }
    }

    public static final void d(a0 a00, c0.b b0, p p0, int v) {
        p0.S(605522716);
        int v1 = (v & 6) == 0 ? (p0.h(a00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Object object0 = p0.G();
            Z z0 = l.a;
            if(object0 == z0) {
                object0 = new x.n();
                p0.a0(object0);
            }
            Object object1 = p0.G();
            if(object1 == z0) {
                object1 = new u(((x.n)object0), 1);
                p0.a0(object1);
            }
            Q4.i.g(((x.n)object0), ((Function0)object1), new P(((x.n)object0), 23, a00), null, false, b0, p0, v1 << 12 & 0x70000 | 54, 24);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 4, a00, b0);
        }
    }

    public static final void e(o0 o00, c0.b b0, p p0, int v) {
        p0.S(0x89A76B73);
        int v1 = (v & 6) == 0 ? (p0.h(o00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Object object0 = p0.G();
            Z z0 = l.a;
            if(object0 == z0) {
                object0 = new x.n();
                p0.a0(object0);
            }
            Object object1 = p0.G();
            if(object1 == z0) {
                object1 = new u(((x.n)object0), 0);
                p0.a0(object1);
            }
            Q4.i.g(((x.n)object0), ((Function0)object1), new P(o00, 24, ((x.n)object0)), null, o00.h(), b0, p0, v1 << 12 & 0x70000 | 54, 8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 3, o00, b0);
        }
    }

    public static final void f(B b0, Function1 function10, Modifier modifier0, O o0, K k0, Function1 function11, A.k k1, n0.r r0, boolean z, int v, int v1, U0.n n0, h0 h00, boolean z1, boolean z2, Function3 function30, p p0, int v2, int v3) {
        Modifier modifier17;
        Z z47;
        int v40;
        l0.m m3;
        Modifier modifier12;
        Modifier modifier11;
        G0.j j3;
        I.j0 j04;
        int v38;
        int v37;
        o0 o02;
        Z z43;
        int v35;
        G0.j j2;
        Z z37;
        Modifier modifier8;
        U0.v v34;
        WindowInfo windowInfo2;
        Modifier modifier5;
        Z z30;
        Modifier modifier4;
        int v33;
        int v32;
        U0.v v31;
        o0 o01;
        Modifier modifier2;
        MutableState mutableState1;
        TextInputService textInputService2;
        int v30;
        Z z25;
        c c1;
        A.k k3;
        U0.I i3;
        l0.m m2;
        g0.l l1;
        int v28;
        int v27;
        int v26;
        TextInputService textInputService1;
        Z z20;
        X0 x00;
        o0 o00;
        U0.v v25;
        I.j0 j03;
        int v24;
        U0.I i2;
        l0.m m1;
        B b1;
        boolean z13;
        I.j0 j02;
        I.j0 j01;
        p p2;
        FocusOwner focusOwner2;
        Density density2;
        FontFamily.Resolver fontFamily$Resolver1;
        Density density1;
        p p1;
        int v17;
        long v16;
        TextInputService textInputService0;
        WindowInfo windowInfo1;
        FocusOwner focusOwner1;
        K.f f3;
        l0.m m0;
        N n3;
        int v15;
        N0 n00;
        boolean z9;
        U0.I i1;
        f f2;
        z z8;
        Z z7;
        N n2;
        int v12;
        int v11;
        p0.S(-958708118);
        int v4 = (v2 & 6) == 0 ? v2 | (p0.f(b0) ? 4 : 2) : v2;
        if((v2 & 0x30) == 0) {
            v4 |= (p0.h(function10) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v4 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v2 & 0xC00) == 0) {
            v4 |= (p0.f(o0) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v2 & 0x6000) == 0) {
            v4 |= (p0.f(k0) ? 0x4000 : 0x2000);
        }
        int v7 = 0x10000;
        if((v2 & 0x30000) == 0) {
            v4 |= (p0.h(function11) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x180000) == 0) {
            v4 |= (p0.f(k1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0xC00000) == 0) {
            v4 |= (p0.f(r0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x6000000) == 0) {
            v4 |= (p0.g(z) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v4 |= (p0.d(v) ? 0x20000000 : 0x10000000);
        }
        int v8 = (v3 & 6) == 0 ? v3 | (p0.d(v1) ? 4 : 2) : v3;
        if((v3 & 0x30) == 0) {
            v8 |= (p0.f(n0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v8 |= (p0.f(h00) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            if(p0.g(z1)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x6000) == 0) {
            if(p0.g(z2)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        if((0x30000 & v3) == 0) {
            if(p0.h(function30)) {
                v7 = 0x20000;
            }
            v8 |= v7;
        }
        if((v4 & 306783379) != 306783378 || (74899 & v8) != 74898 || !p0.x()) {
            p0.M();
            if((v2 & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            Object object0 = p0.G();
            Z z3 = l.a;
            if(object0 == z3) {
                object0 = new l0.m();
                p0.a0(object0);
            }
            Object object1 = p0.G();
            if(object1 == z3) {
                object1 = new K.f();  // initializer: Ljava/lang/Object;-><init>()V
                p0.a0(object1);
            }
            Object object2 = p0.G();
            if(object2 == z3) {
                object2 = new TextInputService(((K.f)object1));
                p0.a0(object2);
            }
            Density density0 = (Density)p0.k(G0.f0.f);
            FontFamily.Resolver fontFamily$Resolver0 = (FontFamily.Resolver)p0.k(G0.f0.i);
            long v9 = ((u0)p0.k(v0.a)).b;
            FocusOwner focusOwner0 = (FocusOwner)p0.k(G0.f0.g);
            WindowInfo windowInfo0 = (WindowInfo)p0.k(G0.f0.r);
            SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)p0.k(G0.f0.n);
            q0 q00 = v != 1 || z || !n0.a ? q0.X : q0.Y;
            Object[] arr_object = {q00};
            v v10 = N0.f;
            boolean z4 = p0.f(q00);
            Object object3 = p0.G();
            if(z4 || object3 == z3) {
                v11 = v8;
                object3 = new D0.a0(15, q00);
                p0.a0(object3);
            }
            else {
                v11 = v8;
            }
            Object object4 = R2.f.y(arr_object, v10, ((Function0)object3), p0, 0, 4);
            Object object5 = p0.G();
            N n1 = b0.c;
            f f0 = b0.a;
            if((((v4 & 14) == 4 ? 1 : 0) | ((v4 & 0xE000) == 0x4000 ? 1 : 0)) != 0 || object5 == z3) {
                U0.I i0 = Y0.a(k0, f0);
                if(n1 == null) {
                    v12 = v4 & 14;
                    n2 = null;
                    object5 = i0;
                }
                else {
                    v12 = v4 & 14;
                    n2 = n1;
                    int v13 = i0.b.l(((int)(n1.a >> 0x20)));
                    int v14 = i0.b.l(((int)(n1.a & 0xFFFFFFFFL)));
                    O0.c c0 = new O0.c(i0.a);
                    c0.b(new G(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, Z0.j.c, null, 0xEFFF), Math.min(v13, v14), Math.max(v13, v14));
                    object5 = new U0.I(c0.g(), i0.b);
                }
                p0.a0(object5);
            }
            else {
                v12 = v4 & 14;
                n2 = n1;
            }
            f f1 = ((U0.I)object5).a;
            l0 l00 = U.d.y(p0);
            boolean z5 = p0.f(softwareKeyboardController0);
            Object object6 = p0.G();
            z z6 = z.X;
            if(z5 || object6 == z3) {
                m0 = (l0.m)object0;
                f3 = (K.f)object1;
                focusOwner1 = focusOwner0;
                windowInfo1 = windowInfo0;
                z7 = z3;
                textInputService0 = (TextInputService)object2;
                v16 = v9;
                z8 = z6;
                v15 = v12;
                n00 = (N0)object4;
                n3 = n2;
                v17 = v11;
                f2 = f1;
                i1 = (U0.I)object5;
                z9 = z;
                I.j0 j00 = new I.j0(new I.u0(f1, o0, 0x7FFFFFFF, 1, z, 1, density0, fontFamily$Resolver0, z8), l00, softwareKeyboardController0);
                p1 = p0;
                p1.a0(j00);
                object6 = j00;
            }
            else {
                z7 = z3;
                z8 = z6;
                f2 = f1;
                i1 = (U0.I)object5;
                z9 = z;
                n00 = (N0)object4;
                v15 = v12;
                n3 = n2;
                m0 = (l0.m)object0;
                f3 = (K.f)object1;
                focusOwner1 = focusOwner0;
                windowInfo1 = windowInfo0;
                textInputService0 = (TextInputService)object2;
                v16 = v9;
                v17 = v11;
                p1 = p0;
            }
            ((I.j0)object6).s = function10;
            ((I.j0)object6).w = v16;
            ((I.j0)object6).r.b = h00;
            ((I.j0)object6).r.c = focusOwner1;
            ((I.j0)object6).j = f0;
            I.u0 u00 = ((I.j0)object6).a;
            if(!Nb.j.a(u00.a, f2) || !Nb.j.a(u00.b, o0) || u00.e != z9 || u00.f != 1 || u00.c != 0x7FFFFFFF || u00.d != 1) {
                density1 = density0;
                fontFamily$Resolver1 = fontFamily$Resolver0;
            label_166:
                density2 = density1;
                focusOwner2 = focusOwner1;
                p2 = p1;
                u00 = new I.u0(f2, o0, 0x7FFFFFFF, 1, z, 1, density2, fontFamily$Resolver1, z8);
                j01 = (I.j0)object6;
            }
            else {
                density1 = density0;
                if(!Nb.j.a(u00.g, density1)) {
                    fontFamily$Resolver1 = fontFamily$Resolver0;
                    goto label_166;
                }
                else if(Nb.j.a(u00.i, z8)) {
                    z8 = z8;
                    fontFamily$Resolver1 = fontFamily$Resolver0;
                    if(u00.h == fontFamily$Resolver1) {
                        density2 = density1;
                        focusOwner2 = focusOwner1;
                        p2 = p1;
                        j01 = (I.j0)object6;
                    }
                    else {
                        goto label_166;
                    }
                }
                else {
                    z8 = z8;
                    fontFamily$Resolver1 = fontFamily$Resolver0;
                    goto label_166;
                }
            }
            boolean z10 = true;
            if(j01.a != u00) {
                j01.p = true;
            }
            j01.a = u00;
            H h0 = j01.e;
            R2.k k2 = j01.d;
            boolean z11 = Nb.j.a(n3, ((U0.j)k2.Z).c());
            boolean z12 = Nb.j.a(((B)k2.Y).a, f0);
            long v18 = b0.b;
            if(z12) {
                j02 = j01;
                if(N.a(((B)k2.Y).b, v18)) {
                    z13 = false;
                }
                else {
                    ((U0.j)k2.Z).f(N.e(v18), N.d(v18));
                    z13 = true;
                }
                z10 = false;
            }
            else {
                k2.Z = new U0.j(f0, v18);
                j02 = j01;
                z13 = false;
            }
            if(n3 == null) {
                ((U0.j)k2.Z).d = -1;
                ((U0.j)k2.Z).e = -1;
            }
            else {
                long v19 = n3.a;
                if(!N.b(v19)) {
                    ((U0.j)k2.Z).e(N.e(v19), N.d(v19));
                }
            }
            long v20 = 0L;
            if(z10 || !z13 && !z11) {
                ((U0.j)k2.Z).d = -1;
                ((U0.j)k2.Z).e = -1;
                b1 = B.a(b0, null, 0L, 3);
            }
            else {
                b1 = b0;
            }
            B b2 = (B)k2.Y;
            k2.Y = b1;
            if(h0 != null) {
                h0.a(b2, b1);
            }
            Object object7 = p0.G();
            if(object7 == z7) {
                object7 = new X0();
                p2.a0(object7);
            }
            long v21 = System.currentTimeMillis();
            if(((X0)object7).f) {
                ((X0)object7).e = v21;
                ((X0)object7).a(b0);
            }
            else {
                Long long0 = ((X0)object7).e;
                if(long0 != null) {
                    v20 = (long)long0;
                }
                if(v21 > v20 + 5000L) {
                    ((X0)object7).e = v21;
                    ((X0)object7).a(b0);
                }
            }
            Object object8 = p0.G();
            if(object8 == z7) {
                object8 = new o0(((X0)object7));
                p2.a0(object8);
            }
            U0.v v22 = i1.b;
            ((o0)object8).b = v22;
            ((o0)object8).c = j02.t;
            ((o0)object8).d = j02;
            ((o0)object8).e.setValue(b0);
            ((o0)object8).f = (ClipboardManager)p2.k(G0.f0.d);
            ((o0)object8).g = (TextToolbar)p2.k(G0.f0.o);
            ((o0)object8).h = (HapticFeedback)p2.k(G0.f0.j);
            ((o0)object8).i = m0;
            ((o0)object8).j.setValue(Boolean.valueOf(!z2));
            ((o0)object8).k.setValue(Boolean.valueOf(z1));
            Object object9 = p0.G();
            if(object9 == z7) {
                U.w w0 = new U.w(U.H.h(p0));
                p2.a0(w0);
                object9 = w0;
            }
            e e0 = ((U.w)object9).X;
            Object object10 = p0.G();
            if(object10 == z7) {
                object10 = new c();
                p2.a0(object10);
            }
            g0.l l0 = g0.l.X;
            boolean z14 = p2.h(j02);
            boolean z15 = p2.h(textInputService0);
            int v23 = v17 & 0x70 ^ 0x30;
            if(v23 > 0x20) {
                m1 = m0;
                if(p2.f(n0)) {
                    i2 = i1;
                    v24 = 1;
                }
                else {
                    i2 = i1;
                    v24 = (v17 & 0x30) == 0x20 ? 1 : 0;
                }
            }
            else {
                m1 = m0;
                i2 = i1;
                v24 = (v17 & 0x30) == 0x20 ? 1 : 0;
            }
            boolean z16 = p2.h(v22);
            boolean z17 = p2.h(e0);
            boolean z18 = p2.h(((c)object10));
            boolean z19 = p2.h(((o0)object8));
            Object object11 = p0.G();
            if((((v17 & 0xE000) == 0x4000 ? 1 : 0) | (z14 | (v17 & 0x1C00) == 0x800) | z15 | (v15 == 4 ? 1 : 0) | v24 | z16 | z17 | z18 | z19) != 0 || object11 == z7) {
                c1 = (c)object10;
                v26 = v17;
                v27 = v17 & 0xE000;
                m2 = m1;
                l1 = l0;
                v25 = v22;
                i3 = i2;
                o00 = (o0)object8;
                x00 = (X0)object7;
                z20 = z7;
                v28 = v23;
                textInputService1 = textInputService0;
                j03 = j02;
                k3 = k1;
                I.H h1 = new I.H(j02, z1, z2, textInputService0, b0, n0, v25, o00, e0, c1);
                p2.a0(h1);
                object11 = h1;
            }
            else {
                j03 = j02;
                v25 = v22;
                o00 = (o0)object8;
                x00 = (X0)object7;
                z20 = z7;
                textInputService1 = textInputService0;
                v26 = v17;
                v27 = v17 & 0xE000;
                v28 = v23;
                l1 = l0;
                m2 = m1;
                i3 = i2;
                k3 = k1;
                c1 = (c)object10;
            }
            Modifier modifier1 = androidx.compose.foundation.d.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(l1, m2), ((Function1)object11)), z1, k3);
            MutableState mutableState0 = U.d.G(Boolean.valueOf(z1 && !z2), p2);
            Ab.t t0 = Ab.t.a;
            boolean z21 = p2.f(mutableState0);
            boolean z22 = p2.h(j03);
            boolean z23 = p2.h(textInputService1);
            boolean z24 = p2.h(o00);
            int v29 = (v28 <= 0x20 || !p2.f(n0)) && (v26 & 0x30) != 0x20 ? 0 : 1;
            Object object12 = p0.G();
            if((z21 | z22 | z23 | z24 | v29) != 0 || object12 == z20) {
                modifier2 = modifier1;
                z25 = z20;
                mutableState1 = mutableState0;
                v30 = v28;
                o01 = o00;
                textInputService2 = textInputService1;
                x x0 = new x(j03, mutableState0, textInputService1, o00, n0, null);
                p2.a0(x0);
                object12 = x0;
            }
            else {
                z25 = z20;
                v30 = v28;
                textInputService2 = textInputService1;
                mutableState1 = mutableState0;
                modifier2 = modifier1;
                o01 = o00;
            }
            U.H.d(p2, t0, ((Function2)object12));
            boolean z26 = p2.h(j03);
            Object object13 = p0.G();
            if(z26 || object13 == z25) {
                object13 = new F(j03, 1);
                p2.a0(object13);
            }
            Modifier modifier3 = z0.t.a(l1, 0x845FED, new M.I(((Function1)object13), null));
            boolean z27 = p2.h(j03);
            boolean z28 = p2.h(v25);
            boolean z29 = p2.h(o01);
            Object object14 = p0.G();
            if((z27 | v27 == 0x4000 | ((v17 & 0x1C00) == 0x800 ? 1 : 0) | z28 | z29) != 0 || object14 == z25) {
                v31 = v25;
                v32 = v17 & 0x1C00;
                v33 = v27;
                modifier4 = modifier3;
                J j0 = new J(j03, m2, z2, z1, o01, v31);
                p2.a0(j0);
                object14 = j0;
            }
            else {
                v31 = v25;
                v32 = v17 & 0x1C00;
                v33 = v27;
                modifier4 = modifier3;
            }
            G0.j j1 = G0.j.e0;
            if(z1) {
                z30 = z25;
                modifier5 = g0.a.b(modifier4, j1, new I0(((Function1)object14), 0, k1));
            }
            else {
                z30 = z25;
                modifier5 = modifier4;
            }
            M.F f4 = new M.F(o01.u, o01.t, null);
            Modifier modifier6 = z0.l.h(modifier5.d(new SuspendPointerInputElement(o01.u, o01.t, f4, 4)), f0.b);
            boolean z31 = p2.h(j03);
            boolean z32 = p2.h(v31);
            Object object15 = p0.G();
            if((z31 | v15 == 4 | z32) != 0 || object15 == z30) {
                object15 = new m0(j03, b0, v31, 5);
                p2.a0(object15);
            }
            Modifier modifier7 = androidx.compose.ui.draw.a.a(l1, ((Function1)object15));
            boolean z33 = p2.h(j03);
            boolean z34 = p2.f(windowInfo1);
            boolean z35 = p2.h(o01);
            boolean z36 = p2.h(v31);
            Object object16 = p0.G();
            if((z33 | v32 == 0x800 | z34 | z35 | (v15 == 4 ? 1 : 0) | z36) != 0 || object16 == z30) {
                windowInfo2 = windowInfo1;
                v34 = v31;
                j2 = j1;
                v35 = v15;
                modifier8 = modifier6;
                z37 = z30;
                I.I i4 = new I.I(j03, z1, windowInfo2, o01, b0, v34);
                p2.a0(i4);
                object16 = i4;
            }
            else {
                windowInfo2 = windowInfo1;
                v34 = v31;
                modifier8 = modifier6;
                z37 = z30;
                j2 = j1;
                v35 = v15;
            }
            Modifier modifier9 = androidx.compose.ui.layout.a.d(l1, ((Function1)object16));
            boolean z38 = p2.h(i3);
            boolean z39 = p2.g(false);
            boolean z40 = p2.h(j03);
            boolean z41 = p2.h(v34);
            boolean z42 = p2.h(o01);
            int v36 = (v30 <= 0x20 || !p2.f(n0)) && (v26 & 0x30) != 0x20 ? 0 : 1;
            Object object17 = p0.G();
            if((z38 | v35 == 4 | (v32 == 0x800 ? 1 : 0) | z39 | (v33 == 0x4000 ? 1 : 0) | z40 | z41 | z42 | v36) != 0 || object17 == z37) {
                v38 = v35;
                o02 = o01;
                v37 = v30;
                z43 = z37;
                j04 = j03;
                new I.N(i3, b0, z1, z2, n0, j03, v34, o02, m2);
                p2.a0(null);
                object17 = null;
            }
            else {
                z43 = z37;
                o02 = o01;
                v37 = v30;
                v38 = v35;
                j04 = j03;
            }
            Modifier modifier10 = M0.k.a(l1, true, ((Function1)object17));
            if(!z1 || z2 || !windowInfo2.a() || !N.b(((N)j04.x.getValue()).a) || !N.b(((N)j04.y.getValue()).a)) {
                j3 = j2;
                modifier11 = l1;
            }
            else {
                j3 = j2;
                modifier11 = g0.a.b(l1, j3, new y0(r0, j04, b0, v34, 0));
            }
            boolean z44 = p2.h(o02);
            Object object18 = p0.G();
            if(z44 || object18 == z43) {
                object18 = new y(o02, 0);
                p2.a0(object18);
            }
            U.H.b(o02, ((Function1)object18), p2);
            boolean z45 = p2.h(j04);
            boolean z46 = p2.h(textInputService2);
            int v39 = (v37 <= 0x20 || !p2.f(n0)) && (v26 & 0x30) != 0x20 ? 0 : 1;
            Object object19 = p0.G();
            if((z45 | z46 | (v38 == 4 ? 1 : 0) | v39) != 0 || object19 == z43) {
                modifier12 = modifier10;
                v40 = v37;
                m3 = m2;
                z47 = z43;
                E.J j4 = new E.J(j04, textInputService2, b0, n0, 1);
                p2.a0(j4);
                object19 = j4;
            }
            else {
                modifier12 = modifier10;
                m3 = m2;
                v40 = v37;
                z47 = z43;
            }
            U.H.b(n0, ((Function1)object19), p2);
            boolean z48 = true;
            Modifier modifier13 = g0.a.b(l1, j3, new D0(j04, o02, b0, !z2, v == 1, v34, x00, j04.t, n0.e));
            boolean z49 = ((Boolean)mutableState1.getValue()).booleanValue();
            boolean z50 = p2.h(j04);
            boolean z51 = v40 <= 0x20 && p2.f(n0) || (v26 & 0x30) == 0x20;
            boolean z52 = p2.h(f3);
            Object object20 = p0.G();
            if((z50 | z51 | z52) != 0 || object20 == z47) {
                I.O o1 = new I.O(j04, m3, n0, f3, 0);
                p2.a0(o1);
                object20 = o1;
            }
            Modifier modifier14 = androidx.compose.foundation.text.handwriting.a.a(((Function0)object20), z49);
            Modifier modifier15 = androidx.compose.ui.layout.a.d(g0.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(modifier0, f3, j04, o02).d(modifier14).d(modifier2), new P(focusOwner2, 16, j04)), new P(j04, 14, o02)).d(modifier13), j3, new I.L0(n00, z1, k1)).d(modifier8).d(modifier12), new F(j04, 0));
            if(!z1 || !j04.b() || !((Boolean)j04.q.getValue()).booleanValue() || !windowInfo2.a()) {
                z48 = false;
            }
            if(z48) {
                Modifier modifier16 = w.g0.a() ? g0.a.b(l1, j3, new J0(6, o02)) : l1;
                modifier17 = modifier16;
            }
            else {
                modifier17 = l1;
            }
            f0.g(modifier15, o02, c0.c.c(0xE9B00DE0, new D(function30, j04, o0, v1, v, n00, b0, k0, modifier11, modifier7, modifier9, modifier17, c1, o02, z48, z2, function11, v34, density2), p0), p0, 0x180);
        }
        else {
            p0.K();
        }
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new I.E(b0, function10, modifier0, o0, k0, function11, k1, r0, z, v, v1, n0, h00, z1, z2, function30, v2, v3);
        }
    }

    public static final void g(Modifier modifier0, o0 o00, c0.b b0, p p0, int v) {
        p0.S(-20551815);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(o00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            D0.K k0 = B.r.e(g0.b.a, true);
            int v2 = p0.P;
            U.g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            k.a.getClass();
            F0.i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, j.f);
            U.d.K(p0, g00, j.e);
            F0.h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, j.d);
            f0.e(o00, b0, p0, v1 >> 3 & 0x7E);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D0.u(modifier0, o00, b0, v, 4);
        }
    }

    public static final void h(Modifier modifier0, f f0, Function1 function10, boolean z, Map map0, O o0, int v, boolean z1, int v1, int v2, FontFamily.Resolver fontFamily$Resolver0, h h0, w w0, Function1 function11, p p0, int v3, int v4) {
        I.l0 l00;
        Function1 function12;
        MutableState mutableState0;
        Ab.k k0;
        Function0 function00;
        T0 t00;
        p0.S(0x2673E498);
        int v5 = (v3 & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v5 |= (p0.f(f0) ? 0x20 : 16);
        }
        int v6 = 0x80;
        if((v3 & 0x180) == 0) {
            v5 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        int v7 = 0x400;
        if((v3 & 0xC00) == 0) {
            v5 |= (p0.g(z) ? 0x800 : 0x400);
        }
        if((v3 & 0x6000) == 0) {
            v5 |= (p0.h(map0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v3) == 0) {
            v5 |= (p0.f(o0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x180000) == 0) {
            v5 |= (p0.d(v) ? 0x100000 : 0x80000);
        }
        if((v3 & 0xC00000) == 0) {
            v5 |= (p0.g(z1) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x6000000) == 0) {
            v5 |= (p0.d(v1) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x30000000) == 0) {
            v5 |= (p0.d(v2) ? 0x20000000 : 0x10000000);
        }
        int v8 = (v4 & 6) == 0 ? v4 | (p0.h(fontFamily$Resolver0) ? 4 : 2) : v4;
        if((v4 & 0x30) == 0) {
            v8 |= (p0.h(h0) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            if(p0.h(w0)) {
                v6 = 0x100;
            }
            v8 |= v6;
        }
        if((v4 & 0xC00) == 0) {
            if(p0.h(function11)) {
                v7 = 0x800;
            }
            v8 |= v7;
        }
        if((v5 & 306783379) != 306783378 || (v8 & 0x493) != 1170 || !p0.x()) {
            boolean z2 = b.q(f0);
            Z z3 = l.a;
            if(z2) {
                p0.Q(0xDB15E0E1);
                Object object0 = p0.G();
                if((v5 & 0x70) == 0x20 || object0 == z3) {
                    object0 = new T0(f0);
                    p0.a0(object0);
                }
                t00 = (T0)object0;
                p0.p(false);
            }
            else {
                p0.Q(0xDB16C352);
                p0.p(false);
                t00 = null;
            }
            if(b.q(f0)) {
                p0.Q(0xDB19AC0D);
                boolean z4 = p0.f(t00);
                Object object1 = p0.G();
                if(((v5 & 0x70) == 0x20 | z4) != 0 || object1 == z3) {
                    object1 = new D.j(t00, 10, f0);
                    p0.a0(object1);
                }
                function00 = (Function0)object1;
            }
            else {
                p0.Q(0xDB1B52AB);
                Object object2 = p0.G();
                if((v5 & 0x70) == 0x20 || object2 == z3) {
                    object2 = new D0.a0(13, f0);
                    p0.a0(object2);
                }
                function00 = (Function0)object2;
            }
            p0.p(false);
            if(!z) {
                k0 = new Ab.k(null, null);
            }
            else if(map0 != null && !map0.isEmpty()) {
                List list0 = f0.c(0, f0.X.length(), "androidx.compose.foundation.text.inlineContent");
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                int v9 = list0.size();
                int v10 = 0;
                while(v10 < v9) {
                    if(map0.get(((d)list0.get(v10)).a) != null) {
                        throw new ClassCastException();
                    }
                    ++v10;
                    list0 = list0;
                }
                k0 = new Ab.k(arrayList0, arrayList1);
            }
            else {
                k0 = I.h.a;
            }
            List list1 = (List)k0.X;
            List list2 = (List)k0.Y;
            if(z) {
                p0.Q(0xDB1FD1AA);
                Object object3 = p0.G();
                if(object3 == z3) {
                    object3 = U.d.D(null, Z.e);
                    p0.a0(object3);
                }
                mutableState0 = (MutableState)object3;
                p0.p(false);
            }
            else {
                p0.Q(0xDB210A72);
                p0.p(false);
                mutableState0 = null;
            }
            if(z) {
                p0.Q(-618506565);
                boolean z5 = p0.f(mutableState0);
                Object object4 = p0.G();
                if(z5 || object4 == z3) {
                    object4 = new I(mutableState0, 2);
                    p0.a0(object4);
                }
                p0.p(false);
                function12 = (Function1)object4;
            }
            else {
                p0.Q(0xDB234FB2);
                p0.p(false);
                function12 = null;
            }
            Modifier modifier1 = androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0x1FFFF);
            Object object5 = function00.invoke();
            boolean z6 = p0.h(t00);
            Object object6 = p0.G();
            if((z6 | (v5 & 0x380) == 0x100) != 0 || object6 == z3) {
                object6 = new o(t00, function10, 0);
                p0.a0(object6);
            }
            Modifier modifier2 = f0.x(modifier1, ((f)object5), o0, ((Function1)object6), v, z1, v1, v2, fontFamily$Resolver0, list1, function12, h0, w0, function11);
            if(z) {
                p0.Q(-617202116);
                boolean z8 = p0.h(t00);
                Object object8 = p0.G();
                if(z8 || object8 == z3) {
                    object8 = new I.p(t00, 1);
                    p0.a0(object8);
                }
                boolean z9 = p0.f(mutableState0);
                Object object9 = p0.G();
                if(z9 || object9 == z3) {
                    object9 = new C.m(mutableState0, 3);
                    p0.a0(object9);
                }
                l00 = new U0(((Function0)object8), 0, ((Function0)object9));
            }
            else {
                p0.Q(0xDB33CA5D);
                boolean z7 = p0.h(t00);
                Object object7 = p0.G();
                if(z7 || object7 == z3) {
                    object7 = new I.p(t00, 0);
                    p0.a0(object7);
                }
                l00 = new I.l0(((Function0)object7));
            }
            p0.p(false);
            int v11 = p0.P;
            U.g0 g00 = p0.m();
            Modifier modifier3 = g0.a.d(p0, modifier2);
            k.a.getClass();
            F0.i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, l00, j.f);
            U.d.K(p0, g00, j.e);
            F0.h h1 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v11)) {
                m5.b.F(v11, p0, v11, h1);
            }
            U.d.K(p0, modifier3, j.d);
            if(t00 == null) {
                p0.Q(-515480539);
            }
            else {
                p0.Q(0x200A875C);
                t00.a(0, p0);
            }
            p0.p(false);
            if(list2 == null) {
                p0.Q(0xE1472DE3);
            }
            else {
                p0.Q(0xE1472DE4);
                I.h.a(f0, list2, p0, v5 >> 3 & 14);
            }
            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new q(modifier0, f0, function10, z, map0, o0, v, z1, v1, v2, fontFamily$Resolver0, h0, w0, function11, v3, v4);
        }
    }

    public static final void i(o0 o00, p p0, int v) {
        p0.S(-1436003720);
        if((((v & 6) == 0 ? (p0.h(o00) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            if(o00.d == null || !((Boolean)o00.d.o.getValue()).booleanValue()) {
                p0.Q(0xEF0E94BE);
            }
            else {
                f f0 = o00.d == null ? null : o00.d.a.a;
                if(f0 == null || f0.X.length() <= 0) {
                    p0.Q(0xEF0E94BE);
                }
                else {
                    p0.Q(0xEEFC6D68);
                    boolean z = p0.f(o00);
                    Object object0 = p0.G();
                    Z z1 = l.a;
                    if(z || object0 == z1) {
                        object0 = new n0(o00, 0);
                        p0.a0(object0);
                    }
                    Density density0 = (Density)p0.k(G0.f0.f);
                    int v1 = o00.b.l(((int)(o00.j().b >> 0x20)));
                    P0 p00 = o00.d == null ? null : o00.d.d();
                    Nb.j.c(p00);
                    m0.c c0 = p00.a.c(I2.J.r(v1, 0, p00.a.a.a.X.length()));
                    long v2 = yc.d.d(density0.w(z0.a) / 2.0f + c0.a, c0.d);
                    boolean z2 = p0.e(v2);
                    Object object1 = p0.G();
                    if(z2 || object1 == z1) {
                        object1 = new Q(v2);
                        p0.a0(object1);
                    }
                    boolean z3 = p0.h(((I.v0)object0));
                    boolean z4 = p0.h(o00);
                    Object object2 = p0.G();
                    if((z3 | z4) != 0 || object2 == z1) {
                        object2 = new V(((I.v0)object0), o00, null);
                        p0.a0(object2);
                    }
                    SuspendPointerInputElement suspendPointerInputElement0 = new SuspendPointerInputElement(((I.v0)object0), null, ((Function2)object2), 6);
                    boolean z5 = p0.e(v2);
                    Object object3 = p0.G();
                    if(z5 || object3 == z1) {
                        object3 = new I.d(v2, 1);
                        p0.a0(object3);
                    }
                    I.f.a(((M.n)object1), M0.k.a(suspendPointerInputElement0, false, ((Function1)object3)), 0L, p0, 0);
                }
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new B.o(v, 4, o00);
        }
    }

    public static final void j(o0 o00, boolean z, p p0, int v) {
        p0.S(626339208);
        int v1 = (v & 6) == 0 ? (p0.h(o00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && p0.x()) {
            p0.K();
        }
        else if(z) {
            p0.Q(0xB3557EDE);
            I.j0 j00 = o00.d;
            L l0 = null;
            if(j00 != null) {
                P0 p00 = j00.d();
                if(p00 != null) {
                    L l1 = p00.a;
                    if(!(o00.d == null ? true : o00.d.p)) {
                        l0 = l1;
                    }
                }
            }
            if(l0 == null) {
                p0.Q(0xB3596F74);
            }
            else {
                p0.Q(0xB3596F75);
                if(N.b(o00.j().b)) {
                    p0.Q(0x9BE2C2DA);
                }
                else {
                    p0.Q(-1680616096);
                    int v2 = o00.b.l(((int)(o00.j().b >> 0x20)));
                    int v3 = o00.b.l(((int)(o00.j().b & 0xFFFFFFFFL)));
                    Z0.h h0 = l0.a(v2);
                    Z0.h h1 = l0.a(Math.max(v3 - 1, 0));
                    if(o00.d == null || !((Boolean)o00.d.m.getValue()).booleanValue()) {
                        p0.Q(-1679975078);
                    }
                    else {
                        p0.Q(0x9BD9EF1F);
                        M.c0.g(true, h0, o00, p0, v1 << 6 & 0x380 | 6);
                    }
                    p0.p(false);
                    if(o00.d == null || !((Boolean)o00.d.n.getValue()).booleanValue()) {
                        p0.Q(0x9BE27D1A);
                    }
                    else {
                        p0.Q(0x9BDED2A0);
                        M.c0.g(false, h1, o00, p0, v1 << 6 & 0x380 | 6);
                    }
                    p0.p(false);
                }
                p0.p(false);
                I.j0 j01 = o00.d;
                if(j01 != null) {
                    boolean z1 = Nb.j.a(o00.r.a.X, o00.j().a.X);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = j01.l;
                    if(!z1) {
                        parcelableSnapshotMutableState0.setValue(Boolean.FALSE);
                    }
                    if(j01.b()) {
                        if(((Boolean)parcelableSnapshotMutableState0.getValue()).booleanValue()) {
                            o00.o();
                        }
                        else {
                            o00.k();
                        }
                    }
                }
            }
            p0.p(false);
            p0.p(false);
        }
        else {
            p0.Q(0x26D2223F);
            p0.p(false);
            o00.k();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new I.P(o00, z, v);
        }
    }

    public static final void k(I.j0 j00) {
        H h0 = j00.e;
        if(h0 != null) {
            B b0 = B.a(((B)j00.d.Y), null, 0L, 3);
            j00.t.n(b0);
            TextInputService textInputService0 = h0.a;
            AtomicReference atomicReference0 = textInputService0.b;
            while(true) {
                if(atomicReference0.compareAndSet(h0, null)) {
                    textInputService0.a.f();
                    break;
                }
                if(atomicReference0.get() != h0) {
                    break;
                }
            }
        }
        j00.e = null;
    }

    public static final m0.c l(Density density0, int v, U0.I i0, L l0, boolean z, int v1) {
        m0.c c0 = l0 == null ? m0.c.e : l0.c(i0.b.l(v));
        int v2 = density0.I(z0.a);
        float f = z ? ((float)v1) - c0.a - ((float)v2) : c0.a;
        return z ? m0.c.a(c0, f, ((float)v1) - c0.a, 0.0f, 10) : m0.c.a(c0, f, ((float)v2) + c0.a, 0.0f, 10);
    }

    public static final boolean m(int v, KeyEvent keyEvent0) {
        return ((int)(Bb.F.A(keyEvent0) >> 0x20)) == v;
    }

    public static final ArrayList n(List list0, Function0 function00) {
        V0 v00;
        if(((Boolean)function00.invoke()).booleanValue()) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                D0.J j0 = (D0.J)list0.get(v1);
                Object object0 = j0.g();
                Nb.j.d(object0, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                Q0 q00 = ((W0)object0).X;
                L l0 = (L)q00.a.b.getValue();
                if(l0 == null) {
                    v00 = new V0(0, 0, S0.X);
                }
                else {
                    a1.h h0 = hb.h.f0(l0.k(q00.b, q00.c).p());
                    D0.a0 a00 = new D0.a0(16, h0);
                    v00 = new V0(h0.c - h0.a, h0.d - h0.b, a00);
                }
                int v2 = Math.min(v00.Y, 0x3FFFE);
                int v3 = 0x7FFFFFFF;
                int v4 = v00.Y == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v00.Y, 0x3FFFE);
                int v5 = W5.f.j((v4 == 0x7FFFFFFF ? v2 : v4));
                int v6 = v00.Z;
                if(v6 != 0x7FFFFFFF) {
                    v3 = Math.min(v5, v6);
                }
                arrayList0.add(new Ab.k(j0.a(W5.f.b(v2, v4, Math.min(v5, v6), v3)), ((Nb.k)v00.b0)));
            }
            return arrayList0;
        }
        return null;
    }

    public static final void o(TextInputService textInputService0, I.j0 j00, B b0, U0.n n0, U0.v v0) {
        Nb.w w0 = new Nb.w();  // initializer: Ljava/lang/Object;-><init>()V
        m0 m00 = new m0(j00.d, j00.t, w0, 6);
        textInputService0.a.g(b0, n0, m00, j00.u);
        H h0 = new H(textInputService0, textInputService0.a);
        textInputService0.b.set(h0);
        w0.X = h0;
        j00.e = h0;
        f0.v(j00, b0, v0);
    }

    public static final int p(float f) {
        return Math.round(((float)Math.ceil(f)));
    }

    public static final Object q(z0.z z0, I.v0 v00, Fb.j j0) {
        Object object0 = Xb.H.c(new I.o0(z0, v00, null), j0);
        return object0 == Eb.a.X ? object0 : Ab.t.a;
    }

    public static final int r(int v, String s) {
        int v1;
        X1.h h0;
        Integer integer0 = null;
        if(X1.h.c()) {
            h0 = X1.h.a();
            if(h0.b() != 1) {
                h0 = null;
            }
        }
        else {
            h0 = null;
        }
        if(h0 != null) {
            R2.w w0 = (R2.w)h0.e.b;
            w0.getClass();
            if(v < 0 || v >= s.length()) {
                v1 = -1;
            }
            else if(s instanceof Spanned) {
                X1.v[] arr_v = (X1.v[])((Spanned)s).getSpans(v, v + 1, X1.v.class);
                v1 = arr_v.length > 0 ? ((Spanned)s).getSpanEnd(arr_v[0]) : ((X1.o)w0.A(s, Math.max(0, v - 16), Math.min(s.length(), v + 16), 0x7FFFFFFF, true, new X1.o(v))).Z;
            }
            else {
                v1 = ((X1.o)w0.A(s, Math.max(0, v - 16), Math.min(s.length(), v + 16), 0x7FFFFFFF, true, new X1.o(v))).Z;
            }
            Integer integer1 = v1;
            if(v1 != -1) {
                integer0 = integer1;
            }
        }
        if(integer0 != null) {
            return (int)integer0;
        }
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.following(v);
    }

    public static final int s(int v, CharSequence charSequence0) {
        int v1 = charSequence0.length();
        while(v < v1) {
            if(charSequence0.charAt(v) == 10) {
                return v;
            }
            ++v;
        }
        return charSequence0.length();
    }

    public static final int t(int v, CharSequence charSequence0) {
        while(v > 0) {
            if(charSequence0.charAt(v - 1) == 10) {
                return v;
            }
            --v;
        }
        return 0;
    }

    public static final int u(int v, String s) {
        int v2;
        X1.h h0;
        Integer integer0 = null;
        if(X1.h.c()) {
            h0 = X1.h.a();
            if(h0.b() != 1) {
                h0 = null;
            }
        }
        else {
            h0 = null;
        }
        if(h0 != null) {
            int v1 = Math.max(0, v - 1);
            R2.w w0 = (R2.w)h0.e.b;
            w0.getClass();
            if(v1 < 0 || v1 >= s.length()) {
                v2 = -1;
            }
            else if(s instanceof Spanned) {
                X1.v[] arr_v = (X1.v[])((Spanned)s).getSpans(v1, v1 + 1, X1.v.class);
                v2 = arr_v.length > 0 ? ((Spanned)s).getSpanStart(arr_v[0]) : ((X1.o)w0.A(s, Math.max(0, v1 - 16), Math.min(s.length(), v1 + 16), 0x7FFFFFFF, true, new X1.o(v1))).Y;
            }
            else {
                v2 = ((X1.o)w0.A(s, Math.max(0, v1 - 16), Math.min(s.length(), v1 + 16), 0x7FFFFFFF, true, new X1.o(v1))).Y;
            }
            Integer integer1 = v2;
            if(v2 != -1) {
                integer0 = integer1;
            }
        }
        if(integer0 != null) {
            return (int)integer0;
        }
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.preceding(v);
    }

    public static final void v(I.j0 j00, B b0, U0.v v0) {
        e0.g g0 = e0.q.c();
        Function1 function10 = g0 == null ? null : g0.f();
        e0.g g1 = e0.q.d(g0);
        try {
            P0 p00 = j00.d();
            if(p00 == null) {
                return;
            }
            H h0 = j00.e;
            if(h0 == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates0 = j00.c();
            if(layoutCoordinates0 == null) {
                return;
            }
            I.u0 u00 = j00.a;
            boolean z = j00.b();
            f0.w(b0, u00, p00.a, layoutCoordinates0, h0, z, v0);
        }
        finally {
            e0.q.g(g0, g1, function10);
        }
    }

    public static void w(B b0, I.u0 u00, L l0, LayoutCoordinates layoutCoordinates0, H h0, boolean z, U0.v v0) {
        m0.c c0;
        if(!z) {
            return;
        }
        int v1 = v0.l(N.d(b0.b));
        if(v1 < l0.a.a.X.length()) {
            c0 = l0.b(v1);
        }
        else {
            c0 = v1 == 0 ? new m0.c(0.0f, 0.0f, 1.0f, ((float)(((int)(A0.b(u00.b, u00.g, u00.h) & 0xFFFFFFFFL))))) : l0.b(v1 - 1);
        }
        long v2 = layoutCoordinates0.F(yc.d.d(c0.a, c0.b));
        m0.c c1 = yc.l.g(yc.d.d(m0.b.d(v2), m0.b.e(v2)), J2.w.m(c0.d(), c0.c()));
        if(Nb.j.a(((H)h0.a.b.get()), h0)) {
            h0.b.b(c1);
        }
    }

    public static final Modifier x(Modifier modifier0, f f0, O o0, Function1 function10, int v, boolean z, int v1, int v2, FontFamily.Resolver fontFamily$Resolver0, List list0, Function1 function11, h h0, w w0, Function1 function12) {
        if(h0 == null) {
            TextAnnotatedStringElement textAnnotatedStringElement0 = new TextAnnotatedStringElement(f0, o0, fontFamily$Resolver0, function10, v, z, v1, v2, list0, function11, w0, function12);
            return modifier0.d(g0.l.X).d(textAnnotatedStringElement0);
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement0 = new SelectableTextAnnotatedStringElement(f0, o0, fontFamily$Resolver0, function10, v, z, v1, v2, list0, function11, h0, w0);
        return modifier0.d(h0.d0).d(selectableTextAnnotatedStringElement0);
    }

    public static final void y(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException(A3.e.u(v, v1, "both minLines ", " and maxLines ", " must be greater than zero").toString());
        }
        if(v > v1) {
            throw new IllegalArgumentException(A3.e.t(v, v1, "minLines ", " must be less than or equal to maxLines ").toString());
        }
    }
}

