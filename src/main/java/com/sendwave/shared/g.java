package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;

public final class g implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        FragmentHandle fragmentHandle0 = (FragmentHandle)FragmentHandle.CREATOR.createFromParcel(parcel0);
        String s = parcel0.readString();
        if(parcel0.readInt() == 0) {
            return new StepApproveUserDevice(fragmentHandle0, s, null);
        }
        return parcel0.readInt() == 0 ? new StepApproveUserDevice(fragmentHandle0, s, Boolean.valueOf(false)) : new StepApproveUserDevice(fragmentHandle0, s, Boolean.valueOf(true));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepApproveUserDevice[v];
    }
}

