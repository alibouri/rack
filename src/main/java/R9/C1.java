package R9;

import Ab.t;
import Fb.j;
import W5.f;
import com.sendwave.models.CurrencyAmount;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import q9.M0;
import q9.r1;

public final class c1 extends j implements Function3 {
    public final int c0;
    public CurrencyAmount d0;
    public CurrencyAmount e0;

    public c1(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.c0 != 0) {
            c1 c10 = new c1(3, ((g)object2), 1);
            c10.d0 = (CurrencyAmount)object0;
            c10.e0 = (CurrencyAmount)object1;
            return c10.v(t.a);
        }
        c1 c11 = new c1(3, ((g)object2), 0);
        c11.d0 = (CurrencyAmount)object0;
        c11.e0 = (CurrencyAmount)object1;
        return c11.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        if(this.c0 != 0) {
            f.b0(object0);
            return M0.a(this.d0.j(this.e0));
        }
        f.b0(object0);
        CurrencyAmount currencyAmount0 = this.d0;
        return this.e0.b(currencyAmount0) <= 0 ? null : r1.d(0x7F12016B, new Object[]{currencyAmount0});  // string:error_insufficient_balance "Insufficient balance. Your balance is %s"
    }
}

