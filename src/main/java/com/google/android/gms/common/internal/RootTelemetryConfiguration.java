package com.google.android.gms.common.internal;

import C2.a;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final int b0;
    public final int c0;

    static {
        RootTelemetryConfiguration.CREATOR = new a(23);
    }

    public RootTelemetryConfiguration(int v, int v1, int v2, boolean z, boolean z1) {
        this.X = v;
        this.Y = z;
        this.Z = z1;
        this.b0 = v1;
        this.c0 = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(((int)this.Y));
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.K(parcel0, 4, 4);
        parcel0.writeInt(this.b0);
        f.K(parcel0, 5, 4);
        parcel0.writeInt(this.c0);
        f.J(v1, parcel0);
    }
}

