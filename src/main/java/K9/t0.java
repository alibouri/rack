package K9;

import Ab.o;
import E7.D;
import Fb.c;
import L9.k;
import Nb.j;
import R1.d;
import W4.f;
import Xb.J;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ViewModelKt;
import mb.a;
import q9.k3;
import q9.r1;
import v1.b;

public abstract class t0 extends k3 {
    public k F0;
    public final o G0;
    public final o H0;
    public kotlin.coroutines.k I0;
    public final o0 J0;
    public final r0 K0;

    public t0() {
        this.G0 = f.A(new n0(this, 0));
        this.H0 = f.A(new n0(this, 1));
        this.J0 = new o0(this);
        this.K0 = new r0(this);
    }

    public final J0 I() {
        return (J0)this.G0.getValue();
    }

    public final void J(boolean z) {
        ((q)this.H0.getValue()).a.d(z);
        kotlin.coroutines.k k0 = this.I0;
        if(k0 != null) {
            k0.i(Boolean.valueOf(z));
        }
        this.I0 = null;
        if(z) {
            new Handler(Looper.getMainLooper()).postDelayed(new D(5, this), 200L);
        }
    }

    public abstract Object K(c arg1);

    @Override  // c2.x
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 2) {
            boolean z = w1.c.a(this, "android.permission.READ_CONTACTS") == 0;
            if(z) {
                r1.b(this).e().d("contacts permission granted from system settings", null);
            }
            else {
                r1.b(this).e().d("contacts permission not granted from system settings", null);
            }
            this.J(z);
        }
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        J0 j00 = this.I();
        k k0 = (k)d.a(this.getLayoutInflater(), 0x7F0D00F1, null);  // layout:send_money_select
        this.setContentView(k0.d);
        k0.r(this);
        k0.v(j00);
        o o0 = this.H0;
        k0.u(((q)o0.getValue()));
        k0.t.j(this.K0);
        this.F0 = k0;
        q9.o0.R(this, new p0(j00, this, null));
        k k1 = this.F0;
        if(k1 != null) {
            k1.t.setItemAnimator(null);
            if(w1.c.a(this, "android.permission.READ_CONTACTS") != 0 && !b.g(this, "android.permission.READ_CONTACTS")) {
                r1.b(this).e().d("has denied contact permissions forever", null);
            }
            else if(w1.c.a(this, "android.permission.READ_CONTACTS") == 0) {
                r1.b(this).e().d("has contacts permission", null);
            }
            else {
                r1.b(this).e().d("doesn\'t have contacts permission", null);
            }
            if(w1.c.a(this, "android.permission.READ_CONTACTS") == 0) {
                ((q)o0.getValue()).a.d(true);
                k k2 = this.F0;
                if(k2 != null) {
                    k2.q.requestFocus();
                    r1.b(this).e().d("view contact list screen", null);
                    return;
                }
                j.p("binding");
                throw null;
            }
            else {
                a.a(null, ViewModelKt.a(this.I()), new q0(this, null), 1);
            }
            r1.b(this).e().d("view contact list screen", null);
            return;
        }
        j.p("binding");
        throw null;
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
            this.J(z);
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
        J0 j00 = this.I();
        j00.getClass();
        J.q(ViewModelKt.a(j00), null, null, new B0(j00, null), 3);
        ((q)this.H0.getValue()).a.c();
    }
}

