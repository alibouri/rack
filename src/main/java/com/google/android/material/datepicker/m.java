package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class m implements Parcelable.Creator {
    public final int a;

    public m(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return this.a != 0 ? new DateValidatorPointForward(parcel0.readLong()) : Month.c(parcel0.readInt(), parcel0.readInt());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return this.a != 0 ? new DateValidatorPointForward[v] : new Month[v];
    }
}

