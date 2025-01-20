package com.google.firebase.messaging;

import E.f0;
import E7.E;
import E7.F;
import E7.G;
import E7.J;
import E7.m;
import E7.o;
import E7.p;
import E7.q;
import E7.r;
import E7.s;
import E7.t;
import E7.u;
import J2.w;
import J5.f;
import J5.j;
import Z6.g;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import b4.A0;
import d7.b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o6.h;
import o6.i;
import o6.k;
import s.e;
import u7.c;
import x7.a;
import y7.d;

public class FirebaseMessaging {
    public final g a;
    public final Context b;
    public final A0 c;
    public final m d;
    public final u e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final f0 h;
    public boolean i;
    public static final long j;
    public static F k;
    public static a l;
    public static ScheduledThreadPoolExecutor m;

    static {
        FirebaseMessaging.j = TimeUnit.HOURS.toSeconds(8L);
        FirebaseMessaging.l = new p(0);
    }

    public FirebaseMessaging(g g0, a a0, a a1, d d0, a a2, c c0) {
        g0.a();
        Context context0 = g0.a;
        f0 f00 = new f0(context0);
        A0 a00 = new A0(g0, f00, a0, a1, d0);
        ExecutorService executorService0 = Executors.newSingleThreadExecutor(new T5.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1, new T5.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new T5.a("Firebase-Messaging-File-Io"));
        super();
        this.i = false;
        FirebaseMessaging.l = a2;
        this.a = g0;
        u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        u0.d = this;
        u0.b = c0;
        this.e = u0;
        g0.a();
        Context context1 = g0.a;
        this.b = context1;
        o o0 = new o();
        this.h = f00;
        this.c = a00;
        this.d = new m(executorService0);
        this.f = scheduledThreadPoolExecutor0;
        this.g = threadPoolExecutor0;
        g0.a();
        if(context0 instanceof Application) {
            ((Application)context0).registerActivityLifecycleCallbacks(o0);
        }
        else {
            Log.w("FirebaseMessaging", "Context " + context0 + " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor0.execute(new q(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor1 = new ScheduledThreadPoolExecutor(1, new T5.a("Firebase-Messaging-Topics-Io"));
        k.c(scheduledThreadPoolExecutor1, new J(context1, scheduledThreadPoolExecutor1, this, f00, a00)).c(scheduledThreadPoolExecutor0, new r(this, 0));
        scheduledThreadPoolExecutor0.execute(new q(this, 1));
    }

    public final String a() {
        h h0;
        E e0 = this.g();
        if(!this.l(e0)) {
            return e0.a;
        }
        String s = f0.d(this.a);
        m m0 = this.d;
        synchronized(m0) {
            h0 = (h)((e)m0.b).get(s);
            if(h0 == null) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + s);
                }
                String s1 = f0.d(((g)this.c.b));
                Bundle bundle0 = new Bundle();
                o6.p p0 = this.c.b0(s1, "*", bundle0);
                o6.p p1 = this.c.x(p0);
                s s2 = new s(this, s, e0, 0);
                o6.p p2 = p1.m(this.g, s2);
                E7.g g0 = new E7.g(m0, 1, s);
                h0 = p2.d(((ExecutorService)m0.a), g0);
                ((e)m0.b).put(s, h0);
            }
            else if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + s);
            }
        }
        try {
            return (String)k.a(h0);
        }
        catch(ExecutionException | InterruptedException executionException0) {
            throw new IOException(executionException0);
        }
    }

    public static void b(long v, Runnable runnable0) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.m == null) {
                FirebaseMessaging.m = new ScheduledThreadPoolExecutor(1, new T5.a("TAG"));
            }
            FirebaseMessaging.m.schedule(runnable0, v, TimeUnit.SECONDS);
        }
    }

    public static FirebaseMessaging c() {
        synchronized(FirebaseMessaging.class) {
            return FirebaseMessaging.getInstance(g.c());
        }
    }

    public static F d(Context context0) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.k == null) {
                FirebaseMessaging.k = new F(context0);
            }
            return FirebaseMessaging.k;
        }
    }

    public final String e() {
        this.a.a();
        return "[DEFAULT]".equals(this.a.b) ? "" : this.a.d();
    }

    public final o6.p f() {
        i i0 = new i();
        t t0 = new t(this, i0, 1);
        this.f.execute(t0);
        return i0.a;
    }

    public final E g() {
        F f0 = FirebaseMessaging.d(this.b);
        String s = this.e();
        String s1 = f0.d(this.a);
        synchronized(f0) {
        }
        return E.b(f0.a.getString(F.a(s, s1), null));
    }

    @Keep
    public static FirebaseMessaging getInstance(g g0) {
        synchronized(FirebaseMessaging.class) {
            FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)g0.b(FirebaseMessaging.class);
            N5.r.k(firebaseMessaging0, "Firebase Messaging component is not present");
            return firebaseMessaging0;
        }
    }

    public final void h() {
        int v;
        o6.p p0;
        J5.a a0 = (J5.a)this.c.d;
        if(a0.c.e() >= 241100000) {
            J5.k k0 = J5.k.f(a0.b);
            synchronized(k0) {
                v = k0.b;
                k0.b = v + 1;
            }
            p0 = k0.g(new j(v, 5, Bundle.EMPTY, 1)).l(f.Z, J5.c.Z);
        }
        else {
            p0 = k.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        r r0 = new r(this, 1);
        p0.c(this.f, r0);
    }

    public final void i(boolean z) {
        synchronized(this) {
            this.i = z;
        }
    }

    public final boolean j() {
        Context context0 = this.b;
        w.K(context0);
        if(Build.VERSION.SDK_INT >= 29) {
            if(Binder.getCallingUid() != context0.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package com.wave.personal");
                return false;
            }
            if("com.google.android.gms".equals(((NotificationManager)context0.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                return this.a.b(b.class) == null ? I2.J.x() && FirebaseMessaging.l != null : true;
            }
        }
        else if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn\'t support proxying.");
            return false;
        }
        return false;
    }

    public final void k(long v) {
        synchronized(this) {
            FirebaseMessaging.b(v, new G(this, Math.min(Math.max(30L, 2L * v), FirebaseMessaging.j)));
            this.i = true;
        }
    }

    public final boolean l(E e0) {
        if(e0 != null) {
            String s = this.h.b();
            return System.currentTimeMillis() > e0.c + E.d || !s.equals(e0.b);
        }
        return true;
    }
}

