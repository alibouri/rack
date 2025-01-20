package M5;

import E5.d;
import K.v;
import L5.c;
import L5.g;
import L5.h;
import L5.m;
import N5.e;
import R2.w;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.session.a;
import android.util.Log;
import android.util.SparseIntArray;
import b4.A0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import o6.i;

public final class r implements g, h {
    public final LinkedList d;
    public final c e;
    public final b f;
    public final io.sentry.internal.debugmeta.c g;
    public final HashSet h;
    public final HashMap i;
    public final int j;
    public final B k;
    public boolean l;
    public final ArrayList m;
    public ConnectionResult n;
    public int o;
    public final f p;

    public r(f f0, L5.f f1) {
        this.p = f0;
        this.d = new LinkedList();
        this.h = new HashSet();
        this.i = new HashMap();
        this.m = new ArrayList();
        this.n = null;
        this.o = 0;
        Looper looper0 = f0.n.getLooper();
        w w0 = f1.a();
        A0 a00 = new A0(((s.f)w0.Y), ((String)w0.Z), ((String)w0.b0));
        a a0 = (a)f1.c.Y;
        N5.r.j(a0);
        c c0 = a0.t(f1.a, looper0, a00, f1.d, this, this);
        String s = f1.b;
        if(s != null && c0 instanceof e) {
            ((e)c0).q0 = s;
        }
        if(s != null && c0 instanceof k) {
            A3.e.x(c0);
            throw null;
        }
        this.e = c0;
        this.f = f1.e;
        this.g = new io.sentry.internal.debugmeta.c(4);
        this.j = f1.g;
        if(c0.l()) {
            w w1 = f1.a();
            A0 a01 = new A0(((s.f)w1.Y), ((String)w1.Z), ((String)w1.b0));
            this.k = new B(f0.e, f0.n, a01);
            return;
        }
        this.k = null;
    }

