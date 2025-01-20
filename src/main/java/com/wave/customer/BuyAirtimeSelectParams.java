package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;

public final class BuyAirtimeSelectParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;

    static {
        BuyAirtimeSelectParams.CREATOR = new b(3);
    }

    public BuyAirtimeSelectParams(FragmentHandle fragmentHandle0) {
        j.f(fragmentHandle0, "handle");
        super();
        this.X = fragmentHandle0;
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
        return object0 instanceof BuyAirtimeSelectParams ? j.a(this.X, ((BuyAirtimeSelectParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.X.hashCode();
    }

    @Override
    public final String toString() {
        return "BuyAirtimeSelectParams(handle=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
    }
}

