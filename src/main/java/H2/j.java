package H2;

import J1.N;
import U7.c;
import androidx.viewpager2.widget.ViewPager2;

public final class j extends g {
    public final c a;
    public final B3.c b;
    public d c;
    public final ViewPager2 d;

    public j(ViewPager2 viewPager20) {
        this.d = viewPager20;
        this.a = new c(4, this);
        this.b = new B3.c(5, this);
    }

    public final void a() {
        int v = 0x1020048;
        ViewPager2 viewPager20 = this.d;
        N.h(viewPager20, 0x1020048);
        boolean z = false;
        N.f(viewPager20, 0);
        N.h(viewPager20, 0x1020049);
        N.f(viewPager20, 0);
        N.h(viewPager20, 0x1020046);
        N.f(viewPager20, 0);
        N.h(viewPager20, 0x1020047);
        N.f(viewPager20, 0);
        if(viewPager20.getAdapter() == null) {
            return;
        }
        int v1 = viewPager20.getAdapter().a();
        if(v1 == 0) {
            return;
        }
        if(!viewPager20.s0) {
            return;
        }
        B3.c c0 = this.b;
        c c1 = this.a;
        if(viewPager20.getOrientation() == 0) {
            if(viewPager20.h0.z() == 1) {
                z = true;
            }
            if(z) {
                v = 0x1020049;
            }
            if(viewPager20.e0 < v1 - 1) {
                N.i(viewPager20, new K1.c((z ? 0x1020048 : 0x1020049), null), c1);
            }
            if(viewPager20.e0 > 0) {
                N.i(viewPager20, new K1.c(v, null), c0);
            }
        }
        else {
            if(viewPager20.e0 < v1 - 1) {
                N.i(viewPager20, new K1.c(0x1020047, null), c1);
            }
            if(viewPager20.e0 > 0) {
                N.i(viewPager20, new K1.c(0x1020046, null), c0);
            }
        }
    }
}

