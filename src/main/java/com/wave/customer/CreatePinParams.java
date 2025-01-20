package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class CreatePinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;

    static {
        CreatePinParams.CREATOR = new b(4);
    }

    public CreatePinParams(String s, String s1) {
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
        if(!(object0 instanceof CreatePinParams)) {
            return false;
        }
        return j.a(this.X, ((CreatePinParams)object0).X) ? j.a(this.Y, ((CreatePinParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        return this.Y == null ? v * 0x1F : v * 0x1F + this.Y.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CreatePinParams(mobile=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", enteredPin=");
        return m5.b.y(stringBuilder0, this.Y, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
    }
}

