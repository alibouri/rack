package M;

import Aa.P;
import Ab.t;
import D0.b0;
import D0.u;
import E.K;
import F0.i;
import G0.I;
import G0.f0;
import I.j0;
import I.v0;
import I2.J;
import J2.w;
import O0.N;
import R2.f;
import U.H;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.l;
import U.p;
import Z0.h;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import e1.k;
import e1.x;
import g0.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.c;
import n0.g;
import p0.b;
import y.W;

public abstract class c0 {
    public static final c a;
    public static g b;
    public static n0.c c;
    public static b d;

    static {
        c0.a = new c(Infinityf, Infinityf, -Infinityf, -Infinityf);
    }

    public static final void a(n n0, g0.c c0, c0.b b0, p p0, int v) {
        p0.S(476043083);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(n0) : p0.h(n0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(c0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        int v2 = 0;
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            if((v1 & 14) == 4 || (v1 & 8) != 0 && p0.f(n0)) {
                v2 = 1;
            }
            Object object0 = p0.G();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | v2) != 0 || object0 == l.a) {
                object0 = new j(c0, n0);
                p0.a0(object0);
            }
            k.a(((j)object0), null, new x(false, true, true, 1, true, false), b0, p0, v1 << 3 & 0x1C00 | 0x180, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(n0, c0, b0, v, 6);
        }
    }

