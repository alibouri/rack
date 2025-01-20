package com.wave.customer;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public abstract class RecoverPinWorkflow implements Parcelable {
    public static final class StepConfirmPin extends RecoverPinWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;

        static {
            StepConfirmPin.CREATOR = new o();  // initializer: Ljava/lang/Object;-><init>()V
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

    public static final class StepVerifyAuthCode extends RecoverPinWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            StepVerifyAuthCode.CREATOR = new p();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepVerifyAuthCode(String s) {
            j.f(s, "pin");
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
            return object0 instanceof StepVerifyAuthCode ? j.a(this.X, ((StepVerifyAuthCode)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("StepVerifyAuthCode(pin="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    private RecoverPinWorkflow() {
    }

    public RecoverPinWorkflow(int v) {
    }
}

