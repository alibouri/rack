package H6;

import B3.d;
import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.media.session.a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

public final class k {
    public final s[] a;
    public final Matrix[] b;
    public final Matrix[] c;
    public final PointF d;
    public final Path e;
    public final Path f;
    public final s g;
    public final float[] h;
    public final float[] i;
    public final Path j;
    public final Path k;
    public final boolean l;

    public k() {
        this.a = new s[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new s();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        for(int v = 0; v < 4; ++v) {
            this.a[v] = new s();
            this.b[v] = new Matrix();
            this.c[v] = new Matrix();
        }
    }

    public final void a(ShapeAppearanceModel shapeAppearanceModel0, float f, RectF rectF0, d d0, Path path0) {
        e e0;
        int v1;
        a a0;
        c c0;
        float[] arr_f;
        s[] arr_s;
        Matrix[] arr_matrix1;
        Matrix[] arr_matrix;
        k k0 = this;
        path0.rewind();
        Path path1 = k0.e;
        path1.rewind();
        Path path2 = k0.f;
        path2.rewind();
        path2.addRect(rectF0, Path.Direction.CW);
        for(int v = 0; true; v = v1) {
            arr_matrix = k0.c;
            arr_matrix1 = k0.b;
            arr_s = k0.a;
            arr_f = k0.h;
            if(v >= 4) {
                break;
            }
            switch(v) {
                case 1: {
                    c0 = shapeAppearanceModel0.g;
                    break;
                }
                case 2: {
                    c0 = shapeAppearanceModel0.h;
                    break;
                }
                case 3: {
                    c0 = shapeAppearanceModel0.e;
                    break;
                }
                default: {
                    c0 = shapeAppearanceModel0.f;
                }
            }
            switch(v) {
                case 1: {
                    a0 = shapeAppearanceModel0.c;
                    break;
                }
                case 2: {
                    a0 = shapeAppearanceModel0.d;
                    break;
                }
                case 3: {
                    a0 = shapeAppearanceModel0.a;
                    break;
                }
                default: {
                    a0 = shapeAppearanceModel0.b;
                }
            }
            s s0 = arr_s[v];
            a0.getClass();
            a0.E(s0, f, c0.a(rectF0));
            float f1 = (float)((v + 1) * 90);
            arr_matrix1[v].reset();
            PointF pointF0 = k0.d;
            switch(v) {
                case 1: {
                    v1 = 2;
                    pointF0.set(rectF0.right, rectF0.bottom);
                    break;
                }
                case 2: {
                    v1 = 3;
                    pointF0.set(rectF0.left, rectF0.bottom);
                    break;
                }
                case 3: {
                    v1 = 4;
                    pointF0.set(rectF0.left, rectF0.top);
                    break;
                }
                default: {
                    v1 = v + 1;
                    pointF0.set(rectF0.right, rectF0.top);
                }
            }
            arr_matrix1[v].setTranslate(pointF0.x, pointF0.y);
            arr_matrix1[v].preRotate(f1);
            s s1 = arr_s[v];
            arr_f[0] = s1.b;
            arr_f[1] = s1.c;
            arr_matrix1[v].mapPoints(arr_f);
            arr_matrix[v].reset();
            arr_matrix[v].setTranslate(arr_f[0], arr_f[1]);
            arr_matrix[v].preRotate(f1);
        }
        for(int v2 = 0; v2 < 4; ++v2) {
            s s2 = arr_s[v2];
            s2.getClass();
            arr_f[0] = 0.0f;
            arr_f[1] = s2.a;
            arr_matrix1[v2].mapPoints(arr_f);
            if(v2 == 0) {
                path0.moveTo(arr_f[0], arr_f[1]);
            }
            else {
                path0.lineTo(arr_f[0], arr_f[1]);
            }
            arr_s[v2].b(arr_matrix1[v2], path0);
            if(d0 != null) {
                s s3 = arr_s[v2];
                Matrix matrix0 = arr_matrix1[v2];
                MaterialShapeDrawable materialShapeDrawable0 = (MaterialShapeDrawable)d0.Y;
                s3.getClass();
                materialShapeDrawable0.b0.set(v2, false);
                s3.a(s3.e);
                Matrix matrix1 = new Matrix(matrix0);
                materialShapeDrawable0.Y[v2] = new l(new ArrayList(s3.g), matrix1);
            }
            int v3 = (v2 + 1) % 4;
            s s4 = arr_s[v2];
            arr_f[0] = s4.b;
            arr_f[1] = s4.c;
            arr_matrix1[v2].mapPoints(arr_f);
            s s5 = arr_s[v3];
            s5.getClass();
            k0.i[0] = 0.0f;
            k0.i[1] = s5.a;
            arr_matrix1[v3].mapPoints(k0.i);
            float f2 = Math.max(((float)Math.hypot(arr_f[0] - k0.i[0], arr_f[1] - k0.i[1])) - 0.001f, 0.0f);
            s s6 = arr_s[v2];
            arr_f[0] = s6.b;
            arr_f[1] = s6.c;
            arr_matrix1[v2].mapPoints(arr_f);
            if(v2 == 1 || v2 == 3) {
                rectF0.centerX();
                float f4 = arr_f[0];
            }
            else {
                rectF0.centerY();
                float f3 = arr_f[1];
            }
            s s7 = k0.g;
            s7.d(0.0f, 270.0f, 0.0f);
            switch(v2) {
                case 1: {
                    e0 = shapeAppearanceModel0.k;
                    break;
                }
                case 2: {
                    e0 = shapeAppearanceModel0.l;
                    break;
                }
                case 3: {
                    e0 = shapeAppearanceModel0.i;
                    break;
                }
                default: {
                    e0 = shapeAppearanceModel0.j;
                }
            }
            e0.getClass();
            s7.c(f2, 0.0f);
            Path path3 = k0.j;
            path3.reset();
            s7.b(arr_matrix[v2], path3);
            if(!k0.l || !k0.b(path3, v2) && !k0.b(path3, v3)) {
                s7.b(arr_matrix[v2], path0);
            }
            else {
                path3.op(path3, path2, Path.Op.DIFFERENCE);
                arr_f[0] = 0.0f;
                arr_f[1] = s7.a;
                arr_matrix[v2].mapPoints(arr_f);
                path1.moveTo(arr_f[0], arr_f[1]);
                s7.b(arr_matrix[v2], path1);
            }
            if(d0 != null) {
                Matrix matrix2 = arr_matrix[v2];
                MaterialShapeDrawable materialShapeDrawable1 = (MaterialShapeDrawable)d0.Y;
                materialShapeDrawable1.b0.set(v2 + 4, false);
                s7.a(s7.e);
                Matrix matrix3 = new Matrix(matrix2);
                materialShapeDrawable1.Z[v2] = new l(new ArrayList(s7.g), matrix3);
            }
            k0 = this;
        }
        path0.close();
        path1.close();
        if(!path1.isEmpty()) {
            path0.op(path1, Path.Op.UNION);
        }
    }

    public final boolean b(Path path0, int v) {
        this.k.reset();
        this.a[v].b(this.b[v], this.k);
        RectF rectF0 = new RectF();
        path0.computeBounds(rectF0, true);
        this.k.computeBounds(rectF0, true);
        path0.op(this.k, Path.Op.INTERSECT);
        path0.computeBounds(rectF0, true);
        return !rectF0.isEmpty() || rectF0.width() > 1.0f && rectF0.height() > 1.0f;
    }
}

