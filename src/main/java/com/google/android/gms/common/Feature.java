package com.google.android.gms.common;

import C2.a;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.g1;
import java.util.Arrays;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final int Y;
    public final long Z;

    static {
        Feature.CREATOR = new a(6);
    }

    public Feature(int v, long v1, String s) {
        this.X = s;
        this.Y = v;
        this.Z = v1;
    }

    public Feature(long v, String s) {
        this.X = s;
        this.Z = v;
        this.Y = -1;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof Feature && ((this.X == null && this.X.equals(((Feature)object0).X) || this.X == null && ((Feature)object0).X == null) && this.g() == ((Feature)object0).g());
    }

    public final long g() {
        return this.Z == -1L ? ((long)this.Y) : this.Z;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.g()});
    }

    @Override
    public final String toString() {
        g1 g10 = new g1(this);
        g10.b(this.X, "name");
        g10.b(this.g(), "version");
        return g10.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 1, this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.K(parcel0, 3, 8);
        parcel0.writeLong(this.g());
        f.J(v1, parcel0);
    }
}

