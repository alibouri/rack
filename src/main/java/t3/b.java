package t3;

import E3.g;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import r3.j;
import u3.a;
import u3.f;

public abstract class b implements c, e, a {
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final j e;
    public final A3.b f;
    public final ArrayList g;
    public final float[] h;
    public final A3.j i;
    public final f j;
    public final f k;
    public final ArrayList l;
    public final f m;
    public final f n;
    public float o;

    public b(j j0, A3.b b0, Paint.Cap paint$Cap0, Paint.Join paint$Join0, float f, y3.a a0, y3.b b1, ArrayList arrayList0, y3.b b2) {
        this.a = new PathMeasure();
        this.b = new Path();
        this.c = new Path();
        this.d = new RectF();
        this.g = new ArrayList();
        A3.j j1 = new A3.j(1, 2);
        this.i = j1;
        this.o = 0.0f;
        this.e = j0;
        this.f = b0;
        j1.setStyle(Paint.Style.STROKE);
        j1.setStrokeCap(paint$Cap0);
        j1.setStrokeJoin(paint$Join0);
        j1.setStrokeMiter(f);
        this.k = (f)a0.e();
        this.j = b1.r();
        this.m = b2 == null ? null : b2.r();
        this.l = new ArrayList(arrayList0.size());
        this.h = new float[arrayList0.size()];
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            f f1 = ((y3.b)arrayList0.get(v1)).r();
            this.l.add(f1);
        }
        b0.d(this.k);
        b0.d(this.j);
        for(int v2 = 0; v2 < this.l.size(); ++v2) {
            b0.d(((u3.e)this.l.get(v2)));
        }
        f f2 = this.m;
        if(f2 != null) {
            b0.d(f2);
        }
        this.k.a(this);
        this.j.a(this);
        for(int v = 0; v < arrayList0.size(); ++v) {
            ((u3.e)this.l.get(v)).a(this);
        }
        f f3 = this.m;
        if(f3 != null) {
            f3.a(this);
        }
        if(b0.i() != null) {
            f f4 = ((y3.b)b0.i().Y).r();
            this.n = f4;
            f4.a(this);
            b0.d(f4);
        }
    }

    @Override  // t3.e
    public final void a(RectF rectF0, Matrix matrix0, boolean z) {
        Path path0 = this.b;
        path0.reset();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.g;
            if(v >= arrayList0.size()) {
                break;
            }
            t3.a a0 = (t3.a)arrayList0.get(v);
            for(int v1 = 0; v1 < a0.a.size(); ++v1) {
                path0.addPath(((l)a0.a.get(v1)).getPath(), matrix0);
            }
        }
        path0.computeBounds(this.d, false);
        float f = this.j.i();
        this.d.set(this.d.left - f / 2.0f, this.d.top - f / 2.0f, this.d.right + f / 2.0f, this.d.bottom + f / 2.0f);
        rectF0.set(this.d);
        rectF0.set(rectF0.left - 1.0f, rectF0.top - 1.0f, rectF0.right + 1.0f, rectF0.bottom + 1.0f);
    }

    @Override  // u3.a
    public final void b() {
        this.e.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        ArrayList arrayList0;
        int v = ((ArrayList)list0).size() - 1;
        Object object0 = null;
        s s0 = null;
        while(v >= 0) {
            c c0 = (c)((ArrayList)list0).get(v);
            if(c0 instanceof s && ((s)c0).c == 2) {
                s0 = (s)c0;
            }
            --v;
        }
        if(s0 != null) {
            s0.d(this);
        }
        for(int v1 = list1.size() - 1; true; --v1) {
            arrayList0 = this.g;
            if(v1 < 0) {
                break;
            }
            c c1 = (c)list1.get(v1);
            if(c1 instanceof s && ((s)c1).c == 2) {
                if(object0 != null) {
                    arrayList0.add(object0);
                }
                t3.a a0 = new t3.a(((s)c1));
                ((s)c1).d(this);
                object0 = a0;
            }
            else if(c1 instanceof l) {
                if(object0 == null) {
                    object0 = new t3.a(s0);
                }
                object0.a.add(((l)c1));
            }
        }
        if(object0 != null) {
            arrayList0.add(object0);
        }
    }

    @Override  // t3.e
    public void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        BlurMaskFilter blurMaskFilter0;
        float[] arr_f1;
        b b1 = this;
        float[] arr_f = (float[])E3.l.e.get();
        arr_f[0] = 0.0f;
        arr_f[1] = 0.0f;
        arr_f[2] = 37394.730469f;
        arr_f[3] = 39575.234375f;
        matrix0.mapPoints(arr_f);
        if(arr_f[0] != arr_f[2] && arr_f[1] == arr_f[3]) {
            float f = ((float)(((int)(((Integer)b1.k.d()))))) / 100.0f;
            A3.j j0 = b1.i;
            j0.setAlpha(g.c(((int)(((float)v) * f))));
            j0.setStrokeWidth(b1.j.i());
            if(j0.getStrokeWidth() <= 0.0f) {
                return;
            }
            ArrayList arrayList0 = b1.l;
            if(!arrayList0.isEmpty()) {
                for(int v1 = 0; true; ++v1) {
                    arr_f1 = b1.h;
                    if(v1 >= arrayList0.size()) {
                        break;
                    }
                    float f1 = (float)(((Float)((u3.e)arrayList0.get(v1)).d()));
                    arr_f1[v1] = f1;
                    if(v1 % 2 != 0) {
                        if(f1 < 0.1f) {
                            arr_f1[v1] = 0.1f;
                        }
                    }
                    else if(f1 < 1.0f) {
                        arr_f1[v1] = 1.0f;
                    }
                }
                j0.setPathEffect(new DashPathEffect(arr_f1, (b1.m == null ? 0.0f : ((float)(((Float)b1.m.d()))))));
            }
            f f2 = b1.n;
            if(f2 != null) {
                float f3 = (float)(((Float)f2.d()));
                if(f3 == 0.0f) {
                    j0.setMaskFilter(null);
                }
                else if(f3 != b1.o) {
                    A3.b b2 = b1.f;
                    if(b2.A == f3) {
                        blurMaskFilter0 = b2.B;
                    }
                    else {
                        BlurMaskFilter blurMaskFilter1 = new BlurMaskFilter(f3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        b2.B = blurMaskFilter1;
                        b2.A = f3;
                        blurMaskFilter0 = blurMaskFilter1;
                    }
                    j0.setMaskFilter(blurMaskFilter0);
                }
                b1.o = f3;
            }
            if(b0 != null) {
                b0.a(((int)(f * 255.0f)), j0);
            }
            canvas0.save();
            canvas0.concat(matrix0);
            int v2 = 0;
            while(true) {
                ArrayList arrayList1 = b1.g;
                if(v2 >= arrayList1.size()) {
                    break;
                }
                t3.a a0 = (t3.a)arrayList1.get(v2);
                Path path0 = b1.b;
                ArrayList arrayList2 = a0.a;
                if(a0.b == null) {
                    path0.reset();
                    for(int v5 = arrayList2.size() - 1; v5 >= 0; --v5) {
                        path0.addPath(((l)arrayList2.get(v5)).getPath());
                    }
                    canvas0.drawPath(path0, j0);
                }
                else {
                    path0.reset();
                    for(int v3 = arrayList2.size() - 1; v3 >= 0; --v3) {
                        path0.addPath(((l)arrayList2.get(v3)).getPath());
                    }
                    float f4 = ((float)(((Float)a0.b.d.d()))) / 100.0f;
                    float f5 = ((float)(((Float)a0.b.e.d()))) / 100.0f;
                    float f6 = ((float)(((Float)a0.b.f.d()))) / 360.0f;
                    if(f4 >= 0.01f || f5 <= 0.99f) {
                        PathMeasure pathMeasure0 = b1.a;
                        pathMeasure0.setPath(path0, false);
                        float f7;
                        for(f7 = pathMeasure0.getLength(); pathMeasure0.nextContour(); f7 += pathMeasure0.getLength()) {
                        }
                        float f8 = f6 * f7;
                        float f9 = f4 * f7 + f8;
                        float f10 = Math.min(f5 * f7 + f8, f9 + f7 - 1.0f);
                        int v4 = arrayList2.size() - 1;
                        float f11 = 0.0f;
                        while(v4 >= 0) {
                            Path path1 = b1.c;
                            path1.set(((l)arrayList2.get(v4)).getPath());
                            pathMeasure0.setPath(path1, false);
                            float f12 = pathMeasure0.getLength();
                            if(f10 > f7) {
                                float f13 = f10 - f7;
                                if(f13 >= f11 + f12 && f11 >= f13) {
                                    E3.l.a(path1, (f9 > f7 ? (f9 - f7) / f12 : 0.0f), Math.min(f13 / f12, 1.0f), 0.0f);
                                    canvas0.drawPath(path1, j0);
                                }
                            }
                            else {
                                float f14 = f11 + f12;
                                if(f14 >= f9 && f11 <= f10) {
                                    if(f14 > f10 || f9 >= f11) {
                                        E3.l.a(path1, (f9 < f11 ? 0.0f : (f9 - f11) / f12), (f10 > f14 ? 1.0f : (f10 - f11) / f12), 0.0f);
                                    }
                                    canvas0.drawPath(path1, j0);
                                }
                            }
                            f11 += f12;
                            --v4;
                            b1 = this;
                        }
                    }
                    else {
                        canvas0.drawPath(path0, j0);
                    }
                }
                ++v2;
                b1 = this;
            }
            canvas0.restore();
        }
    }
}

