package y7;

import N5.r;
import R2.e;
import Z6.g;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.g1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;
import m7.m;
import o6.k;
import o6.p;
import org.json.JSONException;
import org.json.JSONObject;
import uc.l;
import x7.a;

public final class c implements d {
    public final g a;
    public final A7.d b;
    public final g1 c;
    public final j d;
    public final m e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final n7.j i;
    public String j;
    public final HashSet k;
    public final ArrayList l;
    public static final Object m;

    static {
        c.m = new Object();
        new AtomicInteger(1);
    }

    public c(g g0, a a0, ExecutorService executorService0, n7.j j0) {
        g0.a();
        A7.d d0 = new A7.d(g0.a, a0);
        g1 g10 = new g1(g0);
        if(v7.d.Y == null) {
            v7.d.Y = new v7.d(1);
        }
        v7.d d1 = v7.d.Y;
        if(j.d == null) {
            j.d = new j(d1);
        }
        j j1 = j.d;
        m m0 = new m(new m7.d(2, g0));
        h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        super();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = g0;
        this.b = d0;
        this.c = g10;
        this.d = j1;
        this.e = m0;
        this.f = h0;
        this.h = executorService0;
        this.i = j0;
    }

    public final void a(i i0) {
        synchronized(this.g) {
            this.l.add(i0);
        }
    }

    public final void b() {
        z7.a a0;
        synchronized(c.m) {
            this.a.a();
            e e0 = e.a(this.a.a);
            try {
                a0 = this.c.x();
                if(a0.b == 1 || a0.b == 2) {
                    String s = this.h(a0);
                    l l0 = a0.a();
                    l0.b = s;
                    l0.a = 3;
                    a0 = l0.i();
                    this.c.w(a0);
                }
            }
            finally {
                if(e0 != null) {
                    e0.m();
                }
            }
        }
        this.k(a0);
        b b0 = new b(this, 2);
        this.i.execute(b0);
    }

