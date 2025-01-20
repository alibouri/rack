package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.q8;
import a9.r8;
import com.apollographql.apollo.api.Fragment.Data;

public final class TestHomeFragment implements Data {
    public final String a;
    public final String b;
    public final q8 c;
    public final r8 d;

    public TestHomeFragment(String s, String s1, q8 q80, r8 r80) {
        this.a = s;
        this.b = s1;
        this.c = q80;
        this.d = r80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TestHomeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((TestHomeFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((TestHomeFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((TestHomeFragment)object0).c) ? j.a(this.d, ((TestHomeFragment)object0).d) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "TestHomeFragment(id=" + this.a + ", opaqueId=" + this.b + ", user=" + this.c + ", wallet=" + this.d + ")";
    }
}

