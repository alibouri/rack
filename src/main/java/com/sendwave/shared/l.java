package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class l implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        Object object0 = FragmentHandle.CREATOR.createFromParcel(parcel0);
        String s1 = parcel0.readString();
        Boolean boolean0 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
        String s2 = parcel0.readString();
        return new StepCreatePin(s, ((FragmentHandle)object0), s1, boolean0, ((PartnerOrg)parcel0.readParcelable(StepCreatePin.class.getClassLoader())), s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepCreatePin[v];
    }
}

