package com.wave.components.sendmoney;

import K9.z;
import Nb.j;
import X8.h;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;

public final class SendMoneyDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;
    public final Contact Y;
    public final ActionSource Z;
    public final String b0;
    public final h c0;

    static {
        SendMoneyDialogParams.CREATOR = new z(0);
    }

    public SendMoneyDialogParams(FragmentHandle fragmentHandle0, Contact contact0, ActionSource actionSource0, String s, h h0) {
        j.f(fragmentHandle0, "handle");
        j.f(contact0, "recipient");
        j.f(actionSource0, "actionSource");
        j.f(h0, "contactSource");
        super();
        this.X = fragmentHandle0;
        this.Y = contact0;
        this.Z = actionSource0;
        this.b0 = s;
        this.c0 = h0;
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
        if(!(object0 instanceof SendMoneyDialogParams)) {
            return false;
        }
        if(!j.a(this.X, ((SendMoneyDialogParams)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((SendMoneyDialogParams)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((SendMoneyDialogParams)object0).Z)) {
            return false;
        }
        return j.a(this.b0, ((SendMoneyDialogParams)object0).b0) ? this.c0 == ((SendMoneyDialogParams)object0).c0 : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.X.hashCode();
        int v1 = this.Y.hashCode();
        int v2 = this.Z.hashCode();
        return this.b0 == null ? this.c0.hashCode() + (v2 + (v1 + v * 0x1F) * 0x1F) * 961 : this.c0.hashCode() + ((v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + this.b0.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SendMoneyDialogParams(handle=" + this.X + ", recipient=" + this.Y + ", actionSource=" + this.Z + ", actionUrl=" + this.b0 + ", contactSource=" + this.c0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
        parcel0.writeParcelable(this.Y, v);
        parcel0.writeParcelable(this.Z, v);
        parcel0.writeString(this.b0);
        parcel0.writeString(this.c0.name());
    }
}

