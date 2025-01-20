package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.ArrayList;
import java.util.Iterator;

public final class f implements o {
    public final boolean X;

    public f(Boolean boolean0) {
        if(boolean0 == null) {
            this.X = false;
            return;
        }
        this.X = boolean0.booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        return Boolean.valueOf(this.X);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? this.X == ((f)object0).X : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        return this.X ? 1.0 : 0.0;
    }

    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.X).hashCode();
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        return Boolean.toString(this.X);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        return new f(Boolean.valueOf(this.X));
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, h h0, ArrayList arrayList0) {
        boolean z = this.X;
        if(!"toString".equals(s)) {
            throw new IllegalArgumentException(Boolean.toString(z) + "." + s + " is not a function.");
        }
        return new q(Boolean.toString(z));
    }

    @Override
    public final String toString() {
        return String.valueOf(this.X);
    }
}

