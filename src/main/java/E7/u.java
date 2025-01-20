package E7;

import Bb.K;
import E9.a;
import I2.A;
import I2.B;
import I2.g;
import I2.m;
import M.J;
import N5.r;
import Nb.j;
import R2.p;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import b3.b;
import b3.f;
import com.google.android.gms.internal.measurement.K1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sendwave.util.AnnouncementAction;
import j6.V;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import m7.k;
import q9.C;
import r8.e;
import u7.c;
import v.h;
import yb.d;

public final class u {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public u(Uri uri0, String s, String s1, boolean z, boolean z1) {
        this.b = uri0;
        this.c = s;
        this.d = s1;
        this.a = z;
    }

    public u(f f0, b b0) {
        this.d = f0;
        this.b = b0;
        f0.getClass();
        this.c = new boolean[2];
    }

    public u(V v0, String s) {
        this.d = v0;
        r.f(s);
        this.b = s;
    }

    public u(Class class0) {
        UUID uUID0 = UUID.randomUUID();
        j.e(uUID0, "randomUUID()");
        this.b = uUID0;
        String s = ((UUID)this.b).toString();
        j.e(s, "id.toString()");
        this.c = new p(s, 0, class0.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, null, 0xFFFFFA);
        this.d = K.L(new String[]{class0.getName()});
    }

    public u(C c0, AnnouncementAction announcementAction0, a a0, String s) {
        j.f(a0, "analytics");
        j.f(s, "id");
        this.d = c0;
        this.b = announcementAction0;
        this.a = announcementAction0 != null;
        this.c = announcementAction0 == null ? null : announcementAction0.X;
    }

