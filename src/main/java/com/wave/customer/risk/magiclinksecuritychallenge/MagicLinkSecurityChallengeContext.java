package com.wave.customer.risk.magiclinksecuritychallenge;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;
import m5.b;

public abstract class MagicLinkSecurityChallengeContext implements Parcelable {
    public static final class Authenticated extends MagicLinkSecurityChallengeContext {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            Authenticated.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public Authenticated(String s) {
            j.f(s, "mobile");
            super(0);
            this.X = s;
        }

        @Override  // com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeContext
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
            return object0 instanceof Authenticated ? j.a(this.X, ((Authenticated)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("Authenticated(mobile="), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    public static final class Unauthenticated extends MagicLinkSecurityChallengeContext {
        public static final Parcelable.Creator CREATOR;
        public final FragmentHandle X;
        public final String Y;

        static {
            Unauthenticated.CREATOR = new com.wave.customer.risk.magiclinksecuritychallenge.b();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public Unauthenticated(FragmentHandle fragmentHandle0, String s) {
            j.f(fragmentHandle0, "tokenHandle");
            j.f(s, "mobile");
            super(0);
            this.X = fragmentHandle0;
            this.Y = s;
        }

        @Override  // com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeContext
        public final String b() {
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
            if(!(object0 instanceof Unauthenticated)) {
                return false;
            }
            return j.a(this.X, ((Unauthenticated)object0).X) ? j.a(this.Y, ((Unauthenticated)object0).Y) : false;
        }

        @Override
        public final int hashCode() {
            return this.Y.hashCode() + this.X.X.hashCode() * 0x1F;
        }

        @Override
        public final String toString() {
            return "Unauthenticated(tokenHandle=" + this.X + ", mobile=" + this.Y + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeParcelable(this.X, v);
            parcel0.writeString(this.Y);
        }
    }

    private MagicLinkSecurityChallengeContext() {
    }

    public MagicLinkSecurityChallengeContext(int v) {
    }

    public abstract String b();
}

