package Q;

import androidx.compose.ui.unit.Density;
import m0.b;
import m0.e;
import yc.d;

public abstract class q {
    public static final float a;

    static {
        q.a = 10.0f;
    }

    public static final float a(Density density0, boolean z, long v) {
        float f = b.c(d.d(e.d(v), e.b(v))) / 2.0f;
        return z ? f + density0.w(q.a) : f;
    }
}

