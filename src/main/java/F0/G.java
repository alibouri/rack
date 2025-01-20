package F0;

import Aa.s;
import M6.b;
import l0.h;

public final class g implements h {
    public static final g a;
    public static Boolean b;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // l0.h
    public final void a(s s0) {
    }

    @Override  // l0.h
    public final boolean b() {
        Boolean boolean0 = g.b;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        b.U("canFocus is read before it is written");
        throw null;
    }

    @Override  // l0.h
    public final void c(boolean z) {
        g.b = Boolean.valueOf(z);
    }

    @Override  // l0.h
    public final void d(s s0) {
    }
}

