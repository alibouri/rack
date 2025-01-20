package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface ScratchCardBackground extends Parcelable {
    public static final class DEFAULT implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final DEFAULT X;
        public static final String Y;

        static {
            DEFAULT.X = new DEFAULT();
            DEFAULT.Y = "DEFAULT";
            DEFAULT.CREATOR = new A3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return DEFAULT.Y;
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

    public static final class HOLIDAY_EID_AL_FITR implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final HOLIDAY_EID_AL_FITR X;
        public static final String Y;

        static {
            HOLIDAY_EID_AL_FITR.X = new HOLIDAY_EID_AL_FITR();
            HOLIDAY_EID_AL_FITR.Y = "HOLIDAY_EID_AL_FITR";
            HOLIDAY_EID_AL_FITR.CREATOR = new B3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return HOLIDAY_EID_AL_FITR.Y;
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

    public static final class HOLIDAY_NEW_YEARS implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final HOLIDAY_NEW_YEARS X;
        public static final String Y;

        static {
            HOLIDAY_NEW_YEARS.X = new HOLIDAY_NEW_YEARS();
            HOLIDAY_NEW_YEARS.Y = "HOLIDAY_NEW_YEARS";
            HOLIDAY_NEW_YEARS.CREATOR = new C3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return HOLIDAY_NEW_YEARS.Y;
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

    public static final class HOLIDAY_TABASKI implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final HOLIDAY_TABASKI X;
        public static final String Y;

        static {
            HOLIDAY_TABASKI.X = new HOLIDAY_TABASKI();
            HOLIDAY_TABASKI.Y = "HOLIDAY_TABASKI";
            HOLIDAY_TABASKI.CREATOR = new D3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return HOLIDAY_TABASKI.Y;
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

    public static final class HOLIDAY_XMAS implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final HOLIDAY_XMAS X;
        public static final String Y;

        static {
            HOLIDAY_XMAS.X = new HOLIDAY_XMAS();
            HOLIDAY_XMAS.Y = "HOLIDAY_XMAS";
            HOLIDAY_XMAS.CREATOR = new E3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return HOLIDAY_XMAS.Y;
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

    public static final class REFERRAL implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final REFERRAL X;
        public static final String Y;

        static {
            REFERRAL.X = new REFERRAL();
            REFERRAL.Y = "REFERRAL";
            REFERRAL.CREATOR = new F3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return REFERRAL.Y;
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

    public static final class SPECIAL_BLUE implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final SPECIAL_BLUE X;
        public static final String Y;

        static {
            SPECIAL_BLUE.X = new SPECIAL_BLUE();
            SPECIAL_BLUE.Y = "SPECIAL_BLUE";
            SPECIAL_BLUE.CREATOR = new G3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return SPECIAL_BLUE.Y;
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

    public static final class SPECIAL_GREY implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final SPECIAL_GREY X;
        public static final String Y;

        static {
            SPECIAL_GREY.X = new SPECIAL_GREY();
            SPECIAL_GREY.Y = "SPECIAL_GREY";
            SPECIAL_GREY.CREATOR = new H3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return SPECIAL_GREY.Y;
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

    public static final class SPECIAL_YELLOW implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public static final SPECIAL_YELLOW X;
        public static final String Y;

        static {
            SPECIAL_YELLOW.X = new SPECIAL_YELLOW();
            SPECIAL_YELLOW.Y = "SPECIAL_YELLOW";
            SPECIAL_YELLOW.CREATOR = new I3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
        public final String a() {
            return SPECIAL_YELLOW.Y;
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

    public static final class UNKNOWN__ implements ScratchCardBackground {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new J3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.ScratchCardBackground
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

    public static final z3 G;

    static {
        ScratchCardBackground.G = z3.a;
    }

    String a();
}

