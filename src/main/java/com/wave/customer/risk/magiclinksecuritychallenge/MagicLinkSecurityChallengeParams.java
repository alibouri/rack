package com.wave.customer.risk.magiclinksecuritychallenge;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import ya.k;

public final class MagicLinkSecurityChallengeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final MagicLinkSecurityChallengeContext X;

    static {
        MagicLinkSecurityChallengeParams.CREATOR = new k();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public MagicLinkSecurityChallengeParams(MagicLinkSecurityChallengeContext magicLinkSecurityChallengeContext0) {
        j.f(magicLinkSecurityChallengeContext0, "context");
        super();
        this.X = magicLinkSecurityChallengeContext0;
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
        return object0 instanceof MagicLinkSecurityChallengeParams ? j.a(this.X, ((MagicLinkSecurityChallengeParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return "MagicLinkSecurityChallengeParams(context=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
    }
}

