package Ea;

import Ab.t;
import U.p;
import com.wave.customer.scratchCardRewards.ScratchCard.Award.CashAward;
import com.wave.customer.scratchCardRewards.ScratchCard.Award.CustomAward;
import com.wave.customer.scratchCardRewards.ScratchCard.Award.Known;
import com.wave.customer.scratchCardRewards.d;
import kotlin.jvm.functions.Function2;

public final class x implements Function2 {
    public final int X;
    public final ScratchCard.Award.Known Y;

    public x(ScratchCard.Award.Known scratchCard$Award$Known0, int v) {
        this.X = v;
        this.Y = scratchCard$Award$Known0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                d.f(((ScratchCard.Award.CustomAward)this.Y), ((p)object0), 0);
                return t.a;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                d.g(((ScratchCard.Award.CashAward)this.Y).X, ((p)object0), 0);
                return t.a;
            }
            default: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                d.d(((ScratchCard.Award.CashAward)this.Y).X, ((p)object0), 0);
                return t.a;
            }
        }
    }
}

