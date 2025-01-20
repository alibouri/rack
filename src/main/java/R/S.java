package r;

import E7.C;
import N4.j;
import R2.e;
import R2.k;
import U0.F;
import a8.Q;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import m2.c;

public class s extends ViewModel {
    public F Y;
    public j Z;
    public e b0;
    public C c0;
    public Q d0;
    public k e0;
    public c f0;
    public String g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public MutableLiveData n0;
    public MutableLiveData o0;
    public MutableLiveData p0;
    public MutableLiveData q0;
    public MutableLiveData r0;
    public boolean s0;
    public MutableLiveData t0;
    public int u0;
    public MutableLiveData v0;
    public MutableLiveData w0;

    public s() {
        this.h0 = 0;
        this.s0 = true;
        this.u0 = 0;
    }

    public final int o() {
        if(this.b0 != null) {
            return this.c0 == null ? 0xFF : 15;
        }
        return 0;
    }

    public final CharSequence p() {
        CharSequence charSequence0 = this.g0;
        if(charSequence0 != null) {
            return charSequence0;
        }
        e e0 = this.b0;
        return e0 != null ? ((String)e0.Y) : null;
    }

    public final void q(r.e e0) {
        if(this.o0 == null) {
            this.o0 = new MutableLiveData();
        }
        s.u(this.o0, e0);
    }

    public final void r(CharSequence charSequence0) {
        if(this.w0 == null) {
            this.w0 = new MutableLiveData();
        }
        s.u(this.w0, charSequence0);
    }

    public final void s(int v) {
        if(this.v0 == null) {
            this.v0 = new MutableLiveData();
        }
        s.u(this.v0, v);
    }

    public final void t(boolean z) {
        if(this.r0 == null) {
            this.r0 = new MutableLiveData();
        }
        s.u(this.r0, Boolean.valueOf(z));
    }

    public static void u(MutableLiveData mutableLiveData0, Object object0) {
        if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData0.j(object0);
            return;
        }
        mutableLiveData0.h(object0);
    }
}

