package com.google.android.gms.location;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList X;
    public final boolean Y;
    public final boolean Z;

    static {
        LocationSettingsRequest.CREATOR = new a(22);
    }

    public LocationSettingsRequest(ArrayList arrayList0, boolean z, boolean z1) {
        this.X = arrayList0;
        this.Y = z;
        this.Z = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.H(parcel0, 1, Collections.unmodifiableList(this.X));
        f.K(parcel0, 2, 4);
        parcel0.writeInt(((int)this.Y));
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.J(v1, parcel0);
    }
}

