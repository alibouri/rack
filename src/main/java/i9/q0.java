package i9;

import M9.c;
import R1.g;
import Y8.N;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import j9.a;
import o9.J;
import o9.X;

public final class q0 extends p0 implements a {
    public final c u;
    public final c v;
    public long w;
    public static final SparseIntArray x;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        q0.x = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0249, 3);  // id:please_contact_support
    }

    public q0(View view0) {
        Object[] arr_object = g.l(view0, 4, null, q0.x);
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        Button button0 = (Button)arr_object[2];
        TextView textView0 = (TextView)arr_object[3];
        super(null, view0, constraintLayout0, button0, ((Toolbar)arr_object[1]));
        this.w = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.s(view0);
        this.u = new c(2, 2, this);
        this.v = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                X x0 = this.t;
                if(x0 != null) {
                    J j0 = new J(x0, null);
                    N.k(x0, x0.g0, true, j0);
                    return;
                }
                break;
            }
            case 2: {
                X x1 = this.t;
                if(x1 != null) {
                    x1.q();
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        synchronized(this) {
            long v = this.w;
            this.w = 0L;
        }
        if((v & 2L) != 0L) {
            this.r.setOnClickListener(this.u);
            this.s.setOnClickListener(this.v);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.w != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.w = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(29 == v) {
            this.u(((X)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.p0
    public final void u(X x0) {
        this.t = x0;
        synchronized(this) {
            this.w |= 1L;
        }
        this.o();
    }
}

