package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ReviewInfo.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(((zza)this).X, 0);
        parcel0.writeInt(((int)((zza)this).Y));
    }
}

