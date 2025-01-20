package h7;

import E7.n;
import L7.b;
import M5.q;
import N5.r;
import Z6.g;
import android.app.Application;
import io.sentry.hints.i;
import j7.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m7.m;

public final class c implements a {
    public final g a;
    public final x7.a b;
    public final e c;
    public final b d;
    public final Executor e;
    public final Executor f;
    public final Executor g;
    public l7.c h;

    public c(g g0, x7.a a0, Executor executor0, Executor executor1, Executor executor2, ScheduledExecutorService scheduledExecutorService0) {
        r.j(g0);
        r.j(a0);
        this.a = g0;
        this.b = a0;
        new ArrayList();
        new ArrayList();
        g0.a();
        String s = g0.d();
        e e0 = new e();  // initializer: Ljava/lang/Object;-><init>()V
        r.j(g0.a);
        r.f(s);
        e0.a = new m(new d(0, g0.a, "com.google.firebase.appcheck.store." + s));
        this.c = e0;
        g0.a();
        g3.b b0 = new g3.b(this, executor1, scheduledExecutorService0);
        i i0 = new i(23);
        b b1 = new b(23);
        M5.d.b(((Application)g0.a.getApplicationContext()));
        q q0 = new q(b1, b0, i0);
        M5.d.c0.a(q0);
        this.d = b1;
        this.e = executor0;
        this.f = executor1;
        this.g = executor2;
        executor2.execute(new n(this, 25, new o6.i()));
    }
}

