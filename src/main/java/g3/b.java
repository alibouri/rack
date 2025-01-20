package g3;

import Ab.k;
import B.L0;
import Bb.F;
import J2.w;
import K1.n;
import R2.h;
import Y8.M3;
import Y8.N3;
import Y8.O3;
import Y8.R6;
import Y8.y6;
import a8.Q;
import ac.B0;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import coil.memory.MemoryCache.Key;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.sendwave.components.RequestListener;
import d9.s0;
import h7.c;
import i.A;
import i.B;
import i.s;
import i3.p;
import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.N0;
import io.sentry.i1;
import io.sentry.transport.m;
import io.sentry.y1;
import j3.g;
import j6.P;
import j6.k1;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import jeb.synthetic.FIN;
import k2.K;
import k2.Q0;
import k2.V1;
import k2.X1;
import m3.e;
import n.i;
import n.j;
import n.t;
import pa.q;
import q9.K0;
import t0.o;
import t0.u;
import t0.v;
import t0.x;
import t0.y;
import t0.z;
import v.r;
import yc.l;

public final class b implements n, RequestListener, N0, P, K, i, t, t5.b, r {
    public final int X;
    public Object Y;

    public b(int v) {
        this.X = v;
        if(v != 17) {
            super();
            this.Y = new m();
            return;
        }
        super();
        this.Y = new LinkedHashSet();
    }