    public static final void b(Modifier modifier0, q q0, Function1 function10, c0.b b0, p p0, int v) {
        p0.S(2078139907);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(q0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            Object object0 = f.y(new Object[0], i0.l, A.Y, p0, 0xC00, 4);
            Object object1 = p0.G();
            Z z0 = l.a;
            if(object1 == z0) {
                object1 = new a0(((i0)object0));
                p0.a0(object1);
            }
            ((a0)object1).e = (HapticFeedback)p0.k(f0.j);
            ((a0)object1).f = (ClipboardManager)p0.k(f0.d);
            ((a0)object1).g = (TextToolbar)p0.k(f0.o);
            ((a0)object1).d = new P(((a0)object1), 22, function10);
            ((a0)object1).m(q0);
            I.f0.d(((a0)object1), c0.c.c(-123806316, new y(((i0)object0), modifier0, ((a0)object1), b0, 0), p0), p0, 0x30);
            boolean z1 = p0.h(((a0)object1));
            Object object2 = p0.G();
            if(z1 || object2 == z0) {
                object2 = new z(((a0)object1), 0);
                p0.a0(object2);
            }
            H.b(((a0)object1), ((Function1)object2), p0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new K(modifier0, q0, function10, b0, v);
        }
    }

    public static final void c(Modifier modifier0, c0.b b0, p p0, int v) {
        p0.S(0xBFE532B0);
        int v1 = (v & 0x30) == 0 ? v | 6 | (p0.h(b0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) != 18 || !p0.x()) {
            modifier0 = g0.l.X;
            Object object0 = p0.G();
            Z z0 = l.a;
            if(object0 == z0) {
                object0 = d.D(null, Z.e);
                p0.a0(object0);
            }
            q q0 = (q)((MutableState)object0).getValue();
            Object object1 = p0.G();
            if(object1 == z0) {
                object1 = new I(((MutableState)object0), 4);
                p0.a0(object1);
            }
            c0.b(modifier0, q0, ((Function1)object1), b0, p0, v1 & 14 | 0x180 | v1 << 6 & 0x1C00);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new v(modifier0, b0, v, 0);
        }
    }

    public static final void d(n n0, boolean z, h h0, boolean z1, long v, SuspendPointerInputElement suspendPointerInputElement0, p p0, int v1) {
        long v4;
        long v6;
        int v5;
        int v2 = 1;
        p0.S(-843755800);
        int v3 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? p0.f(n0) : p0.h(n0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= (p0.f(h0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (p0.g(z1) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v3 |= 0x2000;
        }
        if((0x30000 & v1) == 0) {
            v3 |= (p0.f(suspendPointerInputElement0) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !p0.x()) {
            p0.M();
            if((v1 & 1) == 0 || p0.w()) {
                v5 = v3 & 0xFFFF1FFF;
                v6 = 0x7FC000007FC00000L;
            }
            else {
                p0.K();
                v5 = v3 & 0xFFFF1FFF;
                v6 = v;
            }
            p0.q();
            boolean z2 = z ? h0 != h.X && !z1 || h0 == h.Y && z1 : (h0 != h.X || z1) && (h0 != h.Y || !z1);
            g0.d d0 = z2 ? a.b : a.a;
            int v7 = (v5 & 14) == 4 || (v5 & 8) != 0 && p0.h(n0) ? 1 : 0;
            if((v5 & 0x70) != 0x20) {
                v2 = 0;
            }
            boolean z3 = p0.g(z2);
            Object object0 = p0.G();
            if((v2 | v7 | z3) != 0 || object0 == l.a) {
                object0 = new e(n0, z, z2);
                p0.a0(object0);
            }
            Modifier modifier0 = M0.k.a(suspendPointerInputElement0, false, ((Function1)object0));
            c0.a(n0, d0, c0.c.c(0x10B320D1, new M.c(((ViewConfiguration)p0.k(f0.q)), v6, z2, modifier0, n0), p0), p0, v5 & 14 | 0x180);
            v4 = v6;
        }
        else {
            p0.K();
            v4 = v;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new M.d(n0, z, h0, z1, v4, suspendPointerInputElement0, v1);
        }
    }

    public static final void e(int v, p p0, Modifier modifier0, Function0 function00, boolean z) {
        p0.S(0x7DDD909A);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.g(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Modifier modifier1 = androidx.compose.foundation.layout.c.l(modifier0, L.a, L.b);
            M.h h0 = new M.h(function00, z);
            B.e.b(p0, a.b(modifier1, G0.j.e0, h0));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new M.f(modifier0, function00, z, v);
        }
    }

    public static final void f(Modifier modifier0, c0.b b0, p p0, int v) {
        p0.S(0x8284C1D0);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            k0 k00 = k0.a;
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k00, F0.j.f);
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
            l00.d = new v(modifier0, b0, v, 1);
        }
    }

    public static final void g(boolean z, h h0, o0 o00, p p0, int v) {
        p0.S(0xAFDBA8B8);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(h0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(o00) ? 0x100 : 0x80);
        }
        boolean z1 = false;
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            boolean z2 = p0.f(o00);
            Object object0 = p0.G();
            Z z3 = l.a;
            if(((v1 & 14) == 4 | z2) != 0 || object0 == z3) {
                object0 = new Y(o00, z);
                p0.a0(object0);
            }
            boolean z4 = p0.h(o00);
            if((v1 & 14) == 4) {
                z1 = true;
            }
            Object object1 = p0.G();
            if((z4 | z1) != 0 || object1 == z3) {
                object1 = new p0(o00, z);
                p0.a0(object1);
            }
            boolean z5 = N.f(o00.j().b);
            boolean z6 = p0.h(((v0)object0));
            Object object2 = p0.G();
            if(z6 || object2 == z3) {
                object2 = new q0(((v0)object0), null);
                p0.a0(object2);
            }
            c0.d(((n)object1), z, h0, z5, 0L, new SuspendPointerInputElement(((v0)object0), null, ((Function2)object2), 6), p0, v1 << 3 & 0x3F0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new M.f(z, h0, o00, v);
        }
    }

    public static final q h(M m0, M.i i0) {
        return m0.l() == 1 ? new q(c0.m(m0.g(), true, true, m0.h(), i0), c0.m(m0.k(), true, false, m0.i(), i0), true) : new q(c0.m(m0.g(), false, true, m0.h(), i0), c0.m(m0.k(), false, false, m0.i(), i0), false);
    }

    public static final Object i(z0.x x0, Fb.a a0) {
        C c0;
        if(a0 instanceof C) {
            c0 = (C)a0;
            int v = c0.d0;
            if((v & 0x80000000) == 0) {
                c0 = new C(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                c0.d0 = v ^ 0x80000000;
            }
        }
        else {
            c0 = new C(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = c0.c0;
        Object object1 = Eb.a.X;
        switch(c0.d0) {
            case 0: {
                W5.f.b0(object0);
                goto label_24;
            }
            case 1: {
                x0 = c0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            Object object2 = ((z0.f)object0).a;
            int v1 = ((List)object2).size();
            int v2 = 0;
            while(true) {
                if(v2 >= v1) {
                    break alab1;
                }
                if(z0.l.a(((z0.n)((List)object2).get(v2)))) {
                    ++v2;
                    continue;
                }
            label_24:
                c0.b0 = x0;
                c0.d0 = 1;
                object0 = x0.c(z0.g.Y, c0);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return (z0.f)object0;
    }

    public static final Object j(z0.x x0, M.k k0, A7.b b0, z0.f f0, Fb.a a0) {
        r r0;
        D d0;
        if(a0 instanceof D) {
            d0 = (D)a0;
            int v = d0.e0;
            if((v & 0x80000000) == 0) {
                d0 = new D(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                d0.e0 = v ^ 0x80000000;
            }
        }
        else {
            d0 = new D(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = d0.d0;
        Object object1 = Eb.a.X;
        int v1 = 0;
        switch(d0.e0) {
            case 0: {
                W5.f.b0(object0);
                z0.n n1 = (z0.n)b0.b0;
                z0.n n2 = (z0.n)((List)f0.a).get(0);
                if(n1 == null) {
                    b0.Y = 1;
                }
                else {
                    ViewConfiguration viewConfiguration0 = (ViewConfiguration)b0.Z;
                    long v3 = viewConfiguration0.b();
                    if(n2.b - n1.b < v3) {
                        float f1 = n1.i == 2 ? viewConfiguration0.d() * W.a : viewConfiguration0.d();
                        if(m0.b.c(m0.b.h(n1.c, n2.c)) < f1) {
                            ++b0.Y;
                        }
                        else {
                            b0.Y = 1;
                        }
                    }
                    else {
                        b0.Y = 1;
                    }
                }
                b0.b0 = n2;
                z0.n n3 = (z0.n)((List)f0.a).get(0);
                switch(b0.Y) {
                    case 1: {
                        r0 = s.d;
                        break;
                    }
                    case 2: {
                        r0 = s.e;
                        break;
                    }
                    default: {
                        r0 = s.f;
                    }
                }
                if(k0.p(n3.c, r0)) {
                    P p0 = new P(k0, 21, r0);
                    d0.b0 = x0;
                    d0.c0 = k0;
                    d0.e0 = 2;
                    object0 = W.c(x0, n3.a, p0, d0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_63;
                }
                break;
            }
            case 1: {
                M.k k1 = d0.c0;
                z0.x x1 = d0.b0;
                W5.f.b0(object0);
                if(((Boolean)object0).booleanValue()) {
                    Object object2 = x1.c0.q0.a;
                    int v2 = ((List)object2).size();
                    while(v1 < v2) {
                        z0.n n0 = (z0.n)((List)object2).get(v1);
                        if(z0.l.b(n0)) {
                            n0.a();
                        }
                        ++v1;
                    }
                }
                k1.g();
                return t.a;
            }
            case 2: {
                k0 = d0.c0;
                x0 = d0.b0;
                W5.f.b0(object0);
            label_63:
                if(((Boolean)object0).booleanValue()) {
                    Object object3 = x0.c0.q0.a;
                    int v4 = ((List)object3).size();
                    while(v1 < v4) {
                        z0.n n4 = (z0.n)((List)object3).get(v1);
                        if(z0.l.b(n4)) {
                            n4.a();
                        }
                        ++v1;
                    }
                }
                k0.g();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }

    public static final Object k(z0.x x0, v0 v00, z0.f f0, Fb.a a0) {
        Object object1;
        Object object0;
        G g0;
        if(a0 instanceof G) {
            g0 = (G)a0;
            int v = g0.f0;
            if((v & 0x80000000) == 0) {
                g0 = new G(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                g0.f0 = v ^ 0x80000000;
            }
        }
        else {
            g0 = new G(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        try {
            object0 = g0.e0;
            object1 = Eb.a.X;
            switch(g0.f0) {
                case 0: {
                    goto label_14;
                }
                case 1: {
                    goto label_23;
                }
                case 2: {
                    goto label_43;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            v00.onCancel();
            throw cancellationException0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_14:
        W5.f.b0(object0);
        try {
            z0.n n0 = (z0.n)Bb.p.p0(((List)f0.a));
            g0.b0 = x0;
            g0.c0 = v00;
            g0.d0 = n0;
            g0.f0 = 1;
            object0 = W.b(x0, n0.a, g0);
            if(object0 == object1) {
                return object1;
            }
            goto label_29;
        label_23:
            z0.n n1 = g0.d0;
            v00 = g0.c0;
            z0.x x1 = g0.b0;
            W5.f.b0(object0);
            n0 = n1;
            x0 = x1;
        label_29:
            if(((z0.n)object0) != null) {
                long v2 = ((z0.n)object0).c;
                ViewConfiguration viewConfiguration0 = x0.f();
                float f1 = n0.i == 2 ? viewConfiguration0.d() * W.a : viewConfiguration0.d();
                if(m0.b.c(m0.b.h(n0.c, v2)) < f1) {
                    v00.c(v2);
                    I.p0 p00 = new I.p0(v00, 1);
                    g0.b0 = x0;
                    g0.c0 = v00;
                    g0.d0 = null;
                    g0.f0 = 2;
                    object0 = W.c(x0, ((z0.n)object0).a, p00, g0);
                    if(object0 == object1) {
                        return object1;
                    label_43:
                        v00 = g0.c0;
                        x0 = g0.b0;
                        W5.f.b0(object0);
                    }
                    if(((Boolean)object0).booleanValue()) {
                        Object object2 = x0.c0.q0.a;
                        int v3 = ((List)object2).size();
                        for(int v1 = 0; v1 < v3; ++v1) {
                            z0.n n2 = (z0.n)((List)object2).get(v1);
                            if(z0.l.b(n2)) {
                                n2.a();
                            }
                        }
                        v00.a();
                        return t.a;
                    }
                    v00.onCancel();
                }
            }
            return t.a;
        }
        catch(CancellationException cancellationException0) {
            v00.onCancel();
            throw cancellationException0;
        }
    }

    public static final M.p l(M m0, o o0, M.p p0) {
        int v = m0.a() ? o0.c : o0.d;
        if((m0.a() ? m0.h() : m0.i()) != o0.b) {
            return o0.a(v);
        }
        Ab.h h0 = W4.f.z(new M.u(o0, v));
        Ab.h h1 = W4.f.z(new M.t(o0, v, (m0.a() ? o0.d : o0.c), m0, h0));
        if(o0.a != p0.c) {
            return (M.p)((Ab.u)h1).getValue();
        }
        int v1 = o0.e;
        if(v != v1) {
            O0.L l0 = o0.f;
            int v2 = l0.f(v1);
            if(((Number)((Ab.u)h0).getValue()).intValue() != v2) {
                return (M.p)((Ab.u)h1).getValue();
            }
            boolean z = true;
            int v3 = p0.b;
            long v4 = l0.l(v3);
            boolean z1 = m0.a();
            if(v1 != -1) {
                if(v == v1) {
                    return o0.a(v);
                }
                if(o0.b() != 1) {
                    z = false;
                }
                if((z1 ^ z) != 0) {
                    if(v >= v1) {
                        return o0.a(v);
                    }
                    return v3 == ((int)(v4 >> 0x20)) || v3 == ((int)(v4 & 0xFFFFFFFFL)) ? ((M.p)((Ab.u)h1).getValue()) : o0.a(v);
                }
                if(v <= v1) {
                    return o0.a(v);
                }
            }
            return v3 == ((int)(v4 >> 0x20)) || v3 == ((int)(v4 & 0xFFFFFFFFL)) ? ((M.p)((Ab.u)h1).getValue()) : o0.a(v);
        }
        return p0;
    }

    public static final M.p m(o o0, boolean z, boolean z1, int v, M.i i0) {
        int v1 = z1 ? o0.c : o0.d;
        if(v != o0.b) {
            return o0.a(v1);
        }
        long v2 = i0.a(o0, v1);
        return (z ^ z1) == 0 ? o0.a(((int)(0xFFFFFFFFL & v2))) : o0.a(((int)(v2 >> 0x20)));
    }

    public static final int n(int v, int v1, M.N n0, long v2, M.p p0) {
        if(p0 != null) {
            int v3 = n0.f.compare(((long)p0.c), v2);
            if(v3 < 0) {
                return 1;
            }
            return v3 <= 0 ? 2 : 3;
        }
        return c0.x(v, v1);
    }

    public static final M.p o(M.p p0, o o0, int v) {
        return new M.p(o0.f.a(v), v, p0.c);
    }

    public static final boolean p(c c0, long v) {
        float f = m0.b.d(v);
        if(c0.a > f && f > c0.c) {
            float f1 = m0.b.e(v);
            return c0.b > f1 && f1 > c0.d;
        }
        return false;
    }

    public static final g q(k0.c c0, float f) {
        b b1;
        int v = ((int)(((float)Math.ceil(f)))) * 2;
        g g0 = c0.b;
        n0.c c1 = c0.c;
        b b0 = c0.d;
        if(g0 == null || c1 == null || (v > g0.a.getWidth() || v > g0.a.getHeight())) {
            g0 = n0.M.f(v, v, 1);
            c0.b = g0;
            c1 = n0.M.a(g0);
            c0.c = c1;
        }
        if(b0 == null) {
            b1 = new b();
            c0.d = b1;
        }
        else {
            b1 = b0;
        }
        LayoutDirection layoutDirection0 = c0.X.getLayoutDirection();
        long v1 = w.m(g0.a.getWidth(), g0.a.getHeight());
        Density density0 = b1.X.a;
        LayoutDirection layoutDirection1 = b1.X.b;
        n0.t t0 = b1.X.c;
        long v2 = b1.X.d;
        b1.X.a = c0;
        b1.X.b = layoutDirection0;
        b1.X.c = c1;
        b1.X.d = v1;
        c1.n();
        long v3 = b1.Y.A();
        m5.b.l(b1, n0.v.b, 0L, v3, 0.0f, 58);
        m5.b.l(b1, 0xFF00000000000000L, 0L, w.m(f, f), 0.0f, 120);
        m5.b.d(b1, 0xFF00000000000000L, f, yc.d.d(f, f), null, 120);
        c1.l();
        b1.X.a = density0;
        b1.X.b = layoutDirection1;
        b1.X.c = t0;
        b1.X.d = v2;
        return g0;
    }

    public static final long r(a0 a00, long v, M.p p0) {
        float f3;
        float f2;
        float f1;
        long v3;
        m m0 = (m)a00.a.c.e(p0.c);
        if(m0 == null) {
            return 0x7FC000007FC00000L;
        }
        LayoutCoordinates layoutCoordinates0 = a00.k;
        if(layoutCoordinates0 == null) {
            return 0x7FC000007FC00000L;
        }
        LayoutCoordinates layoutCoordinates1 = m0.c();
        if(layoutCoordinates1 == null) {
            return 0x7FC000007FC00000L;
        }
        L.g g0 = m0.c;
        O0.L l0 = (O0.L)g0.invoke();
        int v1 = l0 == null ? 0 : m0.b(l0);
        int v2 = p0.b;
        if(v2 > v1) {
            return 0x7FC000007FC00000L;
        }
        m0.b b0 = (m0.b)a00.q.getValue();
        Nb.j.c(b0);
        float f = m0.b.d(layoutCoordinates1.j(layoutCoordinates0, b0.a));
        O0.L l1 = (O0.L)g0.invoke();
        if(l1 == null) {
            v3 = N.b;
        }
        else {
            int v4 = m0.b(l1);
            if(v4 < 1) {
                v3 = N.b;
            }
            else {
                int v5 = l1.f(J.r(v2, 0, v4 - 1));
                v3 = O0.n.b(l1.i(v5), l1.e(v5, true));
            }
        }
        if(N.b(v3)) {
            O0.L l2 = (O0.L)g0.invoke();
            if(l2 == null) {
                f1 = -1.0f;
            }
            else {
                int v6 = l2.f(v2);
                f1 = v6 < l2.b.f ? l2.g(v6) : -1.0f;
            }
        }
        else {
            O0.L l3 = (O0.L)g0.invoke();
            if(l3 == null) {
                f2 = -1.0f;
            }
            else {
                int v7 = l3.f(((int)(v3 >> 0x20)));
                f2 = v7 < l3.b.f ? l3.g(v7) : -1.0f;
            }
            O0.L l4 = (O0.L)g0.invoke();
            if(l4 == null) {
                f3 = -1.0f;
            }
            else {
                int v8 = l4.f(((int)(0xFFFFFFFFL & v3)) - 1);
                f3 = v8 < l4.b.f ? l4.h(v8) : -1.0f;
            }
            f1 = J.q(f, Math.min(f2, f3), Math.max(f2, f3));
        }
        if(f1 == -1.0f) {
            return 0x7FC000007FC00000L;
        }
        if(!IntSize.a(v, 0L) && Math.abs(f - f1) <= ((float)(((int)(v >> 0x20)) / 2))) {
            return 0x7FC000007FC00000L;
        }
        O0.L l5 = (O0.L)g0.invoke();
        if(l5 != null) {
            int v9 = l5.f(v2);
            O0.s s0 = l5.b;
            if(v9 < s0.f) {
                float f4 = s0.d(v9);
                float f5 = (s0.b(v9) - f4) / 2.0f + f4;
                return f5 == -1.0f ? 0x7FC000007FC00000L : layoutCoordinates0.j(layoutCoordinates1, yc.d.d(f1, f5));
            }
        }
        return 0x7FC000007FC00000L;
    }

    public static final int s(long v, O0.L l0) {
        if(m0.b.e(v) <= 0.0f) {
            return 0;
        }
        return m0.b.e(v) >= l0.b.e ? l0.a.a.X.length() : l0.b.e(v);
    }

    public static final long t(O0.L l0, int v, boolean z, boolean z1) {
        int v1 = l0.f(v);
        O0.s s0 = l0.b;
        if(v1 >= s0.f) {
            return 0x7FC000007FC00000L;
        }
        s0.j(v);
        int v2 = v == ((O0.f)s0.a.X).X.length() ? Bb.q.y(s0.h) : O0.n.d(v, s0.h);
        O0.u u0 = (O0.u)s0.h.get(v2);
        int v3 = u0.b(v);
        P0.y y0 = u0.a.d;
        return l0.a(((!z || z1) && (z || !z1) ? Math.max(v - 1, 0) : v)) == l0.j(v) ? yc.d.d(J.q(y0.i(v3, false), 0.0f, ((int)(l0.c >> 0x20))), J.q(s0.b(v1), 0.0f, ((int)(l0.c & 0xFFFFFFFFL)))) : yc.d.d(J.q(y0.h(v3, false), 0.0f, ((int)(l0.c >> 0x20))), J.q(s0.b(v1), 0.0f, ((int)(l0.c & 0xFFFFFFFFL))));
    }

    public static final h u(O0.L l0, int v) {
        O0.K k0 = l0.a;
        if(k0.a.X.length() != 0) {
            int v1 = l0.f(v);
            return (v == 0 || v1 != l0.f(v - 1)) && (v == k0.a.X.length() || v1 != l0.f(v + 1)) ? l0.j(v) : l0.a(v);
        }
        return l0.j(v);
    }

    public static final boolean v(z0.f f0) {
        Object object0 = f0.a;
        int v = ((List)object0).size();
        int v1 = 0;
        while(v1 < v) {
            if(z0.l.e(((z0.n)((List)object0).get(v1)).i, 2)) {
                ++v1;
                continue;
            }
            return false;
        }
        return true;
    }

    public static final boolean w(o0 o00, boolean z) {
        j0 j00 = o00.d;
        if(j00 != null) {
            LayoutCoordinates layoutCoordinates0 = j00.c();
            return layoutCoordinates0 == null ? false : c0.p(c0.y(layoutCoordinates0), o00.i(z));
        }
        return false;
    }

    public static final int x(int v, int v1) {
    alab1:
        switch(v.h.d(v1)) {
            case 0: {
                return 1;
            }
            case 1: {
                switch(v.h.d(v)) {
                    case 0: {
                        return 1;
                    }
                    case 1: {
                        return 2;
                    }
                    case 2: {
                        break alab1;
                    }
                    default: {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
            case 2: {
                break;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        return 3;
    }

    public static final c y(LayoutCoordinates layoutCoordinates0) {
        c c0 = b0.f(layoutCoordinates0);
        long v = layoutCoordinates0.c(yc.d.d(c0.a, c0.b));
        long v1 = layoutCoordinates0.c(yc.d.d(c0.c, c0.d));
        return new c(m0.b.d(v), m0.b.e(v), m0.b.d(v1), m0.b.e(v1));
    }
}

