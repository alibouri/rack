package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class r3 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        parcel0.readInt();
        return TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT.X;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT[v];
    }
}

