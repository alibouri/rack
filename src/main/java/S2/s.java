package S2;

import B3.c;
import I2.A;
import R2.i;
import java.util.HashMap;

public final class s {
    public final c a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;
    public static final String e;

    static {
        s.e = A.g("WorkTimer");
    }

    public s(c c0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = c0;
    }

    public final void a(i i0) {
        synchronized(this.d) {
            if(((r)this.b.remove(i0)) != null) {
                A.e().a(s.e, "Stopping timer for " + i0);
                this.c.remove(i0);
            }
        }
    }
}

