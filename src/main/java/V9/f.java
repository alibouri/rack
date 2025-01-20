package v9;

import A3.e;
import Bb.A;
import Bb.r;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.o;
import Nb.j;
import a1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class f implements K {
    public static final f a;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        j.f(m0, "$this$Layout");
        j.f(list0, "measurables");
        long v1 = a.a(v, 0, 0, 0, 0, 10);
        ArrayList arrayList0 = new ArrayList(r.b0(list0));
        for(Object object0: list0) {
            arrayList0.add(((J)object0).a(v1));
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        int v2 = ((V)object1).X;
        while(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            int v3 = ((V)object2).X;
            if(v2 < v3) {
                v2 = v3;
            }
        }
        int v4 = Math.max(v2, a.j(v));
        Iterator iterator2 = arrayList0.iterator();
        if(!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object3 = iterator2.next();
        int v5 = ((V)object3).Y;
        while(iterator2.hasNext()) {
            Object object4 = iterator2.next();
            int v6 = ((V)object4).Y;
            if(v5 < v6) {
                v5 = v6;
            }
        }
        S3.a a0 = new S3.a(1, arrayList0);
        return m0.L(v4, Math.max(v5, a.i(v)), A.X, a0);
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

