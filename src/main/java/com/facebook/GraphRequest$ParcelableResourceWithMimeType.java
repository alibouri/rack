package com.facebook;

import C2.a;
import M4.l;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class GraphRequest.ParcelableResourceWithMimeType implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final Parcelable Y;

    static {
        GraphRequest.ParcelableResourceWithMimeType.CREATOR = new a(14);
    }

    public GraphRequest.ParcelableResourceWithMimeType(Parcel parcel0) {
        this.X = parcel0.readString();
        this.Y = parcel0.readParcelable(l.a().getClassLoader());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "out");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
    }
}

