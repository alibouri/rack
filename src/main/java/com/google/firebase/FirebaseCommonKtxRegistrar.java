package com.google.firebase;

import Bb.q;
import Xb.A;
import Z6.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f7.c;
import f7.d;
import java.util.List;
import java.util.concurrent.Executor;
import m7.a;
import m7.b;
import m7.i;
import m7.r;

@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        a a0 = b.b(new r(f7.a.class, A.class));
        a0.a(new i(new r(f7.a.class, Executor.class), 1, 0));
        a0.g = h.Y;
        b b0 = a0.b();
        a a1 = b.b(new r(c.class, A.class));
        a1.a(new i(new r(c.class, Executor.class), 1, 0));
        a1.g = h.Z;
        b b1 = a1.b();
        a a2 = b.b(new r(f7.b.class, A.class));
        a2.a(new i(new r(f7.b.class, Executor.class), 1, 0));
        a2.g = h.b0;
        b b2 = a2.b();
        a a3 = b.b(new r(d.class, A.class));
        a3.a(new i(new r(d.class, Executor.class), 1, 0));
        a3.g = h.c0;
        return q.L(new b[]{b0, b1, b2, a3.b()});
    }
}

