package com.wave.customer.scratchCardRewards;

import Ea.A;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.models.CurrencyAmount;

public final class ScratchCard.Award.CashAward implements ScratchCard.Award.Known {
    public static final Parcelable.Creator CREATOR;
    public final CurrencyAmount X;

    static {
        ScratchCard.Award.CashAward.CREATOR = new A(1);
    }

    public ScratchCard.Award.CashAward(CurrencyAmount currencyAmount0) {
        j.f(currencyAmount0, "amount");
        super();
        this.X = currencyAmount0;
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
        return object0 instanceof ScratchCard.Award.CashAward ? j.a(this.X, ((ScratchCard.Award.CashAward)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return "CashAward(amount=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
    }
}

