package com.wave.customer.savings;

import A3.e;
import Aa.z;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.wave.customer.transactions.ui.TransactionsParams;

public final class SavingsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final FragmentHandle Y;
    public final TransactionsParams Z;

    static {
        SavingsParams.CREATOR = new z();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public SavingsParams(FragmentHandle fragmentHandle0, FragmentHandle fragmentHandle1, TransactionsParams transactionsParams0) {
        j.f(fragmentHandle0, "savingsHandle");
        j.f(fragmentHandle1, "supportHandle");
        j.f(transactionsParams0, "transactionsParams");
        super();
        this.X = fragmentHandle0;
        this.Y = fragmentHandle1;
        this.Z = transactionsParams0;
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
        if(!(object0 instanceof SavingsParams)) {
            return false;
        }
        if(!j.a(this.X, ((SavingsParams)object0).X)) {
            return false;
        }
        return j.a(this.Y, ((SavingsParams)object0).Y) ? j.a(this.Z, ((SavingsParams)object0).Z) : false;
    }

    @Override
    public final int hashCode() {
        return this.Z.hashCode() + e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y.X);
    }

    @Override
    public final String toString() {
        return "SavingsParams(savingsHandle=" + this.X + ", supportHandle=" + this.Y + ", transactionsParams=" + this.Z + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeParcelable(this.Y, v);
        this.Z.writeToParcel(parcel0, v);
    }
}

