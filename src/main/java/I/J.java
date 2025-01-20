package i;

import Ab.k;
import android.app.Service;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import b4.u0;
import com.google.android.gms.internal.measurement.E1;
import com.sendwave.components.RequestListener;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import io.sentry.O;
import io.sentry.s0;
import io.sentry.y;
import j6.B0;
import j6.L;
import j6.N;
import j6.Y;
import j6.Z;
import j6.d0;
import j6.f;
import j6.k1;
import j6.p0;
import j6.q1;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import lc.b;
import mc.d;
import n.A;
import n.i;
import n.j;
import n.t;
import org.chromium.net.c;
import p9.u;
import s.o;
import u.F;
import u.G;
import u.P;
import u.a;
import v.C;
import v.h;
import z0.n;
import z0.p;

public final class J implements RequestListener, O, q1, b, i, t, c, C {
    public final int X;
    public Object Y;

    public J(int v) {
        this.X = v;
        switch(v) {
            case 6: {
                io.sentry.android.core.C c0 = new io.sentry.android.core.C(s0.X);
                super();
                this.Y = c0;
                return;
            }
            case 7: {
                super();
                this.Y = new EnumMap(p0.class);
                return;
            }
            case 18: {
                super();
                this.Y = new LinkedHashMap(0, 0.75f, true);
                return;
            }
            case 21: {
                super();
                this.Y = new o(null);
                return;
            }
            default: {
                ScheduledExecutorService scheduledExecutorService0 = Executors.newSingleThreadScheduledExecutor(new y(1));
                super();
                this.Y = scheduledExecutorService0;
            }
        }
    }

