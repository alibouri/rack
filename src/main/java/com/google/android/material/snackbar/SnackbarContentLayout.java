package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p6.a;

public class SnackbarContentLayout extends LinearLayout {
    public TextView b0;
    public Button c0;
    public final int d0;
    public int e0;

    public SnackbarContentLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.B);
        this.d0 = typedArray0.getDimensionPixelSize(0, -1);
        this.e0 = typedArray0.getDimensionPixelSize(7, -1);
        typedArray0.recycle();
    }

    public final boolean a(int v, int v1, int v2) {
        boolean z;
        if(v == this.getOrientation()) {
            z = false;
        }
        else {
            this.setOrientation(v);
            z = true;
        }
        if(this.b0.getPaddingTop() == v1 && this.b0.getPaddingBottom() == v2) {
            return z;
        }
        TextView textView0 = this.b0;
        if(textView0.isPaddingRelative()) {
            textView0.setPaddingRelative(textView0.getPaddingStart(), v1, textView0.getPaddingEnd(), v2);
            return true;
        }
        textView0.setPadding(textView0.getPaddingLeft(), v1, textView0.getPaddingRight(), v2);
        return true;
    }

    public Button getActionView() {
        return this.c0;
    }

    public TextView getMessageView() {
        return this.b0;
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b0 = (TextView)this.findViewById(0x7F0A02B0);  // id:snackbar_text
        this.c0 = (Button)this.findViewById(0x7F0A02AF);  // id:snackbar_action
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.d0;
        if(v2 > 0 && this.getMeasuredWidth() > v2) {
            v = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
            super.onMeasure(v, v1);
        }
        int v3 = this.getResources().getDimensionPixelSize(0x7F07009F);  // dimen:design_snackbar_padding_vertical_2lines
        int v4 = this.getResources().getDimensionPixelSize(0x7F07009E);  // dimen:design_snackbar_padding_vertical
        boolean z = this.b0.getLayout().getLineCount() > 1;
        if(!z || this.e0 <= 0 || this.c0.getMeasuredWidth() <= this.e0) {
            if(!z) {
                v3 = v4;
            }
            if(this.a(0, v3, v3)) {
                super.onMeasure(v, v1);
            }
        }
        else if(this.a(1, v3, v3 - v4)) {
            super.onMeasure(v, v1);
        }
    }

    public void setMaxInlineActionWidth(int v) {
        this.e0 = v;
    }
}

