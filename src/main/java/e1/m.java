package e1;

import Ab.t;
import Nb.k;
import U.p;
import kotlin.jvm.functions.Function2;

public final class m extends k implements Function2 {
    public final int X;
    public static final m Y;
    public static final m Z;

    static {
        m.Y = new m(2, 0);
        m.Z = new m(2, 1);
    }

    public m(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                ((p)object0).K();
            }
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
        }
        return t.a;
    }
}

