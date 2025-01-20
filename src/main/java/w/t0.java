package w;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.unit.Density;

public final class t0 implements r0 {
    public static final t0 a;

    static {
        t0.a = new t0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // w.r0
    public final q0 a(View view0, boolean z, long v, float f, float f1, boolean z1, Density density0, float f2) {
        return new s0(new Magnifier(view0));
    }

    @Override  // w.r0
    public final boolean b() {
        return false;
    }
}

