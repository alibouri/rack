package S2;

import I2.A;
import J2.e;
import R2.u;
import T2.a;
import androidx.work.impl.WorkDatabase;

public final class o {
    public final a a;
    public final e b;
    public final u c;

    static {
        A.g("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase0, e e0, a a0) {
        this.b = e0;
        this.a = a0;
        this.c = workDatabase0.x();
    }
}

