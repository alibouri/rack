package com.sendwave.androidApi;

import C2.a;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.apollographql.apollo.api.b;
import com.sendwave.util.Country;
import java.util.concurrent.ConcurrentHashMap;
import q9.M0;
import v7.d;

public final class Contact implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final String Z;
    public String b0;
    public String c0;
    public boolean d0;
    public boolean e0;
    public final boolean f0;
    public final Country g0;
    public final Integer h0;
    public static final d i0;
    public static final ConcurrentHashMap j0;

    static {
        Contact.i0 = new d(14);
        Contact.CREATOR = new a(29);
        Contact.j0 = new ConcurrentHashMap();
    }

    public Contact(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, boolean z2) {
        j.f(s, "mobile");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.b0 = s3;
        this.c0 = s4;
        this.d0 = z;
        this.e0 = z1;
        this.f0 = z2;
        Country country0 = M0.c(s);
        this.g0 = country0;
        this.h0 = country0 == null ? null : ((Integer)M0.f(country0).get("smallFlag"));
    }

    public Contact(String s, String s1, String s2, String s3, boolean z, int v) {
        this(s, ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), null, ((v & 0x20) == 0 ? z : false), false, false);
    }

    public final String b() {
        if(this.d0) {
            return this.b0 == null ? "" : this.b0;
        }
        String s = this.c0;
        if(s == null) {
            return this.b0 == null ? "" : this.b0;
        }
        return s;
    }

    public final String c() {
        if(this.e0) {
            return this.Y == null ? "" : this.Y;
        }
        return this.Z == null ? "" : this.Z;
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
        if(!(object0 instanceof Contact)) {
            return false;
        }
        if(!j.a(this.X, ((Contact)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((Contact)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((Contact)object0).Z)) {
            return false;
        }
        if(!j.a(this.b0, ((Contact)object0).b0)) {
            return false;
        }
        if(!j.a(this.c0, ((Contact)object0).c0)) {
            return false;
        }
        if(this.d0 != ((Contact)object0).d0) {
            return false;
        }
        return this.e0 == ((Contact)object0).e0 ? this.f0 == ((Contact)object0).f0 : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        int v1 = 0;
        int v2 = this.Y == null ? 0 : this.Y.hashCode();
        int v3 = this.Z == null ? 0 : this.Z.hashCode();
        int v4 = this.b0 == null ? 0 : this.b0.hashCode();
        String s = this.c0;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v5 = 0x4D5;
        int v6 = this.d0 ? 0x4CF : 0x4D5;
        int v7 = this.e0 ? 0x4CF : 0x4D5;
        if(this.f0) {
            v5 = 0x4CF;
        }
        return ((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F + v6) * 0x1F + v7) * 0x1F + v5;
    }

    @Override
    public final String toString() {
        String s = this.b0;
        String s1 = this.c0;
        boolean z = this.d0;
        boolean z1 = this.e0;
        StringBuilder stringBuilder0 = new StringBuilder("Contact(mobile=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", mobileAsNational=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", mobileAsInternational=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", serverName=");
        stringBuilder0.append(s);
        stringBuilder0.append(", phoneBookName=");
        stringBuilder0.append(s1);
        stringBuilder0.append(", isSelf=");
        stringBuilder0.append(z);
        stringBuilder0.append(", isFromUserCountry=");
        stringBuilder0.append(z1);
        stringBuilder0.append(", _hasWaveAccount=");
        return b.r(stringBuilder0, this.f0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeString(this.Z);
        parcel0.writeString(this.b0);
        parcel0.writeString(this.c0);
        parcel0.writeInt(((int)this.d0));
        parcel0.writeInt(((int)this.e0));
        parcel0.writeInt(((int)this.f0));
    }
}

