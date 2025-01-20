package com.google.android.gms.common.internal;

import C2.a;
import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final String Y;

    static {
        ClientIdentity.CREATOR = new a(18);
    }

    public ClientIdentity(int v, String s) {
        this.X = v;
        this.Y = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ClientIdentity ? ((ClientIdentity)object0).X == this.X && r.m(((ClientIdentity)object0).Y, this.Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.X;
    }

    @Override
    public final String toString() {
        return this.X + ":" + this.Y;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.F(parcel0, 2, this.Y);
        f.J(v1, parcel0);
    }
}

