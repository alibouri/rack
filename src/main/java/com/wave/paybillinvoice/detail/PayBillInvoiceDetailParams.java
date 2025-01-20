package com.wave.paybillinvoice.detail;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import java.util.List;

public final class PayBillInvoiceDetailParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final FragmentHandle Y;
    public final FragmentHandle Z;
    public final FragmentHandle b0;
    public final List c0;
    public final ActionSource d0;

    static {
    }

    public PayBillInvoiceDetailParams(String s, FragmentHandle fragmentHandle0, FragmentHandle fragmentHandle1, FragmentHandle fragmentHandle2, List list0, ActionSource actionSource0) {
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

