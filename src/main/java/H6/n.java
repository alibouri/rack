package H6;

import G6.a;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

public final class n extends r {
    public final p b;
    public final float c;
    public final float d;

    public n(p p0, float f, float f1) {
        this.b = p0;
        this.c = f;
        this.d = f1;
    }

    @Override  // H6.r
    public final void a(Matrix matrix0, a a0, int v, Canvas canvas0) {
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)Math.hypot(this.b.c - this.d, this.b.b - this.c)), 0.0f);
        Matrix matrix1 = new Matrix(matrix0);
        matrix1.preTranslate(this.c, this.d);
        matrix1.preRotate(this.b());
        a0.getClass();
        rectF0.bottom += (float)v;
        rectF0.offset(0.0f, ((float)(-v)));
        a.i[0] = a0.f;
        a.i[1] = a0.e;
        a.i[2] = a0.d;
        LinearGradient linearGradient0 = new LinearGradient(rectF0.left, rectF0.top, rectF0.left, rectF0.bottom, a.i, a.j, Shader.TileMode.CLAMP);
        a0.c.setShader(linearGradient0);
        canvas0.save();
        canvas0.concat(matrix1);
        canvas0.drawRect(rectF0, a0.c);
        canvas0.restore();
    }

    public final float b() {
        return (float)Math.toDegrees(Math.atan((this.b.c - this.d) / (this.b.b - this.c)));
    }
}

