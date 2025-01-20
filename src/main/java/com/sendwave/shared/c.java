package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;

public final class c implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        String s1 = parcel0.readString();
        return new StepVerifyAuthCode(((FragmentHandle)FragmentHandle.CREATOR.createFromParcel(parcel0)), s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepVerifyAuthCode[v];
    }
}

