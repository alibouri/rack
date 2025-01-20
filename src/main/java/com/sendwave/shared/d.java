package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class d implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new StepConfirmPin(parcel0.readString(), parcel0.readString());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepConfirmPin[v];
    }
}

