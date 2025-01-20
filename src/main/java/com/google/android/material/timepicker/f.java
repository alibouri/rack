package com.google.android.material.timepicker;

import H6.g;
import H6.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.HashMap;
import p6.a;
import r1.h;

public abstract class f extends ConstraintLayout {
    public final e r0;
    public int s0;
    public final MaterialShapeDrawable t0;

    public f(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F0402C8);  // attr:materialClockStyle
        LayoutInflater.from(context0).inflate(0x7F0D0079, this);  // layout:material_radial_view_group
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        this.t0 = materialShapeDrawable0;
        g g0 = new g(0.5f);
        i i0 = materialShapeDrawable0.X.a.e();
        i0.e = g0;
        i0.f = g0;
        i0.g = g0;
        i0.h = g0;
        materialShapeDrawable0.setShapeAppearanceModel(i0.a());
        ColorStateList colorStateList0 = ColorStateList.valueOf(-1);
        this.t0.j(colorStateList0);
        this.setBackground(this.t0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.y, 0x7F0402C8, 0);  // attr:materialClockStyle
        this.s0 = typedArray0.getDimensionPixelSize(0, 0);
        this.r0 = new e(this);
        typedArray0.recycle();
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(view0.getId() == -1) {
            view0.setId(View.generateViewId());
        }
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.r0);
            handler0.post(this.r0);
        }
    }

    public final void l() {
        int v = this.getChildCount();
        int v1 = 1;
        for(int v3 = 0; v3 < v; ++v3) {
            if("skip".equals(this.getChildAt(v3).getTag())) {
                ++v1;
            }
        }
        ConstraintSet constraintSet0 = new ConstraintSet();
        constraintSet0.b(this);
        float f = 0.0f;
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getId() != 0x7F0A00CF && !"skip".equals(view0.getTag())) {  // id:circle_center
                int v4 = view0.getId();
                int v5 = this.s0;
                HashMap hashMap0 = constraintSet0.c;
                if(!hashMap0.containsKey(v4)) {
                    hashMap0.put(v4, new h());
                }
                r1.i i0 = ((h)hashMap0.get(v4)).d;
                i0.z = 0x7F0A00CF;  // id:circle_center
                i0.A = v5;
                i0.B = f;
                f = 360.0f / ((float)(v - v1)) + f;
            }
        }
        constraintSet0.a(this);
        this.setConstraintSet(null);
        this.requestLayout();
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.l();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public final void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.r0);
            handler0.post(this.r0);
        }
    }

    @Override  // android.view.View
    public final void setBackgroundColor(int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        this.t0.j(colorStateList0);
    }
}

