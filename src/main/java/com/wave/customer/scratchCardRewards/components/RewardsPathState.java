package com.wave.customer.scratchCardRewards.components;

import Ea.V;
import M.J;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class RewardsPathState implements Parcelable {
    public static final class Instructions implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public final String X;
        public final List Y;

        static {
            Instructions.CREATOR = new i();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public Instructions(String s, List list0) {
            j.f(list0, "instructions");
            super();
            this.X = s;
            this.Y = list0;
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
            if(!(object0 instanceof Instructions)) {
                return false;
            }
            return j.a(this.X, ((Instructions)object0).X) ? j.a(this.Y, ((Instructions)object0).Y) : false;
        }

        @Override
        public final int hashCode() {
            return this.X == null ? this.Y.hashCode() : this.Y.hashCode() + this.X.hashCode() * 0x1F;
        }

        @Override
        public final String toString() {
            return "Instructions(currentStepDescription=" + this.X + ", instructions=" + this.Y + ")";
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
            parcel0.writeStringList(this.Y);
        }
    }

    public interface Reward extends Parcelable {
        public static final class ScratchCard implements Reward {
            public static final Parcelable.Creator CREATOR;
            public final int X;
            public final V Y;

            static {
                ScratchCard.CREATOR = new com.wave.customer.scratchCardRewards.components.j();  // initializer: Ljava/lang/Object;-><init>()V
            }

            public ScratchCard(int v, V v1) {
                this.X = v;
                this.Y = v1;
            }

            @Override  // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override  // com.wave.customer.scratchCardRewards.components.RewardsPathState$Reward
            public final int e() {
                return this.X;
            }

            @Override
            public final boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof ScratchCard)) {
                    return false;
                }
                return this.X == ((ScratchCard)object0).X ? this.Y == ((ScratchCard)object0).Y : false;
            }

            @Override
            public final int hashCode() {
                int v = this.X * 0x1F;
                return this.Y == null ? v : v + this.Y.hashCode();
            }

            @Override
            public final String toString() {
                return "ScratchCard(step=" + this.X + ", bg=" + this.Y + ")";
            }

            @Override  // android.os.Parcelable
            public final void writeToParcel(Parcel parcel0, int v) {
                j.f(parcel0, "dest");
                parcel0.writeInt(this.X);
                V v1 = this.Y;
                if(v1 == null) {
                    parcel0.writeInt(0);
                    return;
                }
                parcel0.writeInt(1);
                parcel0.writeString(v1.name());
            }
        }

        public static final class Unknown implements Reward {
            public static final Parcelable.Creator CREATOR;
            public final int X;

            static {
                Unknown.CREATOR = new k();  // initializer: Ljava/lang/Object;-><init>()V
            }

            public Unknown(int v) {
                this.X = v;
            }

            @Override  // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override  // com.wave.customer.scratchCardRewards.components.RewardsPathState$Reward
            public final int e() {
                return this.X;
            }

            @Override
            public final boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Unknown ? this.X == ((Unknown)object0).X : false;
            }

            @Override
            public final int hashCode() {
                return this.X;
            }

            @Override
            public final String toString() {
                return J.f(new StringBuilder("Unknown(step="), this.X, ")");
            }

            @Override  // android.os.Parcelable
            public final void writeToParcel(Parcel parcel0, int v) {
                j.f(parcel0, "dest");
                parcel0.writeInt(this.X);
            }
        }

        int e();
    }

    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final Map Z;
    public final Map b0;
    public final Instructions c0;
    public final boolean d0;

    static {
        RewardsPathState.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public RewardsPathState(int v, int v1, Map map0, Map map1, Instructions rewardsPathState$Instructions0) {
        this.X = v;
        this.Y = v1;
        this.Z = map0;
        this.b0 = map1;
        this.c0 = rewardsPathState$Instructions0;
        this.d0 = rewardsPathState$Instructions0 != null;
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
        if(!(object0 instanceof RewardsPathState)) {
            return false;
        }
        if(this.X != ((RewardsPathState)object0).X) {
            return false;
        }
        if(this.Y != ((RewardsPathState)object0).Y) {
            return false;
        }
        if(!j.a(this.Z, ((RewardsPathState)object0).Z)) {
            return false;
        }
        return j.a(this.b0, ((RewardsPathState)object0).b0) ? j.a(this.c0, ((RewardsPathState)object0).c0) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.b0.hashCode() + (this.Z.hashCode() + (this.X * 0x1F + this.Y) * 0x1F) * 0x1F) * 0x1F;
        return this.c0 == null ? v : v + this.c0.hashCode();
    }

    @Override
    public final String toString() {
        return "RewardsPathState(currentStep=" + this.X + ", maxVisibleStep=" + this.Y + ", pastRewards=" + this.Z + ", upcomingRewards=" + this.b0 + ", instructions=" + this.c0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(this.X);
        parcel0.writeInt(this.Y);
        parcel0.writeInt(this.Z.size());
        for(Object object0: this.Z.entrySet()) {
            parcel0.writeInt(((Number)((Map.Entry)object0).getKey()).intValue());
            parcel0.writeParcelable(((Parcelable)((Map.Entry)object0).getValue()), v);
        }
        parcel0.writeInt(this.b0.size());
        for(Object object1: this.b0.entrySet()) {
            parcel0.writeInt(((Number)((Map.Entry)object1).getKey()).intValue());
            parcel0.writeParcelable(((Parcelable)((Map.Entry)object1).getValue()), v);
        }
        Instructions rewardsPathState$Instructions0 = this.c0;
        if(rewardsPathState$Instructions0 == null) {
            parcel0.writeInt(0);
            return;
        }
        parcel0.writeInt(1);
        rewardsPathState$Instructions0.writeToParcel(parcel0, v);
    }
}

