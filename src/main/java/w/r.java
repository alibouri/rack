package w;

import Ab.t;
import M0.f;
import M0.j;
import M0.q;
import M0.s;
import Nb.k;
import Tb.e;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.jvm.functions.Function1;

public final class r extends k implements Function1 {
    public final int X;
    public static final r Y;
    public static final r Z;
    public static final r b0;
    public static final r c0;
    public static final r d0;

    static {
        r.Y = new r(1, 0);
        r.Z = new r(1, 1);
        r.b0 = new r(1, 2);
        r.c0 = new r(1, 3);
        r.d0 = new r(1, 4);
    }

    public r(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = t.a;
        switch(this.X) {
            case 0: {
                ((LayoutNodeDrawScope)object0).a();
                return object1;
            }
            case 1: {
                Placeable.PlacementScope placeable$PlacementScope0 = (Placeable.PlacementScope)object0;
                return object1;
            }
            case 2: {
                ((Number)object0).longValue();
                return object1;
            }
            case 3: {
                e e0 = s.a[1];
                q.c.a(((j)object0), f.d);
                return object1;
            }
            default: {
                return new C0(((Number)object0).intValue());
            }
        }
    }
}

