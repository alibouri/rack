package Aa;

import Ab.t;
import Ba.m;
import Bb.p;
import Bb.z;
import Da.j;
import Ea.M0;
import I2.H;
import I2.J;
import K9.C0;
import K9.E0;
import K9.F0;
import K9.G0;
import K9.H0;
import K9.I0;
import K9.O;
import K9.P;
import K9.S;
import K9.T;
import K9.V;
import K9.X;
import K9.Z;
import K9.a0;
import K9.b0;
import K9.c0;
import K9.d0;
import K9.f0;
import K9.g0;
import K9.h0;
import K9.i0;
import K9.j0;
import Na.a;
import Na.e;
import Na.h;
import T4.l;
import W5.f;
import Y8.g4;
import Y8.m2;
import Y8.z6;
import a9.E7;
import a9.F7;
import a9.T4;
import a9.y7;
import ac.i;
import com.apollographql.apollo.api.Executable.Data;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.backend.fragment.SendMoneyDialogFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.backend.fragment.SettingsFragment;
import com.sendwave.backend.fragment.TransferAmountFieldFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.util.Country;
import com.wave.models.ProposedTransfer;
import f9.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.g;

public final class s0 implements i {
    public final int X;
    public final i Y;

    public s0(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        a a1;
        Integer integer0;
        h h0;
        Na.g g1;
        e e0;
        I0 i01;
        H0 h01;
        G0 g01;
        F0 f01;
        E0 e00;
        C0 c01;
        j0 j00;
        i0 i00;
        h0 h00;
        g0 g00;
        f0 f00;
        d0 d00;
        c0 c00;
        b0 b02;
        a0 a00;
        Z z2;
        X x0;
        V v11;
        T t1;
        S s0;
        P p0;
        O o1;
        Ha.O o0;
        M0 m00;
        j j0;
        m m0;
        r0 r00;
        z z0 = z.X;
        boolean z1 = false;
        Object object1 = null;
        Object object2 = t.a;
        i i0 = this.Y;
        switch(this.X) {
            case 0: {
                if(g0 instanceof r0) {
                    r00 = (r0)g0;
                    int v2 = r00.c0;
                    if((v2 & 0x80000000) == 0) {
                        r00 = new r0(this, g0);
                    }
                    else {
                        r00.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    r00 = new r0(this, g0);
                }
                Object object10 = r00.b0;
                Eb.a a2 = Eb.a.X;
                switch(r00.c0) {
                    case 0: {
                        f.b0(object10);
                        ArrayList arrayList3 = J.B(((SavingsFragment)((m2)object0).a).b.e);
                        if(arrayList3 != null) {
                            z0 = arrayList3;
                        }
                        r00.c0 = 1;
                        return i0.c(z0, r00) == a2 ? a2 : object2;
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
            case 1: {
                if(g0 instanceof m) {
                    m0 = (m)g0;
                    int v3 = m0.c0;
                    if((v3 & 0x80000000) == 0) {
                        m0 = new m(this, g0);
                    }
                    else {
                        m0.c0 = v3 ^ 0x80000000;
                    }
                }
                else {
                    m0 = new m(this, g0);
                }
                Object object11 = m0.b0;
                Eb.a a3 = Eb.a.X;
                switch(m0.c0) {
                    case 0: {
                        f.b0(object11);
                        m0.c0 = 1;
                        return i0.c(((m2)object0).a, m0) == a3 ? a3 : object2;
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
            case 2: {
                if(g0 instanceof j) {
                    j0 = (j)g0;
                    int v4 = j0.c0;
                    if((v4 & 0x80000000) == 0) {
                        j0 = new j(this, g0);
                    }
                    else {
                        j0.c0 = v4 ^ 0x80000000;
                    }
                }
                else {
                    j0 = new j(this, g0);
                }
                Object object12 = j0.b0;
                Eb.a a4 = Eb.a.X;
                switch(j0.c0) {
                    case 0: {
                        f.b0(object12);
                        j0.c0 = 1;
                        return i0.c(((m2)object0).a, j0) == a4 ? a4 : object2;
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
            case 3: {
                if(g0 instanceof M0) {
                    m00 = (M0)g0;
                    int v5 = m00.c0;
                    if((v5 & 0x80000000) == 0) {
                        m00 = new M0(this, g0);
                    }
                    else {
                        m00.c0 = v5 ^ 0x80000000;
                    }
                }
                else {
                    m00 = new M0(this, g0);
                }
                Object object13 = m00.b0;
                Eb.a a5 = Eb.a.X;
                switch(m00.c0) {
                    case 0: {
                        f.b0(object13);
                        Data executable$Data0 = ((z6)object0).b();
                        if(executable$Data0 != null) {
                            m00.c0 = 1;
                            if(i0.c(executable$Data0, m00) == a5) {
                                return a5;
                            }
                        }
                        return object2;
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
            case 4: {
                if(g0 instanceof Ha.O) {
                    o0 = (Ha.O)g0;
                    int v6 = o0.c0;
                    if((v6 & 0x80000000) == 0) {
                        o0 = new Ha.O(this, g0);
                    }
                    else {
                        o0.c0 = v6 ^ 0x80000000;
                    }
                }
                else {
                    o0 = new Ha.O(this, g0);
                }
                Object object14 = o0.b0;
                Eb.a a6 = Eb.a.X;
                switch(o0.c0) {
                    case 0: {
                        f.b0(object14);
                        Country country0 = q9.M0.c(((SettingsFragment)((m2)object0).a).b.c);
                        Nb.j.c(country0);
                        pb.f f0 = l.T(((SettingsFragment)((m2)object0).a).b.j, ((SettingsFragment)((m2)object0).a).d.b, false);
                        F7 f70 = ((SettingsFragment)((m2)object0).a).c;
                        E7 e70 = ((SettingsFragment)((m2)object0).a).b;
                        Ha.t t0 = new Ha.t(((SettingsFragment)((m2)object0).a), f70.a, f70.b, country0, f0, e70.h.a, e70.g);
                        o0.c0 = 1;
                        return i0.c(t0, o0) == a6 ? a6 : object2;
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
            case 5: {
                if(g0 instanceof O) {
                    o1 = (O)g0;
                    int v7 = o1.c0;
                    if((v7 & 0x80000000) == 0) {
                        o1 = new O(this, g0);
                    }
                    else {
                        o1.c0 = v7 ^ 0x80000000;
                    }
                }
                else {
                    o1 = new O(this, g0);
                }
                Object object15 = o1.b0;
                Eb.a a7 = Eb.a.X;
                switch(o1.c0) {
                    case 0: {
                        f.b0(object15);
                        o1.c0 = 1;
                        return i0.c(((SendMoneyDialogFragment)((m2)object0).a).f, o1) == a7 ? a7 : object2;
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
            case 6: {
                if(g0 instanceof P) {
                    p0 = (P)g0;
                    int v8 = p0.c0;
                    if((v8 & 0x80000000) == 0) {
                        p0 = new P(this, g0);
                    }
                    else {
                        p0.c0 = v8 ^ 0x80000000;
                    }
                }
                else {
                    p0 = new P(this, g0);
                }
                Object object16 = p0.b0;
                Eb.a a8 = Eb.a.X;
                switch(p0.c0) {
                    case 0: {
                        f.b0(object16);
                        f9.b0 b00 = ((f9.d0)object0) instanceof f9.b0 ? ((f9.b0)(((f9.d0)object0))) : null;
                        if(b00 != null) {
                            object1 = b00.g;
                        }
                        p0.c0 = 1;
                        return i0.c(object1, p0) == a8 ? a8 : object2;
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
            case 7: {
                if(g0 instanceof S) {
                    s0 = (S)g0;
                    int v9 = s0.c0;
                    if((v9 & 0x80000000) == 0) {
                        s0 = new S(this, g0);
                    }
                    else {
                        s0.c0 = v9 ^ 0x80000000;
                    }
                }
                else {
                    s0 = new S(this, g0);
                }
                Object object17 = s0.b0;
                Eb.a a9 = Eb.a.X;
                switch(s0.c0) {
                    case 0: {
                        f.b0(object17);
                        f9.b0 b01 = ((f9.d0)object0) instanceof f9.b0 ? ((f9.b0)(((f9.d0)object0))) : null;
                        if(b01 != null) {
                            object1 = b01.c.b.b;
                        }
                        s0.c0 = 1;
                        return i0.c(object1, s0) == a9 ? a9 : object2;
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
            case 8: {
                if(g0 instanceof T) {
                    t1 = (T)g0;
                    int v10 = t1.c0;
                    if((v10 & 0x80000000) == 0) {
                        t1 = new T(this, g0);
                    }
                    else {
                        t1.c0 = v10 ^ 0x80000000;
                    }
                }
                else {
                    t1 = new T(this, g0);
                }
                Object object18 = t1.b0;
                Eb.a a10 = Eb.a.X;
                switch(t1.c0) {
                    case 0: {
                        f.b0(object18);
                        if(((PartnerOrg)object0) != null) {
                            z1 = true;
                        }
                        t1.c0 = 1;
                        return i0.c(Boolean.valueOf(z1), t1) == a10 ? a10 : object2;
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
            case 9: {
                if(g0 instanceof V) {
                    v11 = (V)g0;
                    int v12 = v11.c0;
                    if((v12 & 0x80000000) == 0) {
                        v11 = new V(this, g0);
                    }
                    else {
                        v11.c0 = v12 ^ 0x80000000;
                    }
                }
                else {
                    v11 = new V(this, g0);
                }
                Object object19 = v11.b0;
                Eb.a a11 = Eb.a.X;
                switch(v11.c0) {
                    case 0: {
                        f.b0(object19);
                        if(!(((f9.S)object0) instanceof Q)) {
                            if(!(((f9.S)object0) instanceof f9.P)) {
                                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            Integer integer1 = ((f9.P)(((f9.S)object0))).d;
                            if(integer1 != null && ((int)integer1) == 0x7F0A0260) {  // id:receive_amount_requester
                                String s1 = ((f9.P)(((f9.S)object0))).a;
                                switch(((f9.P)(((f9.S)object0))).c.ordinal()) {
                                    case 0: {
                                        if(((f9.P)(((f9.S)object0))).b) {
                                            object1 = s1;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        object1 = s1;
                                        break;
                                    }
                                    default: {
                                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                    }
                                }
                            }
                        }
                        v11.c0 = 1;
                        return i0.c(object1, v11) == a11 ? a11 : object2;
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
            case 10: {
                if(g0 instanceof X) {
                    x0 = (X)g0;
                    int v13 = x0.c0;
                    if((v13 & 0x80000000) == 0) {
                        x0 = new X(this, g0);
                    }
                    else {
                        x0.c0 = v13 ^ 0x80000000;
                    }
                }
                else {
                    x0 = new X(this, g0);
                }
                Object object20 = x0.b0;
                Eb.a a12 = Eb.a.X;
                switch(x0.c0) {
                    case 0: {
                        f.b0(object20);
                        if(((ProposedTransfer)object0) != null) {
                            z1 = true;
                        }
                        x0.c0 = 1;
                        return i0.c(Boolean.valueOf(z1), x0) == a12 ? a12 : object2;
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
            case 11: {
                if(g0 instanceof Z) {
                    z2 = (Z)g0;
                    int v14 = z2.c0;
                    if((v14 & 0x80000000) == 0) {
                        z2 = new Z(this, g0);
                    }
                    else {
                        z2.c0 = v14 ^ 0x80000000;
                    }
                }
                else {
                    z2 = new Z(this, g0);
                }
                Object object21 = z2.b0;
                Eb.a a13 = Eb.a.X;
                switch(z2.c0) {
                    case 0: {
                        f.b0(object21);
                        z2.c0 = 1;
                        return i0.c(((SendMoneyDialogFragment)((m2)object0).a).g.c, z2) == a13 ? a13 : object2;
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
            case 12: {
                if(g0 instanceof a0) {
                    a00 = (a0)g0;
                    int v15 = a00.c0;
                    if((v15 & 0x80000000) == 0) {
                        a00 = new a0(this, g0);
                    }
                    else {
                        a00.c0 = v15 ^ 0x80000000;
                    }
                }
                else {
                    a00 = new a0(this, g0);
                }
                Object object22 = a00.b0;
                Eb.a a14 = Eb.a.X;
                switch(a00.c0) {
                    case 0: {
                        f.b0(object22);
                        Nb.j.f(((f9.S)object0), "<this>");
                        Q q0 = ((f9.S)object0) instanceof Q ? ((Q)(((f9.S)object0))) : null;
                        if(q0 != null) {
                            f9.T t2 = q0.a;
                            if(t2 != null) {
                                object1 = t2.a;
                            }
                        }
                        a00.c0 = 1;
                        return i0.c(object1, a00) == a14 ? a14 : object2;
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
            case 13: {
                if(g0 instanceof b0) {
                    b02 = (b0)g0;
                    int v16 = b02.c0;
                    if((v16 & 0x80000000) == 0) {
                        b02 = new b0(this, g0);
                    }
                    else {
                        b02.c0 = v16 ^ 0x80000000;
                    }
                }
                else {
                    b02 = new b0(this, g0);
                }
                Object object23 = b02.b0;
                Eb.a a15 = Eb.a.X;
                switch(b02.c0) {
                    case 0: {
                        f.b0(object23);
                        b02.c0 = 1;
                        return i0.c(((SendMoneyDialogFragment)((m2)object0).a).g, b02) == a15 ? a15 : object2;
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
            case 14: {
                if(g0 instanceof c0) {
                    c00 = (c0)g0;
                    int v17 = c00.c0;
                    if((v17 & 0x80000000) == 0) {
                        c00 = new c0(this, g0);
                    }
                    else {
                        c00.c0 = v17 ^ 0x80000000;
                    }
                }
                else {
                    c00 = new c0(this, g0);
                }
                Object object24 = c00.b0;
                Eb.a a16 = Eb.a.X;
                switch(c00.c0) {
                    case 0: {
                        f.b0(object24);
                        c00.c0 = 1;
                        return i0.c(((SendMoneyDialogFragment)((m2)object0).a).d, c00) == a16 ? a16 : object2;
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
            case 15: {
                if(g0 instanceof d0) {
                    d00 = (d0)g0;
                    int v18 = d00.c0;
                    if((v18 & 0x80000000) == 0) {
                        d00 = new d0(this, g0);
                    }
                    else {
                        d00.c0 = v18 ^ 0x80000000;
                    }
                }
                else {
                    d00 = new d0(this, g0);
                }
                Object object25 = d00.b0;
                Eb.a a17 = Eb.a.X;
                switch(d00.c0) {
                    case 0: {
                        f.b0(object25);
                        d00.c0 = 1;
                        return i0.c(((TransferAmountFieldFragment)object0).i, d00) == a17 ? a17 : object2;
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
            case 16: {
                if(g0 instanceof f0) {
                    f00 = (f0)g0;
                    int v19 = f00.c0;
                    if((v19 & 0x80000000) == 0) {
                        f00 = new f0(this, g0);
                    }
                    else {
                        f00.c0 = v19 ^ 0x80000000;
                    }
                }
                else {
                    f00 = new f0(this, g0);
                }
                Object object26 = f00.b0;
                Eb.a a18 = Eb.a.X;
                switch(f00.c0) {
                    case 0: {
                        f.b0(object26);
                        f00.c0 = 1;
                        return i0.c(Boolean.valueOf(((SendMoneyDialogFragment)((m2)object0).a).e), f00) == a18 ? a18 : object2;
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
            case 17: {
                if(g0 instanceof g0) {
                    g00 = (g0)g0;
                    int v20 = g00.c0;
                    if((v20 & 0x80000000) == 0) {
                        g00 = new g0(this, g0);
                    }
                    else {
                        g00.c0 = v20 ^ 0x80000000;
                    }
                }
                else {
                    g00 = new g0(this, g0);
                }
                Object object27 = g00.b0;
                Eb.a a19 = Eb.a.X;
                switch(g00.c0) {
                    case 0: {
                        f.b0(object27);
                        g4 g40 = (g4)((z6)object0).b();
                        if(g40 != null) {
                            T4 t40 = g40.a.b.b.b;
                            if(t40 != null && Nb.j.a(t40.a.b, t40.a.c)) {
                                object1 = t40.b.h(t40.c);
                            }
                        }
                        g00.c0 = 1;
                        return i0.c(object1, g00) == a19 ? a19 : object2;
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
            case 18: {
                if(g0 instanceof h0) {
                    h00 = (h0)g0;
                    int v21 = h00.c0;
                    if((v21 & 0x80000000) == 0) {
                        h00 = new h0(this, g0);
                    }
                    else {
                        h00.c0 = v21 ^ 0x80000000;
                    }
                }
                else {
                    h00 = new h0(this, g0);
                }
                Object object28 = h00.b0;
                Eb.a a20 = Eb.a.X;
                switch(h00.c0) {
                    case 0: {
                        f.b0(object28);
                        if(((f9.d0)object0) != null) {
                            object1 = p.v0(((f9.d0)object0).c.a.a, "\n", null, null, null, 62);
                        }
                        h00.c0 = 1;
                        return i0.c(object1, h00) == a20 ? a20 : object2;
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
            case 19: {
                if(g0 instanceof i0) {
                    i00 = (i0)g0;
                    int v22 = i00.c0;
                    if((v22 & 0x80000000) == 0) {
                        i00 = new i0(this, g0);
                    }
                    else {
                        i00.c0 = v22 ^ 0x80000000;
                    }
                }
                else {
                    i00 = new i0(this, g0);
                }
                Object object29 = i00.b0;
                Eb.a a21 = Eb.a.X;
                switch(i00.c0) {
                    case 0: {
                        f.b0(object29);
                        if(((f9.d0)object0) != null) {
                            object1 = ((f9.d0)object0).c.b.c;
                        }
                        i00.c0 = 1;
                        return i0.c(object1, i00) == a21 ? a21 : object2;
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
            case 20: {
                if(g0 instanceof j0) {
                    j00 = (j0)g0;
                    int v23 = j00.c0;
                    if((v23 & 0x80000000) == 0) {
                        j00 = new j0(this, g0);
                    }
                    else {
                        j00.c0 = v23 ^ 0x80000000;
                    }
                }
                else {
                    j00 = new j0(this, g0);
                }
                Object object30 = j00.b0;
                Eb.a a22 = Eb.a.X;
                switch(j00.c0) {
                    case 0: {
                        f.b0(object30);
                        f9.b0 b03 = ((f9.d0)object0) instanceof f9.b0 ? ((f9.b0)(((f9.d0)object0))) : null;
                        if(b03 != null) {
                            object1 = b03.c.b.a;
                        }
                        j00.c0 = 1;
                        return i0.c(object1, j00) == a22 ? a22 : object2;
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
            case 21: {
                if(g0 instanceof C0) {
                    c01 = (C0)g0;
                    int v24 = c01.c0;
                    if((v24 & 0x80000000) == 0) {
                        c01 = new C0(this, g0);
                    }
                    else {
                        c01.c0 = v24 ^ 0x80000000;
                    }
                }
                else {
                    c01 = new C0(this, g0);
                }
                Object object31 = c01.b0;
                Eb.a a23 = Eb.a.X;
                switch(c01.c0) {
                    case 0: {
                        f.b0(object31);
                        List list0 = Pb.a.A(((SendMoneySelectFragment)((m2)object0).a));
                        c01.c0 = 1;
                        return i0.c(list0, c01) == a23 ? a23 : object2;
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
            case 22: {
                if(g0 instanceof E0) {
                    e00 = (E0)g0;
                    int v25 = e00.c0;
                    if((v25 & 0x80000000) == 0) {
                        e00 = new E0(this, g0);
                    }
                    else {
                        e00.c0 = v25 ^ 0x80000000;
                    }
                }
                else {
                    e00 = new E0(this, g0);
                }
                Object object32 = e00.b0;
                Eb.a a24 = Eb.a.X;
                switch(e00.c0) {
                    case 0: {
                        f.b0(object32);
                        y7 y70 = ((SendMoneySelectFragment)((m2)object0).a).d;
                        if(y70 != null) {
                            z1 = y70.c.c.s;
                        }
                        e00.c0 = 1;
                        return i0.c(Boolean.valueOf(z1), e00) == a24 ? a24 : object2;
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
            case 23: {
                if(g0 instanceof F0) {
                    f01 = (F0)g0;
                    int v26 = f01.c0;
                    if((v26 & 0x80000000) == 0) {
                        f01 = new F0(this, g0);
                    }
                    else {
                        f01.c0 = v26 ^ 0x80000000;
                    }
                }
                else {
                    f01 = new F0(this, g0);
                }
                Object object33 = f01.b0;
                Eb.a a25 = Eb.a.X;
                switch(f01.c0) {
                    case 0: {
                        f.b0(object33);
                        y7 y71 = ((SendMoneySelectFragment)((m2)object0).a).d;
                        if(y71 != null) {
                            ArrayList arrayList4 = J.B(y71.d);
                            if(arrayList4 != null) {
                                z0 = arrayList4;
                            }
                        }
                        f01.c0 = 1;
                        return i0.c(z0, f01) == a25 ? a25 : object2;
                    }
                    case 1: {
                        f.b0(object33);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 24: {
                if(g0 instanceof G0) {
                    g01 = (G0)g0;
                    int v27 = g01.c0;
                    if((v27 & 0x80000000) == 0) {
                        g01 = new G0(this, g0);
                    }
                    else {
                        g01.c0 = v27 ^ 0x80000000;
                    }
                }
                else {
                    g01 = new G0(this, g0);
                }
                Object object34 = g01.b0;
                Eb.a a26 = Eb.a.X;
                switch(g01.c0) {
                    case 0: {
                        f.b0(object34);
                        y7 y72 = ((SendMoneySelectFragment)((m2)object0).a).d;
                        if(y72 != null) {
                            z1 = y72.c.c.a;
                        }
                        g01.c0 = 1;
                        return i0.c(new Integer(((int)z1)), g01) == a26 ? a26 : object2;
                    }
                    case 1: {
                        f.b0(object34);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 25: {
                if(g0 instanceof H0) {
                    h01 = (H0)g0;
                    int v28 = h01.c0;
                    if((v28 & 0x80000000) == 0) {
                        h01 = new H0(this, g0);
                    }
                    else {
                        h01.c0 = v28 ^ 0x80000000;
                    }
                }
                else {
                    h01 = new H0(this, g0);
                }
                Object object35 = h01.b0;
                Eb.a a27 = Eb.a.X;
                switch(h01.c0) {
                    case 0: {
                        f.b0(object35);
                        y7 y73 = ((SendMoneySelectFragment)((m2)object0).a).d;
                        if(y73 != null) {
                            z1 = y73.c.c.e;
                        }
                        h01.c0 = 1;
                        return i0.c(Boolean.valueOf(z1), h01) == a27 ? a27 : object2;
                    }
                    case 1: {
                        f.b0(object35);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 26: {
                if(g0 instanceof I0) {
                    i01 = (I0)g0;
                    int v29 = i01.c0;
                    if((v29 & 0x80000000) == 0) {
                        i01 = new I0(this, g0);
                    }
                    else {
                        i01.c0 = v29 ^ 0x80000000;
                    }
                }
                else {
                    i01 = new I0(this, g0);
                }
                Object object36 = i01.b0;
                Eb.a a28 = Eb.a.X;
                switch(i01.c0) {
                    case 0: {
                        f.b0(object36);
                        g4 g41 = (g4)((z6)object0).b();
                        if(g41 != null) {
                            T4 t41 = g41.a.b.b.b;
                            if(t41 != null && Nb.j.a(t41.a.b, t41.a.c)) {
                                object1 = t41.i;
                            }
                        }
                        i01.c0 = 1;
                        return i0.c(object1, i01) == a28 ? a28 : object2;
                    }
                    case 1: {
                        f.b0(object36);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 27: {
                if(g0 instanceof e) {
                    e0 = (e)g0;
                    int v30 = e0.c0;
                    if((v30 & 0x80000000) == 0) {
                        e0 = new e(this, g0);
                    }
                    else {
                        e0.c0 = v30 ^ 0x80000000;
                    }
                }
                else {
                    e0 = new e(this, g0);
                }
                Object object37 = e0.b0;
                Eb.a a29 = Eb.a.X;
                switch(e0.c0) {
                    case 0: {
                        f.b0(object37);
                        if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
                            for(Object object38: ((List)object0)) {
                                if(((H)object38).l == 2) {
                                    z1 = true;
                                    break;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        e0.c0 = 1;
                        return i0.c(Boolean.valueOf(z1), e0) == a29 ? a29 : object2;
                    }
                    case 1: {
                        f.b0(object37);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 28: {
                if(g0 instanceof Na.g) {
                    g1 = (Na.g)g0;
                    int v31 = g1.c0;
                    if((v31 & 0x80000000) == 0) {
                        g1 = new Na.g(this, g0);
                    }
                    else {
                        g1.c0 = v31 ^ 0x80000000;
                    }
                }
                else {
                    g1 = new Na.g(this, g0);
                }
                Object object39 = g1.b0;
                Eb.a a30 = Eb.a.X;
                switch(g1.c0) {
                    case 0: {
                        f.b0(object39);
                        if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
                            for(Object object40: ((List)object0)) {
                                if(((H)object40).l == 1) {
                                    z1 = true;
                                    break;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        g1.c0 = 1;
                        return i0.c(Boolean.valueOf(z1), g1) == a30 ? a30 : object2;
                    }
                    case 1: {
                        f.b0(object39);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof h) {
                    h0 = (h)g0;
                    int v = h0.c0;
                    if((v & 0x80000000) == 0) {
                        h0 = new h(this, g0);
                    }
                    else {
                        h0.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    h0 = new h(this, g0);
                }
                Object object3 = h0.b0;
                Eb.a a0 = Eb.a.X;
                switch(h0.c0) {
                    case 0: {
                        f.b0(object3);
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object4: ((List)object0)) {
                            if(((H)object4).l == 4) {
                                arrayList0.add(object4);
                            }
                        }
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object5: arrayList0) {
                            H h1 = (H)object5;
                            if(h1.c.c(Integer.class, "ERROR_TYPE")) {
                                Object object6 = 0;
                                Object object7 = h1.c.a.get("ERROR_TYPE");
                                if(object7 instanceof Integer) {
                                    object6 = object7;
                                }
                                integer0 = new Integer(((Number)object6).intValue());
                            }
                            else {
                                integer0 = null;
                            }
                            if(integer0 != null) {
                                arrayList1.add(integer0);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for(Object object8: arrayList1) {
                            int v1 = ((Number)object8).intValue();
                            if(v1 == 1) {
                                a1 = new a(1);
                            }
                            else {
                                a1 = v1 == 2 ? new a(2) : null;
                            }
                            if(a1 != null) {
                                arrayList2.add(a1);
                            }
                        }
                        Object object9 = p.q0(arrayList2);
                        h0.c0 = 1;
                        return i0.c(object9, h0) == a0 ? a0 : object2;
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

