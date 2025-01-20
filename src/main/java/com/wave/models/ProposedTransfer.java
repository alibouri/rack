package com.wave.models;

import Ab.k;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.Country;
import java.math.BigDecimal;

public final class ProposedTransfer implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final CurrencyAmount Y;
    public final CurrencyAmount Z;
    public final String b0;
    public final CurrencyAmount c0;
    public final String d0;
    public final BigDecimal e0;
    public final String f0;
    public final Country g0;
    public final String h0;
    public final String i0;
    public final ParcelableCoordinates j0;
    public final String k0;
    public final ActionSource l0;
    public final k m0;
    public final String n0;
    public final boolean o0;
    public final Integer p0;

    static {
    }

    public ProposedTransfer(String s, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, String s1, CurrencyAmount currencyAmount2, String s2, BigDecimal bigDecimal0, String s3, Country country0, String s4, String s5, ParcelableCoordinates parcelableCoordinates0, String s6, ActionSource actionSource0, k k0, String s7) {
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

