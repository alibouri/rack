package com.google.android.gms.location;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean b0;
    public final boolean c0;
    public final boolean d0;

    static {
        LocationSettingsStates.CREATOR = new a(24);
    }

    public LocationSettingsStates(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.X = z;
        this.Y = z1;
        this.Z = z2;
        this.b0 = z3;
        this.c0 = z4;
        this.d0 = z5;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(((int)this.X));
        f.K(parcel0, 2, 4);
        parcel0.writeInt(((int)this.Y));
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.K(parcel0, 4, 4);
        parcel0.writeInt(((int)this.b0));
        f.K(parcel0, 5, 4);
        parcel0.writeInt(((int)this.c0));
        f.K(parcel0, 6, 4);
        parcel0.writeInt(((int)this.d0));
        f.J(v1, parcel0);
    }
}

