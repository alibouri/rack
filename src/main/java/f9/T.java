package f9;

import Ba.l;
import E7.w;
import J5.k;
import J9.f;
import K.v;
import L5.e;
import M5.D;
import M5.h;
import M5.y;
import M5.z;
import Nb.j;
import U5.a;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.LiveData;
import com.google.android.gms.location.LocationRequest;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import d6.b;
import d6.d;
import hd.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import o6.i;
import o6.p;
import q9.r1;

public final class t extends LiveData {
    public final boolean l;
    public final long m;
    public final Context n;
    public final LocationManager o;
    public final LinkedHashMap p;
    public final b q;
    public final r r;

    public t(NearbyAgentsActivity nearbyAgentsActivity0) {
        j.f(nearbyAgentsActivity0, "activity");
        super();
        this.l = true;
        this.m = 120000L;
        Context context0 = nearbyAgentsActivity0.getApplicationContext();
        this.n = context0;
        Object object0 = context0.getSystemService("location");
        j.d(object0, "null cannot be cast to non-null type android.location.LocationManager");
        this.o = (LocationManager)object0;
        this.p = new LinkedHashMap();
        new r1(nearbyAgentsActivity0, 3);
        this.q = new b(context0, null, b.k, L5.b.b, e.c);  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
        this.r = new r(this);
        this.m();
    }

    @Override  // androidx.lifecycle.LiveData
    public final void f() {
        boolean z = true;
        c.a.n("LocationLD");
        c.a.a("Location Livedata became active.", new Object[0]);
        this.m();
        j.e(this.n, "appContext");
        if(t.k(this.n)) {
            if(K5.b.d.b(this.n, K5.c.a) == 0) {
                LocationRequest locationRequest0 = LocationRequest.g();
                locationRequest0.o();
                locationRequest0.Z = 1000L;
                a.Y(100);
                locationRequest0.X = 100;
                b b0 = this.q;
                r r0 = this.r;
                Looper looper0 = Looper.getMainLooper();
                b0.getClass();
                if(looper0 == null) {
                    looper0 = Looper.myLooper();
                    N5.r.k(looper0, "invalid null looper");
                }
                N5.r.k(r0, "Listener must not be null");
                M5.j j0 = new M5.j(looper0, r0, r.class.getSimpleName());
                d6.a a0 = new d6.a();  // initializer: Ljava/lang/Object;-><init>()V
                a0.Z = b0;
                a0.X = true;
                a0.Y = j0;
                R2.c c0 = new R2.c(11, a0, locationRequest0, false);
                k k0 = new k(2);
                k0.c = c0;
                k0.d = a0;
                k0.e = j0;
                k0.b = 0x984;
                h h0 = (h)j0.c;
                N5.r.k(h0, "Key must not be null");
                M5.j j1 = (M5.j)k0.e;
                int v = k0.b;
                v v1 = new v(k0, j1, v);
                U7.c c1 = new U7.c(k0, 14, h0);
                N5.r.k(((h)j1.c), "Listener has already been released.");
                b0.j.getClass();
                i i0 = new i();
                b0.j.f(i0, v, b0);
                y y0 = new y(new D(new z(v1, c1), i0), b0.j.i.get(), b0);
                Message message0 = b0.j.n.obtainMessage(8, y0);
                b0.j.n.sendMessage(message0);
                return;
            }
            List list0 = this.o.getProviders(true);
            j.e(list0, "getProviders(...)");
            if(!this.l && list0.contains("network")) {
                z = false;
            }
            for(Object object0: list0) {
                String s = (String)object0;
                if(!j.a(s, "gps") || z) {
                    LinkedHashMap linkedHashMap0 = this.p;
                    Object object1 = linkedHashMap0.get(s);
                    if(object1 == null) {
                        object1 = new s(this);
                        linkedHashMap0.put(s, object1);
                    }
                    long v2 = j.a(s, "passive") ? 1000L : 120000L;
                    c.a.n("LocationLD");
                    c.a.a("Requesting updates for location provider: \'" + s + "\'", new Object[0]);
                    this.o.requestLocationUpdates(s, v2, 0.0f, ((LocationListener)object1));
                }
            }
        }
    }

    @Override  // androidx.lifecycle.LiveData
    public final void g() {
        c.a.n("LocationLD");
        c.a.a("Location Livedata shutting down.", new Object[0]);
        if(K5.b.d.b(this.n, K5.c.a) == 0) {
            this.q.getClass();
            String s = r.class.getSimpleName();
            N5.r.k(this.r, "Listener must not be null");
            N5.r.g(s, "Listener type must not be empty");
            h h0 = new h(this.r, s);
            this.q.b(h0, 0x972).l(d.Y, io.sentry.hints.i.Y);
            return;
        }
        LinkedHashMap linkedHashMap0 = this.p;
        for(Object object0: linkedHashMap0.entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            LocationListener locationListener0 = (LocationListener)((Map.Entry)object0).getValue();
            c.a.n("LocationD");
            c.a.a("Removing updates for location provider: \'" + s1 + "\' ", new Object[0]);
            this.o.removeUpdates(locationListener0);
        }
        linkedHashMap0.clear();
    }

    public static boolean k(Context context0) {
        j.f(context0, "context");
        boolean z = w1.c.a(context0, "android.permission.ACCESS_FINE_LOCATION") == 0;
        c.a.n("LocationLD");
        c.a.a("Location permission granted: " + z, new Object[0]);
        return z;
    }

    public final void l(Location location0) {
        j.f(location0, "l");
        c.a.n("LocationLD");
        boolean z = false;
        c.a.a("Received location update", new Object[0]);
        Object object0 = this.e == LiveData.k ? null : this.e;
        if(((Location)object0) != null) {
            long v = location0.getTime() - ((Location)object0).getTime();
            boolean z1 = v < -this.m;
            if(Long.compare(v, this.m) <= 0) {
                if(z1) {
                    location0 = (Location)object0;
                }
                else {
                    int v1 = (int)(location0.getAccuracy() - ((Location)object0).getAccuracy());
                    if(v1 > 200) {
                        z = true;
                    }
                    if(v1 >= 0 && (v <= 0L || v1 > 0) && (v <= 0L || z || !j.a(location0.getProvider(), ((Location)object0).getProvider()))) {
                        location0 = (Location)object0;
                    }
                }
            }
        }
        this.h(location0);
    }

    public final void m() {
        Context context0 = this.n;
        j.e(context0, "appContext");
        if(!t.k(context0)) {
            return;
        }
        if(K5.b.d.b(context0, K5.c.a) == 0) {
            this.q.getClass();
            f f0 = f.c();
            f0.c = v7.d.Z;
            f0.b = 0x96E;
            f f1 = f0.b();
            p p0 = this.q.c(0, f1);
            w w0 = new w(13, new l(27, this));
            p0.getClass();
            p0.c(o6.j.a, w0);
            return;
        }
        LocationManager locationManager0 = this.o;
        Location location0 = locationManager0.getLastKnownLocation("gps");
        if(location0 == null) {
            location0 = locationManager0.getLastKnownLocation("network");
        }
        if(location0 != null) {
            this.l(location0);
        }
    }
}

