package ca;

import I5.h;
import K9.p;
import K9.q;
import R1.g;
import R9.B;
import R9.M;
import Y8.N;
import ac.B0;
import ac.j0;
import ac.z0;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.SimpleRecyclerView;
import f9.f;
import fa.c;
import fa.e;
import q9.U0;

public final class j extends i implements c, e {
    public final M9.c x;
    public final h y;
    public long z;

    public j(View view0) {
        Object[] arr_object = g.l(view0, 5, null, null);
        super(null, view0, ((ConstraintLayout)arr_object[0]), ((TextInputEditText)arr_object[3]), ((TextInputLayout)arr_object[2]), ((SimpleRecyclerView)arr_object[4]), ((Toolbar)arr_object[1]));
        this.z = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.s(view0);
        this.x = new M9.c(1, 1, this);
        this.y = new h(this, 2);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        M m0 = this.v;
        if(m0 != null) {
            B b0 = new B(m0, null);
            N.k(m0, m0.b0, true, b0);
        }
    }

    @Override  // fa.e
    public final void b(CharSequence charSequence0) {
        q q0 = this.w;
        if(q0 != null) {
            p p0 = q0.a;
            if(p0 != null && charSequence0 != null) {
                String s = charSequence0.toString();
                Nb.j.f(s, "query");
                p0.l0.getClass();
                p0.l0.l(null, s);
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.z;
            this.z = 0L;
        }
        M m0 = this.v;
        int v1 = Long.compare(10L & v, 0L);
        Boolean boolean0 = null;
        f f0 = v1 == 0 || this.w == null ? null : this.w.c;
        int v2 = Long.compare(13L & v, 0L);
        boolean z = false;
        if(v2 != 0) {
            p p0 = m0 == null ? null : m0.d0;
            j0 j00 = p0 == null ? null : p0.h0;
            R1.j.e(this, 0, j00);
            if(j00 != null) {
                boolean0 = (Boolean)((B0)j00.X).getValue();
            }
            z = g.q(boolean0);
        }
        if((v & 8L) != 0L) {
            W4.f.N(this.r, this.y);
            this.u.setOnClickListener(this.x);
        }
        if(v2 != 0) {
            U0.o(this.s, z);
        }
        if(v1 != 0) {
            this.t.setAdapter(f0);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.z != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.z = 8L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        if(v != 0) {
            return false;
        }
        z0 z00 = (z0)object0;
        if(v1 == 0) {
            synchronized(this) {
                this.z |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(25 == v) {
            this.u(((q)object0));
            return true;
        }
        if(30 == v) {
            this.v(((M)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.i
    public final void u(q q0) {
        this.w = q0;
        synchronized(this) {
            this.z |= 2L;
        }
        this.o();
    }

    @Override  // ca.i
    public final void v(M m0) {
        this.v = m0;
        synchronized(this) {
            this.z |= 4L;
        }
        this.o();
    }
}

