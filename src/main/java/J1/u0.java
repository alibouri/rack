package J1;

import B3.d;
import I5.h;
import U5.a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public class u0 extends a {
    public final WindowInsetsController c;
    public final h d;
    public final Window e;

    public u0(Window window0, h h0) {
        WindowInsetsController windowInsetsController0 = window0.getInsetsController();
        super();
        this.c = windowInsetsController0;
        this.d = h0;
        this.e = window0;
    }

    @Override  // U5.a
    public boolean E() {
        t0.A(this.c);
        return (this.c.getSystemBarsAppearance() & 16) != 0;
    }

    @Override  // U5.a
    public boolean F() {
        t0.A(this.c);
        return (this.c.getSystemBarsAppearance() & 8) != 0;
    }

    @Override  // U5.a
    public final void R(boolean z) {
        Window window0 = this.e;
        if(z) {
            if(window0 != null) {
                View view0 = window0.getDecorView();
                view0.setSystemUiVisibility(view0.getSystemUiVisibility() | 16);
            }
            t0.y(this.c);
            return;
        }
        if(window0 != null) {
            View view1 = window0.getDecorView();
            view1.setSystemUiVisibility(view1.getSystemUiVisibility() & -17);
        }
        t0.z(this.c);
    }

    @Override  // U5.a
    public final void S(boolean z) {
        Window window0 = this.e;
        if(z) {
            if(window0 != null) {
                View view0 = window0.getDecorView();
                view0.setSystemUiVisibility(view0.getSystemUiVisibility() | 0x2000);
            }
            t0.p(this.c);
            return;
        }
        if(window0 != null) {
            View view1 = window0.getDecorView();
            view1.setSystemUiVisibility(view1.getSystemUiVisibility() & 0xFFFFDFFF);
        }
        t0.x(this.c);
    }

    @Override  // U5.a
    public final void T() {
        ((d)this.d.Y).F();
        this.c.show(0);
    }
}

