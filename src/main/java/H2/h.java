package H2;

import K1.d;
import U7.c;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class h extends LinearLayoutManager {
    public final ViewPager2 E;

    public h(ViewPager2 viewPager20) {
        this.E = viewPager20;
        super(1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final void R(B b0, F f0, d d0) {
        super.R(b0, f0, d0);
        this.E.u0.getClass();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final void T(B b0, F f0, View view0, d d0) {
        int v1;
        int v;
        ViewPager2 viewPager20 = this.E.u0.d;
        if(viewPager20.getOrientation() == 1) {
            viewPager20.h0.getClass();
            v = LayoutManager.E(view0);
        }
        else {
            v = 0;
        }
        if(viewPager20.getOrientation() == 0) {
            viewPager20.h0.getClass();
            v1 = LayoutManager.E(view0);
        }
        else {
            v1 = 0;
        }
        d0.k(c.t(false, v, 1, v1, 1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final boolean e0(B b0, F f0, int v, Bundle bundle0) {
        this.E.u0.getClass();
        return super.e0(b0, f0, v, bundle0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final boolean j0(RecyclerView recyclerView0, View view0, Rect rect0, boolean z, boolean z1) {
        return false;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(F f0, int[] arr_v) {
        ViewPager2 viewPager20 = this.E;
        int v = viewPager20.getOffscreenPageLimit();
        if(v == -1) {
            super.z0(f0, arr_v);
            return;
        }
        int v1 = viewPager20.getPageSize() * v;
        arr_v[0] = v1;
        arr_v[1] = v1;
    }
}

