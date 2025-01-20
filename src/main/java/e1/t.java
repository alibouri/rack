package e1;

import Nb.k;
import Nb.v;
import a1.h;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;

public final class t extends k implements Function0 {
    public final v X;
    public final u Y;
    public final h Z;
    public final long b0;
    public final long c0;

    public t(v v0, u u0, h h0, long v1, long v2) {
        this.X = v0;
        this.Y = u0;
        this.Z = h0;
        this.b0 = v1;
        this.c0 = v2;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LayoutDirection layoutDirection0 = this.Y.getParentLayoutDirection();
        this.X.X = this.Y.getPositionProvider().a(this.Z, this.b0, layoutDirection0, this.c0);
        return Ab.t.a;
    }
}

