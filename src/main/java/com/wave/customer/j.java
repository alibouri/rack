package com.wave.customer;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class j implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Nb.j.f(parcel0, "parcel");
        return new ApiCheckoutPayment(((CheckoutConfirmation)CheckoutConfirmation.CREATOR.createFromParcel(parcel0)));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ApiCheckoutPayment[v];
    }
}

