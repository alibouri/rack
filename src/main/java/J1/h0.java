package J1;

import android.graphics.Insets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import z1.b;

public class h0 extends j0 {
    public final WindowInsets.Builder c;

    public h0() {
        this.c = g0.f();
    }

    public h0(WindowInsetsCompat windowInsetsCompat0) {
        super(windowInsetsCompat0);
        WindowInsets windowInsets0 = windowInsetsCompat0.f();
        this.c = windowInsets0 == null ? g0.f() : g0.g(windowInsets0);
    }

    @Override  // J1.j0
    public WindowInsetsCompat b() {
        this.a();
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.g(null, this.c.build());
        windowInsetsCompat0.a.q(this.b);
        return windowInsetsCompat0;
    }

    @Override  // J1.j0
    public void d(b b0) {
        Insets insets0 = b0.d();
        this.c.setMandatorySystemGestureInsets(insets0);
    }

    @Override  // J1.j0
    public void e(b b0) {
        Insets insets0 = b0.d();
        this.c.setStableInsets(insets0);
    }

    @Override  // J1.j0
    public void f(b b0) {
        Insets insets0 = b0.d();
        this.c.setSystemGestureInsets(insets0);
    }

    @Override  // J1.j0
    public void g(b b0) {
        Insets insets0 = b0.d();
        this.c.setSystemWindowInsets(insets0);
    }

    @Override  // J1.j0
    public void h(b b0) {
        Insets insets0 = b0.d();
        this.c.setTappableElementInsets(insets0);
    }
}

