package m2;

import J1.b;
import K1.d;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends b {
    public final i d;

    public h(i i0) {
        this.d = i0;
        super();
    }

    @Override  // J1.b
    public final void d(View view0, d d0) {
        this.d.g.d(view0, d0);
        this.d.f.getClass();
        I i0 = RecyclerView.M(view0);
        int v = i0 == null ? -1 : i0.b();
        Adapter recyclerView$Adapter0 = this.d.f.getAdapter();
        if(!(recyclerView$Adapter0 instanceof g)) {
            return;
        }
        ((g)recyclerView$Adapter0).q(v);
    }

    @Override  // J1.b
    public final boolean g(View view0, int v, Bundle bundle0) {
        return this.d.g.g(view0, v, bundle0);
    }
}

