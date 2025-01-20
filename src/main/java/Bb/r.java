package Bb;

import Nb.j;
import java.util.ArrayList;
import java.util.Collection;

public abstract class r extends q {
    public static int b0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).size() : 10;
    }

    public static ArrayList c0(Iterable iterable0) {
        j.f(iterable0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            v.f0(arrayList0, ((Iterable)object0));
        }
        return arrayList0;
    }
}

