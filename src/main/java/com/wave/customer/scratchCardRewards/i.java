package com.wave.customer.scratchCardRewards;

import Ea.V;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class i implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        String s1 = parcel0.readString();
        Object object0 = null;
        Object object1 = parcel0.readInt() == 0 ? null : ServerDate.CREATOR.createFromParcel(parcel0);
        V v0 = V.valueOf(parcel0.readString());
        if(parcel0.readInt() != 0) {
            object0 = ScratchCardTermsAndConditions.CREATOR.createFromParcel(parcel0);
        }
        return new UnknownAward(s, s1, ((ServerDate)object1), v0, ((ScratchCardTermsAndConditions)object0));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UnknownAward[v];
    }
}

