package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class i implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        Parcelable parcelable0 = parcel0.readParcelable(StepEnterName.class.getClassLoader());
        Object object0 = FragmentHandle.CREATOR.createFromParcel(parcel0);
        String s1 = parcel0.readString();
        if(parcel0.readInt() == 0) {
            return new StepEnterName(((FragmentHandle)object0), ((PartnerOrg)parcelable0), null, s, s1);
        }
        return parcel0.readInt() == 0 ? new StepEnterName(((FragmentHandle)object0), ((PartnerOrg)parcelable0), Boolean.valueOf(false), s, s1) : new StepEnterName(((FragmentHandle)object0), ((PartnerOrg)parcelable0), Boolean.valueOf(true), s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepEnterName[v];
    }
}

