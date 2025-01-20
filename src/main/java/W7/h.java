package W7;

import I2.E;
import V7.f;
import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.e0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import d7.b;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o6.p;
import x7.a;
import y7.d;

public final class h {
    public final d a;
    public final a b;
    public final Executor c;
    public final Random d;
    public final c e;
    public final ConfigFetchHttpClient f;
    public final k g;
    public final HashMap h;
    public static final long i;
    public static final int[] j;

    static {
        h.i = TimeUnit.HOURS.toSeconds(12L);
        h.j = new int[]{2, 4, 8, 16, 0x20, 0x40, 0x80, 0x100};
    }

    public h(d d0, a a0, Executor executor0, Random random0, c c0, ConfigFetchHttpClient configFetchHttpClient0, k k0, HashMap hashMap0) {
        this.a = d0;
        this.b = a0;
        this.c = executor0;
        this.d = random0;
        this.e = c0;
        this.f = configFetchHttpClient0;
        this.g = k0;
        this.h = hashMap0;
    }

    public final g a(String s, String s1, Date date0, HashMap hashMap0) {
        String s4;
        try {
            HttpURLConnection httpURLConnection0 = this.f.b();
            HashMap hashMap1 = this.d();
            String s2 = this.g.a.getString("last_fetch_etag", null);
            b b0 = (b)this.b.get();
            Long long0 = b0 == null ? null : ((Long)((e0)((d7.c)b0).a.Y).d(null, null, true).get("_fot"));
            g g0 = this.f.fetch(httpURLConnection0, s, s1, hashMap1, s2, hashMap0, long0, date0);
            e e0 = g0.b;
            if(e0 != null) {
                synchronized(this.g.b) {
                    this.g.a.edit().putLong("last_template_version", e0.f).apply();
                }
            }
            String s3 = g0.c;
            if(s3 != null) {
                this.g.d(s3);
            }
            this.g.c(0, k.f);
            return g0;
        }
        catch(f f0) {
            k k0 = this.g;
            if(f0.X == 429 || f0.X == 502 || f0.X == 503 || f0.X == 504) {
                int v1 = k0.a().a + 1;
                long v2 = TimeUnit.MINUTES.toMillis(((long)h.j[Math.min(v1, h.j.length) - 1]));
                long v3 = v2 / 2L + ((long)this.d.nextInt(((int)v2)));
                k0.c(v1, new Date(date0.getTime() + v3));
            }
            j j0 = k0.a();
            int v4 = f0.X;
            if(j0.a <= 1) {
                switch(v4) {
                    case 401: {
                        s4 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                        throw new f(f0.X, "Fetch failed: " + s4, f0);
                    }
                    case 403: {
                        s4 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                        throw new f(f0.X, "Fetch failed: " + s4, f0);
                    }
                    case 429: {
                        break;
                    }
                    default: {
                        if(v4 == 500) {
                            s4 = "There was an internal server error.";
                        }
                        else if(v4 != 502 && v4 != 503 && v4 != 504) {
                            s4 = "The server returned an unexpected error.";
                        }
                        else {
                            s4 = "The server is unavailable. Please try again later.";
                        }
                        throw new f(f0.X, "Fetch failed: " + s4, f0);
                    }
                }
            }
            j0.b.getTime();
            throw new V7.e("Fetch was throttled.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
        }
    }

    public final p b(o6.h h0, long v, HashMap hashMap0) {
        boolean z1;
        Date date0 = new Date(System.currentTimeMillis());
        boolean z = h0.h();
        k k0 = this.g;
        Date date1 = null;
        if(z) {
            Date date2 = new Date(k0.a.getLong("last_fetch_time_in_millis", -1L));
            if(date2.equals(k.e)) {
                z1 = false;
            }
            else {
                long v1 = date2.getTime();
                z1 = date0.before(new Date(TimeUnit.SECONDS.toMillis(v) + v1));
            }
            if(z1) {
                return o6.k.e(new g(2, null, null));
            }
        }
        Date date3 = k0.a().b;
        if(date0.before(date3)) {
            date1 = date3;
        }
        Executor executor0 = this.c;
        if(date1 != null) {
            long v2 = date1.getTime();
            long v3 = date0.getTime();
            String s = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(v2 - v3));
            date1.getTime();
            return o6.k.d(new V7.e("Fetch is throttled. Please wait before calling fetch again: " + s)).d(executor0, new E7.g(this, 7, date0));  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
        }
        p p0 = ((y7.c)this.a).d();
        p p1 = ((y7.c)this.a).e();
        return o6.k.f(new o6.h[]{p0, p1}).d(executor0, new E(this, p0, p1, date0, hashMap0)).d(executor0, new E7.g(this, 7, date0));
    }

    public final p c(int v) {
        HashMap hashMap0 = new HashMap(this.h);
        hashMap0.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + v);
        o6.h h0 = this.e.b();
        E7.g g0 = new E7.g(this, 8, hashMap0);
        return h0.d(this.c, g0);
    }

    public final HashMap d() {
        HashMap hashMap0 = new HashMap();
        b b0 = (b)this.b.get();
        if(b0 == null) {
            return hashMap0;
        }
        for(Object object0: ((e0)((d7.c)b0).a.Y).d(null, null, false).entrySet()) {
            hashMap0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue().toString());
        }
        return hashMap0;
    }
}

