package com.google.firebase.concurrent;

import E7.p;
import Q4.i;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import f7.a;
import f7.c;
import f7.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import m7.b;
import m7.m;
import m7.o;
import m7.r;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;

    static {
        ExecutorsRegistrar.a = new m(new p(7));
        ExecutorsRegistrar.b = new m(new p(8));
        ExecutorsRegistrar.c = new m(new p(9));
        ExecutorsRegistrar.d = new m(new p(10));
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Class class0 = ScheduledExecutorService.class;
        r r0 = new r(a.class, class0);
        Class class1 = ExecutorService.class;
        r r1 = new r(a.class, class1);
        Class class2 = Executor.class;
        r[] arr_r = {r1, new r(a.class, class2)};
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet0.add(r0);
        for(int v = 0; v < 2; ++v) {
            i.o(arr_r[v], "Null interface");
        }
        Collections.addAll(hashSet0, arr_r);
        o o0 = new o(1);
        b b0 = new b(null, new HashSet(hashSet0), new HashSet(hashSet1), 0, 0, o0, hashSet2);
        r r2 = new r(f7.b.class, class0);
        r[] arr_r1 = {new r(f7.b.class, class1), new r(f7.b.class, class2)};
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet3.add(r2);
        for(int v1 = 0; v1 < 2; ++v1) {
            i.o(arr_r1[v1], "Null interface");
        }
        Collections.addAll(hashSet3, arr_r1);
        o o1 = new o(2);
        b b1 = new b(null, new HashSet(hashSet3), new HashSet(hashSet4), 0, 0, o1, hashSet5);
        r r3 = new r(c.class, class0);
        r[] arr_r2 = {new r(c.class, class1), new r(c.class, class2)};
        HashSet hashSet6 = new HashSet();
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        hashSet6.add(r3);
        for(int v2 = 0; v2 < 2; ++v2) {
            i.o(arr_r2[v2], "Null interface");
        }
        Collections.addAll(hashSet6, arr_r2);
        o o2 = new o(3);
        b b2 = new b(null, new HashSet(hashSet6), new HashSet(hashSet7), 0, 0, o2, hashSet8);
        m7.a a0 = b.b(new r(d.class, class2));
        a0.g = new o(4);
        return Arrays.asList(new b[]{b0, b1, b2, a0.b()});
    }
}

