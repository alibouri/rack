package com.google.android.gms.common.internal;

import C2.a;
import R2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Bundle X;
    public Feature[] Y;
    public int Z;
    public ConnectionTelemetryConfiguration b0;

    static {
        zzk.CREATOR = new a(24);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.C(parcel0, 1, this.X);
        f.G(parcel0, 2, this.Y, v);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(this.Z);
        f.E(parcel0, 4, this.b0, v);
        f.J(v1, parcel0);
    }
}

