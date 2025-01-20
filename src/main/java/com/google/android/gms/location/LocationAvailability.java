package com.google.android.gms.location;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final long Z;
    public final int b0;
    public final zzal[] c0;

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        LocationAvailability.CREATOR = new a(19);
    }

    public LocationAvailability(int v, int v1, int v2, long v3, zzal[] arr_zzal) {
        this.b0 = v >= 1000 ? 1000 : 0;
        this.X = v1;
        this.Y = v2;
        this.Z = v3;
        this.c0 = arr_zzal;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof LocationAvailability && this.X == ((LocationAvailability)object0).X && this.Y == ((LocationAvailability)object0).Y && this.Z == ((LocationAvailability)object0).Z && this.b0 == ((LocationAvailability)object0).b0 && Arrays.equals(this.c0, ((LocationAvailability)object0).c0);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.b0)});
    }

    @Override
    public final String toString() {
        return this.b0 >= 1000 ? "LocationAvailability[" + false + "]" : "LocationAvailability[" + true + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        int v2 = 1;
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.K(parcel0, 3, 8);
        parcel0.writeLong(this.Z);
        f.K(parcel0, 4, 4);
        parcel0.writeInt(this.b0);
        f.G(parcel0, 5, this.c0, v);
        if(this.b0 >= 1000) {
            v2 = 0;
        }
        f.K(parcel0, 6, 4);
        parcel0.writeInt(v2);
        f.J(v1, parcel0);
    }
}

