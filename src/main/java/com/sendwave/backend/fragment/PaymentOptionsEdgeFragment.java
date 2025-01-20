package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.a6;
import a9.c6;
import com.apollographql.apollo.api.Fragment.Data;

public final class PaymentOptionsEdgeFragment implements Data {
    public final String a;
    public final c6 b;
    public final String c;
    public final a6 d;

    public PaymentOptionsEdgeFragment(String s, c6 c60, String s1, a6 a60) {
        this.a = s;
        this.b = c60;
        this.c = s1;
        this.d = a60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PaymentOptionsEdgeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PaymentOptionsEdgeFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((PaymentOptionsEdgeFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((PaymentOptionsEdgeFragment)object0).c) ? j.a(this.d, ((PaymentOptionsEdgeFragment)object0).d) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c);
        return this.d == null ? v : v + this.d.a.hashCode();
    }

    @Override
    public final String toString() {
        return "PaymentOptionsEdgeFragment(id=" + this.a + ", node=" + this.b + ", cursor=" + this.c + ", categoryStartHeader=" + this.d + ")";
    }
}

