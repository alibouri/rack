package com.google.android.gms.measurement.internal;

import R2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle X;

    static {
        zzaj.CREATOR = new c(1);
    }

    public zzaj(Bundle bundle0) {
        this.X = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.C(parcel0, 1, this.X);
        f.J(v1, parcel0);
    }
}

