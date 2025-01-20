package O2;

import I2.A;
import N2.h;
import Nb.j;
import R2.p;
import android.os.Build.VERSION;

public final class f extends c {
    public final int b;
    public static final String c;

    static {
        String s = A.g("NetworkMeteredCtrlr");
        j.e(s, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f.c = s;
    }

    public f(P2.f f0) {
        j.f(f0, "tracker");
        super(f0);
        this.b = 7;
    }

    @Override  // O2.e
    public final boolean c(p p0) {
        j.f(p0, "workSpec");
        return p0.j.a == 5;
    }

    @Override  // O2.c
    public final int d() {
        return this.b;
    }

    @Override  // O2.c
    public final boolean e(Object object0) {
        j.f(((h)object0), "value");
        int v = Build.VERSION.SDK_INT;
        boolean z = ((h)object0).a;
        if(v < 26) {
            A.e().a(f.c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            return !z;
        }
        return !z || !((h)object0).c;
    }
}

