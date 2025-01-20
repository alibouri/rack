package com.wave.customer.linkedaccounts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.LinkedAccountTransferDirection;
import j6.c;

public final class LinkedAccountTransferParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final Currency Y;
    public final LinkedAccountTransferDirection Z;

    static {
        LinkedAccountTransferParams.CREATOR = new c(18);
    }

    public LinkedAccountTransferParams(FragmentHandle fragmentHandle0, Currency currency0, LinkedAccountTransferDirection linkedAccountTransferDirection0) {
        j.f(fragmentHandle0, "handle");
        j.f(currency0, "currency");
        j.f(linkedAccountTransferDirection0, "direction");
        super();
        this.X = fragmentHandle0;
        this.Y = currency0;
        this.Z = linkedAccountTransferDirection0;
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
        if(!(object0 instanceof LinkedAccountTransferParams)) {
            return false;
        }
        if(!j.a(this.X, ((LinkedAccountTransferParams)object0).X)) {
            return false;
        }
        return j.a(this.Y, ((LinkedAccountTransferParams)object0).Y) ? j.a(this.Z, ((LinkedAccountTransferParams)object0).Z) : false;
    }

    @Override
    public final int hashCode() {
        return this.Z.hashCode() + (this.Y.hashCode() + this.X.X.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "LinkedAccountTransferParams(handle=" + this.X + ", currency=" + this.Y + ", direction=" + this.Z + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeParcelable(this.Z, v);
    }
}

