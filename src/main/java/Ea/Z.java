package Ea;

import Aa.q;
import Ab.t;
import Nb.h;
import U.l;
import U.p;
import a.a;
import c0.c;
import com.wave.customer.scratchCardRewards.RewardsPathDetailsActivity;
import com.wave.customer.scratchCardRewards.RewardsPathDetailsParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class z implements Function2 {
    public final int X;
    public final RewardsPathDetailsParams Y;
    public final RewardsPathDetailsActivity Z;

    public z(RewardsPathDetailsParams rewardsPathDetailsParams0, RewardsPathDetailsActivity rewardsPathDetailsActivity0, int v) {
        this.X = v;
        this.Y = rewardsPathDetailsParams0;
        this.Z = rewardsPathDetailsActivity0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                ((p)object0).K();
                return t.a;
            }
            a.g(c.c(0x3E34205, new z(this.Y, this.Z, 0), ((p)object0)), ((p)object0), 6);
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        RewardsPathDetailsParams rewardsPathDetailsParams0 = this.Y;
        ((p)object0).Q(-448090206);
        RewardsPathDetailsActivity rewardsPathDetailsActivity0 = this.Z;
        boolean z = ((p)object0).f(rewardsPathDetailsActivity0);
        Object object2 = ((p)object0).G();
        if(z || object2 == l.a) {
            q q0 = new q(0, rewardsPathDetailsActivity0, RewardsPathDetailsActivity.class, "onBackPressed", "onBackPressed()V", 0, 22);
            ((p)object0).a0(q0);
            object2 = q0;
        }
        ((p)object0).p(false);
        J.g(rewardsPathDetailsParams0.X, ((Function0)(((h)object2))), ((p)object0), 0);
        return t.a;
    }
}

