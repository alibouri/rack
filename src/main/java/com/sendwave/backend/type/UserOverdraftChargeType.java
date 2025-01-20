package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface UserOverdraftChargeType extends Parcelable {
    public static final class INTEREST implements UserOverdraftChargeType {
        public static final Parcelable.Creator CREATOR;
        public static final INTEREST X;
        public static final String Y;

        static {
            INTEREST.X = new INTEREST();
            INTEREST.Y = "INTEREST";
            INTEREST.CREATOR = new Q5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeType
        public final String a() {
            return INTEREST.Y;
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

    public static final class LATE_FEE implements UserOverdraftChargeType {
        public static final Parcelable.Creator CREATOR;
        public static final LATE_FEE X;
        public static final String Y;

        static {
            LATE_FEE.X = new LATE_FEE();
            LATE_FEE.Y = "LATE_FEE";
            LATE_FEE.CREATOR = new R5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeType
        public final String a() {
            return LATE_FEE.Y;
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

    public static final class SETUP_FEE implements UserOverdraftChargeType {
        public static final Parcelable.Creator CREATOR;
        public static final SETUP_FEE X;
        public static final String Y;

        static {
            SETUP_FEE.X = new SETUP_FEE();
            SETUP_FEE.Y = "SETUP_FEE";
            SETUP_FEE.CREATOR = new S5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeType
        public final String a() {
            return SETUP_FEE.Y;
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

    public static final class UNKNOWN__ implements UserOverdraftChargeType {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new T5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.UserOverdraftChargeType
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

    public static final P5 U;

    static {
        UserOverdraftChargeType.U = P5.a;
    }

    String a();
}

