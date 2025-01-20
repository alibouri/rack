package com.wave.voip;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.wave.voip.call.VoipCaller.CallParams;
import pb.n;

public final class VoipCallParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final VoipCaller.CallParams X;
    public final boolean Y;
    public final n Z;

    static {
    }

    public VoipCallParams(VoipCaller.CallParams voipCaller$CallParams0, boolean z, n n0) {
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
    }

    @Override
    public final boolean equals(Object object0) {
    }

    @Override
    public final int hashCode() {
    }

    @Override
    public final String toString() {
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
    }
}

