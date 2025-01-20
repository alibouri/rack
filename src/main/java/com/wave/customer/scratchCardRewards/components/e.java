package com.wave.customer.scratchCardRewards.components;

import Ab.t;
import C.c;
import Nb.j;
import U.p;

public final class e implements Mb.e {
    public final RewardsPathState X;

    public e(RewardsPathState rewardsPathState0) {
        this.X = rewardsPathState0;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        j.f(((c)object0), "$this$items");
        if((v1 & 0x30) == 0) {
            v1 |= (((p)object2).d(v) ? 0x20 : 16);
        }
        if((v1 & 0x91) == 0x90 && ((p)object2).x()) {
            ((p)object2).K();
            return t.a;
        }
        int v2 = this.X.X + v + 1;
        Reward rewardsPathState$Reward0 = (Reward)this.X.b0.get(v2);
        if(rewardsPathState$Reward0 != null) {
            ((p)object2).Q(0xFACA1867);
            g.v(rewardsPathState$Reward0, ((p)object2), 0);
            ((p)object2).p(false);
            return t.a;
        }
        ((p)object2).Q(-87347570);
        g.j(v2, ((p)object2), 0);
        ((p)object2).p(false);
        return t.a;
    }
}

