package com.google.android.gms.internal.measurement;

import R2.e;
import R2.h;
import i.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class r4 extends k {
    public final boolean Z;
    public final boolean b0;
    public final i2 c0;

    public r4(i2 i20, boolean z, boolean z1) {
        this.c0 = i20;
        super("log");
        this.Z = z;
        this.b0 = z1;
    }

    @Override  // com.google.android.gms.internal.measurement.k
    public final o b(h h0, List list0) {
        int v2;
        x1.o("log", 1, list0);
        o o0 = o.e;
        i2 i20 = this.c0;
        if(list0.size() == 1) {
            J j0 = (J)i20.b0;
            o o1 = (o)list0.get(0);
            j0.r(3, ((e)h0.b).n(h0, o1).i(), Collections.emptyList(), this.Z, this.b0);
            return o0;
        }
        o o2 = (o)list0.get(0);
        int v = x1.m(((double)((e)h0.b).n(h0, o2).g()));
        if(v == 2) {
            v2 = 4;
        }
        else {
            switch(v) {
                case 3: {
                    v2 = 1;
                    break;
                }
                case 5: {
                    v2 = 5;
                    break;
                }
                default: {
                    v2 = v == 6 ? 2 : 3;
                }
            }
        }
        o o3 = (o)list0.get(1);
        String s = ((e)h0.b).n(h0, o3).i();
        if(list0.size() == 2) {
            ((J)i20.b0).r(v2, s, Collections.emptyList(), this.Z, this.b0);
            return o0;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 2; v1 < Math.min(list0.size(), 5); ++v1) {
            o o4 = (o)list0.get(v1);
            arrayList0.add(((e)h0.b).n(h0, o4).i());
        }
        ((J)i20.b0).r(v2, s, arrayList0, this.Z, this.b0);
        return o0;
    }
}

