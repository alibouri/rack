package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class SignupNeedsName extends SignupVerificationResult {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final Boolean Y;

    static {
        SignupNeedsName.CREATOR = new b(19);
    }

    public SignupNeedsName(String s, Boolean boolean0) {
        j.f(s, "smsCode");
        super(0);
        this.X = s;
        this.Y = boolean0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        boolean z;
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        Boolean boolean0 = this.Y;
        if(boolean0 == null) {
            z = false;
        }
        else {
            parcel0.writeInt(1);
            z = boolean0.booleanValue();
        }
        parcel0.writeInt(((int)z));
    }
}

