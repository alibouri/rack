package R2;

import Bb.p;
import Bb.q;
import D0.K;
import H6.e;
import J1.N;
import J1.V;
import M5.l;
import Nb.j;
import U.Z;
import W5.f;
import Xb.G;
import a8.Q;
import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode.Callback;
import android.view.Menu;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.measurement.K2;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.location.LocationRequest;
import d6.g;
import d6.t;
import i.B;
import i.r;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import n.x;
import o6.i;
import pc.m;
import q2.C;
import r8.o;
import s.J;
import sb.d;
import sb.n;
import t5.b;
import x7.a;
import y5.h;

public final class c implements l, o6.c, m, b {
    public final int X;
    public Object Y;
    public final Object Z;

    public c(int v) {
        this.X = v;
        switch(v) {
            case 10: {
                super();
                this.Y = new TreeMap();
                this.Z = new TreeMap();
                return;
            }
            case 15: {
                super();
                this.Y = new SparseIntArray();
                this.Z = new SparseIntArray();
                return;
            }
            default: {
                super();
                this.Y = new Object();
                this.Z = new ArrayBlockingQueue(0x200);
            }
        }
    }

    public c(int v, Object object0, Object object1, boolean z) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    public c(G g0) {
        this.X = 17;
        d.a.getClass();
        j.f(g0, "scope");
        j.f(sb.c.b, "makePinger");
        super();
        this.Y = g0;
        this.Z = q.L(new d[]{sb.c.b.j("8.8.8.8", g0), sb.c.b.j("voip-ping.wave-internal.com", g0)});
    }

    public c(IBinder iBinder0) {
        this.X = 4;
        super();
        String s = iBinder0.getInterfaceDescriptor();
        if(Objects.equals(s, "android.os.IMessenger")) {
            this.Y = new Messenger(iBinder0);
            this.Z = null;
            return;
        }
        if(Objects.equals(s, "com.google.android.gms.iid.IMessengerCompat")) {
            this.Z = new zzd(iBinder0);
            this.Y = null;
            return;
        }
        Log.w("MessengerIpcClient", "Invalid interface descriptor: " + s);
        throw new RemoteException();
    }

    public c(LayoutNode layoutNode0, K k0) {
        this.X = 2;
        super();
        this.Y = layoutNode0;
        this.Z = U.d.D(k0, Z.e);
    }

    public c(WorkDatabase_Impl workDatabase_Impl0) {
        this.X = 0;
        super();
        this.Y = workDatabase_Impl0;
        this.Z = new R2.b(workDatabase_Impl0, 0);
    }

    public c(Object object0, int v, Object object1) {
        this.X = v;
        this.Z = object0;
        this.Y = object1;
        super();
    }

    public c(String s, List list0) {
        this.X = 16;
        j.f(s, "dnsHostname");
        j.f(list0, "dnsServers");
        super();
        this.Y = s;
        this.Z = list0;
    }

    public c(Callable callable0) {
        this.X = 13;
        super();
        this.Z = callable0;
    }

    public c(a a0) {
        this.X = 8;
        super();
        this.Z = Collections.synchronizedMap(new HashMap());
        this.Y = a0;
    }

    public c(x8.b b0) {
        this.X = 1;
        super();
        this.Y = b0;
        this.Z = new y8.a(b0);
    }

    @Override  // pc.m
    public List a(String s) {
        j.f(s, "hostname");
        String s1 = (String)this.Y;
        if(!j.a(s1, s)) {
            throw new UnknownHostException("BootstrapDns called for " + s + " instead of " + s1);
        }
        return (List)this.Z;
    }

    public static int b(o o0, o o1) {
        return yc.d.B(o.a(o0, o1));
    }

    public byte[] c() {
        if(((byte[])this.Y) == null) {
            Callable callable0 = (Callable)this.Z;
            if(callable0 != null) {
                this.Y = (byte[])callable0.call();
            }
        }
        byte[] arr_b = (byte[])this.Y;
        return arr_b == null ? new byte[0] : arr_b;
    }

