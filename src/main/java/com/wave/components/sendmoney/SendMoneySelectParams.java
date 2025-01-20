package com.wave.components.sendmoney;

import K9.z;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import java.util.Set;

public final class SendMoneySelectParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final Set Y;
    public final boolean Z;
    public final FragmentHandle b0;

    static {
        SendMoneySelectParams.CREATOR = new z(2);
    }

    public SendMoneySelectParams(FragmentHandle fragmentHandle0, Set set0, boolean z, FragmentHandle fragmentHandle1) {
        j.f(fragmentHandle0, "handle");
        j.f(set0, "filterOnCountries");
        super();
        this.X = fragmentHandle0;
        this.Y = set0;
        this.Z = z;
        this.b0 = fragmentHandle1;
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
        if(!(object0 instanceof SendMoneySelectParams)) {
            return false;
        }
        if(!j.a(this.X, ((SendMoneySelectParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((SendMoneySelectParams)object0).Y)) {
            return false;
        }
        return this.Z == ((SendMoneySelectParams)object0).Z ? j.a(this.b0, ((SendMoneySelectParams)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.X.hashCode();
        int v1 = this.Y.hashCode();
        int v2 = this.Z ? 0x4CF : 0x4D5;
        return this.b0 == null ? ((v1 + v * 0x1F) * 0x1F + v2) * 0x1F : ((v1 + v * 0x1F) * 0x1F + v2) * 0x1F + this.b0.X.hashCode();
    }

    @Override
    public final String toString() {
        return "SendMoneySelectParams(handle=" + this.X + ", filterOnCountries=" + this.Y + ", convertCInumbersTo10Digits=" + this.Z + ", qrScanOrCardhandle=" + this.b0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeInt(this.Y.size());
        for(Object object0: this.Y) {
            parcel0.writeParcelable(((Parcelable)object0), v);
        }
        parcel0.writeInt(((int)this.Z));
        parcel0.writeParcelable(this.b0, v);
    }
}

