package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface SecurityQuestionFormContent extends Parcelable {
    public static final class AGENT_PHOTO_ID_CHECK_KYC1 implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_PHOTO_ID_CHECK_KYC1 X;
        public static final String Y;

        static {
            AGENT_PHOTO_ID_CHECK_KYC1.X = new AGENT_PHOTO_ID_CHECK_KYC1();
            AGENT_PHOTO_ID_CHECK_KYC1.Y = "AGENT_PHOTO_ID_CHECK_KYC1";
            AGENT_PHOTO_ID_CHECK_KYC1.CREATOR = new i4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return AGENT_PHOTO_ID_CHECK_KYC1.Y;
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

    public static final class AGENT_PHOTO_ID_CHECK_KYC2 implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_PHOTO_ID_CHECK_KYC2 X;
        public static final String Y;

        static {
            AGENT_PHOTO_ID_CHECK_KYC2.X = new AGENT_PHOTO_ID_CHECK_KYC2();
            AGENT_PHOTO_ID_CHECK_KYC2.Y = "AGENT_PHOTO_ID_CHECK_KYC2";
            AGENT_PHOTO_ID_CHECK_KYC2.CREATOR = new j4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return AGENT_PHOTO_ID_CHECK_KYC2.Y;
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

    public static final class KIOSK_PHOTO_ID_CHECK implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final KIOSK_PHOTO_ID_CHECK X;
        public static final String Y;

        static {
            KIOSK_PHOTO_ID_CHECK.X = new KIOSK_PHOTO_ID_CHECK();
            KIOSK_PHOTO_ID_CHECK.Y = "KIOSK_PHOTO_ID_CHECK";
            KIOSK_PHOTO_ID_CHECK.CREATOR = new l4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return KIOSK_PHOTO_ID_CHECK.Y;
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

    public static final class MAGIC_LINK implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final MAGIC_LINK X;
        public static final String Y;

        static {
            MAGIC_LINK.X = new MAGIC_LINK();
            MAGIC_LINK.Y = "MAGIC_LINK";
            MAGIC_LINK.CREATOR = new m4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return MAGIC_LINK.Y;
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

    public static final class SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2 implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2 X;
        public static final String Y;

        static {
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2.X = new SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2();
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2.Y = "SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2";
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2.CREATOR = new n4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2.Y;
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

    public static final class SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1 implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1 X;
        public static final String Y;

        static {
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1.X = new SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1();
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1.Y = "SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1";
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1.CREATOR = new o4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1.Y;
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

    public static final class SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2 implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2 X;
        public static final String Y;

        static {
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2.X = new SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2();
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2.Y = "SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2";
            SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2.CREATOR = new p4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2.Y;
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

    public static final class SUPPORT_IDENTITY_VERIFICATION implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final SUPPORT_IDENTITY_VERIFICATION X;
        public static final String Y;

        static {
            SUPPORT_IDENTITY_VERIFICATION.X = new SUPPORT_IDENTITY_VERIFICATION();
            SUPPORT_IDENTITY_VERIFICATION.Y = "SUPPORT_IDENTITY_VERIFICATION";
            SUPPORT_IDENTITY_VERIFICATION.CREATOR = new q4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return SUPPORT_IDENTITY_VERIFICATION.Y;
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

    public static final class UNKNOWN__ implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new r4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
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

    public static final class USER_IDENTITY_VERIFICATION implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final USER_IDENTITY_VERIFICATION X;
        public static final String Y;

        static {
            USER_IDENTITY_VERIFICATION.X = new USER_IDENTITY_VERIFICATION();
            USER_IDENTITY_VERIFICATION.Y = "USER_IDENTITY_VERIFICATION";
            USER_IDENTITY_VERIFICATION.CREATOR = new s4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return USER_IDENTITY_VERIFICATION.Y;
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

    public static final class USER_USSD_VERIFICATION implements SecurityQuestionFormContent {
        public static final Parcelable.Creator CREATOR;
        public static final USER_USSD_VERIFICATION X;
        public static final String Y;

        static {
            USER_USSD_VERIFICATION.X = new USER_USSD_VERIFICATION();
            USER_USSD_VERIFICATION.Y = "USER_USSD_VERIFICATION";
            USER_USSD_VERIFICATION.CREATOR = new t4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormContent
        public final String a() {
            return USER_USSD_VERIFICATION.Y;
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

    public static final k4 K;

    static {
        SecurityQuestionFormContent.K = k4.a;
    }

    String a();
}

