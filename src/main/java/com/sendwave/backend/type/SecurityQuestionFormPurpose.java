package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface SecurityQuestionFormPurpose extends Parcelable {
    public static final class AUTHORIZE_NEW_DEVICE implements SecurityQuestionFormPurpose {
        public static final Parcelable.Creator CREATOR;
        public static final AUTHORIZE_NEW_DEVICE X;
        public static final String Y;

        static {
            AUTHORIZE_NEW_DEVICE.X = new AUTHORIZE_NEW_DEVICE();
            AUTHORIZE_NEW_DEVICE.Y = "AUTHORIZE_NEW_DEVICE";
            AUTHORIZE_NEW_DEVICE.CREATOR = new u4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormPurpose
        public final String a() {
            return AUTHORIZE_NEW_DEVICE.Y;
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

    public static final class PERSISTENT implements SecurityQuestionFormPurpose {
        public static final Parcelable.Creator CREATOR;
        public static final PERSISTENT X;
        public static final String Y;

        static {
            PERSISTENT.X = new PERSISTENT();
            PERSISTENT.Y = "PERSISTENT";
            PERSISTENT.CREATOR = new w4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormPurpose
        public final String a() {
            return PERSISTENT.Y;
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

    public static final class SELF_SERVE_PIN_RECOVERY implements SecurityQuestionFormPurpose {
        public static final Parcelable.Creator CREATOR;
        public static final SELF_SERVE_PIN_RECOVERY X;
        public static final String Y;

        static {
            SELF_SERVE_PIN_RECOVERY.X = new SELF_SERVE_PIN_RECOVERY();
            SELF_SERVE_PIN_RECOVERY.Y = "SELF_SERVE_PIN_RECOVERY";
            SELF_SERVE_PIN_RECOVERY.CREATOR = new x4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormPurpose
        public final String a() {
            return SELF_SERVE_PIN_RECOVERY.Y;
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

    public static final class UNKNOWN__ implements SecurityQuestionFormPurpose {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new y4();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFormPurpose
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

    public static final v4 L;

    static {
        SecurityQuestionFormPurpose.L = v4.a;
    }

    String a();
}

