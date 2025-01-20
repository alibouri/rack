package com.google.android.material.textview;

import Bb.q;
import L6.a;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.N;

public class MaterialTextView extends N {
    public MaterialTextView(Context context0, AttributeSet attributeSet0) {
        super(a.a(context0, attributeSet0, 0x1010084, 0), attributeSet0, 0x1010084);
        Context context1 = this.getContext();
        TypedValue typedValue0 = q.W(context1, 0x7F040409);  // attr:textAppearanceLineHeightEnabled
        if(typedValue0 == null || typedValue0.type != 18 || typedValue0.data != 0) {
            Resources.Theme resources$Theme0 = context1.getTheme();
            int[] arr_v = p6.a.w;
            TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v, 0x1010084, 0);
            int v = MaterialTextView.r(context1, typedArray0, new int[]{1, 2});
            typedArray0.recycle();
            if(v == -1) {
                TypedArray typedArray1 = resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v, 0x1010084, 0);
                int v1 = typedArray1.getResourceId(0, -1);
                typedArray1.recycle();
                if(v1 != -1) {
                    TypedArray typedArray2 = resources$Theme0.obtainStyledAttributes(v1, p6.a.v);
                    int v2 = MaterialTextView.r(this.getContext(), typedArray2, new int[]{1, 2});
                    typedArray2.recycle();
                    if(v2 >= 0) {
                        this.setLineHeight(v2);
                    }
                }
            }
        }
    }

    public static int r(Context context0, TypedArray typedArray0, int[] arr_v) {
        int v = -1;
        for(int v1 = 0; v1 < arr_v.length && v < 0; ++v1) {
            int v2 = arr_v[v1];
            TypedValue typedValue0 = new TypedValue();
            if(!typedArray0.getValue(v2, typedValue0) || typedValue0.type != 2) {
                v = typedArray0.getDimensionPixelSize(v2, -1);
            }
            else {
                TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(new int[]{typedValue0.data});
                int v3 = typedArray1.getDimensionPixelSize(0, -1);
                typedArray1.recycle();
                v = v3;
            }
        }
        return v;
    }

    @Override  // o.N
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        TypedValue typedValue0 = q.W(context0, 0x7F040409);  // attr:textAppearanceLineHeightEnabled
        if(typedValue0 == null || typedValue0.type != 18 || typedValue0.data != 0) {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(v, p6.a.v);
            int v1 = MaterialTextView.r(this.getContext(), typedArray0, new int[]{1, 2});
            typedArray0.recycle();
            if(v1 >= 0) {
                this.setLineHeight(v1);
            }
        }
    }
}

