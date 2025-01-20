package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import j6.c;
import java.util.ArrayList;

public final class PhotoActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList X;
    public final Boolean Y;

    static {
        PhotoActivityResult.CREATOR = new c(22);
    }

    public PhotoActivityResult(ArrayList arrayList0, Boolean boolean0) {
        j.f(arrayList0, "localUris");
        super();
        this.X = arrayList0;
        this.Y = boolean0;
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
        if(!(object0 instanceof PhotoActivityResult)) {
            return false;
        }
        return j.a(this.X, ((PhotoActivityResult)object0).X) ? j.a(this.Y, ((PhotoActivityResult)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        return this.Y == null ? v * 0x1F : v * 0x1F + this.Y.hashCode();
    }

    @Override
    public final String toString() {
        return "PhotoActivityResult(localUris=" + this.X + ", isBlurry=" + this.Y + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        boolean z;
        j.f(parcel0, "dest");
        parcel0.writeStringList(this.X);
        Boolean boolean0 = this.Y;
        if(boolean0 == null) {
            z = false;
        }
        else {
            parcel0.writeInt(1);
            z = boolean0.booleanValue();
        }
        parcel0.writeInt(((int)z));
    }
}

