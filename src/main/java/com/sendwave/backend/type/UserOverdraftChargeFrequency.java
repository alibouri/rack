package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface UserOverdraftChargeFrequency extends Parcelable {
    public static final class DAILY implements UserOverdraftChargeFrequency {
        public static final Parcelable.Creator CREATOR;
        public static final DAILY X;
        public static final String Y;

        static {
            DAILY.X = new DAILY();
            DAILY.Y = "DAILY";
            DAILY.CREATOR = new K5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeFrequency
        public final String a() {
            return DAILY.Y;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeInt(1);
        }
    }

    public static final class MONTHLY implements UserOverdraftChargeFrequency {
        public static final Parcelable.Creator CREATOR;
        public static final MONTHLY X;
        public static final String Y;

        static {
            MONTHLY.X = new MONTHLY();
            MONTHLY.Y = "MONTHLY";
            MONTHLY.CREATOR = new L5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeFrequency
        public final String a() {
            return MONTHLY.Y;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeInt(1);
        }
    }

    public static final class ONLY_ONCE implements UserOverdraftChargeFrequency {
        public static final Parcelable.Creator CREATOR;
        public static final ONLY_ONCE X;
        public static final String Y;

        static {
            ONLY_ONCE.X = new ONLY_ONCE();
            ONLY_ONCE.Y = "ONLY_ONCE";
            ONLY_ONCE.CREATOR = new M5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeFrequency
        public final String a() {
            return ONLY_ONCE.Y;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeInt(1);
        }
    }

    public static final class UNKNOWN__ implements UserOverdraftChargeFrequency {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new N5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeFrequency
        public final String a() {
            return this.X;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof UNKNOWN__ ? j.a(this.X, ((UNKNOWN__)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("UNKNOWN__("), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    public static final class WEEKLY implements UserOverdraftChargeFrequency {
        public static final Parcelable.Creator CREATOR;
        public static final WEEKLY X;
        public static final String Y;

        static {
            WEEKLY.X = new WEEKLY();
            WEEKLY.Y = "WEEKLY";
            WEEKLY.CREATOR = new O5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeFrequency
        public final String a() {
            return WEEKLY.Y;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeInt(1);
        }
    }

    public static final J5 T;

    static {
        UserOverdraftChargeFrequency.T = J5.a;
    }

    String a();
}

