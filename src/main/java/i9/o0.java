package i9;

import L9.m;
import android.util.SparseIntArray;
import android.widget.Button;

public final class o0 extends m {
    public long s;
    public static final SparseIntArray t;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        o0.t = sparseIntArray0;
        sparseIntArray0.put(0x7F0A025E, 2);  // id:receipt
        sparseIntArray0.put(0x7F0A0245, 3);  // id:pin
    }

    @Override  // R1.g
    public final void f() {
        synchronized(this) {
            long v = this.s;
            this.s = 0L;
        }
        if((v & 3L) != 0L) {
            ((Button)this.q).setOnClickListener(null);
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
        if(1 == v) {
            if(object0 != null) {
                throw new ClassCastException();
            }
            synchronized(this) {
                this.s |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

