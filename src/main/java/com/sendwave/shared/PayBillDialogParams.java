package com.sendwave.shared;

import A3.e;
import Bb.A;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.util.ParcelableSingleton;
import com.wave.customer.scratchCardRewards.ShowUnlockedScratchCardDealOnPayment;
import j6.c;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class PayBillDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final FragmentHandle Y;
    public final ParcelableSingleton Z;
    public final FragmentHandle b0;
    public final List c0;
    public final Integer d0;
    public final String e0;
    public final ActionSource f0;
    public final ParcelableSingleton g0;
    public final Map h0;

    static {
        PayBillDialogParams.CREATOR = new c(19);
    }

    public PayBillDialogParams(FragmentHandle fragmentHandle0, FragmentHandle fragmentHandle1, ParcelableSingleton parcelableSingleton0, FragmentHandle fragmentHandle2, List list0, Integer integer0, String s, ActionSource actionSource0, ParcelableSingleton parcelableSingleton1, Map map0) {
        j.f(fragmentHandle0, "handle");
        j.f(fragmentHandle1, "billType");
        j.f(parcelableSingleton0, "repository");
        j.f(map0, "prefilledFields");
        super();
        this.X = fragmentHandle0;
        this.Y = fragmentHandle1;
        this.Z = parcelableSingleton0;
        this.b0 = fragmentHandle2;
        this.c0 = list0;
        this.d0 = integer0;
        this.e0 = s;
        this.f0 = actionSource0;
        this.g0 = parcelableSingleton1;
        this.h0 = map0;
    }

    public PayBillDialogParams(FragmentHandle fragmentHandle0, FragmentHandle fragmentHandle1, ParcelableSingleton parcelableSingleton0, FragmentHandle fragmentHandle2, List list0, Integer integer0, String s, ActionSource actionSource0, ShowUnlockedScratchCardDealOnPayment showUnlockedScratchCardDealOnPayment0, Map map0, int v) {
        Map map1 = (v & 0x200) == 0 ? map0 : A.X;
        this(fragmentHandle0, fragmentHandle1, parcelableSingleton0, ((v & 8) == 0 ? fragmentHandle2 : null), ((v & 16) == 0 ? list0 : null), ((v & 0x20) == 0 ? integer0 : null), ((v & 0x40) == 0 ? s : null), ((v & 0x80) == 0 ? actionSource0 : null), ((v & 0x100) == 0 ? showUnlockedScratchCardDealOnPayment0 : null), map1);
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
        if(!(object0 instanceof PayBillDialogParams)) {
            return false;
        }
        if(!j.a(this.X, ((PayBillDialogParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((PayBillDialogParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((PayBillDialogParams)object0).Z)) {
            return false;
        }
        if(!j.a(this.b0, ((PayBillDialogParams)object0).b0)) {
            return false;
        }
        if(!j.a(this.c0, ((PayBillDialogParams)object0).c0)) {
            return false;
        }
        if(!j.a(this.d0, ((PayBillDialogParams)object0).d0)) {
            return false;
        }
        if(!j.a(this.e0, ((PayBillDialogParams)object0).e0)) {
            return false;
        }
        if(!j.a(this.f0, ((PayBillDialogParams)object0).f0)) {
            return false;
        }
        return j.a(this.g0, ((PayBillDialogParams)object0).g0) ? j.a(this.h0, ((PayBillDialogParams)object0).h0) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y.X);
        int v1 = this.Z.hashCode();
        int v2 = 0;
        int v3 = this.b0 == null ? 0 : this.b0.X.hashCode();
        int v4 = this.c0 == null ? 0 : this.c0.hashCode();
        int v5 = this.d0 == null ? 0 : this.d0.hashCode();
        int v6 = this.e0 == null ? 0 : this.e0.hashCode();
        int v7 = this.f0 == null ? 0 : this.f0.hashCode();
        ParcelableSingleton parcelableSingleton0 = this.g0;
        if(parcelableSingleton0 != null) {
            v2 = parcelableSingleton0.hashCode();
        }
        return this.h0.hashCode() + (((((((v1 + v) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v2) * 0x1F;
    }

    @Override
    public final String toString() {
        return "PayBillDialogParams(handle=" + this.X + ", billType=" + this.Y + ", repository=" + this.Z + ", billList=" + this.b0 + ", billTypeFields=" + this.c0 + ", iconId=" + this.d0 + ", actionUrl=" + this.e0 + ", actionSource=" + this.f0 + ", onSuccessfulPayment=" + this.g0 + ", prefilledFields=" + this.h0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        this.X.writeToParcel(parcel0, v);
        this.Y.writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.Z, v);
        FragmentHandle fragmentHandle0 = this.b0;
        if(fragmentHandle0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            fragmentHandle0.writeToParcel(parcel0, v);
        }
        List list0 = this.c0;
        if(list0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(list0.size());
            for(Object object0: list0) {
                ((ProposedBillField)object0).writeToParcel(parcel0, v);
            }
        }
        Integer integer0 = this.d0;
        if(integer0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer0));
        }
        parcel0.writeString(this.e0);
        parcel0.writeParcelable(this.f0, v);
        parcel0.writeParcelable(this.g0, v);
        parcel0.writeInt(this.h0.size());
        for(Object object1: this.h0.entrySet()) {
            parcel0.writeString(((String)((Map.Entry)object1).getKey()));
            parcel0.writeString(((String)((Map.Entry)object1).getValue()));
        }
    }
}

