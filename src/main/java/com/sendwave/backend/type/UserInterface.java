package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface UserInterface extends Parcelable {
    public static final class AGENT_PORTAL implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_PORTAL X;
        public static final String Y;

        static {
            AGENT_PORTAL.X = new AGENT_PORTAL();
            AGENT_PORTAL.Y = "AGENT_PORTAL";
            AGENT_PORTAL.CREATOR = new f5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return AGENT_PORTAL.Y;
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

    public static final class API implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final API X;
        public static final String Y;

        static {
            API.X = new API();
            API.Y = "API";
            API.CREATOR = new g5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return API.Y;
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

    public static final class AUTOMATIC implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final AUTOMATIC X;
        public static final String Y;

        static {
            AUTOMATIC.X = new AUTOMATIC();
            AUTOMATIC.Y = "AUTOMATIC";
            AUTOMATIC.CREATOR = new h5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return AUTOMATIC.Y;
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

    public static final class BUSINESS_PORTAL implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final BUSINESS_PORTAL X;
        public static final String Y;

        static {
            BUSINESS_PORTAL.X = new BUSINESS_PORTAL();
            BUSINESS_PORTAL.Y = "BUSINESS_PORTAL";
            BUSINESS_PORTAL.CREATOR = new i5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return BUSINESS_PORTAL.Y;
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

    public static final class CUSTOMER_APP_IOS implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final CUSTOMER_APP_IOS X;
        public static final String Y;

        static {
            CUSTOMER_APP_IOS.X = new CUSTOMER_APP_IOS();
            CUSTOMER_APP_IOS.Y = "CUSTOMER_APP_IOS";
            CUSTOMER_APP_IOS.CREATOR = new j5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return CUSTOMER_APP_IOS.Y;
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

    public static final class DISTRIBUTOR_APP implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final DISTRIBUTOR_APP X;
        public static final String Y;

        static {
            DISTRIBUTOR_APP.X = new DISTRIBUTOR_APP();
            DISTRIBUTOR_APP.Y = "DISTRIBUTOR_APP";
            DISTRIBUTOR_APP.CREATOR = new l5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return DISTRIBUTOR_APP.Y;
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

    public static final class FRONTAPP implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final FRONTAPP X;
        public static final String Y;

        static {
            FRONTAPP.X = new FRONTAPP();
            FRONTAPP.Y = "FRONTAPP";
            FRONTAPP.CREATOR = new m5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return FRONTAPP.Y;
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

    public static final class INTEGRATIONS_RECONCILIATION_PORTAL implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final INTEGRATIONS_RECONCILIATION_PORTAL X;
        public static final String Y;

        static {
            INTEGRATIONS_RECONCILIATION_PORTAL.X = new INTEGRATIONS_RECONCILIATION_PORTAL();
            INTEGRATIONS_RECONCILIATION_PORTAL.Y = "INTEGRATIONS_RECONCILIATION_PORTAL";
            INTEGRATIONS_RECONCILIATION_PORTAL.CREATOR = new n5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return INTEGRATIONS_RECONCILIATION_PORTAL.Y;
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

    public static final class KIOSK_NFC implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final KIOSK_NFC X;
        public static final String Y;

        static {
            KIOSK_NFC.X = new KIOSK_NFC();
            KIOSK_NFC.Y = "KIOSK_NFC";
            KIOSK_NFC.CREATOR = new o5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return KIOSK_NFC.Y;
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

    public static final class KIOSK_QR implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final KIOSK_QR X;
        public static final String Y;

        static {
            KIOSK_QR.X = new KIOSK_QR();
            KIOSK_QR.Y = "KIOSK_QR";
            KIOSK_QR.CREATOR = new p5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return KIOSK_QR.Y;
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

    public static final class MERCHANT_QR implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final MERCHANT_QR X;
        public static final String Y;

        static {
            MERCHANT_QR.X = new MERCHANT_QR();
            MERCHANT_QR.Y = "MERCHANT_QR";
            MERCHANT_QR.CREATOR = new q5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return MERCHANT_QR.Y;
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

    public static final class MERCHANT_QR_API implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final MERCHANT_QR_API X;
        public static final String Y;

        static {
            MERCHANT_QR_API.X = new MERCHANT_QR_API();
            MERCHANT_QR_API.Y = "MERCHANT_QR_API";
            MERCHANT_QR_API.CREATOR = new r5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
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

    public static final class REBALANCE_API implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final REBALANCE_API X;
        public static final String Y;

        static {
            REBALANCE_API.X = new REBALANCE_API();
            REBALANCE_API.Y = "REBALANCE_API";
            REBALANCE_API.CREATOR = new s5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return REBALANCE_API.Y;
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

    public static final class SLACK_TOOL implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final SLACK_TOOL X;
        public static final String Y;

        static {
            SLACK_TOOL.X = new SLACK_TOOL();
            SLACK_TOOL.Y = "SLACK_TOOL";
            SLACK_TOOL.CREATOR = new t5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return SLACK_TOOL.Y;
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

    public static final class SMARTPHONE_APP implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final SMARTPHONE_APP X;
        public static final String Y;

        static {
            SMARTPHONE_APP.X = new SMARTPHONE_APP();
            SMARTPHONE_APP.Y = "SMARTPHONE_APP";
            SMARTPHONE_APP.CREATOR = new u5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return SMARTPHONE_APP.Y;
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

    public static final class TREASURY_APP implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final TREASURY_APP X;
        public static final String Y;

        static {
            TREASURY_APP.X = new TREASURY_APP();
            TREASURY_APP.Y = "TREASURY_APP";
            TREASURY_APP.CREATOR = new v5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return TREASURY_APP.Y;
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

    public static final class UNKNOWN__ implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new w5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.UserInterface
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

    public static final class USSD implements UserInterface {
        public static final Parcelable.Creator CREATOR;
        public static final USSD X;
        public static final String Y;

        static {
            USSD.X = new USSD();
            USSD.Y = "USSD";
            USSD.CREATOR = new x5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserInterface
        public final String a() {
            return USSD.Y;
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

    public static final k5 Q;

    static {
        UserInterface.Q = k5.a;
    }

    String a();
}

