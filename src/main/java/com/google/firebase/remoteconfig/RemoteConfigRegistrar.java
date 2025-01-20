package com.google.firebase.remoteconfig;

import E7.v;
import V7.j;
import Z6.g;
import a5.w;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f7.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m7.a;
import m7.c;
import m7.i;
import m7.r;
import y7.d;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        r r0 = new r(b.class, ScheduledExecutorService.class);
        a a0 = new a(j.class, new Class[]{Y7.a.class});
        a0.a = "fire-rc";
        a0.a(i.b(Context.class));
        a0.a(new i(r0, 1, 0));
        a0.a(i.b(g.class));
        a0.a(i.b(d.class));
        a0.a(i.b(b7.a.class));
        a0.a(i.a(d7.b.class));
        a0.g = new v(r0, 2);
        a0.c(2);
        return Arrays.asList(new m7.b[]{a0.b(), w.x("fire-rc", "22.0.1")});
    }

    private static j lambda$getComponents$0(r r0, c c0) {
        a7.c c2;
        Object object0 = c0.a(Context.class);
        Object object1 = c0.k(r0);
        Object object2 = c0.a(g.class);
        Object object3 = c0.a(d.class);
        b7.a a0 = (b7.a)c0.a(b7.a.class);
        synchronized(a0) {
            if(!a0.a.containsKey("frc")) {
                a7.c c1 = new a7.c(a0.b);
                a0.a.put("frc", c1);
            }
            c2 = (a7.c)a0.a.get("frc");
        }
        return new j(((Context)object0), ((ScheduledExecutorService)object1), ((g)object2), ((d)object3), c2, c0.l(d7.b.class));
    }
}

