package K9;

import Ab.e;
import Ab.k;
import Ab.t;
import Bb.p;
import Bb.z;
import Fb.j;
import Qa.A;
import Qa.X;
import R9.T0;
import W5.f;
import Y8.t3;
import a9.k0;
import ac.i;
import android.media.MediaPlayer;
import com.sendwave.backend.fragment.AnnouncementFragment;
import com.sendwave.backend.fragment.BillFavoriteFragment;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.backend.fragment.LinkedAccountFragment;
import com.sendwave.backend.fragment.LinkedAccountTypeFragment;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import f9.P;
import f9.Q;
import f9.S;
import f9.b;
import hb.n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k2.g1;
import k2.h1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import pb.w;
import q9.I;
import q9.L0;
import q9.P2;
import q9.b2;
import q9.e2;
import q9.f2;
import q9.h2;
import q9.r1;
import rb.m;
import rb.o;
import yc.d;

public final class K extends j implements Function3 {
    public final int c0;
    public Object d0;
    public Object e0;

    public K(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    public K(Object object0, g g0, int v) {
        this.c0 = v;
        this.e0 = object0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                K k1 = new K(3, ((g)object2), 0);
                k1.d0 = (S)object0;
                k1.e0 = (CurrencyAmount)object1;
                return k1.v(t.a);
            }
            case 1: {
                K k2 = new K(3, ((g)object2), 1);
                k2.d0 = (String)object0;
                k2.e0 = (A)object1;
                return k2.v(t.a);
            }
            case 2: {
                K k3 = new K(3, ((g)object2), 2);
                k3.d0 = (h1)object0;
                k3.e0 = (Set)object1;
                return k3.v(t.a);
            }
            case 3: {
                K k4 = new K(3, ((g)object2), 3);
                k4.d0 = (String)object0;
                k4.e0 = (CurrencyAmount)object1;
                return k4.v(t.a);
            }
            case 4: {
                K k5 = new K(3, ((g)object2), 4);
                k5.d0 = (T0)object0;
                k5.e0 = (T0)object1;
                return k5.v(t.a);
            }
            case 5: {
                K k6 = new K(3, ((g)object2), 5);
                k6.d0 = (List)object0;
                k6.e0 = (b)object1;
                return k6.v(t.a);
            }
            case 6: {
                i i0 = (i)object0;
                K k7 = new K(((StackTraceElement[])this.e0), ((g)object2), 6);
                k7.d0 = (Throwable)object1;
                k7.v(t.a);
                return t.a;
            }
            case 7: {
                K k8 = new K(3, ((g)object2), 7);
                k8.d0 = (List)object0;
                k8.e0 = (t3)object1;
                return k8.v(t.a);
            }
            case 8: {
                K k9 = new K(3, ((g)object2), 8);
                k9.d0 = (LinkedAccountFragment)object0;
                k9.e0 = (LinkedAccountFragment)object1;
                return k9.v(t.a);
            }
            case 9: {
                K k10 = new K(3, ((g)object2), 9);
                k10.e0 = (CurrencyAmount)object0;
                k10.d0 = (LinkedAccountTypeFragment)object1;
                return k10.v(t.a);
            }
            case 10: {
                K k11 = new K(3, ((g)object2), 10);
                k11.d0 = (BillFavoriteFragment)object0;
                k11.e0 = (List)object1;
                return k11.v(t.a);
            }
            case 11: {
                K k12 = new K(3, ((g)object2), 11);
                k12.d0 = (String)object0;
                k12.e0 = (BillFieldsFragment)object1;
                return k12.v(t.a);
            }
            case 12: {
                K k13 = new K(3, ((g)object2), 12);
                k13.d0 = (Set)object0;
                k13.e0 = (List)object1;
                return k13.v(t.a);
            }
            case 13: {
                ((Number)object0).longValue();
                K k14 = new K(((P2)this.e0), ((g)object2), 13);
                k14.d0 = (h2)object1;
                return k14.v(t.a);
            }
            default: {
                K k0 = new K(3, ((g)object2), 14);
                k0.d0 = (Long)object0;
                k0.e0 = (w)object1;
                return k0.v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        boolean z = true;
        int v = 0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                S s0 = (S)this.d0;
                CurrencyAmount currencyAmount0 = (CurrencyAmount)this.e0;
                if(!(s0 instanceof Q)) {
                    if(!(s0 instanceof P)) {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    Integer integer0 = ((P)s0).d;
                    if(integer0 != null && ((int)integer0) == 0x7F0A029B) {  // id:send_amount_requester
                        switch(((P)s0).c.ordinal()) {
                            case 0: {
                                goto label_25;
                            }
                            case 1: {
                                return ((P)s0).a;
                            }
                        }
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    label_25:
                        if(((P)s0).b) {
                            Currency currency0 = currencyAmount0.X;
                            Nb.j.e(currency0, "currency");
                            BigDecimal bigDecimal0 = L0.a(currency0);
                            if(currencyAmount0.Y.compareTo(bigDecimal0) < 0) {
                                return r1.d(0x7F12015E, new Object[]{L0.a(currency0)});  // string:error_below_minimum "%s is the minimum amount"
                            }
                        }
                    }
                }
                return null;
            }
            case 1: {
                f.b0(object0);
                return new k(((String)this.d0), ((A)this.e0).b);
            }
            case 2: {
                f.b0(object0);
                h1 h10 = (h1)this.d0;
                X x0 = new X(((Set)this.e0), null);
                Nb.j.f(h10, "<this>");
                return new h1(new Ha.S(h10.a, 15, x0), h10.b, h10.c, g1.X);
            }
            case 3: {
                f.b0(object0);
                String s1 = (String)this.d0;
                if(((CurrencyAmount)this.e0).Y.compareTo(BigDecimal.ZERO) <= 0 || s1 != null && !Vb.j.c0(s1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 4: {
                f.b0(object0);
                Object object1 = (T0)this.d0;
                T0 t00 = (T0)this.e0;
                return t00 != null ? t00 : object1;
            }
            case 5: {
                f.b0(object0);
                return new X9.j(((List)this.d0), ((b)this.e0));
            }
            case 6: {
                f.b0(object0);
                Exception exception0 = new Exception(m5.b.w("Caught and dropped exception: ", ((Throwable)this.d0).getMessage()), ((Throwable)this.d0));
                exception0.setStackTrace(((StackTraceElement[])this.e0));
                n.b(exception0, null, null, 14);
                return t.a;
            }
            case 7: {
                f.b0(object0);
                if(!((List)this.d0).isEmpty() || ((t3)this.e0) != t3.Y) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 8: {
                f.b0(object0);
                Object object2 = (LinkedAccountFragment)this.d0;
                LinkedAccountFragment linkedAccountFragment0 = (LinkedAccountFragment)this.e0;
                return linkedAccountFragment0 != null ? linkedAccountFragment0 : object2;
            }
            case 9: {
                f.b0(object0);
                CurrencyAmount currencyAmount1 = (CurrencyAmount)this.e0;
                LinkedAccountTypeFragment linkedAccountTypeFragment0 = (LinkedAccountTypeFragment)this.d0;
                if(currencyAmount1.Y.compareTo(BigDecimal.ZERO) <= 0 || currencyAmount1.b(linkedAccountTypeFragment0.n) < 0 || currencyAmount1.b(linkedAccountTypeFragment0.o) > 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 10: {
                f.b0(object0);
                Object object3 = (BillFavoriteFragment)this.d0;
                List list0 = (List)this.e0;
                return object3 == null ? ((BillFavoriteFragment)p.q0(list0)) : object3;
            }
            case 11: {
                f.b0(object0);
                String s2 = (String)this.d0;
                BillFieldsFragment billFieldsFragment0 = (BillFieldsFragment)this.e0;
                k0 k00 = billFieldsFragment0.h;
                if(k00 != null) {
                    Nb.j.f(s2, "value");
                    return d.G(s2, billFieldsFragment0.c, k00.a, k00.b);
                }
                return null;
            }
            case 12: {
                f.b0(object0);
                Set set0 = (Set)this.d0;
                List list1 = (List)this.e0;
                if(list1 != null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object4: list1) {
                        if(!set0.contains(((AnnouncementFragment)object4).getId())) {
                            arrayList0.add(object4);
                        }
                    }
                    return p.K0(arrayList0, new I());  // initializer: Ljava/lang/Object;-><init>()V
                }
                return z.X;
            }
            case 13: {
                f.b0(object0);
                h2 h20 = (h2)this.d0;
                if(h20 instanceof f2 || Nb.j.a(h20, b2.b)) {
                    MediaPlayer mediaPlayer0 = ((P2)this.e0).b0;
                    if(mediaPlayer0 == null) {
                        return new Integer(0);
                    }
                    v = (int)(((double)mediaPlayer0.getCurrentPosition()) / ((double)mediaPlayer0.getDuration()) * 100.0);
                }
                else if(h20 instanceof e2) {
                    throw null;
                }
                return new Integer(v);
            }
            default: {
                f.b0(object0);
                Long long0 = (Long)this.d0;
                w w0 = (w)this.e0;
                long v1 = long0 == null ? System.currentTimeMillis() : ((long)long0);
                switch(w0.a.ordinal()) {
                    case 1: {
                        return m.d;
                    }
                    case 2: 
                    case 3: {
                        return w0.e ? m.e : new rb.n(v1);
                    }
                    case 4: {
                        return new o(v1);
                    }
                    case 0: 
                    case 5: 
                    case 6: {
                        return null;
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
        }
    }
}

