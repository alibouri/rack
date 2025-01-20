package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.ArrayList;
import java.util.Iterator;

public final class u implements o {
    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        return Boolean.FALSE;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof u;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        return NaN;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        return "undefined";
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        return o.e;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, h h0, ArrayList arrayList0) {
        throw new IllegalStateException("Undefined has no function " + s);
    }
}

