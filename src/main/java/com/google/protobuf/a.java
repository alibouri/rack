package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class A extends C {
    public static final Class c;

    static {
        A.c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    @Override  // com.google.protobuf.C
    public final void a(long v, Object object0) {
        List list1;
        List list0 = (List)n0.c.i(v, object0);
        if(list0 instanceof z) {
            list1 = ((z)list0).h();
        }
        else {
            Class class0 = list0.getClass();
            if(A.c.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof T && list0 instanceof t) {
                if(((b)(((t)list0))).X) {
                    ((b)(((t)list0))).X = false;
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        n0.o(v, object0, list1);
    }

    @Override  // com.google.protobuf.C
    public final void b(long v, Object object0, Object object1) {
        ArrayList arrayList0;
        List list0 = (List)n0.c.i(v, object1);
        int v1 = list0.size();
        List list1 = (List)n0.c.i(v, object0);
        if(list1.isEmpty()) {
            if(list1 instanceof z) {
                list1 = new y(v1);
            }
            else if(!(list1 instanceof T) || !(list1 instanceof t)) {
                list1 = new ArrayList(v1);
            }
            else {
                list1 = ((t)list1).f(v1);
            }
            n0.o(v, object0, list1);
        }
        else {
            Class class0 = list1.getClass();
            if(A.c.isAssignableFrom(class0)) {
                arrayList0 = new ArrayList(list1.size() + v1);
                arrayList0.addAll(list1);
                n0.o(v, object0, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof i0) {
                arrayList0 = new y(list1.size() + v1);
                ((y)arrayList0).addAll(((i0)list1));
                n0.o(v, object0, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof T && list1 instanceof t && !((b)(((t)list1))).X) {
                list1 = ((t)list1).f(list1.size() + v1);
                n0.o(v, object0, list1);
            }
        }
        int v2 = list1.size();
        if(v2 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v2 > 0) {
            list0 = list1;
        }
        n0.o(v, object0, list0);
    }
}

