package com.wave.customer.scratchCardRewards;

import Ea.A;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import m5.b;

public final class ScratchCard.Award.CustomAward implements ScratchCard.Award.Known {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;

    static {
        ScratchCard.Award.CustomAward.CREATOR = new A(2);
    }

    public ScratchCard.Award.CustomAward(String s, String s1) {
        j.f(s, "text");
        j.f(s1, "imageUrl");
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
        if(!(object0 instanceof ScratchCard.Award.CustomAward)) {
            return false;
        }
        return j.a(this.X, ((ScratchCard.Award.CustomAward)object0).X) ? j.a(this.Y, ((ScratchCard.Award.CustomAward)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CustomAward(text=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", imageUrl=");
        return b.y(stringBuilder0, this.Y, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
    }
}

