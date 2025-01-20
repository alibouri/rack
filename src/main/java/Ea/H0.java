package Ea;

import Ab.t;
import D0.V;
import Nb.j;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;

public final class h0 implements Function1 {
    public final int X;
    public final V Y;

    public h0(V v0, int v1) {
        this.X = v1;
        this.Y = v0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((Placeable.PlacementScope)object0), "$this$layout");
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 1: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 2: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            default: {
                j.f(((Placeable.PlacementScope)object0), "$this$layout");
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
        }
    }
}

