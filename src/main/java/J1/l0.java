package J1;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import z1.b;

public class l0 extends k0 {
    public b m;

    public l0(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
        this.m = null;
    }

    @Override  // J1.p0
    public WindowInsetsCompat b() {
        return WindowInsetsCompat.g(null, this.c.consumeStableInsets());
    }

    @Override  // J1.p0
    public WindowInsetsCompat c() {
        return WindowInsetsCompat.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override  // J1.p0
    public final b i() {
        if(this.m == null) {
            this.m = b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
        }
        return this.m;
    }

    @Override  // J1.p0
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override  // J1.p0
    public void s(b b0) {
        this.m = b0;
    }
}

