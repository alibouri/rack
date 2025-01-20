package com.wave.customer;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import java.util.LinkedHashMap;

public final class f implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        FragmentHandle fragmentHandle0 = (FragmentHandle)parcel0.readParcelable(MerchantPayment.class.getClassLoader());
        String s = parcel0.readString();
        ActionSource actionSource0 = (ActionSource)parcel0.readParcelable(MerchantPayment.class.getClassLoader());
        int v = parcel0.readInt();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(int v1 = 0; v1 != v; ++v1) {
            linkedHashMap0.put(parcel0.readString(), parcel0.readString());
        }
        return new MerchantPayment(fragmentHandle0, s, actionSource0, linkedHashMap0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MerchantPayment[v];
    }
}

