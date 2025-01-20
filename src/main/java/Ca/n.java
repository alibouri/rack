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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.LifecycleOwner;
import fa.c;
import o9.a0;

public final class n extends m implements c {
    public final M9.c v;
    public long w;
    public static final w x;
    public static final SparseIntArray y;

    static {
        w w0 = new w(7);
        n.x = w0;
        w0.G(1, new int[]{3}, new String[]{"virtual_card_qr_code"}, new int[]{0x7F0D0107});  // layout:virtual_card_qr_code
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        n.y = sparseIntArray0;
        sparseIntArray0.put(0x7F0A016A, 4);  // id:guideline_left
        sparseIntArray0.put(0x7F0A016B, 5);  // id:guideline_right
        sparseIntArray0.put(0x7F0A0169, 6);  // id:guideline_bottom
    }

    public n(View view0) {
        Object[] arr_object = g.l(view0, 7, n.x, n.y);
        Guideline guideline0 = (Guideline)arr_object[6];
        Guideline guideline1 = (Guideline)arr_object[4];
        Guideline guideline2 = (Guideline)arr_object[5];
        super(null, view0, ((AppCompatImageView)arr_object[2]), ((e0)arr_object[3]), ((ConstraintLayout)arr_object[1]));
        this.w = -1L;
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.q.setTag(null);
        e0 e00 = this.r;
        if(e00 != null) {
            e00.i = this;
        }
        this.s.setTag(null);
        this.s(view0);
        this.v = new M9.c(1, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        S s0 = this.t;
        if(s0 != null) {
            O o0 = new O(s0, null);
            N.k(s0, s0.Y, true, o0);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.w;
            this.w = 0L;
        }
        S s0 = this.t;
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
            this.q.setOnClickListener(this.v);
        }
        if(v1 != 0) {
            this.r.u(s1);
        }
        this.r.g();
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(Long.compare(this.w, 0L) != 0) {
                return true;
            }
        }
        return this.r.i();
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.w = 8L;
        }
        this.r.j();
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
                        this.w |= 2L;
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
        this.r.r(lifecycleOwner0);
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((S)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.m
    public final void u(S s0) {
        this.t = s0;
        synchronized(this) {
            this.w |= 4L;
        }
        this.o();
    }

    public final boolean v(int v) {
        if(v == 0) {
            synchronized(this) {
                this.w |= 1L;
            }
            return true;
        }
        return false;
    }
}

