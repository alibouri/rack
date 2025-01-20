package o9;

import Ab.k;
import Ab.t;
import Ea.r;
import Eb.a;
import Nb.j;
import W5.f;
import Xb.J;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.coroutines.g;
import q9.j3;
import q9.o0;
import q9.r1;

public final class e0 extends j3 implements b0 {
    public final g0 b;

    public e0(g0 g00) {
        this.b = g00;
        super(g00);
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
        d0 d00;
        if(g0 instanceof d0) {
            d00 = (d0)g0;
            int v = d00.d0;
            if((v & 0x80000000) == 0) {
                d00 = new d0(this, ((Fb.c)g0));
            }
            else {
                d00.d0 = v ^ 0x80000000;
            }
        }
        else {
            d00 = new d0(this, ((Fb.c)g0));
        }
        Object object0 = d00.b0;
        Object object1 = a.X;
        switch(d00.d0) {
            case 0: {
                f.b0(object0);
                r r0 = new r(this.b, 10, c0);
                d00.d0 = 1;
                object0 = o0.Z(this.b, r0, d00);
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

