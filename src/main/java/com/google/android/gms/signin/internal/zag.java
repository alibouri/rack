package com.google.android.gms.signin.internal;

import L5.l;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;
import java.util.ArrayList;

public final class zag extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList X;
    public final String Y;

    static {
        zag.CREATOR = new c(10);
    }

    public zag(String s, ArrayList arrayList0) {
        this.X = arrayList0;
        this.Y = s;
    }

    @Override  // L5.l
    public final Status c() {
        return this.Y == null ? Status.g0 : Status.c0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        ArrayList arrayList0 = this.X;
        if(arrayList0 != null) {
            int v2 = f.I(1, parcel0);
            parcel0.writeStringList(arrayList0);
            f.J(v2, parcel0);
        }
        f.F(parcel0, 2, this.Y);
        f.J(v1, parcel0);
    }
}

