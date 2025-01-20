package f1;

import yc.l;

public final class f extends l {
    @Override  // yc.l
    public final void A(g g0, g g1) {
        g0.b = g1;
    }

    @Override  // yc.l
    public final void B(g g0, Thread thread0) {
        g0.a = thread0;
    }

    @Override  // yc.l
    public final boolean k(h h0, d d0, d d1) {
        synchronized(h0) {
            if(h0.Y == d0) {
                h0.Y = d1;
                return true;
            }
        }
        return false;
    }

    @Override  // yc.l
    public final boolean l(h h0, Object object0, Object object1) {
        synchronized(h0) {
            if(h0.X == object0) {
                h0.X = object1;
                return true;
            }
        }
        return false;
    }

    @Override  // yc.l
    public final boolean m(h h0, g g0, g g1) {
        synchronized(h0) {
            if(h0.Z == g0) {
                h0.Z = g1;
                return true;
            }
        }
        return false;
    }
}

