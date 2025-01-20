package com.wave.customer.linkedaccounts.typeselect;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import j6.c;

public final class LinkedAccountTypeSelectParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final FragmentHandle Y;

    static {
        LinkedAccountTypeSelectParams.CREATOR = new c(28);
    }

    public LinkedAccountTypeSelectParams(FragmentHandle fragmentHandle0, String s) {
        j.f(s, "walletId");
        j.f(fragmentHandle0, "handle");
        super();
        this.X = s;
        this.Y = fragmentHandle0;
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
        if(!(object0 instanceof LinkedAccountTypeSelectParams)) {
            return false;
        }
        return j.a(this.X, ((LinkedAccountTypeSelectParams)object0).X) ? j.a(this.Y, ((LinkedAccountTypeSelectParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.X.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "LinkedAccountTypeSelectParams(walletId=" + this.X + ", handle=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
    }
}

