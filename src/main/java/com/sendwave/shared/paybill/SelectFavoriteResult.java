package com.sendwave.shared.paybill;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;
import p9.i;

public final class SelectFavoriteResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        SelectFavoriteResult.CREATOR = new i(4);
    }

    public SelectFavoriteResult(String s) {
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
        return object0 instanceof SelectFavoriteResult ? j.a(this.X, ((SelectFavoriteResult)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X == null ? 0 : this.X.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("SelectFavoriteResult(selectedFavoriteId="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

