package k0;

import a1.b;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class g implements a {
    public static final g X;
    public static final b Y;

    static {
        g.X = new g();  // initializer: Ljava/lang/Object;-><init>()V
        g.Y = new b(1.0f, 1.0f);
    }

    @Override  // k0.a
    public final long d() {
        return 0x7FC000007FC00000L;
    }

    @Override  // k0.a
    public final Density getDensity() {
        return g.Y;
    }

    @Override  // k0.a
    public final LayoutDirection getLayoutDirection() {
        return LayoutDirection.X;
    }
}

