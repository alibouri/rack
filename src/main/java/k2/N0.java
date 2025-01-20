package k2;

import Bb.p;
import Bb.q;
import Bb.r;
import Eb.a;
import Fb.c;
import Nb.j;
import Qa.Q;
import Qa.X;
import Vb.k;
import W5.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class n0 extends q0 {
    public final g0 a;
    public final List b;
    public final int c;
    public final int d;
    public final f0 e;
    public final f0 f;
    public static final n0 g;

    static {
        n0.g = H.a(q.K(T1.e), 0, 0, new f0(d0.c, d0.b, d0.b), null);
    }

    public n0(g0 g00, List list0, int v, int v1, f0 f00, f0 f01) {
        this.a = g00;
        this.b = list0;
        this.c = v;
        this.d = v1;
        this.e = f00;
        this.f = f01;
        if(g00 != g0.Z && v < 0) {
            throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + v).toString());
        }
        if(g00 != g0.Y && v1 < 0) {
            throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + v1).toString());
        }
        if(g00 == g0.X && list0.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    @Override  // k2.q0
    public final Object a(X x0, g g0) {
        int v5;
        T1 t12;
        List list6;
        Iterator iterator5;
        List list5;
        g0 g03;
        Collection collection5;
        n0 n02;
        Collection collection4;
        Iterator iterator4;
        T1 t11;
        Collection collection3;
        int v4;
        g0 g02;
        List list3;
        List list2;
        l0 l02;
        int v3;
        Function2 function21;
        Object object2;
        Function2 function20;
        Iterator iterator1;
        l0 l01;
        Collection collection0;
        g0 g00;
        n0 n00;
        l0 l00;
        if(g0 instanceof l0) {
            l00 = (l0)g0;
            int v = l00.q0;
            if((v & 0x80000000) == 0) {
                l00 = new l0(this, ((c)g0));
            }
            else {
                l00.q0 = v ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(this, ((c)g0));
        }
        Object object0 = l00.o0;
        Object object1 = a.X;
        switch(l00.q0) {
            case 0: {
                f.b0(object0);
                ArrayList arrayList0 = new ArrayList(r.b0(this.b));
                Iterator iterator0 = this.b.iterator();
                n00 = this;
                g00 = this.a;
                collection0 = arrayList0;
                l01 = l00;
                iterator1 = iterator0;
                function20 = x0;
                goto label_102;
            }
            case 1: {
                int v1 = l00.n0;
                int v2 = l00.m0;
                Collection collection1 = l00.l0;
                object2 = l00.k0;
                Iterator iterator2 = l00.j0;
                List list0 = l00.i0;
                List list1 = l00.h0;
                T1 t10 = l00.g0;
                Iterator iterator3 = l00.f0;
                Collection collection2 = l00.e0;
                g0 g01 = l00.d0;
                n0 n01 = l00.c0;
                function21 = l00.b0;
                f.b0(object0);
                v3 = v1;
                l02 = l00;
                iterator1 = iterator3;
                list2 = list1;
                list3 = list0;
                g02 = g01;
                v4 = v2;
                collection3 = collection2;
                t11 = t10;
                iterator4 = iterator2;
                collection4 = collection1;
                n02 = n01;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((Boolean)object0).booleanValue()) {
                list2.add(object2);
                List list4 = t11.d;
                if(list4 != null) {
                    v3 = ((Number)list4.get(v3)).intValue();
                }
                list3.add(new Integer(v3));
            }
            function20 = function21;
            collection5 = collection4;
            g03 = g02;
            list5 = list3;
            iterator5 = iterator4;
            list6 = list2;
            t12 = t11;
            v5 = v4;
        label_63:
            if(!iterator5.hasNext()) {
                break;
            }
            Object object3 = iterator5.next();
            v4 = v5 + 1;
            if(v5 >= 0) {
                l02.b0 = function20;
                l02.c0 = n02;
                l02.d0 = g03;
                l02.e0 = collection3;
                l02.f0 = iterator1;
                l02.g0 = t12;
                l02.h0 = list6;
                l02.i0 = list5;
                l02.j0 = iterator5;
                l02.k0 = object3;
                l02.l0 = collection5;
                l02.m0 = v4;
                l02.n0 = v5;
                l02.q0 = 1;
                Object object4 = function20.j(object3, l02);
                if(object4 == object1) {
                    return object1;
                }
                object0 = object4;
                v3 = v5;
                function21 = function20;
                collection4 = collection5;
                object2 = object3;
                t11 = t12;
                list2 = list6;
                iterator4 = iterator5;
                list3 = list5;
                g02 = g03;
                continue;
            }
            q.Z();
            throw null;
        }
        collection5.add(new T1(t12.a, list6, t12.c, list5));
        l01 = l02;
        collection0 = collection3;
        n00 = n02;
        g00 = g03;
    label_102:
        if(iterator1.hasNext()) {
            Object object5 = iterator1.next();
            ArrayList arrayList1 = new ArrayList();
            list5 = new ArrayList();
            iterator5 = ((T1)object5).b.iterator();
            t12 = (T1)object5;
            collection5 = collection0;
            l02 = l01;
            v5 = 0;
            list6 = arrayList1;
            g03 = g00;
            n02 = n00;
            collection3 = collection5;
            goto label_63;
        }
        return new n0(g00, ((List)collection0), n00.c, n00.d, n00.e, n00.f);
    }

    @Override  // k2.q0
    public final Object b(Q q0, g g0) {
        T1 t12;
        Collection collection7;
        Collection collection6;
        m0 m03;
        g0 g02;
        int[] arr_v1;
        T1 t11;
        n0 n02;
        Collection collection5;
        Iterator iterator4;
        m0 m02;
        Function2 function21;
        Collection collection4;
        Collection collection2;
        Collection collection1;
        Function2 function20;
        Iterator iterator1;
        m0 m01;
        Collection collection0;
        g0 g00;
        n0 n00;
        m0 m00;
        if(g0 instanceof m0) {
            m00 = (m0)g0;
            int v = m00.o0;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, ((c)g0));
            }
            else {
                m00.o0 = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, ((c)g0));
        }
        Object object0 = m00.m0;
        Object object1 = a.X;
        switch(m00.o0) {
            case 0: {
                f.b0(object0);
                ArrayList arrayList0 = new ArrayList(r.b0(this.b));
                Iterator iterator0 = this.b.iterator();
                n00 = this;
                g00 = this.a;
                collection0 = arrayList0;
                m01 = m00;
                iterator1 = iterator0;
                function20 = q0;
                goto label_79;
            }
            case 1: {
                collection1 = m00.l0;
                collection2 = m00.k0;
                Iterator iterator2 = m00.j0;
                Collection collection3 = m00.i0;
                int[] arr_v = m00.h0;
                T1 t10 = m00.g0;
                Iterator iterator3 = m00.f0;
                collection4 = m00.e0;
                g0 g01 = m00.d0;
                n0 n01 = m00.c0;
                function21 = m00.b0;
                f.b0(object0);
                m02 = m00;
                iterator1 = iterator3;
                iterator4 = iterator2;
                collection5 = collection3;
                n02 = n01;
                t11 = t10;
                arr_v1 = arr_v;
                g02 = g01;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            collection2.add(object0);
            m03 = m02;
            collection6 = collection4;
            collection7 = collection5;
            t12 = t11;
            function20 = function21;
        label_49:
            if(!iterator4.hasNext()) {
                break;
            }
            Object object2 = iterator4.next();
            m03.b0 = function20;
            m03.c0 = n02;
            m03.d0 = g02;
            m03.e0 = collection6;
            m03.f0 = iterator1;
            m03.g0 = t12;
            m03.h0 = arr_v1;
            m03.i0 = collection7;
            m03.j0 = iterator4;
            m03.k0 = collection7;
            m03.l0 = collection1;
            m03.o0 = 1;
            Object object3 = function20.j(object2, m03);
            if(object3 == object1) {
                return object1;
            }
            function21 = function20;
            object0 = object3;
            t11 = t12;
            collection5 = collection7;
            collection4 = collection6;
            m02 = m03;
            collection2 = collection5;
        }
        collection1.add(new T1(arr_v1, ((List)collection7), t12.c, t12.d));
        m01 = m03;
        collection0 = collection6;
        n00 = n02;
        g00 = g02;
    label_79:
        if(iterator1.hasNext()) {
            Object object4 = iterator1.next();
            arr_v1 = ((T1)object4).a;
            collection7 = new ArrayList(r.b0(((T1)object4).b));
            iterator4 = ((T1)object4).b.iterator();
            t12 = (T1)object4;
            g02 = g00;
            n02 = n00;
            collection6 = collection0;
            m03 = m01;
            collection1 = collection6;
            goto label_49;
        }
        return new n0(g00, ((List)collection0), n00.c, n00.d, n00.e, n00.f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n0)) {
            return false;
        }
        if(this.a != ((n0)object0).a) {
            return false;
        }
        if(!j.a(this.b, ((n0)object0).b)) {
            return false;
        }
        if(this.c != ((n0)object0).c) {
            return false;
        }
        if(this.d != ((n0)object0).d) {
            return false;
        }
        return j.a(this.e, ((n0)object0).e) ? j.a(this.f, ((n0)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.e.hashCode() + ((b.q(this.b, this.a.hashCode() * 0x1F, 0x1F) + this.c) * 0x1F + this.d) * 0x1F) * 0x1F;
        return this.f == null ? v : v + this.f.hashCode();
    }

    @Override
    public final String toString() {
        Object object2;
        List list0 = this.b;
        int v = 0;
        for(Object object0: list0) {
            v += ((T1)object0).b.size();
        }
        String s = "none";
        String s1 = this.c == -1 ? "none" : String.valueOf(this.c);
        int v1 = this.d;
        if(v1 != -1) {
            s = String.valueOf(v1);
        }
        StringBuilder stringBuilder0 = new StringBuilder("PageEvent.Insert for ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", with ");
        stringBuilder0.append(v);
        stringBuilder0.append(" items (\n                    |   first item: ");
        T1 t10 = (T1)p.q0(list0);
        Object object1 = null;
        if(t10 == null) {
            object2 = null;
        }
        else {
            List list1 = t10.b;
            object2 = list1 == null ? null : p.q0(list1);
        }
        stringBuilder0.append(object2);
        stringBuilder0.append("\n                    |   last item: ");
        T1 t11 = (T1)p.x0(list0);
        if(t11 != null) {
            List list2 = t11.b;
            if(list2 != null) {
                object1 = p.x0(list2);
            }
        }
        stringBuilder0.append(object1);
        stringBuilder0.append("\n                    |   placeholdersBefore: ");
        stringBuilder0.append(s1);
        stringBuilder0.append("\n                    |   placeholdersAfter: ");
        stringBuilder0.append(s);
        stringBuilder0.append("\n                    |   sourceLoadStates: ");
        stringBuilder0.append(this.e);
        stringBuilder0.append("\n                    ");
        String s2 = stringBuilder0.toString();
        f0 f00 = this.f;
        if(f00 != null) {
            s2 = s2 + "|   mediatorLoadStates: " + f00 + '\n';
        }
        return k.G((s2 + "|)"));
    }
}

