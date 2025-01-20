package com.google.android.material.appbar;

import K1.n;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b implements n {
    public final CoordinatorLayout X;
    public final AppBarLayout Y;
    public final View Z;
    public final int b0;
    public final BaseBehavior c0;

    public b(BaseBehavior appBarLayout$BaseBehavior0, CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v) {
        this.c0 = appBarLayout$BaseBehavior0;
        this.X = coordinatorLayout0;
        this.Y = appBarLayout0;
        this.Z = view0;
        this.b0 = v;
    }

    @Override  // K1.n
    public final boolean c(View view0) {
        this.c0.y(this.X, this.Y, this.Z, this.b0, new int[]{0, 0});
        return true;
    }
}

