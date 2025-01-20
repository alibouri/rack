package J1;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import z1.b;

public class n0 extends m0 {
    public b n;
    public b o;
    public b p;

    public n0(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override  // J1.p0
    public b h() {
        if(this.o == null) {
            this.o = b.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override  // J1.p0
    public b j() {
        if(this.n == null) {
            this.n = b.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override  // J1.p0
    public b l() {
        if(this.p == null) {
            this.p = b.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override  // J1.k0
    public WindowInsetsCompat m(int v, int v1, int v2, int v3) {
        return WindowInsetsCompat.g(null, this.c.inset(v, v1, v2, v3));
    }

    @Override  // J1.l0
    public void s(b b0) {
    }
}

