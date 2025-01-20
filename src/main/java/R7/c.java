package R7;

import H6.e;
import I7.s;
import I7.t;
import L7.a;
import S7.d;
import S7.f;
import S7.g;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;

public final class c {
    public Timer a;
    public g b;
    public long c;
    public double d;
    public final g e;
    public final g f;
    public final long g;
    public final long h;
    public static final long i;

    static {
        a.d();
        c.i = TimeUnit.SECONDS.toMicros(1L);
    }

    public c(g g0, e e0, I7.a a0, String s) {
        t t0;
        long v3;
        this.c = 500L;
        this.b = g0;
        this.d = 500.0;
        this.a = new Timer();
        long v = a0.o();
        if(s == "Trace") {
            synchronized(t.class) {
                if(t.b == null) {
                    t.b = new t();  // initializer: Ljava/lang/Object;-><init>()V
                }
                t0 = t.b;
            }
            t0.getClass();
            d d0 = a0.a.getLong("fpr_rl_trace_event_count_fg");
            if(!d0.b() || !I7.a.r(((long)(((Long)d0.a()))))) {
                d d1 = a0.c(t0);
                v3 = !d1.b() || !I7.a.r(((long)(((Long)d1.a())))) ? 300L : ((long)(((Long)d1.a())));
            }
            else {
                long v2 = (long)(((Long)d0.a()));
                a0.c.d(v2, "com.google.firebase.perf.TraceEventCountForeground");
                v3 = (long)(((Long)d0.a()));
            }
        }
        else {
            v3 = a0.n();
        }
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        this.e = new g(v3, v, timeUnit0);
        this.g = v3;
        long v4 = a0.o();
        long v5 = c.c(a0, s);
        this.f = new g(v5, v4, timeUnit0);
        this.h = v5;
    }

    public final void a(boolean z) {
        synchronized(this) {
            this.b = z ? this.e : this.f;
            this.c = z ? this.g : this.h;
        }
    }

    public final boolean b() {
        double f1;
        synchronized(this) {
            Timer timer0 = new Timer();
            Timer timer1 = this.a;
            timer1.getClass();
            double f = (double)(timer0.Y - timer1.Y);
            g g0 = this.b;
            g0.getClass();
            TimeUnit timeUnit0 = (TimeUnit)g0.c;
            long v1 = g0.b;
            long v2 = g0.a;
            switch(f.a[timeUnit0.ordinal()]) {
                case 1: {
                    f1 = ((double)v2) / ((double)v1) * ((double)TimeUnit.SECONDS.toNanos(1L));
                    break;
                }
                case 2: {
                    f1 = ((double)v2) / ((double)v1) * ((double)TimeUnit.SECONDS.toMicros(1L));
                    break;
                }
                case 3: {
                    f1 = ((double)v2) / ((double)v1) * ((double)TimeUnit.SECONDS.toMillis(1L));
                    break;
                }
                default: {
                    f1 = ((double)v2) / ((double)timeUnit0.toSeconds(v1));
                }
            }
            double f2 = f * f1 / ((double)c.i);
            if(f2 > 0.0) {
                this.d = Math.min(this.d + f2, this.c);
                this.a = timer0;
            }
            double f3 = this.d;
            if(f3 >= 1.0) {
                this.d = f3 - 1.0;
                return true;
            }
            return false;
        }
    }

    public static long c(I7.a a0, String s) {
        s s1;
        if(s == "Trace") {
            a0.getClass();
            synchronized(s.class) {
                if(s.b == null) {
                    s.b = new s();  // initializer: Ljava/lang/Object;-><init>()V
                }
                s1 = s.b;
            }
            s1.getClass();
            d d0 = a0.a.getLong("fpr_rl_trace_event_count_bg");
            if(d0.b() && I7.a.r(((long)(((Long)d0.a()))))) {
                long v1 = (long)(((Long)d0.a()));
                a0.c.d(v1, "com.google.firebase.perf.TraceEventCountBackground");
                return (long)(((Long)d0.a()));
            }
            d d1 = a0.c(s1);
            return !d1.b() || !I7.a.r(((long)(((Long)d1.a())))) ? 30L : ((long)(((Long)d1.a())));
        }
        return a0.m();
    }
}

