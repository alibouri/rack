package com.google.android.gms.internal.measurement;

import R2.e;
import R2.h;
import a8.Q;
import i.J;
import j6.X;
import j6.Y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class i2 extends k {
    public final int Z;
    public Object b0;

    public i2(e e0) {
        this.Z = 1;
        this.b0 = e0;
        super("getValue");
    }

    public i2(Q q0) {
        this.Z = 0;
        super("internal.eventLogger");
        this.b0 = q0;
    }

    public i2(J j0) {
        this.Z = 2;
        super("internal.logger");
        this.b0 = j0;
        r4 r40 = new r4(this, false, true);
        this.Y.put("log", r40);
        b b0 = new b("silent", 2);
        this.Y.put("silent", b0);
        ((k)this.Y.get("silent")).o("log", new r4(this, true, true));
        b b1 = new b("unmonitored", 3);
        this.Y.put("unmonitored", b1);
        ((k)this.Y.get("unmonitored")).o("log", new r4(this, false, false));
    }

    public i2(X x0) {
        this.Z = 4;
        super("internal.appMetadata");
        this.b0 = x0;
    }

    public i2(String s) {
        this.Z = 3;
        super(s);
    }

    @Override  // com.google.android.gms.internal.measurement.k
    public final o b(h h0, List list0) {
        TreeMap treeMap0;
        switch(this.Z) {
            case 0: {
                x1.k(this.X, 3, list0);
                o o0 = (o)list0.get(0);
                String s = ((e)h0.b).n(h0, o0).i();
                o o1 = (o)list0.get(1);
                long v = (long)x1.a(((double)((e)h0.b).n(h0, o1).g()));
                o o2 = (o)list0.get(2);
                o o3 = ((e)h0.b).n(h0, o2);
                HashMap hashMap0 = o3 instanceof n ? x1.g(((n)o3)) : new HashMap();
                Q q0 = (Q)this.b0;
                q0.getClass();
                HashMap hashMap1 = new HashMap();
                for(Object object0: hashMap0.keySet()) {
                    String s1 = (String)object0;
                    HashMap hashMap2 = ((c)q0.Y).c;
                    hashMap1.put(s1, c.a((hashMap2.containsKey(s1) ? hashMap2.get(s1) : null), s1, hashMap0.get(s1)));
                }
                ((ArrayList)q0.b0).add(new c(s, v, hashMap1));
                return o.e;
            }
            case 1: {
                x1.k("getValue", 2, list0);
                o o4 = (o)list0.get(0);
                o o5 = ((e)h0.b).n(h0, o4);
                o o6 = (o)list0.get(1);
                o o7 = ((e)h0.b).n(h0, o6);
                String s2 = o5.i();
                e e0 = (e)this.b0;
                Map map0 = (Map)((Y)e0.Y).c0.get(((String)e0.X));
                String s3 = map0 == null || !map0.containsKey(s2) ? null : ((String)map0.get(s2));
                return s3 != null ? new q(s3) : o7;
            }
            case 2: {
                return o.e;
            }
            case 3: {
                x1.k(this.X, 3, list0);
                o o8 = (o)list0.get(0);
                ((e)h0.b).n(h0, o8).i();
                o o9 = (o)list0.get(1);
                o o10 = ((e)h0.b).n(h0, o9);
                if(!(o10 instanceof p)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                o o11 = (o)list0.get(2);
                o o12 = ((e)h0.b).n(h0, o11);
                if(!(o12 instanceof n)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                if(!((n)o12).X.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String s4 = ((n)o12).c("type").i();
                int v1 = ((n)o12).X.containsKey("priority") ? x1.m(((double)((n)o12).c("priority").g())) : 1000;
                R2.c c0 = (R2.c)this.b0;
                c0.getClass();
                if("create".equals(s4)) {
                    treeMap0 = (TreeMap)c0.Z;
                }
                else if("edit".equals(s4)) {
                    treeMap0 = (TreeMap)c0.Y;
                }
                else {
                    throw new IllegalStateException("Unknown callback type: " + s4);
                }
                if(treeMap0.containsKey(v1)) {
                    v1 = ((int)(((Integer)treeMap0.lastKey()))) + 1;
                }
                treeMap0.put(v1, ((p)o10));
                return o.e;
            }
            default: {
                try {
                    return G1.g(((X)this.b0).call());
                }
                catch(Exception unused_ex) {
                    return o.e;
                }
            }
        }
    }
}

