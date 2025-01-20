package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.AppCompatEditText;
import h9.b;

public final class CodeEntryEditText extends AppCompatEditText {
    public float h0;
    public float i0;
    public float j0;
    public int k0;
    public String l0;
    public final float m0;
    public final Paint n0;

    public CodeEntryEditText(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.h0 = 10.0f;
        this.i0 = 18.0f;
        this.j0 = 8.0f;
        this.k0 = 4;
        this.m0 = 1.5f;
        Paint paint0 = new Paint();
        this.n0 = paint0;
        this.setBackgroundResource(0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, b.a);
        j.e(typedArray0, "obtainStyledAttributes(...)");
        try {
            this.k0 = typedArray0.getInteger(0, this.k0);
            this.l0 = typedArray0.getString(1);
        }
        finally {
            typedArray0.recycle();
        }
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.h0 *= displayMetrics0.density;
        this.j0 *= displayMetrics0.density;
        float f = this.m0 * displayMetrics0.density;
        this.m0 = f;
        paint0.setStrokeWidth(f);
        paint0.setColor(0xFFCCCCCC);
        this.setShowSoftInputOnFocus(false);
    }

    public final int getCodeLength() {
        return this.k0;
    }

    public final String getCodeSeparator() {
        return this.l0;
    }

    public final float getMCharSize() {
        return this.i0;
    }

    public final float getMLineSpacing() {
        return this.j0;
    }

    public final float getMSpace() {
        return this.h0;
    }

    @Override  // android.widget.TextView
    public final void onDraw(Canvas canvas0) {
        float f3;
        float f;
        int v1;
        j.f(canvas0, "canvas");
        int v = this.getWidth() - this.getPaddingRight() - this.getPaddingLeft();
        if(this.l0 == null) {
            v1 = this.k0;
            f = ((float)v) - this.h0 * ((float)(v1 - 1));
        }
        else {
            f = ((float)v) - this.h0 * ((float)this.k0);
            v1 = this.k0 + 1;
        }
        this.i0 = f / ((float)v1);
        float f1 = (float)this.getPaddingLeft();
        int v2 = this.getHeight();
        int v3 = this.getPaddingBottom();
        Editable editable0 = this.getText();
        if(editable0 != null) {
            int v4 = editable0.length();
            float[] arr_f = new float[this.k0];
            this.getPaint().getTextWidths(this.getText(), 0, v4, arr_f);
            int v5 = this.k0;
            for(int v6 = 0; v6 < v5; ++v6) {
                float f2 = (float)(v2 - v3);
                canvas0.drawLine(f1, f2, f1 + this.i0, f2, this.n0);
                if(editable0.length() > v6) {
                    f3 = f2;
                    canvas0.drawText(editable0, v6, v6 + 1, this.i0 / 2.0f + f1 - arr_f[0] / 2.0f, f2 - this.j0, this.getPaint());
                }
                else {
                    f3 = f2;
                }
                String s = this.l0;
                if(s != null && v6 == this.k0 / 2 - 1) {
                    f1 += this.h0 + this.i0;
                    float f4 = this.i0 / 2.0f + f1;
                    j.c(s);
                    String s1 = this.l0;
                    j.c(s1);
                    canvas0.drawText(s, 0, s1.length(), f4 - this.getPaint().measureText(this.l0) / 2.0f, f3 - this.j0, this.getPaint());
                }
                f1 += (this.h0 < 0.0f ? this.i0 * 2.0f : this.h0 + this.i0);
            }
        }
    }

    public final void setCodeLength(int v) {
        this.k0 = v;
    }

    public final void setCodeSeparator(String s) {
        this.l0 = s;
    }

    public final void setMCharSize(float f) {
        this.i0 = f;
    }

    public final void setMLineSpacing(float f) {
        this.j0 = f;
    }

    public final void setMSpace(float f) {
        this.h0 = f;
    }
}

