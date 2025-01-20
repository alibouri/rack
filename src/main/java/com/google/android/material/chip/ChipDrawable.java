package com.google.android.material.chip;

import A1.d;
import B6.i;
import B6.j;
import B6.l;
import H6.a;
import H6.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x6.c;

public final class ChipDrawable extends MaterialShapeDrawable implements i, Drawable.Callback {
    public float A0;
    public boolean A1;
    public ColorStateList B0;
    public int B1;
    public CharSequence C0;
    public boolean C1;
    public boolean D0;
    public static final int[] D1;
    public Drawable E0;
    public static final ShapeDrawable E1;
    public ColorStateList F0;
    public float G0;
    public boolean H0;
    public boolean I0;
    public Drawable J0;
    public RippleDrawable K0;
    public ColorStateList L0;
    public float M0;
    public SpannableStringBuilder N0;
    public boolean O0;
    public boolean P0;
    public Drawable Q0;
    public ColorStateList R0;
    public MotionSpec S0;
    public MotionSpec T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;
    public float a1;
    public float b1;
    public final Context c1;
    public final Paint d1;
    public final Paint.FontMetrics e1;
    public final RectF f1;
    public final PointF g1;
    public final Path h1;
    public final j i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public boolean p1;
    public int q1;
    public int r1;
    public ColorFilter s1;
    public PorterDuffColorFilter t1;
    public ColorStateList u1;
    public ColorStateList v0;
    public PorterDuff.Mode v1;
    public ColorStateList w0;
    public int[] w1;
    public float x0;
    public ColorStateList x1;
    public float y0;
    public WeakReference y1;
    public ColorStateList z0;
    public TextUtils.TruncateAt z1;

    static {
        ChipDrawable.D1 = new int[]{0x101009E};
        ChipDrawable.E1 = new ShapeDrawable(new OvalShape());
    }

