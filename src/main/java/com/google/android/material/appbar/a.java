package com.google.android.material.appbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final BaseBehavior c;

    public a(BaseBehavior appBarLayout$BaseBehavior0, CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
        this.c = appBarLayout$BaseBehavior0;
        this.a = coordinatorLayout0;
        this.b = appBarLayout0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
        this.c.v(this.a, this.b, v, 0x80000000, 0x7FFFFFFF);
    }
}

