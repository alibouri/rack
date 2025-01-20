package Bb;

import M.J;
import Nb.j;
import T0.G;
import a.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import yc.d;

public abstract class p extends v {
    public static Comparable A0(ArrayList arrayList0) {
        Iterator iterator0 = arrayList0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    public static Float B0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    public static Comparable C0(ArrayList arrayList0) {
        Iterator iterator0 = arrayList0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    public static ArrayList D0(Iterable iterable0, Serializable serializable0) {
        j.f(iterable0, "<this>");
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        boolean z = false;
        for(Object object0: iterable0) {
            boolean z1 = true;
            if(!z && j.a(object0, serializable0)) {
                z = true;
                z1 = false;
            }
            if(z1) {
                arrayList0.add(object0);
            }
        }
        return arrayList0;
    }

    public static List E0(Iterable iterable0, Iterable iterable1) {
        j.f(iterable0, "<this>");
        j.f(iterable1, "elements");
        Collection collection0 = v.g0(iterable1);
        if(collection0.isEmpty()) {
            return p.Q0(iterable0);
        }
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!collection0.contains(object0)) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public static ArrayList F0(Collection collection0, Iterable iterable0) {
        j.f(collection0, "<this>");
        j.f(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            ArrayList arrayList0 = new ArrayList(((Collection)iterable0).size() + collection0.size());
            arrayList0.addAll(collection0);
            arrayList0.addAll(((Collection)iterable0));
            return arrayList0;
        }
        ArrayList arrayList1 = new ArrayList(collection0);
        v.f0(arrayList1, iterable0);
        return arrayList1;
    }

    public static ArrayList G0(Collection collection0, Object object0) {
        j.f(collection0, "<this>");
        ArrayList arrayList0 = new ArrayList(collection0.size() + 1);
        arrayList0.addAll(collection0);
        arrayList0.add(object0);
        return arrayList0;
    }

    public static List H0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection && ((Collection)iterable0).size() <= 1) {
            return p.Q0(iterable0);
        }
        List list0 = p.S0(iterable0);
        Collections.reverse(list0);
        return list0;
    }

    public static Object I0(List list0) {
        j.f(list0, "<this>");
        switch(list0.size()) {
            case 0: {
                throw new NoSuchElementException("List is empty.");
            }
            case 1: {
                return list0.get(0);
            }
            default: {
                throw new IllegalArgumentException("List has more than one element.");
            }
        }
    }

