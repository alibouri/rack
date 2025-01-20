package ca;

import I5.h;
import R1.g;
import R1.j;
import W4.f;
import ac.B0;
import ac.j0;
import ac.z0;
import android.util.SparseIntArray;
import f9.A;

public final class d0 extends c0 {
    public h t;
    public long u;
    public static final SparseIntArray v;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        d0.v = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0307, 3);  // id:toolbar
        sparseIntArray0.put(0x7F0A019E, 4);  // id:lbl_enter_pin
        sparseIntArray0.put(0x7F0A0197, 5);  // id:keypad
    }

    @Override  // R1.g
    public final void f() {
        CharSequence charSequence0;
        h h0;
        synchronized(this) {
            long v = this.u;
            this.u = 0L;
        }
        A a0 = this.s;
        int v1 = 0;
        if(Long.compare(15L & v, 0L) == 0) {
            h0 = null;
            charSequence0 = null;
        }
        else {
            if((v & 12L) == 0L || a0 == null) {
                h0 = null;
            }
            else {
                h0 = this.t;
                if(h0 == null) {
                    h0 = new h(27, false);
                    this.t = h0;
                }
                h0.Y = a0;
            }
            if((v & 13L) == 0L) {
                charSequence0 = null;
            }
            else {
                j0 j00 = a0 == null ? null : a0.i;
                j.e(this, 0, j00);
                charSequence0 = j00 == null ? null : ((String)((B0)j00.X).getValue());
            }
            if((v & 14L) != 0L) {
                j0 j01 = a0 == null ? null : a0.j;
                j.e(this, 1, j01);
                v1 = g.p((j01 == null ? null : ((Integer)((B0)j01.X).getValue())));
            }
        }
        if((13L & v) != 0L) {
            f.M(this.q, charSequence0);
        }
        if((14L & v) != 0L) {
            this.q.setSelection(v1);
            this.r.setProgress(v1);
        }
        if((v & 12L) != 0L) {
            this.q.setOnRequest(h0);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.u != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.u = 8L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                z0 z00 = (z0)object0;
                return this.v(v1);
            }
            case 1: {
                z0 z01 = (z0)object0;
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
    public final boolean t(int v, Object object0) {
        if(23 == v) {
            this.u(((A)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.c0
    public final void u(A a0) {
        this.s = a0;
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

