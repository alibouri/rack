package e1;

import Nb.k;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

public final class d extends k implements Function0 {
    public final int X;
    public static final d Y;
    public static final d Z;
    public static final d b0;

    static {
        d.Y = new d(0, 0);
        d.Z = new d(0, 1);
        d.b0 = new d(0, 2);
    }

    public d(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return UUID.randomUUID();
            }
            case 1: {
                return "DEFAULT_TEST_TAG";
            }
            default: {
                return UUID.randomUUID();
            }
        }
    }
}

