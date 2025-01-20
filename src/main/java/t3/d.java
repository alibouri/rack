package t3;

import A0.b;
import E3.j;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import u3.a;
import u3.n;
import z3.m;

public final class d implements e, l, a {
    public final b a;
    public final RectF b;
    public final j c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final boolean g;
    public final ArrayList h;
    public final r3.j i;
    public ArrayList j;
    public final n k;

    public d(r3.j j0, A3.b b0, m m0, r3.a a0) {
        y3.d d0;
        List list0 = m0.b;
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            c c0 = ((z3.b)list0.get(v1)).a(j0, a0, b0);
            if(c0 != null) {
                arrayList0.add(c0);
            }
        }
        for(int v = 0; true; ++v) {
            d0 = null;
            if(v >= list0.size()) {
                break;
            }
            z3.b b1 = (z3.b)list0.get(v);
            if(b1 instanceof y3.d) {
                d0 = (y3.d)b1;
                break;
            }
        }
        this(j0, b0, m0.c, arrayList0, d0);
    }

    public d(r3.j j0, A3.b b0, boolean z, ArrayList arrayList0, y3.d d0) {
        this.a = new b(2, false);
        this.b = new RectF();
        this.c = new j();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.i = j0;
        this.g = z;
        this.h = arrayList0;
        if(d0 != null) {
            n n0 = new n(d0);
            this.k = n0;
            n0.a(b0);
            n0.b(this);
        }
        ArrayList arrayList1 = new ArrayList();
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            c c0 = (c)arrayList0.get(v);
            if(c0 instanceof t3.j) {
                arrayList1.add(((t3.j)c0));
            }
        }
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            ((t3.j)arrayList1.get(v1)).d(arrayList0.listIterator(arrayList0.size()));
        }
    }

    @Override  // t3.e
    public final void a(RectF rectF0, Matrix matrix0, boolean z) {
        Matrix matrix1 = this.d;
        matrix1.set(matrix0);
        n n0 = this.k;
        if(n0 != null) {
            matrix1.preConcat(n0.d());
        }
        RectF rectF1 = this.f;
        rectF1.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList0 = this.h;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            c c0 = (c)arrayList0.get(v);
            if(c0 instanceof e) {
                ((e)c0).a(rectF1, matrix1, z);
                rectF0.union(rectF1);
            }
        }
    }

    @Override  // u3.a
    public final void b() {
        this.i.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        ArrayList arrayList0 = this.h;
        ArrayList arrayList1 = new ArrayList(arrayList0.size() + list0.size());
        arrayList1.addAll(list0);
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            c c0 = (c)arrayList0.get(v);
            c0.c(arrayList1, arrayList0.subList(0, v));
            arrayList1.add(c0);
        }
    }

    public final List d() {
        if(this.j == null) {
            this.j = new ArrayList();
            for(int v = 0; true; ++v) {
                ArrayList arrayList0 = this.h;
                if(v >= arrayList0.size()) {
                    break;
                }
                c c0 = (c)arrayList0.get(v);
                if(c0 instanceof l) {
                    this.j.add(((l)c0));
                }
            }
        }
        return this.j;
    }

    @Override  // t3.e
    public final void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        if(this.g) {
            return;
        }
        Matrix matrix1 = this.d;
        matrix1.set(matrix0);
        n n0 = this.k;
        if(n0 != null) {
            matrix1.preConcat(n0.d());
            v = (int)(((float)(n0.j == null ? 100 : ((int)(((Integer)n0.j.d()))))) / 100.0f * ((float)v) / 255.0f * 255.0f);
        }
        int v1 = 0xFF;
        boolean z = this.i.m0 && this.f() && v == 0xFF || b0 != null && this.i.n0 && this.f();
        if(!z) {
            v1 = v;
        }
        j j0 = this.c;
        if(z) {
            RectF rectF0 = this.b;
            rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.a(rectF0, matrix0, true);
            b b1 = this.a;
            b1.X = v;
            if(b0 == null) {
                b1.Y = null;
            }
            else {
                b1.Y = Color.alpha(b0.d) > 0 ? b0 : null;
                b0 = null;
            }
            canvas0 = j0.e(canvas0, rectF0, b1);
        }
        else if(b0 != null) {
            E3.b b2 = new E3.b(b0);
            b2.b(v1);
            b0 = b2;
        }
        ArrayList arrayList0 = this.h;
        for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
            Object object0 = arrayList0.get(v2);
            if(object0 instanceof e) {
                ((e)object0).e(canvas0, matrix1, v1, b0);
            }
        }
        if(z) {
            j0.c();
        }
    }

    public final boolean f() {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.h;
            if(v >= arrayList0.size()) {
                break;
            }
            if(arrayList0.get(v) instanceof e) {
                ++v1;
                if(v1 >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // t3.l
    public final Path getPath() {
        Matrix matrix0 = this.d;
        matrix0.reset();
        n n0 = this.k;
        if(n0 != null) {
            matrix0.set(n0.d());
        }
        Path path0 = this.e;
        path0.reset();
        if(this.g) {
            return path0;
        }
        ArrayList arrayList0 = this.h;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            c c0 = (c)arrayList0.get(v);
            if(c0 instanceof l) {
                path0.addPath(((l)c0).getPath(), matrix0);
            }
        }
        return path0;
    }
}

