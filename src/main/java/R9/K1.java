package R9;

import Aa.t0;
import Ab.t;
import G9.c;
import K9.K;
import Nb.j;
import Nb.p;
import Nb.x;
import Qa.T;
import Tb.e;
import V8.d;
import W5.f;
import Y8.H3;
import Y8.I3;
import Y8.J3;
import Y8.N;
import Y8.R6;
import Y8.S6;
import Y8.y6;
import ac.B0;
import ac.e0;
import ac.i0;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.WatchedPropertyProvider;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.apollographql.apollo.api.Optional.Present;
import com.sendwave.backend.fragment.MerchantPaymentInfoFragment;
import com.sendwave.backend.fragment.PayMerchantFragment;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.PayMerchantParams;
import f9.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import q9.L0;
import q9.n;
import q9.r1;

public final class k1 extends ViewModel {
    public final R6 Y;
    public final n Z;
    public final PayMerchantParams b0;
    public final c c0;
    public final boolean d0;
    public final V8.c e0;
    public final B0 f0;
    public final UUID g0;
    public final j0 h0;
    public final B0 i0;
    public final a j0;
    public final WatchedProperty k0;
    public final e0 l0;
    public final boolean m0;
    public final j0 n0;
    public final e0 o0;
    public final T p0;
    public static final e[] q0;

    static {
        p p0 = new p(k1.class, "wMerchant", "getWMerchant()Lcom/sendwave/backend/fragment/MerchantPaymentInfoFragment;", 0);
        x.a.getClass();
        k1.q0 = new e[]{p0, new p(k1.class, "wAmountInputAmount", "getWAmountInputAmount()Lcom/sendwave/models/CurrencyAmount;", 0)};
    }

