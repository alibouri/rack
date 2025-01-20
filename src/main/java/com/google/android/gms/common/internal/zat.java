package com.google.android.gms.common.internal;

import C2.a;
import R2.f;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final Account Y;
    public final int Z;
    public final GoogleSignInAccount b0;

    static {
        zat.CREATOR = new a(21);
    }

    public zat(int v, Account account0, int v1, GoogleSignInAccount googleSignInAccount0) {
        this.X = v;
        this.Y = account0;
        this.Z = v1;
        this.b0 = googleSignInAccount0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.E(parcel0, 2, this.Y, v);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(this.Z);
        f.E(parcel0, 4, this.b0, v);
        f.J(v1, parcel0);
    }
}

