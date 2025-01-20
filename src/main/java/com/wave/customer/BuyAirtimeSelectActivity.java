package com.wave.customer;

import Ab.o;
import E7.D;
import K9.q;
import Nb.j;
import R1.d;
import R9.K;
import R9.M;
import R9.u;
import R9.v;
import R9.w;
import R9.x;
import W4.f;
import Xb.J;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ViewModelKt;
import ca.i;
import kotlin.coroutines.k;
import mb.a;
import q9.k3;
import q9.r1;
import v1.b;
import w1.c;

public final class BuyAirtimeSelectActivity extends k3 {
    public i F0;
    public final o G0;
    public final o H0;
    public k I0;
    public final v J0;
    public final x K0;
    public static final int L0;

    public BuyAirtimeSelectActivity() {
        this.G0 = f.A(new u(this, 0));
        this.H0 = f.A(new u(this, 1));
        this.J0 = new v(this);
        this.K0 = new x(this);
    }

    public final void I(boolean z) {
        ((q)this.H0.getValue()).a.d(z);
        k k0 = this.I0;
        if(k0 != null) {
            k0.i(Boolean.valueOf(z));
        }
        this.I0 = null;
        if(z) {
            new Handler(Looper.getMainLooper()).postDelayed(new D(11, this), 200L);
        }
    }

    @Override  // c2.x
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 2) {
            boolean z = c.a(this, "android.permission.READ_CONTACTS") == 0;
            if(z) {
                r1.b(this).e().d("contacts permission granted from system settings", null);
            }
            else {
                r1.b(this).e().d("contacts permission not granted from system settings", null);
            }
            this.I(z);
        }
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        o o0 = this.G0;
        M m0 = (M)o0.getValue();
        i i0 = (i)d.a(this.getLayoutInflater(), 0x7F0D0031, null);  // layout:buy_airtime_select
        this.setContentView(i0.d);
        i0.r(this);
        i0.v(m0);
        o o1 = this.H0;
        i0.u(((q)o1.getValue()));
        i0.t.j(this.K0);
        this.F0 = i0;
        i0.t.setItemAnimator(null);
        if(c.a(this, "android.permission.READ_CONTACTS") != 0 && !b.g(this, "android.permission.READ_CONTACTS")) {
            r1.b(this).e().d("has denied contact permissions forever", null);
        }
        else if(c.a(this, "android.permission.READ_CONTACTS") == 0) {
            r1.b(this).e().d("has contacts permission", null);
        }
        else {
            r1.b(this).e().d("doesn\'t have contacts permission", null);
        }
        if(c.a(this, "android.permission.READ_CONTACTS") == 0) {
            ((q)o1.getValue()).a.d(true);
            i i1 = this.F0;
            if(i1 != null) {
                i1.r.requestFocus();
                return;
            }
            j.p("binding");
            throw null;
        }
        a.a(null, ViewModelKt.a(((M)o0.getValue())), new w(this, null), 1);
    }

    @Override  // c2.x
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        j.f(arr_s, "permissions");
        j.f(arr_v, "grantResults");
        super.onRequestPermissionsResult(v, arr_s, arr_v);
        boolean z = true;
        if(v == 1) {
            if(arr_v.length == 0 || arr_v[0] != 0) {
                z = false;
            }
            this.I(z);
            Integer integer0 = arr_v.length == 0 ? null : ((int)arr_v[0]);
            if(integer0 != null && ((int)integer0) == 0) {
                r1.b(this).e().d("contacts permission granted in-app", null);
                return;
            }
            if(integer0 != null && ((int)integer0) == -1) {
                r1.b(this).e().d("contacts permission denied in-app", null);
                return;
            }
            r1.b(this).e().d("contacts permission flow cancelled in-app", null);
        }
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        M m0 = (M)this.G0.getValue();
        m0.getClass();
        J.q(ViewModelKt.a(m0), null, null, new K(m0, null), 3);
        ((q)this.H0.getValue()).a.c();
    }
}

