package com.sendwave.util;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import q9.o;

public final class UNIT implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final UNIT X;

    static {
        UNIT.CREATOR = new o(4);
        UNIT.X = new UNIT();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(1);
    }
}

