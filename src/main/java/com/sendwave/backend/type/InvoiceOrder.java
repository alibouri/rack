package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface InvoiceOrder extends Parcelable {
    public static final class ANY implements InvoiceOrder {
        public static final Parcelable.Creator CREATOR;
        public static final ANY X;
        public static final String Y;

        static {
            ANY.X = new ANY();
            ANY.Y = "ANY";
            ANY.CREATOR = new y1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.InvoiceOrder
        public final String a() {
            return ANY.Y;
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

    public static final class CHRONOLOGICAL implements InvoiceOrder {
        public static final Parcelable.Creator CREATOR;
        public static final CHRONOLOGICAL X;
        public static final String Y;

        static {
            CHRONOLOGICAL.X = new CHRONOLOGICAL();
            CHRONOLOGICAL.Y = "CHRONOLOGICAL";
            CHRONOLOGICAL.CREATOR = new z1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.InvoiceOrder
        public final String a() {
            return CHRONOLOGICAL.Y;
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

    public static final class UNKNOWN__ implements InvoiceOrder {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new B1();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.InvoiceOrder
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

    public static final A1 v;

    static {
        InvoiceOrder.v = A1.a;
    }

    String a();
}

