package com.wave.customer.scratchCardRewards.components;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class i implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new Instructions(parcel0.readString(), parcel0.createStringArrayList());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Instructions[v];
    }
}

