package com.wave.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.models.CurrencyAmount;

public final class ProposedCheckout implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final CurrencyAmount Y;

    static {
    }

    public ProposedCheckout(CurrencyAmount currencyAmount0, String s) {
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
    }

    @Override
    public final boolean equals(Object object0) {
    }

    @Override
    public final int hashCode() {
    }

    @Override
    public final String toString() {
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
    }
}

