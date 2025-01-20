package com.wave.customer;

import A3.e;
import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class SignupSuccess extends SignupVerificationResult {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final FragmentHandle Z;
    public final PartnerOrg b0;

    static {
        SignupSuccess.CREATOR = new b(22);
    }

    public SignupSuccess(String s, String s1, FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0) {
        j.f(s, "sId");
        j.f(s1, "sessionOpaqueId");
        j.f(fragmentHandle0, "customerHomeHandle");
        super(0);
        this.X = s;
        this.Y = s1;
        this.Z = fragmentHandle0;
        this.b0 = partnerOrg0;
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
        if(!(object0 instanceof SignupSuccess)) {
            return false;
        }
        if(!j.a(this.X, ((SignupSuccess)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((SignupSuccess)object0).Y)) {
            return false;
        }
        return j.a(this.Z, ((SignupSuccess)object0).Z) ? j.a(this.b0, ((SignupSuccess)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z.X);
        return this.b0 == null ? v : v + this.b0.hashCode();
    }

    @Override
    public final String toString() {
        return "SignupSuccess(sId=" + this.X + ", sessionOpaqueId=" + this.Y + ", customerHomeHandle=" + this.Z + ", partnerOrg=" + this.b0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeParcelable(this.Z, v);
        parcel0.writeParcelable(this.b0, v);
    }
}

