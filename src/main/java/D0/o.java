package D0;

import F0.f;
import Nb.j;
import java.util.ArrayList;
import java.util.List;

public final class O implements K {
    public final N a;

    public O(N n0) {
        this.a = n0;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        ArrayList arrayList0 = f.l(o0);
        return this.a.a(o0, arrayList0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        ArrayList arrayList0 = f.l(m0);
        return this.a.b(m0, arrayList0, v);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        ArrayList arrayList0 = f.l(o0);
        return this.a.c(o0, arrayList0, v);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        ArrayList arrayList0 = f.l(o0);
        return this.a.d(o0, arrayList0, v);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        ArrayList arrayList0 = f.l(o0);
        return this.a.e(o0, arrayList0, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof O ? j.a(this.a, ((O)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}

