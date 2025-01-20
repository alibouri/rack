package t0;

import Ab.t;
import Nb.k;
import android.graphics.PathMeasure;
import kotlin.jvm.functions.Function0;
import n0.l;

public final class f extends k implements Function0 {
    public final int X;
    public static final f Y;
    public static final f Z;

    static {
        f.Y = new f(0, 0);
        f.Z = new f(0, 1);
    }

    public f(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.X != 0 ? t.a : new l(new PathMeasure());
    }
}

