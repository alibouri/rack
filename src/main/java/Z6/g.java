package Z6;

import N5.r;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.g1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m7.b;
import m7.d;
import m7.f;
import m7.m;
import s.e;
import x7.a;

public final class g {
    public final Context a;
    public final String b;
    public final i c;
    public final f d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final m g;
    public final a h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public static final Object k;
    public static final e l;

    static {
        g.k = new Object();
        g.l = new e(0);  // initializer: Ls/J;-><init>(I)V
    }

    public g(Context context0, String s, i i0) {
        List list0;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.a = context0;
        r.f(s);
        this.b = s;
        this.c = i0;
        Z6.a a0 = FirebaseInitProvider.X;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        Class class0 = ComponentDiscoveryService.class;
        ArrayList arrayList0 = new ArrayList();
        Bundle bundle0 = null;
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            }
            else {
                ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, class0), 0x80);
                if(serviceInfo0 == null) {
                    Log.w("ComponentDiscovery", class0 + " has no service info.");
                }
                else {
                    bundle0 = serviceInfo0.metaData;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if(bundle0 == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            list0 = Collections.emptyList();
        }
        else {
            list0 = new ArrayList();
            for(Object object0: bundle0.keySet()) {
                String s1 = (String)object0;
                if("com.google.firebase.components.ComponentRegistrar".equals(bundle0.get(s1)) && s1.startsWith("com.google.firebase.components:")) {
                    ((ArrayList)list0).add(s1.substring(0x1F));
                }
            }
        }
        for(Object object1: list0) {
            arrayList0.add(new d(0, ((String)object1)));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList1.addAll(arrayList0);
        arrayList1.add(new d(1, new FirebaseCommonRegistrar()));
        arrayList1.add(new d(1, new ExecutorsRegistrar()));
        arrayList2.add(b.c(context0, Context.class, new Class[0]));
        arrayList2.add(b.c(this, g.class, new Class[0]));
        arrayList2.add(b.c(i0, i.class, new Class[0]));
        v7.d d0 = new v7.d(18);
        if(Q4.i.E(context0) && FirebaseInitProvider.Y.get()) {
            arrayList2.add(b.c(a0, Z6.a.class, new Class[0]));
        }
        f f0 = new f(arrayList1, arrayList2, d0);
        this.d = f0;
        Trace.endSection();
        this.g = new m(new c(this, 0, context0));
        this.h = f0.l(v7.c.class);
        Z6.d d1 = new Z6.d(this);
        this.a();
        if(this.e.get()) {
            M5.d.c0.X.get();
        }
        this.i.add(d1);
        Trace.endSection();
    }

    public final void a() {
        r.l("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class class0) {
        this.a();
        return this.d.a(class0);
    }

    public static g c() {
        synchronized(g.k) {
            g g0 = (g)g.l.get("[DEFAULT]");
            if(g0 != null) {
                ((v7.c)g0.h.get()).b();
                return g0;
            }
        }
        throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + S5.c.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
    }

    public final String d() {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.a();
        Charset charset0 = Charset.defaultCharset();
        byte[] arr_b = this.b.getBytes(charset0);
        String s = null;
        stringBuilder0.append((arr_b == null ? null : Base64.encodeToString(arr_b, 11)));
        stringBuilder0.append("+");
        this.a();
        Charset charset1 = Charset.defaultCharset();
        byte[] arr_b1 = this.c.b.getBytes(charset1);
        if(arr_b1 != null) {
            s = Base64.encodeToString(arr_b1, 11);
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public final void e() {
        HashMap hashMap0;
        if(Q4.i.E(this.a)) {
            this.a();
            Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + this.b);
            f f1 = this.d;
            this.a();
            boolean z = "[DEFAULT]".equals(this.b);
            AtomicReference atomicReference1 = f1.d0;
            Boolean boolean0 = Boolean.valueOf(z);
            do {
                if(atomicReference1.compareAndSet(null, boolean0)) {
                    synchronized(f1) {
                        hashMap0 = new HashMap(f1.X);
                    }
                    f1.b(hashMap0, z);
                    break;
                }
            }
            while(atomicReference1.get() == null);
            ((v7.c)this.h.get()).b();
        }
        else {
            this.a();
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + this.b);
            Context context0 = this.a;
            AtomicReference atomicReference0 = Z6.f.b;
            if(atomicReference0.get() == null) {
                Z6.f f0 = new Z6.f(context0);
                do {
                    if(atomicReference0.compareAndSet(null, f0)) {
                        context0.registerReceiver(f0, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                        return;
                    }
                }
                while(atomicReference0.get() == null);
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof g)) {
            return false;
        }
        ((g)object0).a();
        return this.b.equals(((g)object0).b);
    }

    public static g f(Context context0) {
        i i0;
        synchronized(g.k) {
            if(g.l.containsKey("[DEFAULT]")) {
                return g.c();
            }
            i0 = i.a(context0);
            if(i0 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
        }
        return g.g(context0, i0);
    }

    public static g g(Context context0, i i0) {
        g g0;
        if(context0.getApplicationContext() instanceof Application) {
            Application application0 = (Application)context0.getApplicationContext();
            AtomicReference atomicReference0 = Z6.e.a;
            if(atomicReference0.get() == null) {
                Z6.e e0 = new Z6.e();  // initializer: Ljava/lang/Object;-><init>()V
                while(true) {
                    if(atomicReference0.compareAndSet(null, e0)) {
                        M5.d.b(application0);
                        M5.d.c0.a(e0);
                        break;
                    }
                    if(atomicReference0.get() != null) {
                        break;
                    }
                }
            }
        }
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(g.k) {
            r.l("FirebaseApp name [DEFAULT] already exists!", !g.l.containsKey("[DEFAULT]"));
            r.k(context0, "Application context cannot be null.");
            g0 = new g(context0, "[DEFAULT]", i0);
            g.l.put("[DEFAULT]", g0);
        }
        g0.e();
        return g0;
    }

    public final boolean h() {
        this.a();
        C7.a a0 = (C7.a)this.g.get();
        synchronized(a0) {
        }
        return a0.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        g1 g10 = new g1(this);
        g10.b(this.b, "name");
        g10.b(this.c, "options");
        return g10.toString();
    }
}

