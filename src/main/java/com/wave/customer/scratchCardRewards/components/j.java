package com.wave.customer.scratchCardRewards.components;

import Ea.V;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class j implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Nb.j.f(parcel0, "parcel");
        int v = parcel0.readInt();
        return parcel0.readInt() == 0 ? new ScratchCard(v, null) : new ScratchCard(v, V.valueOf(parcel0.readString()));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ScratchCard[v];
    }
}

