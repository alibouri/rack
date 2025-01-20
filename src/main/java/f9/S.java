package f9;

import Nb.j;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public final class s implements LocationListener {
    public final t a;

    public s(t t0) {
        this.a = t0;
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        j.f(location0, "location");
        this.a.l(location0);
    }

    @Override  // android.location.LocationListener
    public final void onProviderDisabled(String s) {
        j.f(s, "provider");
    }

    @Override  // android.location.LocationListener
    public final void onProviderEnabled(String s) {
        j.f(s, "provider");
    }

    @Override  // android.location.LocationListener
    public final void onStatusChanged(String s, int v, Bundle bundle0) {
    }
}

