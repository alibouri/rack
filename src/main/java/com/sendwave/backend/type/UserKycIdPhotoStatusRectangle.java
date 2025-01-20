package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface UserKycIdPhotoStatusRectangle extends Parcelable {
    public static final class ERROR implements UserKycIdPhotoStatusRectangle {
        public static final Parcelable.Creator CREATOR;
        public static final ERROR X;
        public static final String Y;

        static {
            ERROR.X = new ERROR();
            ERROR.Y = "ERROR";
            ERROR.CREATOR = new F5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserKycIdPhotoStatusRectangle
        public final String a() {
            return ERROR.Y;
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

    public static final class INFO implements UserKycIdPhotoStatusRectangle {
        public static final Parcelable.Creator CREATOR;
        public static final INFO X;
        public static final String Y;

        static {
            INFO.X = new INFO();
            INFO.Y = "INFO";
            INFO.CREATOR = new G5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserKycIdPhotoStatusRectangle
        public final String a() {
            return INFO.Y;
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

    public static final class UNKNOWN__ implements UserKycIdPhotoStatusRectangle {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new H5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.UserKycIdPhotoStatusRectangle
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

    public static final class WARNING implements UserKycIdPhotoStatusRectangle {
        public static final Parcelable.Creator CREATOR;
        public static final WARNING X;
        public static final String Y;

        static {
            WARNING.X = new WARNING();
            WARNING.Y = "WARNING";
            WARNING.CREATOR = new I5();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.UserKycIdPhotoStatusRectangle
        public final String a() {
            return WARNING.Y;
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

    public static final E5 S;

    static {
        UserKycIdPhotoStatusRectangle.S = E5.a;
    }

    String a();
}

