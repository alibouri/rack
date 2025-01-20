package O2;

import I2.A;
import N2.h;
import Nb.j;
import P2.f;
import R2.p;
import android.os.Build.VERSION;

public final class g extends c {
    public final int b;
    public static final String c;

    static {
        String s = A.g("NetworkNotRoamingCtrlr");
        j.e(s, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        g.c = s;
    }

    public g(f f0) {
        j.f(f0, "tracker");
        super(f0);
        this.b = 7;
    }

    @Override  // O2.e
    public final boolean c(p p0) {
        j.f(p0, "workSpec");
        return p0.j.a == 4;
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
        if(v < 24) {
            A.e().a(g.c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            return !z;
        }
        return !z || !((h)object0).d;
    }
}

