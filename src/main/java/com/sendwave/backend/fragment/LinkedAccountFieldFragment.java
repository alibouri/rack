package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.z3;
import com.apollographql.apollo.api.Fragment.Data;

public final class LinkedAccountFieldFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final z3 d;

    public LinkedAccountFieldFragment(String s, String s1, String s2, z3 z30) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinkedAccountFieldFragment)) {
            return false;
        }
        if(!j.a(this.a, ((LinkedAccountFieldFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((LinkedAccountFieldFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((LinkedAccountFieldFragment)object0).c) ? j.a(this.d, ((LinkedAccountFieldFragment)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        return this.d == null ? v : v + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "LinkedAccountFieldFragment(__typename=" + this.a + ", name=" + this.b + ", displayName=" + this.c + ", onLinkedAccountTextField=" + this.d + ")";
    }
}

