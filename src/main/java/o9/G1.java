package o9;

import Ab.k;
import Ab.t;
import Bb.A;
import Bb.F;
import Bb.r;
import Bb.z;
import D9.a;
import Ea.E0;
import G9.c;
import N2.l;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import W5.f;
import Xb.A0;
import Y8.G6;
import Y8.H4;
import Y8.J4;
import Y8.N4;
import Y8.N;
import Y8.P4;
import Y8.R6;
import Y8.R9;
import Y8.S6;
import Y8.q4;
import Y8.y6;
import ac.B0;
import ac.e0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.sendwave.backend.fragment.BillInvoiceListFragment;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.shared.ProposedBillField;
import com.sendwave.util.ParcelableSingleton;
import d9.M;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function3;
import p9.D;
import q9.n;
import q9.r1;

public final class g1 extends Y0 {
    public final a L0;
    public final WatchedProperty M0;
    public final D N0;
    public final B0 O0;
    public final e0 P0;
    public final j0 Q0;
    public final WatchedProperty R0;
    public final WatchedProperty S0;
    public final j0 T0;
    public static final e[] U0;
    public static final SimpleDateFormat V0;

    static {
        p p0 = new p(g1.class, "wPollForPayment", "getWPollForPayment()Ljava/lang/Boolean;", 0);
        x.a.getClass();
        g1.U0 = new e[]{p0, new p(g1.class, "wSelectedInvoice", "getWSelectedInvoice()Lcom/sendwave/shared/BillInvoiceModel;", 0), new p(g1.class, "wSelectedInvoiceBillPay2Proposal", "getWSelectedInvoiceBillPay2Proposal()Lcom/sendwave/shared/BillPay2Proposal;", 0)};
        g1.V0 = new SimpleDateFormat("dd/MM/yyyy");
    }

