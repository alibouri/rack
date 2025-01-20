package Aa;

import Ab.k;
import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import N9.c;
import Q4.i;
import W5.f;
import Y8.R9;
import ac.B0;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.savings.lock.LockVaultActivity;
import com.wave.customer.savings.lock.LockVaultParams;
import java.math.BigDecimal;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class l0 extends j implements Function2 {
    public int c0;
    public final u0 d0;

    public l0(u0 u00, g g0) {
        this.d0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new l0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object5;
        BigDecimal bigDecimal1;
        int v;
        Object object1 = a.X;
        Object object2 = t.a;
        u0 u00 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                E9.a a0 = u00.b0;
                B0 b00 = u00.j0;
                CurrencyAmount currencyAmount0 = ((c0)b00.getValue()).c;
                if(currencyAmount0 == null) {
                    v = -1;
                }
                else {
                    BigDecimal bigDecimal0 = currencyAmount0.Y;
                    v = bigDecimal0 == null ? -1 : bigDecimal0.intValue();
                }
                Nb.j.f(a0, "<this>");
                i.y(a0, x0.Y, "tap lock vault", F.J(new k("vaultBalance", v)));
                u00.h0.a(c.k0);
                if(((c0)b00.getValue()).h) {
                    do {
                        Object object3 = b00.getValue();
                    }
                    while(!b00.j(object3, c0.a(((c0)object3), false, false, null, null, null, null, null, false, false, null, null, null, true, null, null, 0x6FFF)));
                    return object2;
                }
                CurrencyAmount currencyAmount1 = ((c0)b00.getValue()).c;
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
                        Object object4 = b00.getValue();
                    }
                    while(!b00.j(object4, c0.a(((c0)object4), false, false, null, null, null, r1.d(0x7F120093, new Object[0]), null, false, false, null, null, null, false, null, null, 0x7FDF)));  // string:cannot_lock_empty_vault "Please transfer in before locking your Vault :)"
                    return object2;
                }
                this.c0 = 1;
                object5 = u00.l0.e(this);
                if(object5 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                object5 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        LockVaultParams lockVaultParams0 = new LockVaultParams(u00.Y.X);
        ((m)object5).V(LockVaultActivity.class, lockVaultParams0);
        return object2;
    }
}

