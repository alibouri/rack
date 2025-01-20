package com.sendwave.shared.paybill;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import p9.i;

public final class SelectFavoriteParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final String Y;

    static {
        SelectFavoriteParams.CREATOR = new i(3);
    }

    public SelectFavoriteParams(FragmentHandle fragmentHandle0, String s) {
        j.f(fragmentHandle0, "handle");
        super();
        this.X = fragmentHandle0;
        this.Y = s;
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
        if(!(object0 instanceof SelectFavoriteParams)) {
            return false;
        }
        return j.a(this.X, ((SelectFavoriteParams)object0).X) ? j.a(this.Y, ((SelectFavoriteParams)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.X.hashCode();
        return this.Y == null ? v * 0x1F : v * 0x1F + this.Y.hashCode();
    }

    @Override
    public final String toString() {
        return "SelectFavoriteParams(handle=" + this.X + ", selectedFavoriteId=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        this.X.writeToParcel(parcel0, v);
        parcel0.writeString(this.Y);
    }
}

