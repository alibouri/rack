package d1;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;

public final class f extends k implements Function0 {
    public final int X;
    public static final f Y;
    public static final f Z;
    public static final f b0;

    static {
        f.Y = new f(0, 0);
        f.Z = new f(0, 1);
        f.b0 = new f(0, 2);
    }

    public f(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return t.a;
            }
            case 1: {
                return t.a;
            }
            default: {
                return t.a;
            }
        }
    }
}

