package Ea;

import Ab.t;
import D0.V;
import Nb.j;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;

public final class o0 implements Function1 {
    public final V X;
    public final int Y;

    public o0(V v0, int v1) {
        this.X = v0;
        this.Y = v1;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((Placeable.PlacementScope)object0), "$this$layout");
        Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.X, 0, -this.Y);
        return t.a;
    }
}

