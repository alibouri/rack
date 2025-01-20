package com.google.android.gms.internal.measurement;

import N5.r;
import S5.b;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import g.a;
import j6.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class e0 {
    public final String a;
    public final b b;
    public final ExecutorService c;
    public final a d;
    public int e;
    public boolean f;
    public volatile P g;
    public static volatile e0 h;

    public e0(Context context0, Bundle bundle0) {
        this.a = "FA";
        this.b = b.a;
        k0 k00 = new k0();  // initializer: Ljava/lang/Object;-><init>()V
        k00.a = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), k00);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor0);
        this.d = new a(4, this);
        new ArrayList();
        try {
            String s = t0.b(context0);
            Resources resources0 = context0.getResources();
            if(TextUtils.isEmpty(s)) {
                s = t0.b(context0);
            }
            String s1 = null;
            int v = resources0.getIdentifier("google_app_id", "string", s);
            if(v != 0) {
                try {
                    s1 = resources0.getString(v);
                }
                catch(Resources.NotFoundException unused_ex) {
                }
            }
        }
        catch(IllegalStateException unused_ex) {
            goto label_24;
        }
        if(s1 != null) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, e0.class.getClassLoader());
            }
            catch(ClassNotFoundException unused_ex) {
                this.f = true;
                Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        }
    label_24:
        this.e(new b0(this, context0, bundle0, 0));
        Application application0 = (Application)context0.getApplicationContext();
        if(application0 == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application0.registerActivityLifecycleCallbacks(new d0(this));
    }

    public final int a(String s) {
        Q q0 = new Q();
        this.e(new b0(this, s, q0, 1));
        Integer integer0 = (Integer)Q.e(q0.c(10000L), Integer.class);
        return integer0 == null ? 25 : ((int)integer0);
    }

    public static e0 b(Context context0, Bundle bundle0) {
        r.j(context0);
        if(e0.h == null) {
            synchronized(e0.class) {
                if(e0.h == null) {
                    e0.h = new e0(context0, bundle0);
                }
            }
        }
        return e0.h;
    }

    public final List c(String s, String s1) {
        Q q0 = new Q();
        this.e(new i0(this, s, s1, q0, 0));
        List list0 = (List)Q.e(q0.c(5000L), List.class);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final Map d(String s, String s1, boolean z) {
        Q q0 = new Q();
        this.e(new h0(this, s, s1, z, q0));
        Bundle bundle0 = q0.c(5000L);
        if(bundle0 != null && bundle0.size() != 0) {
            Map map0 = new HashMap(bundle0.size());
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 instanceof Double || object1 instanceof Long || object1 instanceof String) {
                    ((HashMap)map0).put(s2, object1);
                }
            }
            return map0;
        }
        return Collections.emptyMap();
    }

    public final void e(c0 c00) {
        this.c.execute(c00);
    }

    public final void f(Exception exception0, boolean z, boolean z1) {
        this.f |= z;
        String s = this.a;
        if(z) {
            Log.w(s, "Data collection startup failed. No data will be collected.", exception0);
            return;
        }
        if(z1) {
            this.e(new f0(this, exception0));
        }
        Log.w(s, "Error with data collection. Data lost.", exception0);
    }
}

