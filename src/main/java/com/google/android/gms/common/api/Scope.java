package com.google.android.gms.common.api;

import C2.a;
import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final String Y;

    static {
        Scope.CREATOR = new a(10);
    }

    public Scope(int v, String s) {
        r.g(s, "scopeUri must not be null or empty");
        this.X = v;
        this.Y = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Scope ? this.Y.equals(((Scope)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode();
    }

    @Override
    public final String toString() {
        return this.Y;
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

