package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface TooltipTarget extends Parcelable {
    public static final class CARD_RECHARGE implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final CARD_RECHARGE X;
        public static final String Y;

        static {
            CARD_RECHARGE.X = new CARD_RECHARGE();
            CARD_RECHARGE.Y = "CARD_RECHARGE";
            CARD_RECHARGE.CREATOR = new P4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return CARD_RECHARGE.Y;
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

    public static final class HOME_ACCOUNT_SWITCHER_PILL implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_ACCOUNT_SWITCHER_PILL X;
        public static final String Y;

        static {
            HOME_ACCOUNT_SWITCHER_PILL.X = new HOME_ACCOUNT_SWITCHER_PILL();
            HOME_ACCOUNT_SWITCHER_PILL.Y = "HOME_ACCOUNT_SWITCHER_PILL";
            HOME_ACCOUNT_SWITCHER_PILL.CREATOR = new R4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_ACCOUNT_SWITCHER_PILL.Y;
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

    public static final class HOME_AIRTIME implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_AIRTIME X;
        public static final String Y;

        static {
            HOME_AIRTIME.X = new HOME_AIRTIME();
            HOME_AIRTIME.Y = "HOME_AIRTIME";
            HOME_AIRTIME.CREATOR = new S4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_AIRTIME.Y;
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

    public static final class HOME_BANK implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_BANK X;
        public static final String Y;

        static {
            HOME_BANK.X = new HOME_BANK();
            HOME_BANK.Y = "HOME_BANK";
            HOME_BANK.CREATOR = new T4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_BANK.Y;
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

    public static final class HOME_EXPAND_MORE implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_EXPAND_MORE X;
        public static final String Y;

        static {
            HOME_EXPAND_MORE.X = new HOME_EXPAND_MORE();
            HOME_EXPAND_MORE.Y = "HOME_EXPAND_MORE";
            HOME_EXPAND_MORE.CREATOR = new U4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_EXPAND_MORE.Y;
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

    public static final class HOME_OVERDRAFT implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_OVERDRAFT X;
        public static final String Y;

        static {
            HOME_OVERDRAFT.X = new HOME_OVERDRAFT();
            HOME_OVERDRAFT.Y = "HOME_OVERDRAFT";
            HOME_OVERDRAFT.CREATOR = new V4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_OVERDRAFT.Y;
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

    public static final class HOME_PAYMENTS implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_PAYMENTS X;
        public static final String Y;

        static {
            HOME_PAYMENTS.X = new HOME_PAYMENTS();
            HOME_PAYMENTS.Y = "HOME_PAYMENTS";
            HOME_PAYMENTS.CREATOR = new W4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_PAYMENTS.Y;
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

    public static final class HOME_PAYMENT_CARD implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_PAYMENT_CARD X;
        public static final String Y;

        static {
            HOME_PAYMENT_CARD.X = new HOME_PAYMENT_CARD();
            HOME_PAYMENT_CARD.Y = "HOME_PAYMENT_CARD";
            HOME_PAYMENT_CARD.CREATOR = new X4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_PAYMENT_CARD.Y;
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

    public static final class HOME_REWARDS implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_REWARDS X;
        public static final String Y;

        static {
            HOME_REWARDS.X = new HOME_REWARDS();
            HOME_REWARDS.Y = "HOME_REWARDS";
            HOME_REWARDS.CREATOR = new Y4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_REWARDS.Y;
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

    public static final class HOME_SAVINGS implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_SAVINGS X;
        public static final String Y;

        static {
            HOME_SAVINGS.X = new HOME_SAVINGS();
            HOME_SAVINGS.Y = "HOME_SAVINGS";
            HOME_SAVINGS.CREATOR = new Z4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_SAVINGS.Y;
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

    public static final class HOME_SEND_P2P implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_SEND_P2P X;
        public static final String Y;

        static {
            HOME_SEND_P2P.X = new HOME_SEND_P2P();
            HOME_SEND_P2P.Y = "HOME_SEND_P2P";
            HOME_SEND_P2P.CREATOR = new a5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_SEND_P2P.Y;
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

    public static final class HOME_SETTINGS implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final HOME_SETTINGS X;
        public static final String Y;

        static {
            HOME_SETTINGS.X = new HOME_SETTINGS();
            HOME_SETTINGS.Y = "HOME_SETTINGS";
            HOME_SETTINGS.CREATOR = new b5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return HOME_SETTINGS.Y;
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

    public static final class SEND_SCAN_QR implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final SEND_SCAN_QR X;
        public static final String Y;

        static {
            SEND_SCAN_QR.X = new SEND_SCAN_QR();
            SEND_SCAN_QR.Y = "SEND_SCAN_QR";
            SEND_SCAN_QR.CREATOR = new c5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return SEND_SCAN_QR.Y;
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

    public static final class UNKNOWN__ implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new d5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
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

    public static final class VAULT_LOCK_VAULT implements TooltipTarget {
        public static final Parcelable.Creator CREATOR;
        public static final VAULT_LOCK_VAULT X;
        public static final String Y;

        static {
            VAULT_LOCK_VAULT.X = new VAULT_LOCK_VAULT();
            VAULT_LOCK_VAULT.Y = "VAULT_LOCK_VAULT";
            VAULT_LOCK_VAULT.CREATOR = new e5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.TooltipTarget
        public final String a() {
            return VAULT_LOCK_VAULT.Y;
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

    public static final Q4 P;

    static {
        TooltipTarget.P = Q4.a;
    }

    String a();
}

