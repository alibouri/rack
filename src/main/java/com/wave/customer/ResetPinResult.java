package com.wave.customer;

import Gb.b;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ResetPinResult extends Enum implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final enum ResetPinResult X;
    public static final enum ResetPinResult Y;
    public static final ResetPinResult[] Z;

    static {
        ResetPinResult.X = new ResetPinResult("PIN_VERIFIED", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        ResetPinResult.Y = new ResetPinResult("PIN_RESET_SUCCEEDED", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        ResetPinResult[] arr_resetPinResult = {ResetPinResult.X, ResetPinResult.Y, new ResetPinResult("PIN_RESET_FAILED", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        ResetPinResult.Z = arr_resetPinResult;
        new b(arr_resetPinResult);
        ResetPinResult.CREATOR = new R9.b(15);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static ResetPinResult valueOf(String s) {
        return (ResetPinResult)Enum.valueOf(ResetPinResult.class, s);
    }

    public static ResetPinResult[] values() {
        return (ResetPinResult[])ResetPinResult.Z.clone();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.name());
    }
}

