package com.wave.customer.scratchCardRewards.components;

import Ab.t;
import C.c;
import Nb.j;
import U.p;
import kotlin.jvm.functions.Function3;

public final class d implements Function3 {
    public final RewardsPathState X;
    public final Reward Y;

    public d(RewardsPathState rewardsPathState0, Reward rewardsPathState$Reward0) {
        this.X = rewardsPathState0;
        this.Y = rewardsPathState$Reward0;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((c)object0), "$this$item");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        g.d(this.X.X, this.Y, ((p)object1), 0);
        return t.a;
    }
}