    public ArrayList d(String s) {
        C c0 = M6.b.o(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        c0.c(1, s);
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.Y;
        workDatabase_Impl0.b();
        Cursor cursor0 = P4.c.O(workDatabase_Impl0, c0, false);
        try {
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                arrayList0.add(cursor0.getString(0));
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public K e() {
        return (K)((ParcelableSnapshotMutableState)this.Z).getValue();
    }

    public static int f(int v, int v1) {
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            ++v3;
            if(v3 == v1) {
                ++v4;
                v3 = 0;
            }
            else if(v3 > v1) {
                ++v4;
                v3 = 1;
            }
        }
        return v3 + 1 <= v1 ? v4 : v4 + 1;
    }

    public static void g(HashMap hashMap0, o o0) {
        Integer integer0 = (Integer)hashMap0.get(o0);
        hashMap0.put(o0, ((int)(integer0 == null ? 1 : 1 + ((int)integer0))));
    }

    @Override  // zb.a
    public Object get() {
        L7.b b0 = new L7.b(1);
        e e0 = new e(1);
        Object object0 = ((g3.b)this.Y).get();
        return new h(b0, e0, y5.a.f, ((y5.j)object0), ((zb.a)this.Z));
    }

    public void h() {
        ((SparseIntArray)this.Y).clear();
    }

    public boolean i(o o0) {
        float f = o0.a;
        if(f >= 0.0f) {
            x8.b b0 = (x8.b)this.Y;
            return f >= ((float)b0.X) && (o0.b <= 0.0f && o0.b >= ((float)b0.Y));
        }
        return false;
    }

    private final void j(o6.h h0) {
        N6.q q0 = (N6.q)this.Y;
        synchronized(q0.f) {
            q0.e.remove(((i)this.Z));
        }
    }

    public void k(androidx.appcompat.view.a a0) {
        E7.C c0 = (E7.C)this.Y;
        androidx.appcompat.view.e e0 = c0.A(a0);
        ((ActionMode.Callback)c0.X).onDestroyActionMode(e0);
        B b0 = (B)this.Z;
        if(b0.u0 != null) {
            b0.j0.getDecorView().removeCallbacks(b0.v0);
        }
        if(b0.t0 != null) {
            V v0 = b0.w0;
            if(v0 != null) {
                v0.b();
            }
            V v1 = N.a(b0.t0);
            v1.a(0.0f);
            b0.w0 = v1;
            v1.d(new r(2, this));
        }
        b0.s0 = null;
        J1.C.c(b0.y0);
        b0.J();
    }

    public boolean l(androidx.appcompat.view.a a0, n.j j0) {
        J1.C.c(((B)this.Z).y0);
        E7.C c0 = (E7.C)this.Y;
        androidx.appcompat.view.e e0 = c0.A(a0);
        J j1 = (J)c0.b0;
        Menu menu0 = (Menu)j1.get(j0);
        if(menu0 == null) {
            menu0 = new x(((Context)c0.Y), j0);
            j1.put(j0, menu0);
        }
        return ((ActionMode.Callback)c0.X).onPrepareActionMode(e0, menu0);
    }

    public static x8.b m(x8.b b0, o o0, o o1, o o2, o o3, int v, int v1) {
        return a.a.y(b0, v, v1, x8.e.a(0.5f, 0.5f, ((float)v) - 0.5f, 0.5f, ((float)v) - 0.5f, ((float)v1) - 0.5f, 0.5f, ((float)v1) - 0.5f, o0.a, o0.b, o3.a, o3.b, o2.a, o2.b, o1.a, o1.b));
    }

    public void n(Ba.l l0) {
        ArrayList arrayList0;
        synchronized(this.Y) {
            arrayList0 = new ArrayList();
            ((ArrayBlockingQueue)this.Z).drainTo(arrayList0);
        }
        Iterator iterator0 = arrayList0.iterator();
        if(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(object1 != null) {
                throw new ClassCastException();
            }
            l0.n(null);
            throw null;
        }
    }

    public Serializable o(Fb.c c0) {
        n n0;
        if(c0 instanceof n) {
            n0 = (n)c0;
            int v = n0.d0;
            if((v & 0x80000000) == 0) {
                n0 = new n(this, c0);
            }
            else {
                n0.d0 = v ^ 0x80000000;
            }
        }
        else {
            n0 = new n(this, c0);
        }
        Object object0 = n0.b0;
        Serializable serializable0 = Eb.a.X;
        switch(n0.d0) {
            case 0: {
                f.b0(object0);
                ArrayList arrayList0 = new ArrayList(Bb.r.b0(((List)this.Z)));
                for(Object object1: ((List)this.Z)) {
                    sb.m m0 = new sb.m(((d)object1), null);
                    arrayList0.add(Xb.J.d(((G)this.Y), null, m0, 3));
                }
                n0.d0 = 1;
                object0 = Xb.J.e(arrayList0, n0);
                return object0 == serializable0 ? serializable0 : p.n0(((Iterable)object0));
            }
            case 1: {
                f.b0(object0);
                return p.n0(((Iterable)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public C8.a p(o o0, o o1) {
        int v = (int)o0.a;
        int v1 = (int)o0.b;
        int v2 = (int)o1.a;
        int v3 = (int)o1.b;
        int v4 = 1;
        boolean z = Math.abs(v3 - v1) > Math.abs(v2 - v);
        if(z) {
            int v5 = v1;
            v1 = v;
            v = v5;
            int v6 = v3;
            v3 = v2;
            v2 = v6;
        }
        int v7 = Math.abs(v2 - v);
        int v8 = Math.abs(v3 - v1);
        int v9 = -v7 / 2;
        if(v >= v2) {
            v4 = -1;
        }
        x8.b b0 = (x8.b)this.Y;
        boolean z1 = b0.c((z ? v1 : v), (z ? v : v1));
        int v10 = 0;
        while(v != v2) {
            boolean z2 = b0.c((z ? v1 : v), (z ? v : v1));
            if(z2 != z1) {
                ++v10;
                z1 = z2;
            }
            v9 += v8;
            if(v9 > 0) {
                if(v1 == v3) {
                    break;
                }
                v1 += (v1 >= v3 ? -1 : 1);
                v9 -= v7;
            }
            v += v4;
            v2 = v2;
        }
        return new C8.a(o0, o1, v10);
    }

    public void q(R2.h h0, Q q0) {
        K2 k20 = new K2(q0);
        TreeMap treeMap0 = (TreeMap)this.Y;
        for(Object object0: treeMap0.keySet()) {
            com.google.android.gms.internal.measurement.c c0 = (com.google.android.gms.internal.measurement.c)((com.google.android.gms.internal.measurement.c)q0.Z).clone();
            com.google.android.gms.internal.measurement.o o0 = ((com.google.android.gms.internal.measurement.p)treeMap0.get(((Integer)object0))).b(h0, Collections.singletonList(k20));
            int v = o0 instanceof com.google.android.gms.internal.measurement.h ? x1.m(((double)((com.google.android.gms.internal.measurement.h)o0).X)) : -1;
            if(v == -1 || v == 2) {
                q0.Z = c0;
            }
        }
        TreeMap treeMap1 = (TreeMap)this.Z;
        for(Object object1: treeMap1.keySet()) {
            com.google.android.gms.internal.measurement.o o1 = ((com.google.android.gms.internal.measurement.p)treeMap1.get(((Integer)object1))).b(h0, Collections.singletonList(k20));
            if(o1 instanceof com.google.android.gms.internal.measurement.h) {
                com.google.android.gms.internal.measurement.h h1 = (com.google.android.gms.internal.measurement.h)o1;
            }
        }
    }

    @Override  // o6.c
    public void s(o6.h h0) {
        if(this.X != 6) {
            T6.i i0 = (T6.i)this.Y;
            synchronized(i0.f) {
                i0.e.remove(((i)this.Z));
            }
            return;
        }
        this.j(h0);
    }

    @Override  // M5.l
    public void t(Object object0, Object object1) {
        d6.i i1;
        d6.a a0 = (d6.a)this.Y;
        LocationRequest locationRequest0 = (LocationRequest)this.Z;
        ((d6.j)object0).getClass();
        M5.j j0 = a0.l();
        M5.h h0 = (M5.h)j0.c;
        Objects.requireNonNull(h0);
        boolean z = ((d6.j)object0).C(g6.c.b);
        synchronized(((d6.j)object0).y0) {
            d6.i i0 = (d6.i)((d6.j)object0).y0.get(h0);
            if(i0 == null || z) {
                i1 = new d6.i(a0);
                ((d6.j)object0).y0.put(h0, i1);
            }
            else {
                i0.N(j0);
                i1 = i0;
                i0 = null;
            }
            if(z) {
                t t0 = (t)((d6.j)object0).t();
                g g0 = new g(null, ((i)object1));
                Parcel parcel0 = t0.J();
                d6.c.b(parcel0, new zzee(2, (i0 == null ? null : i0), i1, null, h0.b + "@" + System.identityHashCode(h0.a)));
                d6.c.b(parcel0, locationRequest0);
                parcel0.writeStrongBinder(g0);
                t0.M(88, parcel0);
            }
            else {
                t t1 = (t)((d6.j)object0).t();
                zzeg zzeg0 = new zzeg(locationRequest0, null, false, false, false, false, 0x7FFFFFFFFFFFFFFFL);
                d6.e e0 = new d6.e(((i)object1), i1);
                Parcel parcel1 = t1.J();
                d6.c.b(parcel1, new zzei(1, zzeg0, null, i1, null, e0, h0.b + "@" + System.identityHashCode(h0.a)));
                t1.M(59, parcel1);
            }
        }
    }
}

