package B;

import Ab.t;
import D0.J;
import D0.M;
import D0.V;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

public final class s extends k implements Function1 {
    public final V X;
    public final J Y;
    public final M Z;
    public final int b0;
    public final int c0;
    public final u d0;

    public s(V v0, J j0, M m0, int v1, int v2, u u0) {
        this.X = v0;
        this.Y = j0;
        this.Z = m0;
        this.b0 = v1;
        this.c0 = v2;
        this.d0 = u0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        LayoutDirection layoutDirection0 = this.Z.getLayoutDirection();
        r.b(((Placeable.PlacementScope)object0), this.X, this.Y, layoutDirection0, this.b0, this.c0, this.d0.a);
        return t.a;
    }
}

