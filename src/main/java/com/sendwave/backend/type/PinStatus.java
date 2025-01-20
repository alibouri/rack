package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public interface PinStatus extends Parcelable {
    public static final class CORRECT implements PinStatus {
        public static final Parcelable.Creator CREATOR;
        public static final CORRECT X;

        static {
            CORRECT.X = new CORRECT();
            CORRECT.CREATOR = new U2();  // initializer: Ljava/lang/Object;-><init>()V
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

    public static final class INCORRECT implements PinStatus {
        public static final Parcelable.Creator CREATOR;
        public static final INCORRECT X;

        static {
            INCORRECT.X = new INCORRECT();
            INCORRECT.CREATOR = new V2();  // initializer: Ljava/lang/Object;-><init>()V
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

    public static final class RECOVERABLE implements PinStatus {
        public static final Parcelable.Creator CREATOR;
        public static final RECOVERABLE X;

        static {
            RECOVERABLE.X = new RECOVERABLE();
            RECOVERABLE.CREATOR = new W2();  // initializer: Ljava/lang/Object;-><init>()V
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

}

