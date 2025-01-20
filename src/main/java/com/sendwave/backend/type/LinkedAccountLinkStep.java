package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface LinkedAccountLinkStep extends Parcelable {
    public static final class ACTIVATION_KEY implements LinkedAccountLinkStep {
        public static final Parcelable.Creator CREATOR;
        public static final ACTIVATION_KEY X;
        public static final String Y;

        static {
            ACTIVATION_KEY.X = new ACTIVATION_KEY();
            ACTIVATION_KEY.Y = "ACTIVATION_KEY";
            ACTIVATION_KEY.CREATOR = new U1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountLinkStep
        public final String a() {
            return ACTIVATION_KEY.Y;
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

    public static final class FIELDS implements LinkedAccountLinkStep {
        public static final Parcelable.Creator CREATOR;
        public static final FIELDS X;
        public static final String Y;

        static {
            FIELDS.X = new FIELDS();
            FIELDS.Y = "FIELDS";
            FIELDS.CREATOR = new W1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.LinkedAccountLinkStep
        public final String a() {
            return FIELDS.Y;
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

    public static final class UNKNOWN__ implements LinkedAccountLinkStep {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new X1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.LinkedAccountLinkStep
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

    public static final V1 z;

    static {
        LinkedAccountLinkStep.z = V1.a;
    }

    String a();
}

