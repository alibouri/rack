package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.apollographql.apollo.api.b;
import j6.c;

public final class VerifyToken implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean X;

    static {
        VerifyToken.CREATOR = new c(27);
    }

    public VerifyToken(boolean z) {
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
        return object0 instanceof VerifyToken ? this.X == ((VerifyToken)object0).X : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.X ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return b.r(new StringBuilder("VerifyToken(success="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(((int)this.X));
    }
}

