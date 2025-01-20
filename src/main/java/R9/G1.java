package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.G6;
import Y8.H4;
import Y8.I4;
import Y8.J4;
import Y8.M4;
import Y8.N4;
import Y8.N;
import Y8.P4;
import Y8.R9;
import Y8.S6;
import Y8.y6;
import ac.B0;
import ac.h0;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional.Present;
import com.sendwave.backend.fragment.DealDetailFragment;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.UNIT;
import com.wave.customer.growth.DealDetailActivity;
import com.wave.customer.growth.DealDetailParams;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class g1 extends j implements Function2 {
    public Object c0;
    public AtomicInteger d0;
    public y6 e0;
    public DealDetailFragment f0;
    public int g0;
    public Object h0;
    public final k1 i0;

    public g1(k1 k10, g g0) {
        this.i0 = k10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new g1(this.i0, g0);
        g1.h0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        AtomicInteger atomicInteger3;
        Object object7;
        AtomicInteger atomicInteger2;
        k1 k11;
        DealDetailFragment dealDetailFragment1;
        y6 y61;
        h0 h01;
        Object object6;
        DealDetailFragment dealDetailFragment0;
        y6 y60;
        AtomicInteger atomicInteger1;
        Object object5;
        AtomicInteger atomicInteger0;
        h0 h00;
        k1 k10;
        Object object1 = a.X;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.h0;
                k10 = this.i0;
                h00 = k10.f0;
                Map map0 = N.a;
                Object object2 = map0.get(h00);
                if(object2 == null) {
                    object2 = b.E(0, map0, ((B0)h00));
                }
                atomicInteger0 = (AtomicInteger)object2;
                do {
                    Object object3 = ((B0)h00).getValue();
                    ((Boolean)object3).getClass();
                }
                while(!((B0)h00).j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    Object object4 = k10.k0.a(k1.q0[1], k10);
                    N.l(((CurrencyAmount)object4), r90.a);
                    String s = k10.g0.toString();
                    Nb.j.e(s, "toString(...)");
                    Present optional$Present0 = S6.a(k10.b0.d0);
                    Present optional$Present1 = S6.a(k10.b0.c0);
                    P4 p40 = new P4(k10.b0.X, ((CurrencyAmount)object4), s, optional$Present1, optional$Present0, Absent.INSTANCE);
                    this.h0 = h00;
                    this.c0 = k10;
                    this.d0 = atomicInteger0;
                    this.g0 = 1;
                    object5 = k10.Y.f(p40, G6.X, this);
                    if(object5 == object1) {
                        return object1;
                    }
                    goto label_38;
                }
                catch(Throwable throwable0) {
                    h01 = h00;
                    atomicInteger1 = atomicInteger0;
                    goto label_129;
                }
            }
            case 1: {
                atomicInteger1 = this.d0;
                k10 = (k1)this.c0;
                h00 = (h0)this.h0;
                try {
                    f.b0(object0);
                    atomicInteger0 = atomicInteger1;
                    object5 = object0;
                }
                catch(Throwable throwable0) {
                    h01 = h00;
                    goto label_129;
                }
                try {
                label_38:
                    y60 = (y6)object5;
                    J4 j40 = ((H4)y60.b).a;
                    if(j40 == null) {
                        k11 = k10;
                        atomicInteger2 = atomicInteger0;
                    }
                    else {
                        M4 m40 = j40.a.c;
                        if(m40 == null) {
                            k11 = k10;
                            atomicInteger2 = atomicInteger0;
                        }
                        else {
                            I4 i40 = m40.b;
                            if(i40 == null) {
                                k11 = k10;
                                atomicInteger2 = atomicInteger0;
                            }
                            else {
                                dealDetailFragment0 = i40.b;
                                this.h0 = h00;
                                this.c0 = k10;
                                this.d0 = atomicInteger0;
                                this.e0 = y60;
                                this.f0 = dealDetailFragment0;
                                this.g0 = 2;
                                object6 = k10.e0.e(this);
                                goto label_58;
                            }
                        }
                    }
                    goto label_92;
                }
                catch(Throwable throwable0) {
                    try {
                        h01 = h00;
                        atomicInteger1 = atomicInteger0;
                        goto label_129;
                    label_58:
                        if(object6 == object1) {
                            return object1;
                        }
                        y61 = y60;
                        dealDetailFragment1 = dealDetailFragment0;
                        k11 = k10;
                        atomicInteger2 = atomicInteger0;
                        goto label_89;
                    }
                    catch(Throwable throwable0) {
                        atomicInteger1 = atomicInteger2;
                        h01 = h00;
                        goto label_129;
                    }
                }
            }
            case 2: {
                dealDetailFragment1 = this.f0;
                y6 y62 = this.e0;
                atomicInteger2 = this.d0;
                k1 k12 = (k1)this.c0;
                h0 h02 = (h0)this.h0;
                try {
                    f.b0(object0);
                    k11 = k12;
                    h00 = h02;
                    y61 = y62;
                    object6 = object0;
                }
                catch(Throwable throwable0) {
                    atomicInteger1 = atomicInteger2;
                    h01 = h02;
                    goto label_129;
                }
                try {
                label_89:
                    DealDetailParams dealDetailParams0 = new DealDetailParams(y61.a(dealDetailFragment1));
                    ((d)object6).V(DealDetailActivity.class, dealDetailParams0);
                    y60 = y61;
                label_92:
                    J4 j41 = ((H4)y60.b).a;
                    if(j41 != null) {
                        N4 n40 = j41.a.d;
                        if(n40 != null) {
                            k11.c0.a(n40.b.b);
                        }
                    }
                    if(k11.d0) {
                        this.h0 = h00;
                        this.c0 = atomicInteger2;
                        this.d0 = null;
                        this.e0 = null;
                        this.f0 = null;
                        this.g0 = 3;
                        object7 = k11.e0.e(this);
                        if(object7 == object1) {
                            return object1;
                        }
                        h01 = h00;
                        goto label_124;
                    }
                    else {
                        atomicInteger3 = atomicInteger2;
                        h01 = h00;
                    }
                    goto label_133;
                }
                catch(Throwable throwable0) {
                    atomicInteger1 = atomicInteger2;
                }
                h01 = h00;
                goto label_129;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        atomicInteger1 = (AtomicInteger)this.c0;
        h01 = (h0)this.h0;
        try {
            f.b0(object0);
            atomicInteger2 = atomicInteger1;
            object7 = object0;
        }
        catch(Throwable throwable0) {
            goto label_129;
        }
        try {
        label_124:
            ((d)object7).Y(UNIT.X);
            atomicInteger3 = atomicInteger2;
            goto label_133;
        }
        catch(Throwable throwable0) {
            atomicInteger1 = atomicInteger2;
        }
        do {
        label_129:
            Object object8 = ((B0)h01).getValue();
            ((Boolean)object8).getClass();
        }
        while(!((B0)h01).j(object8, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_133:
            Object object9 = ((B0)h01).getValue();
            ((Boolean)object9).getClass();
        }
        while(!((B0)h01).j(object9, Boolean.valueOf(atomicInteger3.decrementAndGet() > 0)));
        return t.a;
    }
}

