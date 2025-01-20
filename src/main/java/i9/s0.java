package i9;

import M9.c;
import R1.g;
import R1.j;
import Y8.N;
import ac.B0;
import ac.j0;
import ac.z0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import j9.a;
import o9.M;
import o9.O;
import o9.X;

public final class s0 extends r0 implements a {
    public static final SparseIntArray A;
    public final c w;
    public final c x;
    public final c y;
    public long z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        s0.A = sparseIntArray0;
        sparseIntArray0.put(0x7F0A017A, 5);  // id:ic_settings_call
        sparseIntArray0.put(0x7F0A00B4, 6);  // id:call_support
    }

    public s0(View view0) {
        Object[] arr_object = g.l(view0, 7, null, s0.A);
        TextView textView0 = (TextView)arr_object[6];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[3];
        SimpleRecyclerView simpleRecyclerView0 = (SimpleRecyclerView)arr_object[2];
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object[5];
        super(null, view0, linearLayout0, simpleRecyclerView0, ((Button)arr_object[4]), ((Toolbar)arr_object[1]));
        this.z = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.s(view0);
        this.w = new c(2, 2, this);
        this.x = new c(3, 2, this);
        this.y = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                X x0 = this.u;
                if(x0 != null) {
                    M m0 = new M(x0, null);
                    N.k(x0, x0.g0, true, m0);
                    return;
                }
                break;
            }
            case 2: {
                X x1 = this.u;
                if(x1 != null) {
                    x1.q();
                    return;
                }
                break;
            }
            case 3: {
                X x2 = this.u;
                if(x2 != null) {
                    x2.Z.d("security questions: press submit on form", null);
                    O o0 = new O(x2, null);
                    N.k(x2, x2.g0, true, o0);
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
            v = this.z;
            this.z = 0L;
        }
        Adapter recyclerView$Adapter0 = this.v;
        X x0 = this.u;
        int v1 = Long.compare(10L & v, 0L);
        int v2 = Long.compare(13L & v, 0L);
        boolean z = false;
        CharSequence charSequence0 = null;
        if(v2 != 0) {
            j0 j00 = x0 == null ? null : x0.q0;
            j.e(this, 0, j00);
            z = g.q((j00 == null ? null : ((Boolean)((B0)j00.X).getValue())));
            if((v & 12L) != 0L && x0 != null) {
                charSequence0 = x0.j0;
            }
        }
        if((8L & v) != 0L) {
            this.q.setOnClickListener(this.w);
            this.s.setOnClickListener(this.x);
            this.t.setOnClickListener(this.y);
        }
        if(v1 != 0) {
            this.r.setAdapter(recyclerView$Adapter0);
        }
        if(v2 != 0) {
            this.s.setEnabled(z);
        }
        if((v & 12L) != 0L) {
            this.t.setTitle(charSequence0);
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
        if(14 == v) {
            this.u(((Adapter)object0));
            return true;
        }
        if(29 == v) {
            this.v(((X)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.r0
    public final void u(Adapter recyclerView$Adapter0) {
        this.v = recyclerView$Adapter0;
        synchronized(this) {
            this.z |= 2L;
        }
        this.o();
    }

    @Override  // i9.r0
    public final void v(X x0) {
        this.u = x0;
        synchronized(this) {
            this.z |= 4L;
        }
        this.o();
    }
}

