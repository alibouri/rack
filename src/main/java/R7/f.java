package R7;

import E7.h;
import E7.l;
import H7.b;
import H7.c;
import M.J;
import T7.A;
import T7.e;
import T7.i;
import T7.o;
import T7.r;
import T7.s;
import T7.t;
import T7.u;
import Z6.g;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.n;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o6.k;
import x7.a;
import y7.d;

public final class f implements b {
    public final ConcurrentHashMap X;
    public final ConcurrentLinkedQueue Y;
    public final AtomicBoolean Z;
    public g b0;
    public G7.b c0;
    public d d0;
    public a e0;
    public R7.a f0;
    public final ThreadPoolExecutor g0;
    public Context h0;
    public I7.a i0;
    public R7.d j0;
    public c k0;
    public e l0;
    public String m0;
    public String n0;
    public boolean o0;
    public static final L7.a p0;
    public static final f q0;

    static {
        f.p0 = L7.a.d();
        f.q0 = new f();
    }

    public f() {
        this.Y = new ConcurrentLinkedQueue();
        this.Z = new AtomicBoolean(false);
        this.o0 = false;
        this.g0 = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.X = concurrentHashMap0;
        Integer integer0 = 50;
        concurrentHashMap0.put("KEY_AVAILABLE_TRACES_FOR_CACHING", integer0);
        concurrentHashMap0.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", integer0);
        concurrentHashMap0.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", integer0);
    }

    public static String a(u u0) {
        if(u0.d()) {
            A a0 = u0.e();
            return "trace metric: " + a0.J() + " (duration: " + new DecimalFormat("#.####").format(((double)a0.I()) / 1000.0) + "ms)";
        }
        if(u0.f()) {
            r r0 = u0.g();
            String s = new DecimalFormat("#.####").format(((double)(r0.Y() ? r0.P() : 0L)) / 1000.0);
            StringBuilder stringBuilder0 = new StringBuilder("network request trace: ");
            stringBuilder0.append(r0.R());
            stringBuilder0.append(" (responseCode: ");
            stringBuilder0.append((r0.U() ? String.valueOf(r0.K()) : "UNKNOWN"));
            stringBuilder0.append(", responseTime: ");
            return m5.b.y(stringBuilder0, s, "ms)");
        }
        if(u0.b()) {
            o o0 = u0.c();
            StringBuilder stringBuilder1 = new StringBuilder("gauges (hasMetadata: ");
            stringBuilder1.append(o0.C());
            stringBuilder1.append(", cpuGaugeCount: ");
            stringBuilder1.append(o0.z());
            stringBuilder1.append(", memoryGaugeCount: ");
            return J.f(stringBuilder1, o0.y(), ")");
        }
        return "log";
    }

    public final void b(t t0) {
        if(t0.d()) {
            this.k0.b("_fstec");
            return;
        }
        if(t0.f()) {
            this.k0.b("_fsntc");
        }
    }

    public final void c(A a0, i i0) {
        h h0 = new h(this, a0, i0, 7);
        this.g0.execute(h0);
    }

