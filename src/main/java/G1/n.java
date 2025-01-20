package G1;

import G3.b;
import I2.A;
import I3.q;
import I5.h;
import J5.j;
import N5.r;
import a8.Q;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import com.google.android.material.appbar.AppBarLayout.BaseBehavior;
import com.google.android.material.appbar.AppBarLayout;
import i.s;
import j6.C;
import j6.J0;
import j6.K0;
import j6.L;
import j6.O;
import j6.P0;
import j6.Y;
import j6.a0;
import j6.b1;
import j6.d0;
import j6.h0;
import j6.k1;
import j6.p0;
import j6.t0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o6.k;
import o6.p;

public final class n implements Runnable {
    public final int X;
    public Object Y;
    public Object Z;
    public Object b0;

    public n(int v) {
        this.X = v;
        super();
    }

    public n(int v, Object object0, Object object1, Object object2, boolean z) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        super();
    }

    public n(J0 j00, String s, URL uRL0, s s1) {
        this.X = 8;
        super();
        this.b0 = j00;
        r.f(s);
        this.Y = uRL0;
        this.Z = s1;
    }

    public n(Object object0, Object object1, Object object2, int v) {
        this.X = v;
        this.b0 = object0;
        this.Y = object1;
        this.Z = object2;
        super();
    }

    private final void a() {
        byte[] arr_b;
        Map map0;
        HttpURLConnection httpURLConnection0;
        Throwable throwable1;
        IOException iOException1;
        URL uRL0;
        a0 a00 = ((d0)((J0)this.b0).Y).h0;
        d0.h(a00);
        a00.C();
        int v = 0;
        try {
            uRL0 = (URL)this.Y;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            httpURLConnection0 = null;
            map0 = null;
            goto label_40;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            httpURLConnection0 = null;
            map0 = null;
            goto label_45;
        }
        try {
            URLConnection uRLConnection0 = uRL0.openConnection();
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            httpURLConnection0.setDefaultUseCaches(false);
            httpURLConnection0.setConnectTimeout(60000);
            httpURLConnection0.setReadTimeout(61000);
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setDoInput(true);
            v = httpURLConnection0.getResponseCode();
            map0 = null;
            map0 = httpURLConnection0.getHeaderFields();
            arr_b = J0.u(httpURLConnection0);
            goto label_49;
        }
        catch(IOException iOException1) {
            httpURLConnection0 = null;
            map0 = null;
            goto label_40;
        }
        catch(Throwable throwable1) {
        }
        httpURLConnection0 = null;
        map0 = null;
        goto label_45;
        try {
            v = httpURLConnection0.getResponseCode();
            map0 = null;
            map0 = httpURLConnection0.getHeaderFields();
            arr_b = J0.u(httpURLConnection0);
            goto label_49;
        }
        catch(IOException iOException1) {
            map0 = null;
            goto label_40;
            try {
                arr_b = J0.u(httpURLConnection0);
                goto label_49;
            }
            catch(IOException iOException1) {
            }
            catch(Throwable throwable1) {
                goto label_45;
            }
        label_40:
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            this.c(v, iOException1, null, map0);
            return;
        }
        catch(Throwable throwable1) {
        }
    label_45:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.c(v, null, null, map0);
        throw throwable1;
    label_49:
        httpURLConnection0.disconnect();
        this.c(v, null, arr_b, map0);
    }

    private final void b() {
        AtomicReference atomicReference0 = (AtomicReference)this.Y;
        __monitor_enter(atomicReference0);
        try {
            if(((P0)this.b0).o().A().i(p0.Z)) {
                P0 p00 = (P0)this.b0;
                C c0 = p00.c0;
                if(c0 != null) {
                    ((AtomicReference)this.Y).set(c0.x(((zzo)this.Z)));
                    String s = (String)((AtomicReference)this.Y).get();
                    if(s != null) {
                        ((P0)this.b0).r().T(s);
                        ((P0)this.b0).o().g0.y(s);
                    }
                    ((P0)this.b0).I();
                    goto label_24;
                }
                p00.b().e0.d("Failed to get app instance id");
                goto label_14;
            }
            goto label_17;
        }
        catch(RemoteException remoteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        try {
        label_14:
            ((AtomicReference)this.Y).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
            try {
            label_17:
                ((P0)this.b0).b().j0.d("Analytics storage consent denied; will not get app instance id");
                ((P0)this.b0).r().T(null);
                ((P0)this.b0).o().g0.y(null);
                ((AtomicReference)this.Y).set(null);
                goto label_30;
            }
            catch(RemoteException remoteException0) {
            label_23:
                ((P0)this.b0).b().e0.b(remoteException0, "Failed to get app instance id");
            }
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        try {
        label_24:
            ((AtomicReference)this.Y).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
        label_28:
            ((AtomicReference)this.Y).notify();
            throw throwable0;
        label_30:
            ((AtomicReference)this.Y).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }

    public void c(int v, IOException iOException0, byte[] arr_b, Map map0) {
        a0 a00 = ((J0)this.b0).c();
        K0 k00 = new K0(0);
        k00.Z = this;
        k00.Y = v;
        k00.b0 = iOException0;
        k00.c0 = arr_b;
        a00.z(k00);
    }

    @Override
    public final void run() {
        int v1;
        b b2;
        boolean z5;
        p p0;
        Object object0;
        switch(this.X) {
            case 0: {
                try {
                    object0 = null;
                    object0 = ((f)this.Y).call();
                }
                catch(Exception unused_ex) {
                }
                Y6.b b1 = new Y6.b(((g)this.Z), 2, object0);
                ((Handler)this.b0).post(b1);
                return;
            }
            case 1: {
                I3.g g0 = (I3.g)this.Y;
                if(!q.c(g0.d)) {
                    String s = (String)this.Z;
                    g0.f = s;
                    ((I3.g)this.b0).c.h0("user_id", s);
                    ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = ((ReentrantReadWriteLock)g0.K.a.X).readLock();
                    reentrantReadWriteLock$ReadLock0.lock();
                    try {
                        b2 = (b)g0.K.a.Y;
                    }
                    finally {
                        reentrantReadWriteLock$ReadLock0.unlock();
                    }
                    g0.K.a.P(new b(b2.c, s, b2.b));
                }
                return;
            }
            case 2: {
                CloudMessage cloudMessage0 = (CloudMessage)this.Z;
                Intent intent0 = cloudMessage0.X;
                String s1 = intent0.getStringExtra("google.message_id");
                if(s1 == null) {
                    s1 = intent0.getStringExtra("message_id");
                }
                Integer integer0 = null;
                if(TextUtils.isEmpty(s1)) {
                    p0 = k.e(null);
                }
                else {
                    Bundle bundle0 = new Bundle();
                    Intent intent1 = cloudMessage0.X;
                    String s2 = intent1.getStringExtra("google.message_id");
                    if(s2 == null) {
                        s2 = intent1.getStringExtra("message_id");
                    }
                    bundle0.putString("google.message_id", s2);
                    Intent intent2 = cloudMessage0.X;
                    if(intent2.hasExtra("google.product_id")) {
                        integer0 = intent2.getIntExtra("google.product_id", 0);
                    }
                    if(integer0 != null) {
                        bundle0.putInt("google.product_id", ((int)integer0));
                    }
                    bundle0.putBoolean("supports_message_handled", true);
                    J5.k k0 = J5.k.f(((Context)this.Y));
                    synchronized(k0) {
                        v1 = k0.b;
                        k0.b = v1 + 1;
                    }
                    p0 = k0.g(new j(v1, 2, bundle0, 0));
                }
                h h0 = new h(8, ((CountDownLatch)this.b0));
                p0.i(J5.f.Y, h0);
                return;
            }
            case 3: {
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = (BroadcastReceiver.PendingResult)this.b0;
                Context context0 = (Context)this.Z;
                Intent intent3 = (Intent)this.Y;
                try {
                    boolean z1 = intent3.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean z2 = intent3.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean z3 = intent3.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean z4 = intent3.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    A.e().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + z1 + "), BatteryChargingProxy (" + z2 + "), StorageNotLowProxy (" + z3 + "), NetworkStateProxy (" + z4 + "), ");
                    S2.f.a(context0, ConstraintProxy.BatteryNotLowProxy.class, z1);
                    S2.f.a(context0, ConstraintProxy.BatteryChargingProxy.class, z2);
                    S2.f.a(context0, ConstraintProxy.StorageNotLowProxy.class, z3);
                    S2.f.a(context0, ConstraintProxy.NetworkStateProxy.class, z4);
                }
                finally {
                    broadcastReceiver$PendingResult0.finish();
                }
                return;
            }
            case 4: {
                h0 h00 = (h0)this.b0;
                h00.d.d0();
                zzae zzae0 = (zzae)this.Y;
                Object object1 = zzae0.Z.zza();
                zzo zzo0 = (zzo)this.Z;
                if(object1 == null) {
                    h00.d.q(zzae0, zzo0);
                    return;
                }
                h00.d.J(zzae0, zzo0);
                return;
            }
            case 5: {
                h0 h01 = (h0)this.b0;
                h01.getClass();
                zzbf zzbf0 = (zzbf)this.Y;
                k1 k10 = h01.d;
                if("_cmp".equals(zzbf0.X)) {
                    zzbe zzbe0 = zzbf0.Y;
                    if(zzbe0 != null) {
                        Bundle bundle1 = zzbe0.X;
                        if(bundle1.size() != 0) {
                            String s3 = bundle1.getString("_cis");
                            if("referrer broadcast".equals(s3) || "referrer API".equals(s3)) {
                                k10.b().k0.b(zzbf0.toString(), "Event has been filtered ");
                                zzbf0 = new zzbf("_cmpx", zzbf0.Y, zzbf0.Z, zzbf0.b0);
                            }
                        }
                    }
                }
                String s4 = zzbf0.X;
                Y y0 = k10.X;
                O o0 = k10.e0;
                k1.v(y0);
                zzo zzo1 = (zzo)this.Z;
                String s5 = zzo1.X;
                if(TextUtils.isEmpty(s5)) {
                    h01.L(zzbf0, zzo1);
                }
                else {
                    I0 i00 = (I0)y0.g0.get(s5);
                    if(i00 == null || i00.o() == 0) {
                        h01.L(zzbf0, zzo1);
                        return;
                    }
                    L l0 = k10.b();
                    String s6 = zzo1.X;
                    l0.m0.b(s6, "EES config found for");
                    k1.v(k10.X);
                    w w0 = TextUtils.isEmpty(s6) ? null : ((w)k10.X.i0.h(s6));
                    if(w0 == null) {
                        k10.b().m0.b(s6, "EES not loaded for");
                        h01.L(zzbf0, zzo1);
                        return;
                    }
                    try {
                        k1.v(o0);
                        HashMap hashMap0 = O.K(zzbf0.Y.l(), true);
                        z5 = w0.b(new c((t0.c(s4, t0.c, t0.a) == null ? s4 : t0.c(s4, t0.c, t0.a)), zzbf0.b0, hashMap0));
                    }
                    catch(J unused_ex) {
                        k10.b().e0.c(zzo1.Y, "EES error. appId, eventName", s4);
                        z5 = false;
                    }
                    if(!z5) {
                        k10.b().m0.b(s4, "EES was not applied to event");
                        h01.L(zzbf0, zzo1);
                        return;
                    }
                    boolean z6 = ((c)w0.c.Z).equals(((c)w0.c.Y));
                    Q q0 = w0.c;
                    if(z6) {
                        h01.L(zzbf0, zzo1);
                    }
                    else {
                        k10.b().m0.b(s4, "EES edited event");
                        k1.v(o0);
                        h01.L(O.F(((c)q0.Z)), zzo1);
                    }
                    if(!((ArrayList)w0.c.b0).isEmpty()) {
                        for(Object object2: ((ArrayList)q0.b0)) {
                            k10.b().m0.b(((c)object2).a, "EES logging created event");
                            k1.v(o0);
                            h01.L(O.F(((c)object2)), zzo1);
                        }
                        return;
                    }
                }
                return;
            }
            case 6: {
                h0 h02 = (h0)this.b0;
                h02.d.d0();
                h02.d.s(((zzbf)this.Y), ((String)this.Z));
                return;
            }
            case 7: {
                h0 h03 = (h0)this.b0;
                h03.d.d0();
                zzon zzon0 = (zzon)this.Y;
                Object object3 = zzon0.zza();
                zzo zzo2 = (zzo)this.Z;
                if(object3 == null) {
                    h03.d.y(zzon0.Y, zzo2);
                    return;
                }
                h03.d.t(zzon0, zzo2);
                return;
            }
            case 8: {
                this.a();
                return;
            }
            case 9: {
                this.b();
                return;
            }
            case 10: {
                zzo zzo3 = (zzo)this.Y;
                U u0 = (U)this.Z;
                P0 p00 = (P0)this.b0;
                String s7 = null;
                try {
                    if(p00.o().A().i(p0.Z)) {
                        C c0 = p00.c0;
                        if(c0 != null) {
                            s7 = c0.x(zzo3);
                            if(s7 != null) {
                                p00.r().T(s7);
                                p00.o().g0.y(s7);
                            }
                            p00.I();
                            goto label_184;
                        }
                        goto label_186;
                    }
                    goto label_189;
                }
                catch(RemoteException remoteException0) {
                    goto label_194;
                }
                catch(Throwable throwable0) {
                    p00.p().T(s7, u0);
                    throw throwable0;
                }
            label_184:
                p00.p().T(s7, u0);
                return;
                try {
                label_186:
                    p00.b().e0.d("Failed to get app instance id");
                }
                catch(RemoteException remoteException0) {
                    goto label_194;
                }
                catch(Throwable throwable0) {
                    p00.p().T(s7, u0);
                    throw throwable0;
                }
                p00.p().T(null, u0);
                return;
                try {
                    try {
                    label_189:
                        p00.b().j0.d("Analytics storage consent denied; will not get app instance id");
                        p00.r().T(null);
                        p00.o().g0.y(null);
                        goto label_200;
                    }
                    catch(RemoteException remoteException0) {
                    }
                label_194:
                    p00.b().e0.b(remoteException0, "Failed to get app instance id");
                }
                catch(Throwable throwable0) {
                    p00.p().T(s7, u0);
                    throw throwable0;
                }
                p00.p().T(s7, u0);
                return;
            label_200:
                p00.p().T(null, u0);
                return;
            }
            case 11: {
                zzo zzo4 = (zzo)this.Y;
                P0 p01 = (P0)this.b0;
                C c1 = p01.c0;
                if(c1 == null) {
                    p01.b().e0.d("Failed to send default event parameters to service");
                    return;
                }
                try {
                    c1.d(((Bundle)this.Z), zzo4);
                }
                catch(RemoteException remoteException1) {
                    p01.b().e0.b(remoteException1, "Failed to send default event parameters to service");
                }
                return;
            }
            case 12: {
                i.J j0 = (i.J)this.Y;
                ((L)this.Z).m0.d("AppMeasurementJobService processed last upload request.");
                ((b1)(((Service)j0.Y))).c(((JobParameters)this.b0));
                return;
            }
            default: {
                View view0 = (View)this.Z;
                if(view0 != null) {
                    r6.b b0 = (r6.b)this.b0;
                    OverScroller overScroller0 = b0.d;
                    if(overScroller0 != null) {
                        boolean z = overScroller0.computeScrollOffset();
                        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.Y;
                        if(z) {
                            b0.v(coordinatorLayout0, view0, b0.d.getCurrY(), 0x80000000, 0x7FFFFFFF);
                            view0.postOnAnimation(this);
                            return;
                        }
                        ((BaseBehavior)b0).z(coordinatorLayout0, ((AppBarLayout)view0));
                        if(((AppBarLayout)view0).k0) {
                            ((AppBarLayout)view0).d(((AppBarLayout)view0).e(BaseBehavior.x(coordinatorLayout0)));
                        }
                    }
                }
            }
        }
    }
}

