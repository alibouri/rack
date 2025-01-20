package S7;

import L7.a;
import M7.c;
import com.google.firebase.perf.metrics.Trace;

public abstract class h {
    public static final a a;

    static {
        h.a = a.d();
    }

    public static void a(Trace trace0, c c0) {
        int v = c0.a;
        if(v > 0) {
            trace0.putMetric("_fr_tot", ((long)v));
        }
        int v1 = c0.b;
        if(v1 > 0) {
            trace0.putMetric("_fr_slo", ((long)v1));
        }
        int v2 = c0.c;
        if(v2 > 0) {
            trace0.putMetric("_fr_fzn", ((long)v2));
        }
        h.a.a("Screen trace: " + trace0.b0 + " _fr_tot:" + c0.a + " _fr_slo:" + v1 + " _fr_fzn:" + v2);
    }
}

