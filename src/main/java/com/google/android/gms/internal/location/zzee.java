package com.google.android.gms.internal.location;

import R2.f;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final IBinder Y;
    public final IBinder Z;
    public final PendingIntent b0;
    public final String c0;

    static {
        zzee.CREATOR = new a(10);
    }

    public zzee(int v, IBinder iBinder0, IBinder iBinder1, PendingIntent pendingIntent0, String s) {
        this.X = v;
        this.Y = iBinder0;
        this.Z = iBinder1;
        this.b0 = pendingIntent0;
        this.c0 = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.D(parcel0, 2, this.Y);
        f.D(parcel0, 3, this.Z);
        f.E(parcel0, 4, this.b0, v);
        f.F(parcel0, 6, this.c0);
        f.J(v1, parcel0);
    }
}

