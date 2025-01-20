package Ea;

import Ab.t;
import N4.h;
import U.d;
import U.p;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.scratchCardRewards.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class k0 implements Function2 {
    public final int X;
    public final float Y;
    public final int Z;
    public final Object b0;

    public k0(float f, CurrencyAmount currencyAmount0, int v) {
        this.X = 0;
        super();
        this.Y = f;
        this.b0 = currencyAmount0;
        this.Z = v;
    }

    public k0(Function0 function00, float f, int v) {
        this.X = 1;
        super();
        this.b0 = function00;
        this.Y = f;
        this.Z = v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            ((Integer)object1).getClass();
            h.d(((Function0)this.b0), this.Y, ((p)object0), d.O(this.Z | 1));
            return t.a;
        }
        j.h(this.Y, ((CurrencyAmount)this.b0), ((p)object0), d.O(this.Z | 1));
        return t.a;
    }
}

