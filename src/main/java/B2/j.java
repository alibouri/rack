package B2;

import A7.b;
import android.content.res.ColorStateList;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;

public final class j extends m {
    public b d;
    public float e;
    public b f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    // Deobfuscation rating: LOW(20)
    @Override  // B2.l
    public final boolean a() {
        return this.f.m() || this.d.m();
    }

    @Override  // B2.l
    public final boolean b(int[] arr_v) {
        int v2;
        b b0 = this.f;
        int v = 0;
        if(b0.m()) {
            ColorStateList colorStateList0 = (ColorStateList)b0.b0;
            int v1 = colorStateList0.getColorForState(arr_v, colorStateList0.getDefaultColor());
            if(v1 == b0.Y) {
                v2 = 0;
            }
            else {
                b0.Y = v1;
                v2 = 1;
            }
        }
        else {
            v2 = 0;
        }
        b b1 = this.d;
        if(b1.m()) {
            ColorStateList colorStateList1 = (ColorStateList)b1.b0;
            int v3 = colorStateList1.getColorForState(arr_v, colorStateList1.getDefaultColor());
            if(v3 != b1.Y) {
                b1.Y = v3;
                v = 1;
            }
        }
        return v2 | v;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.Y;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.Y;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int v) {
        this.f.Y = v;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int v) {
        this.d.Y = v;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}

