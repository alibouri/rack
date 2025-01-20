package d6;

import N4.j;
import N6.d;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import o6.i;

public final class f extends d {
    public final int e;
    public final i f;

    public f(int v, i i0) {
        this.e = v;
        if(v != 1) {
            this.f = i0;
            super("com.google.android.gms.location.internal.ISettingsCallbacks", 6);
            return;
        }
        this.f = i0;
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 6);
    }

    @Override  // N6.d
    public final boolean L(int v, Parcel parcel0) {
        if(this.e != 0) {
            if(v == 1) {
                Status status0 = (Status)c.a(parcel0, Status.CREATOR);
                Location location0 = (Location)c.a(parcel0, Location.CREATOR);
                c.c(parcel0);
                j.N(status0, location0, this.f);
                return true;
            }
            return false;
        }
        if(v == 1) {
            LocationSettingsResult locationSettingsResult0 = (LocationSettingsResult)c.a(parcel0, LocationSettingsResult.CREATOR);
            c.c(parcel0);
            io.sentry.hints.i i0 = new io.sentry.hints.i(20);
            j.N(locationSettingsResult0.X, i0, this.f);
            return true;
        }
        return false;
    }
}

