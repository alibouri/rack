package N9;

import Ab.k;
import Ab.t;
import Ea.Z;
import Eb.a;
import F0.W;
import Fb.j;
import Ha.S;
import Mb.f;
import Qa.T;
import R9.X1;
import Sa.c;
import Xb.J;
import Y8.H6;
import Y8.N5;
import Y8.R6;
import Y8.m2;
import a4.b;
import a4.d;
import a4.e;
import a4.h;
import a9.D4;
import a9.k6;
import ac.i;
import ac.o0;
import ac.q;
import ac.w;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.apollographql.apollo.api.ApolloRequest;
import com.google.android.gms.internal.measurement.E1;
import com.sendwave.backend.type.WalletType.PERSONAL;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.Country;
import com.wave.accounts.AccountEvent;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase;
import ha.M0;
import ha.P2;
import ha.R2;
import ha.S2;
import ha.U2;
import ha.V1;
import ha.a0;
import ha.s1;
import java.util.List;
import java.util.Set;
import k2.Q0;
import k2.g1;
import k2.h1;
import k2.i0;
import k2.r0;
import k2.w0;
import k2.y1;
import k2.z1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ma.q0;
import q2.C;
import ra.t0;
import va.E;
import y.d0;
import y.n;
import y.p0;
import y.s;

public final class l extends j implements Function3 {
    public final int c0;
    public int d0;
    public Object e0;
    public Object f0;
    public final Object g0;

    public l(Object object0, g g0, int v) {
        this.c0 = v;
        this.g0 = object0;
        super(3, g0);
    }

    public l(g g0, f f0) {
        this.c0 = 4;
        this.g0 = (j)f0;
        super(3, g0);
    }

    public l(g g0, Object object0, int v) {
        this.c0 = v;
        this.g0 = object0;
        super(3, g0);
    }

    public l(Function2 function20, g g0) {
        this.c0 = 3;
        this.g0 = (j)function20;
        super(3, g0);
    }

