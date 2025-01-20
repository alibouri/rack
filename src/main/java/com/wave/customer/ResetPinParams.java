package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.util.Country;

public final class ResetPinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final Country Y;
    public final String Z;
    public final String b0;
    public final String c0;

    static {
        ResetPinParams.CREATOR = new b(14);
    }

    public ResetPinParams(String s, Country country0, String s1, String s2, int v) {
        this(s, country0, ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? s2 : null), null);
    }

    public ResetPinParams(String s, Country country0, String s1, String s2, String s3) {
        j.f(s, "mobile");
        j.f(country0, "country");
        super();
        this.X = s;
        this.Y = country0;
        this.Z = s1;
        this.b0 = s2;
        this.c0 = s3;
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
        if(!(object0 instanceof ResetPinParams)) {
            return false;
        }
        if(!j.a(this.X, ((ResetPinParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((ResetPinParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((ResetPinParams)object0).Z)) {
            return false;
        }
        return j.a(this.b0, ((ResetPinParams)object0).b0) ? j.a(this.c0, ((ResetPinParams)object0).c0) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        int v1 = this.Y.hashCode();
        int v2 = 0;
        int v3 = this.Z == null ? 0 : this.Z.hashCode();
        int v4 = this.b0 == null ? 0 : this.b0.hashCode();
        String s = this.c0;
        if(s != null) {
            v2 = s.hashCode();
        }
        return (((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ResetPinParams(mobile=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", country=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", verifiedPin=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", newPin=");
        stringBuilder0.append(this.b0);
        stringBuilder0.append(", newPinConfirmation=");
        return m5.b.y(stringBuilder0, this.c0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeString(this.Z);
        parcel0.writeString(this.b0);
        parcel0.writeString(this.c0);
    }
}