    public B a() {
        if(this.a && ((p)this.c).j.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        B b0 = new B(((UUID)this.b), ((p)this.c), ((Set)this.d));
        g g0 = ((p)this.c).j;
        boolean z = Build.VERSION.SDK_INT >= 24 && g0.b() || g0.e || g0.c || g0.d;
        p p0 = (p)this.c;
        if(p0.q) {
            if(z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if(p0.g > 0L) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if(p0.x == null) {
            List list0 = Vb.j.p0(p0.c, new String[]{"."}, 0, 6);
            String s = list0.size() == 1 ? ((String)list0.get(0)) : ((String)Bb.p.w0(list0));
            if(s.length() > 0x7F) {
                s = Vb.j.x0(0x7F, s);
            }
            p0.x = s;
        }
        UUID uUID0 = UUID.randomUUID();
        j.e(uUID0, "randomUUID()");
        this.t(uUID0);
        return b0;
    }

    public void b(boolean z) {
        f f0 = (f)this.d;
        synchronized(f0) {
            if(!this.a) {
                if(j.a(((b)this.b).g, this)) {
                    f.a(f0, this, z);
                }
                this.a = true;
                return;
            }
        }
        throw new IllegalStateException("editor is closed");
    }

    public int c(int v, int v1, int v2) {
        boolean z = this.a;
        x8.b b0 = (x8.b)this.b;
        return (z ? b0.c(v1, v) : b0.c(v, v1)) ? v2 << 1 | 1 : v2 << 1;
    }

    public d d(O7.g g0) {
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)((URL)this.b).openConnection();
        httpURLConnection0.setRequestMethod("POST");
        this.m(httpURLConnection0);
        HashMap hashMap0 = (HashMap)g0.c0;
        String s = "";
        if(hashMap0 != null && hashMap0.size() != 0) {
            boolean z = true;
            for(Object object0: hashMap0.entrySet()) {
                if(!z) {
                    s = s + ",";
                }
                StringBuilder stringBuilder0 = J.i(s);
                stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
                stringBuilder0.append(" ");
                byte[] arr_b = ((String)((Map.Entry)object0).getValue()).getBytes();
                StringBuilder stringBuilder1 = new StringBuilder(arr_b.length * 4 / 3);
                for(int v = 0; v < arr_b.length; v += 3) {
                    stringBuilder1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((arr_b[v] & 0xFC) >> 2));
                    int v1 = (arr_b[v] & 3) << 4;
                    if(v + 1 < arr_b.length) {
                        stringBuilder1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(v1 | (arr_b[v + 1] & 0xF0) >> 4));
                        int v2 = (arr_b[v + 1] & 15) << 2;
                        if(v + 2 < arr_b.length) {
                            stringBuilder1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(v2 | (arr_b[v + 2] & 0xC0) >> 6));
                            stringBuilder1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(arr_b[v + 2] & 0x3F));
                        }
                        else {
                            stringBuilder1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(v2));
                            stringBuilder1.append('=');
                        }
                    }
                    else {
                        stringBuilder1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(v1));
                        stringBuilder1.append("==");
                    }
                }
                stringBuilder0.append(stringBuilder1.toString());
                s = stringBuilder0.toString();
                z = false;
            }
        }
        if(s.length() > 0) {
            httpURLConnection0.setRequestProperty("Upload-Metadata", s);
        }
        httpURLConnection0.addRequestProperty("Upload-Length", Long.toString(g0.Y));
        httpURLConnection0.connect();
        int v3 = httpURLConnection0.getResponseCode();
        if(v3 < 200 || v3 >= 300) {
            throw new yb.b(J.d(v3, "unexpected status code (", ") while creating upload"), httpURLConnection0);
        }
        String s1 = httpURLConnection0.getHeaderField("Location");
        if(s1 == null || s1.length() == 0) {
            throw new yb.b("missing upload URL in response for creating upload", httpURLConnection0);
        }
        URL uRL0 = new URL(httpURLConnection0.getURL(), s1);
        if(this.a) {
            g3.b b0 = (g3.b)this.c;
            b0.getClass();
            String s2 = uRL0.toString();
            String s3 = (String)g0.b0;
            if(s3.length() != 0) {
                SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)b0.Y).edit();
                sharedPreferences$Editor0.putString(s3, s2);
                sharedPreferences$Editor0.apply();
            }
        }
        return this.e(g0, uRL0, 0L);
    }

    public d e(O7.g g0, URL uRL0, long v) {
        S7.g g1 = (S7.g)g0.Z;
        d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d0.g = 0xA00000;
        d0.a = uRL0;
        d0.b = g1;
        d0.c = v;
        d0.d = this;
        d0.e = g0;
        int v1 = Long.compare(g1.b, -1L);
        InputStream inputStream0 = (InputStream)g1.c;
        if(v1 == 0) {
            inputStream0.skip(v);
        }
        else {
            inputStream0.reset();
            inputStream0.skip(v - g1.b);
            g1.b = -1L;
        }
        g1.a = v;
        d0.f = new byte[0x200000];
        return d0;
    }

    public Ec.C f(int v) {
        f f0 = (f)this.d;
        synchronized(f0) {
            if(!this.a) {
                ((boolean[])this.c)[v] = true;
                Object object0 = ((b)this.b).d.get(v);
                b3.d d0 = f0.n0;
                if(!d0.c(((Ec.C)object0))) {
                    m3.g.a(d0.h(((Ec.C)object0)));
                }
                return (Ec.C)object0;
            }
        }
        throw new IllegalStateException("editor is closed");
    }

    public int[] g() {
        int[] arr_v2;
        __monitor_enter(this);
        try {
            if(this.a) {
                long[] arr_v = (long[])this.b;
                int v = 0;
                for(int v1 = 0; true; ++v1) {
                    int v2 = 1;
                    if(v >= arr_v.length) {
                        break;
                    }
                    boolean z = Long.compare(arr_v[v], 0L) > 0;
                    boolean[] arr_z = (boolean[])this.c;
                    if(z == arr_z[v1]) {
                        ((int[])this.d)[v1] = 0;
                    }
                    else {
                        int[] arr_v1 = (int[])this.d;
                        if(!z) {
                            v2 = 2;
                        }
                        arr_v1[v1] = v2;
                    }
                    arr_z[v1] = z;
                    ++v;
                }
                this.a = false;
                arr_v2 = (int[])((int[])this.d).clone();
                goto label_26;
            }
            goto label_28;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(this);
        throw throwable0;
    label_26:
        __monitor_exit(this);
        return arr_v2;
    label_28:
        __monitor_exit(this);
        return null;
    }

    public void h() {
        synchronized(this) {
            if(this.a) {
                return;
            }
            Boolean boolean0 = this.n();
            this.c = boolean0;
            if(boolean0 == null) {
                l l0 = new l(2);
                ((k)(((c)this.b))).a(((k)(((c)this.b))).c, l0);
            }
            this.a = true;
        }
    }

    public boolean i() {
        synchronized(this) {
            this.h();
            Boolean boolean0 = (Boolean)this.c;
            return boolean0 == null ? ((FirebaseMessaging)this.d).a.h() : boolean0.booleanValue();
        }
    }

    public boolean j() {
        synchronized(this.b) {
        }
        return this.a;
    }

    public boolean k(int[] arr_v) {
        j.f(arr_v, "tableIds");
        synchronized(this) {
            boolean z = false;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                int v2 = arr_v[v1];
                long[] arr_v1 = (long[])this.b;
                long v3 = arr_v1[v2];
                arr_v1[v2] = 1L + v3;
                if(v3 == 0L) {
                    z = true;
                    this.a = true;
                }
            }
            return z;
        }
    }

    public boolean l(int[] arr_v) {
        j.f(arr_v, "tableIds");
        synchronized(this) {
            boolean z = false;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                int v2 = arr_v[v1];
                long[] arr_v1 = (long[])this.b;
                long v3 = arr_v1[v2];
                arr_v1[v2] = v3 - 1L;
                if(v3 == 1L) {
                    z = true;
                    this.a = true;
                }
            }
            return z;
        }
    }

    public void m(HttpURLConnection httpURLConnection0) {
        j.f(httpURLConnection0, "connection");
        httpURLConnection0.setInstanceFollowRedirects(Boolean.getBoolean("http.strictPostRedirect"));
        httpURLConnection0.setConnectTimeout(5000);
        httpURLConnection0.addRequestProperty("Tus-Resumable", "1.0.0");
        Object object0 = this.d;
        if(object0 != null) {
            for(Object object1: ((Map)object0).entrySet()) {
                httpURLConnection0.addRequestProperty(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
            }
        }
        if(httpURLConnection0 instanceof HttpsURLConnection) {
            SSLContext sSLContext0 = SSLContext.getInstance("TLSv1.2");
            j.e(sSLContext0, "getInstance(...)");
            sSLContext0.init(null, null, new SecureRandom());
            ((HttpsURLConnection)httpURLConnection0).setSSLSocketFactory(sSLContext0.getSocketFactory());
            ((HttpsURLConnection)httpURLConnection0).setReadTimeout(300000);
            ((HttpsURLConnection)httpURLConnection0).setConnectTimeout(300000);
        }
    }

    public Boolean n() {
        Z6.g g0 = ((FirebaseMessaging)this.d).a;
        g0.a();
        Context context0 = g0.a;
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
        if(sharedPreferences0.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences0.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.wave.personal", 0x80);
                return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return null;
    }

    public P8.c o() {
        P8.c c0 = (P8.c)this.d;
        if(c0 != null) {
            return c0;
        }
        int v = 0;
        int v1 = 0;
        for(int v2 = 0; v2 < 6; ++v2) {
            v1 = this.c(v2, 8, v1);
        }
        int v3 = this.c(8, 7, this.c(8, 8, this.c(7, 8, v1)));
        for(int v4 = 5; v4 >= 0; --v4) {
            v3 = this.c(8, v4, v3);
        }
        int v5 = ((x8.b)this.b).Y;
        for(int v6 = v5 - 1; v6 >= v5 - 7; --v6) {
            v = this.c(8, v6, v);
        }
        for(int v7 = v5 - 8; v7 < v5; ++v7) {
            v = this.c(v7, 8, v);
        }
        P8.c c1 = P8.c.a(v3, v);
        if(c1 == null) {
            c1 = P8.c.a(v3 ^ 0x5412, v ^ 0x5412);
        }
        this.d = c1;
        if(c1 == null) {
            throw e.a();
        }
        return c1;
    }

    public P8.f p() {
        P8.f f0 = (P8.f)this.c;
        if(f0 != null) {
            return f0;
        }
        int v = ((x8.b)this.b).Y;
        int v1 = (v - 17) / 4;
        if(v1 <= 6) {
            return P8.f.c(v1);
        }
        int v3 = 0;
        int v4 = 0;
        for(int v5 = 5; v5 >= 0; --v5) {
            for(int v6 = v - 9; v6 >= v - 11; --v6) {
                v4 = this.c(v6, v5, v4);
            }
        }
        P8.f f1 = P8.f.b(v4);
        if(f1 != null && f1.a * 4 + 17 == v) {
            this.c = f1;
            return f1;
        }
        for(int v2 = 5; v2 >= 0; --v2) {
            for(int v7 = v - 9; v7 >= v - 11; --v7) {
                v3 = this.c(v2, v7, v3);
            }
        }
        P8.f f2 = P8.f.b(v3);
        if(f2 == null || f2.a * 4 + 17 != v) {
            throw e.a();
        }
        this.c = f2;
        return f2;
    }

    public void q() {
        if(((P8.c)this.d) == null) {
            return;
        }
        int[] arr_v = h.e(8);
        int v = arr_v[((P8.c)this.d).b];
        x8.b b0 = (x8.b)this.b;
        for(int v1 = 0; true; ++v1) {
            int v2 = b0.Y;
            if(v1 >= v2) {
                break;
            }
            for(int v3 = 0; v3 < v2; ++v3) {
                if(P8.b.a(v, v1, v3)) {
                    b0.b(v3, v1);
                }
            }
        }
    }

    public d r(O7.g g0) {
        if(!this.a) {
            throw new yb.c("resuming not enabled for this client. use enableResuming() to do so");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        g3.b b0 = (g3.b)this.c;
        String s = (String)g0.b0;
        b0.getClass();
        URL uRL0 = null;
        if(s.length() != 0) {
            String s1 = ((SharedPreferences)b0.Y).getString(s, "");
            if(s1.length() != 0) {
                try {
                    uRL0 = new URL(s1);
                }
                catch(MalformedURLException unused_ex) {
                    if(s.length() != 0) {
                        SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)b0.Y).edit();
                        sharedPreferences$Editor0.remove(s);
                        sharedPreferences$Editor0.apply();
                    }
                }
            }
        }
        if(uRL0 == null) {
            throw new yb.a("fingerprint not in storage found: " + ((String)g0.b0));  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setRequestMethod("HEAD");
        this.m(httpURLConnection0);
        httpURLConnection0.connect();
        int v = httpURLConnection0.getResponseCode();
        if(v < 200 || v >= 300) {
            throw new yb.b(J.d(v, "unexpected status code (", ") while resuming upload"), httpURLConnection0);
        }
        String s2 = httpURLConnection0.getHeaderField("Upload-Offset");
        if(s2 == null || s2.length() == 0) {
            throw new yb.b("missing upload offset in response for resuming upload", httpURLConnection0);
        }
        return this.e(g0, uRL0, Long.parseLong(s2));
    }

    public void s(int v, TimeUnit timeUnit0) {
        J.l(v, "backoffPolicy");
        j.f(timeUnit0, "timeUnit");
        this.a = true;
        p p0 = (p)this.c;
        p0.l = v;
        long v1 = timeUnit0.toMillis(10000L);
        String s = p.y;
        if(Long.compare(v1, 18000000L) > 0) {
            A.e().h(s, "Backoff delay duration exceeds maximum value");
        }
        if(v1 < 10000L) {
            A.e().h(s, "Backoff delay duration less than minimum value");
        }
        p0.m = I2.J.t(v1, 10000L, 18000000L);
    }

    public void t(UUID uUID0) {
        j.f(uUID0, "id");
        this.b = uUID0;
        String s = uUID0.toString();
        j.e(s, "id.toString()");
        p p0 = (p)this.c;
        j.f(p0, "other");
        int v = p0.b;
        new m(p0.e);
        new m(p0.f);
        new g(p0.j);
        this.c = new p(s, v, p0.c, p0.d, null, null, p0.g, p0.h, p0.i, null, p0.k, p0.l, p0.m, p0.n, p0.o, p0.p, p0.q, p0.r, p0.s, p0.u, p0.v, p0.w, p0.x, 0x80000);
    }

    public K1 u(long v, String s) {
        return new K1(this, s, v, 0);
    }

    public K1 v(String s, String s1) {
        return new K1(this, s, s1, 3);
    }

    public K1 w(String s, boolean z) {
        return new K1(this, s, Boolean.valueOf(z), 2);
    }

    public String x() {
        if(!this.a) {
            this.a = true;
            this.c = ((V)this.d).y().getString(((String)this.b), null);
        }
        return (String)this.c;
    }

    public void y(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = ((V)this.d).y().edit();
        sharedPreferences$Editor0.putString(((String)this.b), s);
        sharedPreferences$Editor0.apply();
        this.c = s;
    }
}

