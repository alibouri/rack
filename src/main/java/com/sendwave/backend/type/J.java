package com.sendwave.backend.type;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class j implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Nb.j.f(parcel0, "parcel");
        parcel0.readInt();
        return MERCHANT_SCAN.X;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MERCHANT_SCAN[v];
    }
}

