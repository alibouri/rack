package R;

import Ab.t;
import Bb.a;
import D0.a0;
import Fb.j;
import N.v;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

public final class z0 {
    public final boolean a;
    public final boolean b;
    public final v c;

    public z0(boolean z, Density density0, A0 a00, Function1 function10, boolean z1) {
        this.a = z;
        this.b = z1;
        if(z && a00 == A0.Z) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if(z1 && a00 == A0.X) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = new v(a00, new a(23, density0), new a0(25, density0), y0.b, function10);
    }

    public static Object a(z0 z00, A0 a00, j j0) {
        float f = z00.c.h.k();
        Object object0 = androidx.compose.material3.internal.a.b(z00.c, a00, f, j0);
        return object0 != Eb.a.X ? t.a : object0;
    }

    public final Object b(j j0) {
        if(this.b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object object0 = z0.a(this, A0.X, j0);
        return object0 == Eb.a.X ? object0 : t.a;
    }

    public final boolean c() {
        return this.c.d.getValue() != A0.X;
    }

    public final Object d(j j0) {
        if(this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object object0 = z0.a(this, A0.Z, j0);
        return object0 == Eb.a.X ? object0 : t.a;
    }
}

