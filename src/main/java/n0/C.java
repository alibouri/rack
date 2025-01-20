package n0;

import Nb.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import androidx.compose.ui.graphics.Path;
import m0.b;

public final class c implements t {
    public Canvas a;
    public Rect b;
    public Rect c;

    public c() {
        this.a = d.a;
    }

    @Override  // n0.t
    public final void a(g g0, long v, long v1, long v2, long v3, h h0) {
        if(this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas0 = this.a;
        Bitmap bitmap0 = M.l(g0);
        Rect rect0 = this.b;
        j.c(rect0);
        rect0.left = (int)(v >> 0x20);
        rect0.top = (int)(v & 0xFFFFFFFFL);
        rect0.right = ((int)(v >> 0x20)) + ((int)(v1 >> 0x20));
        rect0.bottom = ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL));
        Rect rect1 = this.c;
        j.c(rect1);
        rect1.left = (int)(v2 >> 0x20);
        rect1.top = (int)(v2 & 0xFFFFFFFFL);
        rect1.right = ((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20));
        rect1.bottom = ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL));
        canvas0.drawBitmap(bitmap0, rect0, rect1, ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void b(float f, float f1) {
        this.a.scale(f, f1);
    }

    @Override  // n0.t
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override  // n0.t
    public final void d(m0.c c0, h h0) {
        this.m(c0.a, c0.b, c0.c, c0.d, h0);
    }

    @Override  // n0.t
    public final void e(float f, long v, h h0) {
        this.a.drawCircle(b.d(v), b.e(v), f, ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void f(float f, float f1, float f2, float f3, float f4, float f5, h h0) {
        this.a.drawRoundRect(f, f1, f2, f3, f4, f5, ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void g(m0.c c0, h h0) {
        this.a.saveLayer(c0.a, c0.b, c0.c, c0.d, ((Paint)h0.c), 0x1F);
    }

    @Override  // n0.t
    public final void h(float f, float f1, float f2, float f3, float f4, float f5, h h0) {
        this.a.drawArc(f, f1, f2, f3, f4, f5, false, ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void i(float f, float f1, float f2, float f3, int v) {
        this.a.clipRect(f, f1, f2, f3, (v == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT));
    }

    @Override  // n0.t
    public final void j(Path path0, int v) {
        Canvas canvas0 = this.a;
        if(!(path0 instanceof n0.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.clipPath(((n0.j)path0).a, (v == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT));
    }

    @Override  // n0.t
    public final void k(float f, float f1) {
        this.a.translate(f, f1);
    }

    @Override  // n0.t
    public final void l() {
        this.a.restore();
    }

    @Override  // n0.t
    public final void m(float f, float f1, float f2, float f3, h h0) {
        this.a.drawRect(f, f1, f2, f3, ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void n() {
        this.a.save();
    }

    @Override  // n0.t
    public final void o(long v, long v1, h h0) {
        this.a.drawLine(b.d(v), b.e(v), b.d(v1), b.e(v1), ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void p() {
        M.o(this.a, false);
    }

    @Override  // n0.t
    public final void q(Path path0, h h0) {
        Canvas canvas0 = this.a;
        if(!(path0 instanceof n0.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.drawPath(((n0.j)path0).a, ((Paint)h0.c));
    }

    @Override  // n0.t
    public final void r(float[] arr_f) {
        int v = 0;
        while(v < 4) {
            int v1 = 0;
            while(v1 < 4) {
                if(arr_f[v * 4 + v1] == (v == v1 ? 1.0f : 0.0f)) {
                    ++v1;
                    continue;
                }
                Matrix matrix0 = new Matrix();
                M.z(matrix0, arr_f);
                this.a.concat(matrix0);
                return;
            }
            ++v;
        }
    }

    @Override  // n0.t
    public final void s(m0.c c0, int v) {
        this.i(c0.a, c0.b, c0.c, c0.d, v);
    }

    @Override  // n0.t
    public final void t() {
        M.o(this.a, true);
    }

    @Override  // n0.t
    public final void u(g g0, long v, h h0) {
        this.a.drawBitmap(M.l(g0), b.d(v), b.e(v), ((Paint)h0.c));
    }

    public final Canvas v() {
        return this.a;
    }

    public final void w(Canvas canvas0) {
        this.a = canvas0;
    }
}

