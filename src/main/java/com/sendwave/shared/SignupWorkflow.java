package com.sendwave.shared;

import A3.e;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;

public abstract class SignupWorkflow implements Parcelable {
    public static final class StepCreatePin extends SignupWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final FragmentHandle Y;
        public final String Z;
        public final Boolean b0;
        public final PartnerOrg c0;
        public final String d0;

        static {
            StepCreatePin.CREATOR = new l();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepCreatePin(String s, FragmentHandle fragmentHandle0, String s1, Boolean boolean0, PartnerOrg partnerOrg0, String s2) {
            j.f(s, "mobile");
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s1, "smsCode");
            j.f(partnerOrg0, "partnerOrg");
            j.f(s2, "name");
            super(0);
            this.X = s;
            this.Y = fragmentHandle0;
            this.Z = s1;
            this.b0 = boolean0;
            this.c0 = partnerOrg0;
            this.d0 = s2;
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
            if(!j.a(this.b0, ((StepCreatePin)object0).b0)) {
                return false;
            }
            return j.a(this.c0, ((StepCreatePin)object0).c0) ? j.a(this.d0, ((StepCreatePin)object0).d0) : false;
        }

        @Override
        public final int hashCode() {
            int v = e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y.X), 0x1F, this.Z);
            return this.b0 == null ? this.d0.hashCode() + (this.c0.hashCode() + v * 0x1F) * 0x1F : this.d0.hashCode() + (this.c0.hashCode() + (v + this.b0.hashCode()) * 0x1F) * 0x1F;
        }

        @Override
        public final String toString() {
            return "StepCreatePin(mobile=" + this.X + ", tokenHandle=" + this.Y + ", smsCode=" + this.Z + ", autofilled=" + this.b0 + ", partnerOrg=" + this.c0 + ", name=" + this.d0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            boolean z;
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            this.Y.writeToParcel(parcel0, v);
            parcel0.writeString(this.Z);
            Boolean boolean0 = this.b0;
            if(boolean0 == null) {
                z = false;
            }
            else {
                parcel0.writeInt(1);
                z = boolean0.booleanValue();
            }
            parcel0.writeInt(((int)z));
            parcel0.writeParcelable(this.c0, v);
            parcel0.writeString(this.d0);
        }
    }

    public static final class StepEnterName extends SignupWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final FragmentHandle Y;
        public final String Z;
        public final Boolean b0;
        public final PartnerOrg c0;

        static {
            StepEnterName.CREATOR = new m();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepEnterName(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, Boolean boolean0, String s, String s1) {
            j.f(s, "mobile");
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s1, "smsCode");
            j.f(partnerOrg0, "partnerOrg");
            super(0);
            this.X = s;
            this.Y = fragmentHandle0;
            this.Z = s1;
            this.b0 = boolean0;
            this.c0 = partnerOrg0;
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
            int v = e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y.X), 0x1F, this.Z);
            return this.b0 == null ? this.c0.hashCode() + v * 0x1F : this.c0.hashCode() + (v + this.b0.hashCode()) * 0x1F;
        }

        @Override
        public final String toString() {
            return "StepEnterName(mobile=" + this.X + ", tokenHandle=" + this.Y + ", smsCode=" + this.Z + ", autofilled=" + this.b0 + ", partnerOrg=" + this.c0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            boolean z;
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            this.Y.writeToParcel(parcel0, v);
            parcel0.writeString(this.Z);
            Boolean boolean0 = this.b0;
            if(boolean0 == null) {
                z = false;
            }
            else {
                parcel0.writeInt(1);
                z = boolean0.booleanValue();
            }
            parcel0.writeInt(((int)z));
            parcel0.writeParcelable(this.c0, v);
        }
    }

    public static final class StepVerifyAuthCode extends SignupWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final FragmentHandle Y;
        public final PartnerOrg Z;

        static {
            StepVerifyAuthCode.CREATOR = new n();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepVerifyAuthCode(FragmentHandle fragmentHandle0, PartnerOrg partnerOrg0, String s) {
            j.f(s, "mobile");
            j.f(fragmentHandle0, "tokenHandle");
            j.f(partnerOrg0, "partnerOrg");
            super(0);
            this.X = s;
            this.Y = fragmentHandle0;
            this.Z = partnerOrg0;
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
            return this.Z.hashCode() + e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y.X);
        }

        @Override
        public final String toString() {
            return "StepVerifyAuthCode(mobile=" + this.X + ", tokenHandle=" + this.Y + ", partnerOrg=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            this.Y.writeToParcel(parcel0, v);
            parcel0.writeParcelable(this.Z, v);
        }
    }

    private SignupWorkflow() {
    }

    public SignupWorkflow(int v) {
    }
}

