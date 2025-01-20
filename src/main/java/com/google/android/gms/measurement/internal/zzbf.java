package com.google.android.gms.measurement.internal;

import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final zzbe Y;
    public final String Z;
    public final long b0;

    static {
        zzbf.CREATOR = new c(3);
    }

    public zzbf(zzbf zzbf0, long v) {
        r.j(zzbf0);
        this.X = zzbf0.X;
        this.Y = zzbf0.Y;
        this.Z = zzbf0.Z;
        this.b0 = v;
    }

    public zzbf(String s, zzbe zzbe0, String s1, long v) {
        this.X = s;
        this.Y = zzbe0;
        this.Z = s1;
        this.b0 = v;
    }

    @Override
    public final String toString() {
        return "origin=" + this.Z + ",name=" + this.X + ",params=" + this.Y;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 2, this.X);
        f.E(parcel0, 3, this.Y, v);
        f.F(parcel0, 4, this.Z);
        f.K(parcel0, 5, 8);
        parcel0.writeLong(this.b0);
        f.J(v1, parcel0);
    }
}

