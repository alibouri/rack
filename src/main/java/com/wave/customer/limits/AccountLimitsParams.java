package com.wave.customer.limits;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import j6.c;
import m5.b;

public final class AccountLimitsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final FragmentHandle Y;
    public final String Z;

    static {
        AccountLimitsParams.CREATOR = new c(8);
    }

    public AccountLimitsParams(FragmentHandle fragmentHandle0, String s, String s1) {
        j.f(s, "walletId");
        j.f(fragmentHandle0, "handle");
        super();
        this.X = s;
        this.Y = fragmentHandle0;
        this.Z = s1;
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
        if(!(object0 instanceof AccountLimitsParams)) {
            return false;
        }
        if(!j.a(this.X, ((AccountLimitsParams)object0).X)) {
            return false;
        }
        return j.a(this.Y, ((AccountLimitsParams)object0).Y) ? j.a(this.Z, ((AccountLimitsParams)object0).Z) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y.X);
        return this.Z == null ? v : v + this.Z.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AccountLimitsParams(walletId=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", handle=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", overrideButtonText=");
        return b.y(stringBuilder0, this.Z, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeString(this.Z);
    }
}

