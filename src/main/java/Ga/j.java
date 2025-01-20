package ga;

import Ab.t;
import Bb.p;
import Bb.r;
import W5.f;
import Y8.m2;
import a9.Y1;
import a9.Z1;
import a9.a2;
import com.sendwave.backend.fragment.DealDetailFragment;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j extends Fb.j implements Function2 {
    public Object c0;

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((m2)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        DealDetailFragment dealDetailFragment0 = (DealDetailFragment)((m2)this.c0).a;
        String s = dealDetailFragment0.d;
        ArrayList arrayList0 = new ArrayList(r.b0(dealDetailFragment0.e));
        for(Object object1: dealDetailFragment0.e) {
            arrayList0.add(new e(((a2)object1).b, ((a2)object1).a));
        }
        Y1 y10 = (Y1)p.q0(dealDetailFragment0.f);
        if(y10 != null) {
            Z1 z10 = y10.b;
            if(z10 != null) {
                d d0 = new d(z10.a, z10.b);
                return new ga.f(dealDetailFragment0.c, s, dealDetailFragment0.b, arrayList0, d0);
            }
        }
        return new ga.f(dealDetailFragment0.c, s, dealDetailFragment0.b, arrayList0, null);
    }
}

