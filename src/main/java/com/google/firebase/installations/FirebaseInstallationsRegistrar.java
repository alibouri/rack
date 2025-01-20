package com.google.firebase.installations;

import E7.w;
import Z6.g;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m7.a;
import m7.b;
import m7.c;
import m7.i;
import m7.o;
import m7.r;
import n7.j;
import v7.e;
import y7.d;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        a a0 = b.a(d.class);
        a0.a = "fire-installations";
        a0.a(i.b(g.class));
        a0.a(i.a(e.class));
        a0.a(new i(new r(f7.a.class, ExecutorService.class), 1, 0));
        a0.a(new i(new r(f7.b.class, Executor.class), 1, 0));
        a0.g = new o(23);
        b b0 = a0.b();
        v7.d d0 = new v7.d(0);
        a a1 = b.a(v7.d.class);
        a1.c = 1;
        a1.g = new w(23, d0);
        return Arrays.asList(new b[]{b0, a1.b(), a5.w.x("fire-installations", "18.0.0")});
    }

    private static d lambda$getComponents$0(c c0) {
        return new y7.c(((g)c0.a(g.class)), c0.l(e.class), ((ExecutorService)c0.k(new r(f7.a.class, ExecutorService.class))), new j(((Executor)c0.k(new r(f7.b.class, Executor.class)))));
    }
}

