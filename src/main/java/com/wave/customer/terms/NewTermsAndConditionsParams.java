package com.wave.customer.terms;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.type.PartnerOrg;

public final class NewTermsAndConditionsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final PartnerOrg X;
    public final PartnerOrg Y;

    static {
    }

    public NewTermsAndConditionsParams(PartnerOrg partnerOrg0, PartnerOrg partnerOrg1) {
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