    public J(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public J(int v, boolean z) {
        this.X = v;
        super();
    }

    public J(Density density0) {
        this.X = 19;
        super();
        this.Y = new u0(P.a, density0);
    }

    public J(BalloonAnchorOverlayView balloonAnchorOverlayView0, BalloonAnchorOverlayView balloonAnchorOverlayView1) {
        this.X = 20;
        super();
        this.Y = balloonAnchorOverlayView0;
    }

    public J(EnumMap enumMap0) {
        this.X = 7;
        super();
        EnumMap enumMap1 = new EnumMap(p0.class);
        this.Y = enumMap1;
        enumMap1.putAll(enumMap0);
    }

    @Override  // v.C
    public long a(float f) {
        return ((long)(Math.exp(((u0)this.Y).g(f) / (((double)G.a) - 1.0)) * 1000.0)) * 1000000L;
    }

    @Override  // n.t
    public void b(j j0, boolean z) {
        if(j0 instanceof A) {
            ((A)j0).z.k().c(false);
        }
        t t0 = ((ActionMenuPresenter)this.Y).c0;
        if(t0 != null) {
            t0.b(j0, z);
        }
    }

    @Override  // v.C
    public float c() {
        return 0.0f;
    }

    @Override  // v.C
    public float d(float f, float f1) {
        double f2 = ((u0)this.Y).g(f1);
        return Math.signum(f1) * ((float)(Math.exp(((double)G.a) / (((double)G.a) - 1.0) * f2) * ((double)(((u0)this.Y).a * ((u0)this.Y).b)))) + f;
    }

    @Override  // io.sentry.O
    public boolean e() {
        synchronized(((ScheduledExecutorService)this.Y)) {
        }
        return ((ScheduledExecutorService)this.Y).isShutdown();
    }

    @Override  // n.i
    public boolean f(j j0, MenuItem menuItem0) {
        Toolbar toolbar0 = (Toolbar)this.Y;
        return false;
    }

    @Override  // j6.q1
    public void g(String s, String s1, Bundle bundle0) {
        boolean z = TextUtils.isEmpty(s);
        k1 k10 = (k1)this.Y;
        if(z) {
            d0 d00 = k10.j0;
            if(d00 != null) {
                d0.h(d00.g0);
                d00.g0.e0.b(s1, "AppId not known when logging event");
            }
        }
        else {
            k10.c().z(new B0(this, s, s1, bundle0));
        }
    }

    @Override  // v.C
    public float h(float f, long v) {
        F f1 = ((u0)this.Y).f(f);
        a a0 = u.b.a((f1.c <= 0L ? 1.0f : ((float)(v / 1000000L)) / ((float)f1.c)));
        return Math.signum(f1.a) * a0.b * f1.b / ((float)f1.c) * 1000.0f;
    }

    @Override  // io.sentry.O
    public void i(long v) {
        synchronized(((ScheduledExecutorService)this.Y)) {
            if(!((ScheduledExecutorService)this.Y).isShutdown()) {
                ((ScheduledExecutorService)this.Y).shutdown();
                try {
                    if(!((ScheduledExecutorService)this.Y).awaitTermination(v, TimeUnit.MILLISECONDS)) {
                        ((ScheduledExecutorService)this.Y).shutdownNow();
                    }
                }
                catch(InterruptedException unused_ex) {
                    ((ScheduledExecutorService)this.Y).shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override  // n.t
    public boolean j(j j0) {
        ActionMenuPresenter actionMenuPresenter0 = (ActionMenuPresenter)this.Y;
        if(j0 == actionMenuPresenter0.Z) {
            return false;
        }
        ((A)j0).A.getClass();
        actionMenuPresenter0.getClass();
        return actionMenuPresenter0.c0 == null ? false : actionMenuPresenter0.c0.j(j0);
    }

    @Override  // v.C
    public float k(float f, float f1, long v) {
        F f2 = ((u0)this.Y).f(f1);
        a a0 = u.b.a((f2.c <= 0L ? 1.0f : ((float)(v / 1000000L)) / ((float)f2.c)));
        return Math.signum(f2.a) * f2.b * a0.a + f;
    }

    public void l(io.sentry.android.core.G g0) {
        ((io.sentry.android.core.C)this.Y).getClass();
        if(Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 28) {
            String s = g0.getCallingPackage();
            if(s == null || !s.equals("com.wave.personal")) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }

    @Override  // n.i
    public void m(j j0) {
        Toolbar toolbar0 = (Toolbar)this.Y;
        ActionMenuPresenter actionMenuPresenter0 = toolbar0.b0.u0;
        if(actionMenuPresenter0 == null || !actionMenuPresenter0.g()) {
            for(Object object0: toolbar0.H0.b) {
                ((c2.F)object0).a.t();
            }
        }
        g.a a0 = toolbar0.P0;
        if(a0 != null) {
            a0.m(j0);
        }
    }

    @Override  // io.sentry.O
    public Future n(long v, Runnable runnable0) {
        return ((ScheduledExecutorService)this.Y).schedule(runnable0, v, TimeUnit.MILLISECONDS);
    }

    public d6.a o(E1 e10, AndroidComposeView androidComposeView0) {
        int v7;
        ArrayList arrayList1;
        int v6;
        boolean z;
        long v3;
        long v2;
        ArrayList arrayList0 = (ArrayList)e10.Y;
        o o0 = new o(arrayList0.size());
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            p p0 = (p)arrayList0.get(v1);
            o o1 = (o)this.Y;
            z0.o o2 = (z0.o)o1.e(p0.a);
            if(o2 == null) {
                v2 = p0.b;
                v3 = p0.d;
                z = false;
            }
            else {
                long v4 = androidComposeView0.G(o2.b);
                z = o2.c;
                v3 = v4;
                v2 = o2.a;
            }
            n n0 = new n(p0.a, p0.b, p0.d, p0.e, p0.f, v2, v3, z, p0.g, p0.i, p0.j, p0.k);
            o0.j(p0.a, n0);
            long v5 = p0.a;
            boolean z1 = p0.e;
            if(z1) {
                v6 = v1;
                arrayList1 = arrayList0;
                v7 = v;
                o1.j(v5, new z0.o(p0.b, p0.c, z1));
            }
            else {
                arrayList1 = arrayList0;
                v7 = v;
                v6 = v1;
                o1.k(v5);
            }
            v1 = v6 + 1;
            arrayList0 = arrayList1;
            v = v7;
        }
        d6.a a0 = new d6.a();  // initializer: Ljava/lang/Object;-><init>()V
        a0.Y = o0;
        a0.Z = e10;
        return a0;
    }

    @Override  // lc.b
    public void p(d d0) {
        ((Function0)this.Y).invoke();
    }

    public void q(int v) {
        RecyclerView recyclerView0 = (RecyclerView)this.Y;
        View view0 = recyclerView0.getChildAt(v);
        if(view0 != null) {
            recyclerView0.r(view0);
            view0.clearAnimation();
        }
        recyclerView0.removeViewAt(v);
    }

    public void r(int v, String s, List list0, boolean z, boolean z1) {
        N n0;
        int v1 = Z.a[h.d(v)];
        Y y0 = (Y)this.Y;
        switch(v1) {
            case 1: {
                n0 = y0.b().l0;
                break;
            }
            case 2: {
                if(z) {
                    n0 = y0.b().f0;
                }
                else if(z1) {
                    n0 = y0.b().e0;
                }
                else {
                    n0 = y0.b().g0;
                }
                break;
            }
            case 3: {
                if(z) {
                    n0 = y0.b().i0;
                }
                else {
                    n0 = z1 ? y0.b().h0 : y0.b().j0;
                }
                break;
            }
            default: {
                n0 = v1 == 4 ? y0.b().m0 : y0.b().k0;
            }
        }
        switch(list0.size()) {
            case 1: {
                n0.b(list0.get(0), s);
                return;
            }
            case 2: {
                n0.c(list0.get(0), s, list0.get(1));
                return;
            }
            case 3: {
                n0.e(s, list0.get(0), list0.get(1), list0.get(2));
                return;
            }
            default: {
                n0.d(s);
            }
        }
    }

    public void s(p0 p00, int v) {
        f f0 = f.Y;
        switch(v) {
            case -30: {
                f0 = f.f0;
                break;
            }
            case -10: {
                f0 = f.c0;
                break;
            }
            case -20: 
            case 0: {
                f0 = f.e0;
                break;
            }
            default: {
                if(v == 30) {
                    f0 = f.d0;
                }
            }
        }
        ((EnumMap)this.Y).put(p00, f0);
    }

    @Override  // io.sentry.O
    public Future submit(Runnable runnable0) {
        return ((ScheduledExecutorService)this.Y).submit(runnable0);
    }

    public void t(p0 p00, f f0) {
        ((EnumMap)this.Y).put(p00, f0);
    }

    @Override
    public String toString() {
        if(this.X != 7) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder("1");
        p0[] arr_p0 = p0.values();
        for(int v = 0; v < arr_p0.length; ++v) {
            f f0 = (f)((EnumMap)this.Y).get(arr_p0[v]);
            if(f0 == null) {
                f0 = f.Y;
            }
            stringBuilder0.append(f0.X);
        }
        return stringBuilder0.toString();
    }

    public L u() {
        d0 d00 = d0.d(((Service)this.Y), null, null);
        d0.h(d00.g0);
        return d00.g0;
    }

    @Override  // com.sendwave.components.RequestListener
    public void w(int v, int v1, String s, String s1) {
        String s4;
        if(this.X != 1) {
            ((f9.A)this.Y).b(v, v1, s, s1);
            return;
        }
        u u0 = (u)this.Y;
        u0.getClass();
        Nb.j.f(s, "newText");
        Nb.j.f(s1, "oldText");
        String s2 = Vb.j.l0(s1, v, v1, s).toString();
        f9.L l0 = (f9.L)u0.d0.a(u.r0[2], u0);
        k k0 = l0 == null ? new k(s2, s2.length()) : l0.c(s.length() + v, s2);
        String s3 = (String)k0.X;
        int v2 = ((Number)k0.Y).intValue();
        f9.L l1 = (f9.L)u0.d0.a(u.r0[2], u0);
        if(l1 == null) {
            s4 = s3;
        }
        else {
            s4 = l1.a(s3);
            if(s4 == null) {
                s4 = s3;
            }
        }
        u0.j0.k(s4);
        u0.i0.k(s3);
        u0.m0.getClass();
        u0.m0.l(null, v2);
    }

    @Override  // org.chromium.net.c
    public FileChannel z() {
        return new FileInputStream(((File)this.Y)).getChannel();
    }
}

