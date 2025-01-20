package com.google.android.gms.signin.internal;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import j6.c;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final zat Y;

    static {
        zai.CREATOR = new c(11);
    }

    public zai(int v, zat zat0) {
        this.X = v;
        this.Y = zat0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.E(parcel0, 2, this.Y, v);
        f.J(v1, parcel0);
    }
}

