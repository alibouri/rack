package i9;

import android.util.SparseIntArray;

public final class y extends x {
    public long s;
    public static final SparseIntArray t;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        y.t = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0245, 1);  // id:pin
    }

    @Override  // R1.g
    public final void f() {
        synchronized(this) {
            this.s = 0L;
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
            this.s = 1L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        return true;
    }
}

