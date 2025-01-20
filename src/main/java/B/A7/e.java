package A7;

import java.util.concurrent.TimeUnit;
import v7.d;
import y7.j;

public final class e {
    public final j a;
    public long b;
    public int c;
    public static final long d;
    public static final long e;

    static {
        e.d = TimeUnit.HOURS.toMillis(24L);
        e.e = TimeUnit.MINUTES.toMillis(30L);
    }

    public e() {
        if(d.Y == null) {
            d.Y = new d(1);
        }
        d d0 = d.Y;
        if(j.d == null) {
            j.d = new j(d0);
        }
        this.a = j.d;
    }

    public final long a(int v) {
        double f;
        synchronized(this) {
            if(v != 429 && (v < 500 || v >= 600)) {
                return e.d;
            }
            f = Math.pow(2.0, this.c);
            this.a.getClass();
        }
        return (long)Math.min(f + ((double)(((long)(Math.random() * 1000.0)))), e.e);
    }

    public final boolean b() {
        boolean z;
        synchronized(this) {
            if(this.c == 0) {
                z = true;
            }
            else {
                this.a.a.getClass();
                z = System.currentTimeMillis() <= this.b ? false : true;
            }
            return z;
        }
    }

    public final void c() {
        synchronized(this) {
            this.c = 0;
        }
    }

    public final void d(int v) {
        synchronized(this) {
            if((v < 200 || v >= 300) && (v != 401 && v != 404)) {
                ++this.c;
                long v2 = this.a(v);
                this.a.a.getClass();
                this.b = System.currentTimeMillis() + v2;
                return;
            }
            this.c();
        }
    }
}

