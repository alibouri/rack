package com.google.android.gms.signin.internal;

import L5.l;
import R2.f;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;

public final class zaa extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final Intent Z;

    static {
        zaa.CREATOR = new c(9);
    }

    public zaa(int v, int v1, Intent intent0) {
        this.X = v;
        this.Y = v1;
        this.Z = intent0;
    }

    @Override  // L5.l
    public final Status c() {
        return this.Y == 0 ? Status.c0 : Status.g0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.E(parcel0, 3, this.Z, v);
        f.J(v1, parcel0);
    }
}

