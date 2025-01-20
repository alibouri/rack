package com.sendwave.util;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.type.AnnouncementEventType;
import q9.o;

public final class AnnouncementEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final AnnouncementEventType Y;

    static {
        AnnouncementEventData.CREATOR = new o(2);
    }

    public AnnouncementEventData(AnnouncementEventType announcementEventType0, String s) {
        j.f(s, "announcementId");
        j.f(announcementEventType0, "eventType");
        super();
        this.X = s;
        this.Y = announcementEventType0;
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
        if(!(object0 instanceof AnnouncementEventData)) {
            return false;
        }
        return j.a(this.X, ((AnnouncementEventData)object0).X) ? j.a(this.Y, ((AnnouncementEventData)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "AnnouncementEventData(announcementId=" + this.X + ", eventType=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeParcelable(this.Y, v);
    }
}

