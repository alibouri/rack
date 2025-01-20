package Y6;

import Bb.q;
import E7.B;
import E7.C;
import E7.u;
import G1.g;
import G1.n;
import J1.a0;
import J1.e0;
import J2.w;
import J5.i;
import J5.j;
import K3.a;
import K5.f;
import M5.G;
import M5.H;
import M5.o;
import M5.t;
import M5.v;
import N5.r;
import R2.c;
import R2.k;
import R2.p;
import S2.h;
import Xb.A;
import Xb.D;
import Xb.h0;
import Xb.u0;
import a6.d;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.signin.internal.zak;
import com.google.common.util.concurrent.ListenableFuture;
import gc.e;
import io.sentry.X0;
import io.sentry.android.core.N;
import io.sentry.android.core.NetworkBreadcrumbsIntegration;
import io.sentry.g1;
import io.sentry.i1;
import io.sentry.y1;
import j6.A0;
import j6.C0;
import j6.E;
import j6.F;
import j6.L;
import j6.M;
import j6.P0;
import j6.V;
import j6.W;
import j6.d0;
import j6.g0;
import j6.k1;
import j6.l;
import j6.m;
import j6.n0;
import j6.p0;
import j6.q0;
import j6.r1;
import j6.s0;
import j6.s;
import j6.t0;
import j6.w0;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class b implements Runnable {
    public final int X;
    public Object Y;
    public final Object Z;

    public b(int v, Object object0, Object object1, boolean z) {
        this.X = v;
        this.Z = object0;
        this.Y = object1;
        super();
    }

    public b(a a0, I i0, a a1) {
        this.X = 27;
        super();
        this.Y = i0;
        this.Z = a0;
    }

    public b(View view0, e0 e00, g1 g10, ValueAnimator valueAnimator0) {
        this.X = 3;
        super();
        this.Y = view0;
        this.Z = valueAnimator0;
    }

    public b(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    private final void a() {
        i i0 = (i)this.Y;
        int v = ((j)this.Z).a;
        synchronized(i0) {
            j j0 = (j)i0.c0.get(v);
            if(j0 != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + v);
                i0.c0.remove(v);
                j0.b(new B("Timed out waiting for response", null));  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                i0.c();
            }
        }
    }

    private final void b() {
        if(!((o)this.Z).Y) {
            return;
        }
        ConnectionResult connectionResult0 = ((G)this.Y).b;
        if(connectionResult0.Y != 0 && connectionResult0.Z != null) {
            Activity activity0 = ((o)this.Z).a();
            r.j(connectionResult0.Z);
            int v = ((G)this.Y).a;
            Intent intent0 = new Intent(activity0, GoogleApiActivity.class);
            intent0.putExtra("pending_intent", connectionResult0.Z);
            intent0.putExtra("failing_client_id", v);
            intent0.putExtra("notify_manager", false);
            ((LifecycleFragment)((o)this.Z).X).startActivityForResult(intent0, 1);
            return;
        }
        Activity activity1 = ((o)this.Z).a();
        if(((o)this.Z).c0.a(connectionResult0.Y, activity1, null) != null) {
            Activity activity2 = ((o)this.Z).a();
            ((o)this.Z).c0.h(activity2, ((LifecycleFragment)((o)this.Z).X), connectionResult0.Y, ((o)this.Z));
            return;
        }
        if(connectionResult0.Y == 18) {
            Activity activity3 = ((o)this.Z).a();
            ((o)this.Z).c0.getClass();
            ProgressBar progressBar0 = new ProgressBar(activity3, null, 0x101007A);
            progressBar0.setIndeterminate(true);
            progressBar0.setVisibility(0);
            AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity3);
            alertDialog$Builder0.setView(progressBar0);
            alertDialog$Builder0.setMessage(N5.j.b(activity3, 18));
            alertDialog$Builder0.setPositiveButton("", null);
            AlertDialog alertDialog0 = alertDialog$Builder0.create();
            K5.b.f(activity3, alertDialog0, "GooglePlayServicesUpdatingDialog", ((o)this.Z));
            Context context0 = ((o)this.Z).a().getApplicationContext();
            c c0 = new c(this, 5, alertDialog0);
            ((o)this.Z).c0.getClass();
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter0.addDataScheme("package");
            v v1 = new v(c0);
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(v1, intentFilter0, 2);
            }
            else {
                context0.registerReceiver(v1, intentFilter0);
            }
            v1.a = context0;
            if(!f.b(context0)) {
                ((o)this.Z).Z.set(null);
                d d0 = ((o)this.Z).e0.n;
                d0.sendMessage(d0.obtainMessage(3));
                if(alertDialog0.isShowing()) {
                    alertDialog0.dismiss();
                }
                synchronized(v1) {
                    Context context1 = v1.a;
                    if(context1 != null) {
                        context1.unregisterReceiver(v1);
                    }
                    v1.a = null;
                }
            }
            return;
        }
        int v3 = ((G)this.Y).a;
        ((o)this.Z).Z.set(null);
        ((o)this.Z).e0.h(connectionResult0, v3);
    }

    private final void c() {
        p p0 = ((Q2.a)this.Z).X.f.c(((String)this.Y));
        if(p0 != null && p0.c()) {
            synchronized(((Q2.a)this.Z).Z) {
                R2.i i0 = w.D(p0);
                ((Q2.a)this.Z).d0.put(i0, p0);
                u0 u00 = N2.o.a(((Q2.a)this.Z).f0, p0, ((Q2.a)this.Z).Y.b, ((Q2.a)this.Z));
                R2.i i1 = w.D(p0);
                ((Q2.a)this.Z).e0.put(i1, u00);
            }
        }
    }

    private final void d() {
        try {
            ((Runnable)this.Z).run();
        }
        finally {
            Object object0 = ((h)this.Y).Y;
            synchronized(object0) {
                ((h)this.Y).d();
            }
        }
    }

    private final void e() {
        if(((NetworkBreadcrumbsIntegration)this.Z).c0) {
            return;
        }
        synchronized(((NetworkBreadcrumbsIntegration)this.Z).b0) {
            X0 x00 = ((y1)this.Y).getDateProvider();
            ((NetworkBreadcrumbsIntegration)this.Z).e0 = new N(((NetworkBreadcrumbsIntegration)this.Z).Y, x00);
            if(C.M(((NetworkBreadcrumbsIntegration)this.Z).X, ((NetworkBreadcrumbsIntegration)this.Z).Z, ((NetworkBreadcrumbsIntegration)this.Z).Y, ((NetworkBreadcrumbsIntegration)this.Z).e0)) {
                ((NetworkBreadcrumbsIntegration)this.Z).Z.h(i1.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                Z6.b.h("NetworkBreadcrumbs");
            }
            else {
                ((NetworkBreadcrumbsIntegration)this.Z).Z.h(i1.DEBUG, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
            }
        }
    }

    private final void f() {
        j6.d d2;
        r1 r14;
        j6.d d3;
        r1 r15;
        V v9;
        L l6;
        L l5;
        r1 r13;
        q0 q01;
        r1 r12;
        List list0;
        Integer integer0;
        r1 r11;
        j6.u0 u01;
        V v3;
        d0 d00 = (d0)this.Z;
        d0.h(d00.h0);
        d00.h0.q();
        m m0 = new m(d00);  // initializer: Lj6/o0;-><init>(Lj6/d0;)V
        m0.s();
        d00.t0 = m0;
        j6.u0 u00 = (j6.u0)this.Y;
        F f0 = new F(d00);  // initializer: Lj6/U;-><init>(Lj6/d0;)V
        f0.n0 = 0L;
        f0.o0 = null;
        f0.g0 = u00.f;
        f0.v();
        d00.u0 = f0;
        E e0 = new E(d00);
        e0.v();
        d00.r0 = e0;
        P0 p00 = new P0(d00);
        p00.v();
        d00.s0 = p00;
        r1 r10 = d00.j0;
        if(r10.Z) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        r10.q();
        SecureRandom secureRandom0 = new SecureRandom();
        long v = secureRandom0.nextLong();
        if(v == 0L) {
            v = secureRandom0.nextLong();
            if(v == 0L) {
                r10.b().h0.d("Utils falling back to Random for random id");
            }
        }
        r10.c0.set(v);
        ((d0)r10.Y).E0.incrementAndGet();
        r10.Z = true;
        V v1 = d00.f0;
        if(v1.Z) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        SharedPreferences sharedPreferences0 = ((d0)v1.Y).X.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        v1.b0 = sharedPreferences0;
        boolean z = sharedPreferences0.getBoolean("has_been_opened", false);
        v1.r0 = z;
        if(!z) {
            SharedPreferences.Editor sharedPreferences$Editor0 = v1.b0.edit();
            sharedPreferences$Editor0.putBoolean("has_been_opened", true);
            sharedPreferences$Editor0.apply();
        }
        v1.e0 = new K2.d(v1, Math.max(0L, ((long)(((Long)s.d.a(null))))));
        ((d0)v1.Y).E0.incrementAndGet();
        v1.Z = true;
        F f1 = d00.u0;
        if(f1.Z) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        d0 d01 = (d0)f1.Y;
        String s = d01.q0;
        Context context0 = d01.X;
        PackageManager packageManager0 = context0.getPackageManager();
        String s1 = "";
        String s2 = "unknown";
        String s3 = "Unknown";
        int v2 = 0x80000000;
        if(packageManager0 == null) {
            L l0 = f1.b();
            M m1 = L.u("com.wave.personal");
            v3 = v1;
            l0.e0.b(m1, "PackageManager is null, app identity information might be inaccurate. appId");
        }
        else {
            try {
                v3 = v1;
                s2 = packageManager0.getInstallerPackageName("com.wave.personal");
            }
            catch(IllegalArgumentException unused_ex) {
                L l1 = f1.b();
                M m2 = L.u("com.wave.personal");
                l1.e0.b(m2, "Error retrieving app installer package name. appId");
            }
            if(s2 == null) {
                s2 = "manual_install";
            }
            else if("com.android.vending".equals(s2)) {
                s2 = "";
            }
            else {
                s2 = s2;
            }
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.wave.personal", 0);
                if(packageInfo0 != null) {
                    TextUtils.isEmpty(packageManager0.getApplicationLabel(packageInfo0.applicationInfo));
                    v2 = packageInfo0.versionCode;
                    s3 = packageInfo0.versionName;
                }
                u01 = u00;
                goto label_84;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            goto label_80;
        }
        u01 = u00;
        goto label_84;
    label_80:
        L l2 = f1.b();
        M m3 = L.u("com.wave.personal");
        u01 = u00;
        l2.e0.c(m3, "Error retrieving package info. appId, appName", "Unknown");
    label_84:
        f1.b0 = "com.wave.personal";
        f1.e0 = s2;
        f1.c0 = s3;
        f1.d0 = v2;
        f1.f0 = 0L;
        String s4 = d01.Y;
        boolean z1 = !TextUtils.isEmpty(s4) && "am".equals(d01.Z);
        int v4 = d01.k();
        switch(v4) {
            case 0: {
                r11 = r10;
                f1.b().m0.d("App measurement collection enabled");
                break;
            }
            case 1: {
                r11 = r10;
                f1.b().k0.d("App measurement deactivated via the manifest");
                break;
            }
            case 2: {
                r11 = r10;
                f1.b().m0.d("App measurement deactivated via the init parameters");
                break;
            }
            case 3: {
                r11 = r10;
                f1.b().k0.d("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            }
            case 4: {
                r11 = r10;
                f1.b().k0.d("App measurement disabled via the manifest");
                break;
            }
            case 5: {
                r11 = r10;
                f1.b().m0.d("App measurement disabled via the init parameters");
                break;
            }
            case 6: {
                r11 = r10;
                f1.b().j0.d("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            }
            case 7: {
                r11 = r10;
                f1.b().k0.d("App measurement disabled via the global data collection setting");
                break;
            }
            case 8: {
                r11 = r10;
                f1.b().k0.d("App measurement disabled due to denied storage consent");
                break;
            }
            default: {
                r11 = r10;
                f1.b().k0.d("App measurement disabled");
                f1.b().f0.d("Invalid scion state in identity");
            }
        }
        f1.k0 = "";
        f1.l0 = "";
        if(z1) {
            f1.l0 = s4;
        }
        try {
            Resources resources0 = context0.getResources();
            String s5 = null;
            int v5 = resources0.getIdentifier("google_app_id", "string", (TextUtils.isEmpty(s) ? t0.b(context0) : s));
            if(v5 != 0) {
                try {
                    s5 = resources0.getString(v5);
                }
                catch(Resources.NotFoundException unused_ex) {
                }
            }
            if(!TextUtils.isEmpty(s5)) {
                s1 = s5;
            }
            f1.k0 = s1;
            if(!TextUtils.isEmpty(s5)) {
                Resources resources1 = context0.getResources();
                if(TextUtils.isEmpty(s)) {
                    s = t0.b(context0);
                }
                String s6 = null;
                int v6 = resources1.getIdentifier("admob_app_id", "string", s);
                if(v6 != 0) {
                    try {
                        s6 = resources1.getString(v6);
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                f1.l0 = s6;
            }
            if(v4 == 0) {
                f1.b().m0.c(f1.b0, "App measurement enabled for app package, google app id", (TextUtils.isEmpty(f1.k0) ? f1.l0 : f1.k0));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            L l3 = f1.b();
            M m4 = L.u("com.wave.personal");
            l3.e0.c(m4, "Fetching Google App Id failed with exception. appId", illegalStateException0);
        }
        f1.h0 = null;
        j6.d d0 = d01.e0;
        d0.getClass();
        r.f("analytics.safelisted_events");
        Bundle bundle0 = d0.u();
        if(bundle0 == null) {
            d0.b().e0.d("Failed to load metadata: Metadata bundle is null");
            integer0 = null;
        }
        else if(bundle0.containsKey("analytics.safelisted_events")) {
            integer0 = bundle0.getInt("analytics.safelisted_events");
        }
        else {
            integer0 = null;
        }
        if(integer0 == null) {
            list0 = null;
        }
        else {
            try {
                String[] arr_s = ((d0)d0.Y).X.getResources().getStringArray(((int)integer0));
                list0 = arr_s == null ? null : Arrays.asList(arr_s);
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                d0.b().e0.b(resources$NotFoundException0, "Failed to load string array from metadata: resource not found");
                list0 = null;
            }
        }
        if(list0 == null) {
            f1.h0 = null;
        }
        else if(list0.isEmpty()) {
            f1.b().j0.d("Safelisted event list is empty. Ignoring");
        }
        else {
            for(Object object0: list0) {
                if(f1.p().o0("safelisted event", ((String)object0))) {
                    continue;
                }
                goto label_188;
            }
            f1.h0 = list0;
        }
    label_188:
        f1.j0 = packageManager0 == null ? 0 : U5.a.G(context0);
        d01.E0.incrementAndGet();
        f1.Z = true;
        L l4 = d00.g0;
        d0.h(l4);
        j6.N n0 = l4.k0;
        n0.b(106000L, "App measurement initialized, version");
        d0.h(l4);
        n0.d("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s7 = f0.x();
        boolean z2 = TextUtils.isEmpty(d00.Y);
        j6.d d1 = d00.e0;
        if(z2) {
            r12 = r11;
            if(r12.s0(s7, d1.b0)) {
                d0.h(l4);
                n0.d("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            }
            else {
                d0.h(l4);
                n0.d("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + s7);
            }
        }
        else {
            r12 = r11;
        }
        d0.h(l4);
        l4.l0.d("Debug-level message logging enabled");
        AtomicInteger atomicInteger0 = d00.E0;
        if(d00.C0 != atomicInteger0.get()) {
            d0.h(l4);
            Integer integer1 = (int)d00.C0;
            Integer integer2 = atomicInteger0.get();
            l4.e0.c(integer1, "Not all components initialized", integer2);
        }
        d00.v0 = true;
        zzdw zzdw0 = u01.g;
        d0.h(d00.h0);
        d00.h0.q();
        if(d1.B(null, s.I0)) {
            d0.e(r12);
            r12.q();
            if(r12.A0() == 1L) {
                r12.q();
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                d0 d02 = (d0)r12.Y;
                a5.c c0 = new a5.c(d02);
                w1.c.e(d02.X, c0, intentFilter0, null, 2);
                r12.b().l0.d("Registered app receiver");
            }
        }
        d0.e(v3);
        q0 q00 = v3.A();
        s0 s00 = d1.x("google_analytics_default_allow_ad_storage", false);
        s0 s01 = d1.x("google_analytics_default_allow_analytics_storage", false);
        s0 s02 = s0.Y;
        p0 p01 = p0.Z;
        Class class0 = p0.class;
        long v7 = d00.F0;
        w0 w00 = d00.n0;
        if(s00 != s02 || s01 != s02) {
            r13 = r12;
            l5 = l4;
            if(q0.h(-10, v3.y().getInt("consent_source", 100))) {
                EnumMap enumMap0 = new EnumMap(class0);
                enumMap0.put(p0.Y, s00);
                enumMap0.put(p01, s01);
                q01 = new q0(enumMap0, -10);
            }
            else {
            label_257:
                if(!TextUtils.isEmpty(d00.n().y()) && (q00.b == 0 || q00.b == 30 || (q00.b == 10 || q00.b == 30) || q00.b == 40)) {
                    d0.g(w00);
                    w00.C(new q0(-10), v7, false);
                }
                else if(TextUtils.isEmpty(d00.n().y()) && zzdw0 != null) {
                    Bundle bundle1 = zzdw0.e0;
                    if(bundle1 != null && q0.h(30, v3.y().getInt("consent_source", 100))) {
                        q01 = q0.b(30, bundle1);
                        for(Object object1: q01.a.values()) {
                            if(((s0)object1) == s02) {
                                continue;
                            }
                            goto label_271;
                        }
                    }
                }
                q01 = null;
            }
        }
        else {
            r13 = r12;
            l5 = l4;
            goto label_257;
        }
    label_271:
        if(q01 != null) {
            d0.g(w00);
            w00.C(q01, v7, true);
            q00 = q01;
        }
        d0.g(w00);
        w00.B(q00);
        v3.q();
        int v8 = l.b(v3.y().getString("dma_consent_settings", null)).a;
        s0 s03 = d1.x("google_analytics_default_allow_ad_personalization_signals", true);
        if(s03 == s02) {
            l6 = l5;
        }
        else {
            d0.h(l5);
            l6 = l5;
            l6.m0.b(s03, "Default ad personalization consent from Manifest");
        }
        s0 s04 = d1.x("google_analytics_default_allow_ad_user_data", true);
        d0 d03 = (d0)w00.Y;
        if(s04 != s02 && q0.h(-10, v8)) {
            d0.g(w00);
            EnumMap enumMap1 = new EnumMap(class0);
            enumMap1.put(p0.b0, s04);
            w00.A(new l(enumMap1, -10, null, null), true);
            v9 = v3;
        }
        else if(TextUtils.isEmpty(d00.n().y()) || v8 != 0 && v8 != 30) {
            if(TextUtils.isEmpty(d00.n().y()) && zzdw0 != null) {
                Bundle bundle2 = zzdw0.e0;
                if(bundle2 != null && q0.h(30, v8)) {
                    l l7 = l.a(30, bundle2);
                    for(Object object2: l7.e.values()) {
                        if(((s0)object2) != s02) {
                            d0.g(w00);
                            w00.A(l7, true);
                            break;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            if(!TextUtils.isEmpty(d00.n().y()) || zzdw0 == null) {
                v9 = v3;
            }
            else {
                Bundle bundle3 = zzdw0.e0;
                if(bundle3 == null) {
                    v9 = v3;
                }
                else {
                    v9 = v3;
                    if(v9.m0.x() == null) {
                        Boolean boolean0 = l.c(bundle3);
                        if(boolean0 != null) {
                            d0.g(w00);
                            d03.l0.getClass();
                            w00.K(zzdw0.c0, "allow_personalized_ads", boolean0.toString(), false, System.currentTimeMillis());
                        }
                    }
                }
            }
        }
        else {
            d0.g(w00);
            w00.A(new l(null, -10, null, null), true);
            v9 = v3;
        }
        Boolean boolean1 = d1.z("google_analytics_tcf_data_enabled");
        if((boolean1 == null ? true : boolean1.booleanValue())) {
            d0.h(l6);
            l6.l0.d("TCF client enabled.");
            d0.g(w00);
            w00.q();
            w00.b().l0.d("Register tcfPrefChangeListener.");
            if(w00.s0 == null) {
                w00.t0 = new C0(w00, d03, 1);
                A0 a00 = new A0();  // initializer: Ljava/lang/Object;-><init>()V
                a00.a = w00;
                w00.s0 = a00;
            }
            w00.o().x().registerOnSharedPreferenceChangeListener(w00.s0);
            d0.g(w00);
            w00.P();
        }
        io.sentry.android.core.o o0 = v9.f0;
        if(o0.a() == 0L) {
            d0.h(l6);
            l6.m0.b(v7, "Persisting first open");
            o0.b(v7);
        }
        d0.g(w00);
        W w0 = w00.p0;
        if(w0.c() && w0.d()) {
            d0.e(w0.b.f0);
            w0.b.f0.w0.y(null);
        }
        if(d00.j()) {
            boolean z3 = TextUtils.isEmpty(d00.n().y());
            u u0 = v9.g0;
            if(z3) {
                F f2 = d00.n();
                f2.u();
                if(TextUtils.isEmpty(f2.l0)) {
                    r15 = r13;
                    d3 = d1;
                    goto label_426;
                }
                goto label_385;
            }
            else {
            label_385:
                d00.r();
                String s8 = d00.n().y();
                v9.q();
                String s9 = v9.y().getString("gmp_app_id", null);
                F f3 = d00.n();
                f3.u();
                String s10 = f3.l0;
                v9.q();
                d3 = d1;
                r15 = r13;
                if(r1.d0(s8, s9, s10, v9.y().getString("admob_app_id", null))) {
                    d0.h(l6);
                    l6.k0.d("Rechecking which service to use due to a GMP App Id change");
                    v9.q();
                    v9.q();
                    Boolean boolean2 = v9.y().contains("measurement_enabled") ? Boolean.valueOf(v9.y().getBoolean("measurement_enabled", true)) : null;
                    SharedPreferences.Editor sharedPreferences$Editor1 = v9.y().edit();
                    sharedPreferences$Editor1.clear();
                    sharedPreferences$Editor1.apply();
                    if(boolean2 != null) {
                        v9.q();
                        SharedPreferences.Editor sharedPreferences$Editor2 = v9.y().edit();
                        sharedPreferences$Editor2.putBoolean("measurement_enabled", boolean2.booleanValue());
                        sharedPreferences$Editor2.apply();
                    }
                    d00.o().z();
                    d00.s0.D();
                    d00.s0.C();
                    o0.b(v7);
                    u0.y(null);
                }
                String s11 = d00.n().y();
                v9.q();
                SharedPreferences.Editor sharedPreferences$Editor3 = v9.y().edit();
                sharedPreferences$Editor3.putString("gmp_app_id", s11);
                sharedPreferences$Editor3.apply();
                F f4 = d00.n();
                f4.u();
                String s12 = f4.l0;
                v9.q();
                SharedPreferences.Editor sharedPreferences$Editor4 = v9.y().edit();
                sharedPreferences$Editor4.putString("admob_app_id", s12);
                sharedPreferences$Editor4.apply();
            }
        label_426:
            if(!v9.A().i(p01)) {
                u0.y(null);
            }
            d0.g(w00);
            w00.T(u0.x());
            d0.e(r15);
            r14 = r15;
            try {
                boolean z4 = false;
                ((d0)r14.Y).X.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                z4 = true;
            }
            catch(ClassNotFoundException unused_ex) {
            }
            if(!z4) {
                u u1 = v9.v0;
                if(!TextUtils.isEmpty(u1.x())) {
                    d0.h(l6);
                    l6.h0.d("Remote config removed with active feature rollouts");
                    u1.y(null);
                }
            }
            if(TextUtils.isEmpty(d00.n().y())) {
                F f5 = d00.n();
                f5.u();
                if(TextUtils.isEmpty(f5.l0)) {
                    d2 = d3;
                    goto label_466;
                }
                goto label_447;
            }
            else {
            label_447:
                boolean z5 = d00.i();
                if((v9.b0 == null ? false : v9.b0.contains("deferred_analytics_collection"))) {
                    d2 = d3;
                }
                else {
                    d2 = d3;
                    Boolean boolean3 = d2.z("firebase_analytics_collection_deactivated");
                    if(boolean3 == null || !boolean3.booleanValue()) {
                        v9.w(!z5);
                    }
                }
                if(z5) {
                    d0.g(w00);
                    w00.M();
                }
                d0.g(d00.i0);
                d00.i0.d0.H();
                d00.q().A(new AtomicReference());
                P0 p02 = d00.q();
                Bundle bundle4 = v9.y0.f();
                p02.q();
                p02.u();
                p02.z(new n(p02, p02.J(false), bundle4, 11));
            }
        }
        else if(d00.i()) {
            d0.e(r13);
            if(!r13.t0("android.permission.INTERNET")) {
                d0.h(l6);
                l6.e0.d("App is missing INTERNET permission");
            }
            if(!r13.t0("android.permission.ACCESS_NETWORK_STATE")) {
                d0.h(l6);
                l6.e0.d("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context1 = d00.X;
            if(!U5.b.a(context1).d() && !d1.E()) {
                if(!r1.X(context1)) {
                    d0.h(l6);
                    l6.e0.d("AppMeasurementReceiver not registered/enabled");
                }
                if(!r1.i0(context1)) {
                    d0.h(l6);
                    l6.e0.d("AppMeasurementService not registered/enabled");
                }
            }
            d0.h(l6);
            l6.e0.d("Uploading is not possible. App measurement disabled");
            r14 = r13;
            d2 = d1;
        }
        else {
            d2 = d1;
            r14 = r13;
        }
    label_466:
        if(d2.B(null, s.I0)) {
            d0.e(r14);
            r14.q();
            if(r14.A0() == 1L) {
                d0.g(w00);
                g0 g00 = new g0(0);
                g00.Y = w00;
                new Thread(g00).start();
            }
        }
        v9.o0.a(true);
    }

    @Override
    public final void run() {
        A a1;
        dc.i i3;
        Bundle bundle0 = null;
        boolean z = true;
        int v = 0;
        switch(this.X) {
            case 0: {
                k k0 = (k)this.Z;
                ListenableFuture listenableFuture0 = (ListenableFuture)this.Y;
                try {
                    io.sentry.config.a.J(listenableFuture0);
                }
                catch(ExecutionException executionException0) {
                    k0.P(executionException0.getCause());
                    return;
                }
                catch(RuntimeException | Error runtimeException0) {
                    k0.P(runtimeException0);
                    return;
                }
                w0 w00 = (w0)k0.Z;
                w00.q();
                boolean z1 = ((d0)w00.Y).e0.B(null, s.N0);
                zzno zzno0 = (zzno)k0.Y;
                String s2 = zzno0.X;
                if(z1) {
                    SparseArray sparseArray0 = w00.o().z();
                    sparseArray0.put(zzno0.Z, ((long)zzno0.Y));
                    w00.o().u(sparseArray0);
                    w00.h0 = false;
                    w00.i0 = 1;
                    w00.b().l0.b(s2, "Successfully registered trigger URI");
                    w00.Q();
                    return;
                }
                w00.h0 = false;
                w00.Q();
                w00.b().l0.b(s2, "registerTriggerAsync ran. uri");
                return;
            }
            case 1: {
                y1.b b0 = (y1.b)((i.s)this.Y).X;
                if(b0 != null) {
                    b0.k(((Typeface)this.Z));
                }
                return;
            }
            case 2: {
                ((g)this.Y).a(this.Z);
                return;
            }
            case 3: {
                a0.g(((View)this.Y));
                ((ValueAnimator)this.Z).start();
                return;
            }
            case 4: {
                i i0 = (i)this.Y;
                IBinder iBinder0 = (IBinder)this.Z;
                synchronized(i0) {
                    if(iBinder0 == null) {
                        i0.a(0, "Null service connection");
                        return;
                    }
                    try {
                        i0.Z = new c(iBinder0);
                    }
                    catch(RemoteException remoteException0) {
                        i0.a(0, remoteException0.getMessage());
                        return;
                    }
                    i0.X = 2;
                    ((ScheduledExecutorService)i0.d0.d).execute(new J5.h(i0, 0));
                }
                return;
            }
            case 5: {
                this.a();
                return;
            }
            case 6: {
                I2.A a0 = I2.A.e();
                p p0 = (p)this.Y;
                a0.a(K2.a.e, "Scheduling work " + p0.a);
                ((K2.a)this.Z).a.c(new p[]{p0});
                return;
            }
            case 7: {
                ((EditText)this.Y).removeTextChangedListener(((K6.h)((K6.d)this.Z).b).d);
                return;
            }
            case 8: {
                boolean z2 = ((AutoCompleteTextView)this.Y).isPopupShowing();
                ((com.google.android.material.textfield.c)((K6.k)this.Z).Y).g(z2);
                ((com.google.android.material.textfield.c)((K6.k)this.Z).Y).i = z2;
                return;
            }
            case 9: {
                ((AutoCompleteTextView)this.Y).removeTextChangedListener(((com.google.android.material.textfield.c)((K6.d)this.Z).b).d);
                return;
            }
            case 10: {
                ((EditText)this.Y).removeTextChangedListener(((K6.r)((K6.d)this.Z).b).d);
                return;
            }
            case 11: {
                t t0 = (t)this.Z;
                M5.r r0 = (M5.r)t0.d0.j.get(t0.Y);
                if(r0 != null) {
                    ConnectionResult connectionResult0 = (ConnectionResult)this.Y;
                    if(connectionResult0.Y == 0) {
                        v = 1;
                    }
                    if(v == 0) {
                        r0.o(connectionResult0, null);
                    }
                    else {
                        t0.c0 = true;
                        L5.c c0 = t0.X;
                        if(!c0.l()) {
                            goto label_112;
                        }
                        if(t0.c0) {
                            N5.g g0 = t0.Z;
                            if(g0 != null) {
                                c0.c(g0, t0.b0);
                                return;
                                try {
                                label_112:
                                    c0.c(null, c0.b());
                                }
                                catch(SecurityException securityException0) {
                                    Log.e("GoogleApiManager", "Failed to get service from broker. ", securityException0);
                                    c0.e("Failed to get service from broker.");
                                    r0.o(new ConnectionResult(10), null);
                                }
                                return;
                            }
                        }
                    }
                }
                return;
            }
            case 12: {
                M5.j j0 = (M5.j)this.Y;
                M5.i i1 = (M5.i)this.Z;
                Object object1 = j0.b;
                if(object1 != null) {
                    i1.n(object1);
                }
                return;
            }
            case 13: {
                zak zak0 = (zak)this.Y;
                ConnectionResult connectionResult1 = zak0.Y;
                if(connectionResult1.Y != 0) {
                    z = false;
                }
                M5.B b1 = (M5.B)this.Z;
                if(z) {
                    zav zav0 = zak0.Z;
                    r.j(zav0);
                    ConnectionResult connectionResult2 = zav0.Z;
                    if(connectionResult2.Y != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: " + connectionResult2, new Exception());
                        b1.k.a(connectionResult2);
                        b1.j.k();
                        return;
                    }
                    t t1 = b1.k;
                    IBinder iBinder1 = zav0.Y;
                    if(iBinder1 != null) {
                        IInterface iInterface0 = iBinder1.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        N5.g g1 = iInterface0 instanceof N5.g ? ((N5.g)iInterface0) : new N5.B(iBinder1, "com.google.android.gms.common.internal.IAccountAccessor", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
                        bundle0 = g1;
                    }
                    t1.getClass();
                    if(bundle0 == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        t1.a(new ConnectionResult(4));
                        b1.j.k();
                        return;
                    }
                    else {
                        Set set0 = b1.h;
                        if(set0 == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            t1.a(new ConnectionResult(4));
                        }
                        else {
                            t1.Z = bundle0;
                            t1.b0 = set0;
                            if(t1.c0) {
                                t1.X.c(((N5.g)bundle0), set0);
                            }
                        }
                    }
                }
                else {
                    b1.k.a(connectionResult1);
                }
                b1.j.k();
                return;
            }
            case 14: {
                this.b();
                return;
            }
            case 15: {
                H h0 = (H)this.Z;
                int v2 = h0.Y;
                o o0 = (o)this.Y;
                if(v2 > 0) {
                    Bundle bundle1 = h0.Z;
                    if(bundle1 != null) {
                        bundle0 = bundle1.getBundle("ConnectionlessLifecycleHelper");
                    }
                    o0.c(bundle0);
                }
                if(h0.Y >= 2) {
                    o0.f();
                }
                if(h0.Y >= 3) {
                    o0.d();
                }
                if(h0.Y >= 4) {
                    o0.g();
                }
                return;
            }
            case 16: {
                M5.I i2 = (M5.I)this.Z;
                int v3 = i2.Y0;
                o o1 = (o)this.Y;
                if(v3 > 0) {
                    Bundle bundle2 = i2.Z0;
                    if(bundle2 != null) {
                        bundle0 = bundle2.getBundle("ConnectionlessLifecycleHelper");
                    }
                    o1.c(bundle0);
                }
                if(i2.Y0 >= 2) {
                    o1.f();
                }
                if(i2.Y0 >= 3) {
                    o1.d();
                }
                if(i2.Y0 >= 4) {
                    o1.g();
                }
                return;
            }
            case 17: {
                this.c();
                return;
            }
            case 18: {
                this.d();
                return;
            }
            case 19: {
                ((Xb.k)this.Z).G(((h0)this.Y));
                return;
            }
            case 20: {
                ((Xb.k)this.Y).G(((Yb.b)this.Z));
                return;
            }
            case 21: {
                f1.l l0 = (f1.l)this.Y;
                Xb.k k1 = (Xb.k)this.Z;
                if(l0.isCancelled()) {
                    k1.o(null);
                    return;
                }
                try {
                    k1.i(q.D(l0));
                }
                catch(ExecutionException executionException1) {
                    Throwable throwable0 = executionException1.getCause();
                    Nb.j.c(throwable0);
                    k1.i(W5.f.v(throwable0));
                }
                return;
            }
            case 22: {
            alab1:
                while(true) {
                    do {
                        try {
                            ((Runnable)this.Y).run();
                        }
                        catch(Throwable throwable1) {
                            D.a(throwable1, kotlin.coroutines.j.X);
                        }
                        i3 = (dc.i)this.Z;
                        Runnable runnable0 = i3.c0();
                        if(runnable0 == null) {
                            break alab1;
                        }
                        this.Y = runnable0;
                        ++v;
                        if(v < 16) {
                            continue alab1;
                        }
                        a1 = i3.Z;
                    }
                    while(!a1.a0(i3));
                    a1.Y(i3, this);
                    return;
                }
                return;
            }
            case 23: {
                ((e)(((gc.f)this.Y))).h(((gc.b)this.Z), Ab.t.a);
                return;
            }
            case 24: {
                h2.a a2 = (h2.a)this.Z;
                Object object2 = this.Y;
                if(a2.Z.get()) {
                    I5.c c1 = a2.c0;
                    if(c1.h == a2) {
                        SystemClock.uptimeMillis();
                        c1.h = null;
                        c1.b();
                    }
                }
                else {
                    I5.c c2 = a2.c0;
                    if(c2.g == a2) {
                        if(!c2.c) {
                            SystemClock.uptimeMillis();
                            c2.g = null;
                            g2.a a3 = c2.a;
                            if(a3 != null) {
                                if(Looper.myLooper() == Looper.getMainLooper()) {
                                    a3.j(object2);
                                }
                                else {
                                    a3.h(object2);
                                }
                            }
                        }
                    }
                    else if(c2.h == a2) {
                        SystemClock.uptimeMillis();
                        c2.h = null;
                        c2.b();
                    }
                }
                a2.Y = 3;
                return;
            }
            case 25: {
                this.e();
                return;
            }
            case 26: {
                ((n0)this.Y).a();
                if(io.sentry.hints.i.Q()) {
                    ((n0)this.Y).c().z(this);
                    return;
                }
                if(((j6.k)this.Z).c == 0L) {
                    z = false;
                }
                ((j6.k)this.Z).c = 0L;
                if(z) {
                    ((j6.k)this.Z).c();
                }
                return;
            }
            case 27: {
                W w0 = (W)((a)this.Z).Z;
                d0.h(w0.b.h0);
                w0.b.h0.q();
                I i4 = (I)this.Y;
                L l1 = w0.b.g0;
                Bundle bundle3 = new Bundle();
                bundle3.putString("package_name", ((String)((a)this.Z).Y));
                try {
                    Parcel parcel0 = ((K)i4).b();
                    com.google.android.gms.internal.measurement.F.c(parcel0, bundle3);
                    Parcel parcel1 = ((K)i4).K(1, parcel0);
                    Bundle bundle4 = (Bundle)com.google.android.gms.internal.measurement.F.a(parcel1, Bundle.CREATOR);
                    parcel1.recycle();
                    if(bundle4 == null) {
                        d0.h(l1);
                        l1.e0.d("Install Referrer Service returned a null response");
                    }
                }
                catch(Exception exception0) {
                    d0.h(l1);
                    l1.e0.b(exception0.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                d0.h(w0.b.h0);
                w0.b.h0.q();
                throw new IllegalStateException("Unexpected call on client side");
            }
            case 28: {
                this.f();
                return;
            }
            default: {
                ((j6.h0)this.Z).d.d0();
                zzae zzae0 = (zzae)this.Y;
                Object object0 = zzae0.Z.zza();
                k1 k10 = ((j6.h0)this.Z).d;
                if(object0 == null) {
                    k10.getClass();
                    String s = zzae0.X;
                    r.j(s);
                    zzo zzo0 = k10.O(s);
                    if(zzo0 != null) {
                        k10.q(zzae0, zzo0);
                    }
                }
                else {
                    k10.getClass();
                    String s1 = zzae0.X;
                    r.j(s1);
                    zzo zzo1 = k10.O(s1);
                    if(zzo1 != null) {
                        k10.J(zzae0, zzo1);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        if(this.X != 0) {
            return super.toString();
        }
        R2.w w0 = new R2.w(b.class.getSimpleName());
        io.sentry.internal.debugmeta.c c0 = new io.sentry.internal.debugmeta.c(7, false);
        ((io.sentry.internal.debugmeta.c)w0.b0).Z = c0;
        w0.b0 = c0;
        c0.Y = (k)this.Z;
        return w0.toString();
    }
}

