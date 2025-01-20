package H2;

import android.view.View;
import p2.E;
import p2.F;

public final class f implements F {
    @Override  // p2.F
    public final void a(View view0) {
        E e0 = (E)view0.getLayoutParams();
        if(e0.width != -1 || e0.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override  // p2.F
    public final void d(View view0) {
    }
}

