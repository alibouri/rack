package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class l5 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        parcel0.readInt();
        return DISTRIBUTOR_APP.X;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DISTRIBUTOR_APP[v];
    }
}

