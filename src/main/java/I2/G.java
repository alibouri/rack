package I2;

import Bb.B;
import M.J;
import Nb.j;
import S2.e;
import android.net.NetworkRequest;
import android.os.Build.VERSION;
import java.util.Set;
import v.h;

public final class g {
    public final int a;
    public final e b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public static final g j;

    static {
        g.j = new g();
    }

    public g() {
        J.l(1, "requiredNetworkType");
        super();
        this.b = new e(null);
        this.a = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = B.X;
    }

    public g(g g0) {
        j.f(g0, "other");
        super();
        this.c = g0.c;
        this.d = g0.d;
        this.b = g0.b;
        this.a = g0.a;
        this.e = g0.e;
        this.f = g0.f;
        this.i = g0.i;
        this.g = g0.g;
        this.h = g0.h;
    }

    public g(e e0, int v, boolean z, boolean z1, boolean z2, boolean z3, long v1, long v2, Set set0) {
        j.f(e0, "requiredNetworkRequestCompat");
        J.l(v, "requiredNetworkType");
        super();
        this.b = e0;
        this.a = v;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = v1;
        this.h = v2;
        this.i = set0;
    }

    public final NetworkRequest a() {
        return (NetworkRequest)this.b.a;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT < 24 || !this.i.isEmpty();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!g.class.equals(class0) || this.c != ((g)object0).c) {
                return false;
            }
            if(this.d != ((g)object0).d) {
                return false;
            }
            if(this.e != ((g)object0).e) {
                return false;
            }
            if(this.f != ((g)object0).f) {
                return false;
            }
            if(this.g != ((g)object0).g) {
                return false;
            }
            if(this.h != ((g)object0).h) {
                return false;
            }
            if(!j.a(this.a(), ((g)object0).a())) {
                return false;
            }
            return this.a == ((g)object0).a ? j.a(this.i, ((g)object0).i) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = h.d(this.a);
        int v1 = (this.i.hashCode() + ((((((v * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F) * 0x1F;
        NetworkRequest networkRequest0 = this.a();
        return networkRequest0 == null ? v1 : v1 + networkRequest0.hashCode();
    }

    @Override
    public final String toString() {
        return "Constraints{requiredNetworkType=" + A3.e.A(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }
}

