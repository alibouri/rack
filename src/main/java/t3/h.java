package t3;

import A3.b;
import A3.j;
import E3.g;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import java.util.ArrayList;
import java.util.List;
import s.o;
import u3.a;
import u3.f;
import z3.d;

public final class h implements c, e, a {
    public final boolean a;
    public final o b;
    public final o c;
    public final Path d;
    public final j e;
    public final RectF f;
    public final ArrayList g;
    public final int h;
    public final u3.h i;
    public final f j;
    public final u3.h k;
    public final u3.h l;
    public final r3.j m;
    public final int n;
    public final f o;
    public float p;

    public h(r3.j j0, r3.a a0, b b0, d d0) {
        this.b = new o(null);
        this.c = new o(null);
        Path path0 = new Path();
        this.d = path0;
        this.e = new j(1, 2);
        this.f = new RectF();
        this.g = new ArrayList();
        this.p = 0.0f;
        d0.getClass();
        this.a = d0.g;
        this.m = j0;
        this.h = d0.a;
        path0.setFillType(d0.b);
        this.n = (int)(a0.b() / 32.0f);
        u3.e e0 = d0.c.e();
        this.i = (u3.h)e0;
        e0.a(this);
        b0.d(e0);
        u3.e e1 = d0.d.e();
        this.j = (f)e1;
        e1.a(this);
        b0.d(e1);
        u3.e e2 = d0.e.e();
        this.k = (u3.h)e2;
        e2.a(this);
        b0.d(e2);
        u3.e e3 = d0.f.e();
        this.l = (u3.h)e3;
        e3.a(this);
        b0.d(e3);
        if(b0.i() != null) {
            f f0 = ((y3.b)b0.i().Y).r();
            this.o = f0;
            f0.a(this);
            b0.d(f0);
        }
    }

    @Override  // t3.e
    public final void a(RectF rectF0, Matrix matrix0, boolean z) {
        Path path0 = this.d;
        path0.reset();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.g;
            if(v >= arrayList0.size()) {
                break;
            }
            path0.addPath(((l)arrayList0.get(v)).getPath(), matrix0);
        }
        path0.computeBounds(rectF0, false);
        rectF0.set(rectF0.left - 1.0f, rectF0.top - 1.0f, rectF0.right + 1.0f, rectF0.bottom + 1.0f);
    }

    @Override  // u3.a
    public final void b() {
        this.m.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        for(int v = 0; v < list1.size(); ++v) {
            c c0 = (c)list1.get(v);
            if(c0 instanceof l) {
                this.g.add(((l)c0));
            }
        }
    }

    public final int d() {
        int v = Math.round(this.k.d * ((float)this.n));
        int v1 = Math.round(this.l.d * ((float)this.n));
        int v2 = Math.round(this.i.d * ((float)this.n));
        int v3 = v == 0 ? 17 : 0x20F * v;
        if(v1 != 0) {
            v3 = v3 * 0x1F * v1;
        }
        return v2 == 0 ? v3 : v3 * 0x1F * v2;
    }

    @Override  // t3.e
    public final void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        Path path1;
        LinearGradient linearGradient0;
        if(this.a) {
            return;
        }
        Path path0 = this.d;
        path0.reset();
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.g;
            if(v1 >= arrayList0.size()) {
                break;
            }
            path0.addPath(((l)arrayList0.get(v1)).getPath(), matrix0);
        }
        path0.computeBounds(this.f, false);
        u3.h h0 = this.i;
        u3.h h1 = this.l;
        u3.h h2 = this.k;
        if(this.h == 1) {
            long v2 = (long)this.d();
            o o0 = this.b;
            linearGradient0 = (LinearGradient)o0.e(v2);
            if(linearGradient0 == null) {
                PointF pointF0 = (PointF)h2.d();
                PointF pointF1 = (PointF)h1.d();
                z3.c c0 = (z3.c)h0.d();
                LinearGradient linearGradient1 = new LinearGradient(pointF0.x, pointF0.y, pointF1.x, pointF1.y, c0.b, c0.a, Shader.TileMode.CLAMP);
                o0.j(v2, linearGradient1);
                linearGradient0 = linearGradient1;
            }
            path1 = path0;
        }
        else {
            long v3 = (long)this.d();
            o o1 = this.c;
            RadialGradient radialGradient0 = (RadialGradient)o1.e(v3);
            if(radialGradient0 == null) {
                PointF pointF2 = (PointF)h2.d();
                PointF pointF3 = (PointF)h1.d();
                z3.c c1 = (z3.c)h0.d();
                path1 = path0;
                RadialGradient radialGradient1 = new RadialGradient(pointF2.x, pointF2.y, (((float)Math.hypot(pointF3.x - pointF2.x, pointF3.y - pointF2.y)) <= 0.0f ? 0.001f : ((float)Math.hypot(pointF3.x - pointF2.x, pointF3.y - pointF2.y))), c1.b, c1.a, Shader.TileMode.CLAMP);
                o1.j(v3, radialGradient1);
                linearGradient0 = radialGradient1;
            }
            else {
                path1 = path0;
                linearGradient0 = radialGradient0;
            }
        }
        linearGradient0.setLocalMatrix(matrix0);
        j j0 = this.e;
        j0.setShader(linearGradient0);
        f f0 = this.o;
        if(f0 != null) {
            float f1 = (float)(((Float)f0.d()));
            if(f1 == 0.0f) {
                j0.setMaskFilter(null);
            }
            else if(f1 != this.p) {
                j0.setMaskFilter(new BlurMaskFilter(f1, BlurMaskFilter.Blur.NORMAL));
            }
            this.p = f1;
        }
        float f2 = ((float)(((int)(((Integer)this.j.d()))))) / 100.0f;
        j0.setAlpha(g.c(((int)(((float)v) * f2))));
        if(b0 != null) {
            b0.a(((int)(f2 * 255.0f)), j0);
        }
        canvas0.drawPath(path1, j0);
    }
}

