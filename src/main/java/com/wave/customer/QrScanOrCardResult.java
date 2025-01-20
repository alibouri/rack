package com.wave.customer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public interface QrScanOrCardResult extends Parcelable {
    public static final class ApiCheckoutPayment implements QrScanOrCardResult {
        public static final Parcelable.Creator CREATOR;
        public final CheckoutConfirmation X;

        static {
            ApiCheckoutPayment.CREATOR = new j();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public ApiCheckoutPayment(CheckoutConfirmation customerAppAction$CheckoutConfirmation0) {
            Nb.j.f(customerAppAction$CheckoutConfirmation0, "action");
            super();
            this.X = customerAppAction$CheckoutConfirmation0;
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
            return object0 instanceof ApiCheckoutPayment ? Nb.j.a(this.X, ((ApiCheckoutPayment)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return "ApiCheckoutPayment(action=" + this.X + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            Nb.j.f(parcel0, "dest");
            this.X.writeToParcel(parcel0, v);
        }
    }

    public static final class MerchantPayment implements QrScanOrCardResult {
        public static final Parcelable.Creator CREATOR;
        public final MerchantPaymentConfirmation X;

        static {
            MerchantPayment.CREATOR = new k();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public MerchantPayment(MerchantPaymentConfirmation customerAppAction$MerchantPaymentConfirmation0) {
            Nb.j.f(customerAppAction$MerchantPaymentConfirmation0, "action");
            super();
            this.X = customerAppAction$MerchantPaymentConfirmation0;
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
            return object0 instanceof MerchantPayment ? Nb.j.a(this.X, ((MerchantPayment)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return "MerchantPayment(action=" + this.X + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            Nb.j.f(parcel0, "dest");
            this.X.writeToParcel(parcel0, v);
        }
    }

    public static final class Success implements QrScanOrCardResult {
        public static final Parcelable.Creator CREATOR;
        public static final Success X;

        static {
            Success.X = new Success();
            Success.CREATOR = new l();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            Nb.j.f(parcel0, "dest");
            parcel0.writeInt(1);
        }
    }

}

