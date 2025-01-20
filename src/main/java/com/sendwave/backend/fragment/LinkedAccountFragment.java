package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.E3;
import a9.L3;
import com.apollographql.apollo.api.Fragment.Data;

public final class LinkedAccountFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final E3 d;
    public final L3 e;

    public LinkedAccountFragment(String s, String s1, String s2, E3 e30, L3 l30) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = e30;
        this.e = l30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinkedAccountFragment)) {
            return false;
        }
        if(!j.a(this.a, ((LinkedAccountFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((LinkedAccountFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((LinkedAccountFragment)object0).c)) {
            return false;
        }
        return j.a(this.d, ((LinkedAccountFragment)object0).d) ? j.a(this.e, ((LinkedAccountFragment)object0).e) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "LinkedAccountFragment(id=" + this.a + ", label=" + this.b + ", categoryLabel=" + this.c + ", accountType=" + this.d + ", state=" + this.e + ")";
    }
}

