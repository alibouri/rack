package com.google.android.material.shape;

import B3.d;
import Bb.F;
import G6.a;
import H6.b;
import H6.c;
import H6.f;
import H6.g;
import H6.i;
import H6.j;
import H6.k;
import H6.r;
import H6.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

public class MaterialShapeDrawable extends Drawable implements t {
    public f X;
    public final r[] Y;
    public final r[] Z;
    public final BitSet b0;
    public boolean c0;
    public final Matrix d0;
    public final Path e0;
    public final Path f0;
    public final RectF g0;
    public final RectF h0;
    public final Region i0;
    public final Region j0;
    public ShapeAppearanceModel k0;
    public final Paint l0;
    public final Paint m0;
    public final a n0;
    public final d o0;
    public final k p0;
    public PorterDuffColorFilter q0;
    public PorterDuffColorFilter r0;
    public final RectF s0;
    public final boolean t0;
    public static final Paint u0;

    static {
        MaterialShapeDrawable.u0 = new Paint(1);
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public MaterialShapeDrawable(f f0) {
        this.Y = new r[4];
        this.Z = new r[4];
        this.b0 = new BitSet(8);
        this.d0 = new Matrix();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Region();
        this.j0 = new Region();
        Paint paint0 = new Paint(1);
        this.l0 = paint0;
        Paint paint1 = new Paint(1);
        this.m0 = paint1;
        this.n0 = new a();
        this.p0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? j.a : new k();
        this.s0 = new RectF();
        this.t0 = true;
        this.X = f0;
        paint1.setStyle(Paint.Style.STROKE);
        paint0.setStyle(Paint.Style.FILL);
        MaterialShapeDrawable.u0.setColor(-1);
        PorterDuffXfermode porterDuffXfermode0 = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        MaterialShapeDrawable.u0.setXfermode(porterDuffXfermode0);
        this.l();
        this.k(this.getState());
        this.o0 = new d(3, this);
    }

    public MaterialShapeDrawable(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this(ShapeAppearanceModel.b(context0, attributeSet0, v, v1).a());
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel0) {
        f f0 = new f();  // initializer: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        f0.c = null;
        f0.d = null;
        f0.e = null;
        f0.f = PorterDuff.Mode.SRC_IN;
        f0.g = null;
        f0.h = 1.0f;
        f0.i = 1.0f;
        f0.k = 0xFF;
        f0.l = 0.0f;
        f0.m = 0.0f;
        f0.n = 0;
        f0.o = 0;
        f0.p = Paint.Style.FILL_AND_STROKE;
        f0.a = shapeAppearanceModel0;
        f0.b = null;
        this(f0);
    }

    public final void b(RectF rectF0, Path path0) {
        this.p0.a(this.X.a, this.X.i, rectF0, this.o0, path0);
        if(this.X.h != 1.0f) {
            this.d0.reset();
            float f = this.X.h;
            float f1 = rectF0.width();
            float f2 = rectF0.height();
            this.d0.setScale(f, f, f1 / 2.0f, f2 / 2.0f);
            path0.transform(this.d0);
        }
        path0.computeBounds(this.s0, true);
    }

    public final int c(int v) {
        float f = 0.0f;
        float f1 = this.X.m + 0.0f + this.X.l;
        A6.a a0 = this.X.b;
        if(a0 != null && a0.a && z1.a.e(v, 0xFF) == a0.c) {
            float f2 = a0.d;
            if(f2 > 0.0f && f1 > 0.0f) {
                f = Math.min((((float)Math.log1p(f1 / f2)) * 4.5f + 2.0f) / 100.0f, 1.0f);
            }
            int v1 = Color.alpha(v);
            return z1.a.e(F.F(z1.a.e(v, 0xFF), f, a0.b), v1);
        }
        return v;
    }

    public final void d(Canvas canvas0) {
        if(this.b0.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can\'t be drawn for all operations in this shape.");
        }
        Path path0 = this.e0;
        a a0 = this.n0;
        if(this.X.o != 0) {
            canvas0.drawPath(path0, a0.a);
        }
        for(int v = 0; v < 4; ++v) {
            this.Y[v].a(r.a, a0, this.X.n, canvas0);
            this.Z[v].a(r.a, a0, this.X.n, canvas0);
        }
        if(this.t0) {
            int v1 = (int)(Math.sin(Math.toRadians(0.0)) * ((double)this.X.o));
            int v2 = (int)(Math.cos(Math.toRadians(0.0)) * ((double)this.X.o));
            canvas0.translate(((float)(-v1)), ((float)(-v2)));
            canvas0.drawPath(path0, MaterialShapeDrawable.u0);
            canvas0.translate(((float)v1), ((float)v2));
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Path path2;
        RectF rectF2;
        Paint paint0 = this.l0;
        paint0.setColorFilter(this.q0);
        int v = paint0.getAlpha();
        paint0.setAlpha((this.X.k + (this.X.k >>> 7)) * v >>> 8);
        Paint paint1 = this.m0;
        paint1.setColorFilter(this.r0);
        paint1.setStrokeWidth(this.X.j);
        int v1 = paint1.getAlpha();
        paint1.setAlpha((this.X.k + (this.X.k >>> 7)) * v1 >>> 8);
        Path path0 = this.f0;
        Path path1 = this.e0;
        RectF rectF0 = this.h0;
        float f = 0.0f;
        if(this.c0) {
            float f1 = this.g() ? paint1.getStrokeWidth() / 2.0f : 0.0f;
            ShapeAppearanceModel shapeAppearanceModel0 = this.X.a;
            i i0 = shapeAppearanceModel0.e();
            c c0 = shapeAppearanceModel0.e;
            if(!(c0 instanceof g)) {
                c0 = new b(-f1, c0);
            }
            i0.e = c0;
            c c1 = shapeAppearanceModel0.f;
            if(!(c1 instanceof g)) {
                c1 = new b(-f1, c1);
            }
            i0.f = c1;
            c c2 = shapeAppearanceModel0.h;
            if(!(c2 instanceof g)) {
                c2 = new b(-f1, c2);
            }
            i0.h = c2;
            c c3 = shapeAppearanceModel0.g;
            if(!(c3 instanceof g)) {
                c3 = new b(-f1, c3);
            }
            i0.g = c3;
            ShapeAppearanceModel shapeAppearanceModel1 = i0.a();
            this.k0 = shapeAppearanceModel1;
            float f2 = this.X.i;
            rectF0.set(this.f());
            float f3 = this.g() ? paint1.getStrokeWidth() / 2.0f : 0.0f;
            rectF0.inset(f3, f3);
            this.p0.a(shapeAppearanceModel1, f2, rectF0, null, path0);
            this.b(this.f(), path1);
            this.c0 = false;
        }
        f f4 = this.X;
        f4.getClass();
        if(f4.n > 0) {
            int v2 = Build.VERSION.SDK_INT;
            if(!this.X.a.d(this.f()) && !path1.isConvex() && v2 < 29) {
                canvas0.save();
                canvas0.translate(((float)(((int)(Math.sin(Math.toRadians(0.0)) * ((double)this.X.o))))), ((float)(((int)(Math.cos(Math.toRadians(0.0)) * ((double)this.X.o))))));
                if(this.t0) {
                    RectF rectF1 = this.s0;
                    int v3 = (int)(rectF1.width() - ((float)this.getBounds().width()));
                    int v4 = (int)(rectF1.height() - ((float)this.getBounds().height()));
                    if(v3 < 0 || v4 < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    int v5 = (int)rectF1.width();
                    int v6 = this.X.n * 2 + v5 + v3;
                    int v7 = (int)rectF1.height();
                    Bitmap bitmap0 = Bitmap.createBitmap(v6, this.X.n * 2 + v7 + v4, Bitmap.Config.ARGB_8888);
                    Canvas canvas1 = new Canvas(bitmap0);
                    float f5 = (float)(this.getBounds().left - this.X.n - v3);
                    float f6 = (float)(this.getBounds().top - this.X.n - v4);
                    canvas1.translate(-f5, -f6);
                    this.d(canvas1);
                    canvas0.drawBitmap(bitmap0, f5, f6, null);
                    bitmap0.recycle();
                }
                else {
                    this.d(canvas0);
                }
                canvas0.restore();
            }
        }
        f f7 = this.X;
        if(f7.p == Paint.Style.FILL_AND_STROKE || f7.p == Paint.Style.FILL) {
            rectF2 = rectF0;
            path2 = path0;
            this.e(canvas0, paint0, path1, f7.a, this.f());
        }
        else {
            rectF2 = rectF0;
            path2 = path0;
        }
        if(this.g()) {
            ShapeAppearanceModel shapeAppearanceModel2 = this.k0;
            rectF2.set(this.f());
            if(this.g()) {
                f = paint1.getStrokeWidth() / 2.0f;
            }
            rectF2.inset(f, f);
            this.e(canvas0, paint1, path2, shapeAppearanceModel2, rectF2);
        }
        paint0.setAlpha(v);
        paint1.setAlpha(v1);
    }

    public final void e(Canvas canvas0, Paint paint0, Path path0, ShapeAppearanceModel shapeAppearanceModel0, RectF rectF0) {
        if(shapeAppearanceModel0.d(rectF0)) {
            float f = shapeAppearanceModel0.f.a(rectF0) * this.X.i;
            canvas0.drawRoundRect(rectF0, f, f, paint0);
            return;
        }
        canvas0.drawPath(path0, paint0);
    }

    public final RectF f() {
        Rect rect0 = this.getBounds();
        this.g0.set(rect0);
        return this.g0;
    }

    public final boolean g() {
        Paint.Style paint$Style0 = this.X.p;
        return (paint$Style0 == Paint.Style.FILL_AND_STROKE || paint$Style0 == Paint.Style.STROKE) && this.m0.getStrokeWidth() <= 0.0f;
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.X;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        this.X.getClass();
        if(this.X.a.d(this.f())) {
            float f = this.X.a.e.a(this.f()) * this.X.i;
            outline0.setRoundRect(this.getBounds(), f);
            return;
        }
        RectF rectF0 = this.f();
        Path path0 = this.e0;
        this.b(rectF0, path0);
        if(path0.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline0.setConvexPath(path0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        Rect rect1 = this.X.g;
        if(rect1 != null) {
            rect0.set(rect1);
            return true;
        }
        return super.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect rect0 = this.getBounds();
        this.i0.set(rect0);
        this.b(this.f(), this.e0);
        this.j0.setPath(this.e0, this.i0);
        this.i0.op(this.j0, Region.Op.DIFFERENCE);
        return this.i0;
    }

    public final void h(Context context0) {
        f f0 = this.X;
        f0.b = new A6.a(context0);
        this.m();
    }

    public final void i(float f) {
        f f1 = this.X;
        if(f1.m != f) {
            f1.m = f;
            this.m();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.c0 = true;
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if(!super.isStateful()) {
            ColorStateList colorStateList0 = this.X.e;
            if(colorStateList0 == null || !colorStateList0.isStateful()) {
                this.X.getClass();
                ColorStateList colorStateList1 = this.X.d;
                if(colorStateList1 == null || !colorStateList1.isStateful()) {
                    ColorStateList colorStateList2 = this.X.c;
                    return colorStateList2 != null && colorStateList2.isStateful();
                }
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList0) {
        f f0 = this.X;
        if(f0.c != colorStateList0) {
            f0.c = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public final boolean k(int[] arr_v) {
        boolean z;
        if(this.X.c == null) {
            z = false;
        }
        else {
            Paint paint0 = this.l0;
            int v = paint0.getColor();
            int v1 = this.X.c.getColorForState(arr_v, v);
            if(v == v1) {
                z = false;
            }
            else {
                paint0.setColor(v1);
                z = true;
            }
        }
        if(this.X.d != null) {
            Paint paint1 = this.m0;
            int v2 = paint1.getColor();
            int v3 = this.X.d.getColorForState(arr_v, v2);
            if(v2 != v3) {
                paint1.setColor(v3);
                return true;
            }
        }
        return z;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter0 = this.q0;
        PorterDuffColorFilter porterDuffColorFilter1 = this.r0;
        ColorStateList colorStateList0 = this.X.e;
        PorterDuff.Mode porterDuff$Mode0 = this.X.f;
        Paint paint0 = this.l0;
        if(colorStateList0 == null || porterDuff$Mode0 == null) {
            int v = paint0.getColor();
            int v1 = this.c(v);
            porterDuffColorFilter2 = v1 == v ? null : new PorterDuffColorFilter(v1, PorterDuff.Mode.SRC_IN);
        }
        else {
            porterDuffColorFilter2 = new PorterDuffColorFilter(this.c(colorStateList0.getColorForState(this.getState(), 0)), porterDuff$Mode0);
        }
        this.q0 = porterDuffColorFilter2;
        this.X.getClass();
        this.r0 = null;
        this.X.getClass();
        return !Objects.equals(porterDuffColorFilter0, this.q0) || !Objects.equals(porterDuffColorFilter1, this.r0);
    }

    public final void m() {
        float f = this.X.m + 0.0f;
        this.X.n = (int)Math.ceil(0.75f * f);
        this.X.o = (int)Math.ceil(f * 0.25f);
        this.l();
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        f f0 = this.X;
        f f1 = new f();  // initializer: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        f1.c = null;
        f1.d = null;
        f1.e = null;
        f1.f = PorterDuff.Mode.SRC_IN;
        f1.g = null;
        f1.h = 1.0f;
        f1.i = 1.0f;
        f1.k = 0xFF;
        f1.l = 0.0f;
        f1.m = 0.0f;
        f1.n = 0;
        f1.o = 0;
        f1.p = Paint.Style.FILL_AND_STROKE;
        f1.a = f0.a;
        f1.b = f0.b;
        f1.j = f0.j;
        f1.c = f0.c;
        f1.d = f0.d;
        f1.f = f0.f;
        f1.e = f0.e;
        f1.k = f0.k;
        f1.h = f0.h;
        f1.o = f0.o;
        f1.i = f0.i;
        f1.l = f0.l;
        f1.m = f0.m;
        f1.n = f0.n;
        f1.p = f0.p;
        if(f0.g != null) {
            f1.g = new Rect(f0.g);
        }
        this.X = f1;
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        this.c0 = true;
        super.onBoundsChange(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] arr_v) {
        boolean z = this.k(arr_v) || this.l();
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        f f0 = this.X;
        if(f0.k != v) {
            f0.k = v;
            super.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.X.getClass();
        super.invalidateSelf();
    }

    @Override  // H6.t
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel0) {
        this.X.a = shapeAppearanceModel0;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTint(int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        this.X.e = colorStateList0;
        this.l();
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        f f0 = this.X;
        if(f0.f != porterDuff$Mode0) {
            f0.f = porterDuff$Mode0;
            this.l();
            super.invalidateSelf();
        }
    }
}

