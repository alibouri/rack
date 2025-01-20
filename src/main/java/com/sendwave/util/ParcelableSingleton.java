package com.sendwave.util;

import Ab.c;
import Ab.j;
import android.os.Parcel;
import android.os.Parcelable;
import q9.n2;

public abstract class ParcelableSingleton implements Parcelable {
    public static final n2 CREATOR;
    public final c X;

    static {
        ParcelableSingleton.CREATOR = new n2();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public ParcelableSingleton(c c0) {
        this.X = c0;
        try {
            this.getClass().getConstructor(null);
        }
        catch(NoSuchMethodException unused_ex) {
            throw new j("Subclasses of ParcelableSingleton must implement a zero-argument constructor");  // initializer: Ljava/lang/Error;-><init>(Ljava/lang/String;)V
        }
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Nb.j.f(parcel0, "parcel");
        parcel0.writeString(this.getClass().getName());
    }
}

