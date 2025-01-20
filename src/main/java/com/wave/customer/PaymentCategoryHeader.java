package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class PaymentCategoryHeader implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        PaymentCategoryHeader.CREATOR = new b(9);
    }

    public PaymentCategoryHeader(String s) {
        j.f(s, "name");
        super();
        this.X = s;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

