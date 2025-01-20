package com.google.android.gms.auth.api.signin.internal;

import C2.a;
import R2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final Bundle Z;

    static {
        GoogleSignInOptionsExtensionParcelable.CREATOR = new a(3);
    }

    public GoogleSignInOptionsExtensionParcelable(int v, int v1, Bundle bundle0) {
        this.X = v;
        this.Y = v1;
        this.Z = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.C(parcel0, 3, this.Z);
        f.J(v1, parcel0);
    }
}

