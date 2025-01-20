package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.ArrayList;
import java.util.Iterator;

public final class i implements o {
    public final o X;
    public final String Y;

    public i(String s) {
        this.X = o.e;
        this.Y = s;
    }

    public i(String s, o o0) {
        this.X = o0;
        this.Y = s;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof i ? this.Y.equals(((i)object0).Y) && this.X.equals(((i)object0).X) : false;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode() + this.Y.hashCode() * 0x1F;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        o o0 = this.X.l();
        return new i(this.Y, o0);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, h h0, ArrayList arrayList0) {
        throw new IllegalStateException("Control does not have functions");
    }
}

