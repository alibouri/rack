package ra;

import Ab.k;
import Ab.t;
import Bb.A;
import Bb.F;
import E9.b;
import Eb.a;
import Fb.j;
import Ma.v;
import W5.f;
import Y8.K5;
import Y8.N5;
import Y8.O;
import Y8.R6;
import Y8.v5;
import ac.B0;
import com.sendwave.models.CurrencyAmount;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import q9.M0;

public final class w0 extends j implements Function1 {
    public final int c0;
    public int d0;
    public final L0 e0;

    public w0(L0 l00, g g0, int v) {
        this.c0 = v;
        this.e0 = l00;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.c0) {
            case 0: {
                return new w0(this.e0, ((g)object0), 0).v(t.a);
            }
            case 1: {
                return new w0(this.e0, ((g)object0), 1).v(t.a);
            }
            case 2: {
                return new w0(this.e0, ((g)object0), 2).v(t.a);
            }
            case 3: {
                return new w0(this.e0, ((g)object0), 3).v(t.a);
            }
            case 4: {
                return new w0(this.e0, ((g)object0), 4).v(t.a);
            }
            case 5: {
                return new w0(this.e0, ((g)object0), 5).v(t.a);
            }
            default: {
                return new w0(this.e0, ((g)object0), 6).v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        switch(this.c0) {
            case 0: {
                Object object3 = a.X;
                Map map2 = A.X;
                L0 l01 = this.e0;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        try {
                            this.d0 = 1;
                            if(((t0)l01.e0).b(this) == object3) {
                                return object3;
                            label_36:
                                f.b0(object0);
                            }
                            B0 b00 = l01.h0;
                            do {
                                Object object4 = b00.getValue();
                            }
                            while(!b00.j(object4, N.a(((N)object4), null, null, null, null, false, null, null, null, null, false, false, M.X, true, null, null, null, false, null, 0x3E7FF)));
                            CurrencyAmount currencyAmount0 = ((N)l01.h0.getValue()).g;
                            Nb.j.f(l01.b0, "<this>");
                            Nb.j.f(currencyAmount0, "fee");
                            Map map3 = currencyAmount0.f() ? F.J(new k("fee", M0.a(currencyAmount0))) : map2;
                            l01.b0.d("activate card", F.Q(map3, W4.f.P(true)));
                            return t.a;
                        }
                        catch(O o1) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_36;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                b b0 = l01.b0;
                CurrencyAmount currencyAmount1 = ((N)l01.h0.getValue()).g;
                Nb.j.f(b0, "<this>");
                Nb.j.f(currencyAmount1, "fee");
                if(currencyAmount1.f()) {
                    map2 = com.apollographql.apollo.api.b.t("fee", M0.a(currencyAmount1));
                }
                b0.d("activate card", F.Q(map2, W4.f.P(false)));
                throw o1;
            }
            case 1: {
                Object object5 = a.X;
                L0 l02 = this.e0;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        try {
                            this.d0 = 1;
                            Object object6 = ((t0)l02.e0).f(this);
                            if(object6 == object5) {
                                return object5;
                            label_64:
                                f.b0(object0);
                                object6 = object0;
                            }
                            B0 b01 = l02.h0;
                            do {
                                Object object7 = b01.getValue();
                            }
                            while(!b01.j(object7, N.a(((N)object7), null, null, null, ((ra.k)object6), false, null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3FFF7)));
                            l02.o(((ra.k)object6));
                            Nb.j.f(l02.b0, "<this>");
                            Map map4 = W4.f.P(true);
                            l02.b0.d("copy card number", map4);
                            return t.a;
                        }
                        catch(O o2) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_64;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Nb.j.f(l02.b0, "<this>");
                Map map5 = W4.f.P(false);
                l02.b0.d("copy card number", map5);
                throw o2;
            }
            case 2: {
                Object object8 = a.X;
                L0 l03 = this.e0;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        try {
                            this.d0 = 1;
                            Object object9 = ((t0)l03.e0).f(this);
                            if(object9 == object8) {
                                return object8;
                            label_88:
                                f.b0(object0);
                                object9 = object0;
                            }
                            B0 b02 = l03.h0;
                            do {
                                Object object10 = b02.getValue();
                            }
                            while(!b02.j(object10, N.a(((N)object10), null, null, null, ((ra.k)object9), true, null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3FFE7)));
                            d0 d00 = (d0)l03.j0.a();
                            if(d00 != null) {
                                d00.b();
                            }
                            Nb.j.f(l03.b0, "<this>");
                            Map map6 = W4.f.P(true);
                            l03.b0.d("show card", map6);
                            return t.a;
                        }
                        catch(O o3) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_88;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Nb.j.f(l03.b0, "<this>");
                Map map7 = W4.f.P(false);
                l03.b0.d("show card", map7);
                throw o3;
            }
            case 3: {
                Object object11 = a.X;
                t t1 = t.a;
                L0 l04 = this.e0;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        try {
                            this.d0 = 1;
                            ((t0)l04.e0).getClass();
                            String s1 = UUID.randomUUID().toString();
                            Nb.j.e(s1, "toString(...)");
                            v5 v50 = new v5(((t0)l04.e0).d().a, s1);
                            Object object12 = l0.a(new v(((t0)l04.e0), v50, null, 9), this);
                            if(object12 != object11) {
                                object12 = t1;
                            }
                            if(object12 == object11) {
                                return object11;
                            label_121:
                                f.b0(object0);
                            }
                            Nb.j.f(l04.b0, "<this>");
                            Map map8 = W4.f.P(true);
                            l04.b0.d("lock card", map8);
                            return t1;
                        }
                        catch(O o4) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_121;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Nb.j.f(l04.b0, "<this>");
                Map map9 = W4.f.P(false);
                l04.b0.d("lock card", map9);
                throw o4;
            }
            case 4: {
                Object object13 = a.X;
                t t2 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        this.d0 = 1;
                        N5 n50 = new N5();  // initializer: Ljava/lang/Object;-><init>()V
                        Object object14 = R6.d(((t0)this.e0.e0).b, n50, null, null, this, 6);
                        if(object14 != object13) {
                            object14 = t2;
                        }
                        return object14 != object13 ? t2 : object13;
                    }
                    case 1: {
                        f.b0(object0);
                        return t2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 5: {
                Object object15 = a.X;
                t t3 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        this.d0 = 1;
                        N5 n51 = new N5();  // initializer: Ljava/lang/Object;-><init>()V
                        Object object16 = R6.d(((t0)this.e0.e0).b, n51, null, null, this, 6);
                        if(object16 != object15) {
                            object16 = t3;
                        }
                        return object16 != object15 ? t3 : object15;
                    }
                    case 1: {
                        f.b0(object0);
                        return t3;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                Object object1 = a.X;
                t t0 = t.a;
                L0 l00 = this.e0;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        try {
                            this.d0 = 1;
                            ((t0)l00.e0).getClass();
                            String s = UUID.randomUUID().toString();
                            Nb.j.e(s, "toString(...)");
                            K5 k50 = new K5(((t0)l00.e0).d().a, s);
                            Object object2 = l0.a(new v(((t0)l00.e0), k50, null, 11), this);
                            if(object2 != object1) {
                                object2 = t0;
                            }
                            if(object2 == object1) {
                                return object1;
                            label_17:
                                f.b0(object0);
                            }
                            Nb.j.f(l00.b0, "<this>");
                            Map map0 = W4.f.P(true);
                            l00.b0.d("unlock card", map0);
                            return t0;
                        }
                        catch(O o0) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_17;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Nb.j.f(l00.b0, "<this>");
                Map map1 = W4.f.P(false);
                l00.b0.d("unlock card", map1);
                throw o0;
            }
        }
    }
}

