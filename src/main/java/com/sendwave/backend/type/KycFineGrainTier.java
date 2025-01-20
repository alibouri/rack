package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface KycFineGrainTier extends Parcelable {
    public static final class KYC0 implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public static final KYC0 X;
        public static final String Y;

        static {
            KYC0.X = new KYC0();
            KYC0.Y = "KYC0";
            KYC0.CREATOR = new D1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
        public final String a() {
            return KYC0.Y;
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

    public static final class KYC0Applied implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public static final KYC0Applied X;
        public static final String Y;

        static {
            KYC0Applied.X = new KYC0Applied();
            KYC0Applied.Y = "KYC0Applied";
            KYC0Applied.CREATOR = new E1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
        public final String a() {
            return KYC0Applied.Y;
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

    public static final class KYC1 implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public static final KYC1 X;
        public static final String Y;

        static {
            KYC1.X = new KYC1();
            KYC1.Y = "KYC1";
            KYC1.CREATOR = new F1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
        public final String a() {
            return KYC1.Y;
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

    public static final class KYC1Applied implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public static final KYC1Applied X;
        public static final String Y;

        static {
            KYC1Applied.X = new KYC1Applied();
            KYC1Applied.Y = "KYC1Applied";
            KYC1Applied.CREATOR = new G1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
        public final String a() {
            return KYC1Applied.Y;
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

    public static final class KYC2 implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public static final KYC2 X;
        public static final String Y;

        static {
            KYC2.X = new KYC2();
            KYC2.Y = "KYC2";
            KYC2.CREATOR = new H1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
        public final String a() {
            return KYC2.Y;
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

    public static final class KYC2SoftRejected implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public static final KYC2SoftRejected X;
        public static final String Y;

        static {
            KYC2SoftRejected.X = new KYC2SoftRejected();
            KYC2SoftRejected.Y = "KYC2SoftRejected";
            KYC2SoftRejected.CREATOR = new I1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
        public final String a() {
            return KYC2SoftRejected.Y;
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

    public static final class UNKNOWN__ implements KycFineGrainTier {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new J1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.KycFineGrainTier
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

    public static final C1 w;

    static {
        KycFineGrainTier.w = C1.a;
    }

    String a();
}

