package com.wave.customer.home;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.wave.accounts.AccountEvent;
import ha.c0;

public final class PersonalHomeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final AccountEvent Y;

    static {
        PersonalHomeParams.CREATOR = new c0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public PersonalHomeParams(FragmentHandle fragmentHandle0, AccountEvent accountEvent0) {
        j.f(fragmentHandle0, "handle");
        super();
        this.X = fragmentHandle0;
        this.Y = accountEvent0;
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
        if(!(object0 instanceof PersonalHomeParams)) {
            return false;
        }
        return j.a(this.X, ((PersonalHomeParams)object0).X) ? j.a(this.Y, ((PersonalHomeParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.X.hashCode();
        return this.Y == null ? v * 0x1F : v * 0x1F + this.Y.hashCode();
    }

    @Override
    public final String toString() {
        return "PersonalHomeParams(handle=" + this.X + ", accountEvent=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeParcelable(this.Y, v);
    }
}

