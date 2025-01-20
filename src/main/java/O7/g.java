package O7;

import M.J;
import M7.e;
import Nb.j;
import android.os.Bundle;
import b4.A0;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import pc.a;
import pc.f;
import pc.r;
import pc.y;
import tc.b;
import tc.d;
import yc.n;

public final class g implements f {
    public final int X;
    public long Y;
    public Object Z;
    public Object b0;
    public Object c0;

    public g(int v) {
        this.X = v;
        super();
    }

    public g(f f0, R7.f f1, Timer timer0, long v) {
        this.X = 0;
        super();
        this.Z = f0;
        this.b0 = new e(f1);
        this.Y = v;
        this.c0 = timer0;
    }

    public g(d d0, TimeUnit timeUnit0) {
        this.X = 2;
        j.f(d0, "taskRunner");
        j.f(timeUnit0, "timeUnit");
        super();
        this.Y = timeUnit0.toNanos(5L);
        this.Z = d0.e();
        this.b0 = new b(this, m5.b.y(new StringBuilder(), rc.b.g, " ConnectionPool"));
        this.c0 = new ConcurrentLinkedQueue();
    }

    public boolean a(a a0, uc.g g0, List list0, boolean z) {
        j.f(g0, "call");
        Iterator iterator0 = ((ConcurrentLinkedQueue)this.c0).iterator();
        while(true) {
            boolean z1 = false;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            uc.j j0 = (uc.j)object0;
            j.e(j0, "connection");
            synchronized(j0) {
                if(z) {
                    if(j0.g != null) {
                        z1 = true;
                    }
                    if(z1) {
                        goto label_13;
                    }
                }
                else {
                label_13:
                    if(j0.i(a0, list0)) {
                        g0.c(j0);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int b(uc.j j0, long v) {
        ArrayList arrayList0 = j0.p;
        int v1 = 0;
        while(v1 < arrayList0.size()) {
            Reference reference0 = (Reference)arrayList0.get(v1);
            if(reference0.get() == null) {
                n.a.k(((uc.e)reference0).a, "A connection to " + j0.b.a.h + " was leaked. Did you forget to close a response body?");
                arrayList0.remove(v1);
                j0.j = true;
                if(arrayList0.isEmpty()) {
                    j0.q = v - this.Y;
                    return 0;
                }
                if(false) {
                    break;
                }
            }
            else {
                ++v1;
            }
        }
        return arrayList0.size();
    }

    public static g c(zzbf zzbf0) {
        Bundle bundle0 = zzbf0.Y.l();
        g g0 = new g(1);
        g0.Z = zzbf0.X;
        g0.b0 = zzbf0.Z;
        g0.c0 = bundle0;
        g0.Y = zzbf0.b0;
        return g0;
    }

    public zzbf d() {
        zzbe zzbe0 = new zzbe(new Bundle(((Bundle)this.c0)));
        return new zzbf(((String)this.Z), zzbe0, ((String)this.b0), this.Y);
    }

    @Override  // pc.f
    public void g(pc.e e0, IOException iOException0) {
        A0 a00 = e0.r();
        e e1 = (e)this.b0;
        if(a00 != null) {
            r r0 = (r)a00.b;
            if(r0 != null) {
                e1.o(r0.i().toString());
            }
            String s = (String)a00.c;
            if(s != null) {
                e1.g(s);
            }
        }
        e1.k(this.Y);
        J.n(((Timer)this.c0), e1, e1);
        ((f)this.Z).g(e0, iOException0);
    }

    @Override  // pc.f
    public void m(pc.e e0, y y0) {
        long v = ((Timer)this.c0).b();
        FirebasePerfOkHttpClient.a(y0, ((e)this.b0), this.Y, v);
        ((f)this.Z).m(e0, y0);
    }

    @Override
    public String toString() {
        return this.X == 1 ? "origin=" + ((String)this.b0) + ",name=" + ((String)this.Z) + ",params=" + ((Bundle)this.c0) : super.toString();
    }
}

