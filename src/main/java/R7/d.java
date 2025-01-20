package R7;

import H6.e;
import I7.a;
import I7.i;
import S7.g;
import T7.w;
import android.content.Context;
import com.google.protobuf.t;
import java.util.Random;

public final class d {
    public final a a;
    public final double b;
    public final double c;
    public final c d;
    public final c e;

    public d(Context context0, g g0) {
        e e0 = new e(11);
        double f = new Random().nextDouble();
        double f1 = new Random().nextDouble();
        a a0 = a.e();
        super();
        this.d = null;
        this.e = null;
        boolean z = false;
        if(Double.compare(0.0, f) > 0 || f < 1.0) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if(0.0 > f1 && f1 >= 1.0) {
            z = true;
        }
        if(!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.b = f;
        this.c = f1;
        this.a = a0;
        this.d = new c(g0, e0, a0, "Trace");
        this.e = new c(g0, e0, a0, "Network");
        android.support.v4.media.session.a.G(context0);
    }

    public static boolean a(t t0) {
        return t0.size() > 0 && ((w)t0.get(0)).x() > 0 && ((w)t0.get(0)).w() == 2;
    }

    public final boolean b() {
        I7.e e0;
        double f;
        a a0 = this.a;
        a0.getClass();
        synchronized(I7.e.class) {
            if(I7.e.b == null) {
                I7.e.b = new I7.e();  // initializer: Ljava/lang/Object;-><init>()V
            }
            e0 = I7.e.b;
        }
        S7.d d0 = a0.k(e0);
        if(d0.b()) {
            f = ((double)(((Double)d0.a()))) / 100.0;
            if(!a.v(f)) {
                goto label_15;
            }
        }
        else {
        label_15:
            S7.d d1 = a0.a.getDouble("fpr_vc_fragment_sampling_rate");
            if(d1.b() && a.v(((double)(((Double)d1.a()))))) {
                double f1 = (double)(((Double)d1.a()));
                a0.c.e("com.google.firebase.perf.FragmentSamplingRate", f1);
                f = (double)(((Double)d1.a()));
                return this.c < f;
            }
            S7.d d2 = a0.b(e0);
            f = !d2.b() || !a.v(((double)(((Double)d2.a())))) ? 0.0 : ((double)(((Double)d2.a())));
        }
        return this.c < f;
    }

    public final boolean c() {
        i i0;
        double f1;
        a a0 = this.a;
        a0.getClass();
        synchronized(i.class) {
            if(i.b == null) {
                i.b = new i();  // initializer: Ljava/lang/Object;-><init>()V
            }
            i0 = i.b;
        }
        i0.getClass();
        S7.d d0 = a0.a.getDouble("fpr_vc_network_request_sampling_rate");
        if(d0.b() && a.v(((double)(((Double)d0.a()))))) {
            double f = (double)(((Double)d0.a()));
            a0.c.e("com.google.firebase.perf.NetworkRequestSamplingRate", f);
            f1 = (double)(((Double)d0.a()));
            return this.b < f1;
        }
        S7.d d1 = a0.b(i0);
        if(d1.b() && a.v(((double)(((Double)d1.a()))))) {
            f1 = (double)(((Double)d1.a()));
            return this.b < f1;
        }
        f1 = a0.a.isLastFetchFailed() ? 0.001 : 1.0;
        return this.b < f1;
    }
}

