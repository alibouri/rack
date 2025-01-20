package com.wave.customer.paymentcards;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.wave.customer.transactions.ui.TransactionsParams;
import ra.h0;

public final class PaymentCardsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final FragmentHandle Y;
    public final FragmentHandle Z;
    public final TransactionsParams b0;

    static {
        PaymentCardsParams.CREATOR = new h0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public PaymentCardsParams(String s, FragmentHandle fragmentHandle0, FragmentHandle fragmentHandle1, TransactionsParams transactionsParams0) {
        j.f(s, "walletId");
        j.f(fragmentHandle0, "kycInfoHandle");
        j.f(fragmentHandle1, "supportHandle");
        j.f(transactionsParams0, "transactionsParams");
        super();
        this.X = s;
        this.Y = fragmentHandle0;
        this.Z = fragmentHandle1;
        this.b0 = transactionsParams0;
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
        if(!(object0 instanceof PaymentCardsParams)) {
            return false;
        }
        if(!j.a(this.X, ((PaymentCardsParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((PaymentCardsParams)object0).Y)) {
            return false;
        }
        return j.a(this.Z, ((PaymentCardsParams)object0).Z) ? j.a(this.b0, ((PaymentCardsParams)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        return this.b0.hashCode() + e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y.X), 0x1F, this.Z.X);
    }

    @Override
    public final String toString() {
        return "PaymentCardsParams(walletId=" + this.X + ", kycInfoHandle=" + this.Y + ", supportHandle=" + this.Z + ", transactionsParams=" + this.b0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeParcelable(this.Z, v);
        this.b0.writeToParcel(parcel0, v);
    }
}

