package com.wave.customer;

import A3.e;
import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class EnterNameParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final String Y;
    public final PartnerOrg Z;

    static {
        EnterNameParams.CREATOR = new b(6);
    }

    public EnterNameParams(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, String s) {
        j.f(fragmentHandle0, "tokenHandle");
        j.f(s, "mobile");
        j.f(partnerOrg0, "partnerOrg");
        super();
        this.X = fragmentHandle0;
        this.Y = s;
        this.Z = partnerOrg0;
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
        if(!(object0 instanceof EnterNameParams)) {
            return false;
        }
        if(!j.a(this.X, ((EnterNameParams)object0).X)) {
            return false;
        }
        return j.a(this.Y, ((EnterNameParams)object0).Y) ? j.a(this.Z, ((EnterNameParams)object0).Z) : false;
    }

    @Override
    public final int hashCode() {
        return this.Z.hashCode() + e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y);
    }

    @Override
    public final String toString() {
        return "EnterNameParams(tokenHandle=" + this.X + ", mobile=" + this.Y + ", partnerOrg=" + this.Z + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeString(this.Y);
        parcel0.writeParcelable(this.Z, v);
    }
}