    public ChipDrawable(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F0400C9, 0x7F1302F9);  // attr:chipStyle
        this.y0 = -1.0f;
        this.d1 = new Paint(1);
        this.e1 = new Paint.FontMetrics();
        this.f1 = new RectF();
        this.g1 = new PointF();
        this.h1 = new Path();
        this.r1 = 0xFF;
        this.v1 = PorterDuff.Mode.SRC_IN;
        this.y1 = new WeakReference(null);
        this.h(context0);
        this.c1 = context0;
        j j0 = new j(this);
        this.i1 = j0;
        this.C0 = "";
        j0.a.density = context0.getResources().getDisplayMetrics().density;
        int[] arr_v = ChipDrawable.D1;
        this.setState(arr_v);
        if(!Arrays.equals(this.w1, arr_v)) {
            this.w1 = arr_v;
            if(this.S()) {
                this.v(this.getState(), arr_v);
            }
        }
        this.A1 = true;
        ChipDrawable.E1.setTint(-1);
    }

    public final void A(float f) {
        if(this.y0 != f) {
            this.y0 = f;
            H6.i i0 = this.X.a.e();
            i0.e = new a(f);
            i0.f = new a(f);
            i0.g = new a(f);
            i0.h = new a(f);
            this.setShapeAppearanceModel(i0.a());
        }
    }

    public final void B(Drawable drawable0) {
        Drawable drawable1 = this.E0;
        Drawable drawable2 = null;
        if(drawable1 == null) {
            drawable1 = null;
        }
        else if(drawable1 instanceof d) {
            d d0 = (d)drawable1;
            drawable1 = null;
        }
        if(drawable1 != drawable0) {
            float f = this.p();
            if(drawable0 != null) {
                drawable2 = drawable0.mutate();
            }
            this.E0 = drawable2;
            float f1 = this.p();
            ChipDrawable.T(drawable1);
            if(this.R()) {
                this.n(this.E0);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.u();
            }
        }
    }

    public final void C(float f) {
        if(this.G0 != f) {
            float f1 = this.p();
            this.G0 = f;
            float f2 = this.p();
            this.invalidateSelf();
            if(f1 != f2) {
                this.u();
            }
        }
    }

    public final void D(ColorStateList colorStateList0) {
        this.H0 = true;
        if(this.F0 != colorStateList0) {
            this.F0 = colorStateList0;
            if(this.R()) {
                this.E0.setTintList(colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public final void E(boolean z) {
        if(this.D0 != z) {
            boolean z1 = this.R();
            this.D0 = z;
            boolean z2 = this.R();
            if(z1 != z2) {
                if(z2) {
                    this.n(this.E0);
                }
                else {
                    ChipDrawable.T(this.E0);
                }
                this.invalidateSelf();
                this.u();
            }
        }
    }

    public final void F(ColorStateList colorStateList0) {
        if(this.z0 != colorStateList0) {
            this.z0 = colorStateList0;
            if(this.C1) {
                f f0 = this.X;
                if(f0.d != colorStateList0) {
                    f0.d = colorStateList0;
                    this.onStateChange(this.getState());
                }
            }
            this.onStateChange(this.getState());
        }
    }

    public final void G(float f) {
        if(this.A0 != f) {
            this.A0 = f;
            this.d1.setStrokeWidth(f);
            if(this.C1) {
                this.X.j = f;
                this.invalidateSelf();
            }
            this.invalidateSelf();
        }
    }

    public final void H(Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.J0;
        if(drawable2 == null) {
            drawable2 = null;
        }
        else if(drawable2 instanceof d) {
            d d0 = (d)drawable2;
            drawable2 = null;
        }
        if(drawable2 != drawable0) {
            float f = this.q();
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.J0 = drawable1;
            this.K0 = new RippleDrawable(F6.a.a(this.B0), this.J0, ChipDrawable.E1);
            float f1 = this.q();
            ChipDrawable.T(drawable2);
            if(this.S()) {
                this.n(this.J0);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.u();
            }
        }
    }

    public final void I(float f) {
        if(this.a1 != f) {
            this.a1 = f;
            this.invalidateSelf();
            if(this.S()) {
                this.u();
            }
        }
    }

    public final void J(float f) {
        if(this.M0 != f) {
            this.M0 = f;
            this.invalidateSelf();
            if(this.S()) {
                this.u();
            }
        }
    }

    public final void K(float f) {
        if(this.Z0 != f) {
            this.Z0 = f;
            this.invalidateSelf();
            if(this.S()) {
                this.u();
            }
        }
    }

    public final void L(ColorStateList colorStateList0) {
        if(this.L0 != colorStateList0) {
            this.L0 = colorStateList0;
            if(this.S()) {
                this.J0.setTintList(colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public final void M(boolean z) {
        if(this.I0 != z) {
            this.I0 = z;
            boolean z1 = this.S();
            if(this.S() != z1) {
                if(z1) {
                    this.n(this.J0);
                }
                else {
                    ChipDrawable.T(this.J0);
                }
                this.invalidateSelf();
                this.u();
            }
        }
    }

    public final void N(float f) {
        if(this.W0 != f) {
            float f1 = this.p();
            this.W0 = f;
            float f2 = this.p();
            this.invalidateSelf();
            if(f1 != f2) {
                this.u();
            }
        }
    }

    public final void O(float f) {
        if(this.V0 != f) {
            float f1 = this.p();
            this.V0 = f;
            float f2 = this.p();
            this.invalidateSelf();
            if(f1 != f2) {
                this.u();
            }
        }
    }

    public final void P(ColorStateList colorStateList0) {
        if(this.B0 != colorStateList0) {
            this.B0 = colorStateList0;
            this.x1 = null;
            this.onStateChange(this.getState());
        }
    }

    // Deobfuscation rating: LOW(20)
    public final boolean Q() {
        return this.P0 && this.Q0 != null && this.p1;
    }

    public final boolean R() {
        return this.D0 && this.E0 != null;
    }

    public final boolean S() {
        return this.I0 && this.J0 != null;
    }

    public static void T(Drawable drawable0) {
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
    }

    @Override  // B6.i
    public final void a() {
        this.u();
        this.invalidateSelf();
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void draw(Canvas canvas0) {
        RectF rectF4;
        int v3;
        RectF rectF3;
        int v2;
        Rect rect0 = this.getBounds();
        if(!rect0.isEmpty()) {
            int v = this.r1;
            if(v != 0) {
                int v1 = v >= 0xFF ? 0 : canvas0.saveLayerAlpha(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), v);
                Paint paint0 = this.d1;
                RectF rectF0 = this.f1;
                if(!this.C1) {
                    paint0.setColor(this.j1);
                    paint0.setStyle(Paint.Style.FILL);
                    rectF0.set(rect0);
                    canvas0.drawRoundRect(rectF0, this.r(), this.r(), paint0);
                }
                if(!this.C1) {
                    paint0.setColor(this.k1);
                    paint0.setStyle(Paint.Style.FILL);
                    ColorFilter colorFilter0 = this.s1;
                    if(colorFilter0 == null) {
                        colorFilter0 = this.t1;
                    }
                    paint0.setColorFilter(colorFilter0);
                    rectF0.set(rect0);
                    canvas0.drawRoundRect(rectF0, this.r(), this.r(), paint0);
                }
                if(this.C1) {
                    super.draw(canvas0);
                }
                if(Float.compare(this.A0, 0.0f) > 0 && !this.C1) {
                    paint0.setColor(this.m1);
                    paint0.setStyle(Paint.Style.STROKE);
                    if(!this.C1) {
                        ColorFilter colorFilter1 = this.s1;
                        if(colorFilter1 == null) {
                            colorFilter1 = this.t1;
                        }
                        paint0.setColorFilter(colorFilter1);
                    }
                    rectF0.set(((float)rect0.left) + this.A0 / 2.0f, ((float)rect0.top) + this.A0 / 2.0f, ((float)rect0.right) - this.A0 / 2.0f, ((float)rect0.bottom) - this.A0 / 2.0f);
                    float f = this.y0 - this.A0 / 2.0f;
                    canvas0.drawRoundRect(rectF0, f, f, paint0);
                }
                paint0.setColor(this.n1);
                paint0.setStyle(Paint.Style.FILL);
                rectF0.set(rect0);
                if(this.C1) {
                    RectF rectF1 = new RectF(rect0);
                    this.p0.a(this.X.a, this.X.i, rectF1, this.o0, this.h1);
                    RectF rectF2 = this.f();
                    this.e(canvas0, paint0, this.h1, this.X.a, rectF2);
                }
                else {
                    canvas0.drawRoundRect(rectF0, this.r(), this.r(), paint0);
                }
                if(this.R()) {
                    this.o(rect0, rectF0);
                    float f1 = rectF0.left;
                    float f2 = rectF0.top;
                    canvas0.translate(f1, f2);
                    this.E0.setBounds(0, 0, ((int)rectF0.width()), ((int)rectF0.height()));
                    this.E0.draw(canvas0);
                    canvas0.translate(-f1, -f2);
                }
                if(this.Q()) {
                    this.o(rect0, rectF0);
                    float f3 = rectF0.left;
                    float f4 = rectF0.top;
                    canvas0.translate(f3, f4);
                    this.Q0.setBounds(0, 0, ((int)rectF0.width()), ((int)rectF0.height()));
                    this.Q0.draw(canvas0);
                    canvas0.translate(-f3, -f4);
                }
                if(!this.A1 || this.C0 == null) {
                    rectF3 = rectF0;
                    v3 = v1;
                }
                else {
                    PointF pointF0 = this.g1;
                    pointF0.set(0.0f, 0.0f);
                    Paint.Align paint$Align0 = Paint.Align.LEFT;
                    j j0 = this.i1;
                    if(this.C0 != null) {
                        float f5 = this.U0;
                        float f6 = this.p() + f5 + this.X0;
                        if(this.getLayoutDirection() == 0) {
                            pointF0.x = ((float)rect0.left) + f6;
                        }
                        else {
                            pointF0.x = ((float)rect0.right) - f6;
                            paint$Align0 = Paint.Align.RIGHT;
                        }
                        float f7 = (float)rect0.centerY();
                        j0.a.getFontMetrics(this.e1);
                        pointF0.y = f7 - (this.e1.descent + this.e1.ascent) / 2.0f;
                    }
                    rectF0.setEmpty();
                    if(this.C0 != null) {
                        float f8 = this.U0;
                        float f9 = this.p() + f8 + this.X0;
                        float f10 = this.q() + this.b1 + this.Y0;
                        if(this.getLayoutDirection() == 0) {
                            rectF0.left = ((float)rect0.left) + f9;
                            rectF0.right = ((float)rect0.right) - f10;
                        }
                        else {
                            rectF0.left = ((float)rect0.left) + f10;
                            rectF0.right = ((float)rect0.right) - f9;
                        }
                        rectF0.top = (float)rect0.top;
                        rectF0.bottom = (float)rect0.bottom;
                    }
                    TextPaint textPaint0 = j0.a;
                    if(j0.f != null) {
                        textPaint0.drawableState = this.getState();
                        j0.f.e(this.c1, textPaint0, j0.b);
                    }
                    textPaint0.setTextAlign(paint$Align0);
                    boolean z = Math.round(j0.a(this.C0.toString())) > Math.round(rectF0.width());
                    if(z) {
                        v2 = canvas0.save();
                        canvas0.clipRect(rectF0);
                    }
                    else {
                        v2 = 0;
                    }
                    CharSequence charSequence0 = !z || this.z1 == null ? this.C0 : TextUtils.ellipsize(this.C0, textPaint0, rectF0.width(), this.z1);
                    rectF3 = rectF0;
                    v3 = v1;
                    canvas0.drawText(charSequence0, 0, charSequence0.length(), pointF0.x, pointF0.y, textPaint0);
                    if(z) {
                        canvas0.restoreToCount(v2);
                    }
                }
                if(this.S()) {
                    rectF3.setEmpty();
                    if(this.S()) {
                        float f11 = this.b1 + this.a1;
                        if(this.getLayoutDirection() == 0) {
                            float f12 = ((float)rect0.right) - f11;
                            rectF4 = rectF3;
                            rectF4.right = f12;
                            rectF4.left = f12 - this.M0;
                        }
                        else {
                            rectF4 = rectF3;
                            float f13 = ((float)rect0.left) + f11;
                            rectF4.left = f13;
                            rectF4.right = f13 + this.M0;
                        }
                        float f14 = rect0.exactCenterY() - this.M0 / 2.0f;
                        rectF4.top = f14;
                        rectF4.bottom = f14 + this.M0;
                    }
                    else {
                        rectF4 = rectF3;
                    }
                    float f15 = rectF4.left;
                    float f16 = rectF4.top;
                    canvas0.translate(f15, f16);
                    this.J0.setBounds(0, 0, ((int)rectF4.width()), ((int)rectF4.height()));
                    this.K0.setBounds(this.J0.getBounds());
                    this.K0.jumpToCurrentState();
                    this.K0.draw(canvas0);
                    canvas0.translate(-f15, -f16);
                }
                if(this.r1 < 0xFF) {
                    canvas0.restoreToCount(v3);
                }
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r1;
    }

    @Override  // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.s1;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int)this.x0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.U0;
        float f1 = this.p() + f + this.X0;
        return Math.min(Math.round(this.q() + (this.i1.a(this.C0.toString()) + f1 + this.Y0) + this.b1), this.B1);
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void getOutline(Outline outline0) {
        if(this.C1) {
            super.getOutline(outline0);
            return;
        }
        Rect rect0 = this.getBounds();
        if(rect0.isEmpty()) {
            outline0.setRoundRect(0, 0, this.getIntrinsicWidth(), ((int)this.x0), this.y0);
        }
        else {
            outline0.setRoundRect(rect0, this.y0);
        }
        outline0.setAlpha(((float)this.r1) / 255.0f);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    // Deobfuscation rating: LOW(27)
    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final boolean isStateful() {
        if(!ChipDrawable.s(this.v0) && !ChipDrawable.s(this.w0) && !ChipDrawable.s(this.z0)) {
            TextAppearance textAppearance0 = this.i1.f;
            return textAppearance0 != null && (textAppearance0.a != null && textAppearance0.a.isStateful()) || (this.P0 && this.Q0 != null && this.O0 || ChipDrawable.t(this.E0) || ChipDrawable.t(this.Q0) || ChipDrawable.s(this.u1));
        }
        return true;
    }

    public final void n(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        drawable0.setCallback(this);
        drawable0.setLayoutDirection(this.getLayoutDirection());
        drawable0.setLevel(this.getLevel());
        drawable0.setVisible(this.isVisible(), false);
        if(drawable0 == this.J0) {
            if(drawable0.isStateful()) {
                drawable0.setState(this.w1);
            }
            drawable0.setTintList(this.L0);
            return;
        }
        if(drawable0.isStateful()) {
            drawable0.setState(this.getState());
        }
        Drawable drawable1 = this.E0;
        if(drawable0 == drawable1 && this.H0) {
            drawable1.setTintList(this.F0);
        }
    }

    public final void o(Rect rect0, RectF rectF0) {
        rectF0.setEmpty();
        if(this.R() || this.Q()) {
            float f = this.U0 + this.V0;
            Drawable drawable0 = this.p1 ? this.Q0 : this.E0;
            float f1 = this.G0 > 0.0f || drawable0 == null ? this.G0 : ((float)drawable0.getIntrinsicWidth());
            if(this.getLayoutDirection() == 0) {
                float f2 = ((float)rect0.left) + f;
                rectF0.left = f2;
                rectF0.right = f2 + f1;
            }
            else {
                float f3 = ((float)rect0.right) - f;
                rectF0.right = f3;
                rectF0.left = f3 - f1;
            }
            Drawable drawable1 = this.p1 ? this.Q0 : this.E0;
            float f4 = this.G0;
            if(f4 > 0.0f && drawable1 != null) {
                f4 = (float)Math.ceil(l.d(this.c1, 24));
                if(((float)drawable1.getIntrinsicHeight()) <= f4) {
                    f4 = (float)drawable1.getIntrinsicHeight();
                }
            }
            float f5 = rect0.exactCenterY() - f4 / 2.0f;
            rectF0.top = f5;
            rectF0.bottom = f5 + f4;
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int v) {
        boolean z = super.onLayoutDirectionChanged(v);
        if(this.R()) {
            z |= this.E0.setLayoutDirection(v);
        }
        if(this.Q()) {
            z |= this.Q0.setLayoutDirection(v);
        }
        if(this.S()) {
            z |= this.J0.setLayoutDirection(v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int v) {
        boolean z = super.onLevelChange(v);
        if(this.R()) {
            z |= this.E0.setLevel(v);
        }
        if(this.Q()) {
            z |= this.Q0.setLevel(v);
        }
        if(this.S()) {
            z |= this.J0.setLevel(v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable, B6.i
    public final boolean onStateChange(int[] arr_v) {
        if(this.C1) {
            super.onStateChange(arr_v);
        }
        return this.v(arr_v, this.w1);
    }

    public final float p() {
        if(!this.R() && !this.Q()) {
            return 0.0f;
        }
        float f = this.V0;
        Drawable drawable0 = this.p1 ? this.Q0 : this.E0;
        return (this.G0 > 0.0f || drawable0 == null ? this.G0 : ((float)drawable0.getIntrinsicWidth())) + f + this.W0;
    }

    // Deobfuscation rating: LOW(20)
    public final float q() {
        return this.S() ? this.Z0 + this.M0 + this.a1 : 0.0f;
    }

    // Deobfuscation rating: LOW(20)
    public final float r() {
        return this.C1 ? this.X.a.e.a(this.f()) : this.y0;
    }

    public static boolean s(ColorStateList colorStateList0) {
        return colorStateList0 != null && colorStateList0.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void setAlpha(int v) {
        if(this.r1 != v) {
            this.r1 = v;
            this.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        if(this.s1 != colorFilter0) {
            this.s1 = colorFilter0;
            this.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void setTintList(ColorStateList colorStateList0) {
        if(this.u1 != colorStateList0) {
            this.u1 = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.v1 != porterDuff$Mode0) {
            this.v1 = porterDuff$Mode0;
            this.t1 = this.u1 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(this.u1.getColorForState(this.getState(), 0), porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        if(this.R()) {
            z2 |= this.E0.setVisible(z, z1);
        }
        if(this.Q()) {
            z2 |= this.Q0.setVisible(z, z1);
        }
        if(this.S()) {
            z2 |= this.J0.setVisible(z, z1);
        }
        if(z2) {
            this.invalidateSelf();
        }
        return z2;
    }

    public static boolean t(Drawable drawable0) {
        return drawable0 != null && drawable0.isStateful();
    }

    public final void u() {
        c c0 = (c)this.y1.get();
        if(c0 != null) {
            ((Chip)c0).c(((Chip)c0).q0);
            ((Chip)c0).requestLayout();
            ((Chip)c0).invalidateOutline();
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, runnable0);
        }
    }

    public final boolean v(int[] arr_v, int[] arr_v1) {
        boolean z3;
        int v5;
        boolean z = true;
        boolean z1 = super.onStateChange(arr_v);
        int v = this.c((this.v0 == null ? 0 : this.v0.getColorForState(arr_v, this.j1)));
        if(this.j1 != v) {
            this.j1 = v;
            z1 = true;
        }
        int v1 = this.c((this.w0 == null ? 0 : this.w0.getColorForState(arr_v, this.k1)));
        if(this.k1 != v1) {
            this.k1 = v1;
            z1 = true;
        }
        int v2 = z1.a.c(v1, v);
        if(((this.l1 == v2 ? 0 : 1) | (this.X.c == null ? 1 : 0)) != 0) {
            this.l1 = v2;
            this.j(ColorStateList.valueOf(v2));
            z1 = true;
        }
        int v3 = this.z0 == null ? 0 : this.z0.getColorForState(arr_v, this.m1);
        if(this.m1 != v3) {
            this.m1 = v3;
            z1 = true;
        }
        int v4 = this.x1 == null || !F6.a.b(arr_v) ? 0 : this.x1.getColorForState(arr_v, this.n1);
        if(this.n1 != v4) {
            this.n1 = v4;
        }
        TextAppearance textAppearance0 = this.i1.f;
        if(textAppearance0 == null) {
            v5 = 0;
        }
        else {
            ColorStateList colorStateList0 = textAppearance0.a;
            v5 = colorStateList0 == null ? 0 : colorStateList0.getColorForState(arr_v, this.o1);
        }
        if(this.o1 != v5) {
            this.o1 = v5;
            z1 = true;
        }
        boolean z2 = false;
        int[] arr_v2 = this.getState();
        if(arr_v2 != null) {
            for(int v6 = 0; v6 < arr_v2.length; ++v6) {
                if(arr_v2[v6] == 0x10100A0) {
                    if(!this.O0) {
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
        }
        if(this.p1 == z2 || this.Q0 == null) {
            z3 = false;
        }
        else {
            float f = this.p();
            this.p1 = z2;
            if(f == this.p()) {
                z1 = true;
                z3 = false;
            }
            else {
                z1 = true;
                z3 = true;
            }
        }
        int v7 = this.u1 == null ? 0 : this.u1.getColorForState(arr_v, this.q1);
        if(this.q1 == v7) {
            z = z1;
        }
        else {
            this.q1 = v7;
            PorterDuff.Mode porterDuff$Mode0 = this.v1;
            this.t1 = this.u1 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(this.u1.getColorForState(this.getState(), 0), porterDuff$Mode0);
        }
        if(ChipDrawable.t(this.E0)) {
            z |= this.E0.setState(arr_v);
        }
        if(ChipDrawable.t(this.Q0)) {
            z |= this.Q0.setState(arr_v);
        }
        if(ChipDrawable.t(this.J0)) {
            int[] arr_v3 = new int[arr_v.length + arr_v1.length];
            System.arraycopy(arr_v, 0, arr_v3, 0, arr_v.length);
            System.arraycopy(arr_v1, 0, arr_v3, arr_v.length, arr_v1.length);
            z |= this.J0.setState(arr_v3);
        }
        if(ChipDrawable.t(this.K0)) {
            z |= this.K0.setState(arr_v1);
        }
        if(z) {
            this.invalidateSelf();
        }
        if(z3) {
            this.u();
        }
        return z;
    }

    public final void w(boolean z) {
        if(this.O0 != z) {
            this.O0 = z;
            float f = this.p();
            if(!z && this.p1) {
                this.p1 = false;
            }
            float f1 = this.p();
            this.invalidateSelf();
            if(f != f1) {
                this.u();
            }
        }
    }

    public final void x(Drawable drawable0) {
        if(this.Q0 != drawable0) {
            float f = this.p();
            this.Q0 = drawable0;
            float f1 = this.p();
            ChipDrawable.T(this.Q0);
            this.n(this.Q0);
            this.invalidateSelf();
            if(f != f1) {
                this.u();
            }
        }
    }

    public final void y(ColorStateList colorStateList0) {
        if(this.R0 != colorStateList0) {
            this.R0 = colorStateList0;
            if(this.P0) {
                Drawable drawable0 = this.Q0;
                if(drawable0 != null && this.O0) {
                    drawable0.setTintList(colorStateList0);
                }
            }
            this.onStateChange(this.getState());
        }
    }

    public final void z(boolean z) {
        if(this.P0 != z) {
            this.P0 = z;
            boolean z1 = this.Q();
            if(this.Q() != z1) {
                if(z1) {
                    this.n(this.Q0);
                }
                else {
                    ChipDrawable.T(this.Q0);
                }
                this.invalidateSelf();
                this.u();
            }
        }
    }
}

