package com.wave.customer;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.type.ActionSource;

public final class e implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new LaunchUri(parcel0.readString(), parcel0.readString(), ((ActionSource)parcel0.readParcelable(LaunchUri.class.getClassLoader())));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LaunchUri[v];
    }
}

