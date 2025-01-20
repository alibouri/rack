package o9;

import Ab.k;
import Ab.t;
import Bb.q;
import Eb.a;
import Fb.j;
import Q3.h;
import R9.k3;
import W5.f;
import Y8.N;
import Y8.R9;
import Y8.m2;
import Y8.y6;
import a9.v0;
import ac.B0;
import ac.h0;
import com.apollographql.apollo.api.Optional;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.BillInvoiceListFragment;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.shared.PayBillInvoiceDialogActivity;
import com.sendwave.shared.ProposedBillField;
import com.wave.paybillinvoice.detail.PayBillInvoiceDetailActivity;
import com.wave.paybillinvoice.detail.PayBillInvoiceDetailParams;
import com.wave.paybillinvoice.list.PayBillInvoiceListActivity;
import com.wave.paybillinvoice.list.PayBillInvoiceListParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;
import q9.r1;

public final class v1 extends j implements Function2 {
    public Object c0;
    public Serializable d0;
    public UUID e0;
    public boolean f0;
    public int g0;
    public Object h0;
    public final w1 i0;

    public v1(w1 w10, g g0) {
        this.i0 = w10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new v1(this.i0, g0);
        g1.h0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        k k0;
        AtomicInteger atomicInteger1;
        h0 h01;
        Object object4;
        List list1;
        Object object3;
        h0 h00;
        AtomicInteger atomicInteger0;
        boolean z;
        String s1;
        List list3;
        UUID uUID1;
        Object object5;
        R9 r90;
        Object object1 = a.X;
        Object object2 = t.a;
        w1 w10 = this.i0;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.h0;
                w10.getClass();
                if(!Nb.j.a(((Boolean)w10.L0.a(w1.M0[0], w10)), Boolean.TRUE)) {
                    return object2;
                }
                s1 = w10.r();
                if(s1 == null) {
                    return object2;
                }
                ArrayList arrayList0 = new ArrayList();
                List list4 = w10.w();
                if(list4 == null) {
                    return object2;
                }
                for(Object object6: list4) {
                    n n0 = (n)object6;
                    h0 h02 = (h0)w10.u0.get(n0.Z.b);
                    if(h02 != null) {
                        String s2 = (String)((B0)h02).getValue();
                        if(s2 == null) {
                            return object2;
                        }
                        String s3 = n0.c();
                        if(n0 instanceof l) {
                            continue;
                        }
                        arrayList0.add(new ProposedBillField(n0.Z.b, n0.Z.c, s2, s3));
                        continue;
                    }
                    return object2;
                }
                UUID uUID2 = UUID.randomUUID();
                Nb.j.e(uUID2, "randomUUID(...)");
                this.h0 = r90;
                this.c0 = s1;
                this.d0 = arrayList0;
                this.e0 = uUID2;
                this.g0 = 1;
                object5 = w10.l0.e(this);
                if(object5 == object1) {
                    return object1;
                }
                list3 = arrayList0;
                uUID1 = uUID2;
                break;
            }
            case 1: {
                UUID uUID0 = this.e0;
                List list2 = (List)this.d0;
                String s = (String)this.c0;
                r90 = (R9)this.h0;
                f.b0(object0);
                object5 = object0;
                uUID1 = uUID0;
                list3 = list2;
                s1 = s;
                break;
            }
            case 2: {
                z = this.f0;
                atomicInteger0 = (AtomicInteger)this.d0;
                h00 = (h0)this.c0;
                List list0 = (List)this.h0;
                try {
                    f.b0(object0);
                    object3 = object2;
                    list1 = list0;
                    object4 = object0;
                    h01 = h00;
                    atomicInteger1 = atomicInteger0;
                    k0 = (k)object4;
                    goto label_118;
                }
                catch(Throwable throwable0) {
                    goto label_114;
                }
            }
            case 3: 
            case 4: 
            case 5: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((b0)object5).T();
        m2 m20 = w10.q();
        N.l(m20, r90.a);
        PayableWalletFragment payableWalletFragment0 = (PayableWalletFragment)m20.a;
        Nb.j.f(payableWalletFragment0, "billType");
        boolean z1 = payableWalletFragment0.p || payableWalletFragment0.o;
        List list5 = z1 ? q.K("PARTIAL_PAYMENTS") : null;
        Optional optional0 = Optional.Companion.presentIfNotNull(list5);
        B0 b00 = w10.p0;
        Map map0 = N.a;
        Object object7 = map0.get(b00);
        if(object7 == null) {
            object7 = b.E(0, map0, b00);
        }
        AtomicInteger atomicInteger2;
        for(atomicInteger2 = (AtomicInteger)object7; true; atomicInteger2 = atomicInteger2) {
            Object object8 = b00.getValue();
            ((Boolean)object8).getClass();
            if(b00.j(object8, Boolean.valueOf(atomicInteger2.incrementAndGet() > 0))) {
                break;
            }
            object2 = object2;
            b00 = b00;
        }
        try {
            object3 = object2;
            atomicInteger1 = atomicInteger2;
            new h(w10, s1, uUID1, list3, optional0, null, 2);
            this.h0 = list3;
            this.c0 = b00;
            atomicInteger1 = atomicInteger2;
            this.d0 = atomicInteger1;
            this.e0 = null;
            this.f0 = z1;
            this.g0 = 2;
            object4 = yc.l.z(15, 1000L, null, this);
        }
        catch(Throwable throwable0) {
            atomicInteger0 = atomicInteger1;
            h00 = b00;
            goto label_114;
        }
        if(object4 == object1) {
            return object1;
        }
        h01 = b00;
        list1 = list3;
        z = z1;
        try {
            k0 = (k)object4;
            goto label_118;
        }
        catch(Throwable throwable0) {
            atomicInteger0 = atomicInteger1;
            h00 = h01;
        }
        do {
        label_114:
            Object object9 = ((B0)h00).getValue();
            ((Boolean)object9).getClass();
        }
        while(!((B0)h00).j(object9, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_118:
            Object object10 = ((B0)h01).getValue();
            ((Boolean)object10).getClass();
        }
        while(!((B0)h01).j(object10, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        if(k0 == null) {
            throw new k3(r1.d(0x7F120456, new Object[0]));  // string:unknown_error_message "Sorry, an unknown error occurred. Please try again."
        }
        BillInvoiceListFragment billInvoiceListFragment0 = (BillInvoiceListFragment)k0.Y;
        FragmentHandle fragmentHandle0 = ((y6)k0.X).a(billInvoiceListFragment0);
        if(z) {
            List list6 = billInvoiceListFragment0.b;
            if(list6.size() == 1) {
                PayBillInvoiceDetailParams payBillInvoiceDetailParams0 = new PayBillInvoiceDetailParams(((v0)list6.get(0)).c, w10.i0.X, w10.i0.Y, fragmentHandle0, list1, w10.i0.f0);
                this.h0 = null;
                this.c0 = null;
                this.d0 = null;
                this.g0 = 3;
                return w1.y(w10, PayBillInvoiceDetailActivity.class, payBillInvoiceDetailParams0, this) == object1 ? object1 : object3;
            }
            PayBillInvoiceListParams payBillInvoiceListParams0 = new PayBillInvoiceListParams(w10.i0.X, w10.i0.Y, fragmentHandle0, list1, w10.i0.f0);
            this.h0 = null;
            this.c0 = null;
            this.d0 = null;
            this.g0 = 4;
            return w1.y(w10, PayBillInvoiceListActivity.class, payBillInvoiceListParams0, this) == object1 ? object1 : object3;
        }
        PayBillDialogParams payBillDialogParams0 = new PayBillDialogParams(w10.i0.X, w10.i0.Y, w10.i0.Z, fragmentHandle0, list1, null, null, w10.i0.f0, null, null, 0x360);
        this.h0 = null;
        this.c0 = null;
        this.d0 = null;
        this.g0 = 5;
        return w1.y(w10, PayBillInvoiceDialogActivity.class, payBillDialogParams0, this) == object1 ? object1 : object3;
    }
}

