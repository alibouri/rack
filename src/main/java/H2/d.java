package H2;

import androidx.viewpager2.widget.ViewPager2;
import p2.C;

public final class d extends C {
    public final int a;
    public final Object b;

    public d(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // p2.C
    public final void a() {
        if(this.a != 0) {
            ((j)this.b).a();
            return;
        }
        ((ViewPager2)this.b).f0 = true;
        ((ViewPager2)this.b).m0.l = true;
    }

    @Override  // p2.C
    public final void b(int v, int v1, Object object0) {
        this.a();
    }

    @Override  // p2.C
    public final void c(int v, int v1) {
        this.a();
    }

    @Override  // p2.C
    public final void d(int v, int v1) {
        this.a();
    }

    @Override  // p2.C
    public final void e(int v, int v1) {
        this.a();
    }
}

