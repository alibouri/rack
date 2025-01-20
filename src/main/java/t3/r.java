package t3;

import F3.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import r3.j;
import u3.e;
import u3.f;
import v.h;
import z3.o;

public final class r extends b {
    public final boolean p;
    public final f q;

    public r(j j0, A3.b b0, o o0) {
        Paint.Join paint$Join0;
        Paint.Cap paint$Cap0;
        switch(h.d(o0.f)) {
            case 0: {
                paint$Cap0 = Paint.Cap.BUTT;
                break;
            }
            case 1: {
                paint$Cap0 = Paint.Cap.ROUND;
                break;
            }
            default: {
                paint$Cap0 = Paint.Cap.SQUARE;
            }
        }
        int v = h.d(o0.g);
        switch(v) {
            case 0: {
                paint$Join0 = Paint.Join.MITER;
                break;
            }
            case 1: {
                paint$Join0 = Paint.Join.ROUND;
                break;
            }
            default: {
                paint$Join0 = v == 2 ? Paint.Join.BEVEL : null;
            }
        }
        super(j0, b0, paint$Cap0, paint$Join0, o0.h, o0.d, o0.e, o0.b, o0.a);
        this.p = o0.i;
        e e0 = o0.c.e();
        this.q = (f)e0;
        e0.a(this);
        b0.d(e0);
    }

    @Override  // t3.b
    public final void e(Canvas canvas0, Matrix matrix0, int v, E3.b b0) {
        if(this.p) {
            return;
        }
        a a0 = this.q.c.d();
        float f = this.q.b();
        int v1 = this.q.k(a0, f);
        this.i.setColor(v1);
        super.e(canvas0, matrix0, v, b0);
    }
}

