package com.google.android.gms.internal.measurement;

import R2.e;
import R2.h;
import java.util.ArrayList;
import java.util.List;

public final class p extends k {
    public final ArrayList Z;
    public final ArrayList b0;
    public final h c0;

    public p(p p0) {
        super(p0.X);
        ArrayList arrayList0 = new ArrayList(p0.Z.size());
        this.Z = arrayList0;
        arrayList0.addAll(p0.Z);
        ArrayList arrayList1 = new ArrayList(p0.b0.size());
        this.b0 = arrayList1;
        arrayList1.addAll(p0.b0);
        this.c0 = p0.c0;
    }

    public p(String s, ArrayList arrayList0, List list0, h h0) {
        super(s);
        this.Z = new ArrayList();
        this.c0 = h0;
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                String s1 = ((o)object0).i();
                this.Z.add(s1);
            }
        }
        this.b0 = new ArrayList(list0);
    }

    @Override  // com.google.android.gms.internal.measurement.k
    public final o b(h h0, List list0) {
        o o0;
        h h1 = this.c0.e();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.Z;
            o0 = o.e;
            if(v >= arrayList0.size()) {
                break;
            }
            if(v < list0.size()) {
                String s = (String)arrayList0.get(v);
                o o1 = (o)list0.get(v);
                h1.k(s, ((e)h0.b).n(h0, o1));
            }
            else {
                h1.k(((String)arrayList0.get(v)), o0);
            }
        }
        for(Object object0: this.b0) {
            o o2 = (o)object0;
            e e0 = (e)h1.b;
            o o3 = e0.n(h1, o2);
            if(o3 instanceof r) {
                o3 = e0.n(h1, o2);
            }
            if(o3 instanceof i) {
                return ((i)o3).X;
            }
            if(false) {
                break;
            }
        }
        return o0;
    }

    @Override  // com.google.android.gms.internal.measurement.k
    public final o l() {
        return new p(this);
    }
}

