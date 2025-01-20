package t3;

import A3.b;
import M4.s;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import r3.j;
import u3.a;
import u3.e;
import u3.h;

public final class f implements c, l, a {
    public final Path a;
    public final j b;
    public final h c;
    public final e d;
    public final z3.a e;
    public final s f;
    public boolean g;

    public f(j j0, b b0, z3.a a0) {
        this.a = new Path();
        this.f = new s(5, false);
        a0.getClass();
        this.b = j0;
        e e0 = a0.b.e();
        this.c = (h)e0;
        e e1 = a0.a.e();
        this.d = e1;
        this.e = a0;
        b0.d(e0);
        b0.d(e1);
        e0.a(this);
        e1.a(this);
    }

    @Override  // u3.a
    public final void b() {
        this.g = false;
        this.b.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        for(int v = 0; v < ((ArrayList)list0).size(); ++v) {
            c c0 = (c)((ArrayList)list0).get(v);
            if(c0 instanceof t3.s && ((t3.s)c0).c == 1) {
                this.f.X.add(((t3.s)c0));
                ((t3.s)c0).d(this);
            }
        }
    }

    @Override  // t3.l
    public final Path getPath() {
        Path path0 = this.a;
        if(this.g) {
            return path0;
        }
        path0.reset();
        z3.a a0 = this.e;
        if(a0.d) {
            this.g = true;
            return path0;
        }
        PointF pointF0 = (PointF)this.c.d();
        float f = pointF0.x / 2.0f;
        float f1 = pointF0.y / 2.0f;
        path0.reset();
        if(a0.c) {
            path0.moveTo(0.0f, -f1);
            float f2 = 0.0f - f * 0.55228f;
            float f3 = 0.0f - f1 * 0.55228f;
            path0.cubicTo(f2, -f1, -f, f3, -f, 0.0f);
            float f4 = f1 * 0.55228f + 0.0f;
            path0.cubicTo(-f, f4, f2, f1, 0.0f, f1);
            float f5 = f * 0.55228f + 0.0f;
            path0.cubicTo(f5, f1, f, f4, f, 0.0f);
            path0.cubicTo(f, f3, f5, -f1, 0.0f, -f1);
        }
        else {
            path0.moveTo(0.0f, -f1);
            float f6 = f * 0.55228f + 0.0f;
            float f7 = 0.0f - f1 * 0.55228f;
            path0.cubicTo(f6, -f1, f, f7, f, 0.0f);
            float f8 = f1 * 0.55228f + 0.0f;
            path0.cubicTo(f, f8, f6, f1, 0.0f, f1);
            float f9 = 0.0f - f * 0.55228f;
            path0.cubicTo(f9, f1, -f, f8, -f, 0.0f);
            path0.cubicTo(-f, f7, f9, -f1, 0.0f, -f1);
        }
        PointF pointF1 = (PointF)this.d.d();
        path0.offset(pointF1.x, pointF1.y);
        path0.close();
        this.f.i(path0);
        this.g = true;
        return path0;
    }
}

