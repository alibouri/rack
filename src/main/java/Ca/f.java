package ca;

import R1.g;
import R1.j;
import R9.h;
import R9.l;
import R9.q;
import Y8.N;
import ac.B0;
import ac.h0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import bc.n;
import com.sendwave.components.SimpleRecyclerView;
import fa.c;
import q9.U0;

public final class f extends e implements c {
    public final M9.c w;
    public final M9.c x;
    public long y;
    public static final SparseIntArray z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        f.z = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0209, 4);  // id:next_button_shadow
        sparseIntArray0.put(0x7F0A0208, 5);  // id:next_button_bg
    }

    public f(View view0) {
        Object[] arr_object = g.l(view0, 6, null, f.z);
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        SimpleRecyclerView simpleRecyclerView0 = (SimpleRecyclerView)arr_object[2];
        Button button0 = (Button)arr_object[3];
        View view1 = (View)arr_object[5];
        View view2 = (View)arr_object[4];
        super(null, view0, constraintLayout0, simpleRecyclerView0, button0, ((Toolbar)arr_object[1]));
        this.y = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.s(view0);
        this.w = new M9.c(1, 1, this);
        this.x = new M9.c(2, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                q q0 = this.u;
                if(q0 != null) {
                    h h0 = new h(q0, null);
                    N.k(q0, q0.k0, true, h0);
                    return;
                }
                break;
            }
            case 2: {
                q q1 = this.u;
                if(q1 != null) {
                    l l0 = new l(q1, null);
                    N.k(q1, q1.k0, true, l0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        n n0;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        q q0 = this.u;
        Adapter recyclerView$Adapter0 = this.v;
        int v1 = Long.compare(11L & v, 0L);
        B0 b00 = null;
        if(v1 == 0) {
            n0 = null;
        }
        else {
            n0 = (v & 10L) == 0L || q0 == null ? null : q0.s0;
            if(q0 != null) {
                b00 = q0.o0;
            }
            j.e(this, 0, b00);
            if(b00 != null) {
                Integer integer0 = (Integer)b00.getValue();
            }
        }
        int v2 = Long.compare(12L & v, 0L);
        if(v1 != 0) {
            U0.i(this.q, b00);
        }
        if(v2 != 0) {
            this.r.setAdapter(recyclerView$Adapter0);
        }
        if((v & 10L) != 0L) {
            U0.b(this.s, n0);
        }
        if((v & 8L) != 0L) {
            this.s.setOnClickListener(this.x);
            this.t.setOnClickListener(this.w);
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
            this.y = 8L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        if(v != 0) {
            return false;
        }
        h0 h00 = (h0)object0;
        if(v1 == 0) {
            synchronized(this) {
                this.y |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(0x1F == v) {
            this.v(((q)object0));
            return true;
        }
        if(14 == v) {
            this.u(((Adapter)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.e
    public final void u(Adapter recyclerView$Adapter0) {
        this.v = recyclerView$Adapter0;
        synchronized(this) {
            this.y |= 4L;
        }
        this.o();
    }

    @Override  // ca.e
    public final void v(q q0) {
        this.u = q0;
        synchronized(this) {
            this.y |= 2L;
        }
        this.o();
    }
}

