package com.wave.customer.scratchCardRewards.components;

import Ab.t;
import B.v;
import Nb.j;
import U.p;
import kotlin.jvm.functions.Function3;
import yc.d;

public final class a implements Function3 {
    public final Reward X;

    public a(Reward rewardsPathState$Reward0) {
        this.X = rewardsPathState$Reward0;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((v)object0), "$this$PathComponent");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        g.p(this.X, null, 0.0f, false, ((p)object1), 0, 14);
        g.h(d.h(0x7F060173, ((p)object1)), 0L, ((p)object1), 0);  // color:rewards_blue
        return t.a;
    }
}

