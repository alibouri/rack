package d0;

import Nb.k;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

public final class i extends k implements Function0 {
    public final int X;
    public static final i Y;
    public static final i Z;

    static {
        i.Y = new i(0, 0);
        i.Z = new i(0, 1);
    }

    public i(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.X != 0 ? null : new h(new LinkedHashMap());
    }
}

