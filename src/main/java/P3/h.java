package P3;

import Bb.A;
import Bb.B;
import Bb.F;
import Bb.r;
import Nb.j;
import O3.a;
import O3.i;
import O3.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public final class h extends i {
    public final LinkedHashMap b;

    public h() {
        this.b = new LinkedHashMap();
    }

    @Override  // O3.i
    public final void a() {
        this.b.clear();
        i i0 = this.a;
        if(i0 != null) {
            i0.a();
        }
    }

    @Override  // O3.i
    public final l b(String s, a a0) {
        j.f(s, "key");
        j.f(a0, "cacheHeaders");
        try {
            l l0 = this.a == null ? null : this.a.b(s, a0);
            g g0 = (g)this.b.get(s);
            return l0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // O3.i
    public final Collection c(Collection collection0, a a0) {
        A a1;
        j.f(collection0, "keys");
        j.f(a0, "cacheHeaders");
        i i0 = this.a;
        if(i0 == null) {
            a1 = A.X;
        }
        else {
            Collection collection1 = i0.c(collection0, a0);
            if(collection1 == null) {
                a1 = A.X;
            }
            else {
                int v = F.I(r.b0(collection1));
                if(v < 16) {
                    v = 16;
                }
                a1 = new LinkedHashMap(v);
                for(Object object0: collection1) {
                    a1.put(((l)object0).X, object0);
                }
            }
        }
        Collection collection2 = new ArrayList();
        for(Object object1: collection0) {
            l l0 = (l)a1.get(((String)object1));
            g g0 = (g)this.b.get(((String)object1));
            if(l0 != null) {
                ((ArrayList)collection2).add(l0);
            }
        }
        return collection2;
    }

    @Override  // O3.i
    public final Set d(Collection collection0, a a0) {
        j.f(collection0, "records");
        j.f(a0, "cacheHeaders");
        i i0 = this.a;
        return i0 != null ? i0.d(collection0, a0) : B.X;
    }
}

