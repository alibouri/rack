package com.sendwave.shared;

import A3.e;
import Bb.p;
import Bb.r;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import j6.c;
import java.util.ArrayList;
import m5.b;

public final class ProposedBillField implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final String Z;
    public final String b0;

    static {
        ProposedBillField.CREATOR = new c(23);
    }

    public ProposedBillField(String s, String s1, String s2, String s3) {
        j.f(s, "name");
        j.f(s1, "displayName");
        j.f(s2, "value");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.b0 = s3;
    }

    public final String b() {
        return this.b0 == null ? this.Z : this.b0;
    }

    public static float c(String s) {
        float f = (float)s.length();
        Iterable iterable0 = Vb.j.p0(s, new String[]{" "}, 0, 6);
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        for(Object object0: iterable0) {
            arrayList0.add(((String)object0).length());
        }
        Integer integer0 = (Integer)p.y0(arrayList0);
        return integer0 == null ? 4.0f * f + 1.0f : 4.0f * f + ((float)(((int)integer0)));
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
        if(!(object0 instanceof ProposedBillField)) {
            return false;
        }
        if(!j.a(this.X, ((ProposedBillField)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((ProposedBillField)object0).Y)) {
            return false;
        }
        return j.a(this.Z, ((ProposedBillField)object0).Z) ? j.a(this.b0, ((ProposedBillField)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z);
        return this.b0 == null ? v : v + this.b0.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ProposedBillField(name=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", displayName=");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.Z);
        stringBuilder0.append(", _displayValue=");
        return b.y(stringBuilder0, this.b0, ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeString(this.Z);
        parcel0.writeString(this.b0);
    }
}

