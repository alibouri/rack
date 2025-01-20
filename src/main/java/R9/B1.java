package R9;

import Ab.t;
import Fb.j;
import W5.f;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import java.math.BigDecimal;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import q9.M0;

public final class b1 extends j implements Function3 {
    public final int c0;
    public Currency d0;
    public BigDecimal e0;

    public b1(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.c0 != 0) {
            b1 b10 = new b1(3, ((g)object2), 1);
            b10.d0 = (Currency)object0;
            b10.e0 = (BigDecimal)object1;
            return b10.v(t.a);
        }
        b1 b11 = new b1(3, ((g)object2), 0);
        b11.d0 = (Currency)object0;
        b11.e0 = (BigDecimal)object1;
        return b11.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        if(this.c0 != 0) {
            f.b0(object0);
            return new CurrencyAmount(this.d0, this.e0);
        }
        f.b0(object0);
        BigDecimal bigDecimal0 = this.e0;
        return M0.d(this.d0).format(bigDecimal0);
    }
}

