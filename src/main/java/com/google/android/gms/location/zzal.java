package com.google.android.gms.location;

import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final long Z;
    public final long b0;

    static {
        zzal.CREATOR = new a(25);
    }

    public zzal(int v, int v1, long v2, long v3) {
        this.X = v;
        this.Y = v1;
        this.Z = v2;
        this.b0 = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzal && this.X == ((zzal)object0).X && this.Y == ((zzal)object0).Y && this.Z == ((zzal)object0).Z && this.b0 == ((zzal)object0).b0;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.Y), ((int)this.X), ((long)this.b0), ((long)this.Z)});
    }

    @Override
    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.X + " Cell status: " + this.Y + " elapsed time NS: " + this.b0 + " system time ms: " + this.Z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.K(parcel0, 3, 8);
        parcel0.writeLong(this.Z);
        f.K(parcel0, 4, 8);
        parcel0.writeLong(this.b0);
        f.J(v1, parcel0);
    }
}

