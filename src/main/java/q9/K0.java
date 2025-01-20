package q9;

import Nb.j;
import T8.a;
import T8.b;
import android.content.Context;
import android.location.LocationManager;
import c2.I;
import com.google.android.gms.location.LocationRequest;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import hd.c;
import j6.z0;
import java.util.List;

public final class k0 implements a {
    public final Object X;
    public static final w1 Y;

    static {
        k0.Y = new w1(0L, "LastReviewDate");
    }

    public k0(NearbyAgentsActivity nearbyAgentsActivity0) {
        j.f(nearbyAgentsActivity0, "activity");
        super();
        this.X = nearbyAgentsActivity0;
        nearbyAgentsActivity0.v(new I(5), new B1(this, 0));
        nearbyAgentsActivity0.v(new I(4), new B1(this, 1));
        LocationRequest locationRequest0 = LocationRequest.g();
        locationRequest0.o();
        locationRequest0.Z = 1000L;
        U5.a.Y(100);
        locationRequest0.X = 100;
    }

    public k0(F3 f30) {
        this.X = f30;
    }

    public k0(z3 z30) {
        j.f(z30, "ctx");
        super();
        this.X = new m(z30, "LastReviewDate");
    }

    public static boolean a(Context context0) {
        try {
            Object object0 = context0.getSystemService("location");
            j.d(object0, "null cannot be cast to non-null type android.location.LocationManager");
            return ((LocationManager)object0).isProviderEnabled("gps");
        }
        catch(Exception exception0) {
            c.a.c(exception0);
            return false;
        }
    }

    @Override  // T8.a
    public void d(b b0) {
        F3 f30 = (F3)this.X;
        f30.getClass();
        f30.b.d();
        if(f30.f.b) {
            try {
                f30.a.getResources().openRawResourceFd(0x7F110002).close();  // raw:zxing_beep
            }
            catch(Throwable throwable0) {
                c.a.n("WaveBarcodeCapMgr");
                c.a.m(throwable0, "Exception while trying to open zxing_beep; disabling", new Object[0]);
                f30.f.b = false;
            }
        }
        f30.f.b();
        z0 z00 = new z0(19, this, b0, false);
        f30.g.post(z00);
    }

    @Override  // T8.a
    public void e(List list0) {
    }
}

