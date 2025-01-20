package com.google.android.material.appbar;

import K1.n;
import android.view.View;

public final class c implements n {
    public final AppBarLayout X;
    public final boolean Y;

    public c(AppBarLayout appBarLayout0, boolean z) {
        this.X = appBarLayout0;
        this.Y = z;
    }

    @Override  // K1.n
    public final boolean c(View view0) {
        this.X.setExpanded(this.Y);
        return true;
    }
}