    public final void d(s s0, i i0) {
        I7.u u0;
        int v4;
        double f1;
        boolean z;
        String s1;
        if(!this.Z.get()) {
            ConcurrentHashMap concurrentHashMap0 = this.X;
            Integer integer0 = (Integer)concurrentHashMap0.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int v = (int)integer0;
            Integer integer1 = (Integer)concurrentHashMap0.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int v1 = (int)integer1;
            Integer integer2 = (Integer)concurrentHashMap0.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int v2 = (int)integer2;
            if(s0.d() && v > 0) {
                concurrentHashMap0.put("KEY_AVAILABLE_TRACES_FOR_CACHING", ((int)(v - 1)));
                goto label_16;
            }
            boolean z1 = false;
            if(s0.f() && v1 > 0) {
                z1 = true;
                concurrentHashMap0.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", ((int)(v1 - 1)));
            }
            else if(s0.b() && v2 > 0) {
                z1 = true;
                concurrentHashMap0.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", ((int)(v2 - 1)));
            }
            if(z1) {
            label_16:
                Object[] arr_object = {f.a(s0)};
                f.p0.b("Transport is not initialized yet, %s will be queued for to be dispatched later", arr_object);
                R7.b b0 = new R7.b(s0, i0);
                this.Y.add(b0);
                return;
            }
            Object[] arr_object1 = {f.a(s0), integer0, integer1, integer2};
            f.p0.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", arr_object1);
            return;
        }
        L7.a a0 = f.p0;
        if(this.i0.u() && (!((T7.g)this.l0.Y).C() || this.o0)) {
            try {
                s1 = (String)k.b(((y7.c)this.d0).d(), 60000L, TimeUnit.MILLISECONDS);
                goto label_37;
            }
            catch(ExecutionException executionException0) {
                a0.c("Unable to retrieve Installation Id: %s", new Object[]{executionException0.getMessage()});
            }
            catch(InterruptedException interruptedException0) {
                a0.c("Task to retrieve Installation Id is interrupted: %s", new Object[]{interruptedException0.getMessage()});
            }
            catch(TimeoutException timeoutException0) {
                a0.c("Task to retrieve Installation Id is timed out: %s", new Object[]{timeoutException0.getMessage()});
            }
            s1 = null;
        label_37:
            if(TextUtils.isEmpty(s1)) {
                a0.f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
            else {
                e e0 = this.l0;
                e0.j();
                T7.g.x(((T7.g)e0.Y), s1);
            }
        }
        e e1 = this.l0;
        e1.j();
        T7.g.v(((T7.g)e1.Y), i0);
        if(s0.d() || s0.f()) {
            n n0 = (n)e1.X.m(5);
            n0.Y = e1.i();
            e1 = (e)n0;
            if(this.c0 == null && this.Z.get()) {
                this.c0 = (G7.b)g.c().b(G7.b.class);
            }
            G7.b b1 = this.c0;
            Map map0 = b1 == null ? Collections.emptyMap() : new HashMap(b1.a);
            e1.j();
            T7.g.w(((T7.g)e1.Y)).putAll(map0);
        }
        s0.j();
        t.u(((t)s0.Y), ((T7.g)e1.h()));
        t t0 = (t)s0.h();
        if(!this.i0.u()) {
            Object[] arr_object2 = {f.a(t0)};
            f.p0.e("Performance collection is not enabled, dropping %s", arr_object2);
            z = false;
        }
        else if(t0.y().C()) {
            Context context0 = this.h0;
            ArrayList arrayList0 = new ArrayList();
            if(t0.d()) {
                arrayList0.add(new N7.d(t0.e()));
            }
            if(t0.f()) {
                arrayList0.add(new N7.c(t0.g(), context0));
            }
            if(t0.z()) {
                arrayList0.add(new N7.a(t0.y()));
            }
            if(t0.b()) {
                arrayList0.add(new N7.b(t0.c()));
            }
            if(arrayList0.isEmpty()) {
                L7.a.d().a("No validators found for PerfMetric.");
            }
            else {
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_92;
                    }
                    Object object0 = iterator0.next();
                    if(!((N7.e)object0).a()) {
                        break;
                    }
                }
            }
            Object[] arr_object4 = {f.a(t0)};
            f.p0.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", arr_object4);
            goto label_123;
        label_92:
            R7.d d0 = this.j0;
            d0.getClass();
            if(t0.d()) {
                I7.a a1 = d0.a;
                a1.getClass();
                synchronized(I7.u.class) {
                    if(I7.u.b == null) {
                        I7.u.b = new I7.u();  // initializer: Ljava/lang/Object;-><init>()V
                    }
                    u0 = I7.u.b;
                }
                u0.getClass();
                S7.d d1 = a1.a.getDouble("fpr_vc_trace_sampling_rate");
                if(!d1.b() || !I7.a.v(((double)(((Double)d1.a()))))) {
                    S7.d d2 = a1.b(u0);
                    if(!d2.b() || !I7.a.v(((double)(((Double)d2.a()))))) {
                        f1 = a1.a.isLastFetchFailed() ? 0.001 : 1.0;
                    }
                    else {
                        f1 = (double)(((Double)d2.a()));
                    }
                }
                else {
                    double f = (double)(((Double)d1.a()));
                    a1.c.e("com.google.firebase.perf.TraceSamplingRate", f);
                    f1 = (double)(((Double)d1.a()));
                }
                if(d0.b >= f1 && !R7.d.a(t0.e().K())) {
                    goto label_120;
                }
                else {
                    goto label_119;
                }
            }
            else {
            label_119:
                if((!t0.d() || !t0.e().J().startsWith("_st_") || !t0.e().D() || d0.b() || R7.d.a(t0.e().K())) && (!t0.f() || d0.c() || R7.d.a(t0.g().L()))) {
                    R7.d d3 = this.j0;
                    d3.getClass();
                    if(t0.d() && (t0.e().J().equals("_fs") || t0.e().J().equals("_bs")) && t0.e().E() > 0 || t0.b()) {
                        v4 = 0;
                    }
                    else if(t0.f()) {
                        v4 = !d3.e.b();
                    }
                    else if(t0.d()) {
                        v4 = !d3.d.b();
                    }
                    else {
                        v4 = 1;
                    }
                    if(v4 == 0) {
                        z = true;
                    }
                    else {
                        this.b(t0);
                        Object[] arr_object6 = {f.a(t0)};
                        f.p0.e("Rate limited (per device) - %s", arr_object6);
                        z = false;
                    }
                }
                else {
                label_120:
                    this.b(t0);
                    Object[] arr_object5 = {f.a(t0)};
                    f.p0.e("Event dropped due to device sampling - %s", arr_object5);
                label_123:
                    z = false;
                }
            }
        }
        else {
            Object[] arr_object3 = {f.a(t0)};
            f.p0.g("App Instance ID is null or empty, dropping %s", arr_object3);
            z = false;
        }
        if(z) {
            L7.a a2 = f.p0;
            if(t0.d()) {
                String s2 = t0.e().J();
                a2.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", new Object[]{f.a(t0), (s2.startsWith("_st_") ? io.sentry.config.a.O(this.n0, this.m0) + "/troubleshooting/trace/SCREEN_TRACE/" + s2 + "?utm_source=perf-android-sdk&utm_medium=android-ide" : io.sentry.config.a.O(this.n0, this.m0) + "/troubleshooting/trace/DURATION_TRACE/" + s2 + "?utm_source=perf-android-sdk&utm_medium=android-ide")});
            }
            else {
                a2.e("Logging %s", new Object[]{f.a(t0)});
            }
            R7.a a3 = this.f0;
            L7.a a4 = R7.a.d;
            if(a3.c == null) {
                o5.f f2 = (o5.f)a3.b.get();
                if(f2 == null) {
                    a4.f("Flg TransportFactory is not available at the moment");
                }
                else {
                    o5.c c0 = new o5.c("proto");
                    l l0 = new l(27);
                    a3.c = ((r5.n)f2).a(a3.a, c0, l0);
                }
            }
            C3.i i1 = a3.c;
            if(i1 == null) {
                a4.f("Unable to dispatch event because Flg Transport is not available");
            }
            else {
                i1.D(new o5.a(t0, null));
            }
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @Override  // H7.b
    public final void onUpdateAppState(i i0) {
        this.o0 = i0 == i.Z;
        if(this.Z.get()) {
            R7.e e0 = new R7.e(this, 0);
            this.g0.execute(e0);
        }
    }
}

