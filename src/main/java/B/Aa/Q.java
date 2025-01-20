package Aa;

import Ab.e;
import Ab.k;
import Ab.t;
import Ba.l;
import Ba.p;
import Bb.F;
import Ca.s;
import Ca.x;
import Ca.y;
import Ca.z;
import Da.m;
import E9.a;
import Ea.O0;
import Ea.P0;
import Ha.T;
import J0.d;
import Nb.h;
import Nb.j;
import Q4.i;
import Y8.N;
import ac.B0;
import android.os.Build.VERSION;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import c.L;
import com.apollographql.apollo.api.b;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.scratchCardRewards.RedeemScratchCardActivity;
import com.wave.customer.scratchCardRewards.RewardsPathDetailsActivity;
import com.wave.customer.scratchCardRewards.ScratchCardRewardsActivity;
import com.wave.customer.scratchCardRewards.f;
import com.wave.customer.scratchCardRewards.g;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.chromium.net.CronetEngine;
import pc.v;
import q9.C3;
import q9.r1;

public final class q extends h implements Function0 {
    public final int g0;

    public q(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BigDecimal bigDecimal1;
        int v2;
        Object object0 = null;
        Object object1 = t.a;
        Object object2 = this.Y;
        switch(this.g0) {
            case 0: {
                ((L)object2).d();
                return object1;
            }
            case 1: {
                ((u0)object2).h0.c();
                return object1;
            }
            case 2: {
                ((u0)object2).h0.d();
                return object1;
            }
            case 3: {
                B0 b00 = ((u0)object2).j0;
                do {
                    Object object3 = b00.getValue();
                }
                while(!b00.j(object3, c0.a(((c0)object3), false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x6FFF)));
                return object1;
            }
            case 4: {
                B0 b01 = ((u0)object2).j0;
                do {
                    Object object4 = b01.getValue();
                }
                while(!b01.j(object4, c0.a(((c0)object4), false, false, null, null, null, null, null, false, false, null, b0.Y, null, false, null, null, 0x7BFF)));
                return object1;
            }
            case 5: {
                ((u0)object2).getClass();
                k0 k00 = new k0(((u0)object2), null);
                N.k(((u0)object2), ((u0)object2).l0, true, k00);
                return object1;
            }
            case 6: {
                B0 b02 = ((u0)object2).j0;
                Z z1 = ((c0)b02.getValue()).d;
                CurrencyAmount currencyAmount0 = ((c0)b02.getValue()).c;
                if(currencyAmount0 == null) {
                    v2 = -1;
                }
                else {
                    BigDecimal bigDecimal0 = currencyAmount0.Y;
                    v2 = bigDecimal0 == null ? -1 : bigDecimal0.intValue();
                }
                j.f(((u0)object2).b0, "<this>");
                i.y(((u0)object2).b0, x0.Y, "tap withdraw", F.K(new k[]{new k("isVaultLocked", Boolean.valueOf(z1 instanceof X)), new k("vaultBalance", v2)}));
                if(z1 instanceof X) {
                    do {
                        Object object5 = b02.getValue();
                    }
                    while(!b02.j(object5, c0.a(((c0)object5), false, false, null, null, null, null, null, false, false, null, b0.X, null, false, null, null, 0x7BFF)));
                    return object1;
                }
                if(!(z1 instanceof Y)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                CurrencyAmount currencyAmount1 = ((c0)b02.getValue()).c;
                if(currencyAmount1 == null) {
                    bigDecimal1 = BigDecimal.ZERO;
                }
                else {
                    bigDecimal1 = currencyAmount1.Y;
                    if(bigDecimal1 == null) {
                        bigDecimal1 = BigDecimal.ZERO;
                    }
                }
                if(bigDecimal1.compareTo(BigDecimal.ZERO) <= 0) {
                    do {
                        Object object6 = b02.getValue();
                    }
                    while(!b02.j(object6, c0.a(((c0)object6), false, false, null, null, null, r1.d(0x7F120118, new Object[0]), null, false, false, null, null, null, false, null, null, 0x7FDF)));  // string:deposit_into_savings_before_withdrawing "Please transfer in before transferring 
                                                                                                                                                                                                    // out :)"
                    return object1;
                }
                p0 p00 = new p0(((u0)object2), null);
                N.k(((u0)object2), ((u0)object2).l0, true, p00);
                return object1;
            }
            case 7: {
                ((u0)object2).p();
                return object1;
            }
            case 8: {
                B0 b03 = ((u0)object2).j0;
                do {
                    Object object7 = b03.getValue();
                }
                while(!b03.j(object7, c0.a(((c0)object7), false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FDF)));
                return object1;
            }
            case 9: {
                ((u0)object2).getClass();
                n0 n00 = new n0(((u0)object2), null);
                N.k(((u0)object2), ((u0)object2).l0, true, n00);
                return object1;
            }
            case 10: {
                ((u0)object2).getClass();
                l0 l00 = new l0(((u0)object2), null);
                N.k(((u0)object2), ((u0)object2).l0, true, l00);
                return object1;
            }
            case 11: {
                ((u0)object2).h0.b();
                return object1;
            }
            case 12: {
                return ((C3)object2).i();
            }
            case 13: {
                ((L)object2).d();
                return object1;
            }
            case 14: {
                ((Ba.q)object2).getClass();
                p p0 = new p(((Ba.q)object2), null);
                N.k(((Ba.q)object2), ((Ba.q)object2).d0, true, p0).q(new l(0, ((Ba.q)object2)));
                return object1;
            }
            case 15: {
                B0 b04 = ((z)object2).d0;
                switch(((Ca.t)b04.getValue()).a.ordinal()) {
                    case 0: {
                        x x0 = new x(((z)object2), null);
                        N.k(((z)object2), ((z)object2).f0, true, x0);
                        return object1;
                    }
                    case 1: {
                        do {
                            Object object8 = b04.getValue();
                        }
                        while(!b04.j(object8, Ca.t.a(((Ca.t)object8), s.X, null, null, null, false, false, null, null, null, 510)));
                        return object1;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                do {
                    Object object9 = b04.getValue();
                }
                while(!b04.j(object9, Ca.t.a(((Ca.t)object9), s.Y, null, null, null, false, false, null, null, null, 510)));
                return object1;
            }
            case 16: {
                B0 b05 = ((z)object2).d0;
                do {
                    Object object10 = b05.getValue();
                }
                while(!b05.j(object10, Ca.t.a(((Ca.t)object10), null, null, null, null, false, false, null, null, null, 0x1DF)));
                return object1;
            }
            case 17: {
                B0 b06 = ((z)object2).d0;
                s s0 = ((Ca.t)b06.getValue()).a;
                a a0 = ((z)object2).b0;
                if(s0 == s.X) {
                    j.f(a0, "<this>");
                    i.y(a0, x0.Z, "tap choose date", null);
                    do {
                        Object object11 = b06.getValue();
                    }
                    while(!b06.j(object11, Ca.t.a(((Ca.t)object11), s.Y, null, null, null, false, false, null, null, null, 510)));
                    return object1;
                }
                if(((Ca.t)b06.getValue()).a == s.Y && ((Ca.t)b06.getValue()).c != null) {
                    String s1 = String.valueOf(((Ca.t)b06.getValue()).b);
                    j.f(a0, "<this>");
                    Map map0 = F.J(new k("selectedDuration", s1));
                    i.y(a0, x0.b0, "tap confirm duration", map0);
                    do {
                        Object object12 = b06.getValue();
                    }
                    while(!b06.j(object12, Ca.t.a(((Ca.t)object12), s.Z, null, null, null, false, false, null, null, null, 510)));
                    return object1;
                }
                if(((Ca.t)b06.getValue()).a == s.Z) {
                    j.f(a0, "<this>");
                    i.y(a0, x0.c0, "tap lock my vault", null);
                    y y0 = new y(((z)object2), null);
                    N.k(((z)object2), ((z)object2).f0, true, y0);
                }
                return object1;
            }
            case 18: {
                ((L)object2).d();
                return object1;
            }
            case 19: {
                ((m)object2).getClass();
                Da.l l0 = new Da.l(((m)object2), null);
                N.k(((m)object2), ((m)object2).d0, true, l0).q(new l(2, ((m)object2)));
                return object1;
            }
            case 20: {
                ((RedeemScratchCardActivity)object2).onBackPressed();
                return object1;
            }
            case 21: {
                Map map1 = b.t("scratchCardId", ((g)object2).Z.X);
                ((g)object2).b0.d("redeem scratch card claimed", map1);
                f f0 = new f(((g)object2), null);
                N.k(((g)object2), ((g)object2).c0, true, f0);
                do {
                    Object object13 = ((g)object2).d0.getValue();
                    j.f(((com.wave.customer.scratchCardRewards.e)object13), "$this$updateState");
                    j.f(((com.wave.customer.scratchCardRewards.e)object13).b, "card");
                    com.wave.customer.scratchCardRewards.e e0 = new com.wave.customer.scratchCardRewards.e(true, ((com.wave.customer.scratchCardRewards.e)object13).b);
                }
                while(!((g)object2).d0.j(object13, e0));
                return object1;
            }
            case 22: {
                ((RewardsPathDetailsActivity)object2).onBackPressed();
                return object1;
            }
            case 23: {
                ((ScratchCardRewardsActivity)object2).onBackPressed();
                return object1;
            }
            case 24: {
                B0 b07 = ((O0)object2).f0;
                do {
                    Object object14 = b07.getValue();
                }
                while(!b07.j(object14, P0.a(((P0)object14), null, null, false, false, null, null, null, null, null, null, 0x3FD)));
                return object1;
            }
            case 25: {
                int v3 = Build.VERSION.SDK_INT;
                if(v3 >= 30) {
                    J0.g.a(((View)object2), 1);
                }
                if(v3 >= 29) {
                    ContentCaptureSession contentCaptureSession0 = J0.f.a(((View)object2));
                    if(contentCaptureSession0 != null) {
                        return new d(contentCaptureSession0, ((View)object2));
                    }
                }
                return null;
            }
            case 26: {
                if(((AndroidComposeView)object2).isFocused() || ((AndroidComposeView)object2).hasFocus()) {
                    ((AndroidComposeView)object2).clearFocus();
                }
                return object1;
            }
            case 27: {
                return ((AndroidComposeView)object2).y();
            }
            case 28: {
                CronetEngine cronetEngine0 = (CronetEngine)((H9.d)object2).g.invoke();
                if(cronetEngine0 != null) {
                    object0 = new Q9.e(cronetEngine0, r1.b(((H9.d)object2).d));
                }
                return object0 == null ? ((v)((H9.d)object2).o.getValue()) : object0;
            }
            default: {
                ((T)object2).getClass();
                long v = System.currentTimeMillis();
                int v1 = ((T)object2).n0 + 1;
                ((T)object2).n0 = v1;
                if(v - ((T)object2).p0 > ((T)object2).q0) {
                    ((T)object2).p0 = v;
                    ((T)object2).n0 = 1;
                    return object1;
                }
                if(v1 >= ((T)object2).o0) {
                    ((T)object2).n0 = 0;
                    Ha.z z0 = new Ha.z(((T)object2), null);
                    N.k(((T)object2), ((T)object2).g0, true, z0);
                }
                return object1;
            }
        }
    }
}

