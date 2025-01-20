package R;

import Nb.k;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class x0 extends k implements Function0 {
    public final boolean X;
    public final Density Y;
    public final A0 Z;
    public final Function1 b0;
    public final boolean c0;

    public x0(boolean z, Density density0, A0 a00, Function1 function10, boolean z1) {
        this.X = z;
        this.Y = density0;
        this.Z = a00;
        this.b0 = function10;
        this.c0 = z1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new z0(this.X, this.Y, this.Z, this.b0, this.c0);
    }
}

