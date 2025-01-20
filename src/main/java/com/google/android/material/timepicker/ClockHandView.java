package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import p6.a;

class ClockHandView extends View {
    public final ArrayList b0;
    public final int c0;
    public final float d0;
    public final Paint e0;
    public final RectF f0;
    public final int g0;
    public float h0;
    public boolean i0;
    public double j0;
    public int k0;

    public ClockHandView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F0402C8);  // attr:materialClockStyle
        this.b0 = new ArrayList();
        Paint paint0 = new Paint();
        this.e0 = paint0;
        this.f0 = new RectF();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.h, 0x7F0402C8, 0x7F130344);  // attr:materialClockStyle
        this.k0 = typedArray0.getDimensionPixelSize(1, 0);
        this.c0 = typedArray0.getDimensionPixelSize(2, 0);
        Resources resources0 = this.getResources();
        this.g0 = resources0.getDimensionPixelSize(0x7F0700E7);  // dimen:material_clock_hand_stroke_width
        this.d0 = (float)resources0.getDimensionPixelSize(0x7F0700E5);  // dimen:material_clock_hand_center_dot_radius
        int v = typedArray0.getColor(0, 0);
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        this.a(0.0f);
        ViewConfiguration.get(context0).getScaledTouchSlop();
        this.setImportantForAccessibility(2);
        typedArray0.recycle();
    }

    public final void a(float f) {
        this.h0 = f % 360.0f;
        this.j0 = Math.toRadians(f % 360.0f - 90.0f);
        int v = this.getHeight();
        int v1 = this.getWidth();
        float f1 = ((float)this.k0) * ((float)Math.cos(this.j0)) + ((float)(v1 / 2));
        float f2 = ((float)this.k0) * ((float)Math.sin(this.j0)) + ((float)(v / 2));
        this.f0.set(f1 - ((float)this.c0), f2 - ((float)this.c0), f1 + ((float)this.c0), f2 + ((float)this.c0));
        for(Object object0: this.b0) {
            ClockFaceView clockFaceView0 = (ClockFaceView)(((d)object0));
            if(Math.abs(clockFaceView0.G0 - f % 360.0f) > 0.001f) {
                clockFaceView0.G0 = f % 360.0f;
                clockFaceView0.m();
            }
        }
        this.invalidate();
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getHeight();
        int v1 = this.getWidth();
        float f = ((float)this.k0) * ((float)Math.cos(this.j0)) + ((float)(v1 / 2));
        float f1 = ((float)this.k0) * ((float)Math.sin(this.j0)) + ((float)(v / 2));
        this.e0.setStrokeWidth(0.0f);
        canvas0.drawCircle(f, f1, ((float)this.c0), this.e0);
        double f2 = Math.sin(this.j0);
        double f3 = Math.cos(this.j0);
        double f4 = (double)(((float)(this.k0 - this.c0)));
        this.e0.setStrokeWidth(((float)this.g0));
        canvas0.drawLine(((float)(v1 / 2)), ((float)(v / 2)), ((float)(v1 / 2 + ((int)(f3 * f4)))), ((float)(v / 2 + ((int)(f4 * f2)))), this.e0);
        canvas0.drawCircle(((float)(v1 / 2)), ((float)(v / 2)), this.d0, this.e0);
    }

    @Override  // android.view.View
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.a(this.h0);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        boolean z1;
        int v = motionEvent0.getActionMasked();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        boolean z = false;
        switch(v) {
            case 0: {
                this.i0 = false;
                z2 = true;
                z1 = false;
                break;
            }
            case 1: 
            case 2: {
                z1 = this.i0;
                z2 = false;
                break;
            }
            default: {
                z1 = false;
                z2 = false;
            }
        }
        boolean z3 = this.i0;
        int v1 = this.getWidth();
        int v2 = (int)Math.toDegrees(Math.atan2(f1 - ((float)(this.getHeight() / 2)), f - ((float)(v1 / 2))));
        int v3 = v2 + 90 >= 0 ? v2 + 90 : v2 + 450;
        boolean z4 = this.h0 != ((float)v3);
        if(z2 && z4) {
            z = true;
        }
        else if(z4 || z1) {
            this.a(((float)v3));
            z = true;
        }
        this.i0 = z3 | z;
        return true;
    }
}

