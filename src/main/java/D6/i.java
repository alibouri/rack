package d6;

import I5.h;
import L7.b;
import M5.j;
import N6.d;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import g6.e;

public final class i extends d implements e {
    public final a e;
    public static final int f;

    public i(a a0) {
        super("com.google.android.gms.location.ILocationCallback", 6);
        this.e = a0;
    }

    @Override  // N6.d
    public final boolean L(int v, Parcel parcel0) {
        a a0 = this.e;
        switch(v) {
            case 1: {
                LocationResult locationResult0 = (LocationResult)c.a(parcel0, LocationResult.CREATOR);
                c.c(parcel0);
                a0.l().a(new B3.d(26, locationResult0));
                return true;
            }
            case 2: {
                LocationAvailability locationAvailability0 = (LocationAvailability)c.a(parcel0, LocationAvailability.CREATOR);
                c.c(parcel0);
                a0.l().a(new b(18));
                return true;
            }
            case 3: {
                this.O();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void N(j j0) {
        a a0 = this.e;
        synchronized(a0) {
            j j1 = (j)a0.Y;
            if(j1 != j0) {
                j1.b = null;
                j1.c = null;
                a0.Y = j0;
            }
        }
    }

    public final void O() {
        this.e.l().a(new h(28, this));
    }
}

