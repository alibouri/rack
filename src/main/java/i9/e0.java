package i9;

import L9.m;
import W4.f;
import android.util.SparseIntArray;
import android.widget.TextView;

public final class e0 extends m {
    public long s;
    public static final SparseIntArray t;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        e0.t = sparseIntArray0;
        sparseIntArray0.put(0x7F0A010E, 2);  // id:description
    }

    @Override  // R1.g
    public final void f() {
        synchronized(this) {
            long v = this.s;
            this.s = 0L;
        }
        String s = (String)this.r;
        if((v & 5L) != 0L) {
            f.M(((TextView)this.q), s);
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
            this.s = 4L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(27 == v) {
            this.r = (String)object0;
            synchronized(this) {
                this.s |= 1L;
            }
            this.o();
            return true;
        }
        if(11 == v) {
            String s = (String)object0;
            return true;
        }
        return false;
    }
}

