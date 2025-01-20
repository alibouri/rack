package com.wave.customer;

import A3.e;
import Nb.j;
import R9.b;
import R9.l2;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;

public final class QrScanOrCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final boolean Y;
    public final FragmentHandle Z;
    public final l2 b0;

    static {
        QrScanOrCardParams.CREATOR = new b(11);
    }

    public QrScanOrCardParams(int v, boolean z, FragmentHandle fragmentHandle0, l2 l20) {
        j.f(fragmentHandle0, "handle");
        j.f(l20, "mode");
        super();
        this.X = v;
        this.Y = z;
        this.Z = fragmentHandle0;
        this.b0 = l20;
    }

    public final l2 b() {
        return this.b0;
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
        if(!(object0 instanceof QrScanOrCardParams)) {
            return false;
        }
        if(this.X != ((QrScanOrCardParams)object0).X) {
            return false;
        }
        if(this.Y != ((QrScanOrCardParams)object0).Y) {
            return false;
        }
        return j.a(this.Z, ((QrScanOrCardParams)object0).Z) ? this.b0 == ((QrScanOrCardParams)object0).b0 : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X * 0x1F;
        return this.Y ? this.b0.hashCode() + e.s((v + 0x4CF) * 0x1F, 0x1F, this.Z.X) : this.b0.hashCode() + e.s((v + 0x4D5) * 0x1F, 0x1F, this.Z.X);
    }

    @Override
    public final String toString() {
        return "QrScanOrCardParams(qrRefreshIntervalSec=" + this.X + ", useQrTimeOffset=" + this.Y + ", handle=" + this.Z + ", mode=" + this.b0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(this.X);
        parcel0.writeInt(((int)this.Y));
        parcel0.writeParcelable(this.Z, v);
        parcel0.writeString(this.b0.name());
    }
}

