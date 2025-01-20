package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.ArrayList;
import java.util.Iterator;

public final class r implements o {
    public final String X;
    public final ArrayList Y;

    public r(String s, ArrayList arrayList0) {
        this.X = s;
        ArrayList arrayList1 = new ArrayList();
        this.Y = arrayList1;
        arrayList1.addAll(arrayList0);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
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
        if(!(object0 instanceof r)) {
            return false;
        }
        String s = this.X;
        if(s != null) {
            if(!s.equals(((r)object0).X)) {
                return false;
            }
        }
        else if(((r)object0).X != null) {
            return false;
        }
        ArrayList arrayList0 = ((r)object0).Y;
        return this.Y == null ? arrayList0 == null : this.Y.equals(arrayList0);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.X == null ? 0 : this.X.hashCode();
        ArrayList arrayList0 = this.Y;
        if(arrayList0 != null) {
            v = arrayList0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, h h0, ArrayList arrayList0) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}

