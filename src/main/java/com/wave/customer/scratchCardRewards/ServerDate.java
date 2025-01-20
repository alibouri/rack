package com.wave.customer.scratchCardRewards;

import Ea.A;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Date;

public final class ServerDate implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final Date X;

    static {
        ServerDate.CREATOR = new A(5);
    }

    public ServerDate(Date date0) {
        j.f(date0, "serverDate");
        super();
        this.X = date0;
    }

    @Override
    public final int compareTo(Object object0) {
        j.f(((ServerDate)object0), "other");
        return this.X.compareTo(((ServerDate)object0).X);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeSerializable(this.X);
    }
}

