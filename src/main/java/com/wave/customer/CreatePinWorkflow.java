package com.wave.customer;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public abstract class CreatePinWorkflow implements Parcelable {
    public static final class StepConfirmPin extends CreatePinWorkflow {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            StepConfirmPin.CREATOR = new c();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public StepConfirmPin(String s) {
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
            return object0 instanceof StepConfirmPin ? j.a(this.X, ((StepConfirmPin)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("StepConfirmPin(pin="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    private CreatePinWorkflow() {
    }

    public CreatePinWorkflow(int v) {
    }
}

