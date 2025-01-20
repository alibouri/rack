package i9;

import R1.j;
import R2.w;
import ac.B0;
import ac.h0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import o9.w1;
import q9.U0;

public final class d0 extends c0 {
    public long u;
    public static final w v;

    static {
        w w0 = new w(2);
        d0.v = w0;
        w0.G(0, new int[]{1}, new String[]{"pay_bill_dialog_base"}, new int[]{0x7F0D00B3});  // layout:pay_bill_dialog_base
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.u;
            this.u = 0L;
        }
        w1 w10 = this.s;
        Adapter recyclerView$Adapter0 = this.t;
        int v1 = Long.compare(21L & v, 0L);
        B0 b00 = null;
        if(v1 != 0) {
            if(w10 != null) {
                b00 = w10.m0;
            }
            j.e(this, 0, b00);
            if(b00 != null) {
                Integer integer0 = (Integer)b00.getValue();
            }
        }
        int v2 = Long.compare(24L & v, 0L);
        if((20L & v) != 0L) {
            this.q.x(w10);
        }
        if((v & 16L) != 0L) {
            this.q.w("Pay");
            this.q.u("Next");
        }
        if(v2 != 0) {
            this.q.v(recyclerView$Adapter0);
        }
        if(v1 != 0) {
            U0.i(this.r, b00);
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
            this.u = 16L;
        }
        this.q.j();
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                h0 h00 = (h0)object0;
                return this.w(v1);
            }
            case 1: {
                S s0 = (S)object0;
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
        if(0x1F == v) {
            this.v(((w1)object0));
            return true;
        }
        if(14 == v) {
            this.u(((Adapter)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.c0
    public final void u(Adapter recyclerView$Adapter0) {
        this.t = recyclerView$Adapter0;
        synchronized(this) {
            this.u |= 8L;
        }
        this.o();
    }

    @Override  // i9.c0
    public final void v(w1 w10) {
        this.s = w10;
        synchronized(this) {
            this.u |= 4L;
        }
        this.o();
    }

    public final boolean w(int v) {
        if(v == 0) {
            synchronized(this) {
                this.u |= 1L;
            }
            return true;
        }
        return false;
    }
}

