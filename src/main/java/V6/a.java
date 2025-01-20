package v6;

import Bb.F;
import H6.f;
import H6.t;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class a {
    public final MaterialButton a;
    public ShapeAppearanceModel b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public MaterialShapeDrawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public RippleDrawable r;
    public int s;

    public a(MaterialButton materialButton0, ShapeAppearanceModel shapeAppearanceModel0) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.a = materialButton0;
        this.b = shapeAppearanceModel0;
    }

    public final t a() {
        if(this.r != null && this.r.getNumberOfLayers() > 1) {
            return this.r.getNumberOfLayers() <= 2 ? ((t)this.r.getDrawable(1)) : ((t)this.r.getDrawable(2));
        }
        return null;
    }

    public final MaterialShapeDrawable b(boolean z) {
        return this.r == null || this.r.getNumberOfLayers() <= 0 ? null : ((MaterialShapeDrawable)((LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable()).getDrawable(!z));
    }

    public final void c(ShapeAppearanceModel shapeAppearanceModel0) {
        this.b = shapeAppearanceModel0;
        if(this.b(false) != null) {
            this.b(false).setShapeAppearanceModel(shapeAppearanceModel0);
        }
        if(this.b(true) != null) {
            this.b(true).setShapeAppearanceModel(shapeAppearanceModel0);
        }
        if(this.a() != null) {
            this.a().setShapeAppearanceModel(shapeAppearanceModel0);
        }
    }

    public final void d(int v, int v1) {
        MaterialButton materialButton0 = this.a;
        int v2 = materialButton0.getPaddingStart();
        int v3 = materialButton0.getPaddingTop();
        int v4 = materialButton0.getPaddingEnd();
        int v5 = materialButton0.getPaddingBottom();
        int v6 = this.e;
        int v7 = this.f;
        this.f = v1;
        this.e = v;
        if(!this.o) {
            this.e();
        }
        materialButton0.setPaddingRelative(v2, v3 + v - v6, v4, v5 + v1 - v7);
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(this.b);
        MaterialButton materialButton0 = this.a;
        materialShapeDrawable0.h(materialButton0.getContext());
        materialShapeDrawable0.setTintList(this.j);
        PorterDuff.Mode porterDuff$Mode0 = this.i;
        if(porterDuff$Mode0 != null) {
            materialShapeDrawable0.setTintMode(porterDuff$Mode0);
        }
        ColorStateList colorStateList0 = this.k;
        materialShapeDrawable0.X.j = (float)this.h;
        materialShapeDrawable0.invalidateSelf();
        f f0 = materialShapeDrawable0.X;
        if(f0.d != colorStateList0) {
            f0.d = colorStateList0;
            materialShapeDrawable0.onStateChange(materialShapeDrawable0.getState());
        }
        MaterialShapeDrawable materialShapeDrawable1 = new MaterialShapeDrawable(this.b);
        materialShapeDrawable1.setTint(0);
        float f1 = (float)this.h;
        int v = this.n ? F.u(materialButton0, 0x7F040101) : 0;  // attr:colorSurface
        materialShapeDrawable1.X.j = f1;
        materialShapeDrawable1.invalidateSelf();
        ColorStateList colorStateList1 = ColorStateList.valueOf(v);
        f f2 = materialShapeDrawable1.X;
        if(f2.d != colorStateList1) {
            f2.d = colorStateList1;
            materialShapeDrawable1.onStateChange(materialShapeDrawable1.getState());
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.b);
        this.m = materialShapeDrawable2;
        materialShapeDrawable2.setTint(-1);
        RippleDrawable rippleDrawable0 = new RippleDrawable(F6.a.a(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{materialShapeDrawable1, materialShapeDrawable0}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable0;
        materialButton0.setInternalBackground(rippleDrawable0);
        MaterialShapeDrawable materialShapeDrawable3 = this.b(false);
        if(materialShapeDrawable3 != null) {
            materialShapeDrawable3.i(((float)this.s));
        }
    }

    public final void f() {
        int v = 0;
        MaterialShapeDrawable materialShapeDrawable0 = this.b(false);
        MaterialShapeDrawable materialShapeDrawable1 = this.b(true);
        if(materialShapeDrawable0 != null) {
            ColorStateList colorStateList0 = this.k;
            materialShapeDrawable0.X.j = (float)this.h;
            materialShapeDrawable0.invalidateSelf();
            f f0 = materialShapeDrawable0.X;
            if(f0.d != colorStateList0) {
                f0.d = colorStateList0;
                materialShapeDrawable0.onStateChange(materialShapeDrawable0.getState());
            }
            if(materialShapeDrawable1 != null) {
                float f1 = (float)this.h;
                if(this.n) {
                    v = F.u(this.a, 0x7F040101);  // attr:colorSurface
                }
                materialShapeDrawable1.X.j = f1;
                materialShapeDrawable1.invalidateSelf();
                ColorStateList colorStateList1 = ColorStateList.valueOf(v);
                f f2 = materialShapeDrawable1.X;
                if(f2.d != colorStateList1) {
                    f2.d = colorStateList1;
                    materialShapeDrawable1.onStateChange(materialShapeDrawable1.getState());
                }
            }
        }
    }
}

