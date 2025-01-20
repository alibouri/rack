package R9;

import Ab.t;
import Bb.p;
import Bb.r;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.N;
import Y8.R9;
import Y8.p8;
import ac.B0;
import ac.h0;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.shared.ProposedBillField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o9.N1;
import o9.b0;
import o9.c;
import o9.n;
import q9.l1;
import q9.r1;

public final class l extends j implements Function2 {
    public Object c0;
    public q d0;
    public AtomicInteger e0;
    public CurrencyAmount f0;
    public R9 g0;
    public q h0;
    public ArrayList i0;
    public int j0;
    public Object k0;
    public final q l0;

    public l(q q0, g g0) {
        this.l0 = q0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new l(this.l0, g0);
        g1.k0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        ArrayList arrayList3;
        CurrencyAmount currencyAmount3;
        AtomicInteger atomicInteger3;
        Object object3;
        c c0;
        h0 h00;
        q q1;
        AtomicInteger atomicInteger0;
        CurrencyAmount currencyAmount1;
        q q5;
        ArrayList arrayList1;
        R9 r91;
        c c2;
        Object object4;
        q q4;
        AtomicInteger atomicInteger2;
        h0 h01;
        c c3;
        Object object5;
        R9 r93;
        Object object1 = a.X;
        Object object2 = t.a;
        q q0 = this.l0;
        switch(this.j0) {
            case 0: {
                f.b0(object0);
                R9 r94 = (R9)this.k0;
                q0.getClass();
                List list0 = (List)q0.r0.a(q.u0[0], q0);
                if(list0 == null) {
                    return object2;
                }
                List list1 = p.l0(list0, 1);
                for(Object object6: list1) {
                    Boolean boolean0 = Boolean.TRUE;
                    ((n)object6).d0.getClass();
                    ((n)object6).d0.l(null, boolean0);
                }
                if(!Nb.j.a(((Boolean)q0.t0.a(q.u0[1], q0)), Boolean.TRUE)) {
                    return object2;
                }
                String s = ((n)list0.get(0)).Z.b;
                String s1 = ((n)list0.get(0)).Z.c;
                String s2 = l1.d(q0.h0.X.X, null);
                ArrayList arrayList2 = Bb.q.N(new ProposedBillField[]{new ProposedBillField(s, s1, q0.h0.X.X, s2)});
                CurrencyAmount currencyAmount2 = null;
                for(Object object7: list1) {
                    n n0 = (n)object7;
                    h0 h02 = (h0)q0.p0.get(n0.Z.b);
                    if(h02 != null) {
                        String s3 = (String)((B0)h02).getValue();
                        if(s3 == null) {
                            return object2;
                        }
                        String s4 = n0.c();
                        if(n0 instanceof o9.l) {
                            currencyAmount2 = ((o9.l)n0).a();
                            continue;
                        }
                        arrayList2.add(new ProposedBillField(n0.Z.b, n0.Z.c, s3, s4));
                        continue;
                    }
                    return object2;
                }
                String s5 = q0.r();
                if(s5 == null) {
                    return object2;
                }
                if(currencyAmount2 == null) {
                    return object2;
                }
                c c4 = new c(s5, currencyAmount2, arrayList2, r1.d(0x7F12003E, new Object[0]), r1.d(0x7F120076, new Object[0]));  // string:amount "Amount"
                try {
                    this.k0 = r94;
                    this.c0 = c4;
                    this.j0 = 1;
                    object5 = q0.k0.e(this);
                    if(object5 == object1) {
                        return object1;
                    }
                    r93 = r94;
                    c3 = c4;
                label_95:
                    this.k0 = r93;
                    this.c0 = c3;
                    this.j0 = 2;
                    if(((b0)object5).e0(c3, this) == object1) {
                        return object1;
                    }
                    goto label_101;
                }
                catch(N1 unused_ex) {
                    break;
                }
            }
            case 1: {
                c3 = (c)this.c0;
                R9 r92 = (R9)this.k0;
                try {
                    f.b0(object0);
                    r93 = r92;
                    object5 = object0;
                    goto label_95;
                }
                catch(N1 unused_ex) {
                    break;
                }
            }
            case 2: {
                c3 = (c)this.c0;
                r91 = (R9)this.k0;
                try {
                    f.b0(object0);
                    goto label_102;
                }
                catch(N1 unused_ex) {
                    break;
                }
            }
            case 3: {
                ArrayList arrayList0 = this.i0;
                q q2 = this.h0;
                R9 r90 = this.g0;
                CurrencyAmount currencyAmount0 = this.f0;
                AtomicInteger atomicInteger1 = this.e0;
                q q3 = this.d0;
                h01 = (h0)this.c0;
                c c1 = (c)this.k0;
                try {
                    f.b0(object0);
                    atomicInteger2 = atomicInteger1;
                    q4 = q3;
                    object4 = object0;
                    c2 = c1;
                    r91 = r90;
                    arrayList1 = arrayList0;
                    q5 = q2;
                    currencyAmount1 = currencyAmount0;
                    goto label_142;
                }
                catch(Throwable throwable0) {
                    atomicInteger0 = atomicInteger1;
                    h00 = h01;
                    goto label_165;
                }
            }
            case 4: {
                atomicInteger0 = this.e0;
                q1 = this.d0;
                h00 = (h0)this.c0;
                c0 = (c)this.k0;
                try {
                    f.b0(object0);
                    goto label_162;
                }
                catch(Throwable throwable0) {
                    goto label_165;
                }
            }
            case 5: {
                f.b0(object0);
                object3 = object0;
                ((b0)object3).Y(new PayBillDialogResult(null));
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    label_101:
        r91 = r93;
        try {
        label_102:
            h00 = q0.l0;
            Map map0 = N.a;
            Object object8 = map0.get(h00);
            if(object8 == null) {
                object8 = new AtomicInteger(0);
                map0.put(h00, object8);
            }
            atomicInteger3 = (AtomicInteger)object8;
            while(true) {
                Object object9 = ((B0)h00).getValue();
                ((Boolean)object9).getClass();
                if(((B0)h00).j(object9, Boolean.valueOf(atomicInteger3.incrementAndGet() > 0))) {
                    break;
                }
            }
        }
        catch(p8 p80) {
            mb.a.a(null, null, new k(q0, null), 3);
            throw p80;
        }
        try {
            currencyAmount3 = c3.b;
            arrayList3 = new ArrayList(r.b0(c3.c));
            for(Object object10: c3.c) {
                arrayList3.add(new Ab.k(((ProposedBillField)object10).X, ((ProposedBillField)object10).Z));
            }
            this.k0 = c3;
            this.c0 = h00;
            this.d0 = q0;
            this.e0 = atomicInteger3;
            this.f0 = currencyAmount3;
            this.g0 = r91;
            this.h0 = q0;
            this.i0 = arrayList3;
            this.j0 = 3;
            object4 = q0.i0.d(this);
        }
        catch(Throwable throwable0) {
            atomicInteger0 = atomicInteger3;
            goto label_165;
        }
        if(object4 == object1) {
            return object1;
        }
        h01 = h00;
        atomicInteger2 = atomicInteger3;
        currencyAmount1 = currencyAmount3;
        arrayList1 = arrayList3;
        q4 = q0;
        c2 = c3;
        q5 = q4;
        try {
        label_142:
            this.k0 = c2;
            this.c0 = h01;
            this.d0 = q4;
            this.e0 = atomicInteger2;
            this.f0 = null;
            this.g0 = null;
            this.h0 = null;
            this.i0 = null;
            this.j0 = 4;
            if(q5.p(r91, currencyAmount1, arrayList1, ((String)object4), q4.h0.Y.f0, this) == object1) {
                return object1;
            }
        }
        catch(Throwable throwable0) {
            atomicInteger0 = atomicInteger2;
            h00 = h01;
            goto label_165;
        }
        atomicInteger0 = atomicInteger2;
        c0 = c2;
        q1 = q4;
        h00 = h01;
        try {
        label_162:
            q1.j0.b(c0.b, c0.a);
            goto label_169;
        }
        catch(Throwable throwable0) {
        }
        try {
            do {
            label_165:
                Object object11 = ((B0)h00).getValue();
                ((Boolean)object11).getClass();
            }
            while(!((B0)h00).j(object11, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
            throw throwable0;
            do {
            label_169:
                Object object12 = ((B0)h00).getValue();
                ((Boolean)object12).getClass();
            }
            while(!((B0)h00).j(object12, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        }
        catch(p8 p80) {
            mb.a.a(null, null, new k(q0, null), 3);
            throw p80;
        }
        this.k0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.j0 = 5;
        object3 = q0.k0.e(this);
        if(object3 == object1) {
            return object1;
        }
        ((b0)object3).Y(new PayBillDialogResult(null));
        return object2;
    }
}

