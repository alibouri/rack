package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.androidApi.Contact;
import com.sendwave.shared.PayBillDialogParams;

public final class BuyAirtimeDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Contact X;
    public final PayBillDialogParams Y;

    static {
        BuyAirtimeDialogParams.CREATOR = new b(1);
    }

    public BuyAirtimeDialogParams(Contact contact0, PayBillDialogParams payBillDialogParams0) {
        j.f(contact0, "recipient");
        j.f(payBillDialogParams0, "billPayParams");
        super();
        this.X = contact0;
        this.Y = payBillDialogParams0;
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
        if(!(object0 instanceof BuyAirtimeDialogParams)) {
            return false;
        }
        return j.a(this.X, ((BuyAirtimeDialogParams)object0).X) ? j.a(this.Y, ((BuyAirtimeDialogParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "BuyAirtimeDialogParams(recipient=" + this.X + ", billPayParams=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeParcelable(this.Y, v);
    }
}

