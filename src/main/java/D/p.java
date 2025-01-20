package D;

import Ab.t;
import Bb.z;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class p extends k implements Function1 {
    public final int X;
    public static final p Y;
    public static final p Z;
    public static final p b0;
    public static final p c0;

    static {
        p.Y = new p(1, 0);
        p.Z = new p(1, 1);
        p.b0 = new p(1, 2);
        p.c0 = new p(1, 3);
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
                ((Number)object0).intValue();
                return null;
            }
            case 2: {
                return new A(((Number)((List)object0).get(0)).intValue(), ((Number)((List)object0).get(1)).intValue());
            }
            default: {
                ((Number)object0).intValue();
                return z.X;
            }
        }
    }
}

