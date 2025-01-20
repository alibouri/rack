package com.wave.customer.scratchCardRewards.components;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class k implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new Unknown(parcel0.readInt());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Unknown[v];
    }
}

