package o;

import J1.N;
import a8.Q;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import h.a;

public final class x extends s {
    public final w e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public x(w w0) {
        super(w0);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = w0;
    }

    @Override  // o.s
    public final void b(AttributeSet attributeSet0, int v) {
        super.b(attributeSet0, 0x7F040381);  // attr:seekBarStyle
        w w0 = this.e;
        Q q0 = Q.G(w0.getContext(), attributeSet0, a.g, 0x7F040381);  // attr:seekBarStyle
        N.j(w0, w0.getContext(), a.g, attributeSet0, ((TypedArray)q0.Z), 0x7F040381);  // attr:seekBarStyle
        Drawable drawable0 = q0.u(0);
        if(drawable0 != null) {
            w0.setThumb(drawable0);
        }
        Drawable drawable1 = q0.t(1);
        Drawable drawable2 = this.f;
        if(drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(w0);
            drawable1.setLayoutDirection(w0.getLayoutDirection());
            if(drawable1.isStateful()) {
                drawable1.setState(w0.getDrawableState());
            }
            this.f();
        }
        w0.invalidate();
        TypedArray typedArray0 = (TypedArray)q0.Z;
        if(typedArray0.hasValue(3)) {
            this.h = Y.c(typedArray0.getInt(3, -1), this.h);
            this.j = true;
        }
        if(typedArray0.hasValue(2)) {
            this.g = q0.p(2);
            this.i = true;
        }
        q0.I();
        this.f();
    }

    public final void f() {
        Drawable drawable0 = this.f;
        if(drawable0 != null && (this.i || this.j)) {
            Drawable drawable1 = drawable0.mutate();
            this.f = drawable1;
            if(this.i) {
                drawable1.setTintList(this.g);
            }
            if(this.j) {
                this.f.setTintMode(this.h);
            }
            if(this.f.isStateful()) {
                this.f.setState(this.e.getDrawableState());
            }
        }
    }

    public final void g(Canvas canvas0) {
        if(this.f != null) {
            w w0 = this.e;
            int v = w0.getMax();
            int v1 = 1;
            if(v > 1) {
                int v2 = this.f.getIntrinsicWidth();
                int v3 = this.f.getIntrinsicHeight();
                int v4 = v2 < 0 ? 1 : v2 / 2;
                if(v3 >= 0) {
                    v1 = v3 / 2;
                }
                this.f.setBounds(-v4, -v1, v4, v1);
                int v5 = w0.getWidth();
                int v6 = w0.getPaddingLeft();
                int v7 = w0.getPaddingRight();
                int v8 = canvas0.save();
                canvas0.translate(((float)w0.getPaddingLeft()), ((float)(w0.getHeight() / 2)));
                for(int v9 = 0; v9 <= v; ++v9) {
                    this.f.draw(canvas0);
                    canvas0.translate(((float)(v5 - v6 - v7)) / ((float)v), 0.0f);
                }
                canvas0.restoreToCount(v8);
            }
        }
    }
}

