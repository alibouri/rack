package com.google.android.gms.location;

import L5.l;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsResult extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator CREATOR;
    public final Status X;
    public final LocationSettingsStates Y;

    static {
        LocationSettingsResult.CREATOR = new a(23);
    }

    public LocationSettingsResult(Status status0, LocationSettingsStates locationSettingsStates0) {
        this.X = status0;
        this.Y = locationSettingsStates0;
    }

    @Override  // L5.l
    public final Status c() {
        return this.X;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.E(parcel0, 1, this.X, v);
        f.E(parcel0, 2, this.Y, v);
        f.J(v1, parcel0);
    }
}

