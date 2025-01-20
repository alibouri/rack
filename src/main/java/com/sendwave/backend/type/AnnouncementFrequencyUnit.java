package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface AnnouncementFrequencyUnit extends Parcelable {
    public static final class DAYS implements AnnouncementFrequencyUnit {
        public static final Parcelable.Creator CREATOR;
        public static final DAYS X;
        public static final String Y;

        static {
            DAYS.X = new DAYS();
            DAYS.Y = "DAYS";
            DAYS.CREATOR = new x();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementFrequencyUnit
        public final String a() {
            return DAYS.Y;
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

    public static final class HOURS implements AnnouncementFrequencyUnit {
        public static final Parcelable.Creator CREATOR;
        public static final HOURS X;
        public static final String Y;

        static {
            HOURS.X = new HOURS();
            HOURS.Y = "HOURS";
            HOURS.CREATOR = new y();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementFrequencyUnit
        public final String a() {
            return HOURS.Y;
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

    public static final class MINUTES implements AnnouncementFrequencyUnit {
        public static final Parcelable.Creator CREATOR;
        public static final MINUTES X;
        public static final String Y;

        static {
            MINUTES.X = new MINUTES();
            MINUTES.Y = "MINUTES";
            MINUTES.CREATOR = new z();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementFrequencyUnit
        public final String a() {
            return MINUTES.Y;
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

    public static final class UNKNOWN__ implements AnnouncementFrequencyUnit {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new A();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.AnnouncementFrequencyUnit
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

    public static final class WEEKS implements AnnouncementFrequencyUnit {
        public static final Parcelable.Creator CREATOR;
        public static final WEEKS X;
        public static final String Y;

        static {
            WEEKS.X = new WEEKS();
            WEEKS.Y = "WEEKS";
            WEEKS.CREATOR = new B();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.AnnouncementFrequencyUnit
        public final String a() {
            return WEEKS.Y;
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

    public static final w o;

    static {
        AnnouncementFrequencyUnit.o = w.a;
    }

    String a();
}

