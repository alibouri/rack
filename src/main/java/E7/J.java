package E7;

import C3.i;
import Fc.d;
import I2.A;
import I2.w;
import I2.x;
import I2.y;
import J2.B;
import J2.I;
import J2.J;
import M6.b;
import R2.p;
import R2.u;
import W7.c;
import W7.e;
import W7.n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import i7.a;
import io.sentry.G1;
import io.sentry.P;
import io.sentry.T0;
import io.sentry.android.core.D;
import io.sentry.android.core.F;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public final class j implements Callable {
    public final int a;
    public final Object b;
    public final Object c;

    public j(Object object0, int v, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    private final Object a() {
        e e0 = (e)this.c;
        n n0 = ((c)this.b).b;
        synchronized(n0) {
            FileOutputStream fileOutputStream0 = n0.a.openFileOutput(n0.b, 0);
            try {
                fileOutputStream0.write(e0.a.toString().getBytes("UTF-8"));
            }
            catch(Throwable throwable0) {
                fileOutputStream0.close();
                throw throwable0;
            }
            fileOutputStream0.close();
            return null;
        }
    }

    private final Object b() {
        SentryAndroidOptions sentryAndroidOptions0 = (SentryAndroidOptions)this.c;
        Context context0 = ((D)this.b).X;
        if(F.h == null) {
            synchronized(F.class) {
                if(F.h == null) {
                    Context context1 = context0.getApplicationContext();
                    if(context1 != null) {
                        context0 = context1;
                    }
                    F.h = new F(context0, sentryAndroidOptions0);
                }
            }
        }
        return F.h;
    }

    @Override
    public final Object call() {
        ComponentName componentName0;
        String s3;
        String s = null;
        switch(this.a) {
            case 0: {
                Context context0 = (Context)this.b;
                Intent intent0 = (Intent)this.c;
                C c0 = C.D();
                c0.getClass();
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque)c0.b0).offer(intent0);
                Intent intent1 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent1.setPackage("com.wave.personal");
                synchronized(c0) {
                    s3 = (String)c0.X;
                    if(s3 == null) {
                        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent1, 0);
                        if(resolveInfo0 == null) {
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                        else {
                            ServiceInfo serviceInfo0 = resolveInfo0.serviceInfo;
                            if(serviceInfo0 == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            }
                            else if("com.wave.personal".equals(serviceInfo0.packageName)) {
                                String s4 = serviceInfo0.name;
                                if(s4 == null) {
                                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo0.packageName + "/" + serviceInfo0.name);
                                }
                                else {
                                    c0.X = s4.startsWith(".") ? "com.wave.personal" + serviceInfo0.name : serviceInfo0.name;
                                    s = (String)c0.X;
                                }
                            }
                            else {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo0.packageName + "/" + serviceInfo0.name);
                            }
                        }
                    }
                    else {
                        goto label_62;
                    }
                }
                goto label_64;
            label_62:
                s = s3;
            label_64:
                if(s != null) {
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + s);
                    }
                    intent1.setClassName("com.wave.personal", s);
                }
                try {
                    if(c0.F(context0)) {
                        componentName0 = N.c(context0, intent1);
                    }
                    else {
                        componentName0 = context0.startService(intent1);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if(componentName0 == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        return 404;
                    }
                    return -1;
                }
                catch(SecurityException securityException0) {
                }
                catch(IllegalStateException illegalStateException0) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + illegalStateException0);
                    return 402;
                }
                Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", securityException0);
                return 401;
            }
            case 1: {
                J2.D d1 = (J2.D)this.b;
                I i1 = (I)this.c;
                String s5 = i1.c;
                u u0 = i1.i;
                if(d1 instanceof B) {
                    y y0 = ((B)d1).a;
                    int v = u0.i(s5);
                    i1.h.w().c(s5);
                    switch(v) {
                        case 0: {
                            break;
                        }
                        case 2: {
                            p p0 = i1.a;
                            String s6 = i1.l;
                            if(y0 instanceof x) {
                                A.e().f(J.a, "Worker result SUCCESS for " + s6);
                                if(p0.d()) {
                                    i1.c();
                                    return Boolean.valueOf(false);
                                }
                                u0.p(3, s5);
                                Nb.j.e(((x)y0).a, "success.outputData");
                                u0.o(s5, ((x)y0).a);
                                i1.f.getClass();
                                long v1 = System.currentTimeMillis();
                                R2.c c1 = i1.j;
                                for(Object object1: c1.d(s5)) {
                                    String s7 = (String)object1;
                                    if(u0.i(s7) == 5) {
                                        q2.C c2 = b.o(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                        c2.c(1, s7);
                                        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)c1.Y;
                                        workDatabase_Impl0.b();
                                        Cursor cursor0 = P4.c.O(workDatabase_Impl0, c2, false);
                                        try {
                                            boolean z = cursor0.moveToFirst() && cursor0.getInt(0) != 0;
                                        }
                                        finally {
                                            cursor0.close();
                                            c2.f();
                                        }
                                        if(z) {
                                            A.e().f(J.a, "Setting status to enqueued for " + s7);
                                            u0.p(1, s7);
                                            u0.n(v1, s7);
                                        }
                                    }
                                }
                                return Boolean.valueOf(false);
                            }
                            if(y0 instanceof w) {
                                A.e().f(J.a, "Worker result RETRY for " + s6);
                                i1.b(0xFFFFFF00);
                                return Boolean.valueOf(true);
                            }
                            A.e().f(J.a, "Worker result FAILURE for " + s6);
                            if(p0.d()) {
                                i1.c();
                                return Boolean.valueOf(false);
                            }
                            i1.d(y0);
                            return Boolean.valueOf(false);
                        label_139:
                            if(A3.e.m(v)) {
                                break;
                            }
                            i1.b(0xFFFFFE00);
                            return Boolean.valueOf(true);
                        }
                        default: {
                            goto label_139;
                        }
                    }
                }
                else {
                    if(d1 instanceof J2.A) {
                        i1.d(((J2.A)d1).a);
                        return Boolean.valueOf(false);
                    }
                    if(!(d1 instanceof J2.C)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    int v3 = ((J2.C)d1).a;
                    int v4 = u0.i(s5);
                    if(v4 != 0 && !A3.e.m(v4)) {
                        A a0 = A.e();
                        StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("Status for ", s5, " is ");
                        stringBuilder0.append(A3.e.B(v4));
                        stringBuilder0.append("; not doing any work and rescheduling for later execution");
                        a0.a(J.a, stringBuilder0.toString());
                        u0.p(1, s5);
                        u0.q(v3, s5);
                        u0.l(-1L, s5);
                        return Boolean.valueOf(true);
                    }
                    A a1 = A.e();
                    StringBuilder stringBuilder1 = com.apollographql.apollo.api.b.s("Status for ", s5, " is ");
                    stringBuilder1.append(A3.e.B(v4));
                    stringBuilder1.append(" ; not doing any work");
                    a1.a(J.a, stringBuilder1.toString());
                }
                return Boolean.valueOf(false);
            }
            case 2: {
                return this.a();
            }
            case 3: {
                R2.e e0 = (R2.e)this.b;
                CountDownLatch countDownLatch0 = (CountDownLatch)e0.Y;
                M4.j j0 = (M4.j)this.c;
                try {
                    e0.X = j0.call();
                }
                catch(Throwable throwable1) {
                    if(countDownLatch0 != null) {
                        countDownLatch0.countDown();
                    }
                    throw throwable1;
                }
                if(countDownLatch0 != null) {
                    countDownLatch0.countDown();
                }
                return null;
            }
            case 4: {
                try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream0, b1.d))) {
                    ((P)this.b).e(((G1)this.c), bufferedWriter0);
                    return byteArrayOutputStream0.toByteArray();
                }
            }
            case 5: {
                try(ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream(); BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream1, b1.d))) {
                    ((P)this.b).e(((T0)this.c), bufferedWriter1);
                    return byteArrayOutputStream1.toByteArray();
                }
            }
            case 6: {
                try(ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(); BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, b1.d))) {
                    ((P)this.b).e(((io.sentry.clientreport.b)this.c), bufferedWriter2);
                    return byteArrayOutputStream2.toByteArray();
                }
            }
            case 7: {
                return this.b();
            }
            default: {
                ((l7.c)this.b).getClass();
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("playIntegrityToken", ((a)this.c).a);
                byte[] arr_b = jSONObject0.toString().getBytes("UTF-8");
                i i0 = ((l7.c)this.b).c;
                i0.getClass();
                d d0 = ((l7.c)this.b).f;
                if(d0.b > System.currentTimeMillis()) {
                    throw new E7.B("Too many attempts.");
                }
                JSONObject jSONObject1 = new JSONObject(i0.y(new URL("https://firebaseappcheck.googleapis.com/v1/projects/" + ((String)i0.b0) + "/apps/" + ((String)i0.Z) + ":exchangePlayIntegrityToken?key=" + ((String)i0.Y)), arr_b, d0, true));
                String s1 = jSONObject1.optString("token");
                if(TextUtils.isEmpty(s1)) {
                    s1 = null;
                }
                String s2 = jSONObject1.optString("ttl");
                if(!TextUtils.isEmpty(s2)) {
                    s = s2;
                }
                if(s1 == null || s == null) {
                    throw new E7.B("Unexpected server response.");
                }
                Object object0 = new h7.a();  // initializer: Ljava/lang/Object;-><init>()V
                object0.a = s1;
                object0.b = s;
                return object0;
            }
        }
    }
}

