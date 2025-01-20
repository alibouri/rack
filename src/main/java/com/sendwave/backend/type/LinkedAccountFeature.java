package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface LinkedAccountFeature extends Parcelable {
    public static final class TRANSFER_FROM_WALLET implements LinkedAccountFeature {
        public static final Parcelable.Creator CREATOR;
        public static final TRANSFER_FROM_WALLET X;
        public static final String Y;

        static {
            TRANSFER_FROM_WALLET.X = new TRANSFER_FROM_WALLET();
            TRANSFER_FROM_WALLET.Y = "TRANSFER_FROM_WALLET";
            TRANSFER_FROM_WALLET.CREATOR = new L1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountFeature
        public final String a() {
            return TRANSFER_FROM_WALLET.Y;
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

    public static final class TRANSFER_TO_WALLET implements LinkedAccountFeature {
        public static final Parcelable.Creator CREATOR;
        public static final TRANSFER_TO_WALLET X;
        public static final String Y;

        static {
            TRANSFER_TO_WALLET.X = new TRANSFER_TO_WALLET();
            TRANSFER_TO_WALLET.Y = "TRANSFER_TO_WALLET";
            TRANSFER_TO_WALLET.CREATOR = new M1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountFeature
        public final String a() {
            return TRANSFER_TO_WALLET.Y;
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

    public static final class TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT implements LinkedAccountFeature {
        public static final Parcelable.Creator CREATOR;
        public static final TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT X;
        public static final String Y;

        static {
            TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT.X = new TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT();
            TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT.Y = "TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT";
            TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT.CREATOR = new N1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountFeature
        public final String a() {
            return TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT.Y;
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

    public static final class UNKNOWN__ implements LinkedAccountFeature {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new O1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.LinkedAccountFeature
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

    public static final K1 x;

    static {
        LinkedAccountFeature.x = K1.a;
    }

    String a();
}

