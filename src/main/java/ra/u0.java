package ra;

import Ab.t;
import Eb.a;
import Ma.w;
import N9.d;
import Qa.e;
import W5.f;
import a9.F5;
import ac.B0;
import ac.i;
import com.sendwave.backend.fragment.PaymentCardWalletFragment;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase;
import java.util.Set;
import kotlin.coroutines.g;

public final class u0 implements i {
    public final int X;
    public final L0 Y;

    public u0(L0 l00, int v) {
        this.X = v;
        this.Y = l00;
        super();
    }

    public Object a(c0 c00, g g0) {
        j j1;
        PaymentCardWalletFragment paymentCardWalletFragment1;
        k k1;
        CurrencyAmount currencyAmount1;
        Object object3;
        c0 c02;
        String s;
        F5 f50;
        N n0;
        boolean z;
        c0 c01;
        B0 b00;
        L0 l00;
        y0 y00;
        if(g0 instanceof y0) {
            y00 = (y0)g0;
            int v = y00.p0;
            if((v & 0x80000000) == 0) {
                y00 = new y0(this, g0);
            }
            else {
                y00.p0 = v ^ 0x80000000;
            }
        }
        else {
            y00 = new y0(this, g0);
        }
        Object object0 = y00.n0;
        Object object1 = a.X;
        switch(y00.p0) {
            case 0: {
                f.b0(object0);
                l00 = this.Y;
                b00 = this.Y.h0;
                c01 = c00;
                goto label_41;
            }
            case 1: {
                z = y00.m0;
                n0 = y00.l0;
                j j0 = y00.k0;
                PaymentCardWalletFragment paymentCardWalletFragment0 = y00.j0;
                k k0 = y00.i0;
                CurrencyAmount currencyAmount0 = y00.h0;
                f50 = y00.g0;
                s = y00.f0;
                Object object2 = y00.e0;
                l00 = y00.d0;
                b00 = y00.c0;
                c02 = y00.b0;
                f.b0(object0);
                object3 = object2;
                currencyAmount1 = currencyAmount0;
                k1 = k0;
                paymentCardWalletFragment1 = paymentCardWalletFragment0;
                j1 = j0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            b00 = b00;
            if(b00.j(object3, N.a(n0, null, j1, paymentCardWalletFragment1, k1, z, null, currencyAmount1, f50, s, false, false, null, false, null, null, null, ((Boolean)object0).booleanValue(), c02.i, 0xFE21))) {
                return t.a;
            }
            l00 = l00;
            c01 = c02;
        label_41:
            Object object4 = b00.getValue();
            n0 = (N)object4;
            Ab.k k2 = Nb.j.a((c01.a == null ? null : c01.a.d), O.a) ? new Ab.k(n0.d, Boolean.valueOf(n0.e)) : new Ab.k(null, Boolean.FALSE);
            k k3 = (k)k2.X;
            z = ((Boolean)k2.Y).booleanValue();
            y00.b0 = c01;
            y00.c0 = b00;
            y00.d0 = l00;
            y00.e0 = object4;
            s = c01.e;
            y00.f0 = s;
            f50 = c01.d;
            y00.g0 = f50;
            CurrencyAmount currencyAmount2 = c01.c;
            y00.h0 = currencyAmount2;
            y00.i0 = k3;
            PaymentCardWalletFragment paymentCardWalletFragment2 = c01.b;
            y00.j0 = paymentCardWalletFragment2;
            y00.k0 = c01.a;
            y00.l0 = n0;
            y00.m0 = z;
            j j2 = c01.a;
            y00.p0 = 1;
            w w0 = l00.d0.s();
            Object object5 = TransactionHistoryDatabase.m.y(w0, e.f0, y00);
            if(object5 == object1) {
                return object1;
            }
            c02 = c01;
            object0 = object5;
            object3 = object4;
            currencyAmount1 = currencyAmount2;
            k1 = k3;
            paymentCardWalletFragment1 = paymentCardWalletFragment2;
            j1 = j2;
        }
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        switch(this.X) {
            case 0: {
                for(B0 b01 = this.Y.h0; true; b01 = b01) {
                    Object object2 = b01.getValue();
                    if(b01.j(object2, N.a(((N)object2), null, null, null, null, false, null, null, null, null, false, false, null, false, null, null, ((d)object0), false, null, 0x37FFF))) {
                        break;
                    }
                }
                return t.a;
            }
            case 1: {
                return this.a(((c0)object0), g0);
            }
            case 2: {
                for(B0 b02 = this.Y.h0; true; b02 = b02) {
                    Object object3 = b02.getValue();
                    if(b02.j(object3, N.a(((N)object3), null, null, null, null, false, ((O0)object0), null, null, null, false, false, null, false, null, null, null, false, null, 0x3FFDF))) {
                        break;
                    }
                }
                return t.a;
            }
            default: {
                for(B0 b00 = this.Y.h0; true; b00 = b00) {
                    Object object1 = b00.getValue();
                    if(b00.j(object1, N.a(((N)object1), null, null, null, null, false, null, null, null, null, false, false, null, false, ((Set)object0), null, null, false, null, 0x3DFFF))) {
                        break;
                    }
                }
                return t.a;
            }
        }
    }
}

