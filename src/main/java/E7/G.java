package E7;

import Ab.t;
import I2.p;
import M4.B;
import M4.l;
import N4.u;
import V4.k;
import a5.m;
import a8.Q;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import b4.A0;
import com.google.firebase.FirebaseCommonRegistrar;
import f1.j;
import f1.n;
import io.sentry.E1;
import io.sentry.I0;
import io.sentry.K0;
import io.sentry.M0;
import io.sentry.M;
import io.sentry.S;
import io.sentry.b0;
import io.sentry.h0;
import io.sentry.protocol.F;
import io.sentry.y1;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import m7.e;
import m7.r;
import o5.d;
import o6.a;
import o6.c;
import r5.i;
import x5.h;
import y5.f;
import z5.b;

public final class g implements k, j, I0, K0, M0, b0, e, a, c, o6.g, f, b {
    public final int X;
    public final Object Y;
    public final Object Z;

    public g(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    public g(ExecutorService executorService0, Function0 function00) {
        this.X = 2;
        super();
        this.Y = executorService0;
        this.Z = (Nb.k)function00;
    }

    @Override  // z5.b
    public Object a() {
        if(this.X != 21) {
            h h0 = (h)this.Y;
            h0.getClass();
            for(Object object0: ((HashMap)this.Z).entrySet()) {
                long v = (long)(((int)(((Integer)((Map.Entry)object0).getValue()))));
                String s = (String)((Map.Entry)object0).getKey();
                ((y5.h)h0.i).l(v, u5.c.e0, s);
            }
            return null;
        }
        y5.h h1 = (y5.h)((h)this.Y).c;
        h1.getClass();
        Iterable iterable0 = (Iterable)this.Z;
        if(iterable0.iterator().hasNext()) {
            h1.a().compileStatement("DELETE FROM events WHERE _id in " + y5.h.r(iterable0)).execute();
        }
        return null;
    }

    @Override  // y5.f
    public Object apply(Object object0) {
        y5.h h0 = (y5.h)this.Y;
        y5.a a0 = h0.b0;
        i i0 = (i)this.Z;
        Object object1 = h0.h(((SQLiteDatabase)object0), i0, a0.b);
        d[] arr_d = d.values();
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            if(d0 != i0.c) {
                int v1 = a0.b - ((ArrayList)object1).size();
                if(v1 <= 0) {
                    break;
                }
                Q q0 = i.a();
                q0.O(i0.a);
                if(d0 == null) {
                    throw new NullPointerException("Null priority");
                }
                q0.b0 = d0;
                q0.Z = i0.b;
                ((ArrayList)object1).addAll(h0.h(((SQLiteDatabase)object0), q0.f(), v1));
                continue;
            }
        }
        HashMap hashMap0 = new HashMap();
        StringBuilder stringBuilder0 = new StringBuilder("event_id IN (");
        for(int v2 = 0; v2 < ((ArrayList)object1).size(); ++v2) {
            stringBuilder0.append(((y5.b)((ArrayList)object1).get(v2)).a);
            if(v2 < ((ArrayList)object1).size() - 1) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append(')');
        try(Cursor cursor0 = ((SQLiteDatabase)object0).query("event_metadata", new String[]{"event_id", "name", "value"}, stringBuilder0.toString(), null, null, null, null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                long v3 = cursor0.getLong(0);
                Set set0 = (Set)hashMap0.get(v3);
                if(set0 == null) {
                    set0 = new HashSet();
                    hashMap0.put(v3, set0);
                }
                set0.add(new y5.g(cursor0.getString(1), cursor0.getString(2)));
            }
        }
        ListIterator listIterator0 = ((ArrayList)object1).listIterator();
        while(listIterator0.hasNext()) {
            y5.b b0 = (y5.b)listIterator0.next();
            if(hashMap0.containsKey(((long)b0.a))) {
                A0 a00 = b0.c.c();
                long v4 = b0.a;
                for(Object object2: ((Set)hashMap0.get(v4))) {
                    a00.c(((y5.g)object2).a, ((y5.g)object2).b);
                }
                r5.h h1 = a00.f();
                listIterator0.set(new y5.b(v4, b0.b, h1));
            }
        }
        return object1;
    }

    public void b() {
        Q4.d d0;
        boolean z1;
        String s = (String)this.Z;
        Class class0 = Q4.d.class;
        if(f5.a.b(class0)) {
            return;
        }
        else {
            m m0 = (m)this.Y;
            boolean z = false;
            try {
                if(m0 == null) {
                    z1 = false;
                }
                else if(m0.f) {
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                Class class1 = B.class;
                if(!f5.a.b(class1)) {
                    try {
                        B.a.e();
                        z = B.g.a();
                    }
                    catch(Throwable throwable1) {
                        f5.a.a(throwable1, class1);
                    }
                }
                if(!z1 || !z) {
                    return;
                }
                else {
                    d0 = Q4.d.a;
                    if(!f5.a.b(d0)) {
                        try {
                            if(!Q4.d.h) {
                                Q4.d.h = true;
                                l.c().execute(new u(s, 1));
                                return;
                            }
                            return;
                        }
                        catch(Throwable throwable2) {
                        }
                    }
                }
                f5.a.a(throwable2, d0);
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        f5.a.a(throwable0, class0);
    }

    @Override  // V4.k
    public void c(File file0) {
        Nb.j.f(((W4.d)this.Y), "$slave");
        Nb.j.f(file0, "file");
        ((W4.d)this.Y).g = (W4.b)this.Z;
        ((W4.d)this.Y).f = file0;
        Runnable runnable0 = ((W4.d)this.Y).h;
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    @Override  // m7.e
    public Object d(C c0) {
        switch(this.X) {
            case 4: {
                Context context0 = (Context)c0.a(Context.class);
                switch(((T9.b)this.Z).X) {
                    case 5: {
                        return context0.getApplicationInfo() == null ? new U7.a(((String)this.Y), "") : new U7.a(((String)this.Y), String.valueOf(34));
                    }
                    case 6: {
                        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
                        return applicationInfo0 == null || Build.VERSION.SDK_INT < 24 ? new U7.a(((String)this.Y), "") : new U7.a(((String)this.Y), String.valueOf(applicationInfo0.minSdkVersion));
                    }
                    case 7: {
                        int v = Build.VERSION.SDK_INT;
                        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return new U7.a(((String)this.Y), "tv");
                        }
                        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return new U7.a(((String)this.Y), "watch");
                        }
                        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return new U7.a(((String)this.Y), "auto");
                        }
                        return v < 26 || !context0.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? new U7.a(((String)this.Y), "") : new U7.a(((String)this.Y), "embedded");
                    }
                    default: {
                        String s = context0.getPackageManager().getInstallerPackageName("com.wave.personal");
                        return s == null ? new U7.a(((String)this.Y), "") : new U7.a(((String)this.Y), FirebaseCommonRegistrar.a(s));
                    }
                }
            }
            case 10: {
                try {
                    Trace.beginSection(((String)this.Y));
                    return ((m7.b)this.Z).f.d(c0);
                }
                finally {
                    Trace.endSection();
                }
            }
            default: {
                return new l7.c(((Z6.g)c0.a(Z6.g.class)), ((Executor)c0.k(((r)this.Y))), ((Executor)c0.k(((r)this.Z))));
            }
        }
    }

    @Override  // io.sentry.M0
    public void e(M m0) {
        if(this.X != 12) {
            ((io.sentry.android.core.internal.gestures.f)this.Y).getClass();
            m0.m(new s(((io.sentry.android.core.internal.gestures.f)this.Y), m0, ((S)this.Z), 7));
            return;
        }
        F f0 = m0.r();
        ((AtomicReference)this.Y).set(f0);
        io.sentry.protocol.u u0 = m0.t();
        ((AtomicReference)this.Z).set(u0);
    }

    @Override  // io.sentry.K0
    public void f(S s0) {
        switch(this.X) {
            case 13: {
                ((E1)this.Y).getClass();
                if(s0 == ((E1)this.Y)) {
                    ((M)this.Z).g();
                }
                return;
            }
            case 14: {
                if(s0 == ((S)this.Y)) {
                    ((M)this.Z).g();
                }
                return;
            }
            default: {
                if(s0 == ((io.sentry.android.core.internal.gestures.f)this.Y).e) {
                    ((M)this.Z).g();
                }
            }
        }
    }

    @Override  // io.sentry.b0
    public Object g() {
        h0 h00 = (h0)this.Z;
        ((b4.m)this.Y).getClass();
        try {
            return ((io.sentry.vendor.gson.stream.a)h00.Y).nextInt();
        }
        catch(Exception unused_ex) {
            try {
                return ((io.sentry.vendor.gson.stream.a)h00.Y).nextDouble();
            }
            catch(Exception unused_ex) {
                return ((io.sentry.vendor.gson.stream.a)h00.Y).nextLong();
            }
        }
    }

    @Override  // f1.j
    public Object h(f1.i i0) {
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        I2.s s0 = new I2.s(atomicBoolean0, 1);
        p p0 = p.X;
        n n0 = i0.c;
        if(n0 != null) {
            n0.a(s0, p0);
        }
        E7.h h0 = new E7.h(atomicBoolean0, i0, ((Function0)(((Nb.k)this.Z))));
        ((ExecutorService)this.Y).execute(h0);
        return t.a;
    }

    @Override  // o6.g
    public o6.p i(Object object0) {
        Void void0 = (Void)object0;
        synchronized(((W7.c)this.Y)) {
            ((W7.c)this.Y).c = o6.k.e(((W7.e)this.Z));
        }
        return o6.k.e(((W7.e)this.Z));
    }

    @Override  // o6.a
    public Object j(o6.h h0) {
        int v;
        Integer integer0;
        HttpURLConnection httpURLConnection0;
        switch(this.X) {
            case 1: {
                this.k(h0);
                return h0;
            }
            case 7: {
                this.m(h0);
                return h0;
            }
            case 8: {
                return ((W7.h)this.Y).b(h0, 0L, ((HashMap)this.Z));
            }
            default: {
                W7.m m0 = (W7.m)this.Y;
                o6.p p0 = (o6.p)this.Z;
                m0.getClass();
                try {
                    if(!p0.h()) {
                        throw new IOException(p0.e());
                    }
                    m0.i(true);
                    httpURLConnection0 = (HttpURLConnection)p0.f();
                }
                catch(IOException iOException0) {
                    try {
                        httpURLConnection0 = null;
                        integer0 = null;
                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", iOException0);
                        goto label_35;
                    }
                    catch(Throwable throwable1) {
                        goto label_45;
                    }
                }
                catch(Throwable throwable0) {
                    integer0 = null;
                    throwable1 = throwable0;
                    httpURLConnection0 = null;
                    goto label_45;
                }
                try {
                    integer0 = null;
                    v = httpURLConnection0.getResponseCode();
                    integer0 = v;
                    goto label_26;
                }
                catch(IOException iOException0) {
                    goto label_34;
                }
                catch(Throwable throwable2) {
                }
                throwable1 = throwable2;
                goto label_45;
            label_26:
                if(v == 200) {
                    try {
                        try {
                            synchronized(m0) {
                                m0.c = 8;
                            }
                            m0.o.e(0, W7.k.f);
                            m0.k(httpURLConnection0).c();
                            goto label_57;
                        }
                        catch(IOException iOException0) {
                        label_34:
                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", iOException0);
                        }
                    }
                    catch(Throwable throwable1) {
                        goto label_45;
                    }
                label_35:
                    W7.m.b(httpURLConnection0);
                    m0.i(false);
                    boolean z = integer0 == null || W7.m.d(((int)integer0));
                    if(z) {
                        m0.n.getClass();
                        m0.l(new Date(System.currentTimeMillis()));
                    }
                    if(!z && ((int)integer0) != 200) {
                        new V7.f(((int)integer0), 0, (((int)integer0) == 403 ? W7.m.f(httpURLConnection0.getErrorStream()) : String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", integer0)));
                        m0.g();
                        return o6.k.e(null);
                    label_45:
                        W7.m.b(httpURLConnection0);
                        m0.i(false);
                        boolean z1 = integer0 == null || W7.m.d(((int)integer0));
                        if(z1) {
                            m0.n.getClass();
                            m0.l(new Date(System.currentTimeMillis()));
                        }
                        if(z1 || ((int)integer0) == 200) {
                            m0.h();
                        }
                        else {
                            new V7.f(((int)integer0), 0, (((int)integer0) == 403 ? W7.m.f(httpURLConnection0.getErrorStream()) : String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", integer0)));
                            m0.g();
                        }
                        throw throwable1;
                    }
                }
                else {
                label_57:
                    W7.m.b(httpURLConnection0);
                    m0.i(false);
                    boolean z2 = W7.m.d(v);
                    if(z2) {
                        m0.n.getClass();
                        m0.l(new Date(System.currentTimeMillis()));
                    }
                    if(!z2 && v != 200) {
                        new V7.f(v, 0, (v == 403 ? W7.m.f(httpURLConnection0.getErrorStream()) : String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", integer0)));
                        m0.g();
                        return o6.k.e(null);
                    }
                }
                m0.h();
                return o6.k.e(null);
            }
        }
    }

    private final Object k(o6.h h0) {
        synchronized(((E7.m)this.Y)) {
            ((s.e)((E7.m)this.Y).b).remove(((String)this.Z));
            return h0;
        }
    }

    @Override  // io.sentry.I0
    public void l(Q q0) {
        d6.a a0 = (d6.a)q0.b0;
        y1 y10 = (y1)this.Y;
        if(a0 == null) {
            a0 = new d6.a(y10.getLogger());
            q0.b0 = a0;
        }
        if(a0.X) {
            Q q1 = ((M)this.Z).v();
            F f0 = ((M)this.Z).r();
            io.sentry.protocol.u u0 = ((M)this.Z).t();
            a0.h("sentry-trace_id", ((io.sentry.protocol.u)q1.Y).toString());
            a0.h("sentry-public_key", y10.retrieveParsedDsn().b);
            a0.h("sentry-release", y10.getRelease());
            a0.h("sentry-environment", y10.getEnvironment());
            if(!io.sentry.protocol.u.Y.equals(u0)) {
                a0.h("sentry-replay_id", u0.toString());
            }
            a0.h("sentry-user_segment", (f0 == null ? null : d6.a.f(f0)));
            a0.h("sentry-transaction", null);
            a0.h("sentry-sample_rate", null);
            a0.h("sentry-sampled", null);
            a0.X = false;
        }
    }

    private final Object m(o6.h h0) {
        W7.h h1 = (W7.h)this.Y;
        Date date0 = (Date)this.Z;
        h1.getClass();
        if(h0.h()) {
            synchronized(h1.g.b) {
                h1.g.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date0.getTime()).apply();
                return h0;
            }
        }
        Exception exception0 = h0.e();
        if(exception0 != null) {
            if(exception0 instanceof V7.e) {
                h1.g.g();
                return h0;
            }
            h1.g.f();
        }
        return h0;
    }

    @Override  // o6.c
    public void s(o6.h h0) {
        ((E7.i)this.Y).a(((Intent)this.Z));
    }
}

