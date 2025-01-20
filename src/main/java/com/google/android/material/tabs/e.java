package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2;

public final class e implements OnTabSelectedListener {
    public final ViewPager2 a;

    public e(ViewPager2 viewPager20) {
        this.a = viewPager20;
    }

    @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
    public final void a(Tab tabLayout$Tab0) {
        this.a.b(tabLayout$Tab0.b, true);
    }
}

