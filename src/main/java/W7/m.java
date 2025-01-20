package W7;

import S5.b;
import Z6.g;
import Z6.i;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.N0;
import org.json.JSONObject;
import y7.d;

public final class m {
    public final LinkedHashSet a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public final ScheduledExecutorService f;
    public final h g;
    public final g h;
    public final d i;
    public final c j;
    public final Context k;
    public final String l;
    public final Random m;
    public final b n;
    public final k o;
    public static final int[] p;
    public static final Pattern q;

    static {
        m.p = new int[]{2, 4, 8, 16, 0x20, 0x40, 0x80, 0x100};
        m.q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }

    public m(g g0, d d0, h h0, c c0, Context context0, String s, LinkedHashSet linkedHashSet0, k k0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = linkedHashSet0;
        this.b = false;
        this.f = scheduledExecutorService0;
        this.m = new Random();
        this.c = Math.max(8 - k0.b().a, 1);
        this.n = b.a;
        this.h = g0;
        this.g = h0;
        this.i = d0;
        this.j = c0;
        this.k = context0;
        this.l = s;
        this.o = k0;
        this.d = false;
        this.e = false;
    }

    public final boolean a() {
        synchronized(this) {
        }
        return !this.a.isEmpty() && !this.b && !this.d && !this.e;
    }

    public static void b(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
            try {
                httpURLConnection0.getInputStream().close();
                if(httpURLConnection0.getErrorStream() != null) {
                    httpURLConnection0.getErrorStream().close();
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public final String c(String s) {
        this.h.a();
        Matcher matcher0 = m.q.matcher(this.h.c.b);
        return matcher0.matches() ? "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + matcher0.group(1) + "/namespaces/" + s + ":streamFetchInvalidations" : "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + null + "/namespaces/" + s + ":streamFetchInvalidations";
    }

    public static boolean d(int v) {
        return v == 408 || v == 429 || v == 502 || v == 503 || v == 504;
    }

    public final void e(long v) {
        synchronized(this) {
            if(!this.a()) {
                return;
            }
            int v2 = this.c;
            if(v2 > 0) {
                this.c = v2 - 1;
                E5.d d0 = new E5.d(13, this);
                this.f.schedule(d0, v, TimeUnit.MILLISECONDS);
            }
            else if(!this.e) {
                new V7.c("Unable to connect to the server. Check your connection and try again.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
                this.g();
            }
        }
    }

    public static String f(InputStream inputStream0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
            }
            return stringBuilder0.toString();
        }
        catch(IOException unused_ex) {
            return stringBuilder0.length() == 0 ? "Unable to connect to the server, access is forbidden. HTTP status code: 403" : stringBuilder0.toString();
        }
    }

    public final void g() {
        synchronized(this) {
            for(Object object0: this.a) {
                ((l)object0).a();
            }
        }
    }

    public final void h() {
        synchronized(this) {
            this.n.getClass();
            this.e(Math.max(0L, this.o.b().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
        }
    }

    public final void i(boolean z) {
        synchronized(this) {
            this.b = z;
        }
    }

    public final void j(HttpURLConnection httpURLConnection0, String s, String s1) {
        String s3;
        httpURLConnection0.setRequestMethod("POST");
        httpURLConnection0.setRequestProperty("X-Goog-Firebase-Installations-Auth", s1);
        g g0 = this.h;
        g0.a();
        i i0 = g0.c;
        httpURLConnection0.setRequestProperty("X-Goog-Api-Key", i0.a);
        httpURLConnection0.setRequestProperty("X-Android-Package", "com.wave.personal");
        String s2 = null;
        try {
            byte[] arr_b = S5.c.c(this.k, "com.wave.personal");
            if(arr_b == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: com.wave.personal");
                goto label_15;
            }
            else {
                s3 = S5.c.a(arr_b);
            }
            goto label_16;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        label_14:
            Log.i("FirebaseRemoteConfig", "No such package: com.wave.personal");
        }
        try {
        label_15:
            s3 = null;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            goto label_14;
        }
    label_16:
        httpURLConnection0.setRequestProperty("X-Android-Cert", s3);
        httpURLConnection0.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection0.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept", "application/json");
        HashMap hashMap0 = new HashMap();
        g0.a();
        Matcher matcher0 = m.q.matcher(i0.b);
        if(matcher0.matches()) {
            s2 = matcher0.group(1);
        }
        hashMap0.put("project", s2);
        hashMap0.put("namespace", this.l);
        hashMap0.put("lastKnownVersionNumber", Long.toString(this.g.g.a.getLong("last_template_version", 0L)));
        g0.a();
        hashMap0.put("appId", i0.b);
        hashMap0.put("sdkVersion", "22.0.1");
        hashMap0.put("appInstanceId", s);
        byte[] arr_b1 = new JSONObject(hashMap0).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
        bufferedOutputStream0.write(arr_b1);
        bufferedOutputStream0.flush();
        bufferedOutputStream0.close();
    }

    public final N0 k(HttpURLConnection httpURLConnection0) {
        synchronized(this) {
            l l0 = new l(this);
            return new N0(httpURLConnection0, this.g, this.j, this.a, l0, this.f);
        }
    }

    public final void l(Date date0) {
        int v = this.o.b().a + 1;
        long v1 = TimeUnit.MINUTES.toMillis(((long)m.p[(v >= 8 ? 8 : v) - 1]));
        long v2 = v1 / 2L + ((long)this.m.nextInt(((int)v1)));
        this.o.e(v, new Date(date0.getTime() + v2));
    }
}

