package com.wave.customer.linkedaccounts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import j6.c;

public final class LinkedAccountCreationOtpParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;

    static {
        LinkedAccountCreationOtpParams.CREATOR = new c(15);
    }

    public LinkedAccountCreationOtpParams(FragmentHandle fragmentHandle0) {
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
        return object0 instanceof LinkedAccountCreationOtpParams ? j.a(this.X, ((LinkedAccountCreationOtpParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.X.hashCode();
    }

    @Override
    public final String toString() {
        return "LinkedAccountCreationOtpParams(handle=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
    }
}

