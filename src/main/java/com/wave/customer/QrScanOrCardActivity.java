package com.wave.customer;

import Ab.o;
import E7.l;
import Nb.j;
import R1.d;
import R9.U0;
import R9.c2;
import R9.g2;
import R9.h2;
import R9.o2;
import W4.f;
import Xb.J;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.viewpager2.widget.ViewPager2;
import c2.N;
import ca.W;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import h9.a;
import java.util.ArrayList;
import q9.k3;
import q9.r1;

public final class QrScanOrCardActivity extends k3 {
    public W F0;
    public U0 G0;
    public final o H0;
    public final o I0;
    public static final int J0;

    public QrScanOrCardActivity() {
        this.H0 = f.A(new c2(this, 0));
        this.I0 = f.A(new c2(this, 1));
    }

    public final TabLayout I() {
        W w0 = this.F0;
        if(w0 != null) {
            j.e(w0.s, "tabLayout");
            return w0.s;
        }
        j.p("binding");
        throw null;
    }

    public final o2 J() {
        return (o2)this.H0.getValue();
    }

    public final ViewPager2 K() {
        W w0 = this.F0;
        if(w0 != null) {
            j.e(w0.r, "pager");
            return w0.r;
        }
        j.p("binding");
        throw null;
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        W w0 = (W)d.a(this.getLayoutInflater(), 0x7F0D00E2, null);  // layout:qr_scan_or_card
        w0.r(this);
        w0.u(this.J());
        this.F0 = w0;
        this.C(this.J().i0);
        this.setContentView(w0.d);
        N n0 = this.w();
        j.e(n0, "getSupportFragmentManager(...)");
        j.f(this.X, "lifecycle");
        this.G0 = new U0(n0, this.X);  // initializer: LG2/i;-><init>(Lc2/N;Landroidx/lifecycle/Lifecycle;)V
        this.K().setUserInputEnabled(false);
        ViewPager2 viewPager20 = this.K();
        U0 u00 = this.G0;
        if(u00 != null) {
            viewPager20.setAdapter(u00);
            this.I().a(new g2(this));
            TabLayout tabLayout0 = this.I();
            ViewPager2 viewPager21 = this.K();
            com.google.android.material.tabs.f f0 = new com.google.android.material.tabs.f(tabLayout0, viewPager21, new l(25));
            if(f0.d) {
                throw new IllegalStateException("TabLayoutMediator is already attached");
            }
            Adapter recyclerView$Adapter0 = viewPager21.getAdapter();
            f0.c = recyclerView$Adapter0;
            if(recyclerView$Adapter0 == null) {
                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            }
            f0.d = true;
            com.google.android.material.tabs.d d0 = new com.google.android.material.tabs.d(tabLayout0);
            ((ArrayList)viewPager21.d0.b).add(d0);
            tabLayout0.a(new e(viewPager21));
            G2.f f1 = new G2.f(1, f0);
            f0.c.o(f1);
            f0.a();
            tabLayout0.m(viewPager21.getCurrentItem(), 0.0f, true, true);
            return;
        }
        j.p("fragmentAdapter");
        throw null;
    }

    @Override  // c2.x
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        j.f(arr_s, "permissions");
        j.f(arr_v, "grantResults");
        super.onRequestPermissionsResult(v, arr_s, arr_v);
        this.getWindow().getDecorView().setSystemUiVisibility(5380);
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        this.getWindow().getDecorView().setSystemUiVisibility(5380);
        if(((CustomerApp)r1.b(this)).G0 == 1 && a.a.get()) {
            J.q(LifecycleOwnerKt.a(this), null, null, new h2(this, null), 3);
        }
    }
}

