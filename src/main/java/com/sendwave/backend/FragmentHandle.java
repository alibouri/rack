package com.sendwave.backend;

import Bb.A;
import Nb.j;
import O3.b;
import Y8.n2;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.apollographql.apollo.api.Executable.Variables;

public final class FragmentHandle implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final ParcelableVariables Y;
    public static final Variables Z;

    static {
        FragmentHandle.CREATOR = new n2(0);
        FragmentHandle.Z = new Variables(A.X);
    }

    public FragmentHandle(b b0, Variables executable$Variables0) {
        j.f(executable$Variables0, "variables");
        ParcelableVariables parcelableVariables0 = new ParcelableVariables(executable$Variables0);
        this(b0.a, parcelableVariables0);
    }

    public FragmentHandle(String s, ParcelableVariables parcelableVariables0) {
        j.f(s, "keyString");
        j.f(parcelableVariables0, "variables");
        super();
        this.X = s;
        this.Y = parcelableVariables0;
    }

    public final b b() {
        return new b(this.X);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof FragmentHandle && j.a(this.X, ((FragmentHandle)object0).X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return "<FragmentHandle cacheKey=" + this.b() + " keyString=" + this.X + ">";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        this.Y.writeToParcel(parcel0, v);
    }
}

