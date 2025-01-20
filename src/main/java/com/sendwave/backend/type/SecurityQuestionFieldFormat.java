package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface SecurityQuestionFieldFormat extends Parcelable {
    public static final class DROPDOWN implements SecurityQuestionFieldFormat {
        public static final Parcelable.Creator CREATOR;
        public static final DROPDOWN X;
        public static final String Y;

        static {
            DROPDOWN.X = new DROPDOWN();
            DROPDOWN.Y = "DROPDOWN";
            DROPDOWN.CREATOR = new R3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldFormat
        public final String a() {
            return DROPDOWN.Y;
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

    public static final class HIDDEN implements SecurityQuestionFieldFormat {
        public static final Parcelable.Creator CREATOR;
        public static final HIDDEN X;
        public static final String Y;

        static {
            HIDDEN.X = new HIDDEN();
            HIDDEN.Y = "HIDDEN";
            HIDDEN.CREATOR = new S3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldFormat
        public final String a() {
            return HIDDEN.Y;
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

    public static final class UNKNOWN__ implements SecurityQuestionFieldFormat {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new T3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.SecurityQuestionFieldFormat
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

    public static final Q3 I;

    static {
        SecurityQuestionFieldFormat.I = Q3.a;
    }

    String a();
}

