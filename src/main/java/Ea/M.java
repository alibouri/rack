package Ea;

import Ab.t;
import U.p;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.scratchCardRewards.d;
import kotlin.jvm.functions.Function2;

public final class m implements Function2 {
    public final int X;
    public final CurrencyAmount Y;
    public final int Z;

    public m(CurrencyAmount currencyAmount0, int v, int v1) {
        this.X = v1;
        this.Y = currencyAmount0;
        this.Z = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        switch(this.X) {
            case 0: {
                d.a(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                d.d(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            default: {
                d.g(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

