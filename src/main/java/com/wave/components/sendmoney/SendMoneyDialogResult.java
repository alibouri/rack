package com.wave.components.sendmoney;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public abstract class SendMoneyDialogResult implements Parcelable {
    public static final class EditRecipient extends SendMoneyDialogResult {
        public static final Parcelable.Creator CREATOR;
        public static final EditRecipient X;

        static {
            EditRecipient.X = new EditRecipient();
            EditRecipient.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        private EditRecipient() {
            super(0);
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

    public static final class Success extends SendMoneyDialogResult {
        public static final Parcelable.Creator CREATOR;
        public static final Success X;

        static {
            Success.X = new Success();
            Success.CREATOR = new b();  // initializer: Ljava/lang/Object;-><init>()V
        }

        private Success() {
            super(0);
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

    private SendMoneyDialogResult() {
    }

    public SendMoneyDialogResult(int v) {
    }
}