    public static List J0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).size() <= 1) {
                return p.Q0(iterable0);
            }
            Object[] arr_object = ((Collection)iterable0).toArray(new Comparable[0]);
            j.f(((Comparable[])arr_object), "<this>");
            if(((Comparable[])arr_object).length > 1) {
                Arrays.sort(((Comparable[])arr_object));
            }
            return n.d0(arr_object);
        }
        List list0 = p.S0(iterable0);
        u.d0(list0);
        return list0;
    }

    public static List K0(Iterable iterable0, Comparator comparator0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).size() <= 1) {
                return p.Q0(iterable0);
            }
            Object[] arr_object = ((Collection)iterable0).toArray(new Object[0]);
            j.f(arr_object, "<this>");
            if(arr_object.length > 1) {
                Arrays.sort(arr_object, comparator0);
            }
            return n.d0(arr_object);
        }
        List list0 = p.S0(iterable0);
        u.e0(list0, comparator0);
        return list0;
    }

    public static int L0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v += ((Number)object0).intValue();
        }
        return v;
    }

    public static List M0(Iterable iterable0, int v) {
        j.f(iterable0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(J.d(v, "Requested element count ", " is less than zero.").toString());
        }
        if(v == 0) {
            return z.X;
        }
        if(iterable0 instanceof Collection) {
            if(v >= ((Collection)iterable0).size()) {
                return p.Q0(iterable0);
            }
            if(v == 1) {
                return q.K(p.o0(iterable0));
            }
        }
        ArrayList arrayList0 = new ArrayList(v);
        int v1 = 0;
        for(Object object0: iterable0) {
            arrayList0.add(object0);
            ++v1;
            if(v1 == v) {
                break;
            }
        }
        return q.O(arrayList0);
    }

    public static boolean[] N0(ArrayList arrayList0) {
        boolean[] arr_z = new boolean[arrayList0.size()];
        int v = 0;
        for(Object object0: arrayList0) {
            arr_z[v] = ((Boolean)object0).booleanValue();
            ++v;
        }
        return arr_z;
    }

    public static final void O0(Iterable iterable0, AbstractCollection abstractCollection0) {
        j.f(iterable0, "<this>");
        for(Object object0: iterable0) {
            abstractCollection0.add(object0);
        }
    }

    public static int[] P0(ArrayList arrayList0) {
        int[] arr_v = new int[arrayList0.size()];
        int v = 0;
        for(Object object0: arrayList0) {
            arr_v[v] = ((Number)object0).intValue();
            ++v;
        }
        return arr_v;
    }

    public static List Q0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return z.X;
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return q.K(((List)iterable0).get(0));
                    }
                    Object object0 = iterable0.iterator().next();
                    return q.K(object0);
                }
                default: {
                    return p.R0(((Collection)iterable0));
                }
            }
        }
        return q.O(p.S0(iterable0));
    }

    public static ArrayList R0(Collection collection0) {
        j.f(collection0, "<this>");
        return new ArrayList(collection0);
    }

    public static final List S0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            return p.R0(((Collection)iterable0));
        }
        List list0 = new ArrayList();
        p.O0(iterable0, ((AbstractCollection)list0));
        return list0;
    }

    public static final Set T0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            return new LinkedHashSet(((Collection)iterable0));
        }
        Set set0 = new LinkedHashSet();
        p.O0(iterable0, ((AbstractCollection)set0));
        return set0;
    }

    public static Set U0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        Set set0 = B.X;
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return set0;
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return d.C(((List)iterable0).get(0));
                    }
                    Object object0 = iterable0.iterator().next();
                    return d.C(object0);
                }
                default: {
                    set0 = new LinkedHashSet(F.I(((Collection)iterable0).size()));
                    p.O0(iterable0, ((AbstractCollection)set0));
                    return set0;
                }
            }
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        p.O0(iterable0, linkedHashSet0);
        switch(linkedHashSet0.size()) {
            case 0: {
                return set0;
            }
            case 1: {
                Object object1 = linkedHashSet0.iterator().next();
                return d.C(object1);
            }
            default: {
                return linkedHashSet0;
            }
        }
    }

    public static boolean k0(Iterable iterable0, Object object0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            return ((Collection)iterable0).contains(object0);
        }
        if(iterable0 instanceof List) {
            return ((List)iterable0).indexOf(object0) >= 0;
        }
        int v = 0;
        for(Object object1: iterable0) {
            if(v >= 0) {
                if(j.a(object0, object1)) {
                    return v >= 0;
                }
                ++v;
                continue;
            }
            q.Z();
            throw null;
        }
        return false;
    }

    public static List l0(Iterable iterable0, int v) {
        List list0;
        j.f(iterable0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(J.d(v, "Requested element count ", " is less than zero.").toString());
        }
        if(v == 0) {
            return p.Q0(iterable0);
        }
        if(iterable0 instanceof Collection) {
            int v1 = ((Collection)iterable0).size() - v;
            if(v1 <= 0) {
                return z.X;
            }
            if(v1 == 1) {
                if(iterable0 instanceof List) {
                    return q.K(p.w0(((List)iterable0)));
                }
                Iterator iterator0 = iterable0.iterator();
                if(!iterator0.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Object object0;
                for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
                }
                return q.K(object0);
            }
            list0 = new ArrayList(v1);
            if(iterable0 instanceof List) {
                if(iterable0 instanceof RandomAccess) {
                    int v2 = ((Collection)iterable0).size();
                    while(v < v2) {
                        ((ArrayList)list0).add(((List)iterable0).get(v));
                        ++v;
                    }
                    return list0;
                }
                ListIterator listIterator0 = ((List)iterable0).listIterator(v);
                while(listIterator0.hasNext()) {
                    Object object1 = listIterator0.next();
                    ((ArrayList)list0).add(object1);
                }
                return list0;
            }
        }
        else {
            list0 = new ArrayList();
        }
        int v3 = 0;
        for(Object object2: iterable0) {
            if(v3 >= v) {
                ((ArrayList)list0).add(object2);
            }
            else {
                ++v3;
            }
        }
        return q.O(list0);
    }

    public static List m0(int v, List list0) {
        if(v < 0) {
            throw new IllegalArgumentException(J.d(v, "Requested element count ", " is less than zero.").toString());
        }
        return p.M0(list0, (list0.size() - v >= 0 ? list0.size() - v : 0));
    }

    public static ArrayList n0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 != null) {
                arrayList0.add(object0);
            }
        }
        return arrayList0;
    }

    public static Object o0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return p.p0(((List)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return iterator0.next();
    }

    public static Object p0(List list0) {
        j.f(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.get(0);
    }

    public static Object q0(List list0) {
        j.f(list0, "<this>");
        return list0.isEmpty() ? null : list0.get(0);
    }

    public static Object r0(int v, List list0) {
        j.f(list0, "<this>");
        return v < 0 || v >= list0.size() ? null : list0.get(v);
    }

    public static Set s0(Iterable iterable0, Iterable iterable1) {
        j.f(iterable0, "<this>");
        j.f(iterable1, "other");
        Set set0 = p.T0(iterable0);
        set0.retainAll(v.g0(iterable1));
        return set0;
    }

    public static final void t0(Iterable iterable0, StringBuilder stringBuilder0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10) {
        j.f(iterable0, "<this>");
        j.f(charSequence0, "separator");
        j.f(charSequence1, "prefix");
        j.f(charSequence2, "postfix");
        j.f(charSequence3, "truncated");
        stringBuilder0.append(charSequence1);
        int v1 = 0;
        for(Object object0: iterable0) {
            ++v1;
            if(v1 > 1) {
                stringBuilder0.append(charSequence0);
            }
            if(v >= 0 && v1 > v) {
                break;
            }
            a.i(stringBuilder0, object0, function10);
        }
        if(v >= 0 && v1 > v) {
            stringBuilder0.append(charSequence3);
        }
        stringBuilder0.append(charSequence2);
    }

    public static void u0(List list0, StringBuilder stringBuilder0, G g0, int v) {
        if((v & 0x40) != 0) {
            g0 = null;
        }
        p.t0(list0, stringBuilder0, "\n", "", "", -1, "...", g0);
    }

    public static String v0(Iterable iterable0, String s, String s1, String s2, Function1 function10, int v) {
        if((v & 1) != 0) {
            s = ", ";
        }
        String s3 = (v & 2) == 0 ? s1 : "";
        String s4 = (v & 4) == 0 ? s2 : "";
        if((v & 0x20) != 0) {
            function10 = null;
        }
        j.f(iterable0, "<this>");
        j.f(s, "separator");
        j.f(s3, "prefix");
        j.f(s4, "postfix");
        StringBuilder stringBuilder0 = new StringBuilder();
        p.t0(iterable0, stringBuilder0, s, s3, s4, -1, "...", function10);
        String s5 = stringBuilder0.toString();
        j.e(s5, "toString(...)");
        return s5;
    }

    public static Object w0(List list0) {
        j.f(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.get(q.y(list0));
    }

    public static Object x0(List list0) {
        j.f(list0, "<this>");
        return list0.isEmpty() ? null : list0.get(list0.size() - 1);
    }

    public static Comparable y0(ArrayList arrayList0) {
        Iterator iterator0 = arrayList0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    public static Float z0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }
}

