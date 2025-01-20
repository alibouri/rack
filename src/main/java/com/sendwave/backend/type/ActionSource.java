package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public interface ActionSource extends Parcelable {
    public static final class ANNOUNCEMENT implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final ANNOUNCEMENT X;
        public static final String Y;

        static {
            ANNOUNCEMENT.X = new ANNOUNCEMENT();
            ANNOUNCEMENT.Y = "ANNOUNCEMENT";
            ANNOUNCEMENT.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return ANNOUNCEMENT.Y;
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

    public static final class B2B_PAYER_SCAN implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final B2B_PAYER_SCAN X;
        public static final String Y;

        static {
            B2B_PAYER_SCAN.X = new B2B_PAYER_SCAN();
            B2B_PAYER_SCAN.Y = "B2B_PAYER_SCAN";
            B2B_PAYER_SCAN.CREATOR = new b();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return B2B_PAYER_SCAN.Y;
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

    public static final class B2B_RECEIVER_SCAN implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final B2B_RECEIVER_SCAN X;
        public static final String Y;

        static {
            B2B_RECEIVER_SCAN.X = new B2B_RECEIVER_SCAN();
            B2B_RECEIVER_SCAN.Y = "B2B_RECEIVER_SCAN";
            B2B_RECEIVER_SCAN.CREATOR = new c();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return B2B_RECEIVER_SCAN.Y;
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

    public static final class BUSINESS_SEARCH implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final BUSINESS_SEARCH X;
        public static final String Y;

        static {
            BUSINESS_SEARCH.X = new BUSINESS_SEARCH();
            BUSINESS_SEARCH.Y = "BUSINESS_SEARCH";
            BUSINESS_SEARCH.CREATOR = new d();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return BUSINESS_SEARCH.Y;
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

    public static final class CHECKOUT_API implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final CHECKOUT_API X;
        public static final String Y;

        static {
            CHECKOUT_API.X = new CHECKOUT_API();
            CHECKOUT_API.Y = "CHECKOUT_API";
            CHECKOUT_API.CREATOR = new e();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return CHECKOUT_API.Y;
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

    public static final class CONTACT_SEARCH implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final CONTACT_SEARCH X;
        public static final String Y;

        static {
            CONTACT_SEARCH.X = new CONTACT_SEARCH();
            CONTACT_SEARCH.Y = "CONTACT_SEARCH";
            CONTACT_SEARCH.CREATOR = new f();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return CONTACT_SEARCH.Y;
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

    public static final class ENTER_DETAILS implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final ENTER_DETAILS X;
        public static final String Y;

        static {
            ENTER_DETAILS.X = new ENTER_DETAILS();
            ENTER_DETAILS.Y = "ENTER_DETAILS";
            ENTER_DETAILS.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return ENTER_DETAILS.Y;
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

    public static final class MERCHANT_QR_API implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final MERCHANT_QR_API X;
        public static final String Y;

        static {
            MERCHANT_QR_API.X = new MERCHANT_QR_API();
            MERCHANT_QR_API.Y = "MERCHANT_QR_API";
            MERCHANT_QR_API.CREATOR = new i();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return MERCHANT_QR_API.Y;
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

    public static final class MERCHANT_SCAN implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final MERCHANT_SCAN X;
        public static final String Y;

        static {
            MERCHANT_SCAN.X = new MERCHANT_SCAN();
            MERCHANT_SCAN.Y = "MERCHANT_SCAN";
            MERCHANT_SCAN.CREATOR = new com.sendwave.backend.type.j();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return MERCHANT_SCAN.Y;
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

    public static final class PAYMENT_LINK implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final PAYMENT_LINK X;
        public static final String Y;

        static {
            PAYMENT_LINK.X = new PAYMENT_LINK();
            PAYMENT_LINK.Y = "PAYMENT_LINK";
            PAYMENT_LINK.CREATOR = new k();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return PAYMENT_LINK.Y;
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

    public static final class RAPIDSCAN implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final RAPIDSCAN X;
        public static final String Y;

        static {
            RAPIDSCAN.X = new RAPIDSCAN();
            RAPIDSCAN.Y = "RAPIDSCAN";
            RAPIDSCAN.CREATOR = new l();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return RAPIDSCAN.Y;
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

    public static final class SCAN_QR implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final SCAN_QR X;
        public static final String Y;

        static {
            SCAN_QR.X = new SCAN_QR();
            SCAN_QR.Y = "SCAN_QR";
            SCAN_QR.CREATOR = new m();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return SCAN_QR.Y;
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

    public static final class SCAN_QR_SEND_SCREEN implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public static final SCAN_QR_SEND_SCREEN X;
        public static final String Y;

        static {
            SCAN_QR_SEND_SCREEN.X = new SCAN_QR_SEND_SCREEN();
            SCAN_QR_SEND_SCREEN.Y = "SCAN_QR_SEND_SCREEN";
            SCAN_QR_SEND_SCREEN.CREATOR = new n();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ActionSource
        public final String a() {
            return SCAN_QR_SEND_SCREEN.Y;
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

    public static final class UNKNOWN__ implements ActionSource {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new o();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.ActionSource
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
            return m5.b.y(new StringBuilder("UNKNOWN__("), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    public static final g m;

    static {
        ActionSource.m = g.a;
    }

    String a();
}

