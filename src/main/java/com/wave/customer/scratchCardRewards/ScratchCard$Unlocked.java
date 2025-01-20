package com.wave.customer.scratchCardRewards;

import Ea.T;
import Ea.V;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public interface ScratchCard.Unlocked extends T, Parcelable {
    public static final class KnownAward implements ScratchCard.Unlocked {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final ServerDate Z;
        public final V b0;
        public final ScratchCardTermsAndConditions c0;
        public final ScratchCard.Award.Known d0;

        static {
            KnownAward.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public KnownAward(String s, String s1, ServerDate serverDate0, V v0, ScratchCardTermsAndConditions scratchCardTermsAndConditions0, ScratchCard.Award.Known scratchCard$Award$Known0) {
            j.f(s, "id");
            j.f(v0, "background");
            super();
            this.X = s;
            this.Y = s1;
            this.Z = serverDate0;
            this.b0 = v0;
            this.c0 = scratchCardTermsAndConditions0;
            this.d0 = scratchCard$Award$Known0;
        }

        @Override  // Ea.T
        public final String b() {
            return this.X;
        }

        @Override  // com.wave.customer.scratchCardRewards.ScratchCard$Unlocked
        public final V d() {
            return this.b0;
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
            if(!(object0 instanceof KnownAward)) {
                return false;
            }
            if(!j.a(this.X, ((KnownAward)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((KnownAward)object0).Y)) {
                return false;
            }
            if(!j.a(this.Z, ((KnownAward)object0).Z)) {
                return false;
            }
            if(this.b0 != ((KnownAward)object0).b0) {
                return false;
            }
            return j.a(this.c0, ((KnownAward)object0).c0) ? j.a(this.d0, ((KnownAward)object0).d0) : false;
        }

        @Override
        public final int hashCode() {
            int v = this.X.hashCode();
            int v1 = 0;
            int v2 = this.Y == null ? 0 : this.Y.hashCode();
            int v3 = this.Z == null ? 0 : this.Z.hashCode();
            int v4 = this.b0.hashCode();
            int v5 = this.c0 == null ? 0 : this.c0.hashCode();
            ScratchCard.Award.Known scratchCard$Award$Known0 = this.d0;
            if(scratchCard$Award$Known0 != null) {
                v1 = scratchCard$Award$Known0.hashCode();
            }
            return ((v4 + ((v * 0x1F + v2) * 0x1F + v3) * 0x1F) * 0x1F + v5) * 0x1F + v1;
        }

        @Override  // com.wave.customer.scratchCardRewards.ScratchCard$Unlocked
        public final ServerDate i() {
            return this.Z;
        }

        @Override
        public final String toString() {
            return "KnownAward(id=" + this.X + ", unlockedDescription=" + this.Y + ", whenExpires=" + this.Z + ", background=" + this.b0 + ", termsAndConditions=" + this.c0 + ", award=" + this.d0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            ServerDate serverDate0 = this.Z;
            if(serverDate0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                serverDate0.writeToParcel(parcel0, v);
            }
            parcel0.writeString(this.b0.name());
            ScratchCardTermsAndConditions scratchCardTermsAndConditions0 = this.c0;
            if(scratchCardTermsAndConditions0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                scratchCardTermsAndConditions0.writeToParcel(parcel0, v);
            }
            parcel0.writeParcelable(this.d0, v);
        }
    }

    public static final class UnknownAward implements ScratchCard.Unlocked {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final String Y;
        public final ServerDate Z;
        public final V b0;
        public final ScratchCardTermsAndConditions c0;

        static {
            UnknownAward.CREATOR = new i();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UnknownAward(String s, String s1, ServerDate serverDate0, V v0, ScratchCardTermsAndConditions scratchCardTermsAndConditions0) {
            j.f(s, "id");
            j.f(v0, "background");
            super();
            this.X = s;
            this.Y = s1;
            this.Z = serverDate0;
            this.b0 = v0;
            this.c0 = scratchCardTermsAndConditions0;
        }

        @Override  // Ea.T
        public final String b() {
            return this.X;
        }

        @Override  // com.wave.customer.scratchCardRewards.ScratchCard$Unlocked
        public final V d() {
            return this.b0;
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
            if(!(object0 instanceof UnknownAward)) {
                return false;
            }
            if(!j.a(this.X, ((UnknownAward)object0).X)) {
                return false;
            }
            if(!j.a(this.Y, ((UnknownAward)object0).Y)) {
                return false;
            }
            if(!j.a(this.Z, ((UnknownAward)object0).Z)) {
                return false;
            }
            return this.b0 == ((UnknownAward)object0).b0 ? j.a(this.c0, ((UnknownAward)object0).c0) : false;
        }

        @Override
        public final int hashCode() {
            int v = this.X.hashCode();
            int v1 = 0;
            int v2 = this.Y == null ? 0 : this.Y.hashCode();
            int v3 = this.Z == null ? 0 : this.Z.hashCode();
            int v4 = this.b0.hashCode();
            ScratchCardTermsAndConditions scratchCardTermsAndConditions0 = this.c0;
            if(scratchCardTermsAndConditions0 != null) {
                v1 = scratchCardTermsAndConditions0.hashCode();
            }
            return (v4 + ((v * 0x1F + v2) * 0x1F + v3) * 0x1F) * 0x1F + v1;
        }

        @Override  // com.wave.customer.scratchCardRewards.ScratchCard$Unlocked
        public final ServerDate i() {
            return this.Z;
        }

        @Override
        public final String toString() {
            return "UnknownAward(id=" + this.X + ", unlockedDescription=" + this.Y + ", whenExpires=" + this.Z + ", background=" + this.b0 + ", termsAndConditions=" + this.c0 + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeString(this.Y);
            ServerDate serverDate0 = this.Z;
            if(serverDate0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                serverDate0.writeToParcel(parcel0, v);
            }
            parcel0.writeString(this.b0.name());
            ScratchCardTermsAndConditions scratchCardTermsAndConditions0 = this.c0;
            if(scratchCardTermsAndConditions0 == null) {
                parcel0.writeInt(0);
                return;
            }
            parcel0.writeInt(1);
            scratchCardTermsAndConditions0.writeToParcel(parcel0, v);
        }
    }

    V d();

    ServerDate i();
}

