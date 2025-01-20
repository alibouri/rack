package M5;

import I2.e;
import K.v;
import L5.m;
import M.J;
import N5.h;
import N5.z;
import P5.b;
import S5.c;
import U5.a;
import a6.d;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o6.i;

public final class f implements Handler.Callback {
    public long a;
    public boolean b;
    public TelemetryData c;
    public b d;
    public final Context e;
    public final K5.b f;
    public final v g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public o k;
    public final s.f l;
    public final s.f m;
    public final d n;
    public volatile boolean o;
    public static final Status p;
    public static final Status q;
    public static final Object r;
    public static f s;

    static {
        f.p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
        f.q = new Status(4, "The user must be signed in to make this API call.", null, null);
        f.r = new Object();
    }

    public f(Context context0, Looper looper0) {
        this.a = 10000L;
        this.b = false;
        boolean z = true;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = null;
        this.l = new s.f(0);
        this.m = new s.f(0);
        this.o = true;
        this.e = context0;
        d d0 = new d(looper0, this);  // initializer: Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
        Looper.getMainLooper();
        this.n = d0;
        this.f = K5.b.d;
        this.g = new v(6);
        PackageManager packageManager0 = context0.getPackageManager();
        if(c.f == null) {
            if(!c.d() || !packageManager0.hasSystemFeature("android.hardware.type.automotive")) {
                z = false;
            }
            c.f = Boolean.valueOf(z);
        }
        if(c.f.booleanValue()) {
            this.o = false;
        }
        d0.sendMessage(d0.obtainMessage(6));
    }

    public final void a(o o0) {
        synchronized(f.r) {
            if(this.k != o0) {
                this.k = o0;
                this.l.clear();
            }
            this.l.addAll(o0.d0);
        }
    }

