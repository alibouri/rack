package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new StepScanQr(parcel0.readString());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepScanQr[v];
    }
}

