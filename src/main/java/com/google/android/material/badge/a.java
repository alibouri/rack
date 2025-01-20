package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Object object0 = new SavedState();  // initializer: Ljava/lang/Object;-><init>()V
        object0.Z = 0xFF;
        object0.b0 = -1;
        object0.X = parcel0.readInt();
        object0.Y = parcel0.readInt();
        object0.Z = parcel0.readInt();
        object0.b0 = parcel0.readInt();
        object0.c0 = parcel0.readInt();
        object0.d0 = parcel0.readString();
        object0.e0 = parcel0.readInt();
        object0.g0 = parcel0.readInt();
        object0.i0 = parcel0.readInt();
        object0.j0 = parcel0.readInt();
        object0.k0 = parcel0.readInt();
        object0.l0 = parcel0.readInt();
        object0.h0 = parcel0.readInt() != 0;
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SavedState[v];
    }
}

