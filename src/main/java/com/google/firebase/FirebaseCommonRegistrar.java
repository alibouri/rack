package com.google.firebase;

import E7.v;
import Z6.g;
import a5.w;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m7.a;
import m7.b;
import m7.i;
import m7.r;
import v7.c;
import v7.d;
import v7.e;
import v7.f;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String s) {
        return s.replace(' ', '_').replace('/', '_');
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String s;
        List list0 = new ArrayList();
        a a0 = b.a(U7.b.class);
        a0.a(new i(2, 0, U7.a.class));
        a0.g = new T9.b(2);
        ((ArrayList)list0).add(a0.b());
        r r0 = new r(f7.a.class, Executor.class);
        a a1 = new a(c.class, new Class[]{e.class, f.class});
        a1.a(i.b(Context.class));
        a1.a(i.b(g.class));
        a1.a(new i(2, 0, d.class));
        a1.a(new i(1, 1, U7.b.class));
        a1.a(new i(r0, 1, 0));
        a1.g = new v(r0, 3);
        ((ArrayList)list0).add(a1.b());
        ((ArrayList)list0).add(w.x("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        ((ArrayList)list0).add(w.x("fire-core", "21.0.0"));
        ((ArrayList)list0).add(w.x("device-name", FirebaseCommonRegistrar.a(Build.PRODUCT)));
        ((ArrayList)list0).add(w.x("device-model", FirebaseCommonRegistrar.a(Build.DEVICE)));
        ((ArrayList)list0).add(w.x("device-brand", FirebaseCommonRegistrar.a(Build.BRAND)));
        ((ArrayList)list0).add(w.A("android-target-sdk", new T9.b(5)));
        ((ArrayList)list0).add(w.A("android-min-sdk", new T9.b(6)));
        ((ArrayList)list0).add(w.A("android-platform", new T9.b(7)));
        ((ArrayList)list0).add(w.A("android-installer", new T9.b(8)));
        try {
            s = null;
            Ab.g.Y.getClass();
            s = "2.0.21";
        }
        catch(NoClassDefFoundError unused_ex) {
        }
        if(s != null) {
            ((ArrayList)list0).add(w.x("kotlin", s));
        }
        return list0;
    }
}

