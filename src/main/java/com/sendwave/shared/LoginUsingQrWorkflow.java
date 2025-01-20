package com.sendwave.shared;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;

public abstract class LoginUsingQrWorkflow implements Parcelable {
    public static final class StepCreatePin extends LoginUsingQrWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final FragmentHandle Z;
        public final String b0;
        public final Boolean c0;

        static {
            StepCreatePin.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepCreatePin(String s, String s1, FragmentHandle fragmentHandle0, String s2, Boolean boolean0) {
            j.f(s, "mobile");
            j.f(s1, "qrText");
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s2, "smsCode");
            super(0);
            this.X = s;
            this.Y = s1;
            this.Z = fragmentHandle0;
            this.b0 = s2;
            this.c0 = boolean0;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override
        public final boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof StepCreatePin)) {
                return false;
            }
            if(!j.a(this.X, ((StepCreatePin)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((StepCreatePin)object0).Y)) {
                return false;
            }
            if(!j.a(this.Z, ((StepCreatePin)object0).Z)) {
                return false;
            }
            return j.a(this.b0, ((StepCreatePin)object0).b0) ? j.a(this.c0, ((StepCreatePin)object0).c0) : false;
        }

        @Override
        public final int hashCode() {
            int v = e.s(e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z.X), 0x1F, this.b0);
            return this.c0 == null ? v : v + this.c0.hashCode();
        }

        @Override
        public final String toString() {
            return "StepCreatePin(mobile=" + this.X + ", qrText=" + this.Y + ", tokenHandle=" + this.Z + ", smsCode=" + this.b0 + ", autofilled=" + this.c0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            boolean z;
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            this.Z.writeToParcel(parcel0, v);
            parcel0.writeString(this.b0);
            Boolean boolean0 = this.c0;
            if(boolean0 == null) {
                z = false;
            }
            else {
                parcel0.writeInt(1);
                z = boolean0.booleanValue();
            }
            parcel0.writeInt(((int)z));
        }
    }

    public static final class StepScanQr extends LoginUsingQrWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            StepScanQr.CREATOR = new b();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepScanQr(String s) {
            j.f(s, "mobile");
            super(0);
            this.X = s;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override
        public final boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof StepScanQr ? j.a(this.X, ((StepScanQr)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return m5.b.y(new StringBuilder("StepScanQr(mobile="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    public static final class StepVerifyAuthCode extends LoginUsingQrWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final FragmentHandle Z;

        static {
            StepVerifyAuthCode.CREATOR = new c();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepVerifyAuthCode(FragmentHandle fragmentHandle0, String s, String s1) {
            j.f(s, "mobile");
            j.f(s1, "qrText");
            j.f(fragmentHandle0, "tokenHandle");
            super(0);
            this.X = s;
            this.Y = s1;
            this.Z = fragmentHandle0;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override
        public final boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof StepVerifyAuthCode)) {
                return false;
            }
            if(!j.a(this.X, ((StepVerifyAuthCode)object0).X)) {
                return false;
            }
            return j.a(this.Y, ((StepVerifyAuthCode)object0).Y) ? j.a(this.Z, ((StepVerifyAuthCode)object0).Z) : false;
        }

        @Override
        public final int hashCode() {
            return this.Z.X.hashCode() + e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y);
        }

        @Override
        public final String toString() {
            return "StepVerifyAuthCode(mobile=" + this.X + ", qrText=" + this.Y + ", tokenHandle=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            this.Z.writeToParcel(parcel0, v);
        }
    }

    private LoginUsingQrWorkflow() {
    }

    public LoginUsingQrWorkflow(int v) {
    }
}

