package com.google.android.gms.internal.measurement;

import R2.h;
import java.util.List;

public final class b extends k {
    public final int Z;

    public b(String s, int v) {
        this.Z = v;
        super(s);
    }

    @Override  // com.google.android.gms.internal.measurement.k
    public final o b(h h0, List list0) {
        switch(this.Z) {
            case 0: {
                return new com.google.android.gms.internal.measurement.h(0.0);
            }
            case 1: {
                return o.e;
            }
            case 2: 
            case 3: {
                return this;
            }
            default: {
                return o.e;
            }
        }
    }
}

