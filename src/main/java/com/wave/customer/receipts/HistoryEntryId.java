package com.wave.customer.receipts;

import M.J;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import va.d;

public final class HistoryEntryId implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;

    static {
        HistoryEntryId.CREATOR = new d(0);
    }

    public HistoryEntryId(String s) {
        this.X = s;
    }

    public static String b(String s) {
        return J.e("HistoryEntryId(id=", s, ")");
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof HistoryEntryId && j.a(this.X, ((HistoryEntryId)object0).X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return HistoryEntryId.b(this.X);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
    }
}

