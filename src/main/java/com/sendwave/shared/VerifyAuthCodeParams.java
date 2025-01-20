package com.sendwave.shared;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.util.ParcelableSingleton;
import j6.c;
import m5.b;

public final class VerifyAuthCodeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final PartnerOrg Y;
    public final ParcelableSingleton Z;
    public final ParcelableSingleton b0;
    public final String c0;
    public final long d0;
    public final long e0;
    public final boolean f0;
    public final boolean g0;
    public final String h0;

    static {
        VerifyAuthCodeParams.CREATOR = new c(26);
    }

    public VerifyAuthCodeParams(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, ParcelableSingleton parcelableSingleton0, ParcelableSingleton parcelableSingleton1, String s, long v, long v1, boolean z, boolean z1, String s1) {
        j.f(fragmentHandle0, "tokenHandle");
        j.f(parcelableSingleton0, "repositoryHandle");
        j.f(parcelableSingleton1, "mutator");
        j.f(s, "mobile");
        super();
        this.X = fragmentHandle0;
        this.Y = partnerOrg0;
        this.Z = parcelableSingleton0;
        this.b0 = parcelableSingleton1;
        this.c0 = s;
        this.d0 = v;
        this.e0 = v1;
        this.f0 = z;
        this.g0 = z1;
        this.h0 = s1;
    }

    public VerifyAuthCodeParams(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, ParcelableSingleton parcelableSingleton0, ParcelableSingleton parcelableSingleton1, String s, boolean z, int v) {
        this(fragmentHandle0, partnerOrg0, parcelableSingleton0, parcelableSingleton1, s, 10000L, 60000L, (v & 0x80) != 0, ((v & 0x100) == 0 ? z : false), null);
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
        if(!(object0 instanceof VerifyAuthCodeParams)) {
            return false;
        }
        if(!j.a(this.X, ((VerifyAuthCodeParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((VerifyAuthCodeParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((VerifyAuthCodeParams)object0).Z)) {
            return false;
        }
        if(!j.a(this.b0, ((VerifyAuthCodeParams)object0).b0)) {
            return false;
        }
        if(!j.a(this.c0, ((VerifyAuthCodeParams)object0).c0)) {
            return false;
        }
        if(this.d0 != ((VerifyAuthCodeParams)object0).d0) {
            return false;
        }
        if(this.e0 != ((VerifyAuthCodeParams)object0).e0) {
            return false;
        }
        if(this.f0 != ((VerifyAuthCodeParams)object0).f0) {
            return false;
        }
        return this.g0 == ((VerifyAuthCodeParams)object0).g0 ? j.a(this.h0, ((VerifyAuthCodeParams)object0).h0) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((e.s((this.b0.hashCode() + (this.Z.hashCode() + (this.X.X.hashCode() * 0x1F + (this.Y == null ? 0 : this.Y.hashCode())) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.c0) + ((int)(this.d0 ^ this.d0 >>> 0x20))) * 0x1F + ((int)(this.e0 ^ this.e0 >>> 0x20))) * 0x1F;
        int v2 = 0x4D5;
        int v3 = this.f0 ? 0x4CF : 0x4D5;
        if(this.g0) {
            v2 = 0x4CF;
        }
        String s = this.h0;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + v3) * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("VerifyAuthCodeParams(tokenHandle=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", partnerOrg=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", repositoryHandle=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", mutator=");
        stringBuilder0.append(this.b0);
        stringBuilder0.append(", mobile=");
        stringBuilder0.append(this.c0);
        stringBuilder0.append(", showRobocallDelay=");
        stringBuilder0.append(this.d0);
        stringBuilder0.append(", showCallSupportDelay=");
        stringBuilder0.append(this.e0);
        stringBuilder0.append(", shouldRetrieveFromSms=");
        stringBuilder0.append(this.f0);
        stringBuilder0.append(", addingAccount=");
        stringBuilder0.append(this.g0);
        stringBuilder0.append(", pin=");
        return b.y(stringBuilder0, this.h0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        this.X.writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeParcelable(this.Z, v);
        parcel0.writeParcelable(this.b0, v);
        parcel0.writeString(this.c0);
        parcel0.writeLong(this.d0);
        parcel0.writeLong(this.e0);
        parcel0.writeInt(((int)this.f0));
        parcel0.writeInt(((int)this.g0));
        parcel0.writeString(this.h0);
    }
}

