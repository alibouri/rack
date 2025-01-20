package com.skydoves.balloon.radius;

import I2.J;
import Nb.j;
import Nb.l;
import Nb.x;
import R2.k;
import Tb.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class RadiusLayout extends FrameLayout {
    public final Path b0;
    public final k c0;
    public static final e[] d0;

    static {
        l l0 = new l(RadiusLayout.class, "radius", "getRadius()F", 0);
        x.a.getClass();
        RadiusLayout.d0 = new e[]{l0};
    }

    public RadiusLayout(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        super(context0, attributeSet0, 0);
        this.b0 = new Path();
        this.c0 = J.S(this, 0.0f);
    }

    @Override  // android.view.ViewGroup
    public final void dispatchDraw(Canvas canvas0) {
        j.f(canvas0, "canvas");
        canvas0.clipPath(this.b0);
        super.dispatchDraw(canvas0);
    }

    public final float getRadius() {
        return ((Number)this.c0.K(RadiusLayout.d0[0], this)).floatValue();
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
        float f = this.getRadius();
        float f1 = this.getRadius();
        this.b0.addRoundRect(rectF0, f, f1, Path.Direction.CW);
    }

    public final void setRadius(float f) {
        this.c0.R(RadiusLayout.d0[0], f);
    }
}

