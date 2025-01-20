package com.wave.customer;

import A3.e;
import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class VerifyPinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final boolean Z;

    static {
        VerifyPinParams.CREATOR = new b(24);
    }

    public VerifyPinParams(String s, String s1, boolean z) {
        j.f(s, "mobile");
        j.f(s1, "prompt");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = z;
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
        if(!(object0 instanceof VerifyPinParams)) {
            return false;
        }
        if(!j.a(this.X, ((VerifyPinParams)object0).X)) {
            return false;
        }
        return j.a(this.Y, ((VerifyPinParams)object0).Y) ? this.Z == ((VerifyPinParams)object0).Z : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y);
        return this.Z ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("VerifyPinParams(mobile=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", prompt=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", addingAccount=");
        return com.apollographql.apollo.api.b.r(stringBuilder0, this.Z, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeInt(((int)this.Z));
    }
}

