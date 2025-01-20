package com.google.android.gms.internal.measurement;

import R2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzdw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long X;
    public final long Y;
    public final boolean Z;
    public final String b0;
    public final String c0;
    public final String d0;
    public final Bundle e0;
    public final String f0;

    static {
        zzdw.CREATOR = new a0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public zzdw(long v, long v1, boolean z, String s, String s1, String s2, Bundle bundle0, String s3) {
        this.X = v;
        this.Y = v1;
        this.Z = z;
        this.b0 = s;
        this.c0 = s1;
        this.d0 = s2;
        this.e0 = bundle0;
        this.f0 = s3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 8);
        parcel0.writeLong(this.X);
        f.K(parcel0, 2, 8);
        parcel0.writeLong(this.Y);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.F(parcel0, 4, this.b0);
        f.F(parcel0, 5, this.c0);
        f.F(parcel0, 6, this.d0);
        f.C(parcel0, 7, this.e0);
        f.F(parcel0, 8, this.f0);
        f.J(v1, parcel0);
    }
}