    public l(d0 d00, n n0, g g0) {
        this.c0 = 18;
        this.f0 = d00;
        this.g0 = n0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                l l1 = new l(((g)object2), ((N9.n)this.g0), 0);
                l1.e0 = (i)object0;
                l1.f0 = object1;
                return l1.v(t.a);
            }
            case 1: {
                l l2 = new l(((g)object2), ((X1)this.g0), 1);
                l2.e0 = (i)object0;
                l2.f0 = object1;
                return l2.v(t.a);
            }
            case 2: {
                l l3 = new l(((ApolloRequest)this.g0), ((g)object2), 2);
                l3.e0 = (i)object0;
                l3.f0 = (d)object1;
                return l3.v(t.a);
            }
            case 3: {
                l l4 = new l(((Function2)(((j)this.g0))), ((g)object2));
                l4.e0 = (i)object0;
                l4.f0 = object1;
                return l4.v(t.a);
            }
            case 4: {
                l l5 = new l(((g)object2), ((f)(((j)this.g0))));
                l5.e0 = (i)object0;
                l5.f0 = (Object[])object1;
                return l5.v(t.a);
            }
            case 5: {
                l l6 = new l(((g)object2), ((S2)this.g0), 5);
                l6.e0 = (i)object0;
                l6.f0 = object1;
                return l6.v(t.a);
            }
            case 6: {
                l l7 = new l(((g)object2), ((CloseableCoroutineScope)this.g0), 6);
                l7.e0 = (i)object0;
                l7.f0 = object1;
                return l7.v(t.a);
            }
            case 7: {
                ((Boolean)object1).getClass();
                l l8 = new l(((w0)this.g0), ((g)object2), 7);
                l8.f0 = (r0)object0;
                return l8.v(t.a);
            }
            case 8: {
                l l9 = new l(((g)object2), ((w0)this.g0), 8);
                l9.e0 = (i)object0;
                l9.f0 = object1;
                return l9.v(t.a);
            }
            case 9: {
                l l10 = new l(((g)object2), ((TransactionHistoryDatabase)this.g0), 9);
                l10.e0 = (i)object0;
                l10.f0 = object1;
                return l10.v(t.a);
            }
            case 10: {
                l l11 = new l(((g)object2), ((q0)this.g0), 10);
                l11.e0 = (i)object0;
                l11.f0 = object1;
                return l11.v(t.a);
            }
            case 11: {
                l l12 = new l(((g)object2), ((q9.i)this.g0), 11);
                l12.e0 = (i)object0;
                l12.f0 = object1;
                return l12.v(t.a);
            }
            case 12: {
                l l13 = new l(((g)object2), ((R2)this.g0), 12);
                l13.e0 = (i)object0;
                l13.f0 = (Object[])object1;
                return l13.v(t.a);
            }
            case 13: {
                l l14 = new l(((g)object2), ((P2)this.g0), 13);
                l14.e0 = (i)object0;
                l14.f0 = (Object[])object1;
                return l14.v(t.a);
            }
            case 14: {
                l l15 = new l(((g)object2), ((M0)this.g0), 14);
                l15.e0 = (i)object0;
                l15.f0 = (Object[])object1;
                return l15.v(t.a);
            }
            case 15: {
                l l16 = new l(((g)object2), ((s1)this.g0), 15);
                l16.e0 = (i)object0;
                l16.f0 = (Object[])object1;
                return l16.v(t.a);
            }
            case 16: {
                l l17 = new l(((g)object2), ((t0)this.g0), 16);
                l17.e0 = (i)object0;
                l17.f0 = object1;
                return l17.v(t.a);
            }
            case 17: {
                l l18 = new l(((g)object2), ((W)this.g0), 17);
                l18.e0 = (i)object0;
                l18.f0 = object1;
                return l18.v(t.a);
            }
            default: {
                p0 p00 = (p0)object1;
                l l0 = new l(((d0)this.f0), ((n)this.g0), ((g)object2));
                l0.e0 = (s)object0;
                return l0.v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i22;
        a a13;
        Object object62;
        Object object47;
        i i19;
        Object object38;
        i i17;
        i i15;
        a a9;
        Object object30;
        i i11;
        Object object13;
        Integer integer0;
        y1 y11;
        z1 z10;
        r0 r00;
        Object object11;
        Object object9;
        Object object8;
        i i5;
        Object object7;
        i i3;
        l l0 = this;
        Object object1 = l0.g0;
        Object object2 = t.a;
        switch(l0.c0) {
            case 0: {
                Object object3 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i0 = (i)l0.e0;
                        N2.l l1 = ((Boolean)l0.f0).booleanValue() ? new N2.l(4, null) : new S(((N9.n)object1).c, 3, ((N9.n)object1));
                        l0.d0 = 1;
                        return o0.p(l1, i0, l0) == object3 ? object3 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                Object object4 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i1 = (i)l0.e0;
                        N2.l l2 = ((Boolean)l0.f0).booleanValue() ? new N2.l(4, Boolean.FALSE) : new Aa.t0(((X1)object1).e0, 20);
                        l0.d0 = 1;
                        return o0.p(l2, i1, l0) == object4 ? object4 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                Object object5 = a.X;
                int v = l0.d0;
                switch(v) {
                    case 0: {
                        W5.f.b0(object0);
                        i i2 = (i)l0.e0;
                        d d0 = (d)l0.f0;
                        if(!(d0 instanceof h) && !(d0 instanceof b)) {
                            if(!(d0 instanceof a4.g)) {
                                goto label_57;
                            }
                            l0.e0 = null;
                            l0.d0 = 1;
                            if(i2.c(d0, l0) == object5) {
                                return object5;
                            label_57:
                                if(d0 instanceof e) {
                                    System.out.println("Received general error while executing operation " + ((ApolloRequest)object1).getOperation().name() + ": " + ((e)d0).a);
                                    return Boolean.valueOf(true);
                                }
                                l0.e0 = null;
                                l0.d0 = 2;
                                return i2.c(d0, l0) == object5 ? object5 : Boolean.valueOf(true);
                            }
                        }
                        return Boolean.valueOf(false);
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return Boolean.valueOf(false);
                    }
                    default: {
                        if(v != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return Boolean.valueOf(true);
                    }
                }
            }
            case 3: {
                Object object6 = a.X;
                int v1 = l0.d0;
                switch(v1) {
                    case 0: {
                        W5.f.b0(object0);
                        i3 = (i)l0.e0;
                        l0.e0 = i3;
                        l0.d0 = 1;
                        object7 = ((Function2)(((j)object1))).j(l0.f0, l0);
                        if(object7 == object6) {
                            return object6;
                        }
                        break;
                    }
                    case 1: {
                        i i4 = (i)l0.e0;
                        W5.f.b0(object0);
                        i3 = i4;
                        object7 = object0;
                        break;
                    }
                    default: {
                        if(v1 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return object2;
                    }
                }
                l0.e0 = null;
                l0.d0 = 2;
                return i3.c(object7, l0) == object6 ? object6 : object2;
            }
            case 4: {
                a a1 = a.X;
                int v2 = l0.d0;
                switch(v2) {
                    case 0: {
                        W5.f.b0(object0);
                        i5 = (i)l0.e0;
                        Object[] arr_object = (Object[])l0.f0;
                        l0.e0 = i5;
                        l0.d0 = 1;
                        object8 = object2;
                        object9 = ((f)(((j)object1))).d(arr_object[0], arr_object[1], arr_object[2], arr_object[3], this);
                        if(object9 == a1) {
                            return a1;
                        }
                        break;
                    }
                    case 1: {
                        i i6 = (i)l0.e0;
                        W5.f.b0(object0);
                        i5 = i6;
                        object8 = object2;
                        object9 = object0;
                        break;
                    }
                    default: {
                        if(v2 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return object2;
                    }
                }
                l0.e0 = null;
                l0.d0 = 2;
                return i5.c(object9, l0) != a1 ? object8 : a1;
            }
            case 5: {
                a a2 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i7 = (i)l0.e0;
                        N2.l l3 = ((N9.d)l0.f0) == null ? ((S2)object1).k1 : new N2.l(6, new q(V1.X, ((S2)object1).k1, null));
                        l0.d0 = 1;
                        return o0.p(l3, i7, l0) == a2 ? a2 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 6: {
                a a3 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i8 = (i)l0.e0;
                        i0 i00 = new i0(((CloseableCoroutineScope)object1), ((h1)l0.f0));
                        l0.d0 = 1;
                        return i8.c(i00, l0) == a3 ? a3 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 7: {
                Object object10 = a.X;
                int v3 = l0.d0;
                switch(v3) {
                    case 0: {
                        W5.f.b0(object0);
                        r00 = (r0)l0.f0;
                        l0.f0 = r00;
                        l0.d0 = 1;
                        object11 = w0.a(((w0)object1), (r00 == null ? null : r00.a.b), l0);
                        if(object11 == object10) {
                            return object10;
                        }
                        goto label_163;
                    }
                    case 1: {
                        r00 = (r0)l0.f0;
                        W5.f.b0(object0);
                        object11 = object0;
                    label_163:
                        if(r00 == null) {
                            y11 = (y1)object11;
                            z10 = null;
                        }
                        else {
                            l0.f0 = r00;
                            l0.e0 = (y1)object11;
                            l0.d0 = 2;
                            Object object12 = r00.a.e(l0);
                            if(object12 != object10) {
                                z10 = (z1)object12;
                                y11 = (y1)object11;
                                break;
                            }
                            return object10;
                        }
                        break;
                    }
                    default: {
                        if(v3 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        y1 y10 = (y1)l0.e0;
                        r00 = (r0)l0.f0;
                        W5.f.b0(object0);
                        z10 = (z1)object0;
                        y11 = y10;
                        break;
                    }
                }
                List list0 = z10 == null ? null : z10.a;
                if((list0 == null || list0.isEmpty()) && r00 != null) {
                    z1 z11 = r00.b;
                    if(z11 != null && !z11.a.isEmpty() == 1) {
                        z10 = z11;
                    }
                }
                if((z10 == null ? null : z10.b) == null) {
                    if(r00 == null) {
                        integer0 = null;
                    }
                    else {
                        z1 z12 = r00.b;
                        integer0 = z12 == null ? null : z12.b;
                    }
                    if(integer0 != null) {
                        z10 = r00.b;
                    }
                }
                if(z10 == null) {
                    object13 = ((w0)object1).b;
                }
                else {
                    object13 = y11.b(z10);
                    if(Build.ID != null && Log.isLoggable("Paging", 3)) {
                        String s = "Refresh key " + object13 + " returned from PagingSource " + y11;
                        Nb.j.f(s, "message");
                        Log.d("Paging", s, null);
                    }
                }
                if(r00 != null) {
                    r00.a.j.f(null);
                }
                if(r00 != null) {
                    r00.c.f(null);
                }
                T t0 = (T)((w0)object1).e.Z;
                a0 a00 = new a0(0, ((w0)object1), w0.class, "refresh", "refresh()V", 0, 6);
                return new r0(new Q0(object13, y11, ((w0)object1).c, t0, z10, a00), z10, J.b());
            }
            case 8: {
                a a4 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i9 = (i)l0.e0;
                        r0 r01 = (r0)l0.f0;
                        ((w0)object1).getClass();
                        k2.t0 t00 = new k2.t0(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
                        w w0 = new w(r01.a.k, t00, 4);
                        Nb.j.f(((w0)object1).e, "retryEventBus");
                        h1 h10 = new h1(w0, new j6.w(25), new g3.b(8, r01.a), g1.X);
                        l0.d0 = 1;
                        return i9.c(h10, l0) == a4 ? a4 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 9: {
                a a5 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i10 = (i)l0.e0;
                        Set set0 = (Set)l0.f0;
                        Ma.w w1 = ((TransactionHistoryDatabase)object1).s();
                        w1.getClass();
                        Nb.j.f(set0, "hiddenTx");
                        Nb.j.f(PERSONAL.X, "walletType");
                        String s1 = Pb.a.s(set0);
                        l0.d0 = 1;
                        return o0.p(new N2.l(new q2.e(false, w1.a, new String[]{"history_entries"}, new Ma.n(w1, new E1("SELECT * FROM history_entries WHERE id NOT IN (" + s1 + ") AND wallet_type = \'" + PERSONAL.Y + "\' ORDER BY when_entered DESC LIMIT 13"), 0), null)), i10, l0) == a5 ? a5 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 10: {
                a a6 = a.X;
                int v4 = l0.d0;
                switch(v4) {
                    case 0: {
                        W5.f.b0(object0);
                        i11 = (i)l0.e0;
                        if(((Boolean)l0.f0).booleanValue()) {
                            l0.e0 = i11;
                            l0.d0 = 1;
                            if(q0.p(((q0)object1), l0) != a6) {
                                i11 = i11;
                                goto label_258;
                            }
                        }
                        else {
                            goto label_258;
                        }
                        break;
                    }
                    case 1: {
                        i i12 = (i)l0.e0;
                        W5.f.b0(object0);
                        i11 = i12;
                    label_258:
                        l0.e0 = null;
                        l0.d0 = 2;
                        if(o0.p(((q0)object1).r0, i11, l0) != a6) {
                            return object2;
                        }
                        break;
                    }
                    default: {
                        if(v4 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return object2;
                    }
                }
                return a6;
            }
            case 11: {
                a a7 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i13 = (i)l0.e0;
                        String s2 = (String)l0.f0;
                        ((q9.i)object1).b0.getClass();
                        Nb.j.f(s2, "searchQuery");
                        C c0 = M6.b.o(2, "SELECT * from agent_location WHERE agentSubcity LIKE \'%\'|| ? ||\'%\' OR agentCity LIKE \'%\'|| ? ||\'%\' ORDER BY agentCity COLLATE NOCASE ASC");
                        c0.c(1, s2);
                        c0.c(2, s2);
                        Ma.n n0 = new Ma.n(((q9.i)object1).b0, c0, 4);
                        N2.l l4 = new N2.l(new q2.e(false, ((q9.i)object1).b0.a, new String[]{"agent_location"}, n0, null));
                        l0.d0 = 1;
                        return o0.p(l4, i13, l0) == a7 ? a7 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 12: {
                a a8 = a.X;
                int v5 = l0.d0;
                switch(v5) {
                    case 0: {
                        W5.f.b0(object0);
                        i i14 = (i)l0.e0;
                        Object[] arr_object1 = (Object[])l0.f0;
                        Object object14 = arr_object1[0];
                        Object object15 = arr_object1[1];
                        Object object16 = arr_object1[2];
                        Object object17 = arr_object1[3];
                        Object object18 = arr_object1[4];
                        Object object19 = arr_object1[5];
                        Object object20 = arr_object1[6];
                        Object object21 = arr_object1[7];
                        Object object22 = arr_object1[8];
                        Object object23 = arr_object1[9];
                        Object object24 = arr_object1[10];
                        Object object25 = arr_object1[11];
                        Object object26 = arr_object1[12];
                        Object object27 = arr_object1[13];
                        Object object28 = arr_object1[14];
                        Object object29 = arr_object1[15];
                        l0.e0 = i14;
                        l0.d0 = 1;
                        ((R2)object1).getClass();
                        R2 r20 = new R2(l0);
                        r20.c0 = (m2)object14;
                        r20.d0 = ((Boolean)object15).booleanValue();
                        r20.e0 = (String)object16;
                        r20.f0 = (ha.J)object17;
                        r20.g0 = (N9.d)object18;
                        r20.h0 = (X9.j)object19;
                        r20.i0 = (ha.i)object20;
                        r20.j0 = (U2)object21;
                        r20.k0 = ((Boolean)object22).booleanValue();
                        r20.l0 = (ia.j)object23;
                        r20.m0 = ((Boolean)object24).booleanValue();
                        r20.n0 = (D4)object25;
                        r20.o0 = (List)object26;
                        r20.p0 = (AccountEvent)object27;
                        r20.q0 = (S9.i)object28;
                        r20.r0 = (CurrencyAmount)object29;
                        object2 = object2;
                        object30 = r20.v(object2);
                        a9 = a8;
                        if(object30 != a9) {
                            l0 = this;
                            i15 = i14;
                            goto label_340;
                        }
                        break;
                    }
                    case 1: {
                        i i16 = (i)l0.e0;
                        W5.f.b0(object0);
                        a9 = a8;
                        i15 = i16;
                        object30 = object0;
                    label_340:
                        l0.e0 = null;
                        l0.d0 = 2;
                        if(i15.c(object30, l0) != a9) {
                            return object2;
                        }
                        break;
                    }
                    default: {
                        if(v5 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return object2;
                    }
                }
                return a9;
            }
            case 13: {
                a a10 = a.X;
                int v6 = l0.d0;
                switch(v6) {
                    case 0: {
                        W5.f.b0(object0);
                        i17 = (i)l0.e0;
                        Object[] arr_object2 = (Object[])l0.f0;
                        Object object31 = arr_object2[0];
                        Object object32 = arr_object2[1];
                        Object object33 = arr_object2[2];
                        Object object34 = arr_object2[3];
                        Object object35 = arr_object2[4];
                        Object object36 = arr_object2[5];
                        Object object37 = arr_object2[6];
                        l0.e0 = i17;
                        l0.d0 = 1;
                        ((P2)object1).getClass();
                        P2 p20 = new P2(l0);
                        p20.c0 = (List)object31;
                        p20.d0 = ((Boolean)object32).booleanValue();
                        p20.e0 = ((Boolean)object33).booleanValue();
                        p20.f0 = ((Boolean)object34).booleanValue();
                        p20.g0 = ((Boolean)object35).booleanValue();
                        p20.h0 = (O0.f)object36;
                        p20.i0 = (k)object37;
                        object38 = p20.v(object2);
                        if(object38 == a10) {
                            return a10;
                        }
                        break;
                    }
                    case 1: {
                        i i18 = (i)l0.e0;
                        W5.f.b0(object0);
                        i17 = i18;
                        object38 = object0;
                        break;
                    }
                    default: {
                        if(v6 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return object2;
                    }
                }
                l0.e0 = null;
                l0.d0 = 2;
                return i17.c(object38, l0) != a10 ? object2 : a10;
            }
            case 14: {
                a a11 = a.X;
                int v7 = l0.d0;
                switch(v7) {
                    case 0: {
                        W5.f.b0(object0);
                        i19 = (i)l0.e0;
                        Object[] arr_object3 = (Object[])l0.f0;
                        Object object39 = arr_object3[0];
                        Object object40 = arr_object3[1];
                        Object object41 = arr_object3[2];
                        Object object42 = arr_object3[3];
                        Object object43 = arr_object3[4];
                        Object object44 = arr_object3[5];
                        Object object45 = arr_object3[6];
                        Object object46 = arr_object3[7];
                        l0.e0 = i19;
                        l0.d0 = 1;
                        ((M0)object1).getClass();
                        M0 m00 = new M0(l0);
                        m00.c0 = ((Boolean)object39).booleanValue();
                        m00.d0 = (String)object40;
                        m00.e0 = ((Boolean)object41).booleanValue();
                        m00.f0 = (k6)object42;
                        m00.g0 = ((Boolean)object43).booleanValue();
                        m00.h0 = (wa.h)object44;
                        m00.i0 = (c)object45;
                        m00.j0 = ((Boolean)object46).booleanValue();
                        object47 = m00.v(object2);
                        if(object47 == a11) {
                            return a11;
                        }
                        break;
                    }
                    case 1: {
                        i i20 = (i)l0.e0;
                        W5.f.b0(object0);
                        i19 = i20;
                        object47 = object0;
                        break;
                    }
                    default: {
                        if(v7 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        W5.f.b0(object0);
                        return object2;
                    }
                }
                l0.e0 = null;
                l0.d0 = 2;
                return i19.c(object47, l0) != a11 ? object2 : a11;
            }
            case 15: {
                a a12 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i21 = (i)l0.e0;
                        Object[] arr_object4 = (Object[])l0.f0;
                        Object object48 = arr_object4[0];
                        Object object49 = arr_object4[1];
                        Object object50 = arr_object4[2];
                        Object object51 = arr_object4[3];
                        Object object52 = arr_object4[4];
                        Object object53 = arr_object4[5];
                        Object object54 = arr_object4[6];
                        Object object55 = arr_object4[7];
                        Object object56 = arr_object4[8];
                        Object object57 = arr_object4[9];
                        Object object58 = arr_object4[10];
                        Object object59 = arr_object4[11];
                        Object object60 = arr_object4[12];
                        Object object61 = arr_object4[13];
                        l0.e0 = i21;
                        l0.d0 = 1;
                        ((s1)object1).getClass();
                        s1 s10 = new s1(l0);
                        s10.c0 = (List)object48;
                        s10.d0 = (t9.a)object49;
                        s10.e0 = ((Boolean)object50).booleanValue();
                        s10.f0 = ((Boolean)object51).booleanValue();
                        s10.g0 = (k6)object52;
                        s10.h0 = ((Boolean)object53).booleanValue();
                        s10.i0 = ((Boolean)object54).booleanValue();
                        s10.j0 = (Z)object55;
                        s10.k0 = (wa.h)object56;
                        s10.l0 = (String)object57;
                        s10.m0 = ((Boolean)object58).booleanValue();
                        s10.n0 = (ga.l)object59;
                        s10.o0 = (c)object60;
                        s10.p0 = (ja.d)object61;
                        object2 = object2;
                        object62 = s10.v(object2);
                        a13 = a12;
                        if(object62 != a13) {
                            l0 = this;
                            i22 = i21;
                            goto label_479;
                        }
                        break;
                    }
                    case 1: {
                        i i23 = (i)l0.e0;
                        W5.f.b0(object0);
                        a13 = a12;
                        i22 = i23;
                        object62 = object0;
                    label_479:
                        l0.e0 = null;
                        l0.d0 = 2;
                        if(i22.c(object62, l0) != a13) {
                            return object2;
                        }
                        break;
                    }
                    case 2: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return a13;
            }
            case 16: {
                a a14 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i24 = (i)l0.e0;
                        t t1 = (t)l0.f0;
                        N5 n50 = new N5();  // initializer: Ljava/lang/Object;-><init>()V
                        N2.l l5 = R6.g(((t0)object1).b, n50, H6.Y);
                        l0.d0 = 1;
                        return o0.p(l5, i24, l0) == a14 ? a14 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 17: {
                a a15 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        i i25 = (i)l0.e0;
                        String s3 = (String)l0.f0;
                        N2.l l6 = s3 == null ? o0.c(null) : E.a(((R6)((W)object1).b), ((Ma.w)((W)object1).c), s3, ((Country)((W)object1).e), null, ((q9.n)((W)object1).d), 0);
                        l0.d0 = 1;
                        return o0.p(l6, i25, l0) == a15 ? a15 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                a a0 = a.X;
                switch(l0.d0) {
                    case 0: {
                        W5.f.b0(object0);
                        y.k k0 = new y.k(((n)object1), ((s)l0.e0), 1);
                        l0.d0 = 1;
                        return ((d0)l0.f0).j(k0, l0) == a0 ? a0 : object2;
                    }
                    case 1: {
                        W5.f.b0(object0);
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

