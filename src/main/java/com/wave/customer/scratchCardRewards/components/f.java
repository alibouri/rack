package com.wave.customer.scratchCardRewards.components;

import Ab.t;
import B.v;
import Nb.j;
import U.p;
import androidx.compose.ui.Modifier;
import g0.l;
import kotlin.jvm.functions.Function3;

public final class f implements Function3 {
    public final Reward X;

    public f(Reward rewardsPathState$Reward0) {
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
        Modifier modifier0 = N4.j.g(l.X, 0.6f);
        g.p(this.X, modifier0, 0.0f, true, ((p)object1), 0xC30, 4);
        return t.a;
    }
}

