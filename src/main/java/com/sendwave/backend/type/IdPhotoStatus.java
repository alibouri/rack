package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface IdPhotoStatus extends Parcelable {
    public static final class ACCEPTED implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final ACCEPTED X;
        public static final String Y;

        static {
            ACCEPTED.X = new ACCEPTED();
            ACCEPTED.Y = "ACCEPTED";
            ACCEPTED.CREATOR = new x0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return ACCEPTED.Y;
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

    public static final class CANCELLED implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final CANCELLED X;
        public static final String Y;

        static {
            CANCELLED.X = new CANCELLED();
            CANCELLED.Y = "CANCELLED";
            CANCELLED.CREATOR = new y0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return CANCELLED.Y;
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

    public static final class FAILED_TO_UPLOAD implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final FAILED_TO_UPLOAD X;
        public static final String Y;

        static {
            FAILED_TO_UPLOAD.X = new FAILED_TO_UPLOAD();
            FAILED_TO_UPLOAD.Y = "FAILED_TO_UPLOAD";
            FAILED_TO_UPLOAD.CREATOR = new A0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return FAILED_TO_UPLOAD.Y;
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

    public static final class NOT_FOR_REVIEW implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final NOT_FOR_REVIEW X;
        public static final String Y;

        static {
            NOT_FOR_REVIEW.X = new NOT_FOR_REVIEW();
            NOT_FOR_REVIEW.Y = "NOT_FOR_REVIEW";
            NOT_FOR_REVIEW.CREATOR = new B0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return NOT_FOR_REVIEW.Y;
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

    public static final class REJECTED implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final REJECTED X;
        public static final String Y;

        static {
            REJECTED.X = new REJECTED();
            REJECTED.Y = "REJECTED";
            REJECTED.CREATOR = new C0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return REJECTED.Y;
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

    public static final class REVIEWING implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final REVIEWING X;
        public static final String Y;

        static {
            REVIEWING.X = new REVIEWING();
            REVIEWING.Y = "REVIEWING";
            REVIEWING.CREATOR = new D0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return REVIEWING.Y;
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

    public static final class SOFT_REJECTED implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final SOFT_REJECTED X;
        public static final String Y;

        static {
            SOFT_REJECTED.X = new SOFT_REJECTED();
            SOFT_REJECTED.Y = "SOFT_REJECTED";
            SOFT_REJECTED.CREATOR = new E0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return SOFT_REJECTED.Y;
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

    public static final class UNKNOWN__ implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new F0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
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

    public static final class UPLOADING implements IdPhotoStatus {
        public static final Parcelable.Creator CREATOR;
        public static final UPLOADING X;
        public static final String Y;

        static {
            UPLOADING.X = new UPLOADING();
            UPLOADING.Y = "UPLOADING";
            UPLOADING.CREATOR = new G0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.IdPhotoStatus
        public final String a() {
            return UPLOADING.Y;
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

    public static final z0 t;

    static {
        IdPhotoStatus.t = z0.a;
    }

    String a();
}

