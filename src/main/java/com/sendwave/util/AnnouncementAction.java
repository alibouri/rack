package com.sendwave.util;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;
import q9.o;

public final class AnnouncementAction implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;

    static {
        AnnouncementAction.CREATOR = new o(0);
    }

    public AnnouncementAction(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "uriString");
        super();
        this.X = s;
        this.Y = s1;
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
        if(!(object0 instanceof AnnouncementAction)) {
            return false;
        }
        return j.a(this.X, ((AnnouncementAction)object0).X) ? j.a(this.Y, ((AnnouncementAction)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AnnouncementAction(name=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", uriString=");
        return b.y(stringBuilder0, this.Y, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
    }
}

