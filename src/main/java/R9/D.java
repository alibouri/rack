package R9;

import Ab.k;
import Ab.t;
import Ea.r;
import Eb.a;
import Nb.j;
import W5.f;
import Xb.J;
import androidx.lifecycle.LifecycleOwnerKt;
import com.wave.customer.BuyAirtimeDialogActivity;
import kotlin.coroutines.g;
import o9.N1;
import o9.b0;
import o9.c;
import o9.i1;
import o9.n1;
import q9.j3;
import q9.o0;
import q9.r1;

public final class d extends j3 implements b0 {
    public final BuyAirtimeDialogActivity b;

    public d(BuyAirtimeDialogActivity buyAirtimeDialogActivity0) {
        this.b = buyAirtimeDialogActivity0;
        super(buyAirtimeDialogActivity0);
    }

    @Override  // o9.b0
    public final void I(i1 i10) {
        j.f(i10, "multichoice");
        j.f(this.b, "<this>");
        J.q(LifecycleOwnerKt.a(this.b), null, null, new n1(this.b, i10, null), 3);
    }

    @Override  // o9.b0
    public final void T() {
        this.b.getClass();
        r1.b(this.b);
    }

    @Override  // o9.b0
    public final Object e0(c c0, g g0) {
        R9.c c1;
        if(g0 instanceof R9.c) {
            c1 = (R9.c)g0;
            int v = c1.d0;
            if((v & 0x80000000) == 0) {
                c1 = new R9.c(this, ((Fb.c)g0));
            }
            else {
                c1.d0 = v ^ 0x80000000;
            }
        }
        else {
            c1 = new R9.c(this, ((Fb.c)g0));
        }
        Object object0 = c1.b0;
        Object object1 = a.X;
        switch(c1.d0) {
            case 0: {
                f.b0(object0);
                r r0 = new r(this.b, 5, c0);
                c1.d0 = 1;
                object0 = o0.Z(this.b, r0, c1);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Integer integer0 = (Integer)((k)object0).Y;
        if(integer0 == null || ((int)integer0) != -1) {
            throw new N1();  // initializer: Ljava/lang/Exception;-><init>()V
        }
        return t.a;
    }
}

