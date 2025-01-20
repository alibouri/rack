package com.google.android.material.snackbar;

import I6.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;

public final class Snackbar.SnackbarLayout extends b {
    public Snackbar.SnackbarLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // android.widget.FrameLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getChildCount();
        int v3 = this.getMeasuredWidth();
        int v4 = this.getPaddingLeft();
        int v5 = this.getPaddingRight();
        for(int v6 = 0; v6 < v2; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getLayoutParams().width == -1) {
                view0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v4 - v5, 0x40000000), View.MeasureSpec.makeMeasureSpec(view0.getMeasuredHeight(), 0x40000000));
            }
        }
    }

    @Override  // I6.b
    public void setBackground(Drawable drawable0) {
        super.setBackground(drawable0);
    }

    @Override  // I6.b
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // I6.b
    public void setBackgroundTintList(ColorStateList colorStateList0) {
        super.setBackgroundTintList(colorStateList0);
    }

    @Override  // I6.b
    public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        super.setBackgroundTintMode(porterDuff$Mode0);
    }

    @Override  // I6.b
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
    }
}

