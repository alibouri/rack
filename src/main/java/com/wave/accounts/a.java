package com.wave.accounts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        parcel0.readInt();
        return AccountAdded.X;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountAdded[v];
    }
}

