package com.wave.customer;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.models.CurrencyAmount;

public final class d implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        String s1 = parcel0.readString();
        String s2 = parcel0.readString();
        return new CheckoutConfirmation(s, s1, ((CurrencyAmount)parcel0.readParcelable(CheckoutConfirmation.class.getClassLoader())), s2, ((ActionSource)parcel0.readParcelable(CheckoutConfirmation.class.getClassLoader())));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CheckoutConfirmation[v];
    }
}

