package t3;

import A3.b;
import A3.j;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import u3.a;
import u3.f;
import z3.l;

public final class g implements c, e, a {
    public final Path a;
    public final j b;
    public final b c;
    public final boolean d;
    public final ArrayList e;
    public final f f;
    public final f g;
    public final r3.j h;
    public final f i;
    public float j;

    public g(r3.j j0, b b0, l l0) {
        Path path0 = new Path();
        this.a = path0;
        this.b = new j(1, 2);
        this.e = new ArrayList();
        this.c = b0;
        l0.getClass();
        this.d = l0.e;
        this.h = j0;
        if(b0.i() != null) {
            f f0 = ((y3.b)b0.i().Y).r();
            this.i = f0;
            f0.a(this);
            b0.d(f0);
        }
        y3.a a0 = l0.c;
        if(a0 != null) {
            path0.setFillType(l0.b);
            u3.e e0 = a0.e();
            this.f = (f)e0;
            e0.a(this);
            b0.d(e0);
            u3.e e1 = l0.d.e();
            this.g = (f)e1;
            e1.a(this);
            b0.d(e1);
            return;
        }
        this.f = null;
        this.g = null;
    }

    @Override  // t3.e
    public final void a(RectF rectF0, Matrix matrix0, boolean z) {
        Path path0 = this.a;
        path0.reset();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.e;
            if(v >= arrayList0.size()) {
                break;
            }
            path0.addPath(((t3.l)arrayList0.get(v)).getPath(), matrix0);
        }
        path0.computeBounds(rectF0, false);
        rectF0.set(rectF0.left - 1.0f, rectF0.top - 1.0f, rectF0.right + 1.0f, rectF0.bottom + 1.0f);
    }

    @Override  // u3.a
    public final void b() {
        this.h.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        for(int v = 0; v < list1.size(); ++v) {
            c c0 = (c)list1.get(v);
            if(c0 instanceof t3.l) {
                this.e.add(((t3.l)c0));
            }
        }
    }

    @Override  // t3.e
    public final void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        BlurMaskFilter blurMaskFilter0;
        if(this.d) {
            return;
        }
        F3.a a0 = this.f.c.d();
        float f = this.f.b();
        int v1 = this.f.k(a0, f);
        float f1 = ((float)(((int)(((Integer)this.g.d()))))) / 100.0f;
        j j0 = this.b;
        j0.setColor(E3.g.c(((int)(((float)v) * f1))) << 24 | v1 & 0xFFFFFF);
        f f2 = this.i;
        if(f2 != null) {
            float f3 = (float)(((Float)f2.d()));
            if(f3 == 0.0f) {
                j0.setMaskFilter(null);
            }
            else if(f3 != this.j) {
                b b1 = this.c;
                if(b1.A == f3) {
                    blurMaskFilter0 = b1.B;
                }
                else {
                    BlurMaskFilter blurMaskFilter1 = new BlurMaskFilter(f3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    b1.B = blurMaskFilter1;
                    b1.A = f3;
                    blurMaskFilter0 = blurMaskFilter1;
                }
                j0.setMaskFilter(blurMaskFilter0);
            }
            this.j = f3;
        }
        if(b0 == null) {
            j0.clearShadowLayer();
        }
        else {
            b0.a(((int)(f1 * 255.0f)), j0);
        }
        Path path0 = this.a;
        path0.reset();
        for(int v2 = 0; true; ++v2) {
            ArrayList arrayList0 = this.e;
            if(v2 >= arrayList0.size()) {
                break;
            }
            path0.addPath(((t3.l)arrayList0.get(v2)).getPath(), matrix0);
        }
        canvas0.drawPath(path0, j0);
    }
}

