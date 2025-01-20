package o9;

import Ab.t;
import Bb.A;
import Bb.F;
import Bb.p;
import Bb.r;
import Eb.a;
import N4.o;
import Nb.j;
import W5.f;
import Xb.H;
import Y8.A4;
import Y8.B4;
import Y8.R6;
import Y8.S6;
import Y8.V;
import Y8.W;
import Y8.p4;
import Y8.p8;
import Y8.q4;
import Y8.x;
import Y8.z4;
import a9.m5;
import a9.v0;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.backend.type.InvoiceOrder.ANY;
import com.sendwave.backend.type.InvoiceOrder.CHRONOLOGICAL;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.ProposedBillField;
import d9.G3;
import d9.M;
import d9.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import yc.l;

public abstract class s1 {
    public static final Object a(R6 r60, PayableWalletFragment payableWalletFragment0, c c0, ActionSource actionSource0, String s, G3 g30, G9.c c1, boolean z, Fb.c c2) {
        q1 q10;
        if(c2 instanceof q1) {
            q10 = (q1)c2;
            int v = q10.c0;
            if((v & 0x80000000) == 0) {
                q10 = new q1(c2);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                q10.c0 = v ^ 0x80000000;
            }
        }
        else {
            q10 = new q1(c2);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = q10.b0;
        Object object1 = a.X;
        A a0 = A.X;
        switch(q10.c0) {
            case 0: {
                f.b0(object0);
                ArrayList arrayList0 = new ArrayList(r.b0(payableWalletFragment0.f));
                for(Object object2: payableWalletFragment0.f) {
                    arrayList0.add(((m5)object2).b.b);
                }
                Set set0 = p.U0(arrayList0);
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: c0.c) {
                    if(set0.contains(((ProposedBillField)object3).X)) {
                        arrayList1.add(object3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r.b0(arrayList1));
                for(Object object4: arrayList1) {
                    Present optional$Present0 = S6.a(((ProposedBillField)object4).Z);
                    arrayList2.add(new M(((ProposedBillField)object4).X, optional$Present0));
                }
                Optional optional0 = Optional.Companion.presentIfNotNull(c0.b);
                Optional optional1 = Optional.Companion.presentIfNotNull(c0.b);
                String s1 = UUID.randomUUID().toString();
                j.e(s1, "toString(...)");
                Optional optional2 = Optional.Companion.presentIfNotNull(s);
                B4 b40 = new B4(payableWalletFragment0.getId(), optional0, optional1, arrayList2, s1, Optional.Companion.presentIfNotNull(actionSource0), optional2, Optional.Companion.presentIfNotNull(g30), z);
                if(g30 == null) {
                    r1 r10 = new r1(r60, b40, c1, null, 0);
                    q10.c0 = 1;
                    object0 = l.z(5, 2000L, r10, q10);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_54;
                }
                r1 r11 = new r1(r60, b40, c1, null, 1);
                q10.c0 = 2;
                object0 = l.z(5, 2000L, r11, q10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
            label_54:
                if(((q4)object0) == null) {
                    throw new V(null);
                }
                A4 a40 = ((q4)object0).b;
                if(a40 != null) {
                    throw F.H(a0, a40.a, a40.b);
                }
                return null;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((List)object0) == null) {
            throw new V(null);
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object5: ((List)object0)) {
            z4 z40 = ((p4)object5).b;
            W w0 = z40 == null ? null : F.H(a0, z40.a, z40.b);
            if(w0 != null) {
                arrayList3.add(w0);
            }
        }
        Object object6 = null;
        for(Object object7: arrayList3) {
            if(((W)object7) instanceof x || ((W)object7) instanceof p8) {
                object6 = object7;
                break;
            }
        }
        if(((W)object6) == null) {
            switch(arrayList3.size()) {
                case 0: {
                    return null;
                }
                case 1: {
                    throw (Throwable)arrayList3.get(0);
                }
                default: {
                    return new Integer(arrayList3.size());
                }
            }
        }
        throw (W)object6;
    }

    public static final Object b(R6 r60, PayableWalletFragment payableWalletFragment0, List list0, v0 v00, CurrencyAmount currencyAmount0, ActionSource actionSource0, String s, G3 g30, G9.c c0, boolean z, Fb.j j0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new ProposedBillField("bill_type", q9.r1.d(0x7F1202FB, new Object[0]), payableWalletFragment0.b, null));  // string:pay_bill_bill_type "Bill type"
        if(v00 != null) {
            arrayList0.add(new ProposedBillField("invoice_reference", o.y(payableWalletFragment0, "invoice_reference").c, v00.c, null));
        }
        if(list0 != null) {
            arrayList0.addAll(list0);
        }
        if((v00 == null ? null : v00.d) != null) {
            arrayList0.add(new ProposedBillField("customer_name", o.y(payableWalletFragment0, "customer_name").c, v00.d, null));
        }
        return H.c(new p1(r60, payableWalletFragment0, new c(payableWalletFragment0.getId(), currencyAmount0, arrayList0), actionSource0, s, g30, c0, z, null), j0);
    }

    public static Object c(R6 r60, PayableWalletFragment payableWalletFragment0, v0 v00, List list0, ActionSource actionSource0, G9.c c0, boolean z, Fb.j j0, int v) {
        v0 v01;
        boolean z1;
        if((v & 0x40) == 0) {
            v01 = v00;
            z1 = z;
        }
        else {
            z1 = false;
            v01 = v00;
        }
        Object object0 = s1.b(r60, payableWalletFragment0, list0, v00, v01.a, actionSource0, null, null, c0, z1, j0);
        return object0 != a.X ? t.a : object0;
    }

    public static Object d(R6 r60, PayableWalletFragment payableWalletFragment0, List list0, Set set0, List list1, ActionSource actionSource0, G9.c c0, lb.H h0) {
        CHRONOLOGICAL invoiceOrder$CHRONOLOGICAL0;
        Iterable iterable0 = p.K0(set0, new E2.a(7));
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        for(Object object0: iterable0) {
            arrayList0.add(new P(((v0)object0).a, ((v0)object0).c));
        }
        ArrayList arrayList1 = new ArrayList(r.b0(set0));
        for(Object object1: set0) {
            arrayList1.add(((v0)object1).a);
        }
        Iterator iterator2 = arrayList1.iterator();
        if(!iterator2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Object object2;
        for(object2 = iterator2.next(); iterator2.hasNext(); object2 = ((CurrencyAmount)object2).j(((CurrencyAmount)object3))) {
            Object object3 = iterator2.next();
        }
        Iterator iterator3 = set0.iterator();
        if(!iterator3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object4 = iterator3.next();
        if(iterator3.hasNext()) {
            Date date0 = ((v0)object4).b;
            while(true) {
                Object object5 = iterator3.next();
                Date date1 = ((v0)object5).b;
                if(date0.compareTo(date1) < 0) {
                    object4 = object5;
                    date0 = date1;
                }
                if(!iterator3.hasNext()) {
                    break;
                }
            }
        }
        Iterable iterable1 = p.M0(list0, list0.indexOf(((v0)object4)) + 1);
        if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
            for(Object object6: iterable1) {
                if(set0.contains(((v0)object6))) {
                    continue;
                }
                invoiceOrder$CHRONOLOGICAL0 = ANY.X;
                goto label_40;
            }
        }
        invoiceOrder$CHRONOLOGICAL0 = CHRONOLOGICAL.X;
    label_40:
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object7: list0) {
                if(!set0.contains(((v0)object7))) {
                    return s1.b(r60, payableWalletFragment0, list1, null, ((CurrencyAmount)object2), actionSource0, null, new G3(invoiceOrder$CHRONOLOGICAL0, arrayList0, S6.a(Boolean.valueOf(false))), c0, false, h0);
                }
                if(false) {
                    break;
                }
            }
        }
        return s1.b(r60, payableWalletFragment0, list1, null, ((CurrencyAmount)object2), actionSource0, null, new G3(invoiceOrder$CHRONOLOGICAL0, arrayList0, S6.a(Boolean.valueOf(true))), c0, false, h0);
    }
}

