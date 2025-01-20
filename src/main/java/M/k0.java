package M;

import A3.e;
import Bb.A;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.X;
import D0.o;
import java.util.ArrayList;
import java.util.List;

public final class k0 implements K {
    public static final k0 a;

    static {
        k0.a = new k0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        Integer integer0 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            arrayList0.add(((J)list0.get(v3)).a(v));
        }
        int v4 = arrayList0.size();
        Integer integer1 = integer0;
        for(int v5 = 0; v5 < v4; ++v5) {
            V v6 = (V)arrayList0.get(v5);
            integer1 = Math.max(integer1.intValue(), v6.X);
        }
        int v7 = integer1.intValue();
        int v8 = arrayList0.size();
        for(int v2 = 0; v2 < v8; ++v2) {
            V v9 = (V)arrayList0.get(v2);
            integer0 = Math.max(integer0.intValue(), v9.Y);
        }
        int v10 = integer0.intValue();
        X x0 = new X(2, arrayList0);
        return m0.L(v7, v10, A.X, x0);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        return e.h(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        return e.k(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        return e.b(this, o0, list0, v);
    }
}

