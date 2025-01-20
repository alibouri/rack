package i;

import G0.a;
import a8.Q;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import w1.c;

public final class y extends a {
    public final int c;
    public final B d;
    public final Object e;

    public y(B b0, Q q0) {
        this.c = 1;
        this.d = b0;
        super(b0);
        this.e = q0;
    }

    public y(B b0, Context context0) {
        this.c = 0;
        this.d = b0;
        super(b0);
        this.e = (PowerManager)context0.getApplicationContext().getSystemService("power");
    }

    @Override  // G0.a
    public final IntentFilter e() {
        if(this.c != 0) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.TIME_SET");
            intentFilter0.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter0.addAction("android.intent.action.TIME_TICK");
            return intentFilter0;
        }
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter1;
    }

    @Override  // G0.a
    public final int g() {
        long v5;
        Location location2;
        Location location1;
        if(this.c != 0) {
            Q q0 = (Q)this.e;
            M m0 = (M)q0.b0;
            if(Long.compare(m0.b, System.currentTimeMillis()) > 0) {
                return m0.a ? 2 : 1;
            }
            Context context0 = (Context)q0.Y;
            int v = c.b(context0, "android.permission.ACCESS_COARSE_LOCATION");
            Location location0 = null;
            LocationManager locationManager0 = (LocationManager)q0.Z;
            if(v == 0) {
                try {
                    if(locationManager0.isProviderEnabled("network")) {
                        location1 = locationManager0.getLastKnownLocation("network");
                    }
                    else {
                        goto label_17;
                    }
                }
                catch(Exception exception0) {
                    Log.d("TwilightManager", "Failed to get last known location", exception0);
                    location1 = null;
                }
                goto label_18;
            label_17:
                location1 = null;
            label_18:
                location2 = location1;
            }
            else {
                location2 = null;
            }
            if(c.b(context0, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                try {
                    if(locationManager0.isProviderEnabled("gps")) {
                        location0 = locationManager0.getLastKnownLocation("gps");
                    }
                }
                catch(Exception exception1) {
                    Log.d("TwilightManager", "Failed to get last known location", exception1);
                }
            }
            if(location0 == null || location2 == null) {
                if(location0 != null) {
                    location2 = location0;
                }
            }
            else if(location0.getTime() > location2.getTime()) {
                location2 = location0;
            }
            boolean z = false;
            if(location2 != null) {
                long v1 = System.currentTimeMillis();
                if(L.d == null) {
                    L.d = new L();  // initializer: Ljava/lang/Object;-><init>()V
                }
                L l0 = L.d;
                l0.a(v1 - 86400000L, location2.getLatitude(), location2.getLongitude());
                l0.a(v1, location2.getLatitude(), location2.getLongitude());
                if(l0.c == 1) {
                    z = true;
                }
                long v2 = l0.b;
                long v3 = l0.a;
                l0.a(v1 + 86400000L, location2.getLatitude(), location2.getLongitude());
                long v4 = l0.b;
                if(v2 == -1L || v3 == -1L) {
                    v5 = v1 + 43200000L;
                }
                else {
                    if(v1 <= v3) {
                        v4 = v1 <= v2 ? v2 : v3;
                    }
                    v5 = v4 + 60000L;
                }
                m0.a = z;
                m0.b = v5;
                return z ? 2 : 1;
            }
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int v6 = Calendar.getInstance().get(11);
            if(v6 < 6 || v6 >= 22) {
                z = true;
            }
            return z ? 2 : 1;
        }
        return t.a(((PowerManager)this.e)) ? 2 : 1;
    }

    @Override  // G0.a
    public final void m() {
        if(this.c != 0) {
            this.d.n(true, true);
            return;
        }
        this.d.n(true, true);
    }
}

