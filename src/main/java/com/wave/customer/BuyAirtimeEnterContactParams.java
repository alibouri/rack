package com.wave.customer;

import A3.e;
import M.J;
import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import java.io.Serializable;
import java.util.List;

public final class BuyAirtimeEnterContactParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final FragmentHandle Z;
    public final FragmentHandle b0;
    public final List c0;

    static {
        BuyAirtimeEnterContactParams.CREATOR = new b(2);
    }

    public BuyAirtimeEnterContactParams(String s, String s1, FragmentHandle fragmentHandle0, FragmentHandle fragmentHandle1, List list0) {
        j.f(s, "name");
        j.f(s1, "mobile");
        j.f(fragmentHandle0, "handle");
        j.f(fragmentHandle1, "billType");
        j.f(list0, "disabledTelcosNameToNumberFormat");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = fragmentHandle0;
        this.b0 = fragmentHandle1;
        this.c0 = list0;
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
        if(!(object0 instanceof BuyAirtimeEnterContactParams)) {
            return false;
        }
        if(!j.a(this.X, ((BuyAirtimeEnterContactParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((BuyAirtimeEnterContactParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((BuyAirtimeEnterContactParams)object0).Z)) {
            return false;
        }
        return j.a(this.b0, ((BuyAirtimeEnterContactParams)object0).b0) ? j.a(this.c0, ((BuyAirtimeEnterContactParams)object0).c0) : false;
    }

    @Override
    public final int hashCode() {
        return this.c0.hashCode() + e.s(e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z.X), 0x1F, this.b0.X);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BuyAirtimeEnterContactParams(name=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", mobile=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", handle=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", billType=");
        stringBuilder0.append(this.b0);
        stringBuilder0.append(", disabledTelcosNameToNumberFormat=");
        return J.h(stringBuilder0, this.c0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeParcelable(this.Z, v);
        parcel0.writeParcelable(this.b0, v);
        parcel0.writeInt(this.c0.size());
        for(Object object0: this.c0) {
            parcel0.writeSerializable(((Serializable)object0));
        }
    }
}

