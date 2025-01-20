package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class VerifyPinToken extends VerifyPinResult {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final PartnerOrg Y;

    static {
        VerifyPinToken.CREATOR = new b(25);
    }

    public VerifyPinToken(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0) {
        j.f(fragmentHandle0, "tokenHandle");
        j.f(partnerOrg0, "partnerOrg");
        super(0);
        this.X = fragmentHandle0;
        this.Y = partnerOrg0;
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
        if(!(object0 instanceof VerifyPinToken)) {
            return false;
        }
        return j.a(this.X, ((VerifyPinToken)object0).X) ? j.a(this.Y, ((VerifyPinToken)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "VerifyPinToken(tokenHandle=" + this.X + ", partnerOrg=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeParcelable(this.Y, v);
    }
}

