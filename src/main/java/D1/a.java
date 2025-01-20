package d1;

import Ab.t;
import E7.D;
import M0.j;
import Nb.k;
import android.view.View;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;

public final class a extends k implements Function1 {
    public final int X;
    public static final a Y;
    public static final a Z;
    public static final a b0;
    public static final a c0;

    static {
        a.Y = new a(1, 0);
        a.Z = new a(1, 1);
        a.b0 = new a(1, 2);
        a.c0 = new a(1, 3);
    }

    public a(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                ((h)object0).getHandler().post(new D(25, ((h)object0).o0));
                return t.a;
            }
            case 1: {
                Placeable.PlacementScope placeable$PlacementScope0 = (Placeable.PlacementScope)object0;
                return t.a;
            }
            case 2: {
                j j0 = (j)object0;
                return t.a;
            }
            default: {
                View view0 = (View)object0;
                return t.a;
            }
        }
    }
}

