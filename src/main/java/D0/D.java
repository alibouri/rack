package d0;

import Bb.F;
import Nb.k;
import java.util.Map;
import kotlin.jvm.functions.Function2;

public final class d extends k implements Function2 {
    public final int X;
    public static final d Y;
    public static final d Z;

    static {
        d.Y = new d(2, 0);
        d.Z = new d(2, 1);
    }

    public d(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            b b0 = (b)object0;
            return object1;
        }
        b b1 = (b)object0;
        Object object2 = F.a0(((h)object1).a);
        for(Object object3: ((h)object1).b.values()) {
            f f0 = (f)object3;
            if(f0.b) {
                Map map0 = f0.c.d();
                Object object4 = f0.a;
                if(map0.isEmpty()) {
                    ((Map)object2).remove(object4);
                }
                else {
                    ((Map)object2).put(object4, map0);
                }
            }
        }
        return ((Map)object2).isEmpty() ? null : object2;
    }
}

