package com.google.android.gms.auth.api.signin;

import H5.d;
import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final GoogleSignInAccount Y;
    public final String Z;

    static {
        SignInAccount.CREATOR = new d(2);
    }

    public SignInAccount(String s, GoogleSignInAccount googleSignInAccount0, String s1) {
        this.Y = googleSignInAccount0;
        r.g(s, "8.3 and 8.4 SDKs require non-null email");
        this.X = s;
        r.g(s1, "8.3 and 8.4 SDKs require non-null userId");
        this.Z = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 4, this.X);
        f.E(parcel0, 7, this.Y, v);
        f.F(parcel0, 8, this.Z);
        f.J(v1, parcel0);
    }
}

