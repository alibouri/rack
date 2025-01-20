package com.google.firebase.perf;

import E7.l;
import E7.v;
import H6.e;
import R2.h;
import V7.j;
import Z6.g;
import a5.w;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import f7.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import m7.a;
import m7.b;
import m7.c;
import m7.i;
import m7.r;
import o.N0;
import o5.f;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    @Override  // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List getComponents() {
        r r0 = new r(d.class, Executor.class);
        a a0 = b.a(G7.b.class);
        a0.a = "fire-perf";
        a0.a(i.b(g.class));
        a0.a(new i(1, 1, j.class));
        a0.a(i.b(y7.d.class));
        a0.a(new i(1, 1, f.class));
        a0.a(i.b(G7.a.class));
        a0.g = new l(4);
        b b0 = a0.b();
        a a1 = b.a(G7.a.class);
        a1.a = "fire-perf-early";
        a1.a(i.b(g.class));
        a1.a(i.a(Z6.a.class));
        a1.a(new i(r0, 1, 0));
        a1.c(2);
        a1.g = new v(r0, 1);
        return Arrays.asList(new b[]{b0, a1.b(), w.x("fire-perf", "21.0.2")});
    }

    private static G7.a lambda$getComponents$0(r r0, c c0) {
        g g0 = (g)c0.a(g.class);
        Z6.a a0 = (Z6.a)c0.l(Z6.a.class).get();
        Executor executor0 = (Executor)c0.k(r0);
        G7.a a1 = new G7.a();  // initializer: Ljava/lang/Object;-><init>()V
        g0.a();
        Context context0 = g0.a;
        I7.a a2 = I7.a.e();
        a2.getClass();
        I7.a.d.b = android.support.v4.media.session.a.G(context0);
        a2.c.c(context0);
        H7.c c1 = H7.c.a();
        synchronized(c1) {
            if(!c1.n0) {
                Context context1 = context0.getApplicationContext();
                if(context1 instanceof Application) {
                    ((Application)context1).registerActivityLifecycleCallbacks(c1);
                    c1.n0 = true;
                }
            }
        }
        c1.c(new G7.c());  // initializer: Ljava/lang/Object;-><init>()V
        if(a0 != null) {
            AppStartTrace appStartTrace0 = AppStartTrace.c();
            appStartTrace0.i(context0);
            executor0.execute(new E5.d(10, appStartTrace0));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return a1;
    }

    private static G7.b providesFirebasePerformance(c c0) {
        c0.a(G7.a.class);
        g g0 = (g)c0.a(g.class);
        y7.d d0 = (y7.d)c0.a(y7.d.class);
        x7.a a0 = c0.l(j.class);
        x7.a a1 = c0.l(f.class);
        h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h0.a = g0;
        h0.b = d0;
        h0.c = a0;
        h0.d = a1;
        N0 n00 = new N0(new U7.c(9, h0), new B3.d(6, h0), new B3.c(9, h0), new I5.h(9, h0), new L7.b(h0), new e(5, h0), new io.sentry.hints.i(h0), 1);
        wb.a a2 = new wb.a();  // initializer: Ljava/lang/Object;-><init>()V
        a2.Y = wb.a.Z;
        a2.X = n00;
        return (G7.b)a2.get();
    }
}

