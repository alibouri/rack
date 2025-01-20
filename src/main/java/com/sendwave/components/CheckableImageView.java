package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;

public final class CheckableImageView extends AppCompatImageView implements Checkable {
    public boolean e0;
    public static final int[] f0;

    static {
        CheckableImageView.f0 = new int[]{0x10100A0};
    }

    public CheckableImageView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return this.e0;
    }

    @Override  // android.widget.ImageView
    public final int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.e0) {
            View.mergeDrawableStates(arr_v, CheckableImageView.f0);
        }
        j.c(arr_v);
        return arr_v;
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.e0 == z) {
            return;
        }
        this.e0 = z;
        this.refreshDrawableState();
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        this.setChecked(!this.e0);
    }
}

