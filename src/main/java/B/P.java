package B;

import Ab.t;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;
import v.h;

public final class p extends k implements Function1 {
    public final int X;
    public static final p Y;
    public static final p Z;
    public static final p b0;
    public static final p c0;
    public static final p d0;

    static {
        p.Y = new p(1, 0);
        p.Z = new p(1, 1);
        p.b0 = new p(1, 2);
        p.c0 = new p(1, 3);
        p.d0 = new p(1, 4);
    }

    public p(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                Placeable.PlacementScope placeable$PlacementScope0 = (Placeable.PlacementScope)object0;
                return t.a;
            }
            case 1: {
                Placeable.PlacementScope placeable$PlacementScope1 = (Placeable.PlacementScope)object0;
                return t.a;
            }
            case 2: {
                Placeable.PlacementScope placeable$PlacementScope2 = (Placeable.PlacementScope)object0;
                return t.a;
            }
            case 3: {
                Placeable.PlacementScope placeable$PlacementScope3 = (Placeable.PlacementScope)object0;
                return t.a;
            }
            case 4: {
                Placeable.PlacementScope placeable$PlacementScope4 = (Placeable.PlacementScope)object0;
                return t.a;
            }
            case 5: {
                throw h.c(object0);
            }
            case 6: {
                throw h.c(object0);
            }
            case 7: {
                throw h.c(object0);
            }
            case 8: {
                throw h.c(object0);
            }
            default: {
                throw h.c(object0);
            }
        }
    }
}

