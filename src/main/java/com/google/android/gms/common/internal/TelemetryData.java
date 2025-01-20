package com.google.android.gms.common.internal;

import C2.a;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public List Y;

    static {
        TelemetryData.CREATOR = new a(19);
    }

    public TelemetryData(int v, List list0) {
        this.X = v;
        this.Y = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.H(parcel0, 2, this.Y);
        f.J(v1, parcel0);
    }
}

