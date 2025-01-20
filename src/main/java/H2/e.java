package H2;

import androidx.viewpager2.widget.ViewPager2;

public final class e extends i {
    public final int a;
    public final ViewPager2 b;

    public e(ViewPager2 viewPager20, int v) {
        this.a = v;
        this.b = viewPager20;
        super();
    }

    @Override  // H2.i
    public void a(int v) {
        if(this.a != 0) {
            return;
        }
        if(v == 0) {
            this.b.d();
        }
    }

    @Override  // H2.i
    public final void c(int v) {
        if(this.a != 0) {
            ViewPager2 viewPager20 = this.b;
            viewPager20.clearFocus();
            if(viewPager20.hasFocus()) {
                viewPager20.k0.requestFocus(2);
            }
            return;
        }
        ViewPager2 viewPager21 = this.b;
        if(viewPager21.e0 != v) {
            viewPager21.e0 = v;
            viewPager21.u0.a();
        }
    }
}

