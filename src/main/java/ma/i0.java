package ma;

import A3.e;
import Ab.t;
import Bb.r;
import Eb.a;
import N4.o;
import T4.l;
import Y8.N8;
import Y8.O8;
import Y8.V8;
import Y8.m2;
import a9.m5;
import ac.i;
import android.content.Context;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.backend.fragment.BillPayAmountFieldFragment;
import com.sendwave.backend.fragment.LinkedAccountFragment;
import com.sendwave.backend.fragment.LinkedAccountTypeFragment;
import com.sendwave.backend.fragment.PayBillDialogFragment;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.models.CurrencyAmount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.g;
import o9.A0;
import o9.B0;
import o9.G0;
import o9.H0;
import o9.I0;
import o9.I;
import o9.J0;
import o9.J1;
import o9.K0;
import o9.K1;
import o9.L0;
import o9.P;
import o9.Q0;
import o9.S0;
import o9.T0;
import o9.V;
import o9.W;
import o9.j;
import o9.k0;
import o9.k;
import o9.n;
import o9.p0;
import o9.s;
import o9.v0;
import o9.v;
import o9.z0;
import pb.f;
import q9.C3;
import q9.M0;

public final class i0 implements i {
    public final int X;
    public final i Y;

    public i0(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        T0 t00;
        S0 s00;
        String s3;
        Q0 q00;
        L0 l00;
        K0 k02;
        J0 j01;
        I0 i00;
        H0 h01;
        G0 g00;
        B0 b00;
        A0 a00;
        z0 z00;
        v0 v00;
        p0 p01;
        k0 k01;
        W w0;
        f f0;
        V v15;
        P p0;
        I i1;
        v v11;
        s s2;
        k k0;
        j j0;
        o9.i i0;
        ma.p0 p00;
        o0 o00;
        n0 n00;
        ma.k0 k00;
        j0 j00;
        h0 h00;
        switch(this.X) {
            case 0: {
                if(g0 instanceof h0) {
                    h00 = (h0)g0;
                    int v1 = h00.c0;
                    if((v1 & 0x80000000) == 0) {
                        h00 = new h0(this, g0);
                    }
                    else {
                        h00.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    h00 = new h0(this, g0);
                }
                Object object5 = h00.b0;
                Object object6 = a.X;
                switch(h00.c0) {
                    case 0: {
                        W5.f.b0(object5);
                        StringBuilder stringBuilder0 = e.w(((LinkedAccountFragment)object0).c, " - ");
                        stringBuilder0.append(((LinkedAccountFragment)object0).b);
                        h00.c0 = 1;
                        return this.Y.c(stringBuilder0.toString(), h00) != object6 ? t.a : object6;
                    }
                    case 1: {
                        W5.f.b0(object5);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof j0) {
                    j00 = (j0)g0;
                    int v2 = j00.c0;
                    if((v2 & 0x80000000) == 0) {
                        j00 = new j0(this, g0);
                    }
                    else {
                        j00.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    j00 = new j0(this, g0);
                }
                Object object7 = j00.b0;
                Object object8 = a.X;
                switch(j00.c0) {
                    case 0: {
                        W5.f.b0(object7);
                        j00.c0 = 1;
                        return this.Y.c(((LinkedAccountFragment)object0).d.b, j00) != object8 ? t.a : object8;
                    }
                    case 1: {
                        W5.f.b0(object7);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                if(g0 instanceof ma.k0) {
                    k00 = (ma.k0)g0;
                    int v3 = k00.c0;
                    if((v3 & 0x80000000) == 0) {
                        k00 = new ma.k0(this, g0);
                    }
                    else {
                        k00.c0 = v3 ^ 0x80000000;
                    }
                }
                else {
                    k00 = new ma.k0(this, g0);
                }
                Object object9 = k00.b0;
                Object object10 = a.X;
                switch(k00.c0) {
                    case 0: {
                        W5.f.b0(object9);
                        k00.c0 = 1;
                        return this.Y.c(((LinkedAccountTypeFragment)object0).b, k00) != object10 ? t.a : object10;
                    }
                    case 1: {
                        W5.f.b0(object9);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                if(g0 instanceof n0) {
                    n00 = (n0)g0;
                    int v4 = n00.c0;
                    if((v4 & 0x80000000) == 0) {
                        n00 = new n0(this, g0);
                    }
                    else {
                        n00.c0 = v4 ^ 0x80000000;
                    }
                }
                else {
                    n00 = new n0(this, g0);
                }
                Object object11 = n00.b0;
                Object object12 = a.X;
                switch(n00.c0) {
                    case 0: {
                        W5.f.b0(object11);
                        n00.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((LinkedAccountTypeFragment)object0).q), n00) != object12 ? t.a : object12;
                    }
                    case 1: {
                        W5.f.b0(object11);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 4: {
                if(g0 instanceof o0) {
                    o00 = (o0)g0;
                    int v5 = o00.c0;
                    if((v5 & 0x80000000) == 0) {
                        o00 = new o0(this, g0);
                    }
                    else {
                        o00.c0 = v5 ^ 0x80000000;
                    }
                }
                else {
                    o00 = new o0(this, g0);
                }
                Object object13 = o00.b0;
                Object object14 = a.X;
                switch(o00.c0) {
                    case 0: {
                        W5.f.b0(object13);
                        Nb.j.c(((CurrencyAmount)object0));
                        String s = M0.a(((CurrencyAmount)object0));
                        o00.c0 = 1;
                        return this.Y.c(s, o00) != object14 ? t.a : object14;
                    }
                    case 1: {
                        W5.f.b0(object13);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 5: {
                if(g0 instanceof ma.p0) {
                    p00 = (ma.p0)g0;
                    int v6 = p00.c0;
                    if((v6 & 0x80000000) == 0) {
                        p00 = new ma.p0(this, g0);
                    }
                    else {
                        p00.c0 = v6 ^ 0x80000000;
                    }
                }
                else {
                    p00 = new ma.p0(this, g0);
                }
                Object object15 = p00.b0;
                Object object16 = a.X;
                switch(p00.c0) {
                    case 0: {
                        W5.f.b0(object15);
                        String s1 = M0.a(((CurrencyAmount)object0));
                        p00.c0 = 1;
                        return this.Y.c(s1, p00) != object16 ? t.a : object16;
                    }
                    case 1: {
                        W5.f.b0(object15);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 6: {
                if(g0 instanceof o9.i) {
                    i0 = (o9.i)g0;
                    int v7 = i0.c0;
                    if((v7 & 0x80000000) == 0) {
                        i0 = new o9.i(this, g0);
                    }
                    else {
                        i0.c0 = v7 ^ 0x80000000;
                    }
                }
                else {
                    i0 = new o9.i(this, g0);
                }
                Object object17 = i0.b0;
                Object object18 = a.X;
                switch(i0.c0) {
                    case 0: {
                        W5.f.b0(object17);
                        i0.c0 = 1;
                        return this.Y.c(((BillPayAmountFieldFragment)object0).c, i0) != object18 ? t.a : object18;
                    }
                    case 1: {
                        W5.f.b0(object17);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 7: {
                if(g0 instanceof j) {
                    j0 = (j)g0;
                    int v8 = j0.c0;
                    if((v8 & 0x80000000) == 0) {
                        j0 = new j(this, g0);
                    }
                    else {
                        j0.c0 = v8 ^ 0x80000000;
                    }
                }
                else {
                    j0 = new j(this, g0);
                }
                Object object19 = j0.b0;
                Object object20 = a.X;
                switch(j0.c0) {
                    case 0: {
                        W5.f.b0(object19);
                        j0.c0 = 1;
                        return this.Y.c(((BillPayAmountFieldFragment)object0).e, j0) != object20 ? t.a : object20;
                    }
                    case 1: {
                        W5.f.b0(object19);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 8: {
                if(g0 instanceof k) {
                    k0 = (k)g0;
                    int v9 = k0.c0;
                    if((v9 & 0x80000000) == 0) {
                        k0 = new k(this, g0);
                    }
                    else {
                        k0.c0 = v9 ^ 0x80000000;
                    }
                }
                else {
                    k0 = new k(this, g0);
                }
                Object object21 = k0.b0;
                Object object22 = a.X;
                switch(k0.c0) {
                    case 0: {
                        W5.f.b0(object21);
                        k0.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((Ab.k)object0) == null), k0) != object22 ? t.a : object22;
                    }
                    case 1: {
                        W5.f.b0(object21);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 9: {
                if(g0 instanceof s) {
                    s2 = (s)g0;
                    int v10 = s2.c0;
                    if((v10 & 0x80000000) == 0) {
                        s2 = new s(this, g0);
                    }
                    else {
                        s2.c0 = v10 ^ 0x80000000;
                    }
                }
                else {
                    s2 = new s(this, g0);
                }
                Object object23 = s2.b0;
                Object object24 = a.X;
                switch(s2.c0) {
                    case 0: {
                        W5.f.b0(object23);
                        Boolean boolean0 = Boolean.valueOf(!Vb.j.c0(((String)object0)));
                        s2.c0 = 1;
                        return this.Y.c(boolean0, s2) != object24 ? t.a : object24;
                    }
                    case 1: {
                        W5.f.b0(object23);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 10: {
                if(g0 instanceof v) {
                    v11 = (v)g0;
                    int v12 = v11.c0;
                    if((v12 & 0x80000000) == 0) {
                        v11 = new v(this, g0);
                    }
                    else {
                        v11.c0 = v12 ^ 0x80000000;
                    }
                }
                else {
                    v11 = new v(this, g0);
                }
                Object object25 = v11.b0;
                Object object26 = a.X;
                switch(v11.c0) {
                    case 0: {
                        W5.f.b0(object25);
                        v11.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((Ab.k)object0) == null), v11) != object26 ? t.a : object26;
                    }
                    case 1: {
                        W5.f.b0(object25);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 11: {
                if(g0 instanceof I) {
                    i1 = (I)g0;
                    int v13 = i1.c0;
                    if((v13 & 0x80000000) == 0) {
                        i1 = new I(this, g0);
                    }
                    else {
                        i1.c0 = v13 ^ 0x80000000;
                    }
                }
                else {
                    i1 = new I(this, g0);
                }
                Object object27 = i1.b0;
                Object object28 = a.X;
                switch(i1.c0) {
                    case 0: {
                        boolean z = true;
                        W5.f.b0(object27);
                        if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
                            for(Object object29: ((List)object0)) {
                                if(!((Boolean)object29).booleanValue()) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        i1.c0 = 1;
                        return this.Y.c(Boolean.valueOf(z), i1) != object28 ? t.a : object28;
                    }
                    case 1: {
                        W5.f.b0(object27);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 12: {
                if(g0 instanceof P) {
                    p0 = (P)g0;
                    int v14 = p0.c0;
                    if((v14 & 0x80000000) == 0) {
                        p0 = new P(this, g0);
                    }
                    else {
                        p0.c0 = v14 ^ 0x80000000;
                    }
                }
                else {
                    p0 = new P(this, g0);
                }
                Object object30 = p0.b0;
                Object object31 = a.X;
                switch(p0.c0) {
                    case 0: {
                        W5.f.b0(object30);
                        ArrayList arrayList2 = new ArrayList(r.b0(((List)object0)));
                        for(Object object32: ((List)object0)) {
                            arrayList2.add(new f9.j(((K1)object32), ((J1)(((K1)object32))).Z.c, ((K1)object32).Y));
                        }
                        p0.c0 = 1;
                        return this.Y.c(arrayList2, p0) != object31 ? t.a : object31;
                    }
                    case 1: {
                        W5.f.b0(object30);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 13: {
                if(g0 instanceof V) {
                    v15 = (V)g0;
                    int v16 = v15.c0;
                    if((v16 & 0x80000000) == 0) {
                        v15 = new V(this, g0);
                    }
                    else {
                        v15.c0 = v16 ^ 0x80000000;
                    }
                }
                else {
                    v15 = new V(this, g0);
                }
                Object object33 = v15.b0;
                Object object34 = a.X;
                switch(v15.c0) {
                    case 0: {
                        W5.f.b0(object33);
                        if(((N8)object0) == null) {
                            f0 = null;
                        }
                        else {
                            O8 o80 = ((N8)object0).b;
                            f0 = o80 == null ? null : l.T(o80.b, ((N8)object0).a.a, true);
                        }
                        v15.c0 = 1;
                        return this.Y.c(f0, v15) != object34 ? t.a : object34;
                    }
                    case 1: {
                        W5.f.b0(object33);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 14: {
                if(g0 instanceof W) {
                    w0 = (W)g0;
                    int v17 = w0.c0;
                    if((v17 & 0x80000000) == 0) {
                        w0 = new W(this, g0);
                    }
                    else {
                        w0.c0 = v17 ^ 0x80000000;
                    }
                }
                else {
                    w0 = new W(this, g0);
                }
                Object object35 = w0.b0;
                Object object36 = a.X;
                switch(w0.c0) {
                    case 0: {
                        W5.f.b0(object35);
                        w0.c0 = 1;
                        return this.Y.c(Boolean.valueOf((((V8)object0) == null ? false : ((V8)object0).a.c)), w0) != object36 ? t.a : object36;
                    }
                    case 1: {
                        W5.f.b0(object35);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 15: {
                if(g0 instanceof k0) {
                    k01 = (k0)g0;
                    int v18 = k01.c0;
                    if((v18 & 0x80000000) == 0) {
                        k01 = new k0(this, g0);
                    }
                    else {
                        k01.c0 = v18 ^ 0x80000000;
                    }
                }
                else {
                    k01 = new k0(this, g0);
                }
                Object object37 = k01.b0;
                Object object38 = a.X;
                switch(k01.c0) {
                    case 0: {
                        W5.f.b0(object37);
                        k01.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((PayableWalletFragment)((m2)object0).a).d), k01) != object38 ? t.a : object38;
                    }
                    case 1: {
                        W5.f.b0(object37);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 16: {
                if(g0 instanceof p0) {
                    p01 = (p0)g0;
                    int v19 = p01.c0;
                    if((v19 & 0x80000000) == 0) {
                        p01 = new p0(this, g0);
                    }
                    else {
                        p01.c0 = v19 ^ 0x80000000;
                    }
                }
                else {
                    p01 = new p0(this, g0);
                }
                Object object39 = p01.b0;
                Object object40 = a.X;
                switch(p01.c0) {
                    case 0: {
                        boolean z1 = true;
                        W5.f.b0(object39);
                        if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
                            for(Object object41: ((List)object0)) {
                                if(!((Boolean)object41).booleanValue()) {
                                    z1 = false;
                                    break;
                                }
                            }
                        }
                        p01.c0 = 1;
                        return this.Y.c(Boolean.valueOf(z1), p01) != object40 ? t.a : object40;
                    }
                    case 1: {
                        W5.f.b0(object39);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 17: {
                if(g0 instanceof v0) {
                    v00 = (v0)g0;
                    int v20 = v00.c0;
                    if((v20 & 0x80000000) == 0) {
                        v00 = new v0(this, g0);
                    }
                    else {
                        v00.c0 = v20 ^ 0x80000000;
                    }
                }
                else {
                    v00 = new v0(this, g0);
                }
                Object object42 = v00.b0;
                Object object43 = a.X;
                switch(v00.c0) {
                    case 0: {
                        boolean z2 = true;
                        W5.f.b0(object42);
                        if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
                            for(Object object44: ((List)object0)) {
                                if(!((Boolean)object44).booleanValue()) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        v00.c0 = 1;
                        return this.Y.c(Boolean.valueOf(z2), v00) != object43 ? t.a : object43;
                    }
                    case 1: {
                        W5.f.b0(object42);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 18: {
                if(g0 instanceof z0) {
                    z00 = (z0)g0;
                    int v21 = z00.c0;
                    if((v21 & 0x80000000) == 0) {
                        z00 = new z0(this, g0);
                    }
                    else {
                        z00.c0 = v21 ^ 0x80000000;
                    }
                }
                else {
                    z00 = new z0(this, g0);
                }
                Object object45 = z00.b0;
                Object object46 = a.X;
                switch(z00.c0) {
                    case 0: {
                        W5.f.b0(object45);
                        ArrayList arrayList3 = new ArrayList(r.b0(((List)object0)));
                        for(Object object47: ((List)object0)) {
                            arrayList3.add(new f9.j(((n)object47), ((n)object47).Z.b, ((n)object47).Y));
                        }
                        z00.c0 = 1;
                        return this.Y.c(arrayList3, z00) != object46 ? t.a : object46;
                    }
                    case 1: {
                        W5.f.b0(object45);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 19: {
                if(g0 instanceof A0) {
                    a00 = (A0)g0;
                    int v22 = a00.c0;
                    if((v22 & 0x80000000) == 0) {
                        a00 = new A0(this, g0);
                    }
                    else {
                        a00.c0 = v22 ^ 0x80000000;
                    }
                }
                else {
                    a00 = new A0(this, g0);
                }
                Object object48 = a00.b0;
                Object object49 = a.X;
                switch(a00.c0) {
                    case 0: {
                        W5.f.b0(object48);
                        a00.c0 = 1;
                        return this.Y.c(((PayBillDialogFragment)((m2)object0).a).d, a00) != object49 ? t.a : object49;
                    }
                    case 1: {
                        W5.f.b0(object48);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 20: {
                if(g0 instanceof B0) {
                    b00 = (B0)g0;
                    int v23 = b00.c0;
                    if((v23 & 0x80000000) == 0) {
                        b00 = new B0(this, g0);
                    }
                    else {
                        b00.c0 = v23 ^ 0x80000000;
                    }
                }
                else {
                    b00 = new B0(this, g0);
                }
                Object object50 = b00.b0;
                Object object51 = a.X;
                switch(b00.c0) {
                    case 0: {
                        W5.f.b0(object50);
                        b00.c0 = 1;
                        return this.Y.c(((PayBillDialogFragment)((m2)object0).a).d, b00) != object51 ? t.a : object51;
                    }
                    case 1: {
                        W5.f.b0(object50);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 21: {
                if(g0 instanceof G0) {
                    g00 = (G0)g0;
                    int v24 = g00.c0;
                    if((v24 & 0x80000000) == 0) {
                        g00 = new G0(this, g0);
                    }
                    else {
                        g00.c0 = v24 ^ 0x80000000;
                    }
                }
                else {
                    g00 = new G0(this, g0);
                }
                Object object52 = g00.b0;
                Object object53 = a.X;
                switch(g00.c0) {
                    case 0: {
                        W5.f.b0(object52);
                        g00.c0 = 1;
                        return this.Y.c(((PayableWalletFragment)((m2)object0).a).b, g00) != object53 ? t.a : object53;
                    }
                    case 1: {
                        W5.f.b0(object52);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 22: {
                if(g0 instanceof H0) {
                    h01 = (H0)g0;
                    int v25 = h01.c0;
                    if((v25 & 0x80000000) == 0) {
                        h01 = new H0(this, g0);
                    }
                    else {
                        h01.c0 = v25 ^ 0x80000000;
                    }
                }
                else {
                    h01 = new H0(this, g0);
                }
                Object object54 = h01.b0;
                Object object55 = a.X;
                switch(h01.c0) {
                    case 0: {
                        W5.f.b0(object54);
                        h01.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((PayableWalletFragment)((m2)object0).a).j), h01) != object55 ? t.a : object55;
                    }
                    case 1: {
                        W5.f.b0(object54);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 23: {
                if(g0 instanceof I0) {
                    i00 = (I0)g0;
                    int v26 = i00.c0;
                    if((v26 & 0x80000000) == 0) {
                        i00 = new I0(this, g0);
                    }
                    else {
                        i00.c0 = v26 ^ 0x80000000;
                    }
                }
                else {
                    i00 = new I0(this, g0);
                }
                Object object56 = i00.b0;
                Object object57 = a.X;
                switch(i00.c0) {
                    case 0: {
                        W5.f.b0(object56);
                        i00.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((PayableWalletFragment)((m2)object0).a).q), i00) != object57 ? t.a : object57;
                    }
                    case 1: {
                        W5.f.b0(object56);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 24: {
                if(g0 instanceof J0) {
                    j01 = (J0)g0;
                    int v27 = j01.c0;
                    if((v27 & 0x80000000) == 0) {
                        j01 = new J0(this, g0);
                    }
                    else {
                        j01.c0 = v27 ^ 0x80000000;
                    }
                }
                else {
                    j01 = new J0(this, g0);
                }
                Object object58 = j01.b0;
                Object object59 = a.X;
                switch(j01.c0) {
                    case 0: {
                        W5.f.b0(object58);
                        j01.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((String)object0) != null), j01) != object59 ? t.a : object59;
                    }
                    case 1: {
                        W5.f.b0(object58);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 25: {
                if(g0 instanceof K0) {
                    k02 = (K0)g0;
                    int v28 = k02.c0;
                    if((v28 & 0x80000000) == 0) {
                        k02 = new K0(this, g0);
                    }
                    else {
                        k02.c0 = v28 ^ 0x80000000;
                    }
                }
                else {
                    k02 = new K0(this, g0);
                }
                Object object60 = k02.b0;
                Object object61 = a.X;
                switch(k02.c0) {
                    case 0: {
                        W5.f.b0(object60);
                        k02.c0 = 1;
                        return this.Y.c(Boolean.valueOf(((PayableWalletFragment)((m2)object0).a).k), k02) != object61 ? t.a : object61;
                    }
                    case 1: {
                        W5.f.b0(object60);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 26: {
                if(g0 instanceof L0) {
                    l00 = (L0)g0;
                    int v29 = l00.c0;
                    if((v29 & 0x80000000) == 0) {
                        l00 = new L0(this, g0);
                    }
                    else {
                        l00.c0 = v29 ^ 0x80000000;
                    }
                }
                else {
                    l00 = new L0(this, g0);
                }
                Object object62 = l00.b0;
                Object object63 = a.X;
                switch(l00.c0) {
                    case 0: {
                        W5.f.b0(object62);
                        ArrayList arrayList4 = o.G(((PayableWalletFragment)((m2)object0).a));
                        l00.c0 = 1;
                        return this.Y.c(arrayList4, l00) != object63 ? t.a : object63;
                    }
                    case 1: {
                        W5.f.b0(object62);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 27: {
                if(g0 instanceof Q0) {
                    q00 = (Q0)g0;
                    int v30 = q00.c0;
                    if((v30 & 0x80000000) == 0) {
                        q00 = new Q0(this, g0);
                    }
                    else {
                        q00.c0 = v30 ^ 0x80000000;
                    }
                }
                else {
                    q00 = new Q0(this, g0);
                }
                Object object64 = q00.b0;
                Object object65 = a.X;
                switch(q00.c0) {
                    case 0: {
                        W5.f.b0(object64);
                        if(((Ab.k)object0) == null) {
                            s3 = "";
                        }
                        else {
                            s3 = (String)((Ab.k)object0).X;
                            if(s3 == null) {
                                s3 = "";
                            }
                        }
                        q00.c0 = 1;
                        return this.Y.c(s3, q00) != object65 ? t.a : object65;
                    }
                    case 1: {
                        W5.f.b0(object64);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 28: {
                if(g0 instanceof S0) {
                    s00 = (S0)g0;
                    int v31 = s00.c0;
                    if((v31 & 0x80000000) == 0) {
                        s00 = new S0(this, g0);
                    }
                    else {
                        s00.c0 = v31 ^ 0x80000000;
                    }
                }
                else {
                    s00 = new S0(this, g0);
                }
                Object object66 = s00.b0;
                Object object67 = a.X;
                switch(s00.c0) {
                    case 0: {
                        W5.f.b0(object66);
                        int v32 = ((Ab.k)object0) == null ? 0x7F0600CA : ((Number)((Ab.k)object0).Y).intValue();  // color:feeTextColor
                        Context context0 = C3.s0;
                        Nb.j.c(context0);
                        Integer integer0 = new Integer(context0.getColor(v32));
                        s00.c0 = 1;
                        return this.Y.c(integer0, s00) != object67 ? t.a : object67;
                    }
                    case 1: {
                        W5.f.b0(object66);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof T0) {
                    t00 = (T0)g0;
                    int v = t00.c0;
                    if((v & 0x80000000) == 0) {
                        t00 = new T0(this, g0);
                    }
                    else {
                        t00.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    t00 = new T0(this, g0);
                }
                Object object1 = t00.b0;
                Object object2 = a.X;
                switch(t00.c0) {
                    case 0: {
                        W5.f.b0(object1);
                        Iterable iterable0 = ((PayableWalletFragment)((m2)object0).a).f;
                        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
                        for(Object object3: iterable0) {
                            arrayList0.add(((m5)object3).b);
                        }
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object4: arrayList0) {
                            if(((BillFieldsFragment)object4).g) {
                                arrayList1.add(object4);
                            }
                        }
                        t00.c0 = 1;
                        return this.Y.c(arrayList1, t00) != object2 ? t.a : object2;
                    }
                    case 1: {
                        W5.f.b0(object1);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

