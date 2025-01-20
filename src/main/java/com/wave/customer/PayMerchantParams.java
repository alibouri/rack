package com.wave.customer;

import A3.e;
import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.models.CurrencyAmount;

public final class PayMerchantParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final CurrencyAmount Y;
    public final boolean Z;
    public final FragmentHandle b0;
    public final String c0;
    public final ActionSource d0;

    static {
        PayMerchantParams.CREATOR = new b(8);
    }

    public PayMerchantParams(String s, CurrencyAmount currencyAmount0, boolean z, FragmentHandle fragmentHandle0, String s1, ActionSource actionSource0) {
        j.f(s, "merchantId");
        j.f(fragmentHandle0, "handle");
        j.f(s1, "actionUrl");
        j.f(actionSource0, "actionSource");
        super();
        this.X = s;
        this.Y = currencyAmount0;
        this.Z = z;
        this.b0 = fragmentHandle0;
        this.c0 = s1;
        this.d0 = actionSource0;
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
        if(!(object0 instanceof PayMerchantParams)) {
            return false;
        }
        if(!j.a(this.X, ((PayMerchantParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((PayMerchantParams)object0).Y)) {
            return false;
        }
        if(this.Z != ((PayMerchantParams)object0).Z) {
            return false;
        }
        if(!j.a(this.b0, ((PayMerchantParams)object0).b0)) {
            return false;
        }
        return j.a(this.c0, ((PayMerchantParams)object0).c0) ? j.a(this.d0, ((PayMerchantParams)object0).d0) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        int v1 = this.Y == null ? 0 : this.Y.hashCode();
        return this.Z ? this.d0.hashCode() + e.s(e.s(((v * 0x1F + v1) * 0x1F + 0x4CF) * 0x1F, 0x1F, this.b0.X), 0x1F, this.c0) : this.d0.hashCode() + e.s(e.s(((v * 0x1F + v1) * 0x1F + 0x4D5) * 0x1F, 0x1F, this.b0.X), 0x1F, this.c0);
    }

    @Override
    public final String toString() {
        return "PayMerchantParams(merchantId=" + this.X + ", amount=" + this.Y + ", hasOwnActivity=" + this.Z + ", handle=" + this.b0 + ", actionUrl=" + this.c0 + ", actionSource=" + this.d0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeInt(((int)this.Z));
        parcel0.writeParcelable(this.b0, v);
        parcel0.writeString(this.c0);
        parcel0.writeParcelable(this.d0, v);
    }
}

