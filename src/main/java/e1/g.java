package e1;

import Ab.t;
import Nb.k;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;

public final class g extends k implements Function0 {
    public final u X;
    public final Function0 Y;
    public final x Z;
    public final String b0;
    public final LayoutDirection c0;

    public g(u u0, Function0 function00, x x0, String s, LayoutDirection layoutDirection0) {
        this.X = u0;
        this.Y = function00;
        this.Z = x0;
        this.b0 = s;
        this.c0 = layoutDirection0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.X.l(this.Y, this.Z, this.b0, this.c0);
        return t.a;
    }
}

