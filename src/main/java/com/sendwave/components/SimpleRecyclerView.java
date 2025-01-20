package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import h9.b;

public final class SimpleRecyclerView extends RecyclerView {
    public SimpleRecyclerView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attrs");
        super(context0, attributeSet0);
        DefensiveLinearLayoutManager defensiveLinearLayoutManager0 = new DefensiveLinearLayoutManager(1);  // initializer: Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V
        this.setLayoutManager(defensiveLinearLayoutManager0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, b.e);
        j.e(typedArray0, "obtainStyledAttributes(...)");
        defensiveLinearLayoutManager0.Z0(typedArray0.getInt(1, defensiveLinearLayoutManager0.p));
        typedArray0.recycle();
    }
}

