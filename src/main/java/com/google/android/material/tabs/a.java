package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import java.lang.ref.WeakReference;

public final class a implements OnPageChangeListener {
    public final WeakReference a;
    public int b;
    public int c;

    public a(TabLayout tabLayout0) {
        this.a = new WeakReference(tabLayout0);
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public final void a(int v) {
        this.b = this.c;
        this.c = v;
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public final void b(int v) {
        TabLayout tabLayout0 = (TabLayout)this.a.get();
        if(tabLayout0 != null && tabLayout0.getSelectedTabPosition() != v && v < tabLayout0.getTabCount()) {
            boolean z = this.c == 0 || this.c == 2 && this.b == 0;
            tabLayout0.k(tabLayout0.g(v), z);
        }
    }
}