    public final z7.a c(z7.a a0) {
        A7.c c0;
        this.a.a();
        String s = this.a.c.a;
        this.a.a();
        String s1 = this.a.c.g;
        String s2 = a0.d;
        A7.d d0 = this.b;
        A7.e e0 = d0.c;
        if(!e0.b()) {
            throw new y7.e("Firebase Installations Service is unavailable. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
        }
        URL uRL0 = A7.d.a(("projects/" + s1 + "/installations/" + a0.a + "/authTokens:generate"));
        int v = 0;
        while(v <= 1) {
            TrafficStats.setThreadStatsTag(0x8003);
            HttpURLConnection httpURLConnection0 = d0.c(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s2);
                httpURLConnection0.setDoOutput(true);
                A7.d.h(httpURLConnection0);
                int v1 = httpURLConnection0.getResponseCode();
                e0.d(v1);
                if(v1 >= 200 && v1 < 300) {
                    c0 = A7.d.f(httpURLConnection0);
                    goto label_45;
                }
                A7.d.b(httpURLConnection0, null, s, s1);
                switch(v1) {
                    case 401: 
                    case 404: {
                        A7.b b1 = A7.c.a();
                        b1.Y = 3;
                        c0 = b1.d();
                        goto label_45;
                    }
                    case 429: {
                        throw new y7.e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
                    label_26:
                        if(v1 < 500 || v1 >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            A7.b b0 = A7.c.a();
                            b0.Y = 2;
                            c0 = b0.d();
                            goto label_45;
                        }
                        break;
                    }
                    default: {
                        goto label_26;
                    }
                }
            }
            catch(AssertionError | IOException unused_ex) {
            }
            catch(Throwable throwable0) {
                httpURLConnection0.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw throwable0;
            }
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++v;
            continue;
        label_45:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            switch(v.h.d(c0.c)) {
                case 0: {
                    this.d.getClass();
                    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                    this.d.a.getClass();
                    l l0 = a0.a();
                    l0.c = c0.a;
                    l0.e = (long)c0.b;
                    l0.f = timeUnit0.toSeconds(System.currentTimeMillis());
                    return l0.i();
                }
                case 1: {
                    l l1 = a0.a();
                    l1.g = "BAD CONFIG";
                    l1.a = 5;
                    return l1.i();
                }
                case 2: {
                    this.l(null);
                    l l2 = a0.a();
                    l2.a = 2;
                    return l2.i();
                }
                default: {
                    throw new y7.e("Firebase Installations Service is unavailable. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
                }
            }
        }
        throw new y7.e("Firebase Installations Service is unavailable. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
    }

    public final p d() {
        String s;
        this.g();
        synchronized(this) {
            s = this.j;
        }
        if(s != null) {
            return k.e(s);
        }
        o6.i i0 = new o6.i();
        this.a(new y7.g(i0));
        b b0 = new b(this, 0);
        this.h.execute(b0);
        return i0.a;
    }

    public final p e() {
        this.g();
        o6.i i0 = new o6.i();
        this.a(new f(this.d, i0));
        b b0 = new b(this, 1);
        this.h.execute(b0);
        return i0.a;
    }

    public final void f(z7.a a0) {
        synchronized(c.m) {
            this.a.a();
            e e0 = e.a(this.a.a);
            try {
                this.c.w(a0);
            }
            catch(Throwable throwable0) {
                if(e0 != null) {
                    e0.m();
                }
                throw throwable0;
            }
            if(e0 != null) {
                e0.m();
            }
        }
    }

    public final void g() {
        this.a.a();
        r.g(this.a.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        this.a.a();
        r.g(this.a.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        this.a.a();
        r.g(this.a.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        this.a.a();
        r.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", this.a.c.b.contains(":"));
        this.a.a();
        r.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.c.matcher(this.a.c.a).matches());
    }

    public final String h(z7.a a0) {
        String s;
        this.a.a();
        if(this.a.b.equals("CHIME_ANDROID_SDK")) {
        label_4:
            if(a0.b == 1) {
                z7.b b0 = (z7.b)this.e.get();
                synchronized(b0.a) {
                    s = b0.a();
                    if(s == null) {
                        s = b0.b();
                    }
                }
                if(TextUtils.isEmpty(s)) {
                    this.f.getClass();
                    return h.a();
                }
                return s;
            }
        }
        else {
            this.a.a();
            if("[DEFAULT]".equals(this.a.b)) {
                goto label_4;
            }
        }
        this.f.getClass();
        return h.a();
    }

    public final z7.a i(z7.a a0) {
        A7.a a2;
        A7.a a1;
        String s = null;
        if(a0.a != null && a0.a.length() == 11) {
            z7.b b0 = (z7.b)this.e.get();
            SharedPreferences sharedPreferences0 = b0.a;
            __monitor_enter(sharedPreferences0);
            int v = FIN.finallyOpen$NT();
            String[] arr_s = z7.b.c;
            int v1 = 0;
            while(true) {
                if(v1 >= 4) {
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(sharedPreferences0);
                    FIN.finallyCodeEnd$NT(v);
                    break;
                }
                String s1 = b0.a.getString("|T|" + b0.b + "|" + arr_s[v1], null);
                if(s1 != null && !s1.isEmpty()) {
                    if(s1.startsWith("{")) {
                        try {
                            s = new JSONObject(s1).getString("token");
                            goto label_15;
                        label_14:
                            s = s1;
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    else {
                        goto label_14;
                    }
                label_15:
                    FIN.finallyExec$NT(v);
                    break;
                }
                ++v1;
            }
        }
        A7.d d0 = this.b;
        this.a.a();
        String s2 = this.a.c.a;
        String s3 = a0.a;
        this.a.a();
        String s4 = this.a.c.g;
        this.a.a();
        String s5 = this.a.c.b;
        A7.e e0 = d0.c;
        if(!e0.b()) {
            throw new y7.e("Firebase Installations Service is unavailable. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
        }
        URL uRL0 = A7.d.a(("projects/" + s4 + "/installations"));
        int v2 = 0;
        while(v2 <= 1) {
            TrafficStats.setThreadStatsTag(0x8001);
            HttpURLConnection httpURLConnection0 = d0.c(uRL0, s2);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setDoOutput(true);
                if(s != null) {
                    httpURLConnection0.addRequestProperty("x-goog-fis-android-iid-migration-auth", s);
                }
                A7.d.g(httpURLConnection0, s3, s5);
                int v3 = httpURLConnection0.getResponseCode();
                e0.d(v3);
                boolean z = v3 < 200 || v3 >= 300 ? false : true;
                if(z) {
                    a1 = A7.d.e(httpURLConnection0);
                    goto label_51;
                }
                goto label_54;
            }
            catch(AssertionError | IOException unused_ex) {
                goto label_66;
            }
            catch(Throwable throwable0) {
                goto label_65;
            }
        label_51:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            goto label_76;
            try {
            label_54:
                A7.d.b(httpURLConnection0, s5, s2, s4);
                if(v3 == 429) {
                    throw new y7.e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
                }
            }
            catch(AssertionError | IOException unused_ex) {
                goto label_66;
            }
            catch(Throwable throwable0) {
                goto label_65;
            }
            if(v3 < 500 || v3 >= 600) {
                try {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    a2 = new A7.a(null, null, null, null, 2);
                    goto label_73;
                label_65:
                    goto label_70;
                }
                catch(AssertionError | IOException unused_ex) {
                }
                catch(Throwable throwable0) {
                    goto label_65;
                }
            }
        label_66:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++v2;
            continue;
        label_70:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        label_73:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            a1 = a2;
        label_76:
            switch(v.h.d(a1.e)) {
                case 0: {
                    this.d.getClass();
                    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                    this.d.a.getClass();
                    l l0 = a0.a();
                    l0.b = a1.b;
                    l0.a = 4;
                    l0.c = a1.d.a;
                    l0.d = a1.c;
                    l0.e = (long)a1.d.b;
                    l0.f = timeUnit0.toSeconds(System.currentTimeMillis());
                    return l0.i();
                }
                case 1: {
                    l l1 = a0.a();
                    l1.g = "BAD CONFIG";
                    l1.a = 5;
                    return l1.i();
                }
                default: {
                    throw new y7.e("Firebase Installations Service is unavailable. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
                }
            }
        }
        throw new y7.e("Firebase Installations Service is unavailable. Please try again later.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
    }

    public final void j(Exception exception0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((i)object1).b(exception0)) {
                    iterator0.remove();
                }
            }
        }
    }

    public final void k(z7.a a0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((i)object1).a(a0)) {
                    iterator0.remove();
                }
            }
        }
    }

    public final void l(String s) {
        synchronized(this) {
            this.j = s;
        }
    }

    public final void m(z7.a a0, z7.a a1) {
        synchronized(this) {
            if(this.k.size() != 0 && !TextUtils.equals(a0.a, a1.a)) {
                Iterator iterator0 = this.k.iterator();
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(object0 == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        }
        return;
    }
}

