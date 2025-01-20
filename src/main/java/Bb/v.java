package Bb;

import Nb.j;
import Nb.z;
import Ob.a;
import Ob.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

public abstract class v extends u {
    public static void f0(Collection collection0, Iterable iterable0) {
        j.f(collection0, "<this>");
        j.f(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            collection0.addAll(((Collection)iterable0));
            return;
        }
        for(Object object0: iterable0) {
            collection0.add(object0);
        }
    }

    public static final Collection g0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(!(iterable0 instanceof Collection)) {
            iterable0 = p.Q0(iterable0);
        }
        return (Collection)iterable0;
    }

    public static final boolean h0(Iterable iterable0, Function1 function10, boolean z) {
        boolean z1 = false;
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Boolean)function10.n(object0)).booleanValue() == z) {
                iterator0.remove();
                z1 = true;
            }
        }
        return z1;
    }

    public static void i0(List list0, Function1 function10) {
        j.f(list0, "<this>");
        j.f(function10, "predicate");
        if(!(list0 instanceof RandomAccess)) {
            if(list0 instanceof a && !(list0 instanceof b)) {
                z.f(list0, "kotlin.collections.MutableIterable");
                throw null;
            }
            v.h0(list0, function10, true);
            return;
        }
        int v = q.y(list0);
        int v1 = 0;
        if(v >= 0) {
            int v2 = 0;
            while(true) {
                Object object0 = list0.get(v1);
                if(!((Boolean)function10.n(object0)).booleanValue()) {
                    if(v2 != v1) {
                        list0.set(v2, object0);
                    }
                    ++v2;
                }
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
            v1 = v2;
        }
        if(v1 < list0.size()) {
            int v3 = q.y(list0);
            if(v1 <= v3) {
                while(true) {
                    list0.remove(v3);
                    if(v3 == v1) {
                        break;
                    }
                    --v3;
                }
            }
        }
    }

    public static Object j0(ArrayList arrayList0) {
        j.f(arrayList0, "<this>");
        if(arrayList0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList0.remove(q.y(arrayList0));
    }
}

