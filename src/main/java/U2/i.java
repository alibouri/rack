package U2;

import Ab.t;
import Eb.a;
import I2.J;
import N9.c;
import N9.d;
import T4.l;
import W5.f;
import Y8.g4;
import Y8.m2;
import Y8.t3;
import Y8.z6;
import Z2.m;
import Z2.p;
import a9.H1;
import ac.Y;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.fragment.TransferAmountFieldFragment;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.TooltipTarget.HOME_ACCOUNT_SWITCHER_PILL;
import com.sendwave.util.Country;
import f9.g0;
import f9.h0;
import f9.i0;
import f9.k0;
import f9.o;
import f9.y;
import f9.z;
import ha.A2;
import ha.F;
import ha.N0;
import ha.h2;
import ha.i2;
import ha.k2;
import ha.l2;
import ha.p2;
import ha.q2;
import ha.q;
import ha.r2;
import ha.s2;
import ha.t2;
import ha.u2;
import ha.w2;
import ha.x2;
import ha.y2;
import ha.z2;
import j3.b;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.g;
import m0.e;
import q9.M0;

public final class i implements ac.i {
    public final int X;
    public final ac.i Y;

    public i(ac.i i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        A2 a20;
        z2 z20;
        y2 y20;
        x2 x20;
        w2 w20;
        u2 u20;
        t2 t20;
        s2 s20;
        r2 r20;
        q2 q20;
        p2 p20;
        l2 l20;
        k2 k20;
        i2 i20;
        h2 h20;
        N0 n00;
        F f2;
        q q1;
        k0 k00;
        i0 i00;
        h0 h00;
        g0 g00;
        z z1;
        y y1;
        f9.q q0;
        o o0;
        Y y0;
        p p0;
        m m0;
        h h0;
        b b0 = b.b;
        boolean z = false;
        Object object1 = null;
        Object object2 = t.a;
        ac.i i0 = this.Y;
        switch(this.X) {
            case 0: {
                if(g0 instanceof h) {
                    h0 = (h)g0;
                    int v1 = h0.c0;
                    if((v1 & 0x80000000) == 0) {
                        h0 = new h(this, g0);
                    }
                    else {
                        h0.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    h0 = new h(this, g0);
                }
                Object object4 = h0.b0;
                a a1 = a.X;
                switch(h0.c0) {
                    case 0: {
                        f.b0(object4);
                        if(object0 instanceof N2.b) {
                            h0.c0 = 1;
                            if(i0.c(object0, h0) == a1) {
                                return a1;
                            }
                        }
                        return object2;
                    }
                    case 1: {
                        f.b0(object4);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof m) {
                    m0 = (m)g0;
                    int v2 = m0.c0;
                    if((v2 & 0x80000000) == 0) {
                        m0 = new m(this, g0);
                    }
                    else {
                        m0.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    m0 = new m(this, g0);
                }
                Object object5 = m0.b0;
                a a2 = a.X;
                switch(m0.c0) {
                    case 0: {
                        f.b0(object5);
                        long v3 = ((e)object0).a;
                        if(v3 == 0x7FC000007FC00000L) {
                            object1 = j3.h.c;
                        }
                        else if(((double)e.d(v3)) < 0.5 && ((double)e.b(v3)) < 0.5) {
                            float f = e.d(v3);
                            b b1 = Float.isInfinite(f) || Float.isNaN(f) ? b0 : new j3.a(Pb.a.H(e.d(v3)));
                            float f1 = e.b(v3);
                            if(!Float.isInfinite(f1) && !Float.isNaN(f1)) {
                                b0 = new j3.a(Pb.a.H(e.b(v3)));
                            }
                            object1 = new j3.h(b1, b0);
                        }
                        if(object1 != null) {
                            m0.c0 = 1;
                            if(i0.c(object1, m0) == a2) {
                                return a2;
                            }
                        }
                        return object2;
                    }
                    case 1: {
                        f.b0(object5);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                if(g0 instanceof p) {
                    p0 = (p)g0;
                    int v4 = p0.c0;
                    if((v4 & 0x80000000) == 0) {
                        p0 = new p(this, g0);
                    }
                    else {
                        p0.c0 = v4 ^ 0x80000000;
                    }
                }
                else {
                    p0 = new p(this, g0);
                }
                Object object6 = p0.b0;
                a a3 = a.X;
                switch(p0.c0) {
                    case 0: {
                        f.b0(object6);
                        long v5 = ((a1.a)object0).a;
                        if(!a1.a.k(v5)) {
                            j3.a a4 = a1.a.d(v5) ? new j3.a(a1.a.h(v5)) : b0;
                            if(a1.a.c(v5)) {
                                b0 = new j3.a(a1.a.g(v5));
                            }
                            object1 = new j3.h(a4, b0);
                        }
                        if(object1 != null) {
                            p0.c0 = 1;
                            if(i0.c(object1, p0) == a3) {
                                return a3;
                            }
                        }
                        return object2;
                    }
                    case 1: {
                        f.b0(object6);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                if(g0 instanceof Y) {
                    y0 = (Y)g0;
                    int v6 = y0.c0;
                    if((v6 & 0x80000000) == 0) {
                        y0 = new Y(this, g0);
                    }
                    else {
                        y0.c0 = v6 ^ 0x80000000;
                    }
                }
                else {
                    y0 = new Y(this, g0);
                }
                Object object7 = y0.b0;
                a a5 = a.X;
                switch(y0.c0) {
                    case 0: {
                        f.b0(object7);
                        if(object0 != null) {
                            y0.c0 = 1;
                            if(i0.c(object0, y0) == a5) {
                                return a5;
                            }
                        }
                        return object2;
                    }
                    case 1: {
                        f.b0(object7);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 4: {
                if(g0 instanceof o) {
                    o0 = (o)g0;
                    int v7 = o0.c0;
                    if((v7 & 0x80000000) == 0) {
                        o0 = new o(this, g0);
                    }
                    else {
                        o0.c0 = v7 ^ 0x80000000;
                    }
                }
                else {
                    o0 = new o(this, g0);
                }
                Object object8 = o0.b0;
                a a6 = a.X;
                switch(o0.c0) {
                    case 0: {
                        f.b0(object8);
                        if(((t3)object0) != t3.b0 && ((t3)object0) != t3.c0) {
                            z = true;
                        }
                        o0.c0 = 1;
                        return i0.c(Boolean.valueOf(z), o0) == a6 ? a6 : object2;
                    }
                    case 1: {
                        f.b0(object8);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 5: {
                if(g0 instanceof f9.q) {
                    q0 = (f9.q)g0;
                    int v8 = q0.c0;
                    if((v8 & 0x80000000) == 0) {
                        q0 = new f9.q(this, g0);
                    }
                    else {
                        q0.c0 = v8 ^ 0x80000000;
                    }
                }
                else {
                    q0 = new f9.q(this, g0);
                }
                Object object9 = q0.b0;
                a a7 = a.X;
                switch(q0.c0) {
                    case 0: {
                        f.b0(object9);
                        if(((t3)object0) == t3.b0) {
                            z = true;
                        }
                        q0.c0 = 1;
                        return i0.c(Boolean.valueOf(z), q0) == a7 ? a7 : object2;
                    }
                    case 1: {
                        f.b0(object9);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 6: {
                if(g0 instanceof y) {
                    y1 = (y)g0;
                    int v9 = y1.c0;
                    if((v9 & 0x80000000) == 0) {
                        y1 = new y(this, g0);
                    }
                    else {
                        y1.c0 = v9 ^ 0x80000000;
                    }
                }
                else {
                    y1 = new y(this, g0);
                }
                Object object10 = y1.b0;
                a a8 = a.X;
                switch(y1.c0) {
                    case 0: {
                        f.b0(object10);
                        y1.c0 = 1;
                        return i0.c((((Boolean)object0).booleanValue() ? t3.Y : t3.c0), y1) == a8 ? a8 : object2;
                    }
                    case 1: {
                        f.b0(object10);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 7: {
                if(g0 instanceof z) {
                    z1 = (z)g0;
                    int v10 = z1.c0;
                    if((v10 & 0x80000000) == 0) {
                        z1 = new z(this, g0);
                    }
                    else {
                        z1.c0 = v10 ^ 0x80000000;
                    }
                }
                else {
                    z1 = new z(this, g0);
                }
                Object object11 = z1.b0;
                a a9 = a.X;
                switch(z1.c0) {
                    case 0: {
                        f.b0(object11);
                        z1.c0 = 1;
                        return i0.c(new Integer(((String)object0).length()), z1) == a9 ? a9 : object2;
                    }
                    case 1: {
                        f.b0(object11);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 8: {
                if(g0 instanceof g0) {
                    g00 = (g0)g0;
                    int v11 = g00.c0;
                    if((v11 & 0x80000000) == 0) {
                        g00 = new g0(this, g0);
                    }
                    else {
                        g00.c0 = v11 ^ 0x80000000;
                    }
                }
                else {
                    g00 = new g0(this, g0);
                }
                Object object12 = g00.b0;
                a a10 = a.X;
                switch(g00.c0) {
                    case 0: {
                        f.b0(object12);
                        g00.c0 = 1;
                        return i0.c(((TransferAmountFieldFragment)object0).c, g00) == a10 ? a10 : object2;
                    }
                    case 1: {
                        f.b0(object12);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 9: {
                if(g0 instanceof h0) {
                    h00 = (h0)g0;
                    int v12 = h00.c0;
                    if((v12 & 0x80000000) == 0) {
                        h00 = new h0(this, g0);
                    }
                    else {
                        h00.c0 = v12 ^ 0x80000000;
                    }
                }
                else {
                    h00 = new h0(this, g0);
                }
                Object object13 = h00.b0;
                a a11 = a.X;
                switch(h00.c0) {
                    case 0: {
                        f.b0(object13);
                        h00.c0 = 1;
                        return i0.c(((Country)object0).i0, h00) == a11 ? a11 : object2;
                    }
                    case 1: {
                        f.b0(object13);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 10: {
                if(g0 instanceof i0) {
                    i00 = (i0)g0;
                    int v13 = i00.c0;
                    if((v13 & 0x80000000) == 0) {
                        i00 = new i0(this, g0);
                    }
                    else {
                        i00.c0 = v13 ^ 0x80000000;
                    }
                }
                else {
                    i00 = new i0(this, g0);
                }
                Object object14 = i00.b0;
                a a12 = a.X;
                switch(i00.c0) {
                    case 0: {
                        f.b0(object14);
                        DecimalFormat decimalFormat0 = M0.d(((Currency)object0));
                        i00.c0 = 1;
                        return i0.c(decimalFormat0, i00) == a12 ? a12 : object2;
                    }
                    case 1: {
                        f.b0(object14);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 11: {
                if(g0 instanceof k0) {
                    k00 = (k0)g0;
                    int v14 = k00.c0;
                    if((v14 & 0x80000000) == 0) {
                        k00 = new k0(this, g0);
                    }
                    else {
                        k00.c0 = v14 ^ 0x80000000;
                    }
                }
                else {
                    k00 = new k0(this, g0);
                }
                Object object15 = k00.b0;
                a a13 = a.X;
                switch(k00.c0) {
                    case 0: {
                        f.b0(object15);
                        k00.c0 = 1;
                        return i0.c(((TransferAmountFieldFragment)object0).j, k00) == a13 ? a13 : object2;
                    }
                    case 1: {
                        f.b0(object15);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 12: {
                if(g0 instanceof q) {
                    q1 = (q)g0;
                    int v15 = q1.c0;
                    if((v15 & 0x80000000) == 0) {
                        q1 = new q(this, g0);
                    }
                    else {
                        q1.c0 = v15 ^ 0x80000000;
                    }
                }
                else {
                    q1 = new q(this, g0);
                }
                Object object16 = q1.b0;
                a a14 = a.X;
                switch(q1.c0) {
                    case 0: {
                        f.b0(object16);
                        g4 g40 = (g4)((z6)object0).b();
                        if(g40 != null) {
                            object1 = g40.a.b.b.d;
                        }
                        if(((Collection)object1) == null || ((Collection)object1).isEmpty()) {
                            z = true;
                        }
                        q1.c0 = 1;
                        return i0.c(Boolean.valueOf(!z), q1) == a14 ? a14 : object2;
                    }
                    case 1: {
                        f.b0(object16);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 13: {
                if(g0 instanceof F) {
                    f2 = (F)g0;
                    int v16 = f2.c0;
                    if((v16 & 0x80000000) == 0) {
                        f2 = new F(this, g0);
                    }
                    else {
                        f2.c0 = v16 ^ 0x80000000;
                    }
                }
                else {
                    f2 = new F(this, g0);
                }
                Object object17 = f2.b0;
                a a15 = a.X;
                switch(f2.c0) {
                    case 0: {
                        f.b0(object17);
                        f2.c0 = 1;
                        return i0.c(Boolean.valueOf(!((List)object0).isEmpty()), f2) == a15 ? a15 : object2;
                    }
                    case 1: {
                        f.b0(object17);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 14: {
                if(g0 instanceof N0) {
                    n00 = (N0)g0;
                    int v17 = n00.c0;
                    if((v17 & 0x80000000) == 0) {
                        n00 = new N0(this, g0);
                    }
                    else {
                        n00.c0 = v17 ^ 0x80000000;
                    }
                }
                else {
                    n00 = new N0(this, g0);
                }
                Object object18 = n00.b0;
                a a16 = a.X;
                switch(n00.c0) {
                    case 0: {
                        f.b0(object18);
                        n00.c0 = 1;
                        return i0.c(((CustomerHomeFragment)((m2)object0).a).d.h.c.r.c, n00) == a16 ? a16 : object2;
                    }
                    case 1: {
                        f.b0(object18);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 15: {
                if(g0 instanceof h2) {
                    h20 = (h2)g0;
                    int v18 = h20.c0;
                    if((v18 & 0x80000000) == 0) {
                        h20 = new h2(this, g0);
                    }
                    else {
                        h20.c0 = v18 ^ 0x80000000;
                    }
                }
                else {
                    h20 = new h2(this, g0);
                }
                Object object19 = h20.b0;
                a a17 = a.X;
                switch(h20.c0) {
                    case 0: {
                        f.b0(object19);
                        ArrayList arrayList0 = J.B(((CustomerHomeFragment)((m2)object0).a).d.i);
                        if(arrayList0 == null) {
                            arrayList0 = Bb.z.X;
                        }
                        h20.c0 = 1;
                        return i0.c(arrayList0, h20) == a17 ? a17 : object2;
                    }
                    case 1: {
                        f.b0(object19);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 16: {
                if(g0 instanceof i2) {
                    i20 = (i2)g0;
                    int v19 = i20.c0;
                    if((v19 & 0x80000000) == 0) {
                        i20 = new i2(this, g0);
                    }
                    else {
                        i20.c0 = v19 ^ 0x80000000;
                    }
                }
                else {
                    i20 = new i2(this, g0);
                }
                Object object20 = i20.b0;
                a a18 = a.X;
                switch(i20.c0) {
                    case 0: {
                        f.b0(object20);
                        i20.c0 = 1;
                        return i0.c(((H1)object0).b, i20) == a18 ? a18 : object2;
                    }
                    case 1: {
                        f.b0(object20);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 17: {
                if(g0 instanceof k2) {
                    k20 = (k2)g0;
                    int v20 = k20.c0;
                    if((v20 & 0x80000000) == 0) {
                        k20 = new k2(this, g0);
                    }
                    else {
                        k20.c0 = v20 ^ 0x80000000;
                    }
                }
                else {
                    k20 = new k2(this, g0);
                }
                Object object21 = k20.b0;
                a a19 = a.X;
                switch(k20.c0) {
                    case 0: {
                        f.b0(object21);
                        k20.c0 = 1;
                        return i0.c(((H1)object0).e, k20) == a19 ? a19 : object2;
                    }
                    case 1: {
                        f.b0(object21);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 18: {
                if(g0 instanceof l2) {
                    l20 = (l2)g0;
                    int v21 = l20.c0;
                    if((v21 & 0x80000000) == 0) {
                        l20 = new l2(this, g0);
                    }
                    else {
                        l20.c0 = v21 ^ 0x80000000;
                    }
                }
                else {
                    l20 = new l2(this, g0);
                }
                Object object22 = l20.b0;
                a a20_1 = a.X;
                switch(l20.c0) {
                    case 0: {
                        f.b0(object22);
                        l20.c0 = 1;
                        return i0.c(Boolean.valueOf(((CustomerHomeFragment)((m2)object0).a).f.c), l20) == a20_1 ? a20_1 : object2;
                    }
                    case 1: {
                        f.b0(object22);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 19: {
                if(g0 instanceof p2) {
                    p20 = (p2)g0;
                    int v22 = p20.c0;
                    if((v22 & 0x80000000) == 0) {
                        p20 = new p2(this, g0);
                    }
                    else {
                        p20.c0 = v22 ^ 0x80000000;
                    }
                }
                else {
                    p20 = new p2(this, g0);
                }
                Object object23 = p20.b0;
                a a21 = a.X;
                switch(p20.c0) {
                    case 0: {
                        f.b0(object23);
                        p20.c0 = 1;
                        return i0.c(new Integer(((CustomerHomeFragment)((m2)object0).a).d.h.c.a), p20) == a21 ? a21 : object2;
                    }
                    case 1: {
                        f.b0(object23);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 20: {
                if(g0 instanceof q2) {
                    q20 = (q2)g0;
                    int v23 = q20.c0;
                    if((v23 & 0x80000000) == 0) {
                        q20 = new q2(this, g0);
                    }
                    else {
                        q20.c0 = v23 ^ 0x80000000;
                    }
                }
                else {
                    q20 = new q2(this, g0);
                }
                Object object24 = q20.b0;
                a a22 = a.X;
                switch(q20.c0) {
                    case 0: {
                        f.b0(object24);
                        q20.c0 = 1;
                        return i0.c(Boolean.valueOf(((CustomerHomeFragment)((m2)object0).a).d.h.c.e), q20) == a22 ? a22 : object2;
                    }
                    case 1: {
                        f.b0(object24);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 21: {
                if(g0 instanceof r2) {
                    r20 = (r2)g0;
                    int v24 = r20.c0;
                    if((v24 & 0x80000000) == 0) {
                        r20 = new r2(this, g0);
                    }
                    else {
                        r20.c0 = v24 ^ 0x80000000;
                    }
                }
                else {
                    r20 = new r2(this, g0);
                }
                Object object25 = r20.b0;
                a a23 = a.X;
                switch(r20.c0) {
                    case 0: {
                        f.b0(object25);
                        r20.c0 = 1;
                        return i0.c(new Integer(((CustomerHomeFragment)((m2)object0).a).d.h.c.g * 1000), r20) == a23 ? a23 : object2;
                    }
                    case 1: {
                        f.b0(object25);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 22: {
                if(g0 instanceof s2) {
                    s20 = (s2)g0;
                    int v25 = s20.c0;
                    if((v25 & 0x80000000) == 0) {
                        s20 = new s2(this, g0);
                    }
                    else {
                        s20.c0 = v25 ^ 0x80000000;
                    }
                }
                else {
                    s20 = new s2(this, g0);
                }
                Object object26 = s20.b0;
                a a24 = a.X;
                switch(s20.c0) {
                    case 0: {
                        f.b0(object26);
                        List list0 = Pb.a.A(((CustomerHomeFragment)((m2)object0).a).e.h);
                        s20.c0 = 1;
                        return i0.c(list0, s20) == a24 ? a24 : object2;
                    }
                    case 1: {
                        f.b0(object26);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 23: {
                if(g0 instanceof t2) {
                    t20 = (t2)g0;
                    int v26 = t20.c0;
                    if((v26 & 0x80000000) == 0) {
                        t20 = new t2(this, g0);
                    }
                    else {
                        t20.c0 = v26 ^ 0x80000000;
                    }
                }
                else {
                    t20 = new t2(this, g0);
                }
                Object object27 = t20.b0;
                a a25 = a.X;
                switch(t20.c0) {
                    case 0: {
                        f.b0(object27);
                        t20.c0 = 1;
                        return i0.c(Boolean.valueOf(((CustomerHomeFragment)((m2)object0).a).d.h.c.b), t20) == a25 ? a25 : object2;
                    }
                    case 1: {
                        f.b0(object27);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 24: {
                if(g0 instanceof u2) {
                    u20 = (u2)g0;
                    int v27 = u20.c0;
                    if((v27 & 0x80000000) == 0) {
                        u20 = new u2(this, g0);
                    }
                    else {
                        u20.c0 = v27 ^ 0x80000000;
                    }
                }
                else {
                    u20 = new u2(this, g0);
                }
                Object object28 = u20.b0;
                a a26 = a.X;
                switch(u20.c0) {
                    case 0: {
                        f.b0(object28);
                        u20.c0 = 1;
                        return i0.c(((CustomerHomeFragment)((m2)object0).a).c, u20) == a26 ? a26 : object2;
                    }
                    case 1: {
                        f.b0(object28);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 25: {
                if(g0 instanceof w2) {
                    w20 = (w2)g0;
                    int v28 = w20.c0;
                    if((v28 & 0x80000000) == 0) {
                        w20 = new w2(this, g0);
                    }
                    else {
                        w20.c0 = v28 ^ 0x80000000;
                    }
                }
                else {
                    w20 = new w2(this, g0);
                }
                Object object29 = w20.b0;
                a a27 = a.X;
                switch(w20.c0) {
                    case 0: {
                        f.b0(object29);
                        String s = ((CustomerHomeFragment)((m2)object0).a).getId();
                        w20.c0 = 1;
                        return i0.c(s, w20) == a27 ? a27 : object2;
                    }
                    case 1: {
                        f.b0(object29);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 26: {
                if(g0 instanceof x2) {
                    x20 = (x2)g0;
                    int v29 = x20.c0;
                    if((v29 & 0x80000000) == 0) {
                        x20 = new x2(this, g0);
                    }
                    else {
                        x20.c0 = v29 ^ 0x80000000;
                    }
                }
                else {
                    x20 = new x2(this, g0);
                }
                Object object30 = x20.b0;
                a a28 = a.X;
                switch(x20.c0) {
                    case 0: {
                        f.b0(object30);
                        pb.f f3 = l.T(((CustomerHomeFragment)((m2)object0).a).h.b.j, ((CustomerHomeFragment)((m2)object0).a).f.b, false);
                        x20.c0 = 1;
                        return i0.c(f3, x20) == a28 ? a28 : object2;
                    }
                    case 1: {
                        f.b0(object30);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 27: {
                if(g0 instanceof y2) {
                    y20 = (y2)g0;
                    int v30 = y20.c0;
                    if((v30 & 0x80000000) == 0) {
                        y20 = new y2(this, g0);
                    }
                    else {
                        y20.c0 = v30 ^ 0x80000000;
                    }
                }
                else {
                    y20 = new y2(this, g0);
                }
                Object object31 = y20.b0;
                a a29 = a.X;
                switch(y20.c0) {
                    case 0: {
                        f.b0(object31);
                        y20.c0 = 1;
                        return i0.c(((CustomerHomeFragment)((m2)object0).a).d.g.b, y20) == a29 ? a29 : object2;
                    }
                    case 1: {
                        f.b0(object31);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 28: {
                if(g0 instanceof z2) {
                    z20 = (z2)g0;
                    int v31 = z20.c0;
                    if((v31 & 0x80000000) == 0) {
                        z20 = new z2(this, g0);
                    }
                    else {
                        z20.c0 = v31 ^ 0x80000000;
                    }
                }
                else {
                    z20 = new z2(this, g0);
                }
                Object object32 = z20.b0;
                a a30 = a.X;
                switch(z20.c0) {
                    case 0: {
                        f.b0(object32);
                        z20.c0 = 1;
                        return i0.c(((CustomerHomeFragment)((m2)object0).a).d.h.c.x, z20) == a30 ? a30 : object2;
                    }
                    case 1: {
                        f.b0(object32);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof A2) {
                    a20 = (A2)g0;
                    int v = a20.c0;
                    if((v & 0x80000000) == 0) {
                        a20 = new A2(this, g0);
                    }
                    else {
                        a20.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    a20 = new A2(this, g0);
                }
                Object object3 = a20.b0;
                a a0 = a.X;
                switch(a20.c0) {
                    case 0: {
                        f.b0(object3);
                        if(((d)object0) != null) {
                            c c0 = J.A(HOME_ACCOUNT_SWITCHER_PILL.X);
                            if(((d)object0).b.equals(c0)) {
                                object1 = (d)object0;
                            }
                        }
                        a20.c0 = 1;
                        return i0.c(object1, a20) == a0 ? a0 : object2;
                    }
                    case 1: {
                        f.b0(object3);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

