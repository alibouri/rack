package N5;

import I5.h;
import K5.c;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class e {
    public volatile String X;
    public A Y;
    public final Context Z;
    public final z b0;
    public final c c0;
    public final s d0;
    public final Object e0;
    public final Object f0;
    public n g0;
    public d h0;
    public IInterface i0;
    public final ArrayList j0;
    public u k0;
    public int l0;
    public final b m0;
    public final N5.c n0;
    public final int o0;
    public final String p0;
    public volatile String q0;
    public ConnectionResult r0;
    public boolean s0;
    public volatile zzk t0;
    public final AtomicInteger u0;
    public static final Feature[] v0;

    static {
        e.v0 = new Feature[0];
    }

    public e(Context context0, Looper looper0, z z0, c c0, int v, b b0, N5.c c1, String s) {
        this.X = null;
        this.e0 = new Object();
        this.f0 = new Object();
        this.j0 = new ArrayList();
        this.l0 = 1;
        this.r0 = null;
        this.s0 = false;
        this.t0 = null;
        this.u0 = new AtomicInteger(0);
        r.k(context0, "Context must not be null");
        this.Z = context0;
        r.k(looper0, "Looper must not be null");
        r.k(z0, "Supervisor must not be null");
        this.b0 = z0;
        r.k(c0, "API availability must not be null");
        this.c0 = c0;
        this.d0 = new s(this, looper0);
        this.o0 = v;
        this.m0 = b0;
        this.n0 = c1;
        this.p0 = s;
    }

    public static boolean A(e e0, int v, int v1, IInterface iInterface0) {
        synchronized(e0.e0) {
            if(e0.l0 != v) {
                return false;
            }
            e0.B(v1, iInterface0);
            return true;
        }
    }

    public final void B(int v, IInterface iInterface0) {
        r.b((v == 4 ? 1 : 0) == (iInterface0 == null ? 0 : 1));
        synchronized(this.e0) {
            this.l0 = v;
            this.i0 = iInterface0;
            switch(v) {
                case 1: {
                    u u0 = this.k0;
                    if(u0 != null) {
                        z z0 = this.b0;
                        String s = this.Y.b;
                        r.j(s);
                        this.Y.getClass();
                        if(this.p0 == null) {
                            this.Z.getClass();
                        }
                        z0.c(s, u0, this.Y.c);
                        this.k0 = null;
                    }
                    break;
                }
                case 2: 
                case 3: {
                    u u1 = this.k0;
                    if(u1 != null) {
                        A a0 = this.Y;
                        if(a0 != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + a0.b + " on com.google.android.gms");
                            z z1 = this.b0;
                            String s1 = this.Y.b;
                            r.j(s1);
                            this.Y.getClass();
                            if(this.p0 == null) {
                                this.Z.getClass();
                            }
                            z1.c(s1, u1, this.Y.c);
                            this.u0.incrementAndGet();
                        }
                    }
                    u u2 = new u(this, this.u0.get());
                    this.k0 = u2;
                    String s2 = this.v();
                    boolean z2 = this.w();
                    this.Y = new A(s2, z2, 0);
                    if(z2 && this.f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: " + this.Y.b);
                    }
                    String s3 = this.Y.b;
                    r.j(s3);
                    this.Y.getClass();
                    String s4 = this.p0 == null ? this.Z.getClass().getName() : this.p0;
                    if(!this.b0.d(new x(s3, this.Y.c), u2, s4, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.Y.b + " on com.google.android.gms");
                        int v2 = this.u0.get();
                        w w0 = new w(this, 16);
                        Message message0 = this.d0.obtainMessage(7, v2, -1, w0);
                        this.d0.sendMessage(message0);
                    }
                    break;
                }
                case 4: {
                    r.j(iInterface0);
                }
            }
        }
    }

    public final boolean a() {
        synchronized(this.e0) {
        }
        return this.l0 == 4;
    }

    public final void c(g g0, Set set0) {
        Bundle bundle0 = this.r();
        String s = this.q0;
        Bundle bundle1 = new Bundle();
        GetServiceRequest getServiceRequest0 = new GetServiceRequest(6, this.o0, c.a, null, null, GetServiceRequest.m0, bundle1, null, GetServiceRequest.n0, GetServiceRequest.n0, true, 0, false, s);
        getServiceRequest0.b0 = "com.wave.personal";
        getServiceRequest0.e0 = bundle0;
        if(set0 != null) {
            getServiceRequest0.d0 = (Scope[])set0.toArray(new Scope[0]);
        }
        if(this.l()) {
            Account account0 = this.p();
            if(account0 == null) {
                account0 = new Account("<<default account>>", "com.google");
            }
            getServiceRequest0.f0 = account0;
            if(g0 != null) {
                getServiceRequest0.c0 = g0.asBinder();
            }
        }
        getServiceRequest0.g0 = e.v0;
        getServiceRequest0.h0 = this.q();
        if(this.y()) {
            getServiceRequest0.k0 = true;
        }
        try {
            synchronized(this.f0) {
                n n0 = this.g0;
                if(n0 == null) {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
                else {
                    n0.b(new t(this, this.u0.get()), getServiceRequest0);
                }
            }
        }
        catch(DeadObjectException deadObjectException0) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", deadObjectException0);
            int v1 = this.u0.get();
            Message message0 = this.d0.obtainMessage(6, v1, 3);
            this.d0.sendMessage(message0);
        }
        catch(SecurityException securityException0) {
            throw securityException0;
        }
        catch(RemoteException | RuntimeException remoteException0) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", remoteException0);
            int v2 = this.u0.get();
            v v3 = new v(this, 8, null, null);
            Message message1 = this.d0.obtainMessage(1, v2, -1, v3);
            this.d0.sendMessage(message1);
        }
    }

    public final void d(h h0) {
        ((M5.r)h0.Y).p.n.post(new E5.d(8, h0));
    }

    public final void e(String s) {
        this.X = s;
        this.k();
    }

    public abstract int f();

    public final boolean g() {
        boolean z = true;
        synchronized(this.e0) {
            if(this.l0 != 2 && this.l0 != 3) {
                z = false;
            }
        }
        return z;
    }

    public final Feature[] h() {
        return this.t0 == null ? null : this.t0.Y;
    }

    public final void i() {
        if(!this.a() || this.Y == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final String j() {
        return this.X;
    }

    public final void k() {
        this.u0.incrementAndGet();
        synchronized(this.j0) {
            int v1 = this.j0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((l)this.j0.get(v2)).c();
            }
            this.j0.clear();
        }
        synchronized(this.f0) {
            this.g0 = null;
        }
        this.B(1, null);
    }

    public boolean l() {
        return false;
    }

    public final void m(d d0) {
        this.h0 = d0;
        this.B(2, null);
    }

    public final void n() {
        int v = this.f();
        int v1 = this.c0.b(this.Z, v);
        if(v1 != 0) {
            this.B(1, null);
            this.h0 = new B3.c(14, this);
            int v2 = this.u0.get();
            Message message0 = this.d0.obtainMessage(3, v2, v1, null);
            this.d0.sendMessage(message0);
            return;
        }
        this.m(new B3.c(14, this));
    }

    public abstract IInterface o(IBinder arg1);

    public Account p() {
        return null;
    }

    public Feature[] q() {
        return e.v0;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.emptySet();
    }

    public final IInterface t() {
        synchronized(this.e0) {
            if(this.l0 != 5) {
                if(!this.a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface0 = this.i0;
                r.k(iInterface0, "Client is connected but service is null");
                return iInterface0;
            }
        }
        throw new DeadObjectException();
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return this.f() >= 211700000;
    }

    public void x() {
    }

    public boolean y() {
        return this instanceof Z5.g;
    }

    public static void z(e e0) {
        int v;
        synchronized(e0.e0) {
        }
        if(e0.l0 == 3) {
            e0.s0 = true;
            v = 5;
        }
        else {
            v = 4;
        }
        int v1 = e0.u0.get();
        Message message0 = e0.d0.obtainMessage(v, v1, 16);
        e0.d0.sendMessage(message0);
    }
}

