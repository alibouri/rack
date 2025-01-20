package ia;

import Ab.m;
import Ab.t;
import Nb.j;
import Qa.c;
import R.W0;
import Xb.G;
import Xb.k;
import Y8.R6;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.paymentcards.PaymentCardsParams;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import pc.e;
import pc.f;
import pc.y;
import q9.r1;
import ra.Q0;

public final class o implements Function1, f {
    public final int X;
    public final Object Y;
    public final Object Z;

    public o(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    @Override  // pc.f
    public void g(e e0, IOException iOException0) {
        if(!e0.v()) {
            m m0 = W5.f.v(iOException0);
            ((k)this.Z).i(m0);
        }
    }

    @Override  // pc.f
    public void m(e e0, y y0) {
        ((k)this.Z).i(y0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = this.Z;
        Object object2 = this.Y;
        switch(this.X) {
            case 0: {
                j.f(((W0)object0), "it");
                return ((W0)object0) == W0.Y ? Boolean.valueOf(((Boolean)((Function1)object2).n(((c)object1))).booleanValue()) : Boolean.valueOf(false);
            }
            case 1: {
                Throwable throwable0 = (Throwable)object0;
                try {
                    ((e)object2).cancel();
                }
                catch(Throwable unused_ex) {
                }
                return t.a;
            }
            default: {
                j.f(((G)object0), "scope");
                ((PaymentCardsActivity)object2).getClass();
                R6 r60 = r1.b(((PaymentCardsActivity)object2)).a();
                j.f(r60, "repo");
                j.f(((PaymentCardsParams)object1).Y, "kycHandle");
                return new Q0(r60, ((PaymentCardsParams)object1).Y, ((G)object0));
            }
        }
    }
}

