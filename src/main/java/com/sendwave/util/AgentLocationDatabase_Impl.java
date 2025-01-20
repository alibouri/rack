package com.sendwave.util;

import Ab.o;
import Bb.z;
import J2.t;
import Nb.j;
import W4.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o9.R1;
import q2.A;
import q2.i;
import q2.r;
import q9.k;
import w2.a;
import w2.c;

public final class AgentLocationDatabase_Impl extends AgentLocationDatabase {
    public final o o;

    public AgentLocationDatabase_Impl() {
        this.o = f.A(new R1(6, this));
    }

    @Override  // q2.v
    public final r d() {
        return new r(this, new HashMap(0), new HashMap(0), new String[]{"agent_location"});
    }

    @Override  // q2.v
    public final c e(i i0) {
        A a0 = new A(i0, new t(this), "1fda58d003aaf8f1db7381f88581fd6f", "181c0e24cae48f56b5eb50d9263a3939");
        j.f(i0.a, "context");
        a a1 = new a(i0.a, i0.b, a0, false, false);
        return i0.c.a(a1);
    }

    @Override  // q2.v
    public final List f(LinkedHashMap linkedHashMap0) {
        j.f(linkedHashMap0, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override  // q2.v
    public final Set h() {
        return new HashSet();
    }

    @Override  // q2.v
    public final Map i() {
        Map map0 = new HashMap();
        ((HashMap)map0).put(k.class, z.X);
        return map0;
    }

    @Override  // com.sendwave.util.AgentLocationDatabase
    public final k s() {
        return (k)this.o.getValue();
    }
}

