package ca;

import I5.h;
import Nb.j;
import Qa.T;
import R1.g;
import R9.L0;
import R9.M0;
import R9.N0;
import R9.P0;
import W4.f;
import Y8.N;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import fa.c;
import fa.e;
import q9.U0;

public final class v extends u implements c, e {
    public long A;
    public static final SparseIntArray B;
    public final M9.c w;
    public final M9.c x;
    public final h y;
    public final M9.c z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        v.B = sparseIntArray0;
        sparseIntArray0.put(0x7F0A019D, 5);  // id:lbl_enter_full_legal_name
    }

    public v(View view0) {
        Object[] arr_object = g.l(view0, 6, null, v.B);
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        TextView textView0 = (TextView)arr_object[5];
        super(null, view0, constraintLayout0, ((Button)arr_object[3]), ((TextView)arr_object[4]), ((Toolbar)arr_object[1]), ((EditText)arr_object[2]));
        this.A = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.s(view0);
        this.w = new M9.c(4, 1, this);
        this.x = new M9.c(1, 1, this);
        this.y = new h(this, 2);
        this.z = new M9.c(3, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                P0 p00 = this.v;
                if(p00 != null) {
                    L0 l00 = new L0(p00, null);
                    N.k(p00, p00.c0, true, l00);
                    return;
                }
                break;
            }
            case 3: {
                P0 p01 = this.v;
                if(p01 != null) {
                    M0 m00 = new M0(p01, null);
                    N.k(p01, p01.c0, true, m00);
                    return;
                }
                break;
            }
            case 4: {
                P0 p02 = this.v;
                if(p02 != null) {
                    N0 n00 = new N0(p02, null);
                    N.k(p02, p02.c0, true, n00);
                    return;
                }
                break;
            }
        }
    }

    @Override  // fa.e
    public final void b(CharSequence charSequence0) {
        P0 p00 = this.v;
        if(p00 != null && charSequence0 != null) {
            String s = charSequence0.toString();
            j.f(s, "s");
            p00.d0.getClass();
            p00.d0.l(null, s);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.A;
            this.A = 0L;
        }
        int v1 = Long.compare(3L & v, 0L);
        T t0 = v1 == 0 || this.v == null ? null : this.v.f0;
        if(v1 != 0) {
            U0.b(this.r, t0);
        }
        if((v & 2L) != 0L) {
            this.r.setOnClickListener(this.z);
            this.s.setOnClickListener(this.w);
            this.t.setOnClickListener(this.x);
            f.N(this.u, this.y);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.A != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.A = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((P0)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.u
    public final void u(P0 p00) {
        this.v = p00;
        synchronized(this) {
            this.A |= 1L;
        }
        this.o();
    }
}

