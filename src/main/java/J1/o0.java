package J1;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import z1.b;

public final class o0 extends n0 {
    public static final WindowInsetsCompat q;

    static {
        o0.q = WindowInsetsCompat.g(null, WindowInsets.CONSUMED);
    }

    public o0(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
    }

    @Override  // J1.k0
    public final void d(View view0) {
    }

    @Override  // J1.k0
    public b f(int v) {
        int v1 = q0.a(v);
        return b.c(this.c.getInsets(v1));
    }

    @Override  // J1.k0
    public b g(int v) {
        int v1 = q0.a(v);
        return b.c(this.c.getInsetsIgnoringVisibility(v1));
    }

    @Override  // J1.k0
    public boolean p(int v) {
        int v1 = q0.a(v);
        return this.c.isVisible(v1);
    }
}

