package com.sendwave.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class j implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Nb.j.f(parcel0, "parcel");
        String s = parcel0.readString();
        return new StepVerifyAuthCode(((FragmentHandle)FragmentHandle.CREATOR.createFromParcel(parcel0)), ((PartnerOrg)parcel0.readParcelable(StepVerifyAuthCode.class.getClassLoader())), s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepVerifyAuthCode[v];
    }
}