    public k1(R6 r60, n n0, PayMerchantParams payMerchantParams0, c c0) {
        j.f(r60, "repo");
        BigDecimal bigDecimal0;
        j.f(n0, "assetLoader");
        j.f(c0, "announcementsSource");
        super();
        this.Y = r60;
        this.Z = n0;
        this.b0 = payMerchantParams0;
        this.c0 = c0;
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = o0.B(r60.h(payMerchantParams0.b0, PayMerchantFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        t0 t00 = new t0(i00, 18);
        t0 t01 = new t0(i00, 19);
        this.d0 = payMerchantParams0.Z;
        V8.c c1 = new V8.c(new V8.e());  // initializer: Ljava/lang/Object;-><init>()V
        this.e0 = c1;
        B0 b00 = o0.c(Boolean.FALSE);
        this.f0 = b00;
        UUID uUID0 = UUID.randomUUID();
        j.e(uUID0, "randomUUID(...)");
        this.g0 = uUID0;
        this.h0 = new j0(b00);
        B0 b01 = o0.c(null);
        this.i0 = b01;
        WatchedPropertyProvider watchedPropertyProvider0 = FlowWatcherKt.b(b01);
        e[] arr_e = k1.q0;
        WatchedProperty watchedProperty0 = watchedPropertyProvider0.b(this, arr_e[0]);
        a a0 = new a(this, t01);
        CurrencyAmount currencyAmount0 = payMerchantParams0.Y;
        if(currencyAmount0 == null) {
            bigDecimal0 = BigDecimal.ZERO;
            j.e(bigDecimal0, "ZERO");
        }
        else {
            bigDecimal0 = currencyAmount0.Y;
            if(bigDecimal0 == null) {
                bigDecimal0 = BigDecimal.ZERO;
                j.e(bigDecimal0, "ZERO");
            }
        }
        a0.c0.getClass();
        a0.c0.l(null, bigDecimal0);
        this.j0 = a0;
        this.k0 = FlowWatcherKt.b(a0.d0).b(this, arr_e[1]);
        b1 b10 = new b1(3, null, 0);
        this.l0 = new e0(t01, a0.c0, b10, 0);
        MerchantPaymentInfoFragment merchantPaymentInfoFragment0 = (MerchantPaymentInfoFragment)watchedProperty0.a(arr_e[0], this);
        this.m0 = merchantPaymentInfoFragment0 == null ? true : merchantPaymentInfoFragment0.b;
        j0 j00 = q9.o0.d0(this, new e0(t00, a0.d0, new c1(3, null, 0), 0), null);
        this.n0 = j00;
        this.o0 = new e0(j00, a0.d0, new K(3, null, 3), 0);
        this.p0 = new T(b01, 3);
        if(currencyAmount0 != null && currencyAmount0.f()) {
            String s = currencyAmount0.Y.toString();
            j.e(s, "toString(...)");
            a0.e(0, 0, s, "");
            this.p();
        }
        N.k(this, c1, true, new a1(this, null));
    }

    public final Object o(Fb.c c0) {
        k1 k10;
        MerchantPaymentInfoFragment merchantPaymentInfoFragment0;
        k1 k11;
        k1 k12;
        d1 d10;
        if(c0 instanceof d1) {
            d10 = (d1)c0;
            int v = d10.f0;
            if((v & 0x80000000) == 0) {
                d10 = new d1(this, c0);
            }
            else {
                d10.f0 = v ^ 0x80000000;
            }
        }
        else {
            d10 = new d1(this, c0);
        }
        Object object0 = d10.d0;
        Object object1 = Eb.a.X;
        switch(d10.f0) {
            case 0: {
                f.b0(object0);
                Present optional$Present0 = S6.a(new Double(((double)this.Z.a.getResources().getDisplayMetrics().density)));
                J3 j30 = new J3(this.b0.X, optional$Present0);
                d10.b0 = this;
                d10.f0 = 1;
                object0 = R6.d(this.Y, j30, null, null, d10, 6);
                if(object0 == object1) {
                    return object1;
                }
                k12 = this;
            label_38:
                I3 i30 = ((H3)((y6)object0).b).a;
                merchantPaymentInfoFragment0 = i30 == null ? null : i30.b;
                if(merchantPaymentInfoFragment0 == null) {
                    d10.b0 = k12;
                    d10.c0 = null;
                    d10.f0 = 2;
                    object0 = k12.e0.e(d10);
                    if(object0 == object1) {
                        return object1;
                    }
                label_47:
                    String s = r1.d(0x7F120157, new Object[0]);  // string:error "Error"
                    String s1 = r1.d(0x7F120281, new Object[0]);  // string:merchant_not_found "Merchant not found"
                    d10.b0 = k12;
                    d10.c0 = merchantPaymentInfoFragment0;
                    d10.f0 = 3;
                    if(Pb.a.O(((d)object0), s, s1, null, null, false, null, null, d10, 508) == object1) {
                        return object1;
                    }
                    merchantPaymentInfoFragment0 = merchantPaymentInfoFragment0;
                    k11 = k12;
                label_56:
                    d10.b0 = k11;
                    d10.c0 = merchantPaymentInfoFragment0;
                    d10.f0 = 4;
                    object0 = k11.e0.e(d10);
                    if(object0 == object1) {
                        return object1;
                    }
                    k10 = k11;
                    ((d)object0).g0();
                    k12 = k10;
                }
                break;
            }
            case 1: {
                k1 k13 = d10.b0;
                f.b0(object0);
                k12 = k13;
                goto label_38;
            }
            case 2: {
                merchantPaymentInfoFragment0 = d10.c0;
                k12 = d10.b0;
                f.b0(object0);
                goto label_47;
            }
            case 3: {
                merchantPaymentInfoFragment0 = d10.c0;
                k11 = d10.b0;
                f.b0(object0);
                goto label_56;
            }
            case 4: {
                merchantPaymentInfoFragment0 = d10.c0;
                k10 = d10.b0;
                f.b0(object0);
                ((d)object0).g0();
                k12 = k10;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        k12.i0.k(merchantPaymentInfoFragment0);
        return t.a;
    }

    public final void p() {
        if(this.m0) {
            CurrencyAmount currencyAmount0 = (CurrencyAmount)this.k0.a(k1.q0[1], this);
            if(currencyAmount0 != null) {
                RoundingMode roundingMode0 = RoundingMode.UP;
                BigDecimal bigDecimal0 = L0.a(currencyAmount0.X);
                BigDecimal bigDecimal1 = currencyAmount0.Y.divide(bigDecimal0, roundingMode0).setScale(0, roundingMode0).multiply(bigDecimal0);
                j.e(bigDecimal1, "scalar");
                this.j0.c0.getClass();
                this.j0.c0.l(null, bigDecimal1);
                String s = bigDecimal1.toString();
                j.e(s, "toString(...)");
                this.j0.e(0, 0, s, "");
            }
        }
    }
}

