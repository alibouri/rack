package d0;

import Nb.k;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class e extends k implements Function1 {
    public final int X;
    public static final e Y;
    public static final e Z;

    static {
        e.Y = new e(1, 0);
        e.Z = new e(1, 1);
    }

    public e(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return this.X != 0 ? object0 : new h(((Map)object0));
    }
}

