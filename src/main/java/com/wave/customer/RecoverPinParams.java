package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class RecoverPinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;

    static {
        RecoverPinParams.CREATOR = new b(12);
    }

    public RecoverPinParams(String s, String s1) {
        j.f(s, "mobile");
        super();
        this.X = s;
        this.Y = s1;
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
        if(!(object0 instanceof RecoverPinParams)) {
            return false;
        }
        return j.a(this.X, ((RecoverPinParams)object0).X) ? j.a(this.Y, ((RecoverPinParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        return this.Y == null ? v * 0x1F : v * 0x1F + this.Y.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RecoverPinParams(mobile=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", firstEnteredPin=");
        return m5.b.y(stringBuilder0, this.Y, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
    }
}

