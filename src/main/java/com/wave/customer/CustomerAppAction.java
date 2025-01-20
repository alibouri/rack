package com.wave.customer;

import A3.e;
import Nb.j;
import Y8.o;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.models.CurrencyAmount;
import java.math.BigDecimal;
import java.util.Map.Entry;
import java.util.Map;

public interface CustomerAppAction extends Parcelable {
    public static final class CheckoutConfirmation implements CustomerAppAction {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final CurrencyAmount Z;
        public final String b0;
        public final ActionSource c0;

        static {
            CheckoutConfirmation.CREATOR = new d();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public CheckoutConfirmation(String s, String s1, CurrencyAmount currencyAmount0, String s2, ActionSource actionSource0) {
            j.f(s, "checkoutSessionId");
            j.f(s1, "merchantName");
            j.f(currencyAmount0, "amount");
            j.f(s2, "actionUrl");
            j.f(actionSource0, "actionSource");
            super();
            this.X = s;
            this.Y = s1;
            this.Z = currencyAmount0;
            this.b0 = s2;
            this.c0 = actionSource0;
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
            if(!(object0 instanceof CheckoutConfirmation)) {
                return false;
            }
            if(!j.a(this.X, ((CheckoutConfirmation)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((CheckoutConfirmation)object0).Y)) {
                return false;
            }
            if(!j.a(this.Z, ((CheckoutConfirmation)object0).Z)) {
                return false;
            }
            return j.a(this.b0, ((CheckoutConfirmation)object0).b0) ? j.a(this.c0, ((CheckoutConfirmation)object0).c0) : false;
        }

        @Override
        public final int hashCode() {
            return this.c0.hashCode() + e.s(o.n(this.Z, e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F), 0x1F, this.b0);
        }

        @Override
        public final String toString() {
            return "CheckoutConfirmation(checkoutSessionId=" + this.X + ", merchantName=" + this.Y + ", amount=" + this.Z + ", actionUrl=" + this.b0 + ", actionSource=" + this.c0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            parcel0.writeParcelable(this.Z, v);
            parcel0.writeString(this.b0);
            parcel0.writeParcelable(this.c0, v);
        }
    }

    public static final class LaunchUri implements CustomerAppAction {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final ActionSource Z;

        static {
            LaunchUri.CREATOR = new com.wave.customer.e();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public LaunchUri(String s, String s1, ActionSource actionSource0) {
            j.f(s, "uri");
            j.f(s1, "actionUrl");
            j.f(actionSource0, "actionSource");
            super();
            this.X = s;
            this.Y = s1;
            this.Z = actionSource0;
        }

        public final String b() {
            return this.X;
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
            if(!(object0 instanceof LaunchUri)) {
                return false;
            }
            if(!j.a(this.X, ((LaunchUri)object0).X)) {
                return false;
            }
            return j.a(this.Y, ((LaunchUri)object0).Y) ? j.a(this.Z, ((LaunchUri)object0).Z) : false;
        }

        @Override
        public final int hashCode() {
            return this.Z.hashCode() + e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y);
        }

        @Override
        public final String toString() {
            return "LaunchUri(uri=" + this.X + ", actionUrl=" + this.Y + ", actionSource=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            parcel0.writeParcelable(this.Z, v);
        }
    }

    public static final class MerchantPayment implements CustomerAppAction {
        public static final Parcelable.Creator CREATOR;
        public final FragmentHandle X;
        public final String Y;
        public final ActionSource Z;
        public final Map b0;

        static {
            MerchantPayment.CREATOR = new f();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public MerchantPayment(FragmentHandle fragmentHandle0, String s, ActionSource actionSource0, Map map0) {
            j.f(fragmentHandle0, "fragmentHandle");
            j.f(s, "actionUrl");
            j.f(actionSource0, "actionSource");
            super();
            this.X = fragmentHandle0;
            this.Y = s;
            this.Z = actionSource0;
            this.b0 = map0;
        }

        public final ActionSource b() {
            return this.Z;
        }

        public final String c() {
            return this.Y;
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
            if(!(object0 instanceof MerchantPayment)) {
                return false;
            }
            if(!j.a(this.X, ((MerchantPayment)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((MerchantPayment)object0).Y)) {
                return false;
            }
            return j.a(this.Z, ((MerchantPayment)object0).Z) ? j.a(this.b0, ((MerchantPayment)object0).b0) : false;
        }

        public final FragmentHandle f() {
            return this.X;
        }

        @Override
        public final int hashCode() {
            return this.b0.hashCode() + (this.Z.hashCode() + e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y)) * 0x1F;
        }

        @Override
        public final String toString() {
            return "MerchantPayment(fragmentHandle=" + this.X + ", actionUrl=" + this.Y + ", actionSource=" + this.Z + ", prefilledFields=" + this.b0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeParcelable(this.X, v);
            parcel0.writeString(this.Y);
            parcel0.writeParcelable(this.Z, v);
            parcel0.writeInt(this.b0.size());
            for(Object object0: this.b0.entrySet()) {
                parcel0.writeString(((String)((Map.Entry)object0).getKey()));
                parcel0.writeString(((String)((Map.Entry)object0).getValue()));
            }
        }
    }

    public static final class MerchantPaymentConfirmation implements CustomerAppAction {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final BigDecimal Z;
        public final String b0;
        public final ActionSource c0;

        static {
            MerchantPaymentConfirmation.CREATOR = new g();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public MerchantPaymentConfirmation(String s, String s1, BigDecimal bigDecimal0, String s2, ActionSource actionSource0) {
            j.f(s, "merchantId");
            j.f(bigDecimal0, "amount");
            j.f(s2, "actionUrl");
            j.f(actionSource0, "actionSource");
            super();
            this.X = s;
            this.Y = s1;
            this.Z = bigDecimal0;
            this.b0 = s2;
            this.c0 = actionSource0;
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
            if(!(object0 instanceof MerchantPaymentConfirmation)) {
                return false;
            }
            if(!j.a(this.X, ((MerchantPaymentConfirmation)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((MerchantPaymentConfirmation)object0).Y)) {
                return false;
            }
            if(!j.a(this.Z, ((MerchantPaymentConfirmation)object0).Z)) {
                return false;
            }
            return j.a(this.b0, ((MerchantPaymentConfirmation)object0).b0) ? j.a(this.c0, ((MerchantPaymentConfirmation)object0).c0) : false;
        }

        @Override
        public final int hashCode() {
            int v = this.X.hashCode();
            return this.Y == null ? this.c0.hashCode() + e.s((this.Z.hashCode() + v * 961) * 0x1F, 0x1F, this.b0) : this.c0.hashCode() + e.s((this.Z.hashCode() + (v * 0x1F + this.Y.hashCode()) * 0x1F) * 0x1F, 0x1F, this.b0);
        }

        @Override
        public final String toString() {
            return "MerchantPaymentConfirmation(merchantId=" + this.X + ", merchantUId=" + this.Y + ", amount=" + this.Z + ", actionUrl=" + this.b0 + ", actionSource=" + this.c0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            parcel0.writeSerializable(this.Z);
            parcel0.writeString(this.b0);
            parcel0.writeParcelable(this.c0, v);
        }
    }

    public static final class P2PSend implements CustomerAppAction {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final String Z;
        public final ActionSource b0;

        static {
            P2PSend.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public P2PSend(String s, String s1, String s2, ActionSource actionSource0) {
            j.f(s, "name");
            j.f(s1, "mobile");
            j.f(s2, "actionUrl");
            j.f(actionSource0, "actionSource");
            super();
            this.X = s;
            this.Y = s1;
            this.Z = s2;
            this.b0 = actionSource0;
        }

        public final ActionSource b() {
            return this.b0;
        }

        public final String c() {
            return this.Z;
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
            if(!(object0 instanceof P2PSend)) {
                return false;
            }
            if(!j.a(this.X, ((P2PSend)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((P2PSend)object0).Y)) {
                return false;
            }
            return j.a(this.Z, ((P2PSend)object0).Z) ? j.a(this.b0, ((P2PSend)object0).b0) : false;
        }

        public final String f() {
            return this.Y;
        }

        public final String g() {
            return this.X;
        }

        @Override
        public final int hashCode() {
            return this.b0.hashCode() + e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z);
        }

        @Override
        public final String toString() {
            return "P2PSend(name=" + this.X + ", mobile=" + this.Y + ", actionUrl=" + this.Z + ", actionSource=" + this.b0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            parcel0.writeString(this.Z);
            parcel0.writeParcelable(this.b0, v);
        }
    }

    public static final class ShowDeal implements CustomerAppAction {
        public static final Parcelable.Creator CREATOR;
        public final FragmentHandle X;
        public final String Y;
        public final ActionSource Z;

        static {
            ShowDeal.CREATOR = new i();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public ShowDeal(FragmentHandle fragmentHandle0, String s, ActionSource actionSource0) {
            j.f(fragmentHandle0, "fragmentHandle");
            j.f(s, "actionUrl");
            j.f(actionSource0, "actionSource");
            super();
            this.X = fragmentHandle0;
            this.Y = s;
            this.Z = actionSource0;
        }

        public final FragmentHandle b() {
            return this.X;
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
            if(!(object0 instanceof ShowDeal)) {
                return false;
            }
            if(!j.a(this.X, ((ShowDeal)object0).X)) {
                return false;
            }
            return j.a(this.Y, ((ShowDeal)object0).Y) ? j.a(this.Z, ((ShowDeal)object0).Z) : false;
        }

        @Override
        public final int hashCode() {
            return this.Z.hashCode() + e.s(this.X.X.hashCode() * 0x1F, 0x1F, this.Y);
        }

        @Override
        public final String toString() {
            return "ShowDeal(fragmentHandle=" + this.X + ", actionUrl=" + this.Y + ", actionSource=" + this.Z + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeParcelable(this.X, v);
            parcel0.writeString(this.Y);
            parcel0.writeParcelable(this.Z, v);
        }
    }

}

