package com.sendwave.shared;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import m5.b;

public abstract class LoginWithPinRecoveryWorkflow implements Parcelable {
    public static final class StepConfirmPin extends LoginWithPinRecoveryWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;

        static {
            StepConfirmPin.CREATOR = new d();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepConfirmPin(String s, String s1) {
            j.f(s, "mobile");
            j.f(s1, "enteredPin");
            super(0);
            this.X = s;
            this.Y = s1;
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
            if(!(object0 instanceof StepConfirmPin)) {
                return false;
            }
            return j.a(this.X, ((StepConfirmPin)object0).X) ? j.a(this.Y, ((StepConfirmPin)object0).Y) : false;
        }

        @Override
        public final int hashCode() {
            return this.Y.hashCode() + this.X.hashCode() * 0x1F;
        }

        @Override
        public final String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("StepConfirmPin(mobile=");
            stringBuilder0.append(this.X);
            stringBuilder0.append(", enteredPin=");
            return b.y(stringBuilder0, this.Y, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
        }
    }

    public static final class StepCreatePin extends LoginWithPinRecoveryWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            StepCreatePin.CREATOR = new e();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepCreatePin(String s) {
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
            return object0 instanceof StepCreatePin ? j.a(this.X, ((StepCreatePin)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("StepCreatePin(mobile="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    public static final class StepVerifyAuthCode extends LoginWithPinRecoveryWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final FragmentHandle Z;

        static {
            StepVerifyAuthCode.CREATOR = new f();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepVerifyAuthCode(FragmentHandle fragmentHandle0, String s, String s1) {
            j.f(s, "mobile");
            j.f(s1, "pin");
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
            return this.Z.X.hashCode() + A3.e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y);
        }

        @Override
        public final String toString() {
            return "StepVerifyAuthCode(mobile=" + this.X + ", pin=" + this.Y + ", tokenHandle=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            this.Z.writeToParcel(parcel0, v);
        }
    }

    private LoginWithPinRecoveryWorkflow() {
    }

    public LoginWithPinRecoveryWorkflow(int v) {
    }
}

