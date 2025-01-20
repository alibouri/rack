package H6;

import G6.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;

public final class m extends r {
    public final o b;

    public m(o o0) {
        this.b = o0;
    }

    @Override  // H6.r
    public final void a(Matrix matrix0, a a0, int v, Canvas canvas0) {
        float f = this.b.f;
        float f1 = this.b.g;
        RectF rectF0 = new RectF(this.b.b, this.b.c, this.b.d, this.b.e);
        a0.getClass();
        boolean z = Float.compare(f1, 0.0f) < 0;
        Path path0 = a0.g;
        int[] arr_v = a.k;
        if(z) {
            arr_v[0] = 0;
            arr_v[1] = a0.f;
            arr_v[2] = a0.e;
            arr_v[3] = a0.d;
        }
        else {
            path0.rewind();
            path0.moveTo(rectF0.centerX(), rectF0.centerY());
            path0.arcTo(rectF0, f, f1);
            path0.close();
            float f2 = (float)(-v);
            rectF0.inset(f2, f2);
            arr_v[0] = 0;
            arr_v[1] = a0.d;
            arr_v[2] = a0.e;
            arr_v[3] = a0.f;
        }
        float f3 = rectF0.width();
        if(f3 / 2.0f > 0.0f) {
            float f4 = 1.0f - ((float)v) / (f3 / 2.0f);
            a.l[1] = f4;
            a.l[2] = (1.0f - f4) / 2.0f + f4;
            RadialGradient radialGradient0 = new RadialGradient(rectF0.centerX(), rectF0.centerY(), f3 / 2.0f, arr_v, a.l, Shader.TileMode.CLAMP);
            Paint paint0 = a0.b;
            paint0.setShader(radialGradient0);
            canvas0.save();
            canvas0.concat(matrix0);
            canvas0.scale(1.0f, rectF0.height() / rectF0.width());
            if(!z) {
                canvas0.clipPath(path0, Region.Op.DIFFERENCE);
                canvas0.drawPath(path0, a0.h);
            }
            canvas0.drawArc(rectF0, f, f1, true, paint0);
            canvas0.restore();
        }
    }
}

