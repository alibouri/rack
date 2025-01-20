package c2;

import Nb.j;
import android.animation.AnimatorSet;

public final class i {
    public static final i a;

    static {
        i.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(AnimatorSet animatorSet0) {
        j.f(animatorSet0, "animatorSet");
        animatorSet0.reverse();
    }

    public final void b(AnimatorSet animatorSet0, long v) {
        j.f(animatorSet0, "animatorSet");
        animatorSet0.setCurrentPlayTime(v);
    }
}

