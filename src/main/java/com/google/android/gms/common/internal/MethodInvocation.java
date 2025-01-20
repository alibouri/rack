package com.google.android.gms.common.internal;

import C2.a;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final int Z;
    public final long b0;
    public final long c0;
    public final String d0;
    public final String e0;
    public final int f0;
    public final int g0;

    static {
        MethodInvocation.CREATOR = new a(20);
    }

    public MethodInvocation(int v, int v1, int v2, long v3, long v4, String s, String s1, int v5, int v6) {
        this.X = v;
        this.Y = v1;
        this.Z = v2;
        this.b0 = v3;
        this.c0 = v4;
        this.d0 = s;
        this.e0 = s1;
        this.f0 = v5;
        this.g0 = v6;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(this.Z);
        f.K(parcel0, 4, 8);
        parcel0.writeLong(this.b0);
        f.K(parcel0, 5, 8);
        parcel0.writeLong(this.c0);
        f.F(parcel0, 6, this.d0);
        f.F(parcel0, 7, this.e0);
        f.K(parcel0, 8, 4);
        parcel0.writeInt(this.f0);
        f.K(parcel0, 9, 4);
        parcel0.writeInt(this.g0);
        f.J(v1, parcel0);
    }
}

