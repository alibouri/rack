package k;

import N4.h;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

public final class c extends h {
    public final ObjectAnimator a;
    public final boolean b;

    public c(AnimationDrawable animationDrawable0, boolean z, boolean z1) {
        int v = animationDrawable0.getNumberOfFrames();
        d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
        int v2 = animationDrawable0.getNumberOfFrames();
        d0.b = v2;
        if(d0.a == null || d0.a.length < v2) {
            d0.a = new int[v2];
        }
        int[] arr_v = d0.a;
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            int v4 = animationDrawable0.getDuration((z ? v2 - v1 - 1 : v1));
            arr_v[v1] = v4;
            v3 += v4;
        }
        d0.c = v3;
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(animationDrawable0, "currentIndex", new int[]{(z ? v - 1 : 0), (z ? 0 : v - 1)});
        objectAnimator0.setAutoCancel(true);
        objectAnimator0.setDuration(((long)d0.c));
        objectAnimator0.setInterpolator(d0);
        this.b = z1;
        this.a = objectAnimator0;
    }

    @Override  // N4.h
    public final void I() {
        this.a.reverse();
    }

    @Override  // N4.h
    public final void L() {
        this.a.start();
    }

    @Override  // N4.h
    public final void M() {
        this.a.cancel();
    }

    @Override  // N4.h
    public final boolean l() {
        return this.b;
    }
}

