package Ba;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.G6;
import Y8.G7;
import Y8.H7;
import Y8.L7;
import Y8.N;
import Y8.R9;
import Y8.y6;
import a9.t6;
import a9.v6;
import ac.B0;
import com.apollographql.apollo.api.Optional;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.UNIT;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p extends j implements Function2 {
    public int c0;
    public Object d0;
    public final q e0;

    public p(q q0, g g0) {
        this.e0 = q0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object7;
        Object object6;
        R9 r90;
        Object object1 = a.X;
        Object object2 = t.a;
        q q0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.d0;
                k k0 = (k)q0.b0.getValue();
                CurrencyAmount currencyAmount0 = k0.h;
                N.l(currencyAmount0, r90.a);
                String s = Aa.a.a(currencyAmount0);
                B0 b00 = q0.b0;
                if(s != null) {
                    while(true) {
                        Object object3 = b00.getValue();
                        if(b00.j(object3, k.a(((k)object3), false, null, null, null, null, null, null, null, s, false, 0x2FF))) {
                            break;
                        }
                        b00 = b00;
                    }
                    return object2;
                }
                if(k0.g != null && !k0.j) {
                    do {
                        Object object4 = b00.getValue();
                    }
                    while(!b00.j(object4, k.a(((k)object4), false, null, null, null, null, null, null, null, null, true, 0x1FF)));
                    return object2;
                }
                do {
                    Object object5 = b00.getValue();
                }
                while(!b00.j(object5, k.a(((k)object5), true, null, null, null, null, null, null, null, null, false, 0x3FE)));
                L7 l70 = new L7(Optional.Companion.presentIfNotNull(k0.c), currencyAmount0);
                this.d0 = r90;
                this.c0 = 1;
                object6 = q0.Y.f(l70, G6.X, this);
                if(object6 == object1) {
                    return object1;
                }
                goto label_33;
            }
            case 1: {
                r90 = (R9)this.d0;
                f.b0(object0);
                object6 = object0;
            label_33:
                R2.f.B(q0.Z, ((y6)object6));
                H7 h70 = ((G7)((y6)object6).b).a;
                N.l(h70, r90.a);
                SavingsFragment savingsFragment0 = ((k)q0.b0.getValue()).b;
                if(savingsFragment0 != null) {
                    v6 v60 = savingsFragment0.b;
                    t6 t60 = v60.c;
                    if(t60.b.getId() == null) {
                        t6 t61 = new t6(t60.a, h70.b.b);
                        v6 v61 = new v6(v60.a, v60.b, t61, v60.d, v60.e);
                        SavingsFragment savingsFragment1 = new SavingsFragment(savingsFragment0.a, v61, savingsFragment0.c, savingsFragment0.d);
                        q0.Y.a(savingsFragment1);
                    }
                }
                this.d0 = null;
                this.c0 = 2;
                object7 = q0.d0.e(this);
                if(object7 == object1) {
                    return object1;
                }
                ((d)object7).Y(UNIT.X);
                return object2;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        object7 = object0;
        ((d)object7).Y(UNIT.X);
        return object2;
    }
}

