package com.google.i18n.phonenumbers;

import A3.e;
import java.io.Serializable;
import v.h;

public final class Phonenumber.PhoneNumber implements Serializable {
    public boolean X;
    public int Y;
    public long Z;
    public boolean b0;
    public String c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public String h0;
    public int i0;
    public String j0;

    // Deobfuscation rating: MEDIUM(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof Phonenumber.PhoneNumber && ((Phonenumber.PhoneNumber)object0) != null && (this == ((Phonenumber.PhoneNumber)object0) || this.Y == ((Phonenumber.PhoneNumber)object0).Y && this.Z == ((Phonenumber.PhoneNumber)object0).Z && this.c0.equals(((Phonenumber.PhoneNumber)object0).c0) && this.e0 == ((Phonenumber.PhoneNumber)object0).e0 && this.g0 == ((Phonenumber.PhoneNumber)object0).g0 && this.h0.equals(((Phonenumber.PhoneNumber)object0).h0) && this.i0 == ((Phonenumber.PhoneNumber)object0).i0 && this.j0.equals(((Phonenumber.PhoneNumber)object0).j0));
    }

    @Override
    public final int hashCode() {
        int v = e.s(((e.s((((long)this.Z).hashCode() + (0x87D + this.Y) * 53) * 53, 53, this.c0) + (this.e0 ? 0x4CF : 0x4D5)) * 53 + this.g0) * 53, 53, this.h0);
        int v1 = h.d(this.i0);
        return (this.j0.hashCode() + (v1 + v) * 53) * 53 + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Country Code: ");
        stringBuilder0.append(this.Y);
        stringBuilder0.append(" National Number: ");
        stringBuilder0.append(this.Z);
        if(this.d0 && this.e0) {
            stringBuilder0.append(" Leading Zero(s): true");
        }
        if(this.f0) {
            stringBuilder0.append(" Number of leading zeros: ");
            stringBuilder0.append(this.g0);
        }
        if(this.b0) {
            stringBuilder0.append(" Extension: ");
            stringBuilder0.append(this.c0);
        }
        return stringBuilder0.toString();
    }
}

