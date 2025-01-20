package com.google.android.material.textfield;

import Bb.q;
import H6.f;
import H6.h;
import J1.U;
import K6.b;
import K6.d;
import K6.e;
import K6.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class c extends EndIconDelegate {
    public final k d;
    public final b e;
    public final a f;
    public final com.google.android.material.textfield.b g;
    public final d h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public MaterialShapeDrawable m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    public c(TextInputLayout textInputLayout0) {
        super(textInputLayout0);
        this.d = new k(this, 0);
        this.e = new b(1, this);
        this.f = new a(this, textInputLayout0);
        this.g = new com.google.android.material.textfield.b(this);
        this.h = new d(this, 1);
        this.i = false;
        this.j = false;
        this.k = 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        Context context0 = this.b;
        float f = (float)context0.getResources().getDimensionPixelOffset(0x7F0701A8);  // dimen:mtrl_shape_corner_size_small_component
        float f1 = (float)context0.getResources().getDimensionPixelOffset(0x7F070165);  // dimen:mtrl_exposed_dropdown_menu_popup_elevation
        int v = context0.getResources().getDimensionPixelOffset(0x7F070167);  // dimen:mtrl_exposed_dropdown_menu_popup_vertical_padding
        MaterialShapeDrawable materialShapeDrawable0 = this.e(f, f, f1, v);
        MaterialShapeDrawable materialShapeDrawable1 = this.e(0.0f, f, f1, v);
        this.m = materialShapeDrawable0;
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        this.l = stateListDrawable0;
        stateListDrawable0.addState(new int[]{0x10100AA}, materialShapeDrawable0);
        this.l.addState(new int[0], materialShapeDrawable1);
        Drawable drawable0 = q.v(context0, 0x7F0802EA);  // drawable:mtrl_dropdown_arrow
        TextInputLayout textInputLayout0 = this.a;
        textInputLayout0.setEndIconDrawable(drawable0);
        textInputLayout0.setEndIconContentDescription(textInputLayout0.getResources().getText(0x7F120188));  // string:exposed_dropdown_menu_content_description "Show dropdown menu"
        textInputLayout0.setEndIconOnClickListener(new e(1, this));
        com.google.android.material.textfield.b b0 = this.g;
        textInputLayout0.c1.add(b0);
        if(textInputLayout0.f0 != null) {
            b0.a(textInputLayout0);
        }
        textInputLayout0.g1.add(this.h);
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.setInterpolator(q6.a.a);
        valueAnimator0.setDuration(67L);
        valueAnimator0.addUpdateListener(new J6.b(1, this));
        this.p = valueAnimator0;
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator1.setInterpolator(q6.a.a);
        valueAnimator1.setDuration(50L);
        valueAnimator1.addUpdateListener(new J6.b(1, this));
        this.o = valueAnimator1;
        valueAnimator1.addListener(new U(1, this));
        this.n = (AccessibilityManager)context0.getSystemService("accessibility");
    }

    @Override  // com.google.android.material.textfield.EndIconDelegate
    public final boolean b(int v) {
        return v != 0;
    }

    public static void d(c c0, AutoCompleteTextView autoCompleteTextView0) {
        if(autoCompleteTextView0 == null) {
            c0.getClass();
            return;
        }
        c0.getClass();
        long v = System.currentTimeMillis() - c0.k;
        if(Long.compare(v, 0L) < 0 || v > 300L) {
            c0.i = false;
        }
        if(!c0.i) {
            c0.g(!c0.j);
            if(c0.j) {
                autoCompleteTextView0.requestFocus();
                autoCompleteTextView0.showDropDown();
                return;
            }
            autoCompleteTextView0.dismissDropDown();
            return;
        }
        c0.i = false;
    }

    public final MaterialShapeDrawable e(float f, float f1, float f2, int v) {
        h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h h1 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h h2 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h h3 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        H6.e e0 = new H6.e(0);
        H6.e e1 = new H6.e(0);
        H6.e e2 = new H6.e(0);
        H6.e e3 = new H6.e(0);
        H6.a a0 = new H6.a(f);
        H6.a a1 = new H6.a(f);
        H6.a a2 = new H6.a(f1);
        H6.a a3 = new H6.a(f1);
        ShapeAppearanceModel shapeAppearanceModel0 = new ShapeAppearanceModel();  // initializer: Ljava/lang/Object;-><init>()V
        shapeAppearanceModel0.a = h0;
        shapeAppearanceModel0.b = h1;
        shapeAppearanceModel0.c = h2;
        shapeAppearanceModel0.d = h3;
        shapeAppearanceModel0.e = a0;
        shapeAppearanceModel0.f = a1;
        shapeAppearanceModel0.g = a3;
        shapeAppearanceModel0.h = a2;
        shapeAppearanceModel0.i = e0;
        shapeAppearanceModel0.j = e1;
        shapeAppearanceModel0.k = e2;
        shapeAppearanceModel0.l = e3;
        int v1 = q.X(0x7F040101, this.b, "MaterialShapeDrawable");  // attr:colorSurface
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        materialShapeDrawable0.h(this.b);
        materialShapeDrawable0.j(ColorStateList.valueOf(v1));
        materialShapeDrawable0.i(f2);
        materialShapeDrawable0.setShapeAppearanceModel(shapeAppearanceModel0);
        f f3 = materialShapeDrawable0.X;
        if(f3.g == null) {
            f3.g = new Rect();
        }
        materialShapeDrawable0.X.g.set(0, v, 0, v);
        materialShapeDrawable0.invalidateSelf();
        return materialShapeDrawable0;
    }

    public static boolean f(EditText editText0) {
        return editText0.getKeyListener() != null;
    }

    public final void g(boolean z) {
        if(this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }
}

