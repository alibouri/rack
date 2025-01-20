package com.google.android.gms.cloudmessaging;

import J5.b;
import R2.f;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Intent X;

    static {
        CloudMessage.CREATOR = new b(0);
    }

    public CloudMessage(Intent intent0) {
        this.X = intent0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.E(parcel0, 1, this.X, v);
        f.J(v1, parcel0);
    }
}

