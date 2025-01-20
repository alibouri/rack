package E7;

import I2.p;
import I2.t;
import R2.m;
import Xb.H;
import Xb.I;
import Xb.J;
import Xb.q0;
import Xb.r0;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b4.A0;
import com.google.firebase.messaging.FirebaseMessaging;
import f1.j;
import f1.n;
import io.sentry.E1;
import io.sentry.F1;
import io.sentry.G1;
import io.sentry.H1;
import io.sentry.J0;
import io.sentry.J1;
import io.sentry.K0;
import io.sentry.M;
import io.sentry.S;
import io.sentry.T1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.d1;
import io.sentry.i1;
import io.sentry.protocol.u;
import io.sentry.x;
import io.sentry.y1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o6.a;
import o6.g;
import r5.i;
import r5.k;
import u5.c;
import u5.d;
import u5.e;
import y5.f;
import y5.h;
import z5.b;

public final class s implements j, J0, J1, K0, a, g, f, b {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;

    public s(Object object0, Object object1, Object object2, int v) {
        this.X = v;
        this.Z = object0;
        this.Y = object1;
        this.b0 = object2;
        super();
    }

    public s(CoroutineContext coroutineContext0, I i0, Function2 function20) {
        this.X = 2;
        super();
        this.Z = coroutineContext0;
        this.Y = i0;
        this.b0 = (Fb.j)function20;
    }

    @Override  // z5.b
    public Object a() {
        w5.a a0 = (w5.a)this.Z;
        h h0 = (h)a0.d;
        h0.getClass();
        i i0 = (i)this.Y;
        r5.h h1 = (r5.h)this.b0;
        String s = android.support.v4.media.session.a.F("SQLiteEventStore");
        if(Log.isLoggable(s, 3)) {
            Log.d(s, "Storing event with priority=" + i0.c + ", name=" + h1.a + " for destination " + i0.a);
        }
        ((Long)h0.f(new s(h0, h1, i0, 9))).getClass();
        a0.a.a(i0, 1, false);
        return null;
    }

