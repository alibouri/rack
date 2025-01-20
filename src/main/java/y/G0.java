package y;

import A.k;
import K9.h;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;

public abstract class g0 {
    public static final h a;
    public static final h b;

    static {
        g0.a = new h(3, null, 3);
        g0.b = new h(3, null, 4);
    }

    public static Modifier a(Modifier modifier0, l0 l00, q0 q00, boolean z, k k0, boolean z1, Function3 function30, boolean z2, int v) {
        k k1 = (v & 8) == 0 ? k0 : null;
        return (v & 0x80) == 0 ? modifier0.d(new DraggableElement(l00, q00, z, k1, z1, g0.a, function30, z2)) : modifier0.d(new DraggableElement(l00, q00, z, k1, z1, g0.a, function30, false));
    }
}

