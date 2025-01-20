package N4;

import E7.D;
import E7.n;
import I5.h;
import M4.l;
import M4.t;
import M4.y;
import Nb.j;
import a5.m;
import a5.p;
import a5.w;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookRequestError;
import f5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public abstract class i {
    public static volatile h a;
    public static final ScheduledExecutorService b;
    public static ScheduledFuture c;
    public static final c d;

    static {
        i.a = new h(16);
        i.b = Executors.newSingleThreadScheduledExecutor();
        i.d = new c(1);
    }

    public static final t a(b b0, N4.t t0, boolean z, A0.b b1) {
        boolean z1 = false;
        if(a.b(i.class)) {
            return null;
        }
        try {
            m m0 = p.h(b0.X, false);
            t t1 = io.sentry.hints.i.G(null, String.format("%s/activities", Arrays.copyOf(new Object[]{b0.X}, 1)), null, null);
            t1.i = true;
            Bundle bundle0 = t1.d == null ? new Bundle() : t1.d;
            bundle0.putString("access_token", b0.Y);
            synchronized(N4.m.c()) {
                a.b(N4.m.class);
            }
            String s = io.sentry.hints.i.v();
            if(s != null) {
                bundle0.putString("install_referrer", s);
            }
            t1.d = bundle0;
            if(m0 != null) {
                z1 = m0.a;
            }
            int v1 = t0.e(t1, l.a(), z1, z);
            if(v1 == 0) {
                return null;
            }
            b1.X += v1;
            t1.j(new M4.a(b0, t1, t0, b1, 1));
            return t1;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, i.class);
        return null;
    }

    public static final ArrayList b(h h0, A0.b b0) {
        Class class0 = i.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(h0, "appEventCollection");
            boolean z = l.e(l.a());
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: h0.q()) {
                N4.t t0 = h0.l(((b)object0));
                if(t0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                t t1 = i.a(((b)object0), t0, z, b0);
                if(t1 != null) {
                    arrayList0.add(t1);
                    if(P4.c.a) {
                        w.g0(new D(8, t1));
                    }
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public static final void c(N4.p p0) {
        Class class0 = i.class;
        if(a.b(class0)) {
            return;
        }
        try {
            D d0 = new D(7, p0);
            i.b.execute(d0);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }

    public static final void d(N4.p p0) {
        A0.b b0;
        Class class0 = i.class;
        if(a.b(class0)) {
            return;
        }
        try {
            s s0 = N4.h.E();
            i.a.i(s0);
            try {
                b0 = i.f(p0, i.a);
            }
            catch(Exception exception0) {
                Log.w("N4.i", "Caught unexpected exception while flushing app events: ", exception0);
                return;
            }
            if(b0 != null) {
                Intent intent0 = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent0.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", b0.X);
                intent0.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((q)b0.Y));
                i2.b.a(l.a()).c(intent0);
                return;
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
    }

    public static final void e(b b0, t t0, M4.w w0, N4.t t1, A0.b b1) {
        q q2;
        boolean z = true;
        Class class0 = i.class;
        if(a.b(class0)) {
            return;
        }
        try {
            FacebookRequestError facebookRequestError0 = w0.c;
            q q0 = q.X;
            q q1 = q.Z;
            if(facebookRequestError0 == null) {
                q2 = q0;
            }
            else if(facebookRequestError0.Y == -1) {
                q2 = q1;
            }
            else {
                Arrays.copyOf(new Object[]{w0.toString(), facebookRequestError0.toString()}, 2);
                q2 = q.Y;
            }
            if(facebookRequestError0 == null) {
                z = false;
            }
            t1.b(z);
            if(q2 == q1) {
                l.c().execute(new n(b0, 9, t1));
            }
            if(q2 != q0 && ((q)b1.Y) != q1) {
                b1.Y = q2;
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
    }

    public static final A0.b f(N4.p p0, h h0) {
        Class class0 = i.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(h0, "appEventCollection");
            A0.b b0 = new A0.b();  // initializer: Ljava/lang/Object;-><init>()V
            b0.Y = q.X;
            ArrayList arrayList0 = i.b(h0, b0);
            if(!arrayList0.isEmpty()) {
                io.sentry.hints.i.D(y.b0, "N4.i", "Flushing %d events due to %s.", new Object[]{((int)b0.X), p0.toString()});
                for(Object object0: arrayList0) {
                    ((t)object0).c();
                }
                return b0;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
        return null;
    }
}

