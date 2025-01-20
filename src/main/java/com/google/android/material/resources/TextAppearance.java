package com.google.android.material.resources;

import Bb.F;
import E6.b;
import E6.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p6.a;
import y1.k;
import yc.d;

public final class TextAppearance {
    public final ColorStateList a;
    public final ColorStateList b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public float k;
    public final int l;
    public boolean m;
    public Typeface n;

    public TextAppearance(Context context0, int v) {
        this.m = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, a.D);
        this.k = typedArray0.getDimension(0, 0.0f);
        this.a = F.w(context0, typedArray0, 3);
        F.w(context0, typedArray0, 4);
        F.w(context0, typedArray0, 5);
        this.d = typedArray0.getInt(2, 0);
        this.e = typedArray0.getInt(1, 1);
        int v1 = typedArray0.hasValue(12) ? 12 : 10;
        this.l = typedArray0.getResourceId(v1, 0);
        this.c = typedArray0.getString(v1);
        typedArray0.getBoolean(14, false);
        this.b = F.w(context0, typedArray0, 6);
        this.f = typedArray0.getFloat(7, 0.0f);
        this.g = typedArray0.getFloat(8, 0.0f);
        this.h = typedArray0.getFloat(9, 0.0f);
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(v, a.v);
        this.i = typedArray1.hasValue(0);
        this.j = typedArray1.getFloat(0, 0.0f);
        typedArray1.recycle();
    }

    public final void a() {
        int v = this.d;
        if(this.n == null) {
            String s = this.c;
            if(s != null) {
                this.n = Typeface.create(s, v);
            }
        }
        if(this.n == null) {
            switch(this.e) {
                case 1: {
                    this.n = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    this.n = Typeface.SERIF;
                    break;
                }
                case 3: {
                    this.n = Typeface.MONOSPACE;
                    break;
                }
                default: {
                    this.n = Typeface.DEFAULT;
                }
            }
            this.n = Typeface.create(this.n, v);
        }
    }

    public final Typeface b(Context context0) {
        if(this.m) {
            return this.n;
        }
        if(!context0.isRestricted()) {
            try {
                Typeface typeface0 = context0.isRestricted() ? null : k.b(context0, this.l, new TypedValue(), 0, null, false, false);
                this.n = typeface0;
                if(typeface0 != null) {
                    this.n = Typeface.create(typeface0, this.d);
                }
                goto label_10;
            }
            catch(UnsupportedOperationException exception0) {
            }
            catch(Resources.NotFoundException | Exception unused_ex) {
                goto label_10;
            }
            Log.d("TextAppearance", "Error loading font " + this.c, exception0);
        }
    label_10:
        this.a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context0, d d0) {
        if(this.d(context0)) {
            this.b(context0);
        }
        else {
            this.a();
        }
        int v = this.l;
        if(v == 0) {
            this.m = true;
        }
        if(this.m) {
            d0.v(this.n, true);
            return;
        }
        try {
            b b0 = new b(this, d0);
            if(context0.isRestricted()) {
                b0.a(-4);
                return;
            }
            k.b(context0, v, new TypedValue(), 0, b0, false, false);
        }
        catch(Resources.NotFoundException unused_ex) {
            this.m = true;
            d0.u(1);
        }
        catch(Exception exception0) {
            Log.d("TextAppearance", "Error loading font " + this.c, exception0);
            this.m = true;
            d0.u(-3);
        }
    }

    public final boolean d(Context context0) {
        Typeface typeface0 = null;
        int v = this.l;
        if(v != 0 && !context0.isRestricted()) {
            typeface0 = k.b(context0, v, new TypedValue(), 0, null, false, true);
        }
        return typeface0 != null;
    }

    public final void e(Context context0, TextPaint textPaint0, d d0) {
        this.f(context0, textPaint0, d0);
        textPaint0.setColor((this.a == null ? 0xFF000000 : this.a.getColorForState(textPaint0.drawableState, this.a.getDefaultColor())));
        int v = this.b == null ? 0 : this.b.getColorForState(textPaint0.drawableState, this.b.getDefaultColor());
        textPaint0.setShadowLayer(this.h, this.f, this.g, v);
    }

    public final void f(Context context0, TextPaint textPaint0, d d0) {
        if(this.d(context0)) {
            this.g(textPaint0, this.b(context0));
            return;
        }
        this.a();
        this.g(textPaint0, this.n);
        this.c(context0, new c(this, textPaint0, d0));
    }

    public final void g(TextPaint textPaint0, Typeface typeface0) {
        textPaint0.setTypeface(typeface0);
        int v = ~typeface0.getStyle() & this.d;
        textPaint0.setFakeBoldText((v & 1) != 0);
        textPaint0.setTextSkewX(((v & 2) == 0 ? 0.0f : -0.25f));
        textPaint0.setTextSize(this.k);
        if(this.i) {
            textPaint0.setLetterSpacing(this.j);
        }
    }
}

