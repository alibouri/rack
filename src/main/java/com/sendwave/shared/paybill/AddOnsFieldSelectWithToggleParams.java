package com.sendwave.shared.paybill;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import p9.i;

public final class AddOnsFieldSelectWithToggleParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final String[] c0;
    public final boolean[] d0;
    public final conflictingIndices[] e0;

    static {
        AddOnsFieldSelectWithToggleParams.CREATOR = new i(2);
    }

    public AddOnsFieldSelectWithToggleParams(String s, String s1, String s2, String s3, String[] arr_s, boolean[] arr_z, conflictingIndices[] arr_conflictingIndices) {
        j.f(s, "title");
        j.f(s1, "toggleText");
        j.f(s2, "toggleEnabledDescription");
        j.f(s3, "toggleDisabledDescription");
        j.f(arr_s, "displayNames");
        j.f(arr_z, "isSelected");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.b0 = s3;
        this.c0 = arr_s;
        this.d0 = arr_z;
        this.e0 = arr_conflictingIndices;
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
        if(!(object0 instanceof AddOnsFieldSelectWithToggleParams)) {
            return false;
        }
        if(!j.a(this.X, ((AddOnsFieldSelectWithToggleParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((AddOnsFieldSelectWithToggleParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((AddOnsFieldSelectWithToggleParams)object0).Z)) {
            return false;
        }
        if(!j.a(this.b0, ((AddOnsFieldSelectWithToggleParams)object0).b0)) {
            return false;
        }
        if(!j.a(this.c0, ((AddOnsFieldSelectWithToggleParams)object0).c0)) {
            return false;
        }
        return j.a(this.d0, ((AddOnsFieldSelectWithToggleParams)object0).d0) ? j.a(this.e0, ((AddOnsFieldSelectWithToggleParams)object0).e0) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c0);
        int v1 = Arrays.hashCode(this.d0);
        int v2 = Arrays.hashCode(this.e0);
        return (v1 + (e.s(e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z), 0x1F, this.b0) + v) * 0x1F) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c0);
        String s1 = Arrays.toString(this.d0);
        String s2 = Arrays.toString(this.e0);
        return "AddOnsFieldSelectWithToggleParams(title=" + this.X + ", toggleText=" + this.Y + ", toggleEnabledDescription=" + this.Z + ", toggleDisabledDescription=" + this.b0 + ", displayNames=" + s + ", isSelected=" + s1 + ", incompatibleChoices=" + s2 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeString(this.Z);
        parcel0.writeString(this.b0);
        parcel0.writeStringArray(this.c0);
        parcel0.writeBooleanArray(this.d0);
        conflictingIndices[] arr_conflictingIndices = this.e0;
        parcel0.writeInt(arr_conflictingIndices.length);
        for(int v1 = 0; v1 != arr_conflictingIndices.length; ++v1) {
            arr_conflictingIndices[v1].writeToParcel(parcel0, v);
        }
    }
}

