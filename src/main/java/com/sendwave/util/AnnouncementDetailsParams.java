package com.sendwave.util;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.List;
import q9.o;

public final class AnnouncementDetailsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final String c0;
    public final Object d0;

    static {
        AnnouncementDetailsParams.CREATOR = new o(1);
    }

    public AnnouncementDetailsParams(String s, String s1, String s2, String s3, String s4, List list0) {
        j.f(s, "title");
        j.f(s1, "message");
        j.f(s3, "announcementId");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.b0 = s3;
        this.c0 = s4;
        this.d0 = list0;
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
        if(!(object0 instanceof AnnouncementDetailsParams)) {
            return false;
        }
        if(!j.a(this.X, ((AnnouncementDetailsParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((AnnouncementDetailsParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((AnnouncementDetailsParams)object0).Z)) {
            return false;
        }
        if(!j.a(this.b0, ((AnnouncementDetailsParams)object0).b0)) {
            return false;
        }
        return j.a(this.c0, ((AnnouncementDetailsParams)object0).c0) ? this.d0.equals(((AnnouncementDetailsParams)object0).d0) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = e.s((e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y) + (this.Z == null ? 0 : this.Z.hashCode())) * 0x1F, 0x1F, this.b0);
        String s = this.c0;
        if(s != null) {
            v = s.hashCode();
        }
        return this.d0.hashCode() + (v1 + v) * 0x1F;
    }

    @Override
    public final String toString() {
        return "AnnouncementDetailsParams(title=" + this.X + ", message=" + this.Y + ", imageUrl=" + this.Z + ", announcementId=" + this.b0 + ", voiceMessageUri=" + this.c0 + ", actions=" + this.d0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeString(this.Z);
        parcel0.writeString(this.b0);
        parcel0.writeString(this.c0);
        parcel0.writeInt(((List)this.d0).size());
        for(Object object0: ((List)this.d0)) {
            ((AnnouncementAction)object0).writeToParcel(parcel0, v);
        }
    }
}

