package com.google.android.material.tabs;

import Ab.k;
import E7.l;
import R9.k2;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.viewpager2.widget.ViewPager2;

public final class f {
    public final TabLayout a;
    public final ViewPager2 b;
    public Adapter c;
    public boolean d;

    public f(TabLayout tabLayout0, ViewPager2 viewPager20, l l0) {
        this.a = tabLayout0;
        this.b = viewPager20;
    }

    public final void a() {
        TabLayout tabLayout0 = this.a;
        tabLayout0.j();
        Adapter recyclerView$Adapter0 = this.c;
        if(recyclerView$Adapter0 != null) {
            int v = recyclerView$Adapter0.a();
            for(int v1 = 0; v1 < v; ++v1) {
                Tab tabLayout$Tab0 = tabLayout0.h();
                CharSequence charSequence0 = (CharSequence)((k)k2.a.get(v1)).X;
                if(TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence0)) {
                    tabLayout$Tab0.e.setContentDescription(charSequence0);
                }
                tabLayout$Tab0.a = charSequence0;
                b b0 = tabLayout$Tab0.e;
                if(b0 != null) {
                    b0.d();
                }
                tabLayout0.b(tabLayout$Tab0, false);
            }
            if(v > 0) {
                int v2 = Math.min(this.b.getCurrentItem(), tabLayout0.getTabCount() - 1);
                if(v2 != tabLayout0.getSelectedTabPosition()) {
                    tabLayout0.k(tabLayout0.g(v2), true);
                }
            }
        }
    }
}

