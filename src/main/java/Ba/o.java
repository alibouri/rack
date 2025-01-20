package Ba;

import Aa.a;
import Ab.t;
import Fb.j;
import W5.f;
import ac.B0;
import com.sendwave.backend.fragment.SavingsFragment;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class o extends j implements Function2 {
    public Object c0;
    public final q d0;

    public o(q q0, g g0) {
        this.d0 = q0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((o)this.t(((SavingsFragment)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new o(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        SavingsFragment savingsFragment0 = (SavingsFragment)this.c0;
        B0 b00 = this.d0.b0;
        do {
            Object object1 = b00.getValue();
            String s = a.b(((k)object1).h, savingsFragment0.c.b.b);
        }
        while(!b00.j(object1, k.a(((k)object1), false, savingsFragment0, savingsFragment0.b.c.b.getId(), savingsFragment0.c.b.c, savingsFragment0.c.b.b, savingsFragment0.b.c.b.b, savingsFragment0.b.c.b.d, null, s, false, 640)));
        return t.a;
    }
}