    public b(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public b(int v, boolean z) {
        this.X = v;
        super();
    }

    public b(Y2.m m0, Q q0) {
        this.X = 0;
        super();
        this.Y = m0;
    }

    public b(c c0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        this.X = 1;
        super();
        N5.r.j(c0);
        this.Y = executor0;
    }

    public b(i3.n n0) {
        this.X = 3;
        super();
        this.Y = F.a0(n0.X);
    }

    @Override  // k2.K
    public void a(X1 x10) {
        s s0 = ((Q0)this.Y).f;
        s0.getClass();
        L0 l00 = new L0(18, x10);
        ((R2.m)s0.X).o((x10 instanceof V1 ? ((V1)x10) : null), l00);
    }

    @Override  // n.t
    public void b(j j0, boolean z) {
        A a0;
        j j1 = j0.k();
        boolean z1 = j1 != j0;
        if(z1) {
            j0 = j1;
        }
        B b0 = (B)this.Y;
        A[] arr_a = b0.J0;
        int v1 = arr_a == null ? 0 : arr_a.length;
        for(int v = 0; true; ++v) {
            a0 = null;
            if(v >= v1) {
                break;
            }
            A a1 = arr_a[v];
            if(a1 != null && a1.h == j0) {
                a0 = a1;
                break;
            }
        }
        if(a0 != null) {
            if(z1) {
                b0.q(a0.a, a0, j1);
                b0.s(a0, true);
                return;
            }
            b0.s(a0, z);
        }
    }

    @Override  // K1.n
    public boolean c(View view0) {
        SwipeDismissBehavior swipeDismissBehavior0 = (SwipeDismissBehavior)this.Y;
        boolean z = false;
        if(swipeDismissBehavior0.s(view0)) {
            if(view0.getLayoutDirection() == 1) {
                z = true;
            }
            view0.offsetLeftAndRight(((swipeDismissBehavior0.c != 0 || !z) && (swipeDismissBehavior0.c != 1 || z) ? view0.getWidth() : -view0.getWidth()));
            view0.setAlpha(0.0f);
            return true;
        }
        return false;
    }

    @Override  // j6.P
    public void d(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        ((k1)this.Y).N(s, v, iOException0, arr_b, map0);
    }

    public void e(float f, float f1, float f2, float f3, int v) {
        ((Q)this.Y).o().i(f, f1, f2, f3, v);
    }

    @Override  // n.i
    public boolean f(j j0, MenuItem menuItem0) {
        K0 k00 = (K0)((h)this.Y).c;
        if(k00 != null) {
            k00.a.i(menuItem0);
            return true;
        }
        return false;
    }

    public void g(pc.A a0) {
        synchronized(this) {
            Nb.j.f(a0, "route");
            ((LinkedHashSet)this.Y).remove(a0);
        }
    }

    @Override  // zb.a
    public Object get() {
        return this.X != 16 ? new y5.j(y5.j.b0, ((Context)((b)this.Y).Y), "com.google.android.datatransport.events") : this.Y;
    }

    @Override  // v.r
    public v.B get(int v) {
        return (v.B)this.Y;
    }

    public a h(i3.i i0, MemoryCache.Key memoryCache$Key0, j3.h h0, g g0) {
        g g1;
        int v7;
        a a0;
        if(!i0.p.X) {
            return null;
        }
        g3.c c0 = (g3.c)((Y2.m)this.Y).c.getValue();
        if(c0 == null) {
            a0 = null;
        }
        else {
            a0 = c0.a.j(memoryCache$Key0);
            if(a0 == null) {
                A0.b b0 = c0.b;
                __monitor_enter(b0);
                int v = FIN.finallyOpen$NT();
                a a1 = null;
                ArrayList arrayList0 = (ArrayList)((LinkedHashMap)b0.Y).get(memoryCache$Key0);
                if(arrayList0 == null) {
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(b0);
                    FIN.finallyCodeEnd$NT(v);
                }
                else {
                    int v1 = arrayList0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        f f0 = (f)arrayList0.get(v2);
                        Bitmap bitmap0 = (Bitmap)f0.b.get();
                        a a2 = bitmap0 == null ? null : new a(bitmap0, f0.c);
                        if(a2 != null) {
                            a1 = a2;
                            break;
                        }
                    }
                    int v3 = b0.X;
                    b0.X = v3 + 1;
                    if(v3 >= 10) {
                        b0.d();
                    }
                    FIN.finallyExec$NT(v);
                }
                a0 = a1;
            }
        }
        if(a0 != null) {
            Bitmap bitmap1 = a0.a;
            Bitmap.Config bitmap$Config0 = bitmap1.getConfig();
            if(bitmap$Config0 == null) {
                bitmap$Config0 = Bitmap.Config.ARGB_8888;
            }
            if(!Q.D(i0, bitmap$Config0)) {
                return null;
            }
            Object object0 = a0.b.get("coil#is_sampled");
            Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
            boolean z = boolean0 == null ? false : boolean0.booleanValue();
            if(Nb.j.a(h0, j3.h.c)) {
                return z ? null : a0;
            }
            String s = (String)memoryCache$Key0.Y.get("coil#transformation_size");
            if(s != null) {
                return s.equals(h0.toString()) ? a0 : null;
            }
            int v4 = bitmap1.getWidth();
            int v5 = bitmap1.getHeight();
            int v6 = h0.a instanceof j3.a ? ((j3.a)h0.a).b : 0x7FFFFFFF;
            l l0 = h0.b;
            if(l0 instanceof j3.a) {
                v7 = ((j3.a)l0).b;
                g1 = g0;
            }
            else {
                g1 = g0;
                v7 = 0x7FFFFFFF;
            }
            double f1 = l.p(v4, v5, v6, v7, g1);
            boolean z1 = e.a(i0);
            if(z1) {
                double f2 = f1 > 1.0 ? 1.0 : f1;
                if(Math.abs(((double)v6) - ((double)v4) * f2) > 1.0 && Math.abs(((double)v7) - f2 * ((double)v5)) > 1.0) {
                    goto label_67;
                }
                return a0;
            }
            if(v6 != 0x80000000 && v6 != 0x7FFFFFFF && Math.abs(v6 - v4) > 1 || v7 != 0x80000000 && v7 != 0x7FFFFFFF && Math.abs(v7 - v5) > 1) {
            label_67:
                return (f1 == 1.0 || z1) && (f1 <= 1.0 || !z) ? a0 : null;
            }
            return a0;
        }
        return null;
    }

