package ka;

import Ab.e;
import Ab.t;
import Bb.G;
import Bb.H;
import Bb.n;
import Bb.p;
import Bb.q;
import Bb.z;
import Fb.j;
import I2.J;
import Qa.c;
import Y8.m2;
import a9.L1;
import a9.M1;
import a9.a1;
import a9.c1;
import a9.i1;
import a9.j1;
import a9.k1;
import a9.l1;
import com.sendwave.backend.fragment.CustomerHistoryNodeFragment;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.type.ReceiptTemplateId.TICKET_TEMPLATE_ID;
import com.sendwave.backend.type.ReceiptTemplateId.UNKNOWN__;
import com.sendwave.backend.type.ReceiptTemplateId;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.Country;
import ha.S2;
import ha.u0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import q9.r1;
import wa.a;

public final class f extends j implements Mb.f {
    public m2 c0;
    public Set d0;
    public Country e0;
    public long f0;
    public final g g0;

    public f(g g0, kotlin.coroutines.g g1) {
        this.g0 = g0;
        super(5, g1);
    }

    @Override  // Mb.f
    public final Object d(Object object0, Object object1, Object object2, Object object3, Serializable serializable0) {
        long v = ((Number)object3).longValue();
        f f0 = new f(this.g0, ((kotlin.coroutines.g)serializable0));
        f0.c0 = (m2)object0;
        f0.d0 = (Set)object1;
        f0.e0 = (Country)object2;
        f0.f0 = v;
        return f0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s3;
        a a0;
        Object object2;
        W5.f.b0(object0);
        m2 m20 = this.c0;
        Set set0 = this.d0;
        Country country0 = this.e0;
        long v = this.f0;
        this.g0.getClass();
        M1 m10 = ((CustomerHomeFragment)m20.a).e.l.b;
        List list0 = m10 == null ? null : m10.a;
        if(list0 == null) {
            list0 = z.X;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: list0) {
            CustomerHistoryNodeFragment customerHistoryNodeFragment0 = ((L1)object1).b.b;
            if(set0.contains(customerHistoryNodeFragment0.getId())) {
                object2 = null;
            }
            else {
                Date date0 = customerHistoryNodeFragment0.c;
                Date date1 = new Date();
                S2.K1.getClass();
                String s = u0.a(date0, date1);
                if(!customerHistoryNodeFragment0.i) {
                    s = null;
                }
                String s1 = p.v0(n.r0(new String[]{s, customerHistoryNodeFragment0.j}), " - ", null, null, null, 62);
                CurrencyAmount currencyAmount0 = new CurrencyAmount(customerHistoryNodeFragment0.d.X, BigDecimal.ZERO);
                CurrencyAmount currencyAmount1 = customerHistoryNodeFragment0.g ? currencyAmount0 : customerHistoryNodeFragment0.d;
                c1 c10 = customerHistoryNodeFragment0.s;
                if(c10 == null) {
                    a0 = null;
                }
                else {
                    ReceiptTemplateId receiptTemplateId0 = c10.f;
                    if(receiptTemplateId0 != null) {
                        a.X.getClass();
                        if(receiptTemplateId0 instanceof TICKET_TEMPLATE_ID) {
                            a0 = a.Y;
                        }
                        else {
                            if(!(receiptTemplateId0 instanceof UNKNOWN__)) {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            a0 = a.Z;
                        }
                    }
                }
                a1 a10 = c10 == null ? null : c10.g;
                String s2 = customerHistoryNodeFragment0.getId();
                Nb.j.f(country0, "country");
                i1 i10 = customerHistoryNodeFragment0.o;
                if(i10 == null) {
                    boolean z = q.E(customerHistoryNodeFragment0);
                    j1 j10 = customerHistoryNodeFragment0.q;
                    if(z && j10 != null) {
                        s3 = r1.d(0x7F12032C, new Object[]{q.r(j10.a, j10.b, country0)});  // string:personal_history_transfer_received_frozen "Transfer from %1$s frozen"
                    }
                    else if(j10 == null) {
                        k1 k10 = customerHistoryNodeFragment0.p;
                        if(k10 == null) {
                            boolean z1 = q.E(customerHistoryNodeFragment0);
                            l1 l10 = customerHistoryNodeFragment0.r;
                            if(z1 && l10 != null) {
                                s3 = r1.d(0x7F12032F, new Object[]{q.r(l10.a, l10.b, country0)});  // string:personal_history_transfer_sent_frozen "Transfer to %1$s frozen"
                            }
                            else if(l10 == null) {
                                s3 = customerHistoryNodeFragment0.e == null ? r1.d(0x7F12031F, new Object[0]) : customerHistoryNodeFragment0.e;  // string:personal_history_adjustment "Balance adjustment"
                            }
                            else {
                                s3 = r1.d(0x7F120330, new Object[]{q.r(l10.a, l10.b, country0)});  // string:personal_history_transfer_sent_reversal "Transfer to %1$s reversed"
                            }
                        }
                        else {
                            s3 = r1.d(0x7F12032E, new Object[]{q.r(k10.b, k10.c, country0)});  // string:personal_history_transfer_sent "Sent to %1$s"
                        }
                    }
                    else {
                        s3 = r1.d(0x7F12032D, new Object[]{q.r(j10.a, j10.b, country0)});  // string:personal_history_transfer_received_reversal "Transfer from %1$s reversed"
                    }
                }
                else {
                    s3 = r1.d(0x7F12032B, new Object[]{q.r(i10.a, i10.b, country0)});  // string:personal_history_transfer_received "Received from %1$s"
                }
                boolean z2 = q.E(customerHistoryNodeFragment0);
                long v1 = TimeUnit.MILLISECONDS.toSeconds(J.n(new Date().getTime() - date0.getTime() + v, 0L));
                object2 = new c(s2, customerHistoryNodeFragment0.a, s3, currencyAmount1, s1, customerHistoryNodeFragment0.g, z2, customerHistoryNodeFragment0.h && v1 <= 10L, a0, a10);
            }
            if(object2 != null) {
                arrayList0.add(object2);
            }
        }
        H h0 = new H(arrayList0);
        HashSet hashSet0 = new HashSet();
        Object object3 = new ArrayList();
        Iterator iterator1 = h0.iterator();
        while(true) {
            ListIterator listIterator0 = (ListIterator)((G)iterator1).Y;
            if(!listIterator0.hasPrevious()) {
                break;
            }
            Object object4 = listIterator0.previous();
            if(hashSet0.add(((c)object4).a)) {
                ((ArrayList)object3).add(object4);
            }
        }
        return object3;
    }
}

