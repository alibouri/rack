package com.google.android.gms.common.internal;

import C2.a;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final RootTelemetryConfiguration X;
    public final boolean Y;
    public final boolean Z;
    public final int[] b0;
    public final int c0;
    public final int[] d0;

    static {
        ConnectionTelemetryConfiguration.CREATOR = new a(25);
    }

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration0, boolean z, boolean z1, int[] arr_v, int v, int[] arr_v1) {
        this.X = rootTelemetryConfiguration0;
        this.Y = z;
        this.Z = z1;
        this.b0 = arr_v;
        this.c0 = v;
        this.d0 = arr_v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.E(parcel0, 1, this.X, v);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(((int)this.Y));
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        int[] arr_v = this.b0;
        if(arr_v != null) {
            int v2 = f.I(4, parcel0);
            parcel0.writeIntArray(arr_v);
            f.J(v2, parcel0);
        }
        f.K(parcel0, 5, 4);
        parcel0.writeInt(this.c0);
        int[] arr_v1 = this.d0;
        if(arr_v1 != null) {
            int v3 = f.I(6, parcel0);
            parcel0.writeIntArray(arr_v1);
            f.J(v3, parcel0);
        }
        f.J(v1, parcel0);
    }
}

