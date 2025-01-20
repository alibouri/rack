package com.wave.customer.scratchCardRewards;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class RedeemScratchCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final KnownAward X;

    static {
        RedeemScratchCardParams.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public RedeemScratchCardParams(KnownAward scratchCard$Unlocked$KnownAward0) {
        j.f(scratchCard$Unlocked$KnownAward0, "card");
        super();
        this.X = scratchCard$Unlocked$KnownAward0;
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
        return object0 instanceof RedeemScratchCardParams ? j.a(this.X, ((RedeemScratchCardParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return "RedeemScratchCardParams(card=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        this.X.writeToParcel(parcel0, v);
    }
}

