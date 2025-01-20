package D0;

import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import n0.O;

public final class t extends k implements Function1 {
    public final int X;
    public static final t Y;
    public static final t Z;
    public static final t b0;

    static {
        t.Y = new t(1, 0);
        t.Z = new t(1, 1);
        t.b0 = new t(1, 2);
    }

    public t(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                ((LayoutNode)object0).t0 = true;
                return Ab.t.a;
            }
            case 1: {
                O o0 = (O)object0;
                return Ab.t.a;
            }
            default: {
                Placeable.PlacementScope placeable$PlacementScope0 = (Placeable.PlacementScope)object0;
                return Ab.t.a;
            }
        }
    }
}

