package t3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import r3.j;
import s.o;
import u3.h;
import z3.c;
import z3.e;

public final class i extends b {
    public final boolean p;
    public final o q;
    public final o r;
    public final RectF s;
    public final int t;
    public final int u;
    public final h v;
    public final h w;
    public final h x;

    public i(j j0, A3.b b0, e e0) {
        Paint.Join paint$Join0;
        Paint.Cap paint$Cap0;
        switch(v.h.d(e0.g)) {
            case 0: {
                paint$Cap0 = Paint.Cap.BUTT;
                break;
            }
            case 1: {
                paint$Cap0 = Paint.Cap.ROUND;
                break;
            }
            default: {
                paint$Cap0 = Paint.Cap.SQUARE;
            }
        }
        int v = v.h.d(e0.h);
        switch(v) {
            case 0: {
                paint$Join0 = Paint.Join.MITER;
                break;
            }
            case 1: {
                paint$Join0 = Paint.Join.ROUND;
                break;
            }
            default: {
                paint$Join0 = v == 2 ? Paint.Join.BEVEL : null;
            }
        }
        super(j0, b0, paint$Cap0, paint$Join0, e0.i, e0.c, e0.f, e0.j, e0.k);
        this.q = new o(null);
        this.r = new o(null);
        this.s = new RectF();
        this.t = e0.a;
        this.p = e0.l;
        this.u = (int)(j0.X.b() / 32.0f);
        u3.e e1 = e0.b.e();
        this.v = (h)e1;
        e1.a(this);
        b0.d(e1);
        u3.e e2 = e0.d.e();
        this.w = (h)e2;
        e2.a(this);
        b0.d(e2);
        u3.e e3 = e0.e.e();
        this.x = (h)e3;
        e3.a(this);
        b0.d(e3);
    }

    public final int d() {
        int v = Math.round(this.w.d * ((float)this.u));
        int v1 = Math.round(this.x.d * ((float)this.u));
        int v2 = Math.round(this.v.d * ((float)this.u));
        int v3 = v == 0 ? 17 : 0x20F * v;
        if(v1 != 0) {
            v3 = v3 * 0x1F * v1;
        }
        return v2 == 0 ? v3 : v3 * 0x1F * v2;
    }

    @Override  // t3.b
    public final void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        LinearGradient linearGradient0;
        if(this.p) {
            return;
        }
        this.a(this.s, matrix0, false);
        h h0 = this.v;
        h h1 = this.x;
        h h2 = this.w;
        if(this.t == 1) {
            long v1 = (long)this.d();
            o o0 = this.q;
            linearGradient0 = (LinearGradient)o0.e(v1);
            if(linearGradient0 == null) {
                PointF pointF0 = (PointF)h2.d();
                PointF pointF1 = (PointF)h1.d();
                c c0 = (c)h0.d();
                linearGradient0 = new LinearGradient(pointF0.x, pointF0.y, pointF1.x, pointF1.y, c0.b, c0.a, Shader.TileMode.CLAMP);
                o0.j(v1, linearGradient0);
            }
        }
        else {
            long v2 = (long)this.d();
            o o1 = this.r;
            linearGradient0 = (RadialGradient)o1.e(v2);
            if(linearGradient0 == null) {
                PointF pointF2 = (PointF)h2.d();
                PointF pointF3 = (PointF)h1.d();
                c c1 = (c)h0.d();
                linearGradient0 = new RadialGradient(pointF2.x, pointF2.y, ((float)Math.hypot(pointF3.x - pointF2.x, pointF3.y - pointF2.y)), c1.b, c1.a, Shader.TileMode.CLAMP);
                o1.j(v2, linearGradient0);
            }
        }
        this.i.setShader(linearGradient0);
        super.e(canvas0, matrix0, v, b0);
    }
}