    public Serializable i(Location location0, Fb.c c0) {
        q q0;
        if(c0 instanceof q) {
            q0 = (q)c0;
            int v = q0.d0;
            if((v & 0x80000000) == 0) {
                q0 = new q(this, c0);
            }
            else {
                q0.d0 = v ^ 0x80000000;
            }
        }
        else {
            q0 = new q(this, c0);
        }
        Object object0 = q0.b0;
        Serializable serializable0 = Eb.a.X;
        switch(q0.d0) {
            case 0: {
                W5.f.b0(object0);
                double f = location0.getLatitude();
                O3 o30 = new O3(new s0(location0.getLongitude(), f));
                q0.d0 = 1;
                object0 = R6.d(((R6)this.Y), o30, null, null, q0, 6);
                if(object0 == serializable0) {
                    return serializable0;
                }
                break;
            }
            case 1: {
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Iterable iterable0 = ((M3)((y6)object0).b).a;
        Serializable serializable1 = new ArrayList(Bb.r.b0(iterable0));
        for(Object object1: iterable0) {
            ((ArrayList)serializable1).add(new pa.b(((N3)object1).a.a, ((N3)object1).a.b, ((N3)object1).a.c, ((float)((N3)object1).b), ((N3)object1).c));
        }
        return serializable1;
    }

    @Override  // n.t
    public boolean j(j j0) {
        if(j0 == j0.k()) {
            B b0 = (B)this.Y;
            if(b0.D0) {
                Window.Callback window$Callback0 = b0.j0.getCallback();
                if(window$Callback0 != null && !b0.O0) {
                    window$Callback0.onMenuOpened(108, j0);
                }
            }
        }
        return true;
    }

    public void k(float f, float f1, float f2, float f3) {
        Q q0 = (Q)this.Y;
        n0.t t0 = q0.o();
        long v = w.m(m0.e.d(q0.A()) - (f2 + f), m0.e.b(q0.A()) - (f3 + f1));
        if(m0.e.d(v) >= 0.0f || m0.e.b(v) >= 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        q0.T(v);
        t0.k(f, f1);
    }

    public MemoryCache.Key l(i3.i i0, Object object0, i3.m m0, Y2.c c0) {
        Bb.A a1;
        String s;
        i0.getClass();
        List list0 = ((Y2.m)this.Y).g.c;
        int v = list0.size();
        for(int v1 = 0; true; ++v1) {
            s = null;
            if(v1 >= v) {
                break;
            }
            k k0 = (k)list0.get(v1);
            e3.b b0 = (e3.b)k0.X;
            Class class0 = object0.getClass();
            if(((Class)k0.Y).isAssignableFrom(class0)) {
                Nb.j.d(b0, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String s1 = b0.a(object0, m0);
                if(s1 != null) {
                    s = s1;
                    break;
                }
            }
        }
        if(s == null) {
            return null;
        }
        Map map0 = i0.z.X;
        Bb.A a0 = Bb.A.X;
        if(map0.isEmpty()) {
            a1 = a0;
            i0.h.getClass();
            return a1.isEmpty() ? new MemoryCache.Key(s, a0) : new MemoryCache.Key(s, F.a0(a1));
        }
        a1 = new LinkedHashMap();
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            i0.h.getClass();
            return a1.isEmpty() ? new MemoryCache.Key(s, a0) : new MemoryCache.Key(s, F.a0(a1));
        }
        Object object1 = iterator0.next();
        ((Map.Entry)object1).getValue().getClass();
        throw new ClassCastException();
    }

    @Override  // n.i
    public void m(j j0) {
    }

    @Override  // io.sentry.N0
    public g7.a n(io.sentry.B b0, y1 y10) {
        a5.w.e0(b0, "Hub is required");
        a5.w.e0(y10, "SentryOptions is required");
        String s = ((io.sentry.android.core.k)this.Y).X.getOutboxPath();
        if(s != null && com.apollographql.apollo.api.b.b(s, y10.getLogger())) {
            io.sentry.F f0 = y10.getEnvelopeReader();
            io.sentry.P p0 = y10.getSerializer();
            File file0 = new File(s);
            return new g7.a(y10.getLogger(), s, new A0(b0, f0, p0, y10.getLogger(), y10.getFlushTimeoutMillis(), y10.getMaxQueueSize()), file0);
        }
        y10.getLogger().h(i1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }

    public static p o(d3.j j0, i3.i i0, MemoryCache.Key memoryCache$Key0, a a0) {
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(i0.a.getResources(), a0.a);
        a3.f f0 = a3.f.X;
        Object object0 = a0.b.get("coil#disk_cache_key");
        Boolean boolean0 = null;
        String s = object0 instanceof String ? ((String)object0) : null;
        Object object1 = a0.b.get("coil#is_sampled");
        if(object1 instanceof Boolean) {
            boolean0 = (Boolean)object1;
        }
        boolean z = boolean0 == null ? false : boolean0.booleanValue();
        return !(j0 instanceof d3.j) || !j0.g ? new p(bitmapDrawable0, i0, f0, memoryCache$Key0, s, z, false) : new p(bitmapDrawable0, i0, f0, memoryCache$Key0, s, z, true);
    }

    public static ArrayList p(b b0, String s) {
        ArrayList arrayList2;
        b b2;
        long v51;
        long v50;
        boolean z1;
        long v40;
        int v33;
        int v30;
        int v29;
        int v28;
        int v27;
        int v26;
        int v22;
        int v21;
        int v15;
        long v14;
        int v13;
        ArrayList arrayList1;
        int v12;
        int v10;
        int v8;
        long v7;
        int v6;
        int v4;
        int v3;
        b b1 = b0;
        ArrayList arrayList0 = new ArrayList();
        int v = s.length();
        int v1;
        for(v1 = 0; v1 < v && Nb.j.h(s.charAt(v1), 0x20) <= 0; ++v1) {
        }
        while(v > v1 && Nb.j.h(s.charAt(v - 1), 0x20) <= 0) {
            --v;
        }
        int v2 = 0;
        while(v1 < v) {
            while(true) {
                v3 = v1 + 1;
                v4 = s.charAt(v1);
                int v5 = v4 | 0x20;
                if((v5 - 0x7A) * (v5 - 97) <= 0 && v5 != 101) {
                    break;
                }
                if(v3 >= v) {
                    v4 = 0;
                    break;
                }
                v1 = v3;
            }
            if(v4 == 0) {
                v1 = v3;
            }
            else {
                if((v4 | 0x20) == 0x7A) {
                    arrayList1 = arrayList0;
                    v13 = v;
                    v6 = v4;
                    b2 = b1;
                }
                else {
                    v2 = 0;
                    while(true) {
                        if(v3 < v && Nb.j.h(s.charAt(v3), 0x20) <= 0) {
                            ++v3;
                        }
                        else {
                            if(v3 == v) {
                                v6 = v4;
                                v7 = ((long)v3) << 0x20;
                                v8 = Float.floatToRawIntBits(NaNf);
                                goto label_47;
                            }
                            else {
                                v6 = v4;
                                int v9 = s.charAt(v3);
                                boolean z = v9 == 45;
                                if(z) {
                                    v10 = v3 + 1;
                                    if(v10 == v) {
                                        v7 = ((long)v10) << 0x20;
                                        v8 = Float.floatToRawIntBits(NaNf);
                                    }
                                    else {
                                        int v11 = s.charAt(v10);
                                        if(((char)(v11 - 0x30)) >= 10 && v11 != 46) {
                                            v7 = ((long)v10) << 0x20;
                                            v8 = Float.floatToRawIntBits(NaNf);
                                        }
                                        else {
                                            v12 = v11;
                                            goto label_54;
                                        }
                                    }
                                label_47:
                                    arrayList1 = arrayList0;
                                    v13 = v;
                                    v14 = v7 | ((long)v8) & 0xFFFFFFFFL;
                                    v15 = v2;
                                    goto label_218;
                                }
                                else {
                                    v12 = v9;
                                    v10 = v3;
                                }
                            label_54:
                                int v16 = s.length();
                                long v17 = 0L;
                                int v18 = v10;
                                long v19 = 0L;
                                while(v18 != v && ((char)(v12 - 0x30)) < 10) {
                                    v19 = v19 * 10L + ((long)(v12 - 0x30));
                                    ++v18;
                                    v12 = v18 < v16 ? s.charAt(v18) : 0;
                                }
                                int v20 = v18 - v10;
                                if(v18 == v || v12 != 46) {
                                    v15 = v2;
                                    v29 = v18;
                                    v21 = v29;
                                    v28 = v20;
                                    v27 = 0;
                                }
                                else {
                                    v21 = v18 + 1;
                                    while(true) {
                                        if(v - v21 >= 4) {
                                            v15 = v2;
                                            v22 = v20;
                                            long v23 = ((long)s.charAt(v21)) | ((long)s.charAt(v21 + 1)) << 16 | ((long)s.charAt(v21 + 2)) << 0x20 | ((long)s.charAt(v21 + 3)) << 0x30;
                                            long v24 = v23 - 0x30003000300030L;
                                            int v25 = ((v23 + 0x46004600460046L | v24) & 0xFF80FF80FF80FF80L) == 0L ? ((int)(v24 * 0x3E80064000A0001L >>> 0x30)) : -1;
                                            if(v25 >= 0) {
                                                v19 = v19 * 10000L + ((long)v25);
                                                v21 += 4;
                                                v2 = v15;
                                                v20 = v22;
                                                continue;
                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        v15 = v2;
                                        v22 = v20;
                                        break;
                                    }
                                    if(v21 < v16) {
                                        v26 = s.charAt(v21);
                                        goto label_88;
                                    }
                                    while(true) {
                                        v26 = 0;
                                    label_88:
                                        if(v21 == v || ((char)(v26 - 0x30)) >= 10) {
                                            break;
                                        }
                                        v19 = v19 * 10L + ((long)(v26 - 0x30));
                                        ++v21;
                                        if(v21 >= v16) {
                                            continue;
                                        }
                                        v26 = s.charAt(v21);
                                        goto label_88;
                                    }
                                    v27 = v18 + 1 - v21;
                                    v28 = v22 - v27;
                                    v12 = v26;
                                    v29 = v18 + 1;
                                }
                                if(v28 == 0) {
                                    arrayList1 = arrayList0;
                                    v13 = v;
                                    v14 = ((long)v21) << 0x20 | ((long)Float.floatToRawIntBits(NaNf)) & 0xFFFFFFFFL;
                                }
                                else {
                                    if((v12 | 0x20) == 101) {
                                        v30 = v21 + 1;
                                        int v31 = v30 >= v16 ? 0 : s.charAt(v30);
                                        if(v31 == 45 || v31 == 43) {
                                            v30 = v21 + 2;
                                        }
                                        int v32 = s.charAt(v30);
                                        v33 = 0;
                                        while(true) {
                                            if(v30 != v) {
                                                arrayList1 = arrayList0;
                                                if(((char)(v32 - 0x30)) < 10) {
                                                    if(v33 < 0x400) {
                                                        v33 = v33 * 10 + (v32 - 0x30);
                                                    }
                                                    ++v30;
                                                    v32 = v30 >= v16 ? 0 : s.charAt(v30);
                                                    arrayList0 = arrayList1;
                                                    continue;
                                                }
                                                else {
                                                    break;
                                                }
                                            }
                                            arrayList1 = arrayList0;
                                            break;
                                        }
                                        if(v31 == 45) {
                                            v33 = -v33;
                                        }
                                        v27 += v33;
                                    }
                                    else {
                                        arrayList1 = arrayList0;
                                        v30 = v21;
                                        v33 = 0;
                                    }
                                    if(v28 > 19) {
                                        int v34 = s.charAt(v10);
                                        int v35 = v10;
                                        while(v30 != v && (v34 == 46 || v34 == 0x30)) {
                                            if(v34 == 0x30) {
                                                --v28;
                                            }
                                            ++v35;
                                            v34 = v35 < v16 ? s.charAt(v35) : 0;
                                        }
                                        if(v28 > 19) {
                                            int v36 = s.charAt(v10);
                                            long v37 = 0L;
                                            while(true) {
                                                v13 = v;
                                                if(v10 == v18 || Long.compare(v37 ^ 0x8000000000000000L, 0x8DE0B6B3A7640000L) >= 0) {
                                                    break;
                                                }
                                                v37 = v37 * 10L + ((long)(v36 - 0x30));
                                                ++v10;
                                                v36 = v10 >= v16 ? 0 : s.charAt(v10);
                                                v = v13;
                                            }
                                            if(Long.compare(v37 ^ 0x8000000000000000L, 0x8DE0B6B3A7640000L) >= 0) {
                                                v27 = v18 - v10 + v33;
                                            }
                                            else {
                                                int v38 = s.charAt(v29);
                                                int v39 = v29;
                                                while(v39 != v21 && Long.compare(v37 ^ 0x8000000000000000L, 0x8DE0B6B3A7640000L) < 0) {
                                                    v37 = v37 * 10L + ((long)(v38 - 0x30));
                                                    ++v39;
                                                    v38 = v39 < v16 ? s.charAt(v39) : 0;
                                                }
                                                v27 = v29 - v39 + v33;
                                            }
                                            v40 = v37;
                                            z1 = true;
                                        }
                                    }
                                    else {
                                        v13 = v;
                                        v40 = v19;
                                        z1 = false;
                                    }
                                    if(-10 <= v27 && v27 < 11 && !z1 && Long.compare(v40 ^ 0x8000000000000000L, 0x8000000001000000L) <= 0) {
                                        float f = v27 >= 0 ? ((float)v40) * t0.a.a[v27] : ((float)v40) / t0.a.a[-v27];
                                        if(z) {
                                            f = -f;
                                        }
                                        v14 = ((long)v30) << 0x20 | ((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL;
                                    }
                                    else if(v40 == 0L) {
                                        v14 = ((long)v30) << 0x20 | ((long)Float.floatToRawIntBits((z ? -0.0f : 0.0f))) & 0xFFFFFFFFL;
                                    }
                                    else if(0xFFFFFF82 > v27 || v27 >= 0x80) {
                                        String s3 = s.substring(v3, v30);
                                        Nb.j.e(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                                        v14 = ((long)v30) << 0x20 | ((long)Float.floatToRawIntBits(Float.parseFloat(s3))) & 0xFFFFFFFFL;
                                    }
                                    else {
                                        long v41 = t0.a.b[v27 + 325];
                                        int v42 = Long.numberOfLeadingZeros(v40);
                                        long v43 = v40 << v42;
                                        long v44 = (v41 >>> 0x20) * (v43 & 0xFFFFFFFFL);
                                        long v45 = (v43 >>> 0x20) * (v41 >>> 0x20) + ((v43 >>> 0x20) * (v41 & 0xFFFFFFFFL) + ((v43 & 0xFFFFFFFFL) * (v41 & 0xFFFFFFFFL) >>> 0x20) + (v44 & 0xFFFFFFFFL) >>> 0x20) + (v44 >>> 0x20);
                                        long v46 = v45 >>> ((int)(v45 >>> 0x3F)) + 9;
                                        int v47 = v42 + (((int)(v45 >>> 0x3F)) ^ 1);
                                        if((v45 & 0x1FFL) != 0x1FFL && (Long.compare(v45 & 0x1FFL, 0L) != 0 || (v46 & 3L) != 1L)) {
                                            long v48 = v46 + 1L >>> 1;
                                            if(v48 >= 0x20000000000000L) {
                                                --v47;
                                                v48 = 0x10000000000000L;
                                            }
                                            long v49 = (((long)v27) * 217706L >> 16) + 0x43FL - ((long)v47);
                                            if(v49 >= 1L && v49 <= 0x7FEL) {
                                                if(z) {
                                                    v17 = 0x8000000000000000L;
                                                }
                                                v50 = ((long)v30) << 0x20;
                                                v51 = (long)Float.floatToRawIntBits(((float)Double.longBitsToDouble(v49 << 52 | v48 & 0xFFEFFFFFFFFFFFFFL | v17)));
                                            }
                                            else {
                                                String s2 = s.substring(v3, v30);
                                                Nb.j.e(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                v50 = ((long)v30) << 0x20;
                                                v51 = (long)Float.floatToRawIntBits(Float.parseFloat(s2));
                                            }
                                            v14 = v50 | v51 & 0xFFFFFFFFL;
                                        }
                                        else {
                                            String s1 = s.substring(v3, v30);
                                            Nb.j.e(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                                            v14 = ((long)v30) << 0x20 | ((long)Float.floatToRawIntBits(Float.parseFloat(s1))) & 0xFFFFFFFFL;
                                        }
                                    }
                                }
                            }
                        label_218:
                            float f1 = Float.intBitsToFloat(((int)(v14 & 0xFFFFFFFFL)));
                            if(Float.isNaN(f1)) {
                                b2 = b0;
                                v3 = (int)(v14 >>> 0x20);
                                v2 = v15;
                            }
                            else {
                                b2 = b0;
                                float[] arr_f = (float[])b2.Y;
                                v2 = v15 + 1;
                                arr_f[v15] = f1;
                                if(v2 >= arr_f.length) {
                                    float[] arr_f1 = new float[v2 * 2];
                                    b2.Y = arr_f1;
                                    System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                                }
                                v3 = (int)(v14 >>> 0x20);
                            }
                            while(v3 < v13 && s.charAt(v3) == 44) {
                                ++v3;
                            }
                            if(v3 >= v13 || Float.isNaN(f1)) {
                                break;
                            }
                            v = v13;
                            v4 = v6;
                            arrayList0 = arrayList1;
                        }
                    }
                }
                v1 = v3;
                float[] arr_f2 = (float[])b2.Y;
                if(v6 != 90 && v6 != 0x7A) {
                    arrayList2 = arrayList1;
                    if(v6 != 109) {
                    alab1:
                        switch(v6) {
                            case 65: {
                                for(int v53 = 0; v53 <= v2 - 7; v53 += 7) {
                                    arrayList2.add(new t0.h(arr_f2[v53], arr_f2[v53 + 1], arr_f2[v53 + 2], Float.compare(arr_f2[v53 + 3], 0.0f) != 0, Float.compare(arr_f2[v53 + 4], 0.0f) != 0, arr_f2[v53 + 5], arr_f2[v53 + 6]));
                                }
                                break;
                            }
                            case 67: {
                                for(int v54 = 0; v54 <= v2 - 6; v54 += 6) {
                                    arrayList2.add(new t0.j(arr_f2[v54], arr_f2[v54 + 1], arr_f2[v54 + 2], arr_f2[v54 + 3], arr_f2[v54 + 4], arr_f2[v54 + 5]));
                                }
                                break;
                            }
                            case 72: {
                                for(int v55 = 0; v55 <= v2 - 1; ++v55) {
                                    arrayList2.add(new t0.k(arr_f2[v55]));
                                }
                                break;
                            }
                            case 76: {
                                for(int v56 = 0; v56 <= v2 - 2; v56 += 2) {
                                    arrayList2.add(new t0.l(arr_f2[v56], arr_f2[v56 + 1]));
                                }
                                break;
                            }
                            case 81: {
                                for(int v57 = 0; v57 <= v2 - 4; v57 += 4) {
                                    arrayList2.add(new t0.n(arr_f2[v57], arr_f2[v57 + 1], arr_f2[v57 + 2], arr_f2[v57 + 3]));
                                }
                                break;
                            }
                            case 83: {
                                for(int v58 = 0; v58 <= v2 - 4; v58 += 4) {
                                    arrayList2.add(new o(arr_f2[v58], arr_f2[v58 + 1], arr_f2[v58 + 2], arr_f2[v58 + 3]));
                                }
                                break;
                            }
                            case 84: {
                                for(int v59 = 0; v59 <= v2 - 2; v59 += 2) {
                                    arrayList2.add(new t0.p(arr_f2[v59], arr_f2[v59 + 1]));
                                }
                                break;
                            }
                            case 86: {
                                for(int v60 = 0; v60 <= v2 - 1; ++v60) {
                                    arrayList2.add(new z(arr_f2[v60]));
                                }
                                break;
                            }
                            case 97: {
                                for(int v61 = 0; v61 <= v2 - 7; v61 += 7) {
                                    arrayList2.add(new t0.q(arr_f2[v61], arr_f2[v61 + 1], arr_f2[v61 + 2], Float.compare(arr_f2[v61 + 3], 0.0f) != 0, Float.compare(arr_f2[v61 + 4], 0.0f) != 0, arr_f2[v61 + 5], arr_f2[v61 + 6]));
                                }
                                break;
                            }
                            case 99: {
                                for(int v62 = 0; v62 <= v2 - 6; v62 += 6) {
                                    arrayList2.add(new t0.r(arr_f2[v62], arr_f2[v62 + 1], arr_f2[v62 + 2], arr_f2[v62 + 3], arr_f2[v62 + 4], arr_f2[v62 + 5]));
                                }
                                break;
                            }
                            case 104: {
                                for(int v63 = 0; v63 <= v2 - 1; ++v63) {
                                    arrayList2.add(new t0.s(arr_f2[v63]));
                                }
                                break;
                            }
                            case 108: {
                                for(int v64 = 0; v64 <= v2 - 2; v64 += 2) {
                                    arrayList2.add(new t0.t(arr_f2[v64], arr_f2[v64 + 1]));
                                }
                                break;
                            }
                            case 0x71: {
                                for(int v65 = 0; v65 <= v2 - 4; v65 += 4) {
                                    arrayList2.add(new v(arr_f2[v65], arr_f2[v65 + 1], arr_f2[v65 + 2], arr_f2[v65 + 3]));
                                }
                                break;
                            }
                            case 0x73: {
                                for(int v66 = 0; v66 <= v2 - 4; v66 += 4) {
                                    arrayList2.add(new t0.w(arr_f2[v66], arr_f2[v66 + 1], arr_f2[v66 + 2], arr_f2[v66 + 3]));
                                }
                                break;
                            }
                            case 0x74: {
                                for(int v67 = 0; v67 <= v2 - 2; v67 += 2) {
                                    arrayList2.add(new x(arr_f2[v67], arr_f2[v67 + 1]));
                                }
                                break;
                            }
                            case 0x76: {
                                for(int v68 = 0; true; ++v68) {
                                    if(v68 > v2 - 1) {
                                        break alab1;
                                    }
                                    arrayList2.add(new y(arr_f2[v68]));
                                }
                            }
                            default: {
                                throw new IllegalArgumentException("Unknown command for: " + ((char)v6));
                            }
                        }
                    }
                    else if(v2 - 2 >= 0) {
                        arrayList2.add(new u(arr_f2[0], arr_f2[1]));
                        for(int v52 = 2; v52 <= v2 - 2; v52 += 2) {
                            arrayList2.add(new t0.t(arr_f2[v52], arr_f2[v52 + 1]));
                        }
                    }
                }
                else {
                    arrayList2 = arrayList1;
                    arrayList2.add(t0.i.c);
                }
                b1 = b2;
                arrayList0 = arrayList2;
                v = v13;
            }
        }
        return arrayList0;
    }

    public void q(String s, Pattern pattern0) {
        synchronized(this) {
            ((n8.a)this.Y).put(s, pattern0);
        }
    }

    public void r(float f, long v) {
        n0.t t0 = ((Q)this.Y).o();
        t0.k(m0.b.d(v), m0.b.e(v));
        t0.c(f);
        t0.k(-m0.b.d(v), -m0.b.e(v));
    }

    public void s(float f, float f1, long v) {
        n0.t t0 = ((Q)this.Y).o();
        t0.k(m0.b.d(v), m0.b.e(v));
        t0.b(f, f1);
        t0.k(-m0.b.d(v), -m0.b.e(v));
    }

    public void t(float f, float f1) {
        ((Q)this.Y).o().k(f, f1);
    }

    @Override  // io.sentry.N0
    public boolean u(String s, ILogger iLogger0) {
        return com.apollographql.apollo.api.b.b(s, iLogger0);
    }

    @Override  // com.sendwave.components.RequestListener
    public void w(int v, int v1, String s, String s1) {
        o9.w w0 = (o9.w)this.Y;
        w0.getClass();
        Nb.j.f(s, "newText");
        Nb.j.f(s1, "oldText");
        String s2 = Vb.j.l0(s1, v, v1, s).toString();
        k k0 = w0.f0.c(s.length() + v, s2);
        int v2 = ((Number)k0.Y).intValue();
        w0.g0.k(((String)k0.X));
        w0.h0.getClass();
        w0.h0.l(null, v2);
        String s3 = w0.f0.a(((String)k0.X));
        ((B0)w0.e0).k(s3);
    }
}

