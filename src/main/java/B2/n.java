package B2;

import A7.b;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;
import s.e;
import z1.d;

public final class n {
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final k g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final e o;
    public static final Matrix p;

    static {
        n.p = new Matrix();
    }

    public n() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0xFF;
        this.m = null;
        this.n = null;
        this.o = new e(0);  // initializer: Ls/J;-><init>(I)V
        this.g = new k();
        this.a = new Path();
        this.b = new Path();
    }

    public n(n n0) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0xFF;
        this.m = null;
        this.n = null;
        e e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
        this.o = e0;
        this.g = new k(n0.g, e0);
        this.a = new Path(n0.a);
        this.b = new Path(n0.b);
        this.h = n0.h;
        this.i = n0.i;
        this.j = n0.j;
        this.k = n0.k;
        this.l = n0.l;
        this.m = n0.m;
        String s = n0.m;
        if(s != null) {
            e0.put(s, this);
        }
        this.n = n0.n;
    }

    public final void a(k k0, Matrix matrix0, Canvas canvas0, int v, int v1) {
        Matrix matrix2;
        k0.a.set(matrix0);
        Matrix matrix1 = k0.a;
        matrix1.preConcat(k0.j);
        canvas0.save();
        int v2 = 0;
        while(true) {
            ArrayList arrayList0 = k0.b;
            if(v2 >= arrayList0.size()) {
                break;
            }
            l l0 = (l)arrayList0.get(v2);
            if(l0 instanceof k) {
                this.a(((k)l0), matrix1, canvas0, v, v1);
                matrix2 = matrix1;
            }
            else if(l0 instanceof m) {
                float f = ((float)v) / this.j;
                float f1 = ((float)v1) / this.k;
                Matrix matrix3 = this.c;
                matrix3.set(matrix1);
                matrix3.postScale(f, f1);
                float[] arr_f = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix1.mapVectors(arr_f);
                float f2 = Math.min(f, f1);
                matrix2 = matrix1;
                float f3 = Math.max(((float)Math.hypot(arr_f[0], arr_f[1])), ((float)Math.hypot(arr_f[2], arr_f[3])));
                float f4 = f3 > 0.0f ? Math.abs(arr_f[0] * arr_f[3] - arr_f[1] * arr_f[2]) / f3 : 0.0f;
                if(f4 != 0.0f) {
                    ((m)l0).getClass();
                    Path path0 = this.a;
                    path0.reset();
                    d[] arr_d = ((m)l0).a;
                    if(arr_d != null) {
                        d.b(arr_d, path0);
                    }
                    Path path1 = this.b;
                    path1.reset();
                    if(((m)l0) instanceof i) {
                        path1.setFillType((((m)l0).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                        path1.addPath(path0, matrix3);
                        canvas0.clipPath(path1);
                    }
                    else {
                        float f5 = ((j)(((m)l0))).i;
                        if(f5 == 0.0f || ((j)(((m)l0))).j != 1.0f) {
                            float f6 = ((j)(((m)l0))).k;
                            float f7 = (((j)(((m)l0))).j + f6) % 1.0f;
                            if(this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path0, false);
                            float f8 = this.f.getLength();
                            float f9 = (f5 + f6) % 1.0f * f8;
                            float f10 = f7 * f8;
                            path0.reset();
                            if(f9 > f10) {
                                this.f.getSegment(f9, f8, path0, true);
                                this.f.getSegment(0.0f, f10, path0, true);
                            }
                            else {
                                this.f.getSegment(f9, f10, path0, true);
                            }
                            path0.rLineTo(0.0f, 0.0f);
                        }
                        path1.addPath(path0, matrix3);
                        b b0 = ((j)(((m)l0))).f;
                        if(((Shader)b0.Z) != null || b0.Y != 0) {
                            if(this.e == null) {
                                Paint paint0 = new Paint(1);
                                this.e = paint0;
                                paint0.setStyle(Paint.Style.FILL);
                            }
                            Paint paint1 = this.e;
                            Shader shader0 = (Shader)b0.Z;
                            if(shader0 == null) {
                                paint1.setShader(null);
                                paint1.setAlpha(0xFF);
                                int v3 = b0.Y;
                                float f11 = ((j)(((m)l0))).h;
                                paint1.setColor(v3 & 0xFFFFFF | ((int)(((float)Color.alpha(v3)) * f11)) << 24);
                            }
                            else {
                                shader0.setLocalMatrix(matrix3);
                                paint1.setShader(shader0);
                                paint1.setAlpha(Math.round(((j)(((m)l0))).h * 255.0f));
                            }
                            paint1.setColorFilter(null);
                            path1.setFillType((((j)(((m)l0))).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                            canvas0.drawPath(path1, paint1);
                        }
                        b b1 = ((j)(((m)l0))).d;
                        if(((Shader)b1.Z) != null || b1.Y != 0) {
                            if(this.d == null) {
                                Paint paint2 = new Paint(1);
                                this.d = paint2;
                                paint2.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint3 = this.d;
                            Paint.Join paint$Join0 = ((j)(((m)l0))).m;
                            if(paint$Join0 != null) {
                                paint3.setStrokeJoin(paint$Join0);
                            }
                            Paint.Cap paint$Cap0 = ((j)(((m)l0))).l;
                            if(paint$Cap0 != null) {
                                paint3.setStrokeCap(paint$Cap0);
                            }
                            paint3.setStrokeMiter(((j)(((m)l0))).n);
                            Shader shader1 = (Shader)b1.Z;
                            if(shader1 == null) {
                                paint3.setShader(null);
                                paint3.setAlpha(0xFF);
                                int v4 = b1.Y;
                                float f12 = ((j)(((m)l0))).g;
                                paint3.setColor(v4 & 0xFFFFFF | ((int)(((float)Color.alpha(v4)) * f12)) << 24);
                            }
                            else {
                                shader1.setLocalMatrix(matrix3);
                                paint3.setShader(shader1);
                                paint3.setAlpha(Math.round(((j)(((m)l0))).g * 255.0f));
                            }
                            paint3.setColorFilter(null);
                            paint3.setStrokeWidth(((j)(((m)l0))).e * (f4 * f2));
                            canvas0.drawPath(path1, paint3);
                        }
                    }
                }
            }
            else {
                matrix2 = matrix1;
            }
            ++v2;
            matrix1 = matrix2;
        }
        canvas0.restore();
    }

    public float getAlpha() {
        return ((float)this.getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        this.setRootAlpha(((int)(f * 255.0f)));
    }

    public void setRootAlpha(int v) {
        this.l = v;
    }
}

