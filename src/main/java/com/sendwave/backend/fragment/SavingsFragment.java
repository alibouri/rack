package com.sendwave.backend.fragment;

import Nb.j;
import a9.u6;
import a9.v6;
import a9.w6;
import com.apollographql.apollo.api.Fragment.Data;

public final class SavingsFragment implements Data {
    public final String a;
    public final v6 b;
    public final w6 c;
    public final u6 d;

    public SavingsFragment(String s, v6 v60, w6 w60, u6 u60) {
        this.a = s;
        this.b = v60;
        this.c = w60;
        this.d = u60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SavingsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SavingsFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SavingsFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((SavingsFragment)object0).c) ? j.a(this.d, ((SavingsFragment)object0).d) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.d.a.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SavingsFragment(id=" + this.a + ", user=" + this.b + ", wallet=" + this.c + ", support=" + this.d + ")";
    }
}

