package E3;

import android.graphics.PointF;
import m5.b;

public abstract class g {
    public static final PointF a;

    static {
        g.a = new PointF();
    }

    public static PointF a(PointF pointF0, PointF pointF1) {
        return new PointF(pointF0.x + pointF1.x, pointF0.y + pointF1.y);
    }

    public static float b(float f, float f1, float f2) {
        return Math.max(f1, Math.min(f2, f));
    }

    public static int c(int v) {
        return Math.max(0, Math.min(0xFF, v));
    }

    public static int d(float f, float f1) {
        int v = ((int)f) / ((int)f1);
        if((((int)f) ^ ((int)f1)) < 0 && ((int)f) % ((int)f1) != 0) {
            --v;
        }
        return ((int)f) - ((int)f1) * v;
    }

    public static float e(float f, float f1, float f2) {
        return b.o(f1, f, f2, f);
    }
}

