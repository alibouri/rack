package B6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import o.j0;
import p6.a;

public abstract class e extends j0 {
    public Drawable q0;
    public final Rect r0;
    public final Rect s0;
    public int t0;
    public final boolean u0;
    public boolean v0;

    public e(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.r0 = new Rect();
        this.s0 = new Rect();
        this.t0 = 0x77;
        this.u0 = true;
        this.v0 = false;
        l.a(context0, attributeSet0, 0, 0);
        l.b(context0, attributeSet0, a.l, 0, 0, new int[0]);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.l, 0, 0);
        this.t0 = typedArray0.getInt(1, this.t0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        if(drawable0 != null) {
            this.setForeground(drawable0);
        }
        this.u0 = typedArray0.getBoolean(2, true);
        typedArray0.recycle();
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        super.draw(canvas0);
        Drawable drawable0 = this.q0;
        if(drawable0 != null) {
            if(this.v0) {
                this.v0 = false;
                int v = this.getRight() - this.getLeft();
                int v1 = this.getBottom() - this.getTop();
                Rect rect0 = this.r0;
                if(this.u0) {
                    rect0.set(0, 0, v, v1);
                }
                else {
                    rect0.set(this.getPaddingLeft(), this.getPaddingTop(), v - this.getPaddingRight(), v1 - this.getPaddingBottom());
                }
                Gravity.apply(this.t0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), rect0, this.s0);
                drawable0.setBounds(this.s0);
            }
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.view.View
    public final void drawableHotspotChanged(float f, float f1) {
        super.drawableHotspotChanged(f, f1);
        Drawable drawable0 = this.q0;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.q0 != null && this.q0.isStateful()) {
            this.q0.setState(this.getDrawableState());
        }
    }

    @Override  // android.view.View
    public Drawable getForeground() {
        return this.q0;
    }

    @Override  // android.view.View
    public int getForegroundGravity() {
        return this.t0;
    }

    @Override  // android.view.ViewGroup
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.q0;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // o.j0
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.v0 |= z;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.v0 = true;
    }

    @Override  // android.view.View
    public void setForeground(Drawable drawable0) {
        Drawable drawable1 = this.q0;
        if(drawable1 != drawable0) {
            if(drawable1 != null) {
                drawable1.setCallback(null);
                this.unscheduleDrawable(this.q0);
            }
            this.q0 = drawable0;
            if(drawable0 == null) {
                this.setWillNotDraw(true);
            }
            else {
                this.setWillNotDraw(false);
                drawable0.setCallback(this);
                if(drawable0.isStateful()) {
                    drawable0.setState(this.getDrawableState());
                }
                if(this.t0 == 0x77) {
                    drawable0.getPadding(new Rect());
                }
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    @Override  // android.view.View
    public void setForegroundGravity(int v) {
        if(this.t0 != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.t0 = v;
            if(v == 0x77 && this.q0 != null) {
                Rect rect0 = new Rect();
                this.q0.getPadding(rect0);
            }
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    public final boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.q0;
    }
}

