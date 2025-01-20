package ca;

import Ha.S;
import N2.l;
import R1.g;
import W4.f;
import Y8.N;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import fa.c;
import ma.s;
import ma.t;
import q9.U0;

public final class x extends w implements c {
    public final M9.c w;
    public final M9.c x;
    public long y;
    public static final SparseIntArray z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        x.z = sparseIntArray0;
        sparseIntArray0.put(0x7F0A004B, 6);  // id:activation_key_label
    }

    public x(View view0) {
        Object[] arr_object = g.l(view0, 7, null, x.z);
        TextView textView0 = (TextView)arr_object[3];
        TextView textView1 = (TextView)arr_object[6];
        super(null, view0, textView0, ((TextView)arr_object[5]), ((ImageView)arr_object[2]), ((TextView)arr_object[4]), ((Toolbar)arr_object[1]));
        this.y = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.s(view0);
        this.w = new M9.c(2, 1, this);
        this.x = new M9.c(1, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                ma.x x0 = this.v;
                if(x0 != null) {
                    t t0 = new t(x0, null);
                    N.k(x0, x0.Y, true, t0);
                    return;
                }
                break;
            }
            case 2: {
                ma.x x1 = this.v;
                if(x1 != null) {
                    s s0 = new s(x1, null);
                    N.k(x1, x1.Y, true, s0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s1;
        S s0;
        l l0;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        ma.x x0 = this.v;
        int v1 = Long.compare(3L & v, 0L);
        if(v1 == 0 || x0 == null) {
            l0 = null;
            s1 = null;
            s0 = null;
        }
        else {
            l0 = x0.c0;
            s0 = x0.d0;
            s1 = x0.b0;
        }
        if(v1 != 0) {
            f.M(this.q, s1);
            U0.e(this.r, l0);
            U0.d(this.s, s0);
        }
        if((v & 2L) != 0L) {
            this.t.setOnClickListener(this.w);
            this.u.setOnClickListener(this.x);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.y != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.y = 2L;
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
            this.u(((ma.x)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.w
    public final void u(ma.x x0) {
        this.v = x0;
        synchronized(this) {
            this.y |= 1L;
        }
        this.o();
    }
}

