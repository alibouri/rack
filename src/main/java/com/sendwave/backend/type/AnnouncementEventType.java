package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface AnnouncementEventType extends Parcelable {
    public static final class DISMISSED implements AnnouncementEventType {
        public static final Parcelable.Creator CREATOR;
        public static final DISMISSED X;
        public static final String Y;

        static {
            DISMISSED.X = new DISMISSED();
            DISMISSED.Y = "DISMISSED";
            DISMISSED.CREATOR = new q();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementEventType
        public final String a() {
            return DISMISSED.Y;
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

    public static final class PLAYED implements AnnouncementEventType {
        public static final Parcelable.Creator CREATOR;
        public static final PLAYED X;
        public static final String Y;

        static {
            PLAYED.X = new PLAYED();
            PLAYED.Y = "PLAYED";
            PLAYED.CREATOR = new r();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementEventType
        public final String a() {
            return PLAYED.Y;
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

    public static final class SEEN implements AnnouncementEventType {
        public static final Parcelable.Creator CREATOR;
        public static final SEEN X;
        public static final String Y;

        static {
            SEEN.X = new SEEN();
            SEEN.Y = "SEEN";
            SEEN.CREATOR = new s();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementEventType
        public final String a() {
            return SEEN.Y;
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

    public static final class SPLASH_PRESENTED implements AnnouncementEventType {
        public static final Parcelable.Creator CREATOR;
        public static final SPLASH_PRESENTED X;
        public static final String Y;

        static {
            SPLASH_PRESENTED.X = new SPLASH_PRESENTED();
            SPLASH_PRESENTED.Y = "SPLASH_PRESENTED";
            SPLASH_PRESENTED.CREATOR = new t();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementEventType
        public final String a() {
            return SPLASH_PRESENTED.Y;
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

    public static final class TAPPED implements AnnouncementEventType {
        public static final Parcelable.Creator CREATOR;
        public static final TAPPED X;
        public static final String Y;

        static {
            TAPPED.X = new TAPPED();
            TAPPED.Y = "TAPPED";
            TAPPED.CREATOR = new u();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementEventType
        public final String a() {
            return TAPPED.Y;
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

    public static final class UNKNOWN__ implements AnnouncementEventType {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new v();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.AnnouncementEventType
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

    public static final p n;

    static {
        AnnouncementEventType.n = p.a;
    }

    String a();
}

