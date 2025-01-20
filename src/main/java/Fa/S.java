package Fa;

import Bb.A;
import Bb.p;
import D0.J;
import D0.L;
import D0.M;
import D0.N;
import D0.V;
import D0.k;
import D0.o;
import D0.q;
import Nb.j;
import W5.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class s implements N {
    @Override  // D0.N
    public final int a(o o0, List list0, int v) {
        ArrayList arrayList0 = new ArrayList(((ArrayList)list0).size());
        int v1 = ((ArrayList)list0).size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)((ArrayList)list0).get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new k(((J)list1.get(v4)), 2, 1, 0));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = f.c(0, v, 7);
        return this.b(new q(o0, o0.getLayoutDirection()), arrayList0, v5).l();
    }

    @Override  // D0.N
    public final L b(M m0, List list0, long v) {
        j.f(m0, "$this$measure");
        List list1 = (List)((ArrayList)list0).get(0);
        List list2 = (List)((ArrayList)list0).get(1);
        if(list1.size() != 1) {
            throw new IllegalArgumentException("Pin should have exactly one composable");
        }
        if(list2.size() <= 0) {
            throw new IllegalArgumentException("Content should have at least one composable");
        }
        ArrayList arrayList0 = new ArrayList(list2.size());
        int v2 = list2.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            arrayList0.add(((J)list2.get(v1)).a(v));
        }
        Iterator iterator0 = arrayList0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        int v3 = ((V)object0).Y;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            int v4 = ((V)object1).Y;
            if(v3 < v4) {
                v3 = v4;
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = iterator1.next();
        int v5 = ((V)object2).X;
        while(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            int v6 = ((V)object3).X;
            if(v5 < v6) {
                v5 = v6;
            }
        }
        r r0 = new r(arrayList0, ((J)p.p0(list1)).a(v), v5, v3);
        return m0.L(v5, v3, A.X, r0);
    }

    @Override  // D0.N
    public final int c(o o0, List list0, int v) {
        ArrayList arrayList0 = new ArrayList(((ArrayList)list0).size());
        int v1 = ((ArrayList)list0).size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)((ArrayList)list0).get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new k(((J)list1.get(v4)), 1, 2, 0));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = f.c(v, 0, 13);
        return this.b(new q(o0, o0.getLayoutDirection()), arrayList0, v5).e();
    }

    @Override  // D0.N
    public final int d(o o0, List list0, int v) {
        ArrayList arrayList0 = new ArrayList(((ArrayList)list0).size());
        int v1 = ((ArrayList)list0).size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)((ArrayList)list0).get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new k(((J)list1.get(v4)), 1, 1, 0));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = f.c(0, v, 7);
        return this.b(new q(o0, o0.getLayoutDirection()), arrayList0, v5).l();
    }

    @Override  // D0.N
    public final int e(o o0, List list0, int v) {
        ArrayList arrayList0 = new ArrayList(((ArrayList)list0).size());
        int v1 = ((ArrayList)list0).size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)((ArrayList)list0).get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new k(((J)list1.get(v4)), 2, 2, 0));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = f.c(v, 0, 13);
        return this.b(new q(o0, o0.getLayoutDirection()), arrayList0, v5).e();
    }
}

