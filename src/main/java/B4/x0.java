package b4;

import U5.a;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

public final class x0 extends a {
    public final int c;
    public float d;
    public final float e;
    public final A0 f;
    public final Object g;

    public x0(A0 a00, float f, float f1) {
        this.c = 1;
        super();
        this.f = a00;
        this.g = new RectF();
        this.d = f;
        this.e = f1;
    }

    public x0(A0 a00, float f, float f1, Path path0) {
        this.c = 0;
        super();
        this.f = a00;
        this.d = f;
        this.e = f1;
        this.g = path0;
    }

    @Override  // U5.a
    public final boolean A(m0 m00) {
        if(this.c != 0) {
            if(m00 instanceof n0) {
                Z z0 = m00.a.J(((n0)m00).n);
                if(z0 == null) {
                    A0.v("TextPath path reference \'%s\' not found", new Object[]{((n0)m00).n});
                    return false;
                }
                Path path0 = (Path)new u0(((K)z0).o).c;
                Matrix matrix0 = ((K)z0).n;
                if(matrix0 != null) {
                    path0.transform(matrix0);
                }
                RectF rectF0 = new RectF();
                path0.computeBounds(rectF0, true);
                ((RectF)this.g).union(rectF0);
                return false;
            }
            return true;
        }
        if(m00 instanceof n0) {
            Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }
        return true;
    }

    @Override  // U5.a
    public final void I(String s) {
        if(this.c != 0) {
            A0 a00 = this.f;
            if(a00.j0()) {
                Rect rect0 = new Rect();
                ((y0)a00.d).d.getTextBounds(s, 0, s.length(), rect0);
                RectF rectF0 = new RectF(rect0);
                rectF0.offset(this.d, this.e);
                ((RectF)this.g).union(rectF0);
            }
            float f = this.d;
            this.d = ((y0)a00.d).d.measureText(s) + f;
            return;
        }
        A0 a01 = this.f;
        if(a01.j0()) {
            Path path0 = new Path();
            ((y0)a01.d).d.getTextPath(s, 0, s.length(), this.d, this.e, path0);
            ((Path)this.g).addPath(path0);
        }
        float f1 = this.d;
        this.d = ((y0)a01.d).d.measureText(s) + f1;
    }
}

