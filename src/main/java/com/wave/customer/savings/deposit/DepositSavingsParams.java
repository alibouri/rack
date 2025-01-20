package com.wave.customer.savings.deposit;

import Ba.h;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;

public final class DepositSavingsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;

    static {
        DepositSavingsParams.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public DepositSavingsParams(FragmentHandle fragmentHandle0) {
        j.f(fragmentHandle0, "savingsHandle");
        super();
        this.X = fragmentHandle0;
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
        return object0 instanceof DepositSavingsParams ? j.a(this.X, ((DepositSavingsParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.X.hashCode();
    }

    @Override
    public final String toString() {
        return "DepositSavingsParams(savingsHandle=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
    }
}

