package com.wave.customer.scratchCardRewards.components;

import Ab.t;
import U.p;
import kotlin.jvm.functions.Function2;
import yc.d;

public final class b implements Function2 {
    public final Reward X;

    public b(Reward rewardsPathState$Reward0) {
        this.X = rewardsPathState$Reward0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        g.p(this.X, null, 0.0f, false, ((p)object0), 0, 14);
        g.h(d.h(0x7F0600D1, ((p)object0)), 0L, ((p)object0), 0);  // color:highlight_pink
        return t.a;
    }
}

