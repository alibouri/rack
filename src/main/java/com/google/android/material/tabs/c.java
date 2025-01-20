package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;

public final class c implements OnTabSelectedListener {
    public final ViewPager a;

    public c(ViewPager viewPager0) {
        this.a = viewPager0;
    }

    @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
    public final void a(Tab tabLayout$Tab0) {
        this.a.setCurrentItem(tabLayout$Tab0.b);
    }
}

