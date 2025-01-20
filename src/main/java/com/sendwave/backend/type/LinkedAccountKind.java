package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface LinkedAccountKind extends Parcelable {
    public static final class BANK implements LinkedAccountKind {
        public static final Parcelable.Creator CREATOR;
        public static final BANK X;
        public static final String Y;

        static {
            BANK.X = new BANK();
            BANK.Y = "BANK";
            BANK.CREATOR = new P1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountKind
        public final String a() {
            return BANK.Y;
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

    public static final class CARD implements LinkedAccountKind {
        public static final Parcelable.Creator CREATOR;
        public static final CARD X;
        public static final String Y;

        static {
            CARD.X = new CARD();
            CARD.Y = "CARD";
            CARD.CREATOR = new Q1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountKind
        public final String a() {
            return CARD.Y;
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

    public static final class MFI implements LinkedAccountKind {
        public static final Parcelable.Creator CREATOR;
        public static final MFI X;
        public static final String Y;

        static {
            MFI.X = new MFI();
            MFI.Y = "MFI";
            MFI.CREATOR = new S1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountKind
        public final String a() {
            return MFI.Y;
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

    public static final class UNKNOWN__ implements LinkedAccountKind {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new T1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.LinkedAccountKind
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

    public static final R1 y;

    static {
        LinkedAccountKind.y = R1.a;
    }

    String a();
}

