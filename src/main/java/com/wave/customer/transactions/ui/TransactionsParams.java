package com.wave.customer.transactions.ui;

import Qa.e;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public final class TransactionsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final PartnerOrg X;
    public final int Y;
    public final FragmentHandle Z;
    public e b0;
    public final boolean c0;
    public final boolean d0;

    static {
    }

    public TransactionsParams(PartnerOrg partnerOrg0, int v, FragmentHandle fragmentHandle0, e e0, boolean z, boolean z1) {
    }

    public static TransactionsParams b(TransactionsParams transactionsParams0, e e0) {
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

