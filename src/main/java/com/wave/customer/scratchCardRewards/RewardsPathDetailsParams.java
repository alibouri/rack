package com.wave.customer.scratchCardRewards;

import Ea.A;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.wave.customer.scratchCardRewards.components.RewardsPathState;

public final class RewardsPathDetailsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final RewardsPathState X;

    static {
        RewardsPathDetailsParams.CREATOR = new A(0);
    }

    public RewardsPathDetailsParams(RewardsPathState rewardsPathState0) {
        j.f(rewardsPathState0, "state");
        super();
        this.X = rewardsPathState0;
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
        return object0 instanceof RewardsPathDetailsParams ? j.a(this.X, ((RewardsPathDetailsParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return "RewardsPathDetailsParams(state=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        this.X.writeToParcel(parcel0, v);
    }
}

