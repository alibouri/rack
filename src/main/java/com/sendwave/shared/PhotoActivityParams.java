package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.apollographql.apollo.api.b;
import j6.c;
import o9.H1;

public final class PhotoActivityParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final boolean Y;
    public final boolean Z;
    public final boolean b0;
    public final String c0;
    public final H1 d0;
    public final String e0;
    public final String f0;
    public final boolean g0;
    public final String h0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;

    static {
        PhotoActivityParams.CREATOR = new c(21);
    }

    public PhotoActivityParams(String s, boolean z, boolean z1, boolean z2, String s1, H1 h10, String s2, String s3, boolean z3, String s4, boolean z4, boolean z5, boolean z6) {
        j.f(s, "titleText");
        j.f(h10, "preferredScanMode");
        super();
        this.X = s;
        this.Y = z;
        this.Z = z1;
        this.b0 = z2;
        this.c0 = s1;
        this.d0 = h10;
        this.e0 = s2;
        this.f0 = s3;
        this.g0 = z3;
        this.h0 = s4;
        this.i0 = z4;
        this.j0 = z5;
        this.k0 = z6;
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
        if(!(object0 instanceof PhotoActivityParams)) {
            return false;
        }
        if(!j.a(this.X, ((PhotoActivityParams)object0).X)) {
            return false;
        }
        if(this.Y != ((PhotoActivityParams)object0).Y) {
            return false;
        }
        if(this.Z != ((PhotoActivityParams)object0).Z) {
            return false;
        }
        if(this.b0 != ((PhotoActivityParams)object0).b0) {
            return false;
        }
        if(!j.a(this.c0, ((PhotoActivityParams)object0).c0)) {
            return false;
        }
        if(this.d0 != ((PhotoActivityParams)object0).d0) {
            return false;
        }
        if(!j.a(this.e0, ((PhotoActivityParams)object0).e0)) {
            return false;
        }
        if(!j.a(this.f0, ((PhotoActivityParams)object0).f0)) {
            return false;
        }
        if(this.g0 != ((PhotoActivityParams)object0).g0) {
            return false;
        }
        if(!j.a(this.h0, ((PhotoActivityParams)object0).h0)) {
            return false;
        }
        if(this.i0 != ((PhotoActivityParams)object0).i0) {
            return false;
        }
        return this.j0 == ((PhotoActivityParams)object0).j0 ? this.k0 == ((PhotoActivityParams)object0).k0 : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        int v1 = 0x4D5;
        int v2 = this.Y ? 0x4CF : 0x4D5;
        int v3 = this.Z ? 0x4CF : 0x4D5;
        int v4 = this.b0 ? 0x4CF : 0x4D5;
        int v5 = 0;
        int v6 = this.c0 == null ? 0 : this.c0.hashCode();
        int v7 = this.d0.hashCode();
        int v8 = this.e0 == null ? 0 : this.e0.hashCode();
        int v9 = this.f0 == null ? 0 : this.f0.hashCode();
        int v10 = this.g0 ? 0x4CF : 0x4D5;
        String s = this.h0;
        if(s != null) {
            v5 = s.hashCode();
        }
        int v11 = this.i0 ? 0x4CF : 0x4D5;
        int v12 = this.j0 ? 0x4CF : 0x4D5;
        if(this.k0) {
            v1 = 0x4CF;
        }
        return (((((((v7 + ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v6) * 0x1F) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v5) * 0x1F + v11) * 0x1F + v12) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PhotoActivityParams(titleText=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", useConfirmationFlow=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", preferFrontCamera=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", isSkippable=");
        stringBuilder0.append(this.b0);
        stringBuilder0.append(", warnForSkip=");
        stringBuilder0.append(this.c0);
        stringBuilder0.append(", preferredScanMode=");
        stringBuilder0.append(this.d0);
        stringBuilder0.append(", moreInfo=");
        stringBuilder0.append(this.e0);
        stringBuilder0.append(", confirmText=");
        stringBuilder0.append(this.f0);
        stringBuilder0.append(", allowPickFromGallery=");
        stringBuilder0.append(this.g0);
        stringBuilder0.append(", trackingCategory=");
        stringBuilder0.append(this.h0);
        stringBuilder0.append(", showBackBtn=");
        stringBuilder0.append(this.i0);
        stringBuilder0.append(", showMorePagesDialog=");
        stringBuilder0.append(this.j0);
        stringBuilder0.append(", isPortrait=");
        return b.r(stringBuilder0, this.k0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeInt(((int)this.Y));
        parcel0.writeInt(((int)this.Z));
        parcel0.writeInt(((int)this.b0));
        parcel0.writeString(this.c0);
        parcel0.writeString(this.d0.name());
        parcel0.writeString(this.e0);
        parcel0.writeString(this.f0);
        parcel0.writeInt(((int)this.g0));
        parcel0.writeString(this.h0);
        parcel0.writeInt(((int)this.i0));
        parcel0.writeInt(((int)this.j0));
        parcel0.writeInt(((int)this.k0));
    }
}

