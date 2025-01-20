package com.wave.components.sendmoney;

import A3.e;
import K9.z;
import M.J;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import java.util.List;

public final class SendMoneyEnterContactParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final FragmentHandle Z;
    public final List b0;

    static {
        SendMoneyEnterContactParams.CREATOR = new z(1);
    }

    public SendMoneyEnterContactParams(String s, String s1, FragmentHandle fragmentHandle0, List list0) {
        j.f(s, "name");
        j.f(s1, "mobile");
        j.f(fragmentHandle0, "handle");
        j.f(list0, "recipientCountries");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = fragmentHandle0;
        this.b0 = list0;
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
        if(!(object0 instanceof SendMoneyEnterContactParams)) {
            return false;
        }
        if(!j.a(this.X, ((SendMoneyEnterContactParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((SendMoneyEnterContactParams)object0).Y)) {
            return false;
        }
        return j.a(this.Z, ((SendMoneyEnterContactParams)object0).Z) ? j.a(this.b0, ((SendMoneyEnterContactParams)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        return this.b0.hashCode() + e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z.X);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SendMoneyEnterContactParams(name=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", mobile=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", handle=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", recipientCountries=");
        return J.h(stringBuilder0, this.b0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeParcelable(this.Z, v);
        parcel0.writeInt(this.b0.size());
        for(Object object0: this.b0) {
            parcel0.writeParcelable(((Parcelable)object0), v);
        }
    }
}

