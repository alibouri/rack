package com.wave.customer.scratchCardRewards;

import Ea.A;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class ScratchCard.Award.Unknown implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ScratchCard.Award.Unknown X;

    static {
        ScratchCard.Award.Unknown.X = new ScratchCard.Award.Unknown();
        ScratchCard.Award.Unknown.CREATOR = new A(3);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof ScratchCard.Award.Unknown;
    }

    @Override
    public final int hashCode() {
        return 0x1A2C90A9;
    }

    @Override
    public final String toString() {
        return "Unknown";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(1);
    }
}

