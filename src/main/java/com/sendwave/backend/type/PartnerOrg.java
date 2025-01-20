package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface PartnerOrg extends Parcelable {
    public static final class BF_ORABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final BF_ORABANK X;
        public static final String Y;

        static {
            BF_ORABANK.X = new BF_ORABANK();
            BF_ORABANK.Y = "BF_ORABANK";
            BF_ORABANK.CREATOR = new f2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return BF_ORABANK.Y;
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

    public static final class BF_UBA implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final BF_UBA X;
        public static final String Y;

        static {
            BF_UBA.X = new BF_UBA();
            BF_UBA.Y = "BF_UBA";
            BF_UBA.CREATOR = new g2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return BF_UBA.Y;
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

    public static final class BJ_ORABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final BJ_ORABANK X;
        public static final String Y;

        static {
            BJ_ORABANK.X = new BJ_ORABANK();
            BJ_ORABANK.Y = "BJ_ORABANK";
            BJ_ORABANK.CREATOR = new h2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return BJ_ORABANK.Y;
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

    public static final class BJ_UBA implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final BJ_UBA X;
        public static final String Y;

        static {
            BJ_UBA.X = new BJ_UBA();
            BJ_UBA.Y = "BJ_UBA";
            BJ_UBA.CREATOR = new i2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return BJ_UBA.Y;
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

    public static final class CI_ECOBANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final CI_ECOBANK X;
        public static final String Y;

        static {
            CI_ECOBANK.X = new CI_ECOBANK();
            CI_ECOBANK.Y = "CI_ECOBANK";
            CI_ECOBANK.CREATOR = new j2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return CI_ECOBANK.Y;
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

    public static final class CI_ORABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final CI_ORABANK X;
        public static final String Y;

        static {
            CI_ORABANK.X = new CI_ORABANK();
            CI_ORABANK.Y = "CI_ORABANK";
            CI_ORABANK.CREATOR = new k2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return CI_ORABANK.Y;
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

    public static final class CI_UBA implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final CI_UBA X;
        public static final String Y;

        static {
            CI_UBA.X = new CI_UBA();
            CI_UBA.Y = "CI_UBA";
            CI_UBA.CREATOR = new l2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return CI_UBA.Y;
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

    public static final class CM_CBC implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final CM_CBC X;
        public static final String Y;

        static {
            CM_CBC.X = new CM_CBC();
            CM_CBC.Y = "CM_CBC";
            CM_CBC.CREATOR = new m2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return CM_CBC.Y;
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

    public static final class ET_SMFI implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final ET_SMFI X;
        public static final String Y;

        static {
            ET_SMFI.X = new ET_SMFI();
            ET_SMFI.Y = "ET_SMFI";
            ET_SMFI.CREATOR = new o2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return ET_SMFI.Y;
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

    public static final class GM_ACCESSBANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final GM_ACCESSBANK X;
        public static final String Y;

        static {
            GM_ACCESSBANK.X = new GM_ACCESSBANK();
            GM_ACCESSBANK.Y = "GM_ACCESSBANK";
            GM_ACCESSBANK.CREATOR = new p2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return GM_ACCESSBANK.Y;
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

    public static final class GM_MEGABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final GM_MEGABANK X;
        public static final String Y;

        static {
            GM_MEGABANK.X = new GM_MEGABANK();
            GM_MEGABANK.Y = "GM_MEGABANK";
            GM_MEGABANK.CREATOR = new q2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return GM_MEGABANK.Y;
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

    public static final class GM_WTL implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final GM_WTL X;
        public static final String Y;

        static {
            GM_WTL.X = new GM_WTL();
            GM_WTL.Y = "GM_WTL";
            GM_WTL.CREATOR = new r2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return GM_WTL.Y;
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

    public static final class GN_WAVE implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final GN_WAVE X;
        public static final String Y;

        static {
            GN_WAVE.X = new GN_WAVE();
            GN_WAVE.Y = "GN_WAVE";
            GN_WAVE.CREATOR = new s2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return GN_WAVE.Y;
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

    public static final class LEGACY_UNKNOWN__ implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final LEGACY_UNKNOWN__ X;
        public static final String Y;

        static {
            LEGACY_UNKNOWN__.X = new LEGACY_UNKNOWN__();
            LEGACY_UNKNOWN__.Y = "UNKNOWN__";
            LEGACY_UNKNOWN__.CREATOR = new t2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return LEGACY_UNKNOWN__.Y;
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

    public static final class ML_ORABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final ML_ORABANK X;
        public static final String Y;

        static {
            ML_ORABANK.X = new ML_ORABANK();
            ML_ORABANK.Y = "ML_ORABANK";
            ML_ORABANK.CREATOR = new u2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return ML_ORABANK.Y;
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

    public static final class ML_UBA implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final ML_UBA X;
        public static final String Y;

        static {
            ML_UBA.X = new ML_UBA();
            ML_UBA.Y = "ML_UBA";
            ML_UBA.CREATOR = new v2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return ML_UBA.Y;
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

    public static final class NE_BIA implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final NE_BIA X;
        public static final String Y;

        static {
            NE_BIA.X = new NE_BIA();
            NE_BIA.Y = "NE_BIA";
            NE_BIA.CREATOR = new w2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return NE_BIA.Y;
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

    public static final class NE_ECOBANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final NE_ECOBANK X;
        public static final String Y;

        static {
            NE_ECOBANK.X = new NE_ECOBANK();
            NE_ECOBANK.Y = "NE_ECOBANK";
            NE_ECOBANK.CREATOR = new x2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return NE_ECOBANK.Y;
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

    public static final class NE_ORABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final NE_ORABANK X;
        public static final String Y;

        static {
            NE_ORABANK.X = new NE_ORABANK();
            NE_ORABANK.Y = "NE_ORABANK";
            NE_ORABANK.CREATOR = new y2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return NE_ORABANK.Y;
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

    public static final class QQ_DUMMYEMI implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final QQ_DUMMYEMI X;
        public static final String Y;

        static {
            QQ_DUMMYEMI.X = new QQ_DUMMYEMI();
            QQ_DUMMYEMI.Y = "QQ_DUMMYEMI";
            QQ_DUMMYEMI.CREATOR = new z2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return QQ_DUMMYEMI.Y;
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

    public static final class QQ_FAKEBANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final QQ_FAKEBANK X;
        public static final String Y;

        static {
            QQ_FAKEBANK.X = new QQ_FAKEBANK();
            QQ_FAKEBANK.Y = "QQ_FAKEBANK";
            QQ_FAKEBANK.CREATOR = new A2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return QQ_FAKEBANK.Y;
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

    public static final class SL_WTL implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final SL_WTL X;
        public static final String Y;

        static {
            SL_WTL.X = new SL_WTL();
            SL_WTL.Y = "SL_WTL";
            SL_WTL.CREATOR = new B2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return SL_WTL.Y;
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

    public static final class SN_ECOBANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final SN_ECOBANK X;
        public static final String Y;

        static {
            SN_ECOBANK.X = new SN_ECOBANK();
            SN_ECOBANK.Y = "SN_ECOBANK";
            SN_ECOBANK.CREATOR = new C2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return SN_ECOBANK.Y;
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

    public static final class SN_UBA implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final SN_UBA X;
        public static final String Y;

        static {
            SN_UBA.X = new SN_UBA();
            SN_UBA.Y = "SN_UBA";
            SN_UBA.CREATOR = new D2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return SN_UBA.Y;
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

    public static final class SN_WDF implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final SN_WDF X;
        public static final String Y;

        static {
            SN_WDF.X = new SN_WDF();
            SN_WDF.Y = "SN_WDF";
            SN_WDF.CREATOR = new E2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return SN_WDF.Y;
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

    public static final class TG_ORABANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final TG_ORABANK X;
        public static final String Y;

        static {
            TG_ORABANK.X = new TG_ORABANK();
            TG_ORABANK.Y = "TG_ORABANK";
            TG_ORABANK.CREATOR = new F2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return TG_ORABANK.Y;
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

    public static final class UG_EQUITYBANK implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public static final UG_EQUITYBANK X;
        public static final String Y;

        static {
            UG_EQUITYBANK.X = new UG_EQUITYBANK();
            UG_EQUITYBANK.Y = "UG_EQUITYBANK";
            UG_EQUITYBANK.CREATOR = new G2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
        public final String a() {
            return UG_EQUITYBANK.Y;
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

    public static final class UNKNOWN__ implements PartnerOrg {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new H2();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.PartnerOrg
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

    public static final n2 B;

    static {
        PartnerOrg.B = n2.a;
    }

    String a();
}

