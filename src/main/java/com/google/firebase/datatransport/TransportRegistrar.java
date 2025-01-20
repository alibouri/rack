package com.google.firebase.datatransport;

import a5.w;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m7.a;
import m7.b;
import m7.c;
import m7.i;
import m7.o;
import m7.r;
import o5.f;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        a a0 = b.a(f.class);
        a0.a = "fire-transport";
        a0.a(i.b(Context.class));
        a0.g = new o(8);
        b b0 = a0.b();
        a a1 = b.b(new r(o7.a.class, f.class));
        a1.a(i.b(Context.class));
        a1.g = new o(9);
        b b1 = a1.b();
        a a2 = b.b(new r(o7.b.class, f.class));
        a2.a(i.b(Context.class));
        a2.g = new o(10);
        return Arrays.asList(new b[]{b0, b1, a2.b(), w.x("fire-transport", "18.2.0")});
    }

    private static f lambda$getComponents$0(c c0) {
        r5.o.b(((Context)c0.a(Context.class)));
        return r5.o.a().c(p5.a.f);
    }

    private static f lambda$getComponents$1(c c0) {
        r5.o.b(((Context)c0.a(Context.class)));
        return r5.o.a().c(p5.a.f);
    }

    private static f lambda$getComponents$2(c c0) {
        r5.o.b(((Context)c0.a(Context.class)));
        return r5.o.a().c(p5.a.e);
    }
}

