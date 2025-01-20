package com.sendwave.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import j6.c;
import java.math.BigDecimal;

public class CurrencyAmount implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final Currency X;
    public final BigDecimal Y;

    static {
        CurrencyAmount.CREATOR = new c(7);
    }

    public CurrencyAmount(Parcel parcel0) {
        String s = parcel0.readString();
        Currency.q.getClass();
        this.X = N.a(s);
        this.Y = new BigDecimal(parcel0.readString());
    }

    public CurrencyAmount(Currency currency0, BigDecimal bigDecimal0) {
        this.X = currency0;
        this.Y = bigDecimal0;
    }

    public final int b(CurrencyAmount currencyAmount0) {
        if(this.X != currencyAmount0.X) {
            throw new IllegalArgumentException("Comparing amounts of different currencies");
        }
        return this.Y.compareTo(currencyAmount0.Y);
    }

    public static CurrencyAmount c(String s) {
        String[] arr_s = s.split(" ");
        if(arr_s.length != 2) {
            throw new RuntimeException("Unable to parse CurrencyAmount");
        }
        String s1 = arr_s[0];
        Currency.q.getClass();
        return new CurrencyAmount(N.a(s1), new BigDecimal(arr_s[1]));
    }

    @Override
    public final int compareTo(Object object0) {
        return this.b(((CurrencyAmount)object0));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof CurrencyAmount ? this.X.equals(((CurrencyAmount)object0).X) && this.Y.equals(((CurrencyAmount)object0).Y) : false;
    }

    public final boolean f() {
        return this.Y.compareTo(BigDecimal.ZERO) > 0;
    }

    public final boolean g() {
        return this.Y.compareTo(BigDecimal.ZERO) == 0;
    }

    public final CurrencyAmount h(CurrencyAmount currencyAmount0) {
        Currency currency0 = this.X;
        if(currency0 != currencyAmount0.X) {
            throw new IllegalArgumentException("Subtracting amounts of different currencies");
        }
        return new CurrencyAmount(currency0, this.Y.subtract(currencyAmount0.Y));
    }

    public final CurrencyAmount j(CurrencyAmount currencyAmount0) {
        Currency currency0 = this.X;
        if(currency0 != currencyAmount0.X) {
            throw new IllegalArgumentException("Summing amounts of different currencies");
        }
        return new CurrencyAmount(currency0, this.Y.add(currencyAmount0.Y));
    }

    public final String k() {
        return this.X.a() + " " + this.Y.toString();
    }

    @Override
    public final String toString() {
        return this.k();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.X.a());
        parcel0.writeString(this.Y.toString());
    }
}