    public g1(R6 r60, PayBillDialogParams payBillDialogParams0, n n0, c c0, a a0) {
        j.f(r60, "repo");
        j.f(c0, "announcementsSource");
        j.f(a0, "adTracking");
        super(r60, payBillDialogParams0, n0, c0, false, 0x60);
        this.L0 = a0;
        j.c(payBillDialogParams0.b0);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        U0 u00 = new U0(o0.B(r60.h(payBillDialogParams0.b0, BillInvoiceListFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1), 1);
        this.M0 = FlowWatcherKt.b(this.r0).b(this, g1.U0[0]);
        this.N0 = new D(r60, this.d0, this);
        B0 b00 = o0.c(null);
        this.O0 = b00;
        e0 e00 = new e0(b00, u00, new X0(3, null, 2), 0);
        e0 e01 = new e0(u00, e00, new E0(this, null, 5), 0);
        this.P0 = e01;
        this.Q0 = q9.o0.d0(this, new l(14, u00), r1.d(0x7F1202F8, new Object[0]));  // string:pay "Pay"
        e0 e02 = new e0(e01, e00, new X0(3, null, 1), 0);
        this.R0 = FlowWatcherKt.b(e02).b(this, g1.U0[1]);
        E0 e03 = new E0(payBillDialogParams0, null, 6);
        this.S0 = FlowWatcherKt.b(new e0(e02, this.d0, e03, 0)).b(this, g1.U0[2]);
        this.T0 = q9.o0.a(Boolean.TRUE);
    }

    @Override  // o9.Y0
    public final h v() {
        return this.T0;
    }

    @Override  // o9.Y0
    public final A0 x() {
        d1 d10 = new d1(this, null);
        return N.k(this, this.l0, true, d10);
    }

    public static final Object y(g1 g10, R9 r90, Fb.c c0) {
        g1 g15;
        y6 y61;
        b b4;
        y6 y60;
        b b3;
        g1 g14;
        h0 h04;
        Object object12;
        q4 q40;
        Object object9;
        b b1;
        AtomicInteger atomicInteger3;
        P4 p40;
        h0 h02;
        R9 r91;
        h0 h01;
        AtomicInteger atomicInteger1;
        A a0;
        AtomicInteger atomicInteger0;
        h0 h00;
        b b0;
        c1 c10;
        g1 g11 = g10;
        g10.getClass();
        if(c0 instanceof c1) {
            c10 = (c1)c0;
            int v = c10.i0;
            if((v & 0x80000000) == 0) {
                c10 = new c1(g11, c0);
            }
            else {
                c10.i0 = v ^ 0x80000000;
            }
        }
        else {
            c10 = new c1(g11, c0);
        }
        Object object0 = c10.g0;
        Object object1 = Eb.a.X;
        List list0 = z.X;
        t t0 = t.a;
        switch(c10.i0) {
            case 0: {
                f.b0(object0);
                e[] arr_e = g1.U0;
                b0 = (b)g11.R0.a(arr_e[1], g11);
                if(b0 != null) {
                    Boolean boolean0 = (Boolean)g11.M0.a(arr_e[0], g11);
                    boolean z = boolean0 == null ? true : boolean0.booleanValue();
                    String s = g10.r();
                    if(s != null) {
                        h00 = g11.p0;
                        D d0 = g11.N0;
                        PayBillDialogParams payBillDialogParams0 = g11.i0;
                        if(z) {
                            Map map0 = N.a;
                            Object object2 = map0.get(h00);
                            if(object2 == null) {
                                object2 = m5.b.E(0, map0, ((B0)h00));
                            }
                            atomicInteger0 = (AtomicInteger)object2;
                            do {
                                Object object3 = ((B0)h00).getValue();
                                ((Boolean)object3).getClass();
                            }
                            while(!((B0)h00).j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                            try {
                                List list1 = g10.w();
                                List list2 = payBillDialogParams0.c0;
                                if(list2 == null) {
                                    a0 = A.X;
                                }
                                else {
                                    int v1 = F.I(r.b0(list2));
                                    if(v1 < 16) {
                                        v1 = 16;
                                    }
                                    a0 = new LinkedHashMap(v1);
                                    for(Object object4: list2) {
                                        j0 j00 = q9.o0.a(((ProposedBillField)object4).Z);
                                        a0.put(((ProposedBillField)object4).X, j00);
                                    }
                                }
                                c10.b0 = g11;
                                c10.c0 = r90;
                                c10.d0 = b0;
                                c10.e0 = h00;
                                c10.f0 = atomicInteger0;
                                c10.i0 = 1;
                                if(d0.d(list1, a0, c10) == object1) {
                                    return object1;
                                }
                            }
                            catch(Throwable throwable0) {
                                atomicInteger1 = atomicInteger0;
                                h01 = h00;
                                goto label_158;
                            }
                            r91 = r90;
                            h02 = h00;
                            goto label_123;
                        }
                        String s1 = ((String)Vb.j.p0(s, new String[]{":"}, 0, 6).get(0)).substring(3);
                        j.e(s1, "substring(...)");
                        String s2 = UUID.randomUUID().toString();
                        j.e(s2, "toString(...)");
                        Optional optional0 = Optional.Companion.presentIfNotNull(payBillDialogParams0.e0);
                        Optional optional1 = Optional.Companion.presentIfNotNull(payBillDialogParams0.f0);
                        List list3 = payBillDialogParams0.c0;
                        if(list3 != null) {
                            list0 = list3;
                        }
                        ArrayList arrayList0 = new ArrayList(r.b0(list0));
                        for(Object object5: list0) {
                            Present optional$Present0 = S6.a(((ProposedBillField)object5).Z);
                            arrayList0.add(new M(((ProposedBillField)object5).X, optional$Present0));
                        }
                        Present optional$Present1 = S6.a(Bb.p.G0(arrayList0, new M("invoice_reference", S6.a(b0.d))));
                        p40 = new P4(s1, b0.b, s2, optional0, optional1, optional$Present1);
                        Map map1 = N.a;
                        Object object6 = map1.get(h00);
                        if(object6 == null) {
                            object6 = m5.b.E(0, map1, ((B0)h00));
                        }
                        AtomicInteger atomicInteger2 = (AtomicInteger)object6;
                        do {
                            Object object7 = ((B0)h00).getValue();
                            ((Boolean)object7).getClass();
                        }
                        while(!((B0)h00).j(object7, Boolean.valueOf(atomicInteger2.incrementAndGet() > 0)));
                        try {
                            List list4 = g10.w();
                            c10.b0 = g11;
                            c10.c0 = b0;
                            c10.d0 = p40;
                            c10.e0 = h00;
                            c10.f0 = atomicInteger2;
                            c10.i0 = 4;
                            if(d0.d(list4, g11.u0, c10) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable1) {
                            atomicInteger3 = atomicInteger2;
                            h04 = h00;
                            goto label_209;
                        }
                        b1 = b0;
                        atomicInteger3 = atomicInteger2;
                        goto label_185;
                    }
                }
                return t0;
            }
            case 1: {
                atomicInteger1 = c10.f0;
                h0 h03 = (h0)c10.e0;
                b b2 = (b)c10.d0;
                r91 = (R9)c10.c0;
                g1 g12 = c10.b0;
                try {
                    f.b0(object0);
                    atomicInteger0 = atomicInteger1;
                    h02 = h03;
                    b0 = b2;
                    g11 = g12;
                }
                catch(Throwable throwable0) {
                    h01 = h03;
                    goto label_158;
                }
                try {
                label_123:
                    CurrencyAmount currencyAmount0 = b0.b;
                    List list5 = g11.i0.c0;
                    if(list5 != null) {
                        list0 = list5;
                    }
                    ArrayList arrayList1 = new ArrayList(r.b0(list0));
                    for(Object object8: list0) {
                        arrayList1.add(new k(((ProposedBillField)object8).X, ((ProposedBillField)object8).Z));
                    }
                    ArrayList arrayList2 = Bb.p.G0(arrayList1, new k("invoice_reference", b0.d));
                    c10.b0 = g11;
                    c10.c0 = h02;
                    c10.d0 = atomicInteger0;
                    c10.e0 = null;
                    c10.f0 = null;
                    c10.i0 = 2;
                    object9 = g11.p(r91, currencyAmount0, arrayList2, null, g11.i0.f0, c10);
                }
                catch(Throwable throwable0) {
                    atomicInteger1 = atomicInteger0;
                    h01 = h02;
                    goto label_158;
                }
                if(object9 == object1) {
                    return object1;
                }
                try {
                    h01 = h02;
                    atomicInteger1 = atomicInteger0;
                    q40 = (q4)object9;
                    goto label_162;
                }
                catch(Throwable throwable0) {
                    goto label_158;
                }
            }
            case 2: {
                atomicInteger1 = (AtomicInteger)c10.d0;
                h01 = (h0)c10.c0;
                g11 = c10.b0;
                try {
                    f.b0(object0);
                    q40 = (q4)object0;
                    goto label_162;
                }
                catch(Throwable throwable0) {
                }
                do {
                label_158:
                    Object object10 = ((B0)h01).getValue();
                    ((Boolean)object10).getClass();
                }
                while(!((B0)h01).j(object10, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                throw throwable0;
                do {
                label_162:
                    Object object11 = ((B0)h01).getValue();
                    ((Boolean)object11).getClass();
                }
                while(!((B0)h01).j(object11, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                c10.b0 = null;
                c10.c0 = null;
                c10.d0 = null;
                c10.i0 = 3;
                object12 = g11.l0.e(c10);
                if(object12 == object1) {
                    return object1;
                }
                ((b0)object12).Y(new PayBillDialogResult(null));
                return t0;
            }
            case 3: {
                f.b0(object0);
                object12 = object0;
                ((b0)object12).Y(new PayBillDialogResult(null));
                return t0;
            }
            case 4: {
                atomicInteger3 = c10.f0;
                h04 = (h0)c10.e0;
                P4 p41 = (P4)c10.d0;
                b1 = (b)c10.c0;
                g1 g13 = c10.b0;
                try {
                    f.b0(object0);
                    h00 = h04;
                    p40 = p41;
                    g11 = g13;
                }
                catch(Throwable throwable1) {
                    goto label_209;
                }
                try {
                label_185:
                    c10.b0 = g11;
                    c10.c0 = b1;
                    c10.d0 = h00;
                    c10.e0 = atomicInteger3;
                    c10.f0 = null;
                    c10.i0 = 5;
                    object0 = g11.h0.f(p40, G6.X, c10);
                }
                catch(Throwable throwable1) {
                    h04 = h00;
                    goto label_209;
                }
                if(object0 == object1) {
                    return object1;
                }
                h04 = h00;
                g14 = g11;
                b3 = b1;
                y60 = (y6)object0;
                goto label_213;
            }
            case 5: {
                atomicInteger3 = (AtomicInteger)c10.e0;
                h04 = (h0)c10.d0;
                b3 = (b)c10.c0;
                g14 = c10.b0;
                try {
                    f.b0(object0);
                    y60 = (y6)object0;
                    goto label_213;
                }
                catch(Throwable throwable1) {
                }
                do {
                label_209:
                    Object object13 = ((B0)h04).getValue();
                    ((Boolean)object13).getClass();
                }
                while(!((B0)h04).j(object13, Boolean.valueOf(atomicInteger3.decrementAndGet() > 0)));
                throw throwable1;
                do {
                label_213:
                    Object object14 = ((B0)h04).getValue();
                    ((Boolean)object14).getClass();
                }
                while(!((B0)h04).j(object14, Boolean.valueOf(atomicInteger3.decrementAndGet() > 0)));
                ParcelableSingleton parcelableSingleton0 = g14.i0.g0;
                if(parcelableSingleton0 != null) {
                    c10.b0 = g14;
                    c10.c0 = b3;
                    c10.d0 = y60;
                    c10.e0 = null;
                    c10.i0 = 6;
                    if(((Function3)parcelableSingleton0.X).h(g14, y60, c10) == object1) {
                        return object1;
                    }
                    b4 = b3;
                    y61 = y60;
                    g15 = g14;
                    goto label_232;
                }
                goto label_235;
            }
            case 6: {
                y61 = (y6)c10.d0;
                b4 = (b)c10.c0;
                g15 = c10.b0;
                f.b0(object0);
            label_232:
                y60 = y61;
                b3 = b4;
                g14 = g15;
            label_235:
                g14.L0.d(b3.b);
                J4 j40 = ((H4)y60.b).a;
                if(j40 != null) {
                    N4 n40 = j40.a.d;
                    if(n40 != null) {
                        g14.Z.a(n40.b.b);
                    }
                }
                c10.b0 = null;
                c10.c0 = null;
                c10.d0 = null;
                c10.e0 = null;
                c10.i0 = 7;
                object0 = g14.l0.e(c10);
                if(object0 == object1) {
                    return object1;
                }
                ((b0)object0).Y(new PayBillDialogResult(null));
                return t0;
            }
            case 7: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        ((b0)object0).Y(new PayBillDialogResult(null));
        return t0;
    }
}

