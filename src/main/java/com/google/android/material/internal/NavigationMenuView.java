package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n.j;
import n.w;

public class NavigationMenuView extends RecyclerView implements w {
    public NavigationMenuView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        this.setLayoutManager(new LinearLayoutManager(1));
    }

    @Override  // n.w
    public final void d(j j0) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}

