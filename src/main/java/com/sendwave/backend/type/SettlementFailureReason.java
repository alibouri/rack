package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface SettlementFailureReason extends Parcelable {
    public static final class AGENT_ABSENT implements SettlementFailureReason {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_ABSENT X;
        public static final String Y;

        static {
            AGENT_ABSENT.X = new AGENT_ABSENT();
            AGENT_ABSENT.Y = "AGENT_ABSENT";
            AGENT_ABSENT.CREATOR = new z4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementFailureReason
        public final String a() {
            return AGENT_ABSENT.Y;
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

    public static final class AGENT_REFUSED_TO_SETTLE implements SettlementFailureReason {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_REFUSED_TO_SETTLE X;
        public static final String Y;

        static {
            AGENT_REFUSED_TO_SETTLE.X = new AGENT_REFUSED_TO_SETTLE();
            AGENT_REFUSED_TO_SETTLE.Y = "AGENT_REFUSED_TO_SETTLE";
            AGENT_REFUSED_TO_SETTLE.CREATOR = new A4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementFailureReason
        public final String a() {
            return AGENT_REFUSED_TO_SETTLE.Y;
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

    public static final class NONE implements SettlementFailureReason {
        public static final Parcelable.Creator CREATOR;
        public static final NONE X;
        public static final String Y;

        static {
            NONE.X = new NONE();
            NONE.Y = "NONE";
            NONE.CREATOR = new C4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementFailureReason
        public final String a() {
            return NONE.Y;
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

    public static final class NOT_ENOUGH_LIQUDITY implements SettlementFailureReason {
        public static final Parcelable.Creator CREATOR;
        public static final NOT_ENOUGH_LIQUDITY X;
        public static final String Y;

        static {
            NOT_ENOUGH_LIQUDITY.X = new NOT_ENOUGH_LIQUDITY();
            NOT_ENOUGH_LIQUDITY.Y = "NOT_ENOUGH_LIQUDITY";
            NOT_ENOUGH_LIQUDITY.CREATOR = new D4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SettlementFailureReason
        public final String a() {
            return NOT_ENOUGH_LIQUDITY.Y;
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

    public static final class UNKNOWN__ implements SettlementFailureReason {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new E4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.SettlementFailureReason
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

    public static final B4 M;

    static {
        SettlementFailureReason.M = B4.a;
    }

    String a();
}

