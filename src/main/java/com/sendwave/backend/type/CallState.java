package com.sendwave.backend.type;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import m5.b;

public interface CallState extends Parcelable {
    public static final class Answered implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final Answered X;
        public static final String Y;

        static {
            Answered.X = new Answered();
            Answered.Y = "Answered";
            Answered.CREATOR = new C();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return Answered.Y;
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

    public static final class BeforeCall implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final BeforeCall X;
        public static final String Y;

        static {
            BeforeCall.X = new BeforeCall();
            BeforeCall.Y = "BeforeCall";
            BeforeCall.CREATOR = new D();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return BeforeCall.Y;
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

    public static final class CallEnded implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final CallEnded X;
        public static final String Y;

        static {
            CallEnded.X = new CallEnded();
            CallEnded.Y = "CallEnded";
            CallEnded.CREATOR = new E();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return CallEnded.Y;
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

    public static final class NoCall implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final NoCall X;
        public static final String Y;

        static {
            NoCall.X = new NoCall();
            NoCall.Y = "NoCall";
            NoCall.CREATOR = new G();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return NoCall.Y;
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

    public static final class Reconnecting implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final Reconnecting X;
        public static final String Y;

        static {
            Reconnecting.X = new Reconnecting();
            Reconnecting.Y = "Reconnecting";
            Reconnecting.CREATOR = new H();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return Reconnecting.Y;
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

    public static final class Ringing implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final Ringing X;
        public static final String Y;

        static {
            Ringing.X = new Ringing();
            Ringing.Y = "Ringing";
            Ringing.CREATOR = new I();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return Ringing.Y;
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

    public static final class StartingCall implements CallState {
        public static final Parcelable.Creator CREATOR;
        public static final StartingCall X;
        public static final String Y;

        static {
            StartingCall.X = new StartingCall();
            StartingCall.Y = "StartingCall";
            StartingCall.CREATOR = new J();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return StartingCall.Y;
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

    public static final class UNKNOWN__ implements CallState {
        public static final Parcelable.Creator CREATOR;
        public final String X;

        static {
            UNKNOWN__.CREATOR = new K();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public UNKNOWN__(String s) {
            j.f(s, "rawValue");
            super();
            this.X = s;
        }

        @Override  // com.sendwave.backend.type.CallState
        public final String a() {
            return this.X;
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof UNKNOWN__ ? j.a(this.X, ((UNKNOWN__)object0).X) : false;
        }

        @Override
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override
        public final String toString() {
            return b.y(new StringBuilder("UNKNOWN__("), this.X, ")");
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            j.f(parcel0, "dest");
            parcel0.writeString(this.X);
        }
    }

    public static final F p;

    static {
        CallState.p = F.a;
    }

    String a();
}

