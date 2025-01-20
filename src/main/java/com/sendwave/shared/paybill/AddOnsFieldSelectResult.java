package com.sendwave.shared.paybill;

import M.J;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import p9.i;

public final class AddOnsFieldSelectResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean[] X;

    static {
        AddOnsFieldSelectResult.CREATOR = new i(1);
    }

    public AddOnsFieldSelectResult(boolean[] arr_z) {
        j.f(arr_z, "selectedAddOns");
        super();
        this.X = arr_z;
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
        return object0 instanceof AddOnsFieldSelectResult ? j.a(this.X, ((AddOnsFieldSelectResult)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.X);
    }

    @Override
    public final String toString() {
        return J.e("AddOnsFieldSelectResult(selectedAddOns=", Arrays.toString(this.X), ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeBooleanArray(this.X);
    }
}

