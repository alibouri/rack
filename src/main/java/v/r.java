package V;

import F0.W;
import R2.w;
import U.B0;
import U.t0;
import U0.l;
import java.util.ArrayList;

public final class r extends C {
    public static final r c;

    static {
        r.c = new r(0, 1, 1);  // initializer: LV/C;-><init>(III)V
    }

    @Override  // V.C
    public final void a(l l0, w w0, B0 b00, W w1) {
        t0 t00 = (t0)l0.e(0);
        ((ArrayList)w1.c).add(t00);
    }

    // Deobfuscation rating: LOW(30)
    @Override  // V.C
    public final String c(int v) {
        return v == 0 ? "value" : super.c(v);
    }
}

