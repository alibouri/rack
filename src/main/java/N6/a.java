package n6;

import Ab.e;
import E5.d;
import N5.r;
import S5.b;
import S5.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public e6.a h;
    public final b i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;
    public static final long n;
    public static volatile ScheduledExecutorService o;
    public static final Object p;

    static {
        a.n = TimeUnit.DAYS.toMillis(366L);
        a.o = null;
        a.p = new Object();
    }

    public a(Context context0, String s) {
        ApplicationInfo applicationInfo0;
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = b.a;
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        r.g(s, "WakeLock: wakeLockName must not be empty");
        context0.getApplicationContext();
        WorkSource workSource0 = null;
        this.h = null;
        if("com.google.android.gms".equals("com.wave.personal")) {
            this.j = s;
        }
        else {
            this.j = s.length() == 0 ? new String("*gcore*:") : "*gcore*:" + s;
        }
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        if(powerManager0 != null) {
            this.b = powerManager0.newWakeLock(1, s);
            if(f.b(context0)) {
                boolean z = !"com.wave.personal".trim().isEmpty();
                if(context0.getPackageManager() != null) {
                    try {
                        applicationInfo0 = U5.b.a(context0).b(0, "com.wave.personal");
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        Log.e("WorkSourceUtil", "Could not find package: com.wave.personal");
                        goto label_32;
                    }
                    if(applicationInfo0 == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: com.wave.personal");
                    }
                    else {
                        int v = applicationInfo0.uid;
                        workSource0 = new WorkSource();
                        f.a(workSource0, v, "com.wave.personal");
                    }
                }
            label_32:
                if(workSource0 != null) {
                    try {
                        this.b.setWorkSource(workSource0);
                    }
                    catch(IllegalArgumentException | ArrayIndexOutOfBoundsException illegalArgumentException0) {
                        Log.wtf("WakeLock", illegalArgumentException0.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService0 = a.o;
            if(scheduledExecutorService0 == null) {
                synchronized(a.p) {
                    scheduledExecutorService0 = a.o;
                    if(scheduledExecutorService0 == null) {
                        scheduledExecutorService0 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        a.o = scheduledExecutorService0;
                    }
                }
            }
            this.m = scheduledExecutorService0;
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder(29);
        stringBuilder0.append("expected a non-null reference", 0, 29);
        throw new e(stringBuilder0.toString());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }

    public final void a(long v) {
        this.l.incrementAndGet();
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        long v2 = v <= 0L ? Math.max(Math.min(0x7FFFFFFFFFFFFFFFL, a.n), 1L) : Math.min(v, Math.max(Math.min(0x7FFFFFFFFFFFFFFFL, a.n), 1L));
        synchronized(this.a) {
            if(!this.b()) {
                this.h = e6.a.X;
                this.b.acquire();
                this.i.getClass();
                SystemClock.elapsedRealtime();
            }
            ++this.c;
            if(this.g) {
                TextUtils.isEmpty(null);
            }
            n6.b b0 = (n6.b)this.k.get(null);
            if(b0 == null) {
                b0 = new n6.b();  // initializer: Ljava/lang/Object;-><init>()V
                this.k.put(null, b0);
            }
            ++b0.a;
            this.i.getClass();
            long v4 = SystemClock.elapsedRealtime();
            if(0x7FFFFFFFFFFFFFFFL - v4 > v2) {
                v1 = v4 + v2;
            }
            if(v1 > this.e) {
                this.e = v1;
                ScheduledFuture scheduledFuture0 = this.d;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
                d d0 = new d(29, this);
                this.d = this.m.schedule(d0, v2, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final boolean b() {
        synchronized(this.a) {
        }
        return this.c > 0;
    }

    public final void c() {
        if(this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", this.j + " release without a matched acquire!");
        }
        synchronized(this.a) {
            if(this.g) {
                TextUtils.isEmpty(null);
            }
            if(this.k.containsKey(null)) {
                n6.b b0 = (n6.b)this.k.get(null);
                if(b0 != null) {
                    int v1 = b0.a - 1;
                    b0.a = v1;
                    if(v1 == 0) {
                        this.k.remove(null);
                    }
                }
            }
            else {
                Log.w("WakeLock", this.j + " counter does not exist");
            }
            this.f();
        }
    }

    public final void d(boolean z) {
        synchronized(this.a) {
            this.g = z;
        }
    }

    public final void e() {
        HashSet hashSet0 = this.f;
        if(hashSet0.isEmpty()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(hashSet0);
        hashSet0.clear();
        if(arrayList0.size() <= 0) {
            return;
        }
        arrayList0.get(0).getClass();
        throw new ClassCastException();
    }

    public final void f() {
        synchronized(this.a) {
            if(this.b()) {
                if(!this.g) {
                    this.c = 0;
                    goto label_9;
                }
                int v = this.c - 1;
                this.c = v;
                if(v <= 0) {
                label_9:
                    this.e();
                    for(Object object1: this.k.values()) {
                        ((n6.b)object1).a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture0 = this.d;
                    if(scheduledFuture0 != null) {
                        scheduledFuture0.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    if(this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                            }
                            catch(RuntimeException runtimeException0) {
                                if(!runtimeException0.getClass().equals(RuntimeException.class)) {
                                    throw runtimeException0;
                                }
                                Log.e("WakeLock", this.j + " failed to release!", runtimeException0);
                                if(this.h != null) {
                                    this.h = null;
                                }
                                return;
                            }
                        }
                        catch(Throwable throwable1) {
                            if(this.h != null) {
                                this.h = null;
                            }
                            throw throwable1;
                        }
                        if(this.h != null) {
                            this.h = null;
                        }
                    }
                    else {
                        Log.e("WakeLock", this.j + " should be held!");
                    }
                }
            }
        }
    }
}

