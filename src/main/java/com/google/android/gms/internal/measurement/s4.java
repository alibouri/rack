package com.google.android.gms.internal.measurement;

import R2.e;
import R2.h;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class s4 extends k {
    public final q2 Z;
    public final HashMap b0;

    public s4(q2 q20) {
        super("require");
        this.b0 = new HashMap();
        this.Z = q20;
    }

    @Override  // com.google.android.gms.internal.measurement.k
    public final o b(h h0, List list0) {
        o o1;
        x1.k("require", 1, list0);
        o o0 = (o)list0.get(0);
        String s = ((e)h0.b).n(h0, o0).i();
        HashMap hashMap0 = this.b0;
        if(hashMap0.containsKey(s)) {
            return (o)hashMap0.get(s);
        }
        HashMap hashMap1 = (HashMap)this.Z.X;
        if(hashMap1.containsKey(s)) {
            Callable callable0 = (Callable)hashMap1.get(s);
            try {
                o1 = (o)callable0.call();
            }
            catch(Exception unused_ex) {
                throw new IllegalStateException("Failed to create API implementation: " + s);
            }
        }
        else {
            o1 = o.e;
        }
        if(o1 instanceof k) {
            hashMap0.put(s, ((k)o1));
        }
        return o1;
    }
}

