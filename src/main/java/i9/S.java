package i9;

import R1.g;
import q9.u0;

public final class s extends g {
    public long q;

    @Override  // R1.g
    public final void f() {
        synchronized(this) {
            this.q = 0L;
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.q != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.q = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(10 == v) {
            u0 u00 = (u0)object0;
            return true;
        }
        return false;
    }
}

