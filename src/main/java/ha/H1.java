package ha;

import Ab.t;
import Fb.j;
import Sa.c;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h1 extends j implements Function2 {
    public final S2 c0;

    public h1(S2 s20, g g0) {
        this.c0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((h1)this.t(((R9)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h1(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        do {
            Object object1 = this.c0.z1.getValue();
            c c0 = (c)object1;
        }
        while(!this.c0.z1.j(object1, null));
        return t.a;
    }
}

