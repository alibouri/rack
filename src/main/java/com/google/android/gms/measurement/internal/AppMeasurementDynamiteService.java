package com.google.android.gms.measurement.internal;

import E7.o;
import J5.g;
import N5.r;
import R2.c;
import V5.a;
import V5.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.V;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.zzdw;
import io.sentry.android.core.v;
import j6.B0;
import j6.D0;
import j6.E0;
import j6.L0;
import j6.L;
import j6.M0;
import j6.a0;
import j6.d0;
import j6.d;
import j6.f0;
import j6.r1;
import j6.s;
import j6.t0;
import j6.w0;
import j6.x0;
import j6.y0;
import j6.z0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import s.e;

@DynamiteApi
public class AppMeasurementDynamiteService extends T {
    public d0 d;
    public final e e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.d = null;
        this.e = new e(0);  // initializer: Ls/J;-><init>(I)V
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void beginAdUnitExposure(String s, long v) {
        this.c();
        this.d.l().w(v, s);
    }

    public final void c() {
        if(this.d == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void clearConditionalUserProperty(String s, String s1, Bundle bundle0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.I(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void clearMeasurementEnabled(long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.u();
        w00.c().z(new z0(w00, 3, null));
    }

    public final void e(String s, U u0) {
        this.c();
        r1 r10 = this.d.j0;
        d0.e(r10);
        r10.T(s, u0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void endAdUnitExposure(String s, long v) {
        this.c();
        this.d.l().z(v, s);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void generateEventId(U u0) {
        this.c();
        r1 r10 = this.d.j0;
        d0.e(r10);
        long v = r10.B0();
        this.c();
        r1 r11 = this.d.j0;
        d0.e(r11);
        r11.M(u0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getAppInstanceId(U u0) {
        this.c();
        a0 a00 = this.d.h0;
        d0.h(a00);
        a00.z(new f0(this, u0, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getCachedAppInstanceId(U u0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        this.e(((String)w00.f0.get()), u0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getConditionalUserProperties(String s, String s1, U u0) {
        this.c();
        a0 a00 = this.d.h0;
        d0.h(a00);
        a00.z(new B0(this, u0, s, s1, 2));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getCurrentScreenClass(U u0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        L0 l00 = ((d0)w00.Y).m0;
        d0.g(l00);
        this.e((l00.b0 == null ? null : l00.b0.b), u0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getCurrentScreenName(U u0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        L0 l00 = ((d0)w00.Y).m0;
        d0.g(l00);
        this.e((l00.b0 == null ? null : l00.b0.a), u0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getGmpAppId(U u0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        d0 d00 = (d0)w00.Y;
        String s = d00.Y;
        if(s == null) {
            try {
                s = null;
                Context context0 = d00.X;
                String s1 = d00.q0;
                r.j(context0);
                Resources resources0 = context0.getResources();
                if(TextUtils.isEmpty(s1)) {
                    s1 = t0.b(context0);
                }
                int v = resources0.getIdentifier("google_app_id", "string", s1);
                if(v != 0) {
                    try {
                        s = resources0.getString(v);
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
                d0.h(d00.g0);
                d00.g0.e0.b(illegalStateException0, "getGoogleAppId failed with exception");
            }
        }
        this.e(s, u0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getMaxUserProperties(String s, U u0) {
        this.c();
        d0.g(this.d.n0);
        r.f(s);
        this.c();
        r1 r10 = this.d.j0;
        d0.e(r10);
        r10.L(u0, 25);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getSessionId(U u0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.c().z(new z0(w00, 2, u0));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getTestFlag(U u0, int v) {
        this.c();
        switch(v) {
            case 0: {
                r1 r14 = this.d.j0;
                d0.e(r14);
                w0 w04 = this.d.n0;
                d0.g(w04);
                AtomicReference atomicReference4 = new AtomicReference();
                r14.T(((String)w04.c().v(atomicReference4, 15000L, "String test flag value", new x0(w04, atomicReference4, 2))), u0);
                return;
            }
            case 1: {
                r1 r13 = this.d.j0;
                d0.e(r13);
                w0 w03 = this.d.n0;
                d0.g(w03);
                AtomicReference atomicReference3 = new AtomicReference();
                r13.M(u0, ((long)(((Long)w03.c().v(atomicReference3, 15000L, "long test flag value", new x0(w03, atomicReference3, 4))))));
                return;
            }
            case 2: {
                r1 r12 = this.d.j0;
                d0.e(r12);
                w0 w02 = this.d.n0;
                d0.g(w02);
                AtomicReference atomicReference2 = new AtomicReference();
                double f = (double)(((Double)w02.c().v(atomicReference2, 15000L, "double test flag value", new x0(w02, atomicReference2, 5))));
                Bundle bundle0 = new Bundle();
                bundle0.putDouble("r", f);
                try {
                    u0.f(bundle0);
                }
                catch(RemoteException remoteException0) {
                    L l0 = ((d0)r12.Y).g0;
                    d0.h(l0);
                    l0.h0.b(remoteException0, "Error returning double value to wrapper");
                }
                return;
            }
            case 3: {
                r1 r11 = this.d.j0;
                d0.e(r11);
                w0 w01 = this.d.n0;
                d0.g(w01);
                AtomicReference atomicReference1 = new AtomicReference();
                r11.L(u0, ((int)(((Integer)w01.c().v(atomicReference1, 15000L, "int test flag value", new x0(w01, atomicReference1, 3))))));
                return;
            }
            case 4: {
                r1 r10 = this.d.j0;
                d0.e(r10);
                w0 w00 = this.d.n0;
                d0.g(w00);
                AtomicReference atomicReference0 = new AtomicReference();
                r10.P(u0, ((Boolean)w00.c().v(atomicReference0, 15000L, "boolean test flag value", new x0(w00, atomicReference0, 1))).booleanValue());
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void getUserProperties(String s, String s1, boolean z, U u0) {
        this.c();
        a0 a00 = this.d.h0;
        d0.h(a00);
        a00.z(new g(this, u0, s, s1, z, 1));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void initForTests(Map map0) {
        this.c();
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void initialize(a a0, zzdw zzdw0, long v) {
        d0 d00 = this.d;
        if(d00 == null) {
            Context context0 = (Context)b.O(a0);
            r.j(context0);
            this.d = d0.d(context0, zzdw0, v);
            return;
        }
        d0.h(d00.g0);
        d00.g0.h0.d("Attempting to initialize multiple times");
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void isDataCollectionEnabled(U u0) {
        this.c();
        a0 a00 = this.d.h0;
        d0.h(a00);
        a00.z(new f0(this, u0, 1));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void logEvent(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.J(s, s1, bundle0, z, z1, v);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void logEventAndBundle(String s, String s1, Bundle bundle0, U u0, long v) {
        this.c();
        r.f(s1);
        (bundle0 == null ? new Bundle() : new Bundle(bundle0)).putString("_o", "app");
        zzbf zzbf0 = new zzbf(s1, new zzbe(bundle0), "app", v);
        a0 a00 = this.d.h0;
        d0.h(a00);
        a00.z(new B0(this, u0, zzbf0, s, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void logHealthData(int v, String s, a a0, a a1, a a2) {
        this.c();
        Object object0 = null;
        Object object1 = a0 == null ? null : b.O(a0);
        Object object2 = a1 == null ? null : b.O(a1);
        if(a2 != null) {
            object0 = b.O(a2);
        }
        L l0 = this.d.g0;
        d0.h(l0);
        l0.x(v, true, false, s, object1, object2, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivityCreated(a a0, Bundle bundle0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        o o0 = w00.b0;
        if(o0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            o0.onActivityCreated(((Activity)b.O(a0)), bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivityDestroyed(a a0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        o o0 = w00.b0;
        if(o0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            o0.onActivityDestroyed(((Activity)b.O(a0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivityPaused(a a0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        o o0 = w00.b0;
        if(o0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            o0.onActivityPaused(((Activity)b.O(a0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivityResumed(a a0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        o o0 = w00.b0;
        if(o0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            o0.onActivityResumed(((Activity)b.O(a0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivitySaveInstanceState(a a0, U u0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        o o0 = w00.b0;
        Bundle bundle0 = new Bundle();
        if(o0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            o0.onActivitySaveInstanceState(((Activity)b.O(a0)), bundle0);
        }
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = this.d.g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning bundle value to wrapper");
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivityStarted(a a0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        if(w00.b0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            Activity activity0 = (Activity)b.O(a0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void onActivityStopped(a a0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        if(w00.b0 != null) {
            w0 w01 = this.d.n0;
            d0.g(w01);
            w01.N();
            Activity activity0 = (Activity)b.O(a0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void performAction(Bundle bundle0, U u0, long v) {
        this.c();
        u0.f(null);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void registerOnMeasurementEventListener(V v0) {
        this.c();
        synchronized(this.e) {
            Parcel parcel0 = ((X)v0).K(2, ((X)v0).b());
            int v2 = parcel0.readInt();
            parcel0.recycle();
            j6.a a0 = (j6.a)this.e.get(v2);
            if(a0 == null) {
                a0 = new j6.a(this, ((X)v0));
                Parcel parcel1 = ((X)v0).K(2, ((X)v0).b());
                int v3 = parcel1.readInt();
                parcel1.recycle();
                this.e.put(v3, a0);
            }
        }
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.u();
        if(!w00.d0.add(a0)) {
            w00.b().h0.d("OnEventListener already registered");
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void resetAnalyticsData(long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.T(null);
        w00.c().z(new E0(w00, v, 1));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setConditionalUserProperty(Bundle bundle0, long v) {
        this.c();
        if(bundle0 == null) {
            L l0 = this.d.g0;
            d0.h(l0);
            l0.e0.d("Conditional user property must not be null");
            return;
        }
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.S(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setConsent(Bundle bundle0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        a0 a00 = w00.c();
        v v1 = new v();
        v1.Z = w00;
        v1.b0 = bundle0;
        v1.Y = v;
        a00.A(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setConsentThirdParty(Bundle bundle0, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.z(bundle0, -20, v);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setCurrentScreen(a a0, String s, String s1, long v) {
        this.c();
        L0 l00 = this.d.m0;
        d0.g(l00);
        Activity activity0 = (Activity)b.O(a0);
        if(!((d0)l00.Y).e0.D()) {
            l00.b().j0.d("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        M0 m00 = l00.b0;
        if(m00 == null) {
            l00.b().j0.d("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if(l00.e0.get(activity0.hashCode()) == null) {
            l00.b().j0.d("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if(s1 == null) {
            s1 = l00.y(activity0.getClass());
        }
        if(Objects.equals(m00.b, s1) && Objects.equals(m00.a, s)) {
            l00.b().j0.d("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if(s != null) {
            if(s.length() <= 0) {
                l00.b().j0.b(s.length(), "Invalid screen name length in setCurrentScreen. Length");
                return;
            }
            ((d0)l00.Y).e0.getClass();
            if(s.length() > 500) {
                l00.b().j0.b(s.length(), "Invalid screen name length in setCurrentScreen. Length");
                return;
            }
        }
        if(s1 != null) {
            if(s1.length() <= 0) {
                l00.b().j0.b(s1.length(), "Invalid class name length in setCurrentScreen. Length");
                return;
            }
            ((d0)l00.Y).e0.getClass();
            if(s1.length() > 500) {
                l00.b().j0.b(s1.length(), "Invalid class name length in setCurrentScreen. Length");
                return;
            }
        }
        l00.b().m0.c((s == null ? "null" : s), "Setting current screen to name, class", s1);
        M0 m01 = new M0(l00.p().B0(), s, s1);
        l00.e0.put(activity0.hashCode(), m01);
        l00.A(activity0, m01, true);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setDataCollectionEnabled(boolean z) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.u();
        w00.c().z(new D0(w00, z));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setDefaultEventParameters(Bundle bundle0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        a0 a00 = w00.c();
        y0 y00 = new y0();
        y00.Z = w00;
        y00.Y = bundle1;
        a00.z(y00);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setEventInterceptor(V v0) {
        this.c();
        c c0 = new c(this, 14, v0);
        a0 a00 = this.d.h0;
        d0.h(a00);
        if(a00.B()) {
            w0 w00 = this.d.n0;
            d0.g(w00);
            w00.q();
            w00.u();
            c c1 = w00.c0;
            if(c0 != c1) {
                r.l("EventInterceptor already set.", c1 == null);
            }
            w00.c0 = c0;
            return;
        }
        a0 a01 = this.d.h0;
        d0.h(a01);
        a01.z(new z0(5, this, c0, false));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setInstanceIdProvider(Z z0) {
        this.c();
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setMeasurementEnabled(boolean z, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.u();
        w00.c().z(new z0(w00, 3, Boolean.valueOf(z)));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setMinimumSessionDuration(long v) {
        this.c();
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setSessionTimeoutDuration(long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.c().z(new E0(w00, v, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setSgtmDebugInfo(Intent intent0) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        d0 d00 = (d0)w00.Y;
        if(d00.e0.B(null, s.y0)) {
            Uri uri0 = intent0.getData();
            if(uri0 == null) {
                w00.b().k0.d("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String s = uri0.getQueryParameter("sgtm_debug_enable");
            d d0 = d00.e0;
            if(s == null || !s.equals("1")) {
                w00.b().k0.d("Preview Mode was not enabled.");
                d0.b0 = null;
            }
            else {
                String s1 = uri0.getQueryParameter("sgtm_preview_key");
                if(!TextUtils.isEmpty(s1)) {
                    w00.b().k0.b(s1, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
                    d0.b0 = s1;
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setUserId(String s, long v) {
        this.c();
        w0 w00 = this.d.n0;
        d0.g(w00);
        if(s != null && TextUtils.isEmpty(s)) {
            L l0 = ((d0)w00.Y).g0;
            d0.h(l0);
            l0.h0.d("User ID must be non-empty or null");
            return;
        }
        a0 a00 = w00.c();
        z0 z00 = new z0(1);
        z00.Y = w00;
        z00.Z = s;
        a00.z(z00);
        w00.K(null, "_id", s, true, v);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void setUserProperty(String s, String s1, a a0, boolean z, long v) {
        this.c();
        Object object0 = b.O(a0);
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.K(s, s1, object0, z, v);
    }

    @Override  // com.google.android.gms.internal.measurement.P
    public void unregisterOnMeasurementEventListener(V v0) {
        j6.a a0;
        this.c();
        synchronized(this.e) {
            Parcel parcel0 = ((X)v0).K(2, ((X)v0).b());
            int v2 = parcel0.readInt();
            parcel0.recycle();
            a0 = (j6.a)this.e.remove(v2);
        }
        if(a0 == null) {
            a0 = new j6.a(this, ((X)v0));
        }
        w0 w00 = this.d.n0;
        d0.g(w00);
        w00.u();
        if(!w00.d0.remove(a0)) {
            w00.b().h0.d("OnEventListener had not been registered");
        }
    }
}

