package com.google.android.gms.measurement.internal;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;

public final class zzno extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final long Y;
    public final int Z;

    static {
        zzno.CREATOR = new c(4);
    }

    public zzno(int v, long v1, String s) {
        this.X = s;
        this.Y = v1;
        this.Z = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 1, this.X);
        f.K(parcel0, 2, 8);
        parcel0.writeLong(this.Y);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(this.Z);
        f.J(v1, parcel0);
    }
}

