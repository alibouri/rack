package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p2.D;

public final class f extends D {
    public final j a;

    public f(j j0) {
        this.a = j0;
        t.c(null);
        t.c(null);
    }

    @Override  // p2.D
    public final void g(Canvas canvas0, RecyclerView recyclerView0) {
        if(recyclerView0.getAdapter() instanceof v && recyclerView0.getLayoutManager() instanceof GridLayoutManager) {
            v v0 = (v)recyclerView0.getAdapter();
            GridLayoutManager gridLayoutManager0 = (GridLayoutManager)recyclerView0.getLayoutManager();
            this.a.getClass();
            throw null;
        }
    }
}

