package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AskedToRecoverPin extends VerifyPinResult {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        AskedToRecoverPin.CREATOR = new b(0);
    }

    public AskedToRecoverPin(String s) {
        j.f(s, "enteredPin");
        super(0);
        this.X = s;
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
        return object0 instanceof AskedToRecoverPin ? j.a(this.X, ((AskedToRecoverPin)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return m5.b.y(new StringBuilder("AskedToRecoverPin(enteredPin="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

