package c2;

import Nb.j;
import android.animation.AnimatorSet;

public final class h {
    public static final h a;

    static {
        h.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final long a(AnimatorSet animatorSet0) {
        j.f(animatorSet0, "animatorSet");
        return animatorSet0.getTotalDuration();
    }
}

