package G0;

import M0.o;
import M0.q;
import M0.t;
import Nb.k;
import U.p;
import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.functions.Function2;

public final class y extends k implements Function2 {
    public final int X;
    public static final y Y;
    public static final y Z;
    public static final y b0;
    public static final y c0;

    static {
        y.Y = new y(2, 0);
        y.Z = new y(2, 1);
        y.b0 = new y(2, 2);
        y.c0 = new y(2, 3);
    }

    public y(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                t t0 = q.n;
                Object object2 = ((o)object0).d.X.get(t0);
                if(object2 == null) {
                    object2 = 0.0f;
                }
                float f = ((Number)object2).floatValue();
                Object object3 = ((o)object1).d.X.get(t0);
                if(object3 == null) {
                    object3 = 0.0f;
                }
                return Float.compare(f, ((Number)object3).floatValue());
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                }
                return Ab.t.a;
            }
            case 2: {
                ((h0)object0).K(((Matrix)object1));
                return Ab.t.a;
            }
            default: {
                ((Matrix)object1).set(((View)object0).getMatrix());
                return Ab.t.a;
            }
        }
    }
}

