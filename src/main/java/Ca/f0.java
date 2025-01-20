package ca;

import android.util.SparseIntArray;

public final class f0 extends e0 {
    public long s;
    public static final SparseIntArray t;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        f0.t = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0257, 2);  // id:qr_code_box
    }

    @Override  // R1.g
    public final void f() {
        synchronized(this) {
            long v = this.s;
            this.s = 0L;
        }
        String s = this.r;
        if((v & 3L) != 0L) {
            this.q.setQrcontent(s);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.s = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(24 == v) {
            this.u(((String)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.e0
    public final void u(String s) {
        this.r = s;
        synchronized(this) {
            this.s |= 1L;
        }
        this.o();
    }
}

