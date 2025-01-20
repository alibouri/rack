package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface IdPhotoType extends Parcelable {
    public static final class AGENT_COMMISSIONS_INVOICE_2020 implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_COMMISSIONS_INVOICE_2020 X;
        public static final String Y;

        static {
            AGENT_COMMISSIONS_INVOICE_2020.X = new AGENT_COMMISSIONS_INVOICE_2020();
            AGENT_COMMISSIONS_INVOICE_2020.Y = "AGENT_COMMISSIONS_INVOICE_2020";
            AGENT_COMMISSIONS_INVOICE_2020.CREATOR = new H0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return AGENT_COMMISSIONS_INVOICE_2020.Y;
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

    public static final class AGENT_COMMISSIONS_INVOICE_2021 implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_COMMISSIONS_INVOICE_2021 X;
        public static final String Y;

        static {
            AGENT_COMMISSIONS_INVOICE_2021.X = new AGENT_COMMISSIONS_INVOICE_2021();
            AGENT_COMMISSIONS_INVOICE_2021.Y = "AGENT_COMMISSIONS_INVOICE_2021";
            AGENT_COMMISSIONS_INVOICE_2021.CREATOR = new I0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return AGENT_COMMISSIONS_INVOICE_2021.Y;
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

    public static final class AGENT_OVERDRAFT_TERMS implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final AGENT_OVERDRAFT_TERMS X;
        public static final String Y;

        static {
            AGENT_OVERDRAFT_TERMS.X = new AGENT_OVERDRAFT_TERMS();
            AGENT_OVERDRAFT_TERMS.Y = "AGENT_OVERDRAFT_TERMS";
            AGENT_OVERDRAFT_TERMS.CREATOR = new J0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return AGENT_OVERDRAFT_TERMS.Y;
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

    public static final class AML_TRAINING_CERTIFICATE implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final AML_TRAINING_CERTIFICATE X;
        public static final String Y;

        static {
            AML_TRAINING_CERTIFICATE.X = new AML_TRAINING_CERTIFICATE();
            AML_TRAINING_CERTIFICATE.Y = "AML_TRAINING_CERTIFICATE";
            AML_TRAINING_CERTIFICATE.CREATOR = new K0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return AML_TRAINING_CERTIFICATE.Y;
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

    public static final class BENEFICIAL_OWNER_DOCS implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final BENEFICIAL_OWNER_DOCS X;
        public static final String Y;

        static {
            BENEFICIAL_OWNER_DOCS.X = new BENEFICIAL_OWNER_DOCS();
            BENEFICIAL_OWNER_DOCS.Y = "BENEFICIAL_OWNER_DOCS";
            BENEFICIAL_OWNER_DOCS.CREATOR = new L0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return BENEFICIAL_OWNER_DOCS.Y;
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

    public static final class BENEFICIAL_OWNER_IDS implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final BENEFICIAL_OWNER_IDS X;
        public static final String Y;

        static {
            BENEFICIAL_OWNER_IDS.X = new BENEFICIAL_OWNER_IDS();
            BENEFICIAL_OWNER_IDS.Y = "BENEFICIAL_OWNER_IDS";
            BENEFICIAL_OWNER_IDS.CREATOR = new M0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return BENEFICIAL_OWNER_IDS.Y;
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

    public static final class BIZ_ID implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final BIZ_ID X;
        public static final String Y;

        static {
            BIZ_ID.X = new BIZ_ID();
            BIZ_ID.Y = "BIZ_ID";
            BIZ_ID.CREATOR = new N0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return BIZ_ID.Y;
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

    public static final class BIZ_REGISTRATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final BIZ_REGISTRATION X;
        public static final String Y;

        static {
            BIZ_REGISTRATION.X = new BIZ_REGISTRATION();
            BIZ_REGISTRATION.Y = "BIZ_REGISTRATION";
            BIZ_REGISTRATION.CREATOR = new O0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return BIZ_REGISTRATION.Y;
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

    public static final class CODE_OF_CONDUCT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final CODE_OF_CONDUCT X;
        public static final String Y;

        static {
            CODE_OF_CONDUCT.X = new CODE_OF_CONDUCT();
            CODE_OF_CONDUCT.Y = "CODE_OF_CONDUCT";
            CODE_OF_CONDUCT.CREATOR = new P0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return CODE_OF_CONDUCT.Y;
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

    public static final class CRIMINAL_RECORD implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final CRIMINAL_RECORD X;
        public static final String Y;

        static {
            CRIMINAL_RECORD.X = new CRIMINAL_RECORD();
            CRIMINAL_RECORD.Y = "CRIMINAL_RECORD";
            CRIMINAL_RECORD.CREATOR = new Q0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return CRIMINAL_RECORD.Y;
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

    public static final class DELEGATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final DELEGATION X;
        public static final String Y;

        static {
            DELEGATION.X = new DELEGATION();
            DELEGATION.Y = "DELEGATION";
            DELEGATION.CREATOR = new S0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return DELEGATION.Y;
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

    public static final class DRIVERS_LICENSE implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final DRIVERS_LICENSE X;
        public static final String Y;

        static {
            DRIVERS_LICENSE.X = new DRIVERS_LICENSE();
            DRIVERS_LICENSE.Y = "DRIVERS_LICENSE";
            DRIVERS_LICENSE.CREATOR = new T0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return DRIVERS_LICENSE.Y;
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

    public static final class DRIVERS_LICENSE_BACK implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final DRIVERS_LICENSE_BACK X;
        public static final String Y;

        static {
            DRIVERS_LICENSE_BACK.X = new DRIVERS_LICENSE_BACK();
            DRIVERS_LICENSE_BACK.Y = "DRIVERS_LICENSE_BACK";
            DRIVERS_LICENSE_BACK.CREATOR = new U0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return DRIVERS_LICENSE_BACK.Y;
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

    public static final class ECOBANK_TERMINATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final ECOBANK_TERMINATION X;
        public static final String Y;

        static {
            ECOBANK_TERMINATION.X = new ECOBANK_TERMINATION();
            ECOBANK_TERMINATION.Y = "ECOBANK_TERMINATION";
            ECOBANK_TERMINATION.CREATOR = new V0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return ECOBANK_TERMINATION.Y;
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

    public static final class FACE_PHOTO implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final FACE_PHOTO X;
        public static final String Y;

        static {
            FACE_PHOTO.X = new FACE_PHOTO();
            FACE_PHOTO.Y = "FACE_PHOTO";
            FACE_PHOTO.CREATOR = new W0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return FACE_PHOTO.Y;
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

    public static final class GOV_AUTHORIZATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final GOV_AUTHORIZATION X;
        public static final String Y;

        static {
            GOV_AUTHORIZATION.X = new GOV_AUTHORIZATION();
            GOV_AUTHORIZATION.Y = "GOV_AUTHORIZATION";
            GOV_AUTHORIZATION.CREATOR = new X0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return GOV_AUTHORIZATION.Y;
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

    public static final class GOV_ID implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final GOV_ID X;
        public static final String Y;

        static {
            GOV_ID.X = new GOV_ID();
            GOV_ID.Y = "GOV_ID";
            GOV_ID.CREATOR = new Y0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return GOV_ID.Y;
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

    public static final class GOV_ID_BACK implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final GOV_ID_BACK X;
        public static final String Y;

        static {
            GOV_ID_BACK.X = new GOV_ID_BACK();
            GOV_ID_BACK.Y = "GOV_ID_BACK";
            GOV_ID_BACK.CREATOR = new Z0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return GOV_ID_BACK.Y;
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

    public static final class POWER_OF_ATTORNEY implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final POWER_OF_ATTORNEY X;
        public static final String Y;

        static {
            POWER_OF_ATTORNEY.X = new POWER_OF_ATTORNEY();
            POWER_OF_ATTORNEY.Y = "POWER_OF_ATTORNEY";
            POWER_OF_ATTORNEY.CREATOR = new a1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return POWER_OF_ATTORNEY.Y;
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

    public static final class PREFUNDING_CONTRACT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final PREFUNDING_CONTRACT X;
        public static final String Y;

        static {
            PREFUNDING_CONTRACT.X = new PREFUNDING_CONTRACT();
            PREFUNDING_CONTRACT.Y = "PREFUNDING_CONTRACT";
            PREFUNDING_CONTRACT.CREATOR = new b1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return PREFUNDING_CONTRACT.Y;
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

    public static final class PROFESSIONAL_LICENSE implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final PROFESSIONAL_LICENSE X;
        public static final String Y;

        static {
            PROFESSIONAL_LICENSE.X = new PROFESSIONAL_LICENSE();
            PROFESSIONAL_LICENSE.Y = "PROFESSIONAL_LICENSE";
            PROFESSIONAL_LICENSE.CREATOR = new c1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return PROFESSIONAL_LICENSE.Y;
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

    public static final class PROOF_OF_ADDRESS implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final PROOF_OF_ADDRESS X;
        public static final String Y;

        static {
            PROOF_OF_ADDRESS.X = new PROOF_OF_ADDRESS();
            PROOF_OF_ADDRESS.Y = "PROOF_OF_ADDRESS";
            PROOF_OF_ADDRESS.CREATOR = new d1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return PROOF_OF_ADDRESS.Y;
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

    public static final class RESIDENCY_CERTIFICATE implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final RESIDENCY_CERTIFICATE X;
        public static final String Y;

        static {
            RESIDENCY_CERTIFICATE.X = new RESIDENCY_CERTIFICATE();
            RESIDENCY_CERTIFICATE.Y = "RESIDENCY_CERTIFICATE";
            RESIDENCY_CERTIFICATE.CREATOR = new e1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return RESIDENCY_CERTIFICATE.Y;
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

    public static final class TAXI_PERMIT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final TAXI_PERMIT X;
        public static final String Y;

        static {
            TAXI_PERMIT.X = new TAXI_PERMIT();
            TAXI_PERMIT.Y = "TAXI_PERMIT";
            TAXI_PERMIT.CREATOR = new f1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return TAXI_PERMIT.Y;
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

    public static final class TAXI_PERMIT_BACK implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final TAXI_PERMIT_BACK X;
        public static final String Y;

        static {
            TAXI_PERMIT_BACK.X = new TAXI_PERMIT_BACK();
            TAXI_PERMIT_BACK.Y = "TAXI_PERMIT_BACK";
            TAXI_PERMIT_BACK.CREATOR = new g1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return TAXI_PERMIT_BACK.Y;
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

    public static final class TRAINING_CERTIFICATE implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final TRAINING_CERTIFICATE X;
        public static final String Y;

        static {
            TRAINING_CERTIFICATE.X = new TRAINING_CERTIFICATE();
            TRAINING_CERTIFICATE.Y = "TRAINING_CERTIFICATE";
            TRAINING_CERTIFICATE.CREATOR = new h1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return TRAINING_CERTIFICATE.Y;
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

    public static final class TRANSPORT_REGISTRATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final TRANSPORT_REGISTRATION X;
        public static final String Y;

        static {
            TRANSPORT_REGISTRATION.X = new TRANSPORT_REGISTRATION();
            TRANSPORT_REGISTRATION.Y = "TRANSPORT_REGISTRATION";
            TRANSPORT_REGISTRATION.CREATOR = new i1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return TRANSPORT_REGISTRATION.Y;
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

    public static final class TRANSPORT_REGISTRATION_BACK implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final TRANSPORT_REGISTRATION_BACK X;
        public static final String Y;

        static {
            TRANSPORT_REGISTRATION_BACK.X = new TRANSPORT_REGISTRATION_BACK();
            TRANSPORT_REGISTRATION_BACK.Y = "TRANSPORT_REGISTRATION_BACK";
            TRANSPORT_REGISTRATION_BACK.CREATOR = new j1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return TRANSPORT_REGISTRATION_BACK.Y;
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

    public static final class UBA_TERMINATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final UBA_TERMINATION X;
        public static final String Y;

        static {
            UBA_TERMINATION.X = new UBA_TERMINATION();
            UBA_TERMINATION.Y = "UBA_TERMINATION";
            UBA_TERMINATION.CREATOR = new k1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return UBA_TERMINATION.Y;
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

    public static final class UNKNOWN__ implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new l1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
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

    public static final class WAVE_BUSINESS_CONTRACT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_BUSINESS_CONTRACT X;
        public static final String Y;

        static {
            WAVE_BUSINESS_CONTRACT.X = new WAVE_BUSINESS_CONTRACT();
            WAVE_BUSINESS_CONTRACT.Y = "WAVE_BUSINESS_CONTRACT";
            WAVE_BUSINESS_CONTRACT.CREATOR = new m1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_BUSINESS_CONTRACT.Y;
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

    public static final class WAVE_BUSINESS_CONTRACT_ANNEX implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_BUSINESS_CONTRACT_ANNEX X;
        public static final String Y;

        static {
            WAVE_BUSINESS_CONTRACT_ANNEX.X = new WAVE_BUSINESS_CONTRACT_ANNEX();
            WAVE_BUSINESS_CONTRACT_ANNEX.Y = "WAVE_BUSINESS_CONTRACT_ANNEX";
            WAVE_BUSINESS_CONTRACT_ANNEX.CREATOR = new n1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_BUSINESS_CONTRACT_ANNEX.Y;
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

    public static final class WAVE_BUSINESS_CONTRACT_TERMINATION implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_BUSINESS_CONTRACT_TERMINATION X;
        public static final String Y;

        static {
            WAVE_BUSINESS_CONTRACT_TERMINATION.X = new WAVE_BUSINESS_CONTRACT_TERMINATION();
            WAVE_BUSINESS_CONTRACT_TERMINATION.Y = "WAVE_BUSINESS_CONTRACT_TERMINATION";
            WAVE_BUSINESS_CONTRACT_TERMINATION.CREATOR = new o1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_BUSINESS_CONTRACT_TERMINATION.Y;
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

    public static final class WAVE_CONTRACT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_CONTRACT X;
        public static final String Y;

        static {
            WAVE_CONTRACT.X = new WAVE_CONTRACT();
            WAVE_CONTRACT.Y = "WAVE_CONTRACT";
            WAVE_CONTRACT.CREATOR = new p1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_CONTRACT.Y;
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

    public static final class WAVE_CONTRACT_BIA implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_CONTRACT_BIA X;
        public static final String Y;

        static {
            WAVE_CONTRACT_BIA.X = new WAVE_CONTRACT_BIA();
            WAVE_CONTRACT_BIA.Y = "WAVE_CONTRACT_BIA";
            WAVE_CONTRACT_BIA.CREATOR = new q1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_CONTRACT_BIA.Y;
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

    public static final class WAVE_CONTRACT_CBC implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_CONTRACT_CBC X;
        public static final String Y;

        static {
            WAVE_CONTRACT_CBC.X = new WAVE_CONTRACT_CBC();
            WAVE_CONTRACT_CBC.Y = "WAVE_CONTRACT_CBC";
            WAVE_CONTRACT_CBC.CREATOR = new r1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_CONTRACT_CBC.Y;
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

    public static final class WAVE_CONTRACT_ECOBANK implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_CONTRACT_ECOBANK X;
        public static final String Y;

        static {
            WAVE_CONTRACT_ECOBANK.X = new WAVE_CONTRACT_ECOBANK();
            WAVE_CONTRACT_ECOBANK.Y = "WAVE_CONTRACT_ECOBANK";
            WAVE_CONTRACT_ECOBANK.CREATOR = new s1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_CONTRACT_ECOBANK.Y;
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

    public static final class WAVE_CONTRACT_ORABANK implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_CONTRACT_ORABANK X;
        public static final String Y;

        static {
            WAVE_CONTRACT_ORABANK.X = new WAVE_CONTRACT_ORABANK();
            WAVE_CONTRACT_ORABANK.Y = "WAVE_CONTRACT_ORABANK";
            WAVE_CONTRACT_ORABANK.CREATOR = new t1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_CONTRACT_ORABANK.Y;
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

    public static final class WAVE_CONTRACT_UBA implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_CONTRACT_UBA X;
        public static final String Y;

        static {
            WAVE_CONTRACT_UBA.X = new WAVE_CONTRACT_UBA();
            WAVE_CONTRACT_UBA.Y = "WAVE_CONTRACT_UBA";
            WAVE_CONTRACT_UBA.CREATOR = new u1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_CONTRACT_UBA.Y;
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

    public static final class WAVE_SERVICES_AGREEMENT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WAVE_SERVICES_AGREEMENT X;
        public static final String Y;

        static {
            WAVE_SERVICES_AGREEMENT.X = new WAVE_SERVICES_AGREEMENT();
            WAVE_SERVICES_AGREEMENT.Y = "WAVE_SERVICES_AGREEMENT";
            WAVE_SERVICES_AGREEMENT.CREATOR = new v1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WAVE_SERVICES_AGREEMENT.Y;
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

    public static final class WDF_CODE_OF_CONDUCT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WDF_CODE_OF_CONDUCT X;
        public static final String Y;

        static {
            WDF_CODE_OF_CONDUCT.X = new WDF_CODE_OF_CONDUCT();
            WDF_CODE_OF_CONDUCT.Y = "WDF_CODE_OF_CONDUCT";
            WDF_CODE_OF_CONDUCT.CREATOR = new w1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WDF_CODE_OF_CONDUCT.Y;
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

    public static final class WDF_WAVE_SERVICES_AGREEMENT implements IdPhotoType {
        public static final Parcelable.Creator CREATOR;
        public static final WDF_WAVE_SERVICES_AGREEMENT X;
        public static final String Y;

        static {
            WDF_WAVE_SERVICES_AGREEMENT.X = new WDF_WAVE_SERVICES_AGREEMENT();
            WDF_WAVE_SERVICES_AGREEMENT.Y = "WDF_WAVE_SERVICES_AGREEMENT";
            WDF_WAVE_SERVICES_AGREEMENT.CREATOR = new x1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoType
        public final String a() {
            return WDF_WAVE_SERVICES_AGREEMENT.Y;
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

    public static final R0 u;

    static {
        IdPhotoType.u = R0.a;
    }

    String a();
}

