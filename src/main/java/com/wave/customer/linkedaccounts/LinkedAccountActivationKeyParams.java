package com.wave.customer.linkedaccounts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import j6.c;

public final class LinkedAccountActivationKeyParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final String Y;

    static {
        LinkedAccountActivationKeyParams.CREATOR = new c(14);
    }

    public LinkedAccountActivationKeyParams(FragmentHandle fragmentHandle0, String s) {
        j.f(fragmentHandle0, "handle");
        j.f(s, "activationKey");
        super();
        this.X = fragmentHandle0;
        this.Y = s;
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
        if(!(object0 instanceof LinkedAccountActivationKeyParams)) {
            return false;
        }
        return j.a(this.X, ((LinkedAccountActivationKeyParams)object0).X) ? j.a(this.Y, ((LinkedAccountActivationKeyParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "LinkedAccountActivationKeyParams(handle=" + this.X + ", activationKey=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeString(this.Y);
    }
}

