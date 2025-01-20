package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface WalletType extends Parcelable {
    public static final class AGENT implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT X;
        public static final String Y;

        static {
            AGENT.X = new AGENT();
            AGENT.Y = "AGENT";
            AGENT.CREATOR = new Y5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return AGENT.Y;
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

    public static final class BUSINESS implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final BUSINESS X;
        public static final String Y;

        static {
            BUSINESS.X = new BUSINESS();
            BUSINESS.Y = "BUSINESS";
            BUSINESS.CREATOR = new Z5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return BUSINESS.Y;
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

    public static final class CREDIT implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final CREDIT X;
        public static final String Y;

        static {
            CREDIT.X = new CREDIT();
            CREDIT.Y = "CREDIT";
            CREDIT.CREATOR = new a6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return CREDIT.Y;
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

    public static final class INTEROP implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final INTEROP X;
        public static final String Y;

        static {
            INTEROP.X = new INTEROP();
            INTEROP.Y = "INTEROP";
            INTEROP.CREATOR = new c6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return INTEROP.Y;
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

    public static final class OVERDRAFT_CHARGES implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final OVERDRAFT_CHARGES X;
        public static final String Y;

        static {
            OVERDRAFT_CHARGES.X = new OVERDRAFT_CHARGES();
            OVERDRAFT_CHARGES.Y = "OVERDRAFT_CHARGES";
            OVERDRAFT_CHARGES.CREATOR = new d6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return OVERDRAFT_CHARGES.Y;
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

    public static final class OVERDRAFT_PRINCIPAL implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final OVERDRAFT_PRINCIPAL X;
        public static final String Y;

        static {
            OVERDRAFT_PRINCIPAL.X = new OVERDRAFT_PRINCIPAL();
            OVERDRAFT_PRINCIPAL.Y = "OVERDRAFT_PRINCIPAL";
            OVERDRAFT_PRINCIPAL.CREATOR = new e6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return OVERDRAFT_PRINCIPAL.Y;
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

    public static final class PAYMENT_CARD implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final PAYMENT_CARD X;
        public static final String Y;

        static {
            PAYMENT_CARD.X = new PAYMENT_CARD();
            PAYMENT_CARD.Y = "PAYMENT_CARD";
            PAYMENT_CARD.CREATOR = new f6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return PAYMENT_CARD.Y;
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

    public static final class PERSONAL implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final PERSONAL X;
        public static final String Y;

        static {
            PERSONAL.X = new PERSONAL();
            PERSONAL.Y = "PERSONAL";
            PERSONAL.CREATOR = new g6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return PERSONAL.Y;
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

    public static final class PROMO implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final PROMO X;
        public static final String Y;

        static {
            PROMO.X = new PROMO();
            PROMO.Y = "PROMO";
            PROMO.CREATOR = new h6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return PROMO.Y;
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

    public static final class SAVINGS implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public static final SAVINGS X;
        public static final String Y;

        static {
            SAVINGS.X = new SAVINGS();
            SAVINGS.Y = "SAVINGS";
            SAVINGS.CREATOR = new i6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.WalletType
        public final String a() {
            return SAVINGS.Y;
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

    public static final class UNKNOWN__ implements WalletType {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new j6();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.WalletType
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

    public static final b6 W;

    static {
        WalletType.W = b6.a;
    }

    String a();
}

