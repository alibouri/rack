package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface SecurityQuestionFieldQuery extends Parcelable {
    public static final class CALL_SUPPORT_FROM_VERIFIED_MOBILE implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final CALL_SUPPORT_FROM_VERIFIED_MOBILE X;
        public static final String Y;

        static {
            CALL_SUPPORT_FROM_VERIFIED_MOBILE.X = new CALL_SUPPORT_FROM_VERIFIED_MOBILE();
            CALL_SUPPORT_FROM_VERIFIED_MOBILE.Y = "CALL_SUPPORT_FROM_VERIFIED_MOBILE";
            CALL_SUPPORT_FROM_VERIFIED_MOBILE.CREATOR = new U3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return CALL_SUPPORT_FROM_VERIFIED_MOBILE.Y;
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

    public static final class CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE X;
        public static final String Y;

        static {
            CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE.X = new CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE();
            CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE.Y = "CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE";
            CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE.CREATOR = new V3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE.Y;
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

    public static final class CURRENT_ATTEMPTED_TRANSACTION_DETAILS implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final CURRENT_ATTEMPTED_TRANSACTION_DETAILS X;
        public static final String Y;

        static {
            CURRENT_ATTEMPTED_TRANSACTION_DETAILS.X = new CURRENT_ATTEMPTED_TRANSACTION_DETAILS();
            CURRENT_ATTEMPTED_TRANSACTION_DETAILS.Y = "CURRENT_ATTEMPTED_TRANSACTION_DETAILS";
            CURRENT_ATTEMPTED_TRANSACTION_DETAILS.CREATOR = new W3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return CURRENT_ATTEMPTED_TRANSACTION_DETAILS.Y;
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

    public static final class DATE_OF_BIRTH implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final DATE_OF_BIRTH X;
        public static final String Y;

        static {
            DATE_OF_BIRTH.X = new DATE_OF_BIRTH();
            DATE_OF_BIRTH.Y = "DATE_OF_BIRTH";
            DATE_OF_BIRTH.CREATOR = new Y3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return DATE_OF_BIRTH.Y;
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

    public static final class DOC_NUMBER_LAST_4 implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final DOC_NUMBER_LAST_4 X;
        public static final String Y;

        static {
            DOC_NUMBER_LAST_4.X = new DOC_NUMBER_LAST_4();
            DOC_NUMBER_LAST_4.Y = "DOC_NUMBER_LAST_4";
            DOC_NUMBER_LAST_4.CREATOR = new Z3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return DOC_NUMBER_LAST_4.Y;
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

    public static final class FIRST_NAME implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final FIRST_NAME X;
        public static final String Y;

        static {
            FIRST_NAME.X = new FIRST_NAME();
            FIRST_NAME.Y = "FIRST_NAME";
            FIRST_NAME.CREATOR = new a4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return FIRST_NAME.Y;
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

    public static final class LAST_ATX_LOCATION implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final LAST_ATX_LOCATION X;
        public static final String Y;

        static {
            LAST_ATX_LOCATION.X = new LAST_ATX_LOCATION();
            LAST_ATX_LOCATION.Y = "LAST_ATX_LOCATION";
            LAST_ATX_LOCATION.CREATOR = new b4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return LAST_ATX_LOCATION.Y;
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

    public static final class LAST_NAME implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final LAST_NAME X;
        public static final String Y;

        static {
            LAST_NAME.X = new LAST_NAME();
            LAST_NAME.Y = "LAST_NAME";
            LAST_NAME.CREATOR = new c4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return LAST_NAME.Y;
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

    public static final class LAST_P2P_SENT_DATE implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final LAST_P2P_SENT_DATE X;
        public static final String Y;

        static {
            LAST_P2P_SENT_DATE.X = new LAST_P2P_SENT_DATE();
            LAST_P2P_SENT_DATE.Y = "LAST_P2P_SENT_DATE";
            LAST_P2P_SENT_DATE.CREATOR = new d4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return LAST_P2P_SENT_DATE.Y;
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

    public static final class LAST_P2P_SENT_RECIPIENT_NAME implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final LAST_P2P_SENT_RECIPIENT_NAME X;
        public static final String Y;

        static {
            LAST_P2P_SENT_RECIPIENT_NAME.X = new LAST_P2P_SENT_RECIPIENT_NAME();
            LAST_P2P_SENT_RECIPIENT_NAME.Y = "LAST_P2P_SENT_RECIPIENT_NAME";
            LAST_P2P_SENT_RECIPIENT_NAME.CREATOR = new e4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return LAST_P2P_SENT_RECIPIENT_NAME.Y;
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

    public static final class MAGIC_LINK_SECRET implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final MAGIC_LINK_SECRET X;
        public static final String Y;

        static {
            MAGIC_LINK_SECRET.X = new MAGIC_LINK_SECRET();
            MAGIC_LINK_SECRET.Y = "MAGIC_LINK_SECRET";
            MAGIC_LINK_SECRET.CREATOR = new f4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return MAGIC_LINK_SECRET.Y;
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

    public static final class UNKNOWN__ implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new g4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
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

    public static final class USSD_CHALLENGE_CODE implements SecurityQuestionFieldQuery {
        public static final Parcelable.Creator CREATOR;
        public static final USSD_CHALLENGE_CODE X;
        public static final String Y;

        static {
            USSD_CHALLENGE_CODE.X = new USSD_CHALLENGE_CODE();
            USSD_CHALLENGE_CODE.Y = "USSD_CHALLENGE_CODE";
            USSD_CHALLENGE_CODE.CREATOR = new h4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldQuery
        public final String a() {
            return USSD_CHALLENGE_CODE.Y;
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

    public static final X3 J;

    static {
        SecurityQuestionFieldQuery.J = X3.a;
    }

    String a();
}

