package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.Currency;

public final class BillPayAmountFieldFragment implements Data {
    public final String a;
    public final String b;
    public final Currency c;
    public final String d;
    public final LimitFragment e;

    public BillPayAmountFieldFragment(String s, String s1, Currency currency0, String s2, LimitFragment limitFragment0) {
        this.a = s;
        this.b = s1;
        this.c = currency0;
        this.d = s2;
        this.e = limitFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BillPayAmountFieldFragment)) {
            return false;
        }
        if(!j.a(this.a, ((BillPayAmountFieldFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((BillPayAmountFieldFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((BillPayAmountFieldFragment)object0).c)) {
            return false;
        }
        return j.a(this.d, ((BillPayAmountFieldFragment)object0).d) ? j.a(this.e, ((BillPayAmountFieldFragment)object0).e) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + e.s((this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F, 0x1F, this.d);
    }

    @Override
    public final String toString() {
        return "BillPayAmountFieldFragment(__typename=" + this.a + ", id=" + this.b + ", currency=" + this.c + ", country=" + this.d + ", limitFragment=" + this.e + ")";
    }
}

