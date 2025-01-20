package Ra;

import Ab.t;
import R2.f;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final class e implements Function2 {
    public final Modifier X;
    public final long Y;
    public final long Z;
    public final int b0;
    public final int c0;

    public e(Modifier modifier0, long v, long v1, int v2, int v3) {
        this.X = modifier0;
        this.Y = v;
        this.Z = v1;
        this.b0 = v2;
        this.c0 = v3;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        f.m(this.X, this.Y, this.Z, ((p)object0), d.O(this.b0 | 1), this.c0);
        return t.a;
    }
}

