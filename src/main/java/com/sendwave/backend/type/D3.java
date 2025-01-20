package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class d3 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        parcel0.readInt();
        return TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED.X;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED[v];
    }
}

