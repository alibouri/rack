package com.sendwave.backend.fragment;

import Nb.j;
import a9.E0;
import a9.F0;
import com.apollographql.apollo.api.Fragment.Data;

public final class BuyAirtimeSelectFragment implements Data {
    public final String a;
    public final E0 b;
    public final F0 c;

    public BuyAirtimeSelectFragment(String s, E0 e00, F0 f00) {
        this.a = s;
        this.b = e00;
        this.c = f00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BuyAirtimeSelectFragment)) {
            return false;
        }
        if(!j.a(this.a, ((BuyAirtimeSelectFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((BuyAirtimeSelectFragment)object0).b) ? j.a(this.c, ((BuyAirtimeSelectFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "BuyAirtimeSelectFragment(id=" + this.a + ", user=" + this.b + ", wallet=" + this.c + ")";
    }
}

