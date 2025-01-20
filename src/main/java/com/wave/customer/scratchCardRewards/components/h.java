package com.wave.customer.scratchCardRewards.components;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.LinkedHashMap;

public final class h implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Class class0;
        j.f(parcel0, "parcel");
        int v = parcel0.readInt();
        int v1 = parcel0.readInt();
        int v2 = parcel0.readInt();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v2);
        for(int v4 = 0; true; ++v4) {
            class0 = RewardsPathState.class;
            if(v4 == v2) {
                break;
            }
            linkedHashMap0.put(parcel0.readInt(), parcel0.readParcelable(class0.getClassLoader()));
        }
        int v5 = parcel0.readInt();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(v5);
        for(int v3 = 0; v3 != v5; ++v3) {
            linkedHashMap1.put(parcel0.readInt(), parcel0.readParcelable(class0.getClassLoader()));
        }
        return parcel0.readInt() == 0 ? new RewardsPathState(v, v1, linkedHashMap0, linkedHashMap1, null) : new RewardsPathState(v, v1, linkedHashMap0, linkedHashMap1, ((Instructions)Instructions.CREATOR.createFromParcel(parcel0)));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RewardsPathState[v];
    }
}

