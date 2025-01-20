package o9;

import Ab.k;
import Ab.t;
import Bb.p;
import Bb.r;
import Bb.z;
import Eb.a;
import Fb.j;
import Nb.w;
import R9.k3;
import Tb.e;
import W5.f;
import Y8.G6;
import Y8.H4;
import Y8.J4;
import Y8.N4;
import Y8.N;
import Y8.P4;
import Y8.R9;
import Y8.S6;
import Y8.b0;
import Y8.d0;
import Y8.f0;
import Y8.q4;
import Y8.y6;
import ac.B0;
import ac.h0;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.shared.ProposedBillField;
import com.sendwave.util.ParcelableSingleton;
import d9.M;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import m5.b;
import ma.D;
import q9.r1;
import yc.l;

public final class j0 extends j implements Function2 {
    public Object c0;
    public Object d0;
    public Object e0;
    public Serializable f0;
    public Object g0;
    public Object h0;
    public Object i0;
    public AtomicInteger j0;
    public int k0;
    public Object l0;
    public final l0 m0;

    public j0(l0 l00, g g0) {
        this.m0 = l00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j0(this.m0, g0);
        g1.l0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object33;
        CurrencyAmount currencyAmount4;
        y6 y61;
        y6 y60;
        Object object30;
        h0 h07;
        Object object27;
        q4 q40;
        l0 l04;
        w w12;
        String s14;
        h0 h05;
        Object object26;
        h0 h04;
        l0 l02;
        AtomicInteger atomicInteger6;
        P4 p40;
        CurrencyAmount currencyAmount1;
        List list13;
        R9 r95;
        String s10;
        l0 l01;
        AtomicInteger atomicInteger5;
        w w10;
        AtomicInteger atomicInteger4;
        h0 h03;
        w w8;
        R9 r94;
        List list10;
        w w7;
        String s8;
        w w4;
        c c1;
        List list8;
        R9 r93;
        Object object18;
        w w3;
        List list6;
        List list5;
        f0 f00;
        R9 r91;
        w w2;
        List list4;
        String s3;
        AtomicInteger atomicInteger2;
        h0 h02;
        Object object8;
        List list3;
        h0 h01;
        AtomicInteger atomicInteger1;
        Object object7;
        List list1;
        w w0;
        R9 r90;
        Object object1 = a.X;
        Object object2 = t.a;
        l0 l00 = this.m0;
        switch(this.k0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.l0;
                List list0 = l00.w();
                if(list0 == null) {
                    return object2;
                }
                ArrayList arrayList0 = new ArrayList(r.b0(list0));
                for(Object object3: list0) {
                    Boolean boolean0 = Boolean.TRUE;
                    ((n)object3).d0.getClass();
                    ((n)object3).d0.l(null, boolean0);
                    arrayList0.add(object2);
                }
                if(!Nb.j.a(((Boolean)l00.M0.a(l0.R0[0], l00)), Boolean.TRUE)) {
                    return object2;
                }
                w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                list1 = new ArrayList();
                List list2 = l00.w();
                if(list2 == null) {
                    return object2;
                }
                for(Object object4: list2) {
                    n n0 = (n)object4;
                    h0 h00 = (h0)l00.u0.get(n0.Z.b);
                    if(h00 != null) {
                        String s = (String)((B0)h00).getValue();
                        if(s == null) {
                            return object2;
                        }
                        String s1 = n0.c();
                        if(n0 instanceof Y) {
                            CurrencyAmount currencyAmount0 = ((Y)n0).a();
                            w0.X = currencyAmount0;
                            Nb.j.c(currencyAmount0);
                            s = currencyAmount0.k();
                            s1 = s;
                        }
                        ((ArrayList)list1).add(new ProposedBillField(n0.Z.b, n0.Z.c, s, s1));
                        continue;
                    }
                    return object2;
                }
                String s2 = l00.r();
                if(s2 == null) {
                    return object2;
                }
                e[] arr_e = l0.R0;
                Boolean boolean1 = (Boolean)l00.N0.a(arr_e[1], l00);
                if(boolean1 == null) {
                    return object2;
                }
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                w w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w1.X = z.X;
                if(boolean1.booleanValue()) {
                    UUID uUID0 = UUID.randomUUID();
                    Nb.j.e(uUID0, "randomUUID(...)");
                    B0 b00 = l00.p0;
                    Map map0 = N.a;
                    Object object5 = map0.get(b00);
                    if(object5 == null) {
                        object5 = b.E(0, map0, b00);
                    }
                    AtomicInteger atomicInteger0 = (AtomicInteger)object5;
                    while(true) {
                        Object object6 = b00.getValue();
                        ((Boolean)object6).getClass();
                        if(b00.j(object6, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0))) {
                            break;
                        }
                        atomicInteger0 = atomicInteger0;
                        object2 = object2;
                        arrayList1 = arrayList1;
                        b00 = b00;
                    }
                    try {
                        object7 = object2;
                        atomicInteger1 = atomicInteger0;
                        h01 = b00;
                        D d0 = new D(l00, s2, uUID0, ((ArrayList)list1), null);
                        this.l0 = r90;
                        this.c0 = w0;
                        this.d0 = list1;
                        this.e0 = s2;
                        this.f0 = arrayList1;
                        list3 = arrayList2;
                        this.g0 = list3;
                        this.h0 = w1;
                        h01 = b00;
                        this.i0 = h01;
                        atomicInteger1 = atomicInteger0;
                        this.j0 = atomicInteger1;
                        this.k0 = 1;
                        object8 = l.z(15, 1000L, d0, this);
                    }
                    catch(Throwable throwable0) {
                        h02 = h01;
                        atomicInteger2 = atomicInteger1;
                        goto label_134;
                    }
                    if(object8 == object1) {
                        return object1;
                    }
                    try {
                        s3 = s2;
                        list4 = arrayList1;
                        w2 = w1;
                        r91 = r90;
                        atomicInteger2 = atomicInteger1;
                        f00 = (f0)object8;
                        goto label_138;
                    }
                    catch(Throwable throwable0) {
                        goto label_133;
                    }
                }
                else {
                    object7 = object2;
                    String s4 = (String)l00.Q0.a(arr_e[3], l00);
                    if(s4 != null) {
                        arrayList1.add(new ProposedBillField("__business_name__", r1.d(0x7F120070, new Object[0]), s4, null));  // string:business_name "Business"
                    }
                    s3 = s2;
                    list5 = arrayList1;
                    list6 = arrayList2;
                    w3 = w1;
                    goto label_183;
                }
                goto label_231;
            }
            case 1: {
                atomicInteger2 = this.j0;
                h02 = (h0)this.i0;
                w2 = (w)this.h0;
                list3 = (List)this.g0;
                List list7 = (List)this.f0;
                s3 = (String)this.e0;
                list1 = (List)this.d0;
                w0 = (w)this.c0;
                R9 r92 = (R9)this.l0;
                try {
                    f.b0(object0);
                    object7 = object2;
                    r91 = r92;
                    list4 = list7;
                    h01 = h02;
                }
                catch(Throwable throwable0) {
                    goto label_134;
                }
                try {
                    f00 = (f0)object0;
                    goto label_138;
                }
                catch(Throwable throwable0) {
                label_133:
                    h02 = h01;
                }
                do {
                label_134:
                    Object object9 = ((B0)h02).getValue();
                    ((Boolean)object9).getClass();
                }
                while(!((B0)h02).j(object9, Boolean.valueOf(atomicInteger2.decrementAndGet() > 0)));
                throw throwable0;
                do {
                label_138:
                    Object object10 = ((B0)h01).getValue();
                    ((Boolean)object10).getClass();
                }
                while(!((B0)h01).j(object10, Boolean.valueOf(atomicInteger2.decrementAndGet() > 0)));
                if(f00 != null) {
                    for(Object object11: f00.a) {
                        String s5 = ((d0)object11).a;
                        String s6 = ((d0)object11).b;
                        ProposedBillField proposedBillField0 = new ProposedBillField(s5, s5, s6, s6);
                        if(((d0)object11).c) {
                            list3.add(proposedBillField0);
                        }
                        else {
                            list4.add(proposedBillField0);
                        }
                    }
                    Iterable iterable0 = f00.b;
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object12: iterable0) {
                        if(!((b0)object12).a.equals("__amount__")) {
                            arrayList3.add(object12);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(r.b0(arrayList3));
                    Iterator iterator4 = arrayList3.iterator();
                    while(iterator4.hasNext()) {
                        Object object13 = iterator4.next();
                        String s7 = ((b0)object13).a;
                        arrayList4.add(new ProposedBillField(s7, s7, ((b0)object13).b, null));
                        iterator4 = iterator4;
                        list3 = list3;
                    }
                    Object object14 = null;
                    list6 = list3;
                    w2.X = arrayList4;
                    for(Object object15: iterable0) {
                        if(((b0)object15).a.equals("__amount__")) {
                            object14 = object15;
                            break;
                        }
                    }
                    if(((b0)object14) != null) {
                        w0.X = CurrencyAmount.c(((b0)object14).b);
                    }
                    w3 = w2;
                    list5 = list4;
                    r90 = r91;
                    try {
                    label_183:
                        ArrayList arrayList5 = new ArrayList();
                        for(Object object16: list1) {
                            if(!Nb.j.a(((ProposedBillField)object16).X, "__amount__")) {
                                arrayList5.add(object16);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(r.b0(arrayList5));
                        for(Object object17: arrayList5) {
                            ProposedBillField proposedBillField1 = (ProposedBillField)object17;
                            arrayList6.add((Nb.j.a(proposedBillField1.X, "options") ? new ProposedBillField(proposedBillField1.X, proposedBillField1.Y, proposedBillField1.Z, (Vb.j.c0(proposedBillField1.b()) ? r1.d(0x7F1202C8, new Object[0]) : proposedBillField1.b())) : new ProposedBillField(proposedBillField1.X, proposedBillField1.Y, proposedBillField1.Z, proposedBillField1.b())));  // string:no_options_selected "No options selected"
                        }
                        c c0 = new c(s3, ((CurrencyAmount)w0.X), p.F0(p.F0(list5, arrayList6), list6));
                        this.l0 = r90;
                        this.c0 = w0;
                        this.d0 = list1;
                        this.e0 = s3;
                        this.f0 = w3;
                        this.g0 = c0;
                        this.h0 = null;
                        this.i0 = null;
                        this.j0 = null;
                        this.k0 = 2;
                        object18 = l00.l0.e(this);
                        if(object18 == object1) {
                            return object1;
                        }
                        r93 = r90;
                        list8 = list1;
                        c1 = c0;
                        w4 = w3;
                        s8 = s3;
                        goto label_231;
                    }
                    catch(N1 unused_ex) {
                        return object7;
                    }
                }
                throw new k3(r1.d(0x7F120456, new Object[0]));  // string:unknown_error_message "Sorry, an unknown error occurred. Please try again."
            }
            case 2: {
                c1 = (c)this.g0;
                w w5 = (w)this.f0;
                String s9 = (String)this.e0;
                List list9 = (List)this.d0;
                w w6 = (w)this.c0;
                r93 = (R9)this.l0;
                try {
                    f.b0(object0);
                    w0 = w6;
                    object7 = object2;
                    list8 = list9;
                    w4 = w5;
                    s8 = s9;
                    object18 = object0;
                }
                catch(N1 unused_ex) {
                    return object2;
                }
                try {
                label_231:
                    this.l0 = r93;
                    this.c0 = w0;
                    this.d0 = list8;
                    this.e0 = s8;
                    this.f0 = w4;
                    this.g0 = null;
                    this.k0 = 3;
                    if(((o9.b0)object18).e0(c1, this) == object1) {
                        return object1;
                    }
                }
                catch(N1 unused_ex) {
                    return object7;
                }
                w7 = w4;
                list10 = list8;
                r94 = r93;
                w8 = w0;
                goto label_257;
            }
            case 3: {
                w w9 = (w)this.f0;
                s8 = (String)this.e0;
                List list11 = (List)this.d0;
                w8 = (w)this.c0;
                r94 = (R9)this.l0;
                try {
                    f.b0(object0);
                    object7 = object2;
                    w7 = w9;
                    list10 = list11;
                }
                catch(N1 unused_ex) {
                    return object2;
                }
            label_257:
                l00.getClass();
                Boolean boolean2 = (Boolean)l00.P0.a(l0.R0[2], l00);
                LinkedHashMap linkedHashMap0 = l00.u0;
                p9.D d1 = l00.O0;
                h03 = l00.p0;
                if((boolean2 == null ? true : boolean2.booleanValue())) {
                    Map map1 = N.a;
                    Object object19 = map1.get(h03);
                    if(object19 == null) {
                        object19 = b.E(0, map1, ((B0)h03));
                    }
                    AtomicInteger atomicInteger3 = (AtomicInteger)object19;
                    do {
                        Object object20 = ((B0)h03).getValue();
                        ((Boolean)object20).getClass();
                    }
                    while(!((B0)h03).j(object20, Boolean.valueOf(atomicInteger3.incrementAndGet() > 0)));
                    try {
                        List list12 = l00.w();
                        this.l0 = r94;
                        this.c0 = w8;
                        this.d0 = list10;
                        this.e0 = s8;
                        this.f0 = w7;
                        this.g0 = h03;
                        this.h0 = l00;
                        this.i0 = atomicInteger3;
                        this.k0 = 4;
                        if(d1.d(list12, linkedHashMap0, this) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable1) {
                        atomicInteger4 = atomicInteger3;
                        h04 = h03;
                        goto label_418;
                    }
                    w10 = w8;
                    atomicInteger5 = atomicInteger3;
                    l01 = l00;
                    s10 = s8;
                    r95 = r94;
                    list13 = list10;
                    goto label_347;
                }
                String s11 = ((String)Vb.j.p0(s8, new String[]{":"}, 0, 6).get(0)).substring(3);
                Nb.j.e(s11, "substring(...)");
                Object object21 = w8.X;
                N.l(object21, r94.a);
                currencyAmount1 = (CurrencyAmount)object21;
                String s12 = UUID.randomUUID().toString();
                Nb.j.e(s12, "toString(...)");
                Optional optional0 = Optional.Companion.presentIfNotNull(l00.i0.e0);
                Optional optional1 = Optional.Companion.presentIfNotNull(l00.i0.f0);
                ArrayList arrayList7 = p.F0(((Collection)w7.X), list10);
                ArrayList arrayList8 = new ArrayList(r.b0(arrayList7));
                for(Object object22: arrayList7) {
                    Present optional$Present0 = S6.a(((ProposedBillField)object22).Z);
                    arrayList8.add(new M(((ProposedBillField)object22).X, optional$Present0));
                }
                p40 = new P4(s11, currencyAmount1, s12, optional0, optional1, S6.a(arrayList8));
                Map map2 = N.a;
                Object object23 = map2.get(h03);
                if(object23 == null) {
                    object23 = b.E(0, map2, ((B0)h03));
                }
                atomicInteger6 = (AtomicInteger)object23;
                do {
                    Object object24 = ((B0)h03).getValue();
                    ((Boolean)object24).getClass();
                }
                while(!((B0)h03).j(object24, Boolean.valueOf(atomicInteger6.incrementAndGet() > 0)));
                try {
                    List list14 = l00.w();
                    this.l0 = currencyAmount1;
                    this.c0 = p40;
                    this.d0 = h03;
                    this.e0 = l00;
                    this.f0 = atomicInteger6;
                    this.k0 = 7;
                    if(d1.d(list14, linkedHashMap0, this) == object1) {
                        return object1;
                    }
                    l02 = l00;
                    goto label_438;
                }
                catch(Throwable throwable2) {
                    goto label_461;
                }
            }
            case 4: {
                atomicInteger4 = (AtomicInteger)this.i0;
                l0 l03 = (l0)this.h0;
                h04 = (h0)this.g0;
                w7 = (w)this.f0;
                String s13 = (String)this.e0;
                list13 = (List)this.d0;
                w w11 = (w)this.c0;
                R9 r96 = (R9)this.l0;
                try {
                    f.b0(object0);
                    h03 = h04;
                    w10 = w11;
                    object7 = object2;
                    l01 = l03;
                    r95 = r96;
                    atomicInteger5 = atomicInteger4;
                    s10 = s13;
                }
                catch(Throwable throwable1) {
                    goto label_418;
                }
                try {
                label_347:
                    CurrencyAmount currencyAmount2 = (CurrencyAmount)w10.X;
                    ArrayList arrayList9 = p.F0(((Collection)w7.X), list13);
                    ArrayList arrayList10 = new ArrayList(r.b0(arrayList9));
                    for(Object object25: arrayList9) {
                        arrayList10.add(new k(((ProposedBillField)object25).X, ((ProposedBillField)object25).Z));
                    }
                    this.l0 = w10;
                    this.c0 = s10;
                    this.d0 = h03;
                    this.e0 = l01;
                    this.f0 = atomicInteger5;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.k0 = 5;
                    object26 = l01.p(r95, currencyAmount2, arrayList10, null, l01.i0.f0, this);
                }
                catch(Throwable throwable1) {
                    atomicInteger4 = atomicInteger5;
                    h04 = h03;
                    goto label_418;
                }
                if(object26 == object1) {
                    return object1;
                }
                h05 = h03;
                s14 = s10;
                w12 = w10;
                l04 = l01;
                goto label_386;
            }
            case 5: {
                atomicInteger4 = (AtomicInteger)this.f0;
                l04 = (l0)this.e0;
                h05 = (h0)this.d0;
                s14 = (String)this.c0;
                w12 = (w)this.l0;
                try {
                    f.b0(object0);
                    object7 = object2;
                    atomicInteger5 = atomicInteger4;
                    object26 = object0;
                }
                catch(Throwable throwable1) {
                    goto label_417;
                }
                try {
                label_386:
                    q40 = (q4)object26;
                    l04.L0.e(((CurrencyAmount)w12.X), s14);
                    this.l0 = h05;
                    this.c0 = atomicInteger5;
                    this.d0 = q40;
                    this.e0 = null;
                    this.f0 = null;
                    this.k0 = 6;
                    object27 = l04.l0.e(this);
                }
                catch(Throwable throwable1) {
                    h04 = h05;
                    atomicInteger4 = atomicInteger5;
                    goto label_418;
                }
                if(object27 == object1) {
                    return object1;
                }
                try {
                    atomicInteger4 = atomicInteger5;
                    ((o9.b0)object27).Y(new PayBillDialogResult((q40 == null ? null : q40.d)));
                    goto label_422;
                }
                catch(Throwable throwable1) {
                    goto label_417;
                }
            }
            case 6: {
                q4 q41 = (q4)this.d0;
                atomicInteger4 = (AtomicInteger)this.c0;
                h04 = (h0)this.l0;
                try {
                    f.b0(object0);
                    h05 = h04;
                    object7 = object2;
                }
                catch(Throwable throwable1) {
                    goto label_418;
                }
                try {
                    ((o9.b0)object0).Y(new PayBillDialogResult((q41 == null ? null : q41.d)));
                    goto label_422;
                }
                catch(Throwable throwable1) {
                label_417:
                    h04 = h05;
                }
                do {
                label_418:
                    Object object28 = ((B0)h04).getValue();
                    ((Boolean)object28).getClass();
                }
                while(!((B0)h04).j(object28, Boolean.valueOf(atomicInteger4.decrementAndGet() > 0)));
                throw throwable1;
                do {
                label_422:
                    Object object29 = ((B0)h05).getValue();
                    ((Boolean)object29).getClass();
                }
                while(!((B0)h05).j(object29, Boolean.valueOf(atomicInteger4.decrementAndGet() > 0)));
                return object7;
            }
            case 7: {
                atomicInteger6 = (AtomicInteger)this.f0;
                l02 = (l0)this.e0;
                h0 h06 = (h0)this.d0;
                p40 = (P4)this.c0;
                currencyAmount1 = (CurrencyAmount)this.l0;
                try {
                    f.b0(object0);
                    h03 = h06;
                    object7 = object2;
                }
                catch(Throwable throwable2) {
                    h07 = h06;
                    goto label_462;
                }
                try {
                label_438:
                    this.l0 = currencyAmount1;
                    this.c0 = h03;
                    this.d0 = atomicInteger6;
                    this.e0 = null;
                    this.f0 = null;
                    this.k0 = 8;
                    object30 = l02.h0.f(p40, G6.X, this);
                    if(object30 == object1) {
                        return object1;
                    }
                    y60 = (y6)object30;
                    goto label_466;
                }
                catch(Throwable throwable2) {
                    goto label_461;
                }
            }
            case 8: {
                atomicInteger6 = (AtomicInteger)this.d0;
                h07 = (h0)this.c0;
                CurrencyAmount currencyAmount3 = (CurrencyAmount)this.l0;
                try {
                    f.b0(object0);
                    h03 = h07;
                    currencyAmount1 = currencyAmount3;
                    object7 = object2;
                    object30 = object0;
                }
                catch(Throwable throwable2) {
                    goto label_462;
                }
                try {
                    y60 = (y6)object30;
                    goto label_466;
                }
                catch(Throwable throwable2) {
                label_461:
                    h07 = h03;
                }
                do {
                label_462:
                    Object object31 = ((B0)h07).getValue();
                    ((Boolean)object31).getClass();
                }
                while(!((B0)h07).j(object31, Boolean.valueOf(atomicInteger6.decrementAndGet() > 0)));
                throw throwable2;
                do {
                label_466:
                    Object object32 = ((B0)h03).getValue();
                    ((Boolean)object32).getClass();
                }
                while(!((B0)h03).j(object32, Boolean.valueOf(atomicInteger6.decrementAndGet() > 0)));
                ParcelableSingleton parcelableSingleton0 = l00.i0.g0;
                if(parcelableSingleton0 != null) {
                    this.l0 = currencyAmount1;
                    this.c0 = y60;
                    this.d0 = null;
                    this.k0 = 9;
                    if(((Function3)parcelableSingleton0.X).h(l00, y60, this) == object1) {
                        return object1;
                    }
                    y61 = y60;
                    currencyAmount4 = currencyAmount1;
                    goto label_484;
                }
                goto label_486;
            }
            case 9: {
                y61 = (y6)this.c0;
                currencyAmount4 = (CurrencyAmount)this.l0;
                f.b0(object0);
                object7 = object2;
            label_484:
                currencyAmount1 = currencyAmount4;
                y60 = y61;
            label_486:
                l00.L0.d(currencyAmount1);
                J4 j40 = ((H4)y60.b).a;
                if(j40 != null) {
                    N4 n40 = j40.a.d;
                    if(n40 != null) {
                        l00.Z.a(n40.b.b);
                    }
                }
                this.l0 = null;
                this.c0 = null;
                this.d0 = null;
                this.k0 = 10;
                object33 = l00.l0.e(this);
                if(object33 == object1) {
                    return object1;
                }
                ((o9.b0)object33).Y(new PayBillDialogResult(null));
                return object7;
            }
            case 10: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        object33 = object0;
        ((o9.b0)object33).Y(new PayBillDialogResult(null));
        return object2;
    }
}

