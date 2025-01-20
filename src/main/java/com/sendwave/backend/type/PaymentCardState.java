package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface PaymentCardState extends Parcelable {
    public static final class ACTIVATION_FAILED implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public static final ACTIVATION_FAILED X;
        public static final String Y;

        static {
            ACTIVATION_FAILED.X = new ACTIVATION_FAILED();
            ACTIVATION_FAILED.Y = "ACTIVATION_FAILED";
            ACTIVATION_FAILED.CREATOR = new M2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
        public final String a() {
            return ACTIVATION_FAILED.Y;
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

    public static final class ACTIVATION_PENDING implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public static final ACTIVATION_PENDING X;
        public static final String Y;

        static {
            ACTIVATION_PENDING.X = new ACTIVATION_PENDING();
            ACTIVATION_PENDING.Y = "ACTIVATION_PENDING";
            ACTIVATION_PENDING.CREATOR = new N2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
        public final String a() {
            return ACTIVATION_PENDING.Y;
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

    public static final class ACTIVE implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public static final ACTIVE X;
        public static final String Y;

        static {
            ACTIVE.X = new ACTIVE();
            ACTIVE.Y = "ACTIVE";
            ACTIVE.CREATOR = new O2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
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

    public static final class BLOCKED implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public static final BLOCKED X;
        public static final String Y;

        static {
            BLOCKED.X = new BLOCKED();
            BLOCKED.Y = "BLOCKED";
            BLOCKED.CREATOR = new P2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
        public final String a() {
            return BLOCKED.Y;
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

    public static final class CANCELED implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public static final CANCELED X;
        public static final String Y;

        static {
            CANCELED.X = new CANCELED();
            CANCELED.Y = "CANCELED";
            CANCELED.CREATOR = new Q2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
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

    public static final class PAUSED implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public static final PAUSED X;
        public static final String Y;

        static {
            PAUSED.X = new PAUSED();
            PAUSED.Y = "PAUSED";
            PAUSED.CREATOR = new S2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
        public final String a() {
            return PAUSED.Y;
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

    public static final class UNKNOWN__ implements PaymentCardState {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new T2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.PaymentCardState
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

    public static final R2 D;

    static {
        PaymentCardState.D = R2.a;
    }

    String a();
}

