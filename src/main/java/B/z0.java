package B;

import I2.J;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.Modifier;
import g0.f;

public final class z0 implements y0 {
    public static final z0 a;

    static {
        z0.a = new z0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // B.y0
    public final Modifier a(Modifier modifier0, float f, boolean z) {
        if(((double)f) <= 0.0) {
            throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
        }
        return modifier0.d(new LayoutWeightElement(J.o(f, 3.402823E+38f), z));
    }

    public final Modifier b(Modifier modifier0, f f0) {
        return modifier0.d(new VerticalAlignElement(f0));
    }
}

