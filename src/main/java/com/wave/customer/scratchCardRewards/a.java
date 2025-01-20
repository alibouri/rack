package com.wave.customer.scratchCardRewards;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new RedeemScratchCardParams(((KnownAward)KnownAward.CREATOR.createFromParcel(parcel0)));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RedeemScratchCardParams[v];
    }
}

