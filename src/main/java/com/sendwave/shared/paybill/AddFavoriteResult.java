package com.sendwave.shared.paybill;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;
import p9.i;

public final class AddFavoriteResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        AddFavoriteResult.CREATOR = new i(0);
    }

    public AddFavoriteResult(String s) {
        j.f(s, "createdFavoriteId");
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
        return object0 instanceof AddFavoriteResult ? j.a(this.X, ((AddFavoriteResult)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("AddFavoriteResult(createdFavoriteId="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

