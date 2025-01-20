package com.sendwave.shared;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;
import m5.b;

public abstract class LoginWorkflow implements Parcelable {
    public static final class StepApproveUserDevice extends LoginWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final FragmentHandle X;
        public final String Y;
        public final Boolean Z;

        static {
            StepApproveUserDevice.CREATOR = new g();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepApproveUserDevice(FragmentHandle fragmentHandle0, String s, Boolean boolean0) {
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s, "smsCode");
            super(0);
            this.X = fragmentHandle0;
            this.Y = s;
            this.Z = boolean0;
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
            if(!(object0 instanceof StepApproveUserDevice)) {
                return false;
            }
            if(!j.a(this.X, ((StepApproveUserDevice)object0).X)) {
                return false;
            }
            return j.a(this.Y, ((StepApproveUserDevice)object0).Y) ? j.a(this.Z, ((StepApproveUserDevice)object0).Z) : false;
        }

        @Override
        public final int hashCode() {
            int v = e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y);
            return this.Z == null ? v : v + this.Z.hashCode();
        }

        @Override
        public final String toString() {
            return "StepApproveUserDevice(tokenHandle=" + this.X + ", smsCode=" + this.Y + ", autofilled=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            boolean z;
            j.f(parcel0, "dest");
            this.X.writeToParcel(parcel0, v);
            parcel0.writeString(this.Y);
            Boolean boolean0 = this.Z;
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

    public static final class StepConfirmMagicLink extends LoginWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final FragmentHandle X;
        public final String Y;
        public final Boolean Z;

        static {
            StepConfirmMagicLink.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepConfirmMagicLink(FragmentHandle fragmentHandle0, String s, Boolean boolean0) {
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s, "smsCode");
            super(0);
            this.X = fragmentHandle0;
            this.Y = s;
            this.Z = boolean0;
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
            if(!(object0 instanceof StepConfirmMagicLink)) {
                return false;
            }
            if(!j.a(this.X, ((StepConfirmMagicLink)object0).X)) {
                return false;
            }
            return j.a(this.Y, ((StepConfirmMagicLink)object0).Y) ? j.a(this.Z, ((StepConfirmMagicLink)object0).Z) : false;
        }

        @Override
        public final int hashCode() {
            int v = e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y);
            return this.Z == null ? v : v + this.Z.hashCode();
        }

        @Override
        public final String toString() {
            return "StepConfirmMagicLink(tokenHandle=" + this.X + ", smsCode=" + this.Y + ", autofilled=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            boolean z;
            j.f(parcel0, "dest");
            this.X.writeToParcel(parcel0, v);
            parcel0.writeString(this.Y);
            Boolean boolean0 = this.Z;
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

    public static final class StepEnterName extends LoginWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final PartnerOrg Y;
        public final FragmentHandle Z;
        public final String b0;
        public final Boolean c0;

        static {
            StepEnterName.CREATOR = new i();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepEnterName(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, Boolean boolean0, String s, String s1) {
            j.f(s, "mobile");
            j.f(partnerOrg0, "partnerOrg");
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s1, "smsCode");
            super(0);
            this.X = s;
            this.Y = partnerOrg0;
            this.Z = fragmentHandle0;
            this.b0 = s1;
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
            if(!(object0 instanceof StepEnterName)) {
                return false;
            }
            if(!j.a(this.X, ((StepEnterName)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((StepEnterName)object0).Y)) {
                return false;
            }
            if(!j.a(this.Z, ((StepEnterName)object0).Z)) {
                return false;
            }
            return j.a(this.b0, ((StepEnterName)object0).b0) ? j.a(this.c0, ((StepEnterName)object0).c0) : false;
        }

        @Override
        public final int hashCode() {
            int v = e.s(e.s((this.Y.hashCode() + this.X.hashCode() * 0x1F) * 0x1F, 0x1F, this.Z.X), 0x1F, this.b0);
            return this.c0 == null ? v : v + this.c0.hashCode();
        }

        @Override
        public final String toString() {
            return "StepEnterName(mobile=" + this.X + ", partnerOrg=" + this.Y + ", tokenHandle=" + this.Z + ", smsCode=" + this.b0 + ", autofilled=" + this.c0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            boolean z;
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeParcelable(this.Y, v);
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

    public static final class StepVerifyAuthCode extends LoginWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final PartnerOrg Y;
        public final FragmentHandle Z;

        static {
            StepVerifyAuthCode.CREATOR = new com.sendwave.shared.j();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepVerifyAuthCode(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, String s) {
            j.f(s, "mobile");
            j.f(partnerOrg0, "partnerOrg");
            j.f(fragmentHandle0, "tokenHandle");
            super(0);
            this.X = s;
            this.Y = partnerOrg0;
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
            return this.Z.X.hashCode() + (this.Y.hashCode() + this.X.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        public final String toString() {
            return "StepVerifyAuthCode(mobile=" + this.X + ", partnerOrg=" + this.Y + ", tokenHandle=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeParcelable(this.Y, v);
            this.Z.writeToParcel(parcel0, v);
        }
    }

    public static final class StepVerifyPin extends LoginWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            StepVerifyPin.CREATOR = new k();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepVerifyPin(String s) {
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
            return object0 instanceof StepVerifyPin ? j.a(this.X, ((StepVerifyPin)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("StepVerifyPin(mobile="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    private LoginWorkflow() {
    }

    public LoginWorkflow(int v) {
    }
}

