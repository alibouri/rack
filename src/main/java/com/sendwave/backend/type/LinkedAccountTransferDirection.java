package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface LinkedAccountTransferDirection extends Parcelable {
    public static final class FROM_WALLET implements LinkedAccountTransferDirection {
        public static final Parcelable.Creator CREATOR;
        public static final FROM_WALLET X;
        public static final String Y;

        static {
            FROM_WALLET.X = new FROM_WALLET();
            FROM_WALLET.Y = "FROM_WALLET";
            FROM_WALLET.CREATOR = new Y1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountTransferDirection
        public final String a() {
            return FROM_WALLET.Y;
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

    public static final class TO_WALLET implements LinkedAccountTransferDirection {
        public static final Parcelable.Creator CREATOR;
        public static final TO_WALLET X;
        public static final String Y;

        static {
            TO_WALLET.X = new TO_WALLET();
            TO_WALLET.Y = "TO_WALLET";
            TO_WALLET.CREATOR = new Z1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountTransferDirection
        public final String a() {
            return TO_WALLET.Y;
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

    public static final class UNKNOWN__ implements LinkedAccountTransferDirection {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new a2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.LinkedAccountTransferDirection
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

    String a();
}

