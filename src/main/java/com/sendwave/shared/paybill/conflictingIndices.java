package com.sendwave.shared.paybill;

import M.J;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import p9.i;

public final class conflictingIndices implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;

    static {
        conflictingIndices.CREATOR = new i(5);
    }

    public conflictingIndices(int v, int v1) {
        this.X = v;
        this.Y = v1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof conflictingIndices)) {
            return false;
        }
        return this.X == ((conflictingIndices)object0).X ? this.Y == ((conflictingIndices)object0).Y : false;
    }

    @Override
    public final int hashCode() {
        return this.X * 0x1F + this.Y;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("conflictingIndices(first=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", second=");
        return J.f(stringBuilder0, this.Y, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(this.X);
        parcel0.writeInt(this.Y);
    }
}

