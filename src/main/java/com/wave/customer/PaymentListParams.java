package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class PaymentListParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        PaymentListParams.CREATOR = new b(10);
    }

    public PaymentListParams(String s) {
        this.X = s;
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
        return object0 instanceof PaymentListParams ? j.a(this.X, ((PaymentListParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X == null ? 0 : this.X.hashCode();
    }

    @Override
    public final String toString() {
        return m5.b.y(new StringBuilder("PaymentListParams(selectedCategoryId="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

