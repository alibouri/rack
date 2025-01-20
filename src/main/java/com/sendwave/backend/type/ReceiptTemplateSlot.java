package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface ReceiptTemplateSlot extends Parcelable {
    public static final class SPILLOVER_FIELD implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final SPILLOVER_FIELD X;
        public static final String Y;

        static {
            SPILLOVER_FIELD.X = new SPILLOVER_FIELD();
            SPILLOVER_FIELD.Y = "SPILLOVER_FIELD";
            SPILLOVER_FIELD.CREATOR = new b3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return SPILLOVER_FIELD.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR.X = new TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR();
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR.Y = "TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR";
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR.CREATOR = new c3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED.X = new TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED();
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED.Y = "TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED";
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED.CREATOR = new d3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_COLOR_PRESSED.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT.X = new TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT();
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT.Y = "TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT";
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT.CREATOR = new e3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_TEXT.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL.X = new TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL();
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL.Y = "TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL";
            TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL.CREATOR = new f3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ACTION_BUTTON_URL.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_HEADER implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_HEADER X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_HEADER.X = new TICKET_TEMPLATE__DETAIL_HEADER();
            TICKET_TEMPLATE__DETAIL_HEADER.Y = "TICKET_TEMPLATE__DETAIL_HEADER";
            TICKET_TEMPLATE__DETAIL_HEADER.CREATOR = new g3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_HEADER.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_1_COL_1 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_1_COL_1 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_1_COL_1.X = new TICKET_TEMPLATE__DETAIL_ROW_1_COL_1();
            TICKET_TEMPLATE__DETAIL_ROW_1_COL_1.Y = "TICKET_TEMPLATE__DETAIL_ROW_1_COL_1";
            TICKET_TEMPLATE__DETAIL_ROW_1_COL_1.CREATOR = new h3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_1_COL_1.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_1_COL_2 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_1_COL_2 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_1_COL_2.X = new TICKET_TEMPLATE__DETAIL_ROW_1_COL_2();
            TICKET_TEMPLATE__DETAIL_ROW_1_COL_2.Y = "TICKET_TEMPLATE__DETAIL_ROW_1_COL_2";
            TICKET_TEMPLATE__DETAIL_ROW_1_COL_2.CREATOR = new i3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_1_COL_2.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_2_COL_1 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_2_COL_1 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_2_COL_1.X = new TICKET_TEMPLATE__DETAIL_ROW_2_COL_1();
            TICKET_TEMPLATE__DETAIL_ROW_2_COL_1.Y = "TICKET_TEMPLATE__DETAIL_ROW_2_COL_1";
            TICKET_TEMPLATE__DETAIL_ROW_2_COL_1.CREATOR = new j3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_2_COL_1.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_2_COL_2 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_2_COL_2 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_2_COL_2.X = new TICKET_TEMPLATE__DETAIL_ROW_2_COL_2();
            TICKET_TEMPLATE__DETAIL_ROW_2_COL_2.Y = "TICKET_TEMPLATE__DETAIL_ROW_2_COL_2";
            TICKET_TEMPLATE__DETAIL_ROW_2_COL_2.CREATOR = new k3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_2_COL_2.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_3_COL_1 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_3_COL_1 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_3_COL_1.X = new TICKET_TEMPLATE__DETAIL_ROW_3_COL_1();
            TICKET_TEMPLATE__DETAIL_ROW_3_COL_1.Y = "TICKET_TEMPLATE__DETAIL_ROW_3_COL_1";
            TICKET_TEMPLATE__DETAIL_ROW_3_COL_1.CREATOR = new l3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_3_COL_1.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_3_COL_2 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_3_COL_2 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_3_COL_2.X = new TICKET_TEMPLATE__DETAIL_ROW_3_COL_2();
            TICKET_TEMPLATE__DETAIL_ROW_3_COL_2.Y = "TICKET_TEMPLATE__DETAIL_ROW_3_COL_2";
            TICKET_TEMPLATE__DETAIL_ROW_3_COL_2.CREATOR = new m3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_3_COL_2.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_4_COL_1 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_4_COL_1 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_4_COL_1.X = new TICKET_TEMPLATE__DETAIL_ROW_4_COL_1();
            TICKET_TEMPLATE__DETAIL_ROW_4_COL_1.Y = "TICKET_TEMPLATE__DETAIL_ROW_4_COL_1";
            TICKET_TEMPLATE__DETAIL_ROW_4_COL_1.CREATOR = new n3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_4_COL_1.Y;
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

    public static final class TICKET_TEMPLATE__DETAIL_ROW_4_COL_2 implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__DETAIL_ROW_4_COL_2 X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__DETAIL_ROW_4_COL_2.X = new TICKET_TEMPLATE__DETAIL_ROW_4_COL_2();
            TICKET_TEMPLATE__DETAIL_ROW_4_COL_2.Y = "TICKET_TEMPLATE__DETAIL_ROW_4_COL_2";
            TICKET_TEMPLATE__DETAIL_ROW_4_COL_2.CREATOR = new o3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__DETAIL_ROW_4_COL_2.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR.X = new TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR();
            TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR.Y = "TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR";
            TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR.CREATOR = new p3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_BACKGROUND_COLOR.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT.X = new TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT();
            TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT.Y = "TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT";
            TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT.CREATOR = new q3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_LEFT.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT.X = new TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT();
            TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT.Y = "TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT";
            TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT.CREATOR = new r3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_BRANDING_BOTTOM_RIGHT.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT.X = new TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT();
            TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT.Y = "TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT";
            TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT.CREATOR = new s3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_BRANDING_TOP_LEFT.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT.X = new TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT();
            TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT.Y = "TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT";
            TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT.CREATOR = new t3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_BRANDING_TOP_RIGHT.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_HEADER implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_HEADER X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_HEADER.X = new TICKET_TEMPLATE__TICKET_HEADER();
            TICKET_TEMPLATE__TICKET_HEADER.Y = "TICKET_TEMPLATE__TICKET_HEADER";
            TICKET_TEMPLATE__TICKET_HEADER.CREATOR = new u3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_HEADER.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_IMAGE implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_IMAGE X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_IMAGE.X = new TICKET_TEMPLATE__TICKET_IMAGE();
            TICKET_TEMPLATE__TICKET_IMAGE.Y = "TICKET_TEMPLATE__TICKET_IMAGE";
            TICKET_TEMPLATE__TICKET_IMAGE.CREATOR = new v3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_IMAGE.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_QR_CODE implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_QR_CODE X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_QR_CODE.X = new TICKET_TEMPLATE__TICKET_QR_CODE();
            TICKET_TEMPLATE__TICKET_QR_CODE.Y = "TICKET_TEMPLATE__TICKET_QR_CODE";
            TICKET_TEMPLATE__TICKET_QR_CODE.CREATOR = new w3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_QR_CODE.Y;
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

    public static final class TICKET_TEMPLATE__TICKET_SUBHEADER implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public static final TICKET_TEMPLATE__TICKET_SUBHEADER X;
        public static final String Y;

        static {
            TICKET_TEMPLATE__TICKET_SUBHEADER.X = new TICKET_TEMPLATE__TICKET_SUBHEADER();
            TICKET_TEMPLATE__TICKET_SUBHEADER.Y = "TICKET_TEMPLATE__TICKET_SUBHEADER";
            TICKET_TEMPLATE__TICKET_SUBHEADER.CREATOR = new x3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
        public final String a() {
            return TICKET_TEMPLATE__TICKET_SUBHEADER.Y;
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

    public static final class UNKNOWN__ implements ReceiptTemplateSlot {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new y3();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.ReceiptTemplateSlot
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

    public static final a3 F;

    static {
        ReceiptTemplateSlot.F = a3.a;
    }

    String a();
}

