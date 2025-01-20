package com.wave.customer;

import Nb.j;
import R9.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class EnterNameResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        EnterNameResult.CREATOR = new b(7);
    }

    public EnterNameResult(String s) {
        j.f(s, "name");
        super();
        this.X = s;
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
        return object0 instanceof EnterNameResult ? j.a(this.X, ((EnterNameResult)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return m5.b.y(new StringBuilder("EnterNameResult(name="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

