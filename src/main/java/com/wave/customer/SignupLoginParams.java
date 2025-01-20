package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class SignupLoginParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean X;

    static {
        SignupLoginParams.CREATOR = new b(17);
    }

    public SignupLoginParams(boolean z) {
        this.X = z;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SignupLoginParams ? this.X == ((SignupLoginParams)object0).X : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.X ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return com.apollographql.apollo.api.b.r(new StringBuilder("SignupLoginParams(addingAccount="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(((int)this.X));
    }
}

