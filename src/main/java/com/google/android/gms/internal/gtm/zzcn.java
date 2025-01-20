package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzcn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    @Deprecated
    public final Object createFromParcel(Parcel parcel0) {
        return new zzco(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    @Deprecated
    public final Object[] newArray(int v) {
        return new zzco[v];
    }
}

