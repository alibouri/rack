package com.google.android.gms.auth.api.signin.internal;

import C2.a;
import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final GoogleSignInOptions Y;

    static {
        SignInConfiguration.CREATOR = new a(4);
    }

    public SignInConfiguration(String s, GoogleSignInOptions googleSignInOptions0) {
        r.f(s);
        this.X = s;
        this.Y = googleSignInOptions0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof SignInConfiguration)) {
            return false;
        }
        if(this.X.equals(((SignInConfiguration)object0).X)) {
            GoogleSignInOptions googleSignInOptions0 = ((SignInConfiguration)object0).Y;
            return this.Y == null ? googleSignInOptions0 == null : this.Y.equals(googleSignInOptions0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.X == null ? 0 : this.X.hashCode();
        GoogleSignInOptions googleSignInOptions0 = this.Y;
        if(googleSignInOptions0 != null) {
            v = googleSignInOptions0.hashCode();
        }
        return (0x1F + v1) * 0x1F + v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 2, this.X);
        f.E(parcel0, 5, this.Y, v);
        f.J(v1, parcel0);
    }
}

