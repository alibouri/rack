package V7;

import E7.p;
import K.v;
import R2.w;
import W7.h;
import W7.n;
import Y7.a;
import Z6.g;
import a7.c;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.measurement.E1;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o6.k;
import y7.d;

public final class j implements a {
    public final HashMap a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final g d;
    public final d e;
    public final c f;
    public final x7.a g;
    public final String h;
    public final HashMap i;
    public static final Random j;
    public static final HashMap k;

    static {
        j.j = new Random();
        j.k = new HashMap();
    }

    public j(Context context0, ScheduledExecutorService scheduledExecutorService0, g g0, d d0, c c0, x7.a a0) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context0;
        this.c = scheduledExecutorService0;
        this.d = g0;
        this.e = d0;
        this.f = c0;
        this.g = a0;
        g0.a();
        this.h = g0.c.b;
        Application application0 = (Application)context0.getApplicationContext();
        AtomicReference atomicReference0 = i.a;
        if(atomicReference0.get() == null) {
            i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
            while(true) {
                if(atomicReference0.compareAndSet(null, i0)) {
                    M5.d.b(application0);
                    M5.d.c0.a(i0);
                    break;
                }
                if(atomicReference0.get() != null) {
                    break;
                }
            }
        }
        k.c(scheduledExecutorService0, new S2.d(1, this));
    }

    public final b a(g g0, String s, d d0, c c0, Executor executor0, W7.c c1, W7.c c2, W7.c c3, h h0, W7.i i0, W7.k k0, w w0) {
        c c4;
        synchronized(this) {
            if(!this.a.containsKey(s)) {
                if(s.equals("firebase")) {
                    g0.a();
                    c4 = g0.b.equals("[DEFAULT]") ? c0 : null;
                }
                else {
                    c4 = null;
                }
                new b(c4, executor0, c1, c2, c3, h0, i0, k0, this.e(g0, d0, h0, c2, this.b, s, k0), w0);
                c2.b();
                c3.b();
                c1.b();
                this.a.put(s, null);
                j.k.put(s, null);
            }
            return (b)this.a.get(s);
        }
    }

    public final b b(String s) {
        synchronized(this) {
            W7.c c0 = this.c(s, "fetch");
            W7.c c1 = this.c(s, "activate");
            W7.c c2 = this.c(s, "defaults");
            W7.k k0 = new W7.k(this.b.getSharedPreferences("frc_" + this.h + "_" + s + "_settings", 0));
            W7.i i0 = new W7.i(this.c, c1, c2);
            this.d.a();
            R2.c c3 = !this.d.b.equals("[DEFAULT]") || !s.equals("firebase") ? null : new R2.c(this.g);
            if(c3 != null) {
                i0.a(new V7.h(c3));
            }
            E1 e10 = new E1(8, false);
            e10.Y = c1;
            e10.Z = c2;
            w w0 = new w('\u0000', 28);
            w0.b0 = Collections.newSetFromMap(new ConcurrentHashMap());
            w0.Y = e10;
            w0.Z = this.c;
            h h0 = this.d(s, c0, k0);
            return this.a(this.d, s, this.e, this.f, this.c, c0, c1, c2, h0, i0, k0, w0);
        }
    }

    public final W7.c c(String s, String s1) {
        n n0;
        StringBuilder stringBuilder0 = new StringBuilder("frc_");
        stringBuilder0.append(this.h);
        stringBuilder0.append("_");
        stringBuilder0.append(s);
        stringBuilder0.append("_");
        String s2 = m5.b.y(stringBuilder0, s1, ".json");
        ScheduledExecutorService scheduledExecutorService0 = this.c;
        Context context0 = this.b;
        synchronized(n.class) {
            HashMap hashMap0 = n.c;
            if(!hashMap0.containsKey(s2)) {
                hashMap0.put(s2, new n(context0, s2));
            }
            n0 = (n)hashMap0.get(s2);
        }
        return W7.c.d(scheduledExecutorService0, n0);
    }

    public final h d(String s, W7.c c0, W7.k k0) {
        synchronized(this) {
            d d0 = this.e;
            this.d.a();
            x7.a a0 = this.d.b.equals("[DEFAULT]") ? this.g : new p(4);
            this.d.a();
            this.d.a();
            long v1 = k0.a.getLong("fetch_timeout_in_seconds", 60L);
            long v2 = k0.a.getLong("fetch_timeout_in_seconds", 60L);
            ConfigFetchHttpClient configFetchHttpClient0 = new ConfigFetchHttpClient(this.b, this.d.c.b, this.d.c.a, s, v1, v2);
            return new h(d0, a0, this.c, j.j, c0, configFetchHttpClient0, k0, this.i);
        }
    }

    public final v e(g g0, d d0, h h0, W7.c c0, Context context0, String s, W7.k k0) {
        synchronized(this) {
            return new v(g0, d0, h0, c0, context0, s, k0, this.c);
        }
    }
}

