package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface SettlementStatus extends Parcelable {
    public static final class ACTIVE implements SettlementStatus {
        public static final Parcelable.Creator CREATOR;
        public static final ACTIVE X;
        public static final String Y;

        static {
            ACTIVE.X = new ACTIVE();
            ACTIVE.Y = "ACTIVE";
            ACTIVE.CREATOR = new K4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementStatus
        public final String a() {
            return ACTIVE.Y;
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

    public static final class CANCELED implements SettlementStatus {
        public static final Parcelable.Creator CREATOR;
        public static final CANCELED X;
        public static final String Y;

        static {
            CANCELED.X = new CANCELED();
            CANCELED.Y = "CANCELED";
            CANCELED.CREATOR = new L4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementStatus
        public final String a() {
            return CANCELED.Y;
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

    public static final class COMPLETED implements SettlementStatus {
        public static final Parcelable.Creator CREATOR;
        public static final COMPLETED X;
        public static final String Y;

        static {
            COMPLETED.X = new COMPLETED();
            COMPLETED.Y = "COMPLETED";
            COMPLETED.CREATOR = new M4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementStatus
        public final String a() {
            return COMPLETED.Y;
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

    public static final class UNKNOWN__ implements SettlementStatus {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new O4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.SettlementStatus
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

    public static final N4 O;

    static {
        SettlementStatus.O = N4.a;
    }

    String a();
}