    public final boolean b() {
        if(this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration0 = h.a().a;
        if(rootTelemetryConfiguration0 != null && !rootTelemetryConfiguration0.Y) {
            return false;
        }
        switch(((SparseIntArray)this.g.Y).get(203400000, -1)) {
            case -1: 
            case 0: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final boolean c(ConnectionResult connectionResult0, int v) {
        K5.b b0 = this.f;
        b0.getClass();
        Context context0 = this.e;
        if(!a.G(context0)) {
            int v1 = connectionResult0.Y;
            PendingIntent pendingIntent0 = connectionResult0.Z;
            if(v1 == 0 || pendingIntent0 == null) {
                pendingIntent0 = null;
                Intent intent0 = b0.a(v1, context0, null);
                if(intent0 != null) {
                    pendingIntent0 = PendingIntent.getActivity(context0, 0, intent0, 0xC000000);
                }
            }
            if(pendingIntent0 != null) {
                Intent intent1 = new Intent(context0, GoogleApiActivity.class);
                intent1.putExtra("pending_intent", pendingIntent0);
                intent1.putExtra("failing_client_id", v);
                intent1.putExtra("notify_manager", true);
                b0.g(context0, v1, PendingIntent.getActivity(context0, 0, intent1, a6.c.a | 0x8000000));
                return true;
            }
        }
        return false;
    }

    public static Status d(M5.b b0, ConnectionResult connectionResult0) {
        return new Status(17, "API: " + ((String)b0.b.Z) + " is not available on this device. Connection failed with: " + connectionResult0, connectionResult0.Z, connectionResult0);
    }

    public final r e(L5.f f0) {
        ConcurrentHashMap concurrentHashMap0 = this.j;
        M5.b b0 = f0.e;
        r r0 = (r)concurrentHashMap0.get(b0);
        if(r0 == null) {
            r0 = new r(this, f0);
            concurrentHashMap0.put(b0, r0);
        }
        if(r0.e.l()) {
            this.m.add(b0);
        }
        r0.m();
        return r0;
    }

    public final void f(i i0, int v, L5.f f0) {
        o6.c c1;
        if(v != 0) {
            M5.b b0 = f0.e;
            if(this.b()) {
                RootTelemetryConfiguration rootTelemetryConfiguration0 = h.a().a;
                if(rootTelemetryConfiguration0 == null) {
                    c1 = new e(this, v, b0, System.currentTimeMillis(), SystemClock.elapsedRealtime());
                }
                else if(rootTelemetryConfiguration0.Y) {
                    r r0 = (r)this.j.get(b0);
                    if(r0 == null) {
                        c1 = new e(this, v, b0, (rootTelemetryConfiguration0.Z ? System.currentTimeMillis() : 0L), (rootTelemetryConfiguration0.Z ? SystemClock.elapsedRealtime() : 0L));
                    }
                    else {
                        L5.c c0 = r0.e;
                        if(!(c0 instanceof N5.e)) {
                            c1 = null;
                        }
                        else if(((N5.e)c0).t0 != null && !((N5.e)c0).g()) {
                            ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = e.b(r0, ((N5.e)c0), v);
                            if(connectionTelemetryConfiguration0 == null) {
                                c1 = null;
                            }
                            else {
                                ++r0.o;
                                c1 = new e(this, v, b0, (connectionTelemetryConfiguration0.Z ? System.currentTimeMillis() : 0L), (connectionTelemetryConfiguration0.Z ? SystemClock.elapsedRealtime() : 0L));
                            }
                        }
                        else {
                            c1 = new e(this, v, b0, (rootTelemetryConfiguration0.Z ? System.currentTimeMillis() : 0L), (rootTelemetryConfiguration0.Z ? SystemClock.elapsedRealtime() : 0L));
                        }
                    }
                }
                else {
                    c1 = null;
                }
            }
            else {
                c1 = null;
            }
            if(c1 != null) {
                this.n.getClass();
                p p0 = new p(0, this.n);
                i0.a.i(p0, c1);
            }
        }
    }

    public static f g(Context context0) {
        synchronized(f.r) {
            if(f.s == null) {
                Looper looper0 = z.b().getLooper();
                f.s = new f(context0.getApplicationContext(), looper0);
            }
            return f.s;
        }
    }

    public final void h(ConnectionResult connectionResult0, int v) {
        if(!this.c(connectionResult0, v)) {
            Message message0 = this.n.obtainMessage(5, v, 0, connectionResult0);
            this.n.sendMessage(message0);
        }
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        Feature feature0;
        int v = message0.what;
        d d0 = this.n;
        ConcurrentHashMap concurrentHashMap0 = this.j;
        N5.i i0 = N5.i.Y;
        long v1 = 300000L;
        switch(v) {
            case 1: {
                if(((Boolean)message0.obj).booleanValue()) {
                    v1 = 10000L;
                }
                this.a = v1;
                d0.removeMessages(12);
                for(Object object0: concurrentHashMap0.keySet()) {
                    d0.sendMessageDelayed(d0.obtainMessage(12, ((M5.b)object0)), this.a);
                }
                return true;
            }
            case 2: {
                throw v.h.c(message0.obj);
            }
            case 3: {
                for(Object object1: concurrentHashMap0.values()) {
                    N5.r.d(((r)object1).p.n);
                    ((r)object1).n = null;
                    ((r)object1).m();
                }
                return true;
            }
            case 5: {
                r r1 = null;
                int v3 = message0.arg1;
                ConnectionResult connectionResult0 = (ConnectionResult)message0.obj;
                for(Object object2: concurrentHashMap0.values()) {
                    r r2 = (r)object2;
                    if(r2.j == v3) {
                        r1 = r2;
                        break;
                    }
                }
                if(r1 != null) {
                    if(connectionResult0.Y == 13) {
                        this.f.getClass();
                        StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("Error resolution was canceled by the user, original error message: ", ConnectionResult.g(connectionResult0.Y), ": ");
                        stringBuilder0.append(connectionResult0.b0);
                        r1.d(new Status(17, stringBuilder0.toString(), null, null));
                        return true;
                    }
                    r1.d(f.d(r1.f, connectionResult0));
                    return true;
                }
                Log.wtf("GoogleApiManager", J.d(v3, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                return true;
            }
            case 6: {
                Context context0 = this.e;
                if(context0.getApplicationContext() instanceof Application) {
                    M5.d.b(((Application)context0.getApplicationContext()));
                    q q0 = new q(this);
                    M5.d.c0.a(q0);
                    AtomicBoolean atomicBoolean0 = M5.d.c0.Y;
                    boolean z1 = atomicBoolean0.get();
                    AtomicBoolean atomicBoolean1 = M5.d.c0.X;
                    if(!z1) {
                        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
                        if(!atomicBoolean0.getAndSet(true) && activityManager$RunningAppProcessInfo0.importance > 100) {
                            atomicBoolean1.set(true);
                        }
                    }
                    if(!atomicBoolean1.get()) {
                        this.a = 300000L;
                        return true;
                    }
                }
                break;
            }
            case 7: {
                this.e(((L5.f)message0.obj));
                return true;
            }
            case 9: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    r r4 = (r)concurrentHashMap0.get(message0.obj);
                    N5.r.d(r4.p.n);
                    if(r4.l) {
                        r4.m();
                        return true;
                    }
                }
                break;
            }
            case 10: {
                s.f f1 = this.m;
                f1.getClass();
                s.a a0 = new s.a(f1);
                while(a0.hasNext()) {
                    r r3 = (r)concurrentHashMap0.remove(((M5.b)a0.next()));
                    if(r3 != null) {
                        r3.q();
                    }
                }
                f1.clear();
                return true;
            }
            case 11: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    r r5 = (r)concurrentHashMap0.get(message0.obj);
                    f f2 = r5.p;
                    N5.r.d(f2.n);
                    if(r5.l) {
                        r5.p.n.removeMessages(11, r5.f);
                        r5.p.n.removeMessages(9, r5.f);
                        r5.l = false;
                        r5.d((f2.f.b(f2.e, K5.c.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null)));
                        r5.e.e("Timing out connection while resuming.");
                        return true;
                    }
                }
                break;
            }
            case 12: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    r r6 = (r)concurrentHashMap0.get(message0.obj);
                    N5.r.d(r6.p.n);
                    L5.c c0 = r6.e;
                    if(c0.a() && r6.i.isEmpty()) {
                        if(((Map)r6.g.Y).isEmpty() && ((Map)r6.g.Z).isEmpty()) {
                            c0.e("Timing out service connection.");
                            return true;
                        }
                        r6.j();
                        return true;
                    }
                }
                break;
            }
            case 4: 
            case 8: 
            case 13: {
                y y0 = (y)message0.obj;
                r r0 = (r)concurrentHashMap0.get(y0.c.e);
                if(r0 == null) {
                    r0 = this.e(y0.c);
                }
                boolean z = r0.e.l();
                F f0 = y0.a;
                if(z && this.i.get() != y0.b) {
                    f0.a(f.p);
                    r0.q();
                    return true;
                }
                r0.n(f0);
                return true;
            }
            case 14: {
                throw v.h.c(message0.obj);
            }
            case 15: {
                s s0 = (s)message0.obj;
                if(concurrentHashMap0.containsKey(s0.a)) {
                    r r7 = (r)concurrentHashMap0.get(s0.a);
                    if(r7.m.contains(s0) && !r7.l) {
                        if(!r7.e.a()) {
                            r7.m();
                            return true;
                        }
                        r7.g();
                        return true;
                    }
                }
                break;
            }
            case 16: {
                s s1 = (s)message0.obj;
                if(concurrentHashMap0.containsKey(s1.a)) {
                    r r8 = (r)concurrentHashMap0.get(s1.a);
                    if(r8.m.remove(s1)) {
                        r8.p.n.removeMessages(15, s1);
                        r8.p.n.removeMessages(16, s1);
                        LinkedList linkedList0 = r8.d;
                        ArrayList arrayList0 = new ArrayList(linkedList0.size());
                        Iterator iterator3 = linkedList0.iterator();
                        while(true) {
                            boolean z2 = iterator3.hasNext();
                            feature0 = s1.b;
                            if(!z2) {
                                break;
                            }
                            Object object3 = iterator3.next();
                            F f3 = (F)object3;
                            if(f3 instanceof w) {
                                Feature[] arr_feature = ((w)f3).g(r8);
                                if(arr_feature != null) {
                                    for(int v4 = 0; v4 < arr_feature.length; ++v4) {
                                        if(N5.r.m(arr_feature[v4], feature0)) {
                                            if(v4 < 0) {
                                                break;
                                            }
                                            arrayList0.add(f3);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int v5 = arrayList0.size();
                        for(int v2 = 0; v2 < v5; ++v2) {
                            F f4 = (F)arrayList0.get(v2);
                            linkedList0.remove(f4);
                            f4.b(new m(feature0));
                        }
                        return true;
                    }
                }
                break;
            }
            case 17: {
                TelemetryData telemetryData0 = this.c;
                if(telemetryData0 != null) {
                    if(telemetryData0.X > 0 || this.b()) {
                        if(this.d == null) {
                            this.d = new b(this.e, null, b.k, i0, L5.e.c);  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
                        }
                        this.d.d(telemetryData0);
                    }
                    this.c = null;
                    return true;
                }
                break;
            }
            case 18: {
                x x0 = (x)message0.obj;
                MethodInvocation methodInvocation0 = x0.a;
                int v6 = x0.b;
                if(Long.compare(x0.c, 0L) == 0) {
                    TelemetryData telemetryData1 = new TelemetryData(v6, Arrays.asList(new MethodInvocation[]{methodInvocation0}));
                    if(this.d == null) {
                        this.d = new b(this.e, null, b.k, i0, L5.e.c);  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
                    }
                    this.d.d(telemetryData1);
                    return true;
                }
                TelemetryData telemetryData2 = this.c;
                if(telemetryData2 != null) {
                    if(telemetryData2.X != v6 || telemetryData2.Y != null && telemetryData2.Y.size() >= x0.d) {
                        d0.removeMessages(17);
                        TelemetryData telemetryData4 = this.c;
                        if(telemetryData4 != null) {
                            if(telemetryData4.X > 0 || this.b()) {
                                if(this.d == null) {
                                    this.d = new b(this.e, null, b.k, i0, L5.e.c);  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
                                }
                                this.d.d(telemetryData4);
                            }
                            this.c = null;
                        }
                    }
                    else {
                        TelemetryData telemetryData3 = this.c;
                        if(telemetryData3.Y == null) {
                            telemetryData3.Y = new ArrayList();
                        }
                        telemetryData3.Y.add(methodInvocation0);
                    }
                }
                if(this.c == null) {
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(methodInvocation0);
                    this.c = new TelemetryData(v6, arrayList1);
                    d0.sendMessageDelayed(d0.obtainMessage(17), x0.c);
                    return true;
                }
                break;
            }
            case 19: {
                this.b = false;
                return true;
            }
            default: {
                Log.w("GoogleApiManager", "Unknown message id: " + v);
                return false;
            }
        }
        return true;
    }
}

