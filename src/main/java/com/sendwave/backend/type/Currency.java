package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface Currency extends Parcelable {
    public static final class CAD implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final CAD X;
        public static final String Y;

        static {
            CAD.X = new CAD();
            CAD.Y = "CAD";
            CAD.CREATOR = new L();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return CAD.Y;
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

    public static final class CFA implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final CFA X;
        public static final String Y;

        static {
            CFA.X = new CFA();
            CFA.Y = "CFA";
            CFA.CREATOR = new M();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return CFA.Y;
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

    public static final class ETB implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final ETB X;
        public static final String Y;

        static {
            ETB.X = new ETB();
            ETB.Y = "ETB";
            ETB.CREATOR = new O();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return ETB.Y;
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

    public static final class GBP implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final GBP X;
        public static final String Y;

        static {
            GBP.X = new GBP();
            GBP.Y = "GBP";
            GBP.CREATOR = new P();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return GBP.Y;
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

    public static final class GHS implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final GHS X;
        public static final String Y;

        static {
            GHS.X = new GHS();
            GHS.Y = "GHS";
            GHS.CREATOR = new Q();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return GHS.Y;
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

    public static final class GMD implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final GMD X;
        public static final String Y;

        static {
            GMD.X = new GMD();
            GMD.Y = "GMD";
            GMD.CREATOR = new S();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return GMD.Y;
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

    public static final class GNF implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final GNF X;
        public static final String Y;

        static {
            GNF.X = new GNF();
            GNF.Y = "GNF";
            GNF.CREATOR = new T();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return GNF.Y;
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

    public static final class KES implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final KES X;
        public static final String Y;

        static {
            KES.X = new KES();
            KES.Y = "KES";
            KES.CREATOR = new U();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return KES.Y;
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

    public static final class NGN implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final NGN X;
        public static final String Y;

        static {
            NGN.X = new NGN();
            NGN.Y = "NGN";
            NGN.CREATOR = new V();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return NGN.Y;
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

    public static final class QQD implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final QQD X;
        public static final String Y;

        static {
            QQD.X = new QQD();
            QQD.Y = "QQD";
            QQD.CREATOR = new W();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return QQD.Y;
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

    public static final class SLE implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final SLE X;
        public static final String Y;

        static {
            SLE.X = new SLE();
            SLE.Y = "SLE";
            SLE.CREATOR = new X();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return SLE.Y;
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

    public static final class TZS implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final TZS X;
        public static final String Y;

        static {
            TZS.X = new TZS();
            TZS.Y = "TZS";
            TZS.CREATOR = new Y();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return TZS.Y;
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

    public static final class UGX implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final UGX X;
        public static final String Y;

        static {
            UGX.X = new UGX();
            UGX.Y = "UGX";
            UGX.CREATOR = new Z();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return UGX.Y;
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

    public static final class UNIT implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final UNIT X;
        public static final String Y;

        static {
            UNIT.X = new UNIT();
            UNIT.Y = "UNIT";
            UNIT.CREATOR = new a0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return UNIT.Y;
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

    public static final class UNKNOWN__ implements Currency {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new b0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.Currency
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

    public static final class USD implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final USD X;
        public static final String Y;

        static {
            USD.X = new USD();
            USD.Y = "USD";
            USD.CREATOR = new c0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return USD.Y;
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

    public static final class XAF implements Currency {
        public static final Parcelable.Creator CREATOR;
        public static final XAF X;
        public static final String Y;

        static {
            XAF.X = new XAF();
            XAF.Y = "XAF";
            XAF.CREATOR = new d0();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.Currency
        public final String a() {
            return XAF.Y;
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

    public static final N q;

    static {
        Currency.q = N.a;
    }

    String a();
}

