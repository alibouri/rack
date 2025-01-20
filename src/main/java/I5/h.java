package I5;

import Aa.J;
import Aa.p;
import Bb.q;
import I.b0;
import I.c0;
import I.s0;
import J1.c;
import J1.u;
import L1.g;
import M4.l;
import M5.i;
import N4.s;
import N4.t;
import Nb.j;
import Nb.k;
import R2.w;
import S1.b;
import T7.A;
import W.d;
import W5.f;
import Xb.B0;
import Xb.I;
import Xb.N;
import Xb.x;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContentInfo.Builder;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.widget.EditText;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.sendwave.components.RequestListener;
import f9.r;
import fa.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s.B;
import s.E;
import zb.a;

public final class h implements b0, c, i, N5.c, N6.c, b, T1.b, RequestListener, o6.c, a {
    public final int X;
    public Object Y;
    public static h Z;

    public h(int v) {
        this.X = v;
        switch(v) {
            case 5: {
                super();
                this.Y = new ConcurrentLinkedQueue();
                return;
            }
            case 16: {
                super();
                this.Y = new HashMap();
                return;
            }
            case 22: {
                super();
                this.Y = new B();
                return;
            }
            default: {
                super();
                this.Y = new d(new E.h[16]);
            }
        }
    }

    public h(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public h(int v, boolean z) {
        this.X = v;
        super();
    }

    public h(ClipData clipData0, int v) {
        this.X = 6;
        super();
        this.Y = E3.i.g(clipData0, v);
    }

    public h(Context context0, int v) {
        this.X = v;
        if(v != 19) {
            super();
            I5.a a0 = I5.a.a(context0);
            this.Y = a0;
            a0.b();
            a0.c();
            return;
        }
        super();
        Object object0 = context0.getSystemService("clipboard");
        j.d(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.Y = (ClipboardManager)object0;
    }

    public h(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
        this.X = 11;
        super();
        if(Build.VERSION.SDK_INT >= 25) {
            this.Y = new g(uri0, clipDescription0, uri1);
            return;
        }
        this.Y = new w(uri0, clipDescription0, uri1, 12);
    }

    public h(View view0) {
        this.X = 7;
        super();
        if(Build.VERSION.SDK_INT >= 30) {
            u u0 = new u(5, view0);  // initializer: LB3/d;-><init>(ILjava/lang/Object;)V
            u0.Z = view0;
            this.Y = u0;
            return;
        }
        this.Y = new B3.d(5, view0);
    }

    public h(EditText editText0) {
        this.X = 23;
        super();
        this.Y = new io.sentry.internal.debugmeta.c(editText0);
    }

    public h(CloseableCoroutineScope closeableCoroutineScope0, CoroutineContext coroutineContext0, Function2 function20) {
        this.X = 18;
        super();
        B0 b00 = new B0(x.b(closeableCoroutineScope0, coroutineContext0), function20);
        b00.o0(I.Y, b00, function20);
        this.Y = b00;
    }

    public h(e e0, int v) {
        this.X = 29;
        super();
        this.Y = (R1.g)e0;
    }

    public h(Function1 function10) {
        this.X = 21;
        super();
        this.Y = (k)function10;
    }

    @Override  // I.b0
    public int a(KeyEvent keyEvent0) {
        int v = 0;
        if(keyEvent0.isShiftPressed() && keyEvent0.isCtrlPressed()) {
            long v1 = f.f(keyEvent0.getKeyCode());
            if(x0.a.a(v1, s0.i)) {
                return 35;
            }
            if(x0.a.a(v1, s0.j)) {
                return 36;
            }
            if(x0.a.a(v1, s0.k)) {
                return 38;
            }
            if(x0.a.a(v1, s0.l)) {
                return 37;
            }
        }
        else if(keyEvent0.isCtrlPressed()) {
            long v2 = f.f(keyEvent0.getKeyCode());
            if(x0.a.a(v2, s0.i)) {
                return 4;
            }
            if(x0.a.a(v2, s0.j)) {
                return 3;
            }
            if(x0.a.a(v2, s0.k)) {
                return 6;
            }
            if(x0.a.a(v2, s0.l)) {
                return 5;
            }
            if(x0.a.a(v2, s0.c)) {
                return 20;
            }
            if(x0.a.a(v2, s0.t)) {
                return 23;
            }
            if(x0.a.a(v2, s0.s)) {
                return 22;
            }
            if(x0.a.a(v2, s0.h)) {
                return 43;
            }
        }
        else if(keyEvent0.isShiftPressed()) {
            long v3 = f.f(keyEvent0.getKeyCode());
            if(x0.a.a(v3, s0.o)) {
                return 41;
            }
            if(x0.a.a(v3, s0.p)) {
                return 42;
            }
        }
        else if(keyEvent0.isAltPressed()) {
            long v4 = f.f(keyEvent0.getKeyCode());
            if(x0.a.a(v4, s0.s)) {
                return 24;
            }
            if(x0.a.a(v4, s0.t)) {
                v = 25;
            }
        }
        return v == 0 ? ((c0)this.Y).a(keyEvent0) : v;
    }

    @Override  // J1.c
    public J1.f b() {
        return new J1.f(new U7.c(((ContentInfo.Builder)this.Y).build()));
    }

    @Override  // J1.c
    public void c(Bundle bundle0) {
        ((ContentInfo.Builder)this.Y).setExtras(bundle0);
    }

    @Override  // J1.c
    public void d(Uri uri0) {
        ((ContentInfo.Builder)this.Y).setLinkUri(uri0);
    }

    @Override  // N5.c
    public void e(ConnectionResult connectionResult0) {
        ((L5.h)this.Y).e(connectionResult0);
    }

    @Override  // J1.c
    public void f(int v) {
        ((ContentInfo.Builder)this.Y).setFlags(v);
    }

    @Override  // T1.b
    public Object g(T1.a a0) {
        return ((Function1)(((k)this.Y))).n(a0);
    }

    @Override  // zb.a
    public Object get() {
        Object object0 = (x7.a)((R2.h)this.Y).d;
        Pb.a.t(object0);
        return object0;
    }

    public void h(Object object0, Object object1) {
        B b0 = (B)this.Y;
        int v = b0.d(object0);
        Object object2 = v >= 0 ? null : b0.c[v];
        if(object2 != null) {
            if(object2 instanceof E) {
                ((E)object2).a(object1);
                object1 = object2;
            }
            else if(object2 == object1) {
                object1 = object2;
            }
            else {
                E e0 = new E();
                e0.a(object2);
                e0.a(object1);
                object1 = e0;
            }
        }
        if(v < 0) {
            b0.b[~v] = object0;
            b0.c[~v] = object1;
            return;
        }
        b0.c[v] = object1;
    }

    public void i(s s0) {
        Set set0 = null;
        synchronized(this) {
            if(!f5.a.b(s0)) {
                try {
                    Set set1 = s0.X.entrySet();
                    j.e(set1, "events.entries");
                    set0 = set1;
                }
                catch(Throwable throwable0) {
                    f5.a.a(throwable0, s0);
                }
            }
            for(Object object0: set0) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                t t0 = this.o(((N4.b)map$Entry0.getKey()));
                if(t0 != null) {
                    for(Object object1: ((List)map$Entry0.getValue())) {
                        t0.a(((N4.f)object1));
                    }
                }
            }
        }
    }

    public A j() {
        List list1;
        T7.x x0 = A.N();
        x0.p(((Trace)this.Y).b0);
        x0.n(((Trace)this.Y).i0.X);
        x0.o(((Trace)this.Y).i0.c(((Trace)this.Y).j0));
        for(Object object0: ((Trace)this.Y).c0.values()) {
            x0.m(((Counter)object0).Y.get(), ((Counter)object0).X);
        }
        ArrayList arrayList0 = ((Trace)this.Y).f0;
        if(!arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                x0.k(new h(15, ((Trace)object1)).j());
            }
        }
        Map map0 = ((Trace)this.Y).getAttributes();
        x0.j();
        A.y(((A)x0.Y)).putAll(map0);
        Trace trace0 = (Trace)this.Y;
        synchronized(trace0.e0) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: trace0.e0) {
                PerfSession perfSession0 = (PerfSession)object2;
                if(perfSession0 != null) {
                    arrayList1.add(perfSession0);
                }
            }
            list1 = Collections.unmodifiableList(arrayList1);
        }
        T7.w[] arr_w = PerfSession.c(list1);
        if(arr_w != null) {
            List list2 = Arrays.asList(arr_w);
            x0.j();
            A.A(((A)x0.Y), list2);
        }
        return (A)x0.h();
    }

    public void k(String s) {
        j.f(s, "key");
        B3.d d0 = (B3.d)this.Y;
        T3.c c0 = new T3.c(s, 0);
        ((X2.g)d0.Y).b(-2079049329, "DELETE FROM records WHERE key=?", c0);
        d0.B(-2079049329, new p(29));
    }

    public t l(N4.b b0) {
        synchronized(this) {
            j.f(b0, "accessTokenAppIdPair");
            return (t)((HashMap)this.Y).get(b0);
        }
    }

    public int m() {
        synchronized(this) {
            int v1 = 0;
            for(Object object0: ((HashMap)this.Y).values()) {
                v1 += ((t)object0).c();
            }
            return v1;
        }
    }

    @Override  // M5.i
    public void n(Object object0) {
        M5.h h0;
        r r0 = (r)object0;
        d6.a a0 = ((d6.i)this.Y).e;
        synchronized(a0) {
            a0.X = false;
            h0 = (M5.h)((M5.j)a0.Y).c;
        }
        if(h0 != null) {
            ((d6.b)a0.Z).b(h0, 0x989);
        }
    }

    public t o(N4.b b0) {
        synchronized(this) {
            t t0 = (t)((HashMap)this.Y).get(b0);
            if(t0 == null) {
                Context context0 = l.a();
                a5.b b1 = J2.w.F(context0);
                if(b1 != null) {
                    t0 = new t(b1, q.s(context0));
                }
            }
            if(t0 == null) {
                return null;
            }
            ((HashMap)this.Y).put(b0, t0);
            return t0;
        }
    }

    @Override  // S1.b
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        ((e)(((R1.g)this.Y))).b(charSequence0);
    }

    public Object p(Fb.c c0) {
        return ((N)this.Y).A(c0);
    }

    public Set q() {
        synchronized(this) {
            Set set0 = ((HashMap)this.Y).keySet();
            j.e(set0, "stateMap.keys");
            return set0;
        }
    }

    public static h r(int v, int v1, int v2) {
        return new h(10, AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, false, v2));
    }

    @Override  // o6.c
    public void s(o6.h h0) {
        ((CountDownLatch)this.Y).countDown();
    }

    public boolean t(Object object0, Object object1) {
        B b0 = (B)this.Y;
        Object object2 = b0.e(object0);
        if(object2 == null) {
            return false;
        }
        if(object2 instanceof E) {
            boolean z = ((E)object2).j(object1);
            if(z && ((E)object2).g()) {
                b0.g(object0);
            }
            return z;
        }
        if(object2.equals(object1)) {
            b0.g(object0);
            return true;
        }
        return false;
    }

    public void u(Object object0) {
        boolean z;
        B b0 = (B)this.Y;
        long[] arr_v = b0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = b0.b[v5];
                            Object object2 = b0.c[v5];
                            if(object2 instanceof E) {
                                j.d(object2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                                ((E)object2).j(object0);
                                z = ((E)object2).g();
                            }
                            else {
                                z = object2 == object0;
                            }
                            if(z) {
                                b0.h(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_26;
                    }
                    break;
                }
            label_26:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public O3.l v(String s) {
        j.f(s, "key");
        T3.e e0 = new T3.e(((B3.d)this.Y), s, new Ba.l(10, new J(3)));
        W2.c c0 = e0.k(new V2.a(1, e0));
        ArrayList arrayList0 = new ArrayList(Bb.r.b0(((List)c0.b)));
        for(Object object0: ((List)c0.b)) {
            arrayList0.add(f.x(((T3.f)object0).a, ((T3.f)object0).b));
        }
        return arrayList0.size() == 1 ? ((O3.l)arrayList0.get(0)) : null;
    }

    @Override  // com.sendwave.components.RequestListener
    public void w(int v, int v1, String s, String s1) {
        if(this.X != 26) {
            ((f9.A)this.Y).b(v, v1, s, s1);
            return;
        }
        ((f9.a)this.Y).e(v, v1, s, s1);
    }

    public static h x(Context context0) {
        synchronized(h.class) {
            return h.z(context0.getApplicationContext());
        }
    }

    public void y() {
        synchronized(this) {
            I5.a a0 = (I5.a)this.Y;
            a0.a.lock();
            try {
                a0.b.edit().clear().apply();
            }
            finally {
                a0.a.unlock();
            }
        }
    }

    public static h z(Context context0) {
        synchronized(h.class) {
            h h0 = h.Z;
            if(h0 != null) {
                return h0;
            }
            h h1 = new h(context0, 0);
            h.Z = h1;
            return h1;
        }
    }

    @Override  // N6.c
    public Object zza() {
        Object object0 = (M6.e)((N6.c)this.Y).zza();
        if(object0 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        return object0;
    }
}

