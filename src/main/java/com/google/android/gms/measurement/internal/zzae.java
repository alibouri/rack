package com.google.android.gms.measurement.internal;

import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String X;
    public String Y;
    public zzon Z;
    public long b0;
    public boolean c0;
    public String d0;
    public final zzbf e0;
    public long f0;
    public zzbf g0;
    public final long h0;
    public final zzbf i0;

    static {
        zzae.CREATOR = new c(0);
    }

    public zzae(zzae zzae0) {
        r.j(zzae0);
        this.X = zzae0.X;
        this.Y = zzae0.Y;
        this.Z = zzae0.Z;
        this.b0 = zzae0.b0;
        this.c0 = zzae0.c0;
        this.d0 = zzae0.d0;
        this.e0 = zzae0.e0;
        this.f0 = zzae0.f0;
        this.g0 = zzae0.g0;
        this.h0 = zzae0.h0;
        this.i0 = zzae0.i0;
    }

    public zzae(String s, String s1, zzon zzon0, long v, boolean z, String s2, zzbf zzbf0, long v1, zzbf zzbf1, long v2, zzbf zzbf2) {
        this.X = s;
        this.Y = s1;
        this.Z = zzon0;
        this.b0 = v;
        this.c0 = z;
        this.d0 = s2;
        this.e0 = zzbf0;
        this.f0 = v1;
        this.g0 = zzbf1;
        this.h0 = v2;
        this.i0 = zzbf2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 2, this.X);
        f.F(parcel0, 3, this.Y);
        f.E(parcel0, 4, this.Z, v);
        long v2 = this.b0;
        f.K(parcel0, 5, 8);
        parcel0.writeLong(v2);
        boolean z = this.c0;
        f.K(parcel0, 6, 4);
        parcel0.writeInt(((int)z));
        f.F(parcel0, 7, this.d0);
        f.E(parcel0, 8, this.e0, v);
        long v3 = this.f0;
        f.K(parcel0, 9, 8);
        parcel0.writeLong(v3);
        f.E(parcel0, 10, this.g0, v);
        f.K(parcel0, 11, 8);
        parcel0.writeLong(this.h0);
        f.E(parcel0, 12, this.i0, v);
        f.J(v1, parcel0);
    }
}

