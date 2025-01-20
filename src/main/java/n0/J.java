package n0;

import Ab.e;
import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path.Op;
import android.graphics.RectF;
import androidx.compose.ui.graphics.Path;
import m0.a;
import m0.b;
import m0.c;
import m0.d;
import v.h;

public final class j implements Path {
    public final android.graphics.Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public j(android.graphics.Path path0) {
        this.a = path0;
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void a(float f, float f1) {
        this.a.moveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void b(float f, float f1, float f2, float f3, float f4, float f5) {
        this.a.cubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void c(float f, float f1) {
        this.a.lineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void close() {
        this.a.close();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void d(float f, float f1, float f2, float f3) {
        this.a.rQuadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final boolean e() {
        return this.a.isConvex();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void f(c c0, int v) {
        Path.Direction path$Direction0;
        if(!Float.isNaN(c0.a)) {
            float f = c0.b;
            if(!Float.isNaN(f)) {
                float f1 = c0.c;
                if(!Float.isNaN(f1)) {
                    float f2 = c0.d;
                    if(!Float.isNaN(f2)) {
                        if(this.b == null) {
                            this.b = new RectF();
                        }
                        RectF rectF0 = this.b;
                        Nb.j.c(rectF0);
                        rectF0.set(c0.a, f, f1, f2);
                        RectF rectF1 = this.b;
                        Nb.j.c(rectF1);
                        switch(h.d(v)) {
                            case 0: {
                                path$Direction0 = Path.Direction.CCW;
                                break;
                            }
                            case 1: {
                                path$Direction0 = Path.Direction.CW;
                                break;
                            }
                            default: {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                        this.a.addRect(rectF1, path$Direction0);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void g(float f, float f1) {
        this.a.rMoveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void h(float f, float f1, float f2, float f3, float f4, float f5) {
        this.a.rCubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final boolean i(Path path0, Path path1, int v) {
        Path.Op path$Op0;
        if(v == 0) {
            path$Op0 = Path.Op.DIFFERENCE;
        }
        else {
            switch(v) {
                case 1: {
                    path$Op0 = Path.Op.INTERSECT;
                    break;
                }
                case 2: {
                    path$Op0 = Path.Op.UNION;
                    break;
                }
                case 4: {
                    path$Op0 = Path.Op.REVERSE_DIFFERENCE;
                    break;
                }
                default: {
                    path$Op0 = Path.Op.XOR;
                }
            }
        }
        if(!(path0 instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path2 = ((j)path0).a;
        if(!(path1 instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.a.op(path2, ((j)path1).a, path$Op0);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void j(long v) {
        Matrix matrix0 = this.d;
        if(matrix0 == null) {
            this.d = new Matrix();
        }
        else {
            matrix0.reset();
        }
        Matrix matrix1 = this.d;
        Nb.j.c(matrix1);
        matrix1.setTranslate(b.d(v), b.e(v));
        Matrix matrix2 = this.d;
        Nb.j.c(matrix2);
        this.a.transform(matrix2);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void k(float f, float f1) {
        this.a.rLineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void l(int v) {
        this.a.setFillType((v == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void m(d d0, int v) {
        Path.Direction path$Direction0;
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Nb.j.c(rectF0);
        rectF0.set(d0.a, d0.b, d0.c, d0.d);
        if(this.c == null) {
            this.c = new float[8];
        }
        float[] arr_f = this.c;
        Nb.j.c(arr_f);
        arr_f[0] = a.b(d0.e);
        arr_f[1] = a.c(d0.e);
        arr_f[2] = a.b(d0.f);
        arr_f[3] = a.c(d0.f);
        arr_f[4] = a.b(d0.g);
        arr_f[5] = a.c(d0.g);
        arr_f[6] = a.b(d0.h);
        arr_f[7] = a.c(d0.h);
        RectF rectF1 = this.b;
        Nb.j.c(rectF1);
        float[] arr_f1 = this.c;
        Nb.j.c(arr_f1);
        switch(h.d(v)) {
            case 0: {
                path$Direction0 = Path.Direction.CCW;
                break;
            }
            case 1: {
                path$Direction0 = Path.Direction.CW;
                break;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        this.a.addRoundRect(rectF1, arr_f1, path$Direction0);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void n(float f, float f1, float f2, float f3) {
        this.a.quadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final int o() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final c p() {
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Nb.j.c(rectF0);
        this.a.computeBounds(rectF0, true);
        return new c(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.a.reset();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public final void rewind() {
        this.a.rewind();
    }
}

