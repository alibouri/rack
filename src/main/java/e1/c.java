package e1;

import Ab.t;
import M0.j;
import M0.q;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;

public final class c extends k implements Function1 {
    public final int X;
    public static final c Y;
    public static final c Z;
    public static final c b0;
    public static final c c0;
    public static final c d0;
    public static final c e0;

    static {
        c.Y = new c(1, 0);
        c.Z = new c(1, 1);
        c.b0 = new c(1, 2);
        c.c0 = new c(1, 3);
        c.d0 = new c(1, 4);
        c.e0 = new c(1, 5);
    }

    public c(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = t.a;
        switch(this.X) {
            case 0: {
                ((j)object0).c(q.r, object1);
                return object1;
            }
            case 1: {
                ((Number)object0).longValue();
                return object1;
            }
            case 2: {
                Placeable.PlacementScope placeable$PlacementScope0 = (Placeable.PlacementScope)object0;
                return object1;
            }
            case 3: {
                ((j)object0).c(q.q, object1);
                return object1;
            }
            case 4: {
                Placeable.PlacementScope placeable$PlacementScope1 = (Placeable.PlacementScope)object0;
                return object1;
            }
            default: {
                if(((u)object0).isAttachedToWindow()) {
                    ((u)object0).o();
                }
                return object1;
            }
        }
    }
}