    @Override  // y5.f
    public Object apply(Object object0) {
        u5.g g0;
        c c3;
        c c2;
        byte[] arr_b3;
        h h1;
        long v7;
        c c0 = c.b0;
        Object object1 = this.b0;
        Object object2 = this.Y;
        Object object3 = this.Z;
        switch(this.X) {
            case 9: {
                long v5 = ((h)object3).a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                long v6 = ((h)object3).a().compileStatement("PRAGMA page_size").simpleQueryForLong();
                y5.a a0 = ((h)object3).b0;
                String s1 = ((r5.h)object2).a;
                if(Long.compare(v6 * v5, a0.a) >= 0) {
                    ((h)object3).l(1L, c0, s1);
                    return -1L;
                }
                Long long0 = h.b(((SQLiteDatabase)object0), ((i)object1));
                if(long0 == null) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("backend_name", ((i)object1).a);
                    contentValues0.put("priority", B5.a.a(((i)object1).c));
                    contentValues0.put("next_request_ms", 0);
                    byte[] arr_b = ((i)object1).b;
                    if(arr_b != null) {
                        contentValues0.put("extras", Base64.encodeToString(arr_b, 0));
                    }
                    v7 = ((SQLiteDatabase)object0).insert("transport_contexts", null, contentValues0);
                }
                else {
                    v7 = (long)long0;
                }
                byte[] arr_b1 = ((r5.h)object2).c.b;
                int v8 = a0.e;
                boolean z = arr_b1.length <= v8;
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("context_id", v7);
                contentValues1.put("transport_name", s1);
                contentValues1.put("timestamp_ms", ((long)((r5.h)object2).d));
                contentValues1.put("uptime_ms", ((long)((r5.h)object2).e));
                contentValues1.put("payload_encoding", ((r5.h)object2).c.a.a);
                contentValues1.put("code", ((r5.h)object2).b);
                contentValues1.put("num_attempts", 0);
                contentValues1.put("inline", Boolean.valueOf(z));
                contentValues1.put("payload", (z ? arr_b1 : new byte[0]));
                long v9 = ((SQLiteDatabase)object0).insert("events", null, contentValues1);
                if(!z) {
                    int v10 = (int)Math.ceil(((double)arr_b1.length) / ((double)v8));
                    for(int v11 = 1; v11 <= v10; ++v11) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("event_id", v9);
                        contentValues2.put("sequence_num", v11);
                        contentValues2.put("bytes", Arrays.copyOfRange(arr_b1, (v11 - 1) * v8, Math.min(v11 * v8, arr_b1.length)));
                        ((SQLiteDatabase)object0).insert("event_payloads", null, contentValues2);
                    }
                }
                for(Object object5: Collections.unmodifiableMap(((r5.h)object2).f).entrySet()) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("event_id", v9);
                    contentValues3.put("name", ((String)((Map.Entry)object5).getKey()));
                    contentValues3.put("value", ((String)((Map.Entry)object5).getValue()));
                    ((SQLiteDatabase)object0).insert("event_metadata", null, contentValues3);
                }
                return v9;
            }
            case 10: {
                h h0 = (h)object3;
                h0.getClass();
                while(((Cursor)object0).moveToNext()) {
                    long v12 = ((Cursor)object0).getLong(0);
                    boolean z1 = ((Cursor)object0).getInt(7) != 0;
                    A0 a00 = new A0(6);
                    a00.g = new HashMap();
                    String s2 = ((Cursor)object0).getString(1);
                    if(s2 == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    a00.b = s2;
                    a00.e = ((Cursor)object0).getLong(2);
                    a00.f = ((Cursor)object0).getLong(3);
                    if(z1) {
                        String s3 = ((Cursor)object0).getString(4);
                        a00.d = new k((s3 == null ? h.d0 : new o5.c(s3)), ((Cursor)object0).getBlob(5));
                        h1 = h0;
                    }
                    else {
                        String s4 = ((Cursor)object0).getString(4);
                        o5.c c4 = s4 == null ? h.d0 : new o5.c(s4);
                        Cursor cursor1 = h0.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(v12)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList0 = new ArrayList();
                            int v13;
                            for(v13 = 0; cursor1.moveToNext(); v13 += arr_b2.length) {
                                byte[] arr_b2 = cursor1.getBlob(0);
                                arrayList0.add(arr_b2);
                            }
                            arr_b3 = new byte[v13];
                            int v14 = 0;
                            int v15 = 0;
                            while(v14 < arrayList0.size()) {
                                byte[] arr_b4 = (byte[])arrayList0.get(v14);
                                System.arraycopy(arr_b4, 0, arr_b3, v15, arr_b4.length);
                                v15 += arr_b4.length;
                                ++v14;
                                arrayList0 = arrayList0;
                                h0 = h0;
                            }
                        }
                        catch(Throwable throwable1) {
                            TWR.safeClose$NT(cursor1, throwable1);
                            throw throwable1;
                        }
                        h1 = h0;
                        cursor1.close();
                        a00.d = new k(c4, arr_b3);
                    }
                    if(!((Cursor)object0).isNull(6)) {
                        a00.c = ((Cursor)object0).getInt(6);
                    }
                    ((ArrayList)object2).add(new y5.b(v12, ((i)object1), a00.f()));
                    h0 = h1;
                }
                return null;
            }
            default: {
                ((h)object3).getClass();
                while(((Cursor)object0).moveToNext()) {
                    String s = ((Cursor)object0).getString(0);
                    int v = ((Cursor)object0).getInt(1);
                    c c1 = c.Y;
                    switch(v) {
                        case 0: {
                        label_15:
                            c2 = c0;
                            c3 = c1;
                            break;
                        }
                        case 1: {
                            c2 = c0;
                            c3 = c.Z;
                            break;
                        }
                        case 2: {
                            c3 = c0;
                            c2 = c3;
                            break;
                        }
                        case 3: {
                            c2 = c0;
                            c3 = c.c0;
                            break;
                        }
                        case 4: {
                            c2 = c0;
                            c3 = c.d0;
                            break;
                        }
                        case 5: {
                            c2 = c0;
                            c3 = c.e0;
                            break;
                        }
                        default: {
                            if(v == 6) {
                                c1 = c.f0;
                            }
                            else {
                                android.support.v4.media.session.a.w("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", v);
                            }
                            goto label_15;
                        }
                    }
                    long v1 = ((Cursor)object0).getLong(2);
                    if(!((HashMap)object2).containsKey(s)) {
                        ((HashMap)object2).put(s, new ArrayList());
                    }
                    ((List)((HashMap)object2).get(s)).add(new d(v1, c3));
                    c0 = c2;
                }
                for(Object object4: ((HashMap)object2).entrySet()) {
                    new ArrayList();
                    e e0 = new e(((String)((Map.Entry)object4).getKey()), Collections.unmodifiableList(((List)((Map.Entry)object4).getValue())));
                    ((ArrayList)((m)object1).Y).add(e0);
                }
                long v2 = ((h)object3).Y.j();
                SQLiteDatabase sQLiteDatabase0 = ((h)object3).a();
                sQLiteDatabase0.beginTransaction();
                try {
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursor0.moveToNext();
                        g0 = new u5.g(cursor0.getLong(0), v2);
                    }
                    catch(Throwable throwable0) {
                        cursor0.close();
                        throw throwable0;
                    }
                    cursor0.close();
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                ((m)object1).X = g0;
                long v4 = ((h)object3).a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ((m)object1).Z = new u5.b(new u5.f(((h)object3).a().compileStatement("PRAGMA page_size").simpleQueryForLong() * v4, y5.a.f.a));
                ((m)object1).b0 = (String)((h)object3).c0.get();
                return new u5.a(((u5.g)((m)object1).X), Collections.unmodifiableList(((ArrayList)((m)object1).Y)), ((u5.b)((m)object1).Z), ((String)((m)object1).b0));
            }
        }
    }

    @Override  // io.sentry.J0
    public void b(G1 g10) {
        boolean z = false;
        C c0 = (C)this.Z;
        if(g10 == null) {
            ((y1)c0.X).getLogger().h(i1.INFO, "Session is null on scope.withSession", new Object[0]);
        }
        else {
            c0.getClass();
            d1 d10 = (d1)this.Y;
            String s = null;
            F1 f10 = d10.c() == null ? F1.Crashed : null;
            if(F1.Crashed == f10 || d10.d()) {
                z = true;
            }
            String s1 = d10.b0 == null || (d10.b0.d0 == null || !d10.b0.d0.containsKey("user-agent")) ? null : ((String)d10.b0.d0.get("user-agent"));
            Object object0 = W5.f.E(((x)this.b0));
            if(object0 instanceof io.sentry.hints.a) {
                s = ((io.sentry.hints.a)object0).d();
                f10 = F1.Abnormal;
            }
            if(g10.c(f10, s1, z, s) && g10.e0 != F1.Ok) {
                g10.b(N4.j.q());
            }
        }
    }

    @Override  // io.sentry.K0
    public void f(S s0) {
        S s1 = (S)this.b0;
        io.sentry.android.core.internal.gestures.f f0 = (io.sentry.android.core.internal.gestures.f)this.Z;
        if(s0 == null) {
            f0.getClass();
            ((M)this.Y).n(s1);
            return;
        }
        Object[] arr_object = {s1.getName()};
        f0.c.getLogger().h(i1.DEBUG, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there.", arr_object);
    }

    @Override  // io.sentry.J1
    public void g(H1 h10) {
        E1 e10 = (E1)this.Z;
        J1 j10 = (J1)this.Y;
        AtomicReference atomicReference0 = (AtomicReference)this.b0;
        if(j10 != null) {
            e10.getClass();
            j10.g(h10);
        }
        io.sentry.android.core.f f0 = e10.r.g;
        if(f0 != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration0 = (ActivityLifecycleIntegration)f0.X;
            String s = (String)f0.Z;
            activityLifecycleIntegration0.getClass();
            Activity activity0 = (Activity)((WeakReference)f0.Y).get();
            if(activity0 == null) {
                SentryAndroidOptions sentryAndroidOptions0 = activityLifecycleIntegration0.b0;
                if(sentryAndroidOptions0 != null) {
                    sentryAndroidOptions0.getLogger().h(i1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", new Object[]{s});
                }
            }
            else {
                C3.i i0 = activityLifecycleIntegration0.o0;
                u u0 = e10.a;
                __monitor_enter(i0);
                int v = FIN.finallyOpen$NT();
                if(i0.w()) {
                    io.sentry.android.core.c c0 = null;
                    i0.C(null, new io.sentry.android.core.b(i0, activity0, 1));
                    io.sentry.android.core.c c1 = (io.sentry.android.core.c)((WeakHashMap)i0.b0).remove(activity0);
                    if(c1 != null) {
                        io.sentry.android.core.c c2 = i0.l();
                        if(c2 != null) {
                            c0 = new io.sentry.android.core.c(c2.a - c1.a, c2.b - c1.b, c2.c - c1.c);
                        }
                    }
                    if(c0 != null) {
                        int v1 = c0.a;
                        if(v1 != 0 || c0.b != 0 || c0.c != 0) {
                            HashMap hashMap0 = new HashMap();
                            hashMap0.put("frames_total", new io.sentry.protocol.j(v1, "none"));
                            hashMap0.put("frames_slow", new io.sentry.protocol.j(((int)c0.b), "none"));
                            hashMap0.put("frames_frozen", new io.sentry.protocol.j(((int)c0.c), "none"));
                            ((ConcurrentHashMap)i0.Z).put(u0, hashMap0);
                        }
                    }
                    FIN.finallyExec$NT(v);
                }
                else {
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(i0);
                    FIN.finallyCodeEnd$NT(v);
                }
            }
        }
        T1 t10 = e10.q;
        if(t10 != null) {
            atomicReference0.set(t10.g(e10));
        }
    }

    @Override  // f1.j
    public Object h(f1.i i0) {
        if(this.X != 1) {
            CoroutineContext coroutineContext0 = (CoroutineContext)this.Z;
            D d0 = new D(4, ((r0)coroutineContext0.l(q0.X)));
            p p0 = p.X;
            n n0 = i0.c;
            if(n0 != null) {
                n0.a(d0, p0);
            }
            dc.e e0 = H.a(coroutineContext0);
            t t0 = new t(((Function2)(((Fb.j)this.b0))), i0, null);
            return J.q(e0, null, ((I)this.Y), t0, 1);
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        I2.s s0 = new I2.s(atomicBoolean0, 0);
        p p1 = p.X;
        n n1 = i0.c;
        if(n1 != null) {
            n1.a(s0, p1);
        }
        E7.h h0 = new E7.h(atomicBoolean0, i0, ((Function0)this.b0), 1);
        ((Executor)this.Z).execute(h0);
        return (String)this.Y;
    }

    @Override  // o6.g
    public o6.p i(Object object0) {
        FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)this.Z;
        String s = (String)this.Y;
        E e0 = (E)this.b0;
        F f0 = FirebaseMessaging.d(firebaseMessaging0.b);
        String s1 = firebaseMessaging0.e();
        String s2 = firebaseMessaging0.h.b();
        synchronized(f0) {
            String s3 = E.a(System.currentTimeMillis(), ((String)object0), s2);
            if(s3 != null) {
                SharedPreferences.Editor sharedPreferences$Editor0 = f0.a.edit();
                sharedPreferences$Editor0.putString(F.a(s1, s), s3);
                sharedPreferences$Editor0.commit();
            }
        }
        if(e0 == null || !((String)object0).equals(e0.a)) {
            Z6.g g0 = firebaseMessaging0.a;
            g0.a();
            if("[DEFAULT]".equals(g0.b)) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    g0.a();
                    Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + g0.b);
                }
                Intent intent0 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent0.putExtra("token", ((String)object0));
                new E7.m(firebaseMessaging0.b).b(intent0);
            }
        }
        return o6.k.e(((String)object0));
    }

    @Override  // o6.a
    public Object j(o6.h h0) {
        URL uRL0;
        if(this.X != 3) {
            W7.m m0 = (W7.m)this.Z;
            m0.getClass();
            o6.p p0 = (o6.p)this.Y;
            if(!p0.h()) {
                return o6.k.d(new V7.c("Firebase Installations failed to get installation auth token for config update listener connection.", p0.e()));  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            o6.p p1 = (o6.p)this.b0;
            if(!p1.h()) {
                return o6.k.d(new V7.c("Firebase Installations failed to get installation ID for config update listener connection.", p1.e()));  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            try {
                try {
                    uRL0 = new URL(m0.c(m0.l));
                }
                catch(MalformedURLException unused_ex) {
                    Log.e("FirebaseRemoteConfig", "URL is malformed");
                    uRL0 = null;
                }
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                String s = ((y7.a)p0.f()).a;
                m0.j(httpURLConnection0, ((String)p1.f()), s);
                return o6.k.e(httpURLConnection0);
            }
            catch(IOException iOException0) {
                return o6.k.d(new V7.c("Failed to open HTTP stream connection", iOException0));  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
        }
        V7.b b0 = (V7.b)this.Z;
        b0.getClass();
        o6.h h1 = (o6.h)this.Y;
        if(h1.h() && h1.f() != null) {
            W7.e e0 = (W7.e)h1.f();
            o6.h h2 = (o6.h)this.b0;
            if(h2.h()) {
                W7.e e1 = (W7.e)h2.f();
                if(e1 != null && e0.c.equals(e1.c)) {
                    return o6.k.e(Boolean.FALSE);
                }
            }
            b0.d.getClass();
            E7.j j0 = new E7.j(b0.d, 2, e0);
            o6.p p2 = o6.k.c(b0.d.a, j0);
            E7.g g0 = new E7.g(b0.d, 6, e0);
            o6.p p3 = p2.m(b0.d.a, g0);
            V7.a a0 = new V7.a(b0);
            return p3.l(b0.b, a0);
        }
        return o6.k.e(Boolean.FALSE);
    }
}

