package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.Z;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;
import m5.b;

public final class BillFavoriteFragment implements Data {
    public final String a;
    public final String b;
    public final List c;
    public final Z d;

    public BillFavoriteFragment(String s, String s1, List list0, Z z0) {
        this.a = s;
        this.b = s1;
        this.c = list0;
        this.d = z0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BillFavoriteFragment)) {
            return false;
        }
        if(!j.a(this.a, ((BillFavoriteFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((BillFavoriteFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((BillFavoriteFragment)object0).c) ? j.a(this.d, ((BillFavoriteFragment)object0).d) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = b.q(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
        return this.d == null ? v : v + this.d.a.hashCode();
    }

    @Override
    public final String toString() {
        return "BillFavoriteFragment(id=" + this.a + ", name=" + this.b + ", fields=" + this.c + ", balance=" + this.d + ")";
    }
}

