package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class m implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        Object object0 = FragmentHandle.CREATOR.createFromParcel(parcel0);
        String s1 = parcel0.readString();
        if(parcel0.readInt() == 0) {
            return new StepEnterName(((FragmentHandle)object0), ((PartnerOrg)parcel0.readParcelable(StepEnterName.class.getClassLoader())), null, s, s1);
        }
        return parcel0.readInt() == 0 ? new StepEnterName(((FragmentHandle)object0), ((PartnerOrg)parcel0.readParcelable(StepEnterName.class.getClassLoader())), Boolean.valueOf(false), s, s1) : new StepEnterName(((FragmentHandle)object0), ((PartnerOrg)parcel0.readParcelable(StepEnterName.class.getClassLoader())), Boolean.valueOf(true), s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepEnterName[v];
    }
}

