package f9;

import Ab.t;
import Fb.j;
import Mb.g;
import W5.f;
import com.sendwave.backend.fragment.LimitFragment;
import com.sendwave.models.CurrencyAmount;
import q9.M0;
import q9.r1;
import v7.d;

public final class m0 extends j implements g {
    public T c0;
    public LimitFragment d0;
    public boolean e0;
    public Integer f0;
    public CurrencyAmount g0;

    public m0(kotlin.coroutines.g g0) {
        super(6, g0);
    }

    @Override  // Mb.g
    public final Object f(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        m0 m00 = new m0(((kotlin.coroutines.g)object5));
        m00.c0 = (T)object0;
        m00.d0 = (LimitFragment)object1;
        m00.e0 = ((Boolean)object2).booleanValue();
        m00.f0 = (Integer)object3;
        m00.g0 = (CurrencyAmount)object4;
        return m00.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        T t0 = this.c0;
        boolean z = this.e0;
        Integer integer0 = this.f0;
        String s = d.q(a.f0, t0.a, this.d0, false, this.g0, 4);
        if(s != null) {
            return new P(s, z, O.Y, integer0);
        }
        String s1 = t0.b.f() ? null : r1.d(0x7F12015A, new Object[]{M0.a(t0.b)});  // string:error_amount_must_be_positive "Amount must be more than zero"
        return s1 != null ? new P(s1, z, O.X, integer0) : new Q(t0);
    }
}

