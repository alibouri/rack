package h8;

import e8.g;
import e8.k;
import e8.s;
import e8.t;
import g8.d;
import g8.f;
import g8.m;
import g8.n;
import io.sentry.internal.debugmeta.c;
import j8.b;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k8.a;
import v1.r;

public final class i implements t {
    public final c X;
    public final g Y;
    public final f Z;
    public final h8.c b0;
    public final b c0;

    public i(c c0, f f0, h8.c c1) {
        this.c0 = b.a;
        this.X = c0;
        this.Y = g.X;
        this.Z = f0;
        this.b0 = c1;
    }

    public final boolean a(Field field0, boolean z) {
        Class class0 = field0.getType();
        f f0 = this.Z;
        f0.getClass();
        Class class1 = Enum.class;
        if(class1.isAssignableFrom(class0) || !class0.isAnonymousClass() && !class0.isLocalClass()) {
            f0.c(z);
            if((field0.getModifiers() & 0x88) == 0 && !field0.isSynthetic()) {
                Class class2 = field0.getType();
                if(class1.isAssignableFrom(class2) || !class2.isAnonymousClass() && !class2.isLocalClass()) {
                    List list0 = z ? f0.X : f0.Y;
                    if(!list0.isEmpty()) {
                        Iterator iterator0 = list0.iterator();
                        if(iterator0.hasNext()) {
                            throw r.e(iterator0);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // e8.t
    public final s b(k k0, a a0) {
        m m1;
        c c1;
        s s1;
        LinkedHashMap linkedHashMap1;
        Class class3;
        a a3;
        Field[] arr_field1;
        int v3;
        int v2;
        s s3;
        List list0;
        Type type0;
        i i0 = this;
        k k1 = k0;
        a a1 = a0;
        Class class0 = Object.class;
        Class class1 = a1.a;
        if(!class0.isAssignableFrom(class1)) {
            return null;
        }
        c c0 = i0.X;
        m m0 = c0.e(a1);
        s s0 = null;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        if(!class1.isInterface()) {
            Class class2 = class1;
            a a2 = a1;
            while(class2 != class0) {
                Field[] arr_field = class2.getDeclaredFields();
                int v = arr_field.length;
                int v1 = 0;
                while(true) {
                    type0 = a2.b;
                    if(v1 >= v) {
                        break;
                    }
                    Field field0 = arr_field[v1];
                    boolean z = i0.a(field0, true);
                    boolean z1 = i0.a(field0, false);
                    if(z || z1) {
                        i0.c0.a(field0);
                        Type type1 = d.i(type0, class2, field0.getGenericType(), new HashSet());
                        f8.b b0 = (f8.b)field0.getAnnotation(f8.b.class);
                        if(b0 == null) {
                            v2 = v1;
                            v3 = v;
                            list0 = Collections.singletonList(i0.Y.b(field0));
                        }
                        else {
                            String s2 = b0.value();
                            String[] arr_s = b0.alternate();
                            v2 = v1;
                            if(arr_s.length == 0) {
                                v3 = v;
                                list0 = Collections.singletonList(s2);
                            }
                            else {
                                v3 = v;
                                ArrayList arrayList0 = new ArrayList(arr_s.length + 1);
                                arrayList0.add(s2);
                                int v4 = arr_s.length;
                                int v5 = 0;
                                while(v5 < v4) {
                                    arrayList0.add(arr_s[v5]);
                                    ++v5;
                                    v4 = v4;
                                }
                                list0 = arrayList0;
                            }
                        }
                        int v6 = list0.size();
                        h8.g g0 = null;
                        int v7 = 0;
                        while(v7 < v6) {
                            Object object0 = list0.get(v7);
                            if(v7 != 0) {
                                z = false;
                            }
                            a a4 = new a(type1);
                            boolean z2 = n.a.containsKey(a4.a);
                            f8.a a5 = (f8.a)field0.getAnnotation(f8.a.class);
                            if(a5 == null) {
                                s3 = null;
                            }
                            else {
                                i0.b0.getClass();
                                s3 = h8.c.a(c0, k1, a4, a5);
                            }
                            boolean z3 = s3 != null;
                            if(s3 == null) {
                                s3 = k1.c(a4);
                            }
                            h8.g g1 = g0;
                            g0 = (h8.g)linkedHashMap0.put(((String)object0), new h8.g(((String)object0), z, z1, field0, z3, s3, k0, a4, z2));
                            if(g1 != null) {
                                g0 = g1;
                            }
                            ++v7;
                            i0 = this;
                            k1 = k0;
                            linkedHashMap0 = linkedHashMap0;
                            s0 = s0;
                            m0 = m0;
                            c0 = c0;
                            v6 = v6;
                            class2 = class2;
                            type1 = type1;
                            list0 = list0;
                            arr_field = arr_field;
                            a2 = a2;
                            field0 = field0;
                        }
                        arr_field1 = arr_field;
                        a3 = a2;
                        class3 = class2;
                        linkedHashMap1 = linkedHashMap0;
                        s1 = s0;
                        c1 = c0;
                        m1 = m0;
                        if(g0 != null) {
                            throw new IllegalArgumentException(a0.b + " declares multiple JSON fields named " + g0.a);
                        }
                    }
                    else {
                        v2 = v1;
                        v3 = v;
                        arr_field1 = arr_field;
                        a3 = a2;
                        class3 = class2;
                        linkedHashMap1 = linkedHashMap0;
                        s1 = s0;
                        c1 = c0;
                        m1 = m0;
                    }
                    v1 = v2 + 1;
                    i0 = this;
                    k1 = k0;
                    a1 = a0;
                    linkedHashMap0 = linkedHashMap1;
                    s0 = s1;
                    m0 = m1;
                    class0 = class0;
                    v = v3;
                    c0 = c1;
                    class2 = class3;
                    arr_field = arr_field1;
                    a2 = a3;
                }
                a2 = new a(d.i(type0, class2, class2.getGenericSuperclass(), new HashSet()));
                class2 = a2.a;
                i0 = this;
                k1 = k0;
                a1 = a1;
                linkedHashMap0 = linkedHashMap0;
                s0 = s0;
                m0 = m0;
                class0 = class0;
                c0 = c0;
            }
        }
        super(m0, linkedHashMap0);
        return s0;
    }
}

