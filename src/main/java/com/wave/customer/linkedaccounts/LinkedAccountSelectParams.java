package com.wave.customer.linkedaccounts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import j6.c;

public final class LinkedAccountSelectParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final String Y;

    static {
        LinkedAccountSelectParams.CREATOR = new c(16);
    }

    public LinkedAccountSelectParams(FragmentHandle fragmentHandle0, String s) {
        j.f(fragmentHandle0, "handle");
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
        if(!(object0 instanceof LinkedAccountSelectParams)) {
            return false;
        }
        return j.a(this.X, ((LinkedAccountSelectParams)object0).X) ? j.a(this.Y, ((LinkedAccountSelectParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.X.hashCode();
        return this.Y == null ? v * 0x1F : v * 0x1F + this.Y.hashCode();
    }

    @Override
    public final String toString() {
        return "LinkedAccountSelectParams(handle=" + this.X + ", currentlySelectedAccountId=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeString(this.Y);
    }
}

