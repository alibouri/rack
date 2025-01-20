package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface ReceiptTemplateId extends Parcelable {
    public static final class TICKET_TEMPLATE_ID implements ReceiptTemplateId {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE_ID X;
        public static final String Y;

        static {
            TICKET_TEMPLATE_ID.X = new TICKET_TEMPLATE_ID();
            TICKET_TEMPLATE_ID.Y = "TICKET_TEMPLATE_ID";
            TICKET_TEMPLATE_ID.CREATOR = new Y2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateId
        public final String a() {
            return TICKET_TEMPLATE_ID.Y;
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

    public static final class UNKNOWN__ implements ReceiptTemplateId {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new Z2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateId
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

    public static final X2 E;

    static {
        ReceiptTemplateId.E = X2.a;
    }

    String a();
}

