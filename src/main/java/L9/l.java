package L9;

import K9.J0;
import K9.p;
import K9.q;
import K9.w0;
import M9.b;
import M9.c;
import M9.d;
import Nb.j;
import R1.g;
import R2.w;
import Y8.N;
import ac.B0;
import ac.j0;
import ac.z0;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.SimpleRecyclerView;
import f9.f;
import q9.U0;

public final class l extends k implements b, d {
    public long A;
    public static final w B;
    public final c y;
    public final B3.c z;

    static {
        w w0 = new w(6);
        l.B = w0;
        w0.G(0, new int[]{5}, new String[]{"overdraft_banner"}, new int[]{0x7F0D00AF});  // layout:overdraft_banner
    }

    public l(View view0) {
        Object[] arr_object = g.l(view0, 6, l.B, null);
        super(null, view0, ((TextInputEditText)arr_object[3]), ((TextInputLayout)arr_object[2]), ((L9.d)arr_object[5]), ((SimpleRecyclerView)arr_object[4]), ((ConstraintLayout)arr_object[0]), ((Toolbar)arr_object[1]));
        this.A = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        L9.d d0 = this.s;
        if(d0 != null) {
            d0.i = this;
        }
        this.t.setTag(null);
        this.u.setTag(null);
        this.v.setTag(null);
        this.s(view0);
        this.y = new c(1, 0, this);
        this.z = new B3.c(this);
        this.j();
    }

    @Override  // M9.b
    public final void a(View view0, int v) {
        J0 j00 = this.w;
        if(j00 != null) {
            w0 w00 = new w0(j00, null);
            N.k(j00, j00.d0, true, w00);
        }
    }

    @Override  // M9.d
    public final void b(CharSequence charSequence0) {
        q q0 = this.x;
        if(q0 != null) {
            p p0 = q0.a;
            if(p0 != null && charSequence0 != null) {
                String s = charSequence0.toString();
                j.f(s, "query");
                p0.l0.getClass();
                p0.l0.l(null, s);
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.A;
            this.A = 0L;
        }
        J0 j00 = this.w;
        int v1 = Long.compare(20L & v, 0L);
        Boolean boolean0 = null;
        f f0 = v1 == 0 || this.x == null ? null : this.x.c;
        int v2 = Long.compare(25L & v, 0L);
        boolean z = false;
        if(v2 != 0) {
            p p0 = j00 == null ? null : j00.j0;
            j0 j01 = p0 == null ? null : p0.h0;
            R1.j.e(this, 0, j01);
            if(j01 != null) {
                boolean0 = (Boolean)((B0)j01.X).getValue();
            }
            z = g.q(boolean0);
        }
        if((v & 16L) != 0L) {
            W4.f.N(this.q, this.z);
            this.v.setOnClickListener(this.y);
        }
        if(v2 != 0) {
            U0.o(this.r, z);
        }
        if(v1 != 0) {
            this.t.setAdapter(f0);
        }
        this.s.g();
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(Long.compare(this.A, 0L) != 0) {
                return true;
            }
        }
        return this.s.i();
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.A = 16L;
        }
        this.s.j();
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                z0 z00 = (z0)object0;
                return this.w(v1);
            }
            case 1: {
                L9.d d0 = (L9.d)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.A |= 2L;
                    }
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // R1.g
    public final void r(LifecycleOwner lifecycleOwner0) {
        super.r(lifecycleOwner0);
        this.s.r(lifecycleOwner0);
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(25 == v) {
            this.u(((q)object0));
            return true;
        }
        if(30 == v) {
            this.v(((J0)object0));
            return true;
        }
        return false;
    }

    @Override  // L9.k
    public final void u(q q0) {
        this.x = q0;
        synchronized(this) {
            this.A |= 4L;
        }
        this.o();
    }

    @Override  // L9.k
    public final void v(J0 j00) {
        this.w = j00;
        synchronized(this) {
            this.A |= 8L;
        }
        this.o();
    }

    public final boolean w(int v) {
        if(v == 0) {
            synchronized(this) {
                this.A |= 1L;
            }
            return true;
        }
        return false;
    }
}

