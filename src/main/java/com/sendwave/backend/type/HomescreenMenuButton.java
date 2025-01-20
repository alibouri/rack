package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface HomescreenMenuButton extends Parcelable {
    public static final class AIRTIME implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final AIRTIME X;
        public static final String Y;

        static {
            AIRTIME.X = new AIRTIME();
            AIRTIME.Y = "AIRTIME";
            AIRTIME.CREATOR = new k0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return AIRTIME.Y;
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

    public static final class BANK implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final BANK X;
        public static final String Y;

        static {
            BANK.X = new BANK();
            BANK.Y = "BANK";
            BANK.CREATOR = new l0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
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

    public static final class BILLS implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final BILLS X;
        public static final String Y;

        static {
            BILLS.X = new BILLS();
            BILLS.Y = "BILLS";
            BILLS.CREATOR = new m0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return BILLS.Y;
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

    public static final class CARD implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final CARD X;
        public static final String Y;

        static {
            CARD.X = new CARD();
            CARD.Y = "CARD";
            CARD.CREATOR = new n0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
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

    public static final class LEBALMA implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final LEBALMA X;
        public static final String Y;

        static {
            LEBALMA.X = new LEBALMA();
            LEBALMA.Y = "LEBALMA";
            LEBALMA.CREATOR = new p0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return LEBALMA.Y;
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

    public static final class PAYMENTS implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final PAYMENTS X;
        public static final String Y;

        static {
            PAYMENTS.X = new PAYMENTS();
            PAYMENTS.Y = "PAYMENTS";
            PAYMENTS.CREATOR = new q0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return PAYMENTS.Y;
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

    public static final class REWARDS implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final REWARDS X;
        public static final String Y;

        static {
            REWARDS.X = new REWARDS();
            REWARDS.Y = "REWARDS";
            REWARDS.CREATOR = new r0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return REWARDS.Y;
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

    public static final class SEND implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final SEND X;
        public static final String Y;

        static {
            SEND.X = new SEND();
            SEND.Y = "SEND";
            SEND.CREATOR = new s0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return SEND.Y;
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

    public static final class SPI implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final SPI X;
        public static final String Y;

        static {
            SPI.X = new SPI();
            SPI.Y = "SPI";
            SPI.CREATOR = new t0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return SPI.Y;
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

    public static final class TRANSPORT implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final TRANSPORT X;
        public static final String Y;

        static {
            TRANSPORT.X = new TRANSPORT();
            TRANSPORT.Y = "TRANSPORT";
            TRANSPORT.CREATOR = new u0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return TRANSPORT.Y;
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

    public static final class UNKNOWN__ implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new v0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
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

    public static final class VAULT implements HomescreenMenuButton {
        public static final Parcelable.Creator CREATOR;
        public static final VAULT X;
        public static final String Y;

        static {
            VAULT.X = new VAULT();
            VAULT.Y = "VAULT";
            VAULT.CREATOR = new w0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.HomescreenMenuButton
        public final String a() {
            return VAULT.Y;
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

    public static final o0 s;

    static {
        HomescreenMenuButton.s = o0.a;
    }

    String a();
}

