package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface DeviceApprovalStatus extends Parcelable {
    public static final class APPROVED implements DeviceApprovalStatus {
        public static final Parcelable.Creator CREATOR;
        public static final APPROVED X;
        public static final String Y;

        static {
            APPROVED.X = new APPROVED();
            APPROVED.Y = "APPROVED";
            APPROVED.CREATOR = new e0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.DeviceApprovalStatus
        public final String a() {
            return APPROVED.Y;
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

    public static final class DISABLED implements DeviceApprovalStatus {
        public static final Parcelable.Creator CREATOR;
        public static final DISABLED X;
        public static final String Y;

        static {
            DISABLED.X = new DISABLED();
            DISABLED.Y = "DISABLED";
            DISABLED.CREATOR = new g0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.DeviceApprovalStatus
        public final String a() {
            return DISABLED.Y;
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

    public static final class PENDING implements DeviceApprovalStatus {
        public static final Parcelable.Creator CREATOR;
        public static final PENDING X;
        public static final String Y;

        static {
            PENDING.X = new PENDING();
            PENDING.Y = "PENDING";
            PENDING.CREATOR = new h0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.DeviceApprovalStatus
        public final String a() {
            return PENDING.Y;
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

    public static final class REJECTED implements DeviceApprovalStatus {
        public static final Parcelable.Creator CREATOR;
        public static final REJECTED X;
        public static final String Y;

        static {
            REJECTED.X = new REJECTED();
            REJECTED.Y = "REJECTED";
            REJECTED.CREATOR = new i0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.DeviceApprovalStatus
        public final String a() {
            return REJECTED.Y;
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

    public static final class UNKNOWN__ implements DeviceApprovalStatus {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new j0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.DeviceApprovalStatus
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

    public static final f0 r;

    static {
        DeviceApprovalStatus.r = f0.a;
    }

    String a();
}

