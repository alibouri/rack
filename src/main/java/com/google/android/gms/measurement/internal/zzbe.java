package com.google.android.gms.measurement.internal;

import R2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;
import j6.r;
import java.util.Iterator;

public final class zzbe extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle X;

    static {
        zzbe.CREATOR = new c(2);
    }

    public zzbe(Bundle bundle0) {
        this.X = bundle0;
    }

    public final Double g() {
        return this.X.getDouble("value");
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = new r();
        iterator0.Y = this.X.keySet().iterator();
        return iterator0;
    }

    public final Bundle l() {
        return new Bundle(this.X);
    }

    public final String o() {
        return this.X.getString("currency");
    }

    @Override
    public final String toString() {
        return this.X.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.C(parcel0, 2, this.l());
        f.J(v1, parcel0);
    }
}

