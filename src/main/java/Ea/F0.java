package Ea;

import Aa.p;
import Nb.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class f0 {
    public final Function0 a;
    public final Function1 b;
    public final Function1 c;
    public final Function0 d;
    public final Function1 e;
    public final Function0 f;
    public static final int g;

    static {
        new f0(new e0(0), new p(5), new p(6), new e0(0), new p(7), new e0(0));
    }

    public f0(Function0 function00, Function1 function10, Function1 function11, Function0 function01, Function1 function12, Function0 function02) {
        j.f(function00, "onNavigationUpClick");
        j.f(function10, "onUnlockedCardClicked");
        j.f(function11, "onFocusableCardClicked");
        j.f(function01, "onFocusableCardDismissed");
        j.f(function12, "onRewardsPathClicked");
        j.f(function02, "onPullToRefresh");
        super();
        this.a = function00;
        this.b = function10;
        this.c = function11;
        this.d = function01;
        this.e = function12;
        this.f = function02;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f0)) {
            return false;
        }
        if(!j.a(this.a, ((f0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((f0)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((f0)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((f0)object0).d)) {
            return false;
        }
        return j.a(this.e, ((f0)object0).e) ? j.a(this.f, ((f0)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "ScratchCardRewardsScreenCallbacks(onNavigationUpClick=" + this.a + ", onUnlockedCardClicked=" + this.b + ", onFocusableCardClicked=" + this.c + ", onFocusableCardDismissed=" + this.d + ", onRewardsPathClicked=" + this.e + ", onPullToRefresh=" + this.f + ")";
    }
}

