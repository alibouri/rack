package com.google.android.gms.common;

import C2.a;
import N4.j;
import N4.o;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean X;
    public final String Y;
    public final int Z;
    public final int b0;

    static {
        zzq.CREATOR = new a(8);
    }

    public zzq(boolean z, String s, int v, int v1) {
        this.X = z;
        this.Y = s;
        this.Z = o.O(v) - 1;
        this.b0 = j.R(v1) - 1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(((int)this.X));
        f.F(parcel0, 2, this.Y);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(this.Z);
        f.K(parcel0, 4, 4);
        parcel0.writeInt(this.b0);
        f.J(v1, parcel0);
    }
}

