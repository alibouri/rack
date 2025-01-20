package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import j6.c;
import m5.b;

public final class QRScanResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        QRScanResult.CREATOR = new c(24);
    }

    public QRScanResult(String s) {
        j.f(s, "qrText");
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
        return object0 instanceof QRScanResult ? j.a(this.X, ((QRScanResult)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("QRScanResult(qrText="), this.X, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

