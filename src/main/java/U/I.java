package u;

import Ab.t;
import D0.V;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.config.a;
import kotlin.jvm.functions.Function1;

public final class i extends k implements Function1 {
    public final u.k X;
    public final V Y;
    public final long Z;

    public i(u.k k0, V v0, long v1) {
        this.X = k0;
        this.Y = v0;
        this.Z = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        long v = this.X.b.a(a.d(this.Y.X, this.Y.Y), this.Z, LayoutDirection.X);
        Placeable.PlacementScope.e(((Placeable.PlacementScope)object0), this.Y, v);
        return t.a;
    }
}