    public final void a(ConnectionResult connectionResult0) {
        HashSet hashSet0 = this.h;
        Iterator iterator0 = hashSet0.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            if(N5.r.m(connectionResult0, ConnectionResult.c0)) {
                this.e.i();
            }
            throw null;
        }
        hashSet0.clear();
    }

    @Override  // L5.g
    public final void b(int v) {
        Looper looper0 = Looper.myLooper();
        f f0 = this.p;
        if(looper0 == f0.n.getLooper()) {
            this.i(v);
            return;
        }
        G1.a a0 = new G1.a(v, 2, this);
        f0.n.post(a0);
    }

    @Override  // L5.g
    public final void c() {
        Looper looper0 = Looper.myLooper();
        f f0 = this.p;
        if(looper0 == f0.n.getLooper()) {
            this.h();
            return;
        }
        d d0 = new d(7, this);
        f0.n.post(d0);
    }

    public final void d(Status status0) {
        N5.r.d(this.p.n);
        this.f(status0, null, false);
    }

    @Override  // L5.h
    public final void e(ConnectionResult connectionResult0) {
        this.o(connectionResult0, null);
    }

    public final void f(Status status0, RuntimeException runtimeException0, boolean z) {
        N5.r.d(this.p.n);
        if((status0 == null ? 1 : 0) == (runtimeException0 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator iterator0 = this.d.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            F f0 = (F)object0;
            if(!z || f0.a == 2) {
                if(status0 == null) {
                    f0.b(runtimeException0);
                }
                else {
                    f0.a(status0);
                }
                iterator0.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList0 = this.d;
        ArrayList arrayList0 = new ArrayList(linkedList0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            F f0 = (F)arrayList0.get(v1);
            if(!this.e.a()) {
                break;
            }
            if(this.k(f0)) {
                linkedList0.remove(f0);
            }
        }
    }

    public final void h() {
        c c0 = this.e;
        f f0 = this.p;
        N5.r.d(f0.n);
        this.n = null;
        this.a(ConnectionResult.c0);
        if(this.l) {
            f0.n.removeMessages(11, this.f);
            f0.n.removeMessages(9, this.f);
            this.l = false;
        }
        Iterator iterator0 = this.i.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v v0 = ((z)object0).a;
            try {
                i i0 = new i();
                ((R2.c)((J5.k)v0.Z).c).t(c0, i0);
            }
            catch(DeadObjectException unused_ex) {
                this.b(3);
                c0.e("DeadObjectException thrown while calling register listener method.");
                break;
            }
            catch(RemoteException unused_ex) {
                iterator0.remove();
            }
        }
        this.g();
        this.j();
    }

    public final void i(int v) {
        f f0 = this.p;
        N5.r.d(f0.n);
        this.n = null;
        this.l = true;
        String s = this.e.j();
        io.sentry.internal.debugmeta.c c0 = this.g;
        c0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder("The connection to Google Play services was lost");
        if(v == 1) {
            stringBuilder0.append(" due to service disconnection.");
        }
        else if(v == 3) {
            stringBuilder0.append(" due to dead object exception.");
        }
        if(s != null) {
            stringBuilder0.append(" Last reason for disconnect: ");
            stringBuilder0.append(s);
        }
        c0.p(true, new Status(20, stringBuilder0.toString(), null, null));
        Message message0 = Message.obtain(f0.n, 9, this.f);
        f0.n.sendMessageDelayed(message0, 5000L);
        Message message1 = Message.obtain(f0.n, 11, this.f);
        f0.n.sendMessageDelayed(message1, 120000L);
        ((SparseIntArray)f0.g.Y).clear();
        for(Object object0: this.i.values()) {
            ((z)object0).getClass();
        }
    }

    public final void j() {
        this.p.n.removeMessages(12, this.f);
        Message message0 = this.p.n.obtainMessage(12, this.f);
        this.p.n.sendMessageDelayed(message0, this.p.a);
    }

    public final boolean k(F f0) {
        Feature feature1;
        if(!(f0 instanceof M5.w)) {
            c c0 = this.e;
            boolean z = c0.l();
            f0.d(this.g, z);
            try {
                f0.c(this);
            }
            catch(DeadObjectException unused_ex) {
                this.b(1);
                c0.e("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Feature[] arr_feature = ((M5.w)f0).g(this);
        if(arr_feature != null && arr_feature.length != 0) {
            Feature[] arr_feature1 = this.e.h();
            if(arr_feature1 == null) {
                arr_feature1 = new Feature[0];
            }
            s.e e0 = new s.e(arr_feature1.length);  // initializer: Ls/J;-><init>(I)V
            for(int v = 0; v < arr_feature1.length; ++v) {
                Feature feature0 = arr_feature1[v];
                e0.put(feature0.X, feature0.g());
            }
            int v1 = 0;
            while(v1 < arr_feature.length) {
                feature1 = arr_feature[v1];
                Long long0 = (Long)e0.get(feature1.X);
                if(long0 == null || ((long)long0) < feature1.g()) {
                    goto label_29;
                }
                ++v1;
            }
        }
        feature1 = null;
    label_29:
        if(feature1 == null) {
            c c1 = this.e;
            boolean z1 = c1.l();
            f0.d(this.g, z1);
            try {
                f0.c(this);
            }
            catch(DeadObjectException unused_ex) {
                this.b(1);
                c1.e("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.e.getClass().getName() + " could not execute call because it requires feature (" + feature1.X + ", " + feature1.g() + ").");
        if(this.p.o && ((M5.w)f0).f(this)) {
            s s0 = new s(this.f, feature1);
            int v2 = this.m.indexOf(s0);
            if(v2 >= 0) {
                s s1 = (s)this.m.get(v2);
                this.p.n.removeMessages(15, s1);
                Message message0 = Message.obtain(this.p.n, 15, s1);
                this.p.n.sendMessageDelayed(message0, 5000L);
                return false;
            }
            this.m.add(s0);
            Message message1 = Message.obtain(this.p.n, 15, s0);
            this.p.n.sendMessageDelayed(message1, 5000L);
            Message message2 = Message.obtain(this.p.n, 16, s0);
            this.p.n.sendMessageDelayed(message2, 120000L);
            ConnectionResult connectionResult0 = new ConnectionResult(2, null);
            if(!this.l(connectionResult0)) {
                this.p.c(connectionResult0, this.j);
            }
            return false;
        }
        ((M5.w)f0).b(new m(feature1));
        return true;
    }

    public final boolean l(ConnectionResult connectionResult0) {
        synchronized(f.r) {
            if(this.p.k != null && this.p.l.contains(this.f)) {
                o o0 = this.p.k;
                o0.getClass();
                G g0 = new G(connectionResult0, this.j);
            alab1:
                while(true) {
                    AtomicReference atomicReference0 = o0.Z;
                    while(true) {
                        if(atomicReference0.compareAndSet(null, g0)) {
                            Y6.b b0 = new Y6.b(14, o0, g0, false);
                            o0.b0.post(b0);
                            break alab1;
                        }
                        if(atomicReference0.get() == null) {
                            continue;
                        }
                        if(atomicReference0.get() == null) {
                            break;
                        }
                        break alab1;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public final void m() {
        int v1;
        Context context0;
        v v0;
        f f0 = this.p;
        N5.r.d(f0.n);
        c c0 = this.e;
        if(!c0.a() && !c0.g()) {
            try {
                v0 = f0.g;
                context0 = f0.e;
                v0.getClass();
                N5.r.j(context0);
                v1 = c0.f();
            }
            catch(IllegalStateException illegalStateException0) {
                this.o(new ConnectionResult(10), illegalStateException0);
                return;
            }
            SparseIntArray sparseIntArray0 = (SparseIntArray)v0.Y;
            try {
                int v2 = sparseIntArray0.get(v1, -1);
                if(v2 == -1) {
                    v2 = 0;
                    for(int v3 = 0; true; ++v3) {
                        if(v3 >= sparseIntArray0.size()) {
                            v2 = -1;
                            break;
                        }
                        int v4 = sparseIntArray0.keyAt(v3);
                        if(v4 > v1 && sparseIntArray0.get(v4) == 0) {
                            break;
                        }
                    }
                    if(v2 == -1) {
                        v2 = ((K5.b)v0.Z).b(context0, v1);
                    }
                    sparseIntArray0.put(v1, v2);
                }
                if(v2 != 0) {
                    ConnectionResult connectionResult0 = new ConnectionResult(v2, null);
                    Log.w("GoogleApiManager", "The service for " + c0.getClass().getName() + " is not available: " + connectionResult0.toString());
                    this.o(connectionResult0, null);
                    return;
                }
            }
            catch(IllegalStateException illegalStateException0) {
                this.o(new ConnectionResult(10), illegalStateException0);
                return;
            }
            t t0 = new t(f0, c0, this.f);
            if(c0.l()) {
                B b0 = this.k;
                N5.r.j(b0);
                m6.a a0 = b0.j;
                if(a0 != null) {
                    a0.k();
                }
                b0.i.g = System.identityHashCode(b0);
                a6.d d0 = b0.f;
                Looper looper0 = d0.getLooper();
                b0.j = (m6.a)b0.g.t(b0.e, looper0, b0.i, ((l6.a)b0.i.f), b0, b0);
                b0.k = t0;
                if(b0.h == null || b0.h.isEmpty()) {
                    d0.post(new d(9, b0));
                }
                else {
                    m6.a a1 = b0.j;
                    a1.getClass();
                    a1.m(new B3.c(14, a1));
                }
            }
            try {
                c0.m(t0);
            }
            catch(SecurityException securityException0) {
                this.o(new ConnectionResult(10), securityException0);
            }
        }
    }

    public final void n(F f0) {
        N5.r.d(this.p.n);
        boolean z = this.e.a();
        LinkedList linkedList0 = this.d;
        if(z) {
            if(this.k(f0)) {
                this.j();
                return;
            }
            linkedList0.add(f0);
            return;
        }
        linkedList0.add(f0);
        ConnectionResult connectionResult0 = this.n;
        if(connectionResult0 != null && connectionResult0.Y != 0 && connectionResult0.Z != null) {
            this.o(connectionResult0, null);
            return;
        }
        this.m();
    }

    public final void o(ConnectionResult connectionResult0, RuntimeException runtimeException0) {
        N5.r.d(this.p.n);
        B b0 = this.k;
        if(b0 != null) {
            m6.a a0 = b0.j;
            if(a0 != null) {
                a0.k();
            }
        }
        N5.r.d(this.p.n);
        this.n = null;
        ((SparseIntArray)this.p.g.Y).clear();
        this.a(connectionResult0);
        if(this.e instanceof P5.c && connectionResult0.Y != 24) {
            this.p.b = true;
            Message message0 = this.p.n.obtainMessage(19);
            this.p.n.sendMessageDelayed(message0, 300000L);
        }
        if(connectionResult0.Y == 4) {
            this.d(f.q);
            return;
        }
        if(this.d.isEmpty()) {
            this.n = connectionResult0;
            return;
        }
        if(runtimeException0 != null) {
            N5.r.d(this.p.n);
            this.f(null, runtimeException0, false);
            return;
        }
        if(this.p.o) {
            this.f(f.d(this.f, connectionResult0), null, true);
            if(!this.d.isEmpty() && !this.l(connectionResult0) && !this.p.c(connectionResult0, this.j)) {
                if(connectionResult0.Y == 18) {
                    this.l = true;
                }
                if(this.l) {
                    Message message1 = Message.obtain(this.p.n, 9, this.f);
                    this.p.n.sendMessageDelayed(message1, 5000L);
                    return;
                }
                this.d(f.d(this.f, connectionResult0));
            }
            return;
        }
        this.d(f.d(this.f, connectionResult0));
    }

    public final void p(ConnectionResult connectionResult0) {
        N5.r.d(this.p.n);
        String s = this.e.getClass().getName();
        this.e.e("onSignInFailed for " + s + " with " + connectionResult0);
        this.o(connectionResult0, null);
    }

    public final void q() {
        N5.r.d(this.p.n);
        this.d(f.p);
        this.g.getClass();
        this.g.p(false, f.p);
        M5.h[] arr_h = (M5.h[])this.i.keySet().toArray(new M5.h[0]);
        for(int v = 0; v < arr_h.length; ++v) {
            this.n(new D(arr_h[v], new i()));
        }
        this.a(new ConnectionResult(4));
        c c0 = this.e;
        if(c0.a()) {
            c0.d(new I5.h(13, this));
        }
    }
}

