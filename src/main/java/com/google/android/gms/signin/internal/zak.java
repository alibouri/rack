package com.google.android.gms.signin.internal;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import j6.c;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final ConnectionResult Y;
    public final zav Z;

    static {
        zak.CREATOR = new c(12);
    }

    public zak(int v, ConnectionResult connectionResult0, zav zav0) {
        this.X = v;
        this.Y = connectionResult0;
        this.Z = zav0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.E(parcel0, 2, this.Y, v);
        f.E(parcel0, 3, this.Z, v);
        f.J(v1, parcel0);
    }
}

