package com.google.android.material.shape;

import H6.c;
import H6.e;
import H6.g;
import H6.h;
import H6.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public final class ShapeAppearanceModel {
    public a a;
    public a b;
    public a c;
    public a d;
    public c e;
    public c f;
    public c g;
    public c h;
    public e i;
    public e j;
    public e k;
    public e l;

    public ShapeAppearanceModel() {
        this.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
        this.b = new h();  // initializer: Ljava/lang/Object;-><init>()V
        this.c = new h();  // initializer: Ljava/lang/Object;-><init>()V
        this.d = new h();  // initializer: Ljava/lang/Object;-><init>()V
        this.e = new H6.a(0.0f);
        this.f = new H6.a(0.0f);
        this.g = new H6.a(0.0f);
        this.h = new H6.a(0.0f);
        this.i = new e(0);
        this.j = new e(0);
        this.k = new e(0);
        this.l = new e(0);
    }

    public static i a(Context context0, int v, int v1, H6.a a0) {
        if(v1 != 0) {
            ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, v);
            v = v1;
            context0 = contextThemeWrapper0;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, p6.a.A);
        try {
            int v3 = typedArray0.getInt(0, 0);
            int v4 = typedArray0.getInt(3, v3);
            int v5 = typedArray0.getInt(4, v3);
            int v6 = typedArray0.getInt(2, v3);
            int v7 = typedArray0.getInt(1, v3);
            c c0 = ShapeAppearanceModel.c(typedArray0, 5, a0);
            c c1 = ShapeAppearanceModel.c(typedArray0, 8, c0);
            c c2 = ShapeAppearanceModel.c(typedArray0, 9, c0);
            c c3 = ShapeAppearanceModel.c(typedArray0, 7, c0);
            c c4 = ShapeAppearanceModel.c(typedArray0, 6, c0);
            i i0 = new i();
            i0.a = hb.h.K(v4);
            i0.e = c1;
            i0.b = hb.h.K(v5);
            i0.f = c2;
            i0.c = hb.h.K(v6);
            i0.g = c3;
            i0.d = hb.h.K(v7);
            i0.h = c4;
            return i0;
        }
        finally {
            typedArray0.recycle();
        }
    }

    public static i b(Context context0, AttributeSet attributeSet0, int v, int v1) {
        H6.a a0 = new H6.a(0.0f);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, p6.a.u, v, v1);
        int v2 = typedArray0.getResourceId(0, 0);
        int v3 = typedArray0.getResourceId(1, 0);
        typedArray0.recycle();
        return ShapeAppearanceModel.a(context0, v2, v3, a0);
    }

    public static c c(TypedArray typedArray0, int v, c c0) {
        TypedValue typedValue0 = typedArray0.peekValue(v);
        if(typedValue0 == null) {
            return c0;
        }
        int v1 = typedValue0.type;
        if(v1 == 5) {
            return new H6.a(((float)TypedValue.complexToDimensionPixelSize(typedValue0.data, typedArray0.getResources().getDisplayMetrics())));
        }
        return v1 == 6 ? new g(typedValue0.getFraction(1.0f, 1.0f)) : c0;
    }

    // Deobfuscation rating: LOW(36)
    public final boolean d(RectF rectF0) {
        boolean z = this.l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.k.getClass().equals(e.class);
        float f = this.e.a(rectF0);
        return z && (this.f.a(rectF0) == f && this.h.a(rectF0) == f && this.g.a(rectF0) == f) && (this.b instanceof h && this.a instanceof h && this.c instanceof h && this.d instanceof h);
    }

    public final i e() {
        i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i0.a = this.a;
        i0.b = this.b;
        i0.c = this.c;
        i0.d = this.d;
        i0.e = this.e;
        i0.f = this.f;
        i0.g = this.g;
        i0.h = this.h;
        i0.i = this.i;
        i0.j = this.j;
        i0.k = this.k;
        i0.l = this.l;
        return i0;
    }
}

