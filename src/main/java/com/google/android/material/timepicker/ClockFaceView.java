package com.google.android.material.timepicker;

import Bb.F;
import Bb.q;
import I5.h;
import J1.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import p6.a;

class ClockFaceView extends f implements d {
    public final float[] A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final String[] F0;
    public float G0;
    public final ColorStateList H0;
    public final ClockHandView u0;
    public final Rect v0;
    public final RectF w0;
    public final SparseArray x0;
    public final c y0;
    public final int[] z0;

    public ClockFaceView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.v0 = new Rect();
        this.w0 = new RectF();
        SparseArray sparseArray0 = new SparseArray();
        this.x0 = sparseArray0;
        this.A0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.g, 0x7F0402C8, 0x7F130344);  // attr:materialClockStyle
        Resources resources0 = this.getResources();
        ColorStateList colorStateList0 = F.w(context0, typedArray0, 1);
        this.H0 = colorStateList0;
        LayoutInflater.from(context0).inflate(0x7F0D0078, this, true);  // layout:material_clockface_view
        ClockHandView clockHandView0 = (ClockHandView)this.findViewById(0x7F0A01C3);  // id:material_clock_hand
        this.u0 = clockHandView0;
        this.B0 = resources0.getDimensionPixelSize(0x7F0700E6);  // dimen:material_clock_hand_padding
        int v = colorStateList0.getDefaultColor();
        int v1 = colorStateList0.getColorForState(new int[]{0x10100A1}, v);
        this.z0 = new int[]{v1, v1, colorStateList0.getDefaultColor()};
        clockHandView0.b0.add(this);
        int v2 = q.t(context0, 0x7F060127).getDefaultColor();  // color:material_timepicker_clockface
        ColorStateList colorStateList1 = F.w(context0, typedArray0, 0);
        if(colorStateList1 != null) {
            v2 = colorStateList1.getDefaultColor();
        }
        this.setBackgroundColor(v2);
        this.getViewTreeObserver().addOnPreDrawListener(new b(this));
        this.setFocusable(true);
        typedArray0.recycle();
        this.y0 = new c(this);
        String[] arr_s = new String[12];
        Arrays.fill(arr_s, "");
        this.F0 = arr_s;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        int v3 = sparseArray0.size();
        for(int v4 = 0; v4 < Math.max(this.F0.length, v3); ++v4) {
            TextView textView0 = (TextView)sparseArray0.get(v4);
            if(v4 >= this.F0.length) {
                this.removeView(textView0);
                sparseArray0.remove(v4);
            }
            else {
                if(textView0 == null) {
                    textView0 = (TextView)layoutInflater0.inflate(0x7F0D0077, this, false);  // layout:material_clockface_textview
                    sparseArray0.put(v4, textView0);
                    this.addView(textView0);
                }
                textView0.setVisibility(0);
                textView0.setText(this.F0[v4]);
                textView0.setTag(0x7F0A01D3, v4);  // id:material_value_index
                N.k(textView0, this.y0);
                textView0.setTextColor(this.H0);
            }
        }
        this.C0 = resources0.getDimensionPixelSize(0x7F070102);  // dimen:material_time_picker_minimum_screen_height
        this.D0 = resources0.getDimensionPixelSize(0x7F070103);  // dimen:material_time_picker_minimum_screen_width
        this.E0 = resources0.getDimensionPixelSize(0x7F0700EC);  // dimen:material_clock_size
    }

    public final void m() {
        RectF rectF0 = this.u0.f0;
        for(int v = 0; true; ++v) {
            SparseArray sparseArray0 = this.x0;
            if(v >= sparseArray0.size()) {
                break;
            }
            TextView textView0 = (TextView)sparseArray0.get(v);
            if(textView0 != null) {
                textView0.getDrawingRect(this.v0);
                int v1 = textView0.getPaddingLeft();
                int v2 = textView0.getPaddingTop();
                this.v0.offset(v1, v2);
                this.offsetDescendantRectToMyCoords(textView0, this.v0);
                this.w0.set(this.v0);
                RadialGradient radialGradient0 = RectF.intersects(rectF0, this.w0) ? new RadialGradient(rectF0.centerX() - this.w0.left, rectF0.centerY() - this.w0.top, 0.5f * rectF0.width(), this.z0, this.A0, Shader.TileMode.CLAMP) : null;
                textView0.getPaint().setShader(radialGradient0);
                textView0.invalidate();
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setCollectionInfo(((AccessibilityNodeInfo.CollectionInfo)h.r(1, this.F0.length, 1).Y));
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.m();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public final void onMeasure(int v, int v1) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v2 = (int)(((float)this.E0) / Math.max(Math.max(((float)this.C0) / ((float)displayMetrics0.heightPixels), ((float)this.D0) / ((float)displayMetrics0.widthPixels)), 1.0f));
        int v3 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        this.setMeasuredDimension(v2, v2);
        super.onMeasure(v3, v3);
    }
}

