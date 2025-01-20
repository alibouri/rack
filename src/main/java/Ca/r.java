package ca;

import R1.g;
import Y8.N;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import bc.n;
import com.sendwave.components.SimpleRecyclerView;
import fa.c;
import ma.h;
import ma.i;
import ma.p;
import q9.U0;

public final class r extends q implements c {
    public final M9.c v;
    public final M9.c w;
    public long x;

    public r(View view0) {
        Object[] arr_object = g.l(view0, 4, null, null);
        super(null, view0, ((SimpleRecyclerView)arr_object[2]), ((Button)arr_object[3]), ((Toolbar)arr_object[1]));
        this.x = -1L;
        this.q.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.s(view0);
        this.v = new M9.c(2, 1, this);
        this.w = new M9.c(1, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                p p0 = this.t;
                if(p0 != null) {
                    h h0 = new h(p0, null);
                    N.k(p0, p0.b0, true, h0);
                    return;
                }
                break;
            }
            case 2: {
                p p1 = this.t;
                if(p1 != null) {
                    i i0 = new i(p1, null);
                    N.k(p1, p1.b0, true, i0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.x;
            this.x = 0L;
        }
        Adapter recyclerView$Adapter0 = this.u;
        int v1 = Long.compare(5L & v, 0L);
        n n0 = v1 == 0 || this.t == null ? null : this.t.k0;
        if((6L & v) != 0L) {
            this.q.setAdapter(recyclerView$Adapter0);
        }
        if(v1 != 0) {
            U0.b(this.r, n0);
        }
        if((v & 4L) != 0L) {
            this.r.setOnClickListener(this.v);
            this.s.setOnClickListener(this.w);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.x != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.x = 4L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(0x1F == v) {
            this.v(((p)object0));
            return true;
        }
        if(2 == v) {
            this.u(((Adapter)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.q
    public final void u(Adapter recyclerView$Adapter0) {
        this.u = recyclerView$Adapter0;
        synchronized(this) {
            this.x |= 2L;
        }
        this.o();
    }

    @Override  // ca.q
    public final void v(p p0) {
        this.t = p0;
        synchronized(this) {
            this.x |= 1L;
        }
        this.o();
    }
}

