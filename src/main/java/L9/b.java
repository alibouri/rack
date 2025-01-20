package l9;

import Ab.k;
import Ab.t;
import Bb.F;
import Fb.j;
import I2.H;
import W5.f;
import hb.n;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.h;

public final class b extends j implements Function2 {
    public Object c0;
    public final String d0;

    public b(String s, g g0) {
        this.d0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b)this.t(((H)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new b(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        H h0 = (H)this.c0;
        int v = h0 == null ? 0 : h0.l;
        int v1 = v == 0 ? -1 : a.a[h.d(v)];
        if(v1 != 1) {
            return v1 == 2 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }
        n.d("ID photo upload failed", null, F.J(new k("fileHash", this.d0)), false, 10);
        return Boolean.valueOf(false);
    }
}

