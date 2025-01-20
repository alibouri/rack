package com.wave.accounts;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public interface AccountEvent extends Parcelable {
    public static final class AccountAdded implements Parcelable, AccountEvent {
        public static final Parcelable.Creator CREATOR;
        public static final AccountAdded X;

        static {
            AccountAdded.X = new AccountAdded();
            AccountAdded.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        // Deobfuscation rating: LOW(20)
        @Override
        public final boolean equals(Object object0) {
            return this == object0 ? true : object0 instanceof AccountAdded;
        }

        @Override
        public final int hashCode() {
            return -1282045356;
        }

        @Override
        public final String toString() {
            return "AccountAdded";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeInt(1);
        }
    }

    public static final class AccountChangeAfterInvoluntaryLogout implements Parcelable, AccountEvent {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;

        static {
            AccountChangeAfterInvoluntaryLogout.CREATOR = new b();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public AccountChangeAfterInvoluntaryLogout(String s, String s1) {
            j.f(s, "fromMobile");
            j.f(s1, "toMobile");
            super();
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
            if(!(object0 instanceof AccountChangeAfterInvoluntaryLogout)) {
                return false;
            }
            return j.a(this.X, ((AccountChangeAfterInvoluntaryLogout)object0).X) ? j.a(this.Y, ((AccountChangeAfterInvoluntaryLogout)object0).Y) : false;
        }

        @Override
        public final int hashCode() {
            return this.Y.hashCode() + this.X.hashCode() * 0x1F;
        }

        @Override
        public final String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("AccountChangeAfterInvoluntaryLogout(fromMobile=");
            stringBuilder0.append(this.X);
            stringBuilder0.append(", toMobile=");
            return m5.b.y(stringBuilder0, this.Y, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
        }
    }

    public static final class AccountChangeAfterLogout implements Parcelable, AccountEvent {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;

        static {
            AccountChangeAfterLogout.CREATOR = new c();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public AccountChangeAfterLogout(String s, String s1) {
            j.f(s, "fromMobile");
            j.f(s1, "toMobile");
            super();
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
            if(!(object0 instanceof AccountChangeAfterLogout)) {
                return false;
            }
            return j.a(this.X, ((AccountChangeAfterLogout)object0).X) ? j.a(this.Y, ((AccountChangeAfterLogout)object0).Y) : false;
        }

        @Override
        public final int hashCode() {
            return this.Y.hashCode() + this.X.hashCode() * 0x1F;
        }

        @Override
        public final String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("AccountChangeAfterLogout(fromMobile=");
            stringBuilder0.append(this.X);
            stringBuilder0.append(", toMobile=");
            return m5.b.y(stringBuilder0, this.Y, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
        }
    }

    public static final class AccountSwitch implements Parcelable, AccountEvent {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            AccountSwitch.CREATOR = new d();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public AccountSwitch(String s) {
            j.f(s, "toMobile");
            super();
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
            return object0 instanceof AccountSwitch ? j.a(this.X, ((AccountSwitch)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return m5.b.y(new StringBuilder("AccountSwitch(toMobile="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

}

