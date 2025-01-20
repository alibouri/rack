package com.google.firebase.appcheck;

import E7.w;
import Z6.g;
import com.google.firebase.components.ComponentRegistrar;
import f7.a;
import f7.b;
import f7.c;
import f7.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m7.i;
import m7.r;
import v7.e;

public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r r0 = new r(d.class, Executor.class);
        r r1 = new r(c.class, Executor.class);
        r r2 = new r(a.class, Executor.class);
        r r3 = new r(b.class, ScheduledExecutorService.class);
        m7.a a0 = new m7.a(h7.c.class, new Class[]{j7.a.class});
        a0.a = "fire-app-check";
        a0.a(i.b(g.class));
        a0.a(new i(r0, 1, 0));
        a0.a(new i(r1, 1, 0));
        a0.a(new i(r2, 1, 0));
        a0.a(new i(r3, 1, 0));
        a0.a(i.a(e.class));
        a0.g = new g7.a(r0, r1, r2, r3);
        a0.c(1);
        m7.b b0 = a0.b();
        v7.d d0 = new v7.d(0);
        m7.a a1 = m7.b.a(v7.d.class);
        a1.c = 1;
        a1.g = new w(23, d0);
        return Arrays.asList(new m7.b[]{b0, a1.b(), a5.w.x("fire-app-check", "18.0.0")});
    }
}

