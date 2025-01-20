package com.wave.customer.scratchCardRewards.components;

import Ab.t;
import Mb.e;
import Nb.j;
import U.p;

public final class c implements e {
    public final RewardsPathState X;

    public c(RewardsPathState rewardsPathState0) {
        this.X = rewardsPathState0;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        j.f(((C.c)object0), "$this$items");
        if((v1 & 0x30) == 0) {
            v1 |= (((p)object2).d(v) ? 0x20 : 16);
        }
        if((v1 & 0x91) == 0x90 && ((p)object2).x()) {
            ((p)object2).K();
            return t.a;
        }
        Reward rewardsPathState$Reward0 = (Reward)this.X.Z.get(((int)(v + 1)));
        if(rewardsPathState$Reward0 != null) {
            ((p)object2).Q(0xFABE05F8);
            g.a(v + 1, rewardsPathState$Reward0, ((p)object2), 0);
            ((p)object2).p(false);
            return t.a;
        }
        ((p)object2).Q(0xFABF5566);
        g.b(v + 1, ((p)object2), 0);
        ((p)object2).p(false);
        return t.a;
    }
}

