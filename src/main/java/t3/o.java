package t3;

import A3.b;
import E3.g;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import u3.a;
import u3.f;
import u3.n;
import z3.i;

public final class o implements c, e, j, l, a {
    public final Matrix a;
    public final Path b;
    public final r3.j c;
    public final b d;
    public final boolean e;
    public final f f;
    public final f g;
    public final n h;
    public d i;

    public o(r3.j j0, b b0, i i0) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = j0;
        this.d = b0;
        i0.getClass();
        this.e = i0.c;
        f f0 = i0.b.r();
        this.f = f0;
        b0.d(f0);
        f0.a(this);
        f f1 = ((y3.b)i0.d).r();
        this.g = f1;
        b0.d(f1);
        f1.a(this);
        ((y3.d)i0.e).getClass();
        n n0 = new n(((y3.d)i0.e));
        this.h = n0;
        n0.a(b0);
        n0.b(this);
    }

    @Override  // t3.e
    public final void a(RectF rectF0, Matrix matrix0, boolean z) {
        this.i.a(rectF0, matrix0, z);
    }

    @Override  // u3.a
    public final void b() {
        this.c.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        this.i.c(list0, list1);
    }

    @Override  // t3.j
    public final void d(ListIterator listIterator0) {
        if(this.i != null) {
            return;
        }
        while(listIterator0.hasPrevious() && listIterator0.previous() != this) {
        }
        ArrayList arrayList0 = new ArrayList();
        while(listIterator0.hasPrevious()) {
            arrayList0.add(((c)listIterator0.previous()));
            listIterator0.remove();
        }
        Collections.reverse(arrayList0);
        this.i = new d(this.c, this.d, this.e, arrayList0, null);
    }

    @Override  // t3.e
    public final void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        float f = (float)(((Float)this.f.d()));
        float f1 = (float)(((Float)this.g.d()));
        n n0 = this.h;
        float f2 = (float)(((Float)n0.m.d()));
        float f3 = (float)(((Float)n0.n.d()));
        for(int v1 = ((int)f) - 1; v1 >= 0; --v1) {
            this.a.set(matrix0);
            Matrix matrix1 = n0.e(((float)v1) + f1);
            this.a.preConcat(matrix1);
            this.i.e(canvas0, this.a, ((int)(g.e(f2 / 100.0f, f3 / 100.0f, ((float)v1) / f) * ((float)v))), b0);
        }
    }

    @Override  // t3.l
    public final Path getPath() {
        Path path0 = this.i.getPath();
        Path path1 = this.b;
        path1.reset();
        float f = (float)(((Float)this.f.d()));
        float f1 = (float)(((Float)this.g.d()));
        for(int v = ((int)f) - 1; v >= 0; --v) {
            Matrix matrix0 = this.h.e(((float)v) + f1);
            this.a.set(matrix0);
            path1.addPath(path0, this.a);
        }
        return path1;
    }
}

