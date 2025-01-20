package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class O {
    public static final d2 a;

    static {
        O.a = new d2(6);
    }

    public static e a(e e0, h h0, p p0, Boolean boolean0, Boolean boolean1) {
        e e1 = new e();
        Iterator iterator0 = e0.z();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            int v = (int)(((Integer)object0));
            if(e0.y(v)) {
                o o0 = p0.b(h0, Arrays.asList(new o[]{e0.s(v), new com.google.android.gms.internal.measurement.h(((double)v)), e0}));
                if(o0.a().equals(boolean0)) {
                    return e1;
                }
                if(boolean1 == null || o0.a().equals(boolean1)) {
                    e1.x(v, o0);
                }
            }
        }
        return e1;
    }

    public static o b(e e0, h h0, ArrayList arrayList0, boolean z) {
        o o3;
        x1.o("reduce", 1, arrayList0);
        x1.q(2, "reduce", arrayList0);
        o o0 = (o)arrayList0.get(0);
        o o1 = ((R2.e)h0.b).n(h0, o0);
        if(!(o1 instanceof k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if(arrayList0.size() == 2) {
            o o2 = (o)arrayList0.get(1);
            o3 = ((R2.e)h0.b).n(h0, o2);
            if(o3 instanceof i) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        }
        else {
            if(e0.u() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            o3 = null;
        }
        int v = e0.u();
        int v1 = z ? 0 : v - 1;
        if(o3 == null) {
            o3 = e0.s(v1);
            v1 += (z ? 1 : -1);
        }
        while(((z ? v - 1 : 0) - v1) * (z ? 1 : -1) >= 0) {
            if(e0.y(v1)) {
                o3 = ((k)o1).b(h0, Arrays.asList(new o[]{o3, e0.s(v1), new com.google.android.gms.internal.measurement.h(((double)v1)), e0}));
                if(o3 instanceof i) {
                    throw new IllegalStateException("Reduce operation failed");
                }
            }
            v1 += (z ? 1 : -1);
        }
        return o3;
    }

    public static s2 c(Object object0, Object object1) {
        s2 s20 = (s2)object0;
        if(!((s2)object1).isEmpty()) {
            if(!s20.X) {
                if(s20.isEmpty()) {
                    s20 = new s2();
                }
                else {
                    s2 s21 = new s2(s20);  // initializer: Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
                    s21.X = true;
                    s20 = s21;
                }
            }
            s20.c();
            if(!((s2)object1).isEmpty()) {
                s20.putAll(((s2)object1));
            }
        }
        return s20;
    }

    public static void d(Object object0) {
        if(object0 != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public static void e(Object object0, Object object1) {
        if(object1 != null) {
            throw new ClassCastException();
        }
        if(((s2)object0).isEmpty()) {
            return;
        }
        Iterator iterator0 = ((s2)object0).entrySet().iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        Object object2 = iterator0.next();
        ((Map.Entry)object2).getKey();
        ((Map.Entry)object2).getValue();
        throw new NoSuchMethodError();
    }

    public static s2 f() {
        s2 s20 = s2.Y;
        if(s20.isEmpty()) {
            return new s2();
        }
        s2 s21 = new s2(s20);  // initializer: Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
        s21.X = true;
        return s21;
    }

    public static void g(Object object0) {
        ((s2)object0).X = false;
    }

    public static s2 h(Object object0) {
        return (s2)object0;
    }

    public static boolean i(Object object0) {
        return !((s2)object0).X;
    }
}

