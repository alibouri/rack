package com.wave.customer.risk.magiclinksecuritychallenge;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;

public final class b implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        return new Unauthenticated(((FragmentHandle)parcel0.readParcelable(Unauthenticated.class.getClassLoader())), s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Unauthenticated[v];
    }
}

