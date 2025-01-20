package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class k implements j, o {
    public final String X;
    public final HashMap Y;

    public k(String s) {
        this.Y = new HashMap();
        this.X = s;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        return Boolean.TRUE;
    }

    public abstract o b(h arg1, List arg2);

    @Override  // com.google.android.gms.internal.measurement.j
    public final o c(String s) {
        HashMap hashMap0 = this.Y;
        return hashMap0.containsKey(s) ? ((o)hashMap0.get(s)) : o.e;
    }

    @Override  // com.google.android.gms.internal.measurement.j
    public final boolean d(String s) {
        return this.Y.containsKey(s);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return new l(this.Y.keySet().iterator());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        return this.X == null ? false : this.X.equals(((k)object0).X);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        return NaN;
    }

    @Override
    public final int hashCode() {
        return this.X == null ? 0 : this.X.hashCode();
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        return this.X;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public o l() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.j
    public final void o(String s, o o0) {
        HashMap hashMap0 = this.Y;
        if(o0 == null) {
            hashMap0.remove(s);
            return;
        }
        hashMap0.put(s, o0);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, h h0, ArrayList arrayList0) {
        return "toString".equals(s) ? new q(this.X) : Z1.j(this, new q(s), h0, arrayList0);
    }
}

