package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface ScratchCardIcon extends Parcelable {
    public static final class DEFAULT implements ScratchCardIcon {
        public static final Parcelable.Creator CREATOR;
        public static final DEFAULT X;
        public static final String Y;

        static {
            DEFAULT.X = new DEFAULT();
            DEFAULT.Y = "DEFAULT";
            DEFAULT.CREATOR = new L3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardIcon
        public final String a() {
            return DEFAULT.Y;
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

    public static final class FUEL implements ScratchCardIcon {
        public static final Parcelable.Creator CREATOR;
        public static final FUEL X;
        public static final String Y;

        static {
            FUEL.X = new FUEL();
            FUEL.Y = "FUEL";
            FUEL.CREATOR = new M3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardIcon
        public final String a() {
            return FUEL.Y;
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

    public static final class GROCERY implements ScratchCardIcon {
        public static final Parcelable.Creator CREATOR;
        public static final GROCERY X;
        public static final String Y;

        static {
            GROCERY.X = new GROCERY();
            GROCERY.Y = "GROCERY";
            GROCERY.CREATOR = new N3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardIcon
        public final String a() {
            return GROCERY.Y;
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

    public static final class REFERRAL implements ScratchCardIcon {
        public static final Parcelable.Creator CREATOR;
        public static final REFERRAL X;
        public static final String Y;

        static {
            REFERRAL.X = new REFERRAL();
            REFERRAL.Y = "REFERRAL";
            REFERRAL.CREATOR = new O3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardIcon
        public final String a() {
            return REFERRAL.Y;
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

    public static final class UNKNOWN__ implements ScratchCardIcon {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new P3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.ScratchCardIcon
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

    public static final K3 H;

    static {
        ScratchCardIcon.H = K3.a;
    }

    String a();
}

