package com.wave.customer.receipts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;
import va.d;

public final class ReceiptParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final PartnerOrg Y;
    public final int Z;
    public final FragmentHandle b0;

    static {
        ReceiptParams.CREATOR = new d(1);
    }

    public ReceiptParams(String s, PartnerOrg partnerOrg0, int v, FragmentHandle fragmentHandle0) {
        j.f(s, "historyEntryId");
        j.f(fragmentHandle0, "supportHandle");
        super();
        this.X = s;
        this.Y = partnerOrg0;
        this.Z = v;
        this.b0 = fragmentHandle0;
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
        if(!(object0 instanceof ReceiptParams)) {
            return false;
        }
        if(!j.a(this.X, ((ReceiptParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((ReceiptParams)object0).Y)) {
            return false;
        }
        return this.Z == ((ReceiptParams)object0).Z ? j.a(this.b0, ((ReceiptParams)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        return this.Y == null ? this.b0.X.hashCode() + (v * 961 + this.Z) * 0x1F : this.b0.X.hashCode() + ((v * 0x1F + this.Y.hashCode()) * 0x1F + this.Z) * 0x1F;
    }

    @Override
    public final String toString() {
        return "ReceiptParams(historyEntryId=" + HistoryEntryId.b(this.X) + ", partnerOrg=" + this.Y + ", undoWindowDurationMs=" + this.Z + ", supportHandle=" + this.b0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeInt(this.Z);
        parcel0.writeParcelable(this.b0, v);
    }
}

