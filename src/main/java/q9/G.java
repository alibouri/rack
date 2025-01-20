package q9;

import Ab.t;
import Bb.q;
import Eb.a;
import T4.l;
import Y8.N8;
import Y8.O8;
import Y8.V8;
import ac.i;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.Country;
import f9.j;
import hb.n;
import java.util.ArrayList;
import java.util.List;

public final class g implements i {
    public final int X;
    public final i Y;

    public g(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, kotlin.coroutines.g g0) {
        O2 o20;
        N2 n20;
        M2 m20;
        Y1 y10;
        W1 w10;
        k1 k10;
        j1 j10;
        i1 i10;
        d1 d10;
        c0 c00;
        v v4;
        u u0;
        r r0;
        f f0;
        Object object1 = null;
        f2 f20 = f2.a;
        boolean z = false;
        Object object2 = t.a;
        i i0 = this.Y;
        switch(this.X) {
            case 0: {
                if(g0 instanceof f) {
                    f0 = (f)g0;
                    int v1 = f0.c0;
                    if((v1 & 0x80000000) == 0) {
                        f0 = new f(this, g0);
                    }
                    else {
                        f0.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    f0 = new f(this, g0);
                }
                Object object4 = f0.b0;
                a a1 = a.X;
                switch(f0.c0) {
                    case 0: {
                        W5.f.b0(object4);
                        ArrayList arrayList0 = new ArrayList(Bb.r.b0(((List)object0)));
                        for(Object object5: ((List)object0)) {
                            arrayList0.add(new j(((q9.j)object5), ((q9.j)object5).a, 0x7F0D0021));  // layout:agent_location_item
                        }
                        f0.c0 = 1;
                        return i0.c(arrayList0, f0) == a1 ? a1 : object2;
                    }
                    case 1: {
                        W5.f.b0(object4);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof r) {
                    r0 = (r)g0;
                    int v2 = r0.c0;
                    if((v2 & 0x80000000) == 0) {
                        r0 = new r(this, g0);
                    }
                    else {
                        r0.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    r0 = new r(this, g0);
                }
                Object object6 = r0.b0;
                a a2 = a.X;
                switch(r0.c0) {
                    case 0: {
                        W5.f.b0(object6);
                        if(((Number)object0).intValue() > 45) {
                            z = true;
                        }
                        r0.c0 = 1;
                        return i0.c(Boolean.valueOf(z), r0) == a2 ? a2 : object2;
                    }
                    case 1: {
                        W5.f.b0(object6);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                if(g0 instanceof u) {
                    u0 = (u)g0;
                    int v3 = u0.c0;
                    if((v3 & 0x80000000) == 0) {
                        u0 = new u(this, g0);
                    }
                    else {
                        u0.c0 = v3 ^ 0x80000000;
                    }
                }
                else {
                    u0 = new u(this, g0);
                }
                Object object7 = u0.b0;
                a a3 = a.X;
                switch(u0.c0) {
                    case 0: {
                        W5.f.b0(object7);
                        u0.c0 = 1;
                        return i0.c(new Integer((((Boolean)object0).booleanValue() ? 0x7F0801D4 : 0x7F0801D5)), u0) == a3 ? a3 : object2;  // drawable:ic_audio_pause
                    }
                    case 1: {
                        W5.f.b0(object7);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                if(g0 instanceof v) {
                    v4 = (v)g0;
                    int v5 = v4.c0;
                    if((v5 & 0x80000000) == 0) {
                        v4 = new v(this, g0);
                    }
                    else {
                        v4.c0 = v5 ^ 0x80000000;
                    }
                }
                else {
                    v4 = new v(this, g0);
                }
                Object object8 = v4.b0;
                a a4 = a.X;
                switch(v4.c0) {
                    case 0: {
                        W5.f.b0(object8);
                        v4.c0 = 1;
                        return i0.c((((Boolean)object0).booleanValue() ? r1.d(0x7F12048F, new Object[0]) : r1.d(0x7F120490, new Object[0])), v4) == a4 ? a4 : object2;  // string:voice_announcement_pause_caption "Pause announcement"
                    }
                    case 1: {
                        W5.f.b0(object8);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 4: {
                if(g0 instanceof c0) {
                    c00 = (c0)g0;
                    int v6 = c00.c0;
                    if((v6 & 0x80000000) == 0) {
                        c00 = new c0(this, g0);
                    }
                    else {
                        c00.c0 = v6 ^ 0x80000000;
                    }
                }
                else {
                    c00 = new c0(this, g0);
                }
                Object object9 = c00.b0;
                a a5 = a.X;
                switch(c00.c0) {
                    case 0: {
                        W5.f.b0(object9);
                        c00.c0 = 1;
                        return i0.c(Boolean.valueOf(!((List)object0).isEmpty()), c00) == a5 ? a5 : object2;
                    }
                    case 1: {
                        W5.f.b0(object9);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 5: {
                if(g0 instanceof d1) {
                    d10 = (d1)g0;
                    int v7 = d10.c0;
                    if((v7 & 0x80000000) == 0) {
                        d10 = new d1(this, g0);
                    }
                    else {
                        d10.c0 = v7 ^ 0x80000000;
                    }
                }
                else {
                    d10 = new d1(this, g0);
                }
                Object object10 = d10.b0;
                a a6 = a.X;
                switch(d10.c0) {
                    case 0: {
                        W5.f.b0(object10);
                        d10.c0 = 1;
                        return i0.c(Boolean.valueOf(!((Boolean)object0).booleanValue()), d10) == a6 ? a6 : object2;
                    }
                    case 1: {
                        W5.f.b0(object10);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 6: {
                if(g0 instanceof i1) {
                    i10 = (i1)g0;
                    int v8 = i10.c0;
                    if((v8 & 0x80000000) == 0) {
                        i10 = new i1(this, g0);
                    }
                    else {
                        i10.c0 = v8 ^ 0x80000000;
                    }
                }
                else {
                    i10 = new i1(this, g0);
                }
                Object object11 = i10.b0;
                a a7 = a.X;
                switch(i10.c0) {
                    case 0: {
                        W5.f.b0(object11);
                        if(object0 == null) {
                            n.d("Received a null value when expected nonnull", io.sentry.i1.ERROR, null, false, 12);
                        }
                        if(object0 != null) {
                            i10.c0 = 1;
                            if(i0.c(object0, i10) == a7) {
                                return a7;
                            }
                        }
                        return object2;
                    }
                    case 1: {
                        W5.f.b0(object11);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 7: {
                if(g0 instanceof j1) {
                    j10 = (j1)g0;
                    int v9 = j10.c0;
                    if((v9 & 0x80000000) == 0) {
                        j10 = new j1(this, g0);
                    }
                    else {
                        j10.c0 = v9 ^ 0x80000000;
                    }
                }
                else {
                    j10 = new j1(this, g0);
                }
                Object object12 = j10.b0;
                a a8 = a.X;
                switch(j10.c0) {
                    case 0: {
                        W5.f.b0(object12);
                        Country country0 = M0.b(((String)object0));
                        j10.c0 = 1;
                        return i0.c(country0, j10) == a8 ? a8 : object2;
                    }
                    case 1: {
                        W5.f.b0(object12);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 8: {
                if(g0 instanceof k1) {
                    k10 = (k1)g0;
                    int v10 = k10.c0;
                    if((v10 & 0x80000000) == 0) {
                        k10 = new k1(this, g0);
                    }
                    else {
                        k10.c0 = v10 ^ 0x80000000;
                    }
                }
                else {
                    k10 = new k1(this, g0);
                }
                Object object13 = k10.b0;
                a a9 = a.X;
                switch(k10.c0) {
                    case 0: {
                        W5.f.b0(object13);
                        k10.c0 = 1;
                        return i0.c(((CurrencyAmount)object0).X, k10) == a9 ? a9 : object2;
                    }
                    case 1: {
                        W5.f.b0(object13);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 9: {
                if(g0 instanceof W1) {
                    w10 = (W1)g0;
                    int v11 = w10.c0;
                    if((v11 & 0x80000000) == 0) {
                        w10 = new W1(this, g0);
                    }
                    else {
                        w10.c0 = v11 ^ 0x80000000;
                    }
                }
                else {
                    w10 = new W1(this, g0);
                }
                Object object14 = w10.b0;
                a a10 = a.X;
                switch(w10.c0) {
                    case 0: {
                        W5.f.b0(object14);
                        if(((N8)object0) != null) {
                            O8 o80 = ((N8)object0).b;
                            if(o80 != null) {
                                object1 = l.T(o80.b, ((N8)object0).a.a, true);
                            }
                        }
                        w10.c0 = 1;
                        return i0.c(object1, w10) == a10 ? a10 : object2;
                    }
                    case 1: {
                        W5.f.b0(object14);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 10: {
                if(g0 instanceof Y1) {
                    y10 = (Y1)g0;
                    int v12 = y10.c0;
                    if((v12 & 0x80000000) == 0) {
                        y10 = new Y1(this, g0);
                    }
                    else {
                        y10.c0 = v12 ^ 0x80000000;
                    }
                }
                else {
                    y10 = new Y1(this, g0);
                }
                Object object15 = y10.b0;
                a a11 = a.X;
                switch(y10.c0) {
                    case 0: {
                        W5.f.b0(object15);
                        if(((V8)object0) != null) {
                            z = ((V8)object0).a.c;
                        }
                        y10.c0 = 1;
                        return i0.c(Boolean.valueOf(z), y10) == a11 ? a11 : object2;
                    }
                    case 1: {
                        W5.f.b0(object15);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 11: {
                if(g0 instanceof M2) {
                    m20 = (M2)g0;
                    int v13 = m20.c0;
                    if((v13 & 0x80000000) == 0) {
                        m20 = new M2(this, g0);
                    }
                    else {
                        m20.c0 = v13 ^ 0x80000000;
                    }
                }
                else {
                    m20 = new M2(this, g0);
                }
                Object object16 = m20.b0;
                a a12 = a.X;
                switch(m20.c0) {
                    case 0: {
                        W5.f.b0(object16);
                        Boolean boolean0 = Boolean.valueOf(Nb.j.a(((h2)object0), f20));
                        m20.c0 = 1;
                        return i0.c(boolean0, m20) == a12 ? a12 : object2;
                    }
                    case 1: {
                        W5.f.b0(object16);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 12: {
                if(g0 instanceof N2) {
                    n20 = (N2)g0;
                    int v14 = n20.c0;
                    if((v14 & 0x80000000) == 0) {
                        n20 = new N2(this, g0);
                    }
                    else {
                        n20.c0 = v14 ^ 0x80000000;
                    }
                }
                else {
                    n20 = new N2(this, g0);
                }
                Object object17 = n20.b0;
                a a13 = a.X;
                switch(n20.c0) {
                    case 0: {
                        W5.f.b0(object17);
                        if(((h2)object0) instanceof g2) {
                            z = true;
                        }
                        else if(((h2)object0) instanceof d2 || ((h2)object0) instanceof e2) {
                            z = true;
                        }
                        n20.c0 = 1;
                        return i0.c(Boolean.valueOf(z), n20) == a13 ? a13 : object2;
                    }
                    case 1: {
                        W5.f.b0(object17);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof O2) {
                    o20 = (O2)g0;
                    int v = o20.c0;
                    if((v & 0x80000000) == 0) {
                        o20 = new O2(this, g0);
                    }
                    else {
                        o20.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    o20 = new O2(this, g0);
                }
                Object object3 = o20.b0;
                a a0 = a.X;
                switch(o20.c0) {
                    case 0: {
                        W5.f.b0(object3);
                        if(q.L(new h2[]{f20, b2.b}).contains(((h2)object0))) {
                            z = true;
                        }
                        else if(((h2)object0) instanceof e2) {
                            z = true;
                        }
                        o20.c0 = 1;
                        return i0.c(Boolean.valueOf(z), o20) == a0 ? a0 : object2;
                    }
                    case 1: {
                        W5.f.b0(object3);
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

