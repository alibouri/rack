package com.google.firebase.messaging;

import E7.v;
import Z6.g;
import a5.w;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m7.a;
import m7.i;
import m7.r;
import o5.f;
import o7.b;
import u7.c;
import y7.d;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Override  // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List getComponents() {
        r r0 = new r(b.class, f.class);
        a a0 = m7.b.a(FirebaseMessaging.class);
        a0.a = "fire-fcm";
        a0.a(i.b(g.class));
        a0.a(new i(0, 0, w7.a.class));
        a0.a(i.a(U7.b.class));
        a0.a(i.a(v7.f.class));
        a0.a(i.b(d.class));
        a0.a(new i(r0, 0, 1));
        a0.a(i.b(c.class));
        a0.g = new v(r0, 0);
        a0.c(1);
        return Arrays.asList(new m7.b[]{a0.b(), w.x("fire-fcm", "24.1.0")});
    }

    private static FirebaseMessaging lambda$getComponents$0(r r0, m7.c c0) {
        Object object0 = c0.a(g.class);
        if(c0.a(w7.a.class) != null) {
            throw new ClassCastException();
        }
        return new FirebaseMessaging(((g)object0), c0.l(U7.b.class), c0.l(v7.f.class), ((d)c0.a(d.class)), c0.d(r0), ((c)c0.a(c.class)));
    }
}

