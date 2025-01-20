package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        String s1 = parcel0.readString();
        Object object0 = FragmentHandle.CREATOR.createFromParcel(parcel0);
        String s2 = parcel0.readString();
        if(parcel0.readInt() == 0) {
            return new StepCreatePin(s, s1, ((FragmentHandle)object0), s2, null);
        }
        return parcel0.readInt() == 0 ? new StepCreatePin(s, s1, ((FragmentHandle)object0), s2, Boolean.valueOf(false)) : new StepCreatePin(s, s1, ((FragmentHandle)object0), s2, Boolean.valueOf(true));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StepCreatePin[v];
    }
}

