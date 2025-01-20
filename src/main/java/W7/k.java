package W7;

import android.content.SharedPreferences;
import java.util.Date;

public final class k {
    public final SharedPreferences a;
    public final Object b;
    public final Object c;
    public final Object d;
    public static final Date e;
    public static final Date f;

    static {
        k.e = new Date(-1L);
        k.f = new Date(-1L);
    }

    public k(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }

    public final j a() {
        synchronized(this.c) {
            int v1 = this.a.getInt("num_failed_fetches", 0);
            Date date0 = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            j j0 = new j();  // initializer: Ljava/lang/Object;-><init>()V
            j0.a = v1;
            j0.b = date0;
            return j0;
        }
    }

    public final j b() {
        synchronized(this.d) {
            int v1 = this.a.getInt("num_failed_realtime_streams", 0);
            Date date0 = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L));
            j j0 = new j();  // initializer: Ljava/lang/Object;-><init>()V
            j0.a = v1;
            j0.b = date0;
            return j0;
        }
    }

    public final void c(int v, Date date0) {
        synchronized(this.c) {
            this.a.edit().putInt("num_failed_fetches", v).putLong("backoff_end_time_in_millis", date0.getTime()).apply();
        }
    }

    public final void d(String s) {
        synchronized(this.b) {
            this.a.edit().putString("last_fetch_etag", s).apply();
        }
    }

    public final void e(int v, Date date0) {
        synchronized(this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", v).putLong("realtime_backoff_end_time_in_millis", date0.getTime()).apply();
        }
    }

    public final void f() {
        synchronized(this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void g() {
        synchronized(this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}

