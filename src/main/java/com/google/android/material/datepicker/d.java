package com.google.android.material.datepicker;

import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class d extends LinearLayoutManager {
    public final int E;
    public final j F;

    public d(j j0, int v, int v1) {
        this.F = j0;
        this.E = v1;
        super(v);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(RecyclerView recyclerView0, int v) {
        r r0 = new r(recyclerView0.getContext());  // initializer: Landroidx/recyclerview/widget/l;-><init>(Landroid/content/Context;)V
        r0.a = v;
        this.x0(r0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(F f0, int[] arr_v) {
        j j0 = this.F;
        if(this.E == 0) {
            arr_v[0] = j0.e1.getWidth();
            arr_v[1] = j0.e1.getWidth();
            return;
        }
        arr_v[0] = j0.e1.getHeight();
        arr_v[1] = j0.e1.getHeight();
    }
}

