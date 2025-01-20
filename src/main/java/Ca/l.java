package ca;

import R1.g;
import R1.j;
import R2.w;
import R9.O;
import R9.S;
import Y8.N;
import ac.B0;
import ac.j0;
import ac.z0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import fa.c;
import o9.a0;

public final class l extends k implements c {
    public final ImageView s;
    public final M9.c t;
    public long u;
    public static final w v;
    public static final SparseIntArray w;

    static {
        w w0 = new w(4);
        l.v = w0;
        w0.G(0, new int[]{2}, new String[]{"virtual_card_qr_code"}, new int[]{0x7F0D0107});  // layout:virtual_card_qr_code
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        l.w = sparseIntArray0;
        sparseIntArray0.put(0x7F0A031B, 3);  // id:vcard
    }

    public l(View view0) {
        Object[] arr_object = g.l(view0, 4, l.v, l.w);
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object[3];
        super(null, view0, ((e0)arr_object[2]));
        this.u = -1L;
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.s = (ImageView)arr_object[1];
        ((ImageView)arr_object[1]).setTag(null);
        e0 e00 = this.q;
        if(e00 != null) {
            e00.i = this;
        }
        this.s(view0);
        this.t = new M9.c(1, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        S s0 = this.r;
        if(s0 != null) {
            O o0 = new O(s0, null);
            N.k(s0, s0.Y, true, o0);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.u;
            this.u = 0L;
        }
        S s0 = this.r;
        int v1 = Long.compare(14L & v, 0L);
        String s1 = null;
        if(v1 != 0) {
            a0 a00 = s0 == null ? null : s0.Z;
            j0 j00 = a00 == null ? null : a00.Y;
            j.e(this, 1, j00);
            if(j00 != null) {
                s1 = (String)((B0)j00.X).getValue();
            }
        }
        if((v & 8L) != 0L) {
            this.s.setOnClickListener(this.t);
        }
        if(v1 != 0) {
            this.q.u(s1);
        }
        this.q.g();
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(Long.compare(this.u, 0L) != 0) {
                return true;
            }
        }
        return this.q.i();
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.u = 8L;
        }
        this.q.j();
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                e0 e00 = (e0)object0;
                return this.v(v1);
            }
            case 1: {
                z0 z00 = (z0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.u |= 2L;
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
        this.q.r(lifecycleOwner0);
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((S)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.k
    public final void u(S s0) {
        this.r = s0;
        synchronized(this) {
            this.u |= 4L;
        }
        this.o();
    }

    public final boolean v(int v) {
        if(v == 0) {
            synchronized(this) {
                this.u |= 1L;
            }
            return true;
        }
        return false;
    }
}

