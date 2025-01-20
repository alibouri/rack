package t3;

import A3.b;
import M4.s;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import r3.j;
import u3.a;
import u3.e;
import u3.f;
import z3.i;

public final class n implements c, l, a {
    public final Path a;
    public final RectF b;
    public final boolean c;
    public final j d;
    public final e e;
    public final e f;
    public final f g;
    public final s h;
    public e i;
    public boolean j;

    public n(j j0, b b0, i i0) {
        this.a = new Path();
        this.b = new RectF();
        this.h = new s(5, false);
        this.i = null;
        i0.getClass();
        this.c = i0.c;
        this.d = j0;
        e e0 = i0.d.e();
        this.e = e0;
        e e1 = ((y3.a)i0.e).e();
        this.f = e1;
        f f0 = i0.b.r();
        this.g = f0;
        b0.d(e0);
        b0.d(e1);
        b0.d(f0);
        e0.a(this);
        e1.a(this);
        f0.a(this);
    }

    @Override  // u3.a
    public final void b() {
        this.j = false;
        this.d.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        for(int v = 0; v < ((ArrayList)list0).size(); ++v) {
            c c0 = (c)((ArrayList)list0).get(v);
            if(c0 instanceof t3.s && ((t3.s)c0).c == 1) {
                this.h.X.add(((t3.s)c0));
                ((t3.s)c0).d(this);
            }
            else if(c0 instanceof p) {
                this.i = ((p)c0).b;
            }
        }
    }

    @Override  // t3.l
    public final Path getPath() {
        Path path0 = this.a;
        if(this.j) {
            return path0;
        }
        path0.reset();
        if(this.c) {
            this.j = true;
            return path0;
        }
        PointF pointF0 = (PointF)this.f.d();
        float f = pointF0.x / 2.0f;
        float f1 = pointF0.y / 2.0f;
        float f2 = this.g == null ? 0.0f : this.g.i();
        if(f2 == 0.0f) {
            e e0 = this.i;
            if(e0 != null) {
                f2 = Math.min(((float)(((Float)e0.d()))), Math.min(f, f1));
            }
        }
        float f3 = Math.min(f, f1);
        if(f2 > f3) {
            f2 = f3;
        }
        PointF pointF1 = (PointF)this.e.d();
        path0.moveTo(pointF1.x + f, pointF1.y - f1 + f2);
        path0.lineTo(pointF1.x + f, pointF1.y + f1 - f2);
        int v = Float.compare(f2, 0.0f);
        RectF rectF0 = this.b;
        if(v > 0) {
            float f4 = pointF1.x + f;
            float f5 = pointF1.y + f1;
            rectF0.set(f4 - f2 * 2.0f, f5 - f2 * 2.0f, f4, f5);
            path0.arcTo(rectF0, 0.0f, 90.0f, false);
        }
        path0.lineTo(pointF1.x - f + f2, pointF1.y + f1);
        if(v > 0) {
            float f6 = pointF1.x - f;
            float f7 = pointF1.y + f1;
            rectF0.set(f6, f7 - f2 * 2.0f, f2 * 2.0f + f6, f7);
            path0.arcTo(rectF0, 90.0f, 90.0f, false);
        }
        path0.lineTo(pointF1.x - f, pointF1.y - f1 + f2);
        if(v > 0) {
            float f8 = pointF1.x - f;
            float f9 = pointF1.y - f1;
            rectF0.set(f8, f9, f8 + f2 * 2.0f, f2 * 2.0f + f9);
            path0.arcTo(rectF0, 180.0f, 90.0f, false);
        }
        path0.lineTo(pointF1.x + f - f2, pointF1.y - f1);
        if(v > 0) {
            float f10 = pointF1.x + f;
            float f11 = pointF1.y - f1;
            rectF0.set(f10 - f2 * 2.0f, f11, f10, f2 * 2.0f + f11);
            path0.arcTo(rectF0, 270.0f, 90.0f, false);
        }
        path0.close();
        this.h.i(path0);
        this.j = true;
        return path0;
    }
}

