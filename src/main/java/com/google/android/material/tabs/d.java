package com.google.android.material.tabs;

import H2.i;
import java.lang.ref.WeakReference;

public final class d extends i {
    public final WeakReference a;
    public int b;
    public int c;

    public d(TabLayout tabLayout0) {
        this.a = new WeakReference(tabLayout0);
        this.c = 0;
        this.b = 0;
    }

    @Override  // H2.i
    public final void a(int v) {
        this.b = this.c;
        this.c = v;
    }

    @Override  // H2.i
    public final void b(int v, float f, int v1) {
        TabLayout tabLayout0 = (TabLayout)this.a.get();
        if(tabLayout0 != null) {
            boolean z = false;
            boolean z1 = this.c != 2 || this.b == 1;
            if(this.c != 2 || this.b != 0) {
                z = true;
            }
            tabLayout0.m(v, f, z1, z);
        }
    }

    @Override  // H2.i
    public final void c(int v) {
        TabLayout tabLayout0 = (TabLayout)this.a.get();
        if(tabLayout0 != null && tabLayout0.getSelectedTabPosition() != v && v < tabLayout0.getTabCount()) {
            boolean z = this.c == 0 || this.c == 2 && this.b == 0;
            tabLayout0.k(tabLayout0.g(v), z);
        }
    }
}

