package com.google.firebase.appcheck.playintegrity;

import Z6.g;
import a5.w;
import com.google.firebase.components.ComponentRegistrar;
import f7.b;
import f7.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import m7.a;
import m7.i;
import m7.r;

public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r r0 = new r(c.class, Executor.class);
        r r1 = new r(b.class, Executor.class);
        a a0 = m7.b.a(l7.c.class);
        a0.a = "fire-app-check-play-integrity";
        a0.a(i.b(g.class));
        a0.a(new i(r0, 1, 0));
        a0.a(new i(r1, 1, 0));
        a0.g = new E7.g(r0, 20, r1);
        return Arrays.asList(new m7.b[]{a0.b(), w.x("fire-app-check-play-integrity", "18.0.0")});
    }
}

