package u3;

import android.graphics.Matrix;
import android.graphics.PointF;
import y3.a;
import y3.b;
import y3.d;

public final class n {
    public final Matrix a;
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public final i f;
    public final e g;
    public final h h;
    public final f i;
    public final f j;
    public final f k;
    public final f l;
    public final f m;
    public final f n;
    public final boolean o;

    public n(d d0) {
        this.a = new Matrix();
        this.f = (i)(d0.a == null ? null : d0.a.e());
        this.g = d0.b == null ? null : d0.b.e();
        this.h = (h)(d0.c == null ? null : d0.c.e());
        this.i = d0.d == null ? null : d0.d.r();
        f f0 = d0.f == null ? null : d0.f.r();
        this.k = f0;
        this.o = d0.j;
        if(f0 == null) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        else {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        }
        this.l = d0.g == null ? null : d0.g.r();
        a a0 = d0.e;
        if(a0 != null) {
            this.j = (f)a0.e();
        }
        b b0 = d0.h;
        this.m = b0 == null ? null : b0.r();
        b b1 = d0.i;
        if(b1 != null) {
            this.n = b1.r();
            return;
        }
        this.n = null;
    }

    public final void a(A3.b b0) {
        b0.d(this.j);
        b0.d(this.m);
        b0.d(this.n);
        b0.d(this.f);
        b0.d(this.g);
        b0.d(this.h);
        b0.d(this.i);
        b0.d(this.k);
        b0.d(this.l);
    }

    public final void b(u3.a a0) {
        f f0 = this.j;
        if(f0 != null) {
            f0.a(a0);
        }
        f f1 = this.m;
        if(f1 != null) {
            f1.a(a0);
        }
        f f2 = this.n;
        if(f2 != null) {
            f2.a(a0);
        }
        i i0 = this.f;
        if(i0 != null) {
            i0.a(a0);
        }
        e e0 = this.g;
        if(e0 != null) {
            e0.a(a0);
        }
        h h0 = this.h;
        if(h0 != null) {
            h0.a(a0);
        }
        f f3 = this.i;
        if(f3 != null) {
            f3.a(a0);
        }
        f f4 = this.k;
        if(f4 != null) {
            f4.a(a0);
        }
        f f5 = this.l;
        if(f5 != null) {
            f5.a(a0);
        }
    }

    public final void c() {
        for(int v = 0; v < 9; ++v) {
            this.e[v] = 0.0f;
        }
    }

    public final Matrix d() {
        Matrix matrix0 = this.a;
        matrix0.reset();
        e e0 = this.g;
        if(e0 != null) {
            PointF pointF0 = (PointF)e0.d();
            if(pointF0 != null) {
                float f = pointF0.x;
                if(f == 0.0f || pointF0.y != 0.0f) {
                    matrix0.preTranslate(f, pointF0.y);
                }
            }
        }
        if(!this.o) {
            f f4 = this.i;
            if(f4 != null) {
                float f5 = f4.i();
                if(f5 != 0.0f) {
                    matrix0.preRotate(f5);
                }
            }
        }
        else if(e0 != null) {
            float f1 = e0.d;
            PointF pointF1 = (PointF)e0.d();
            float f2 = pointF1.x;
            float f3 = pointF1.y;
            e0.g(0.0001f + f1);
            PointF pointF2 = (PointF)e0.d();
            e0.g(f1);
            matrix0.preRotate(((float)Math.toDegrees(Math.atan2(pointF2.y - f3, pointF2.x - f2))));
        }
        f f6 = this.k;
        if(f6 != null) {
            float f7 = this.l == null ? 0.0f : ((float)Math.cos(Math.toRadians(-this.l.i() + 90.0f)));
            float f8 = this.l == null ? 1.0f : ((float)Math.sin(Math.toRadians(-this.l.i() + 90.0f)));
            double f9 = Math.toRadians(f6.i());
            this.c();
            this.e[0] = f7;
            this.e[1] = f8;
            this.e[3] = -f8;
            this.e[4] = f7;
            this.e[8] = 1.0f;
            this.b.setValues(this.e);
            this.c();
            this.e[0] = 1.0f;
            this.e[3] = (float)Math.tan(f9);
            this.e[4] = 1.0f;
            this.e[8] = 1.0f;
            this.c.setValues(this.e);
            this.c();
            this.e[0] = f7;
            this.e[1] = -f8;
            this.e[3] = f8;
            this.e[4] = f7;
            this.e[8] = 1.0f;
            this.d.setValues(this.e);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            matrix0.preConcat(this.d);
        }
        h h0 = this.h;
        if(h0 != null) {
            F3.b b0 = (F3.b)h0.d();
            if(b0 != null) {
                float f10 = b0.a;
                if(f10 == 1.0f || b0.b != 1.0f) {
                    matrix0.preScale(f10, b0.b);
                }
            }
        }
        i i0 = this.f;
        if(i0 != null) {
            PointF pointF3 = (PointF)i0.d();
            if(pointF3 != null) {
                float f11 = pointF3.x;
                if(f11 == 0.0f || pointF3.y != 0.0f) {
                    matrix0.preTranslate(-f11, -pointF3.y);
                }
            }
        }
        return matrix0;
    }

    public final Matrix e(float f) {
        PointF pointF0 = null;
        PointF pointF1 = this.g == null ? null : ((PointF)this.g.d());
        F3.b b0 = this.h == null ? null : ((F3.b)this.h.d());
        Matrix matrix0 = this.a;
        matrix0.reset();
        if(pointF1 != null) {
            matrix0.preTranslate(pointF1.x * f, pointF1.y * f);
        }
        if(b0 != null) {
            matrix0.preScale(((float)Math.pow(b0.a, f)), ((float)Math.pow(b0.b, f)));
        }
        f f1 = this.i;
        if(f1 != null) {
            float f2 = (float)(((Float)f1.d()));
            i i0 = this.f;
            if(i0 != null) {
                pointF0 = (PointF)i0.d();
            }
            float f3 = 0.0f;
            float f4 = pointF0 == null ? 0.0f : pointF0.x;
            if(pointF0 != null) {
                f3 = pointF0.y;
            }
            matrix0.preRotate(f2 * f, f4, f3);
        }
        return matrix0;
    }
}

