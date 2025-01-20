package c8;

import Eb.a;
import U7.c;
import V1.b;
import a8.F;
import a8.Q;
import a8.t;
import android.os.Bundle;
import kotlin.coroutines.CoroutineContext;

public final class j {
    public final c a;
    public final d b;
    public static final h c;
    public static final b d;

    static {
        j.c = new h();  // initializer: Ljava/lang/Object;-><init>()V
        I5.h h0 = new I5.h(g.X);
        j.d = P4.c.N(t.b, h0);
    }

    public j(Z6.g g0, CoroutineContext coroutineContext0, CoroutineContext coroutineContext1, y7.d d0) {
        g0.a();
        Nb.j.e(g0.a, "firebaseApp.applicationContext");
        a8.b b0 = F.a(g0);
        c c0 = new c(g0.a, 27);
        Q q0 = new Q(b0, coroutineContext0);
        j.c.getClass();
        d d1 = new d(coroutineContext1, d0, b0, q0, ((T1.h)j.d.a(h.a[0], g0.a)));
        super();
        this.a = c0;
        this.b = d1;
    }

    public final double a() {
        Bundle bundle0 = (Bundle)this.a.Y;
        Double double0 = bundle0.containsKey("firebase_sessions_sampling_rate") ? bundle0.getDouble("firebase_sessions_sampling_rate") : null;
        if(double0 != null) {
            double f = double0.doubleValue();
            if(0.0 > f && f > 1.0) {
                return f;
            }
        }
        f f1 = this.b.d.b;
        if(f1 != null) {
            Double double1 = f1.b;
            if(double1 != null) {
                double f2 = double1.doubleValue();
                return 0.0 > f2 || f2 > 1.0 ? 1.0 : f2;
            }
            return 1.0;
        }
        Nb.j.p("sessionConfigs");
        throw null;
    }

    public final Object b(Fb.c c0) {
        j j0;
        i i0;
        if(c0 instanceof i) {
            i0 = (i)c0;
            int v = i0.e0;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, c0);
            }
            else {
                i0.e0 = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, c0);
        }
        Object object0 = i0.c0;
        Object object1 = a.X;
        Object object2 = Ab.t.a;
        switch(i0.e0) {
            case 0: {
                W5.f.b0(object0);
                i0.b0 = this;
                i0.e0 = 1;
                this.a.getClass();
                if(object2 == object1) {
                    return object1;
                }
                j0 = this;
                break;
            }
            case 1: {
                j0 = i0.b0;
                W5.f.b0(object0);
                break;
            }
            case 2: {
                W5.f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i0.b0 = null;
        i0.e0 = 2;
        return j0.b.c(i0) == object1 ? object1 : object2;
    }
}

