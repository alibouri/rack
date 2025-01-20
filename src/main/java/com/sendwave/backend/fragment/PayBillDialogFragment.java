package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.Currency;

public final class PayBillDialogFragment implements Data {
    public final String a;
    public final String b;
    public final Currency c;
    public final BillPayAmountFieldFragment d;

    public PayBillDialogFragment(String s, String s1, Currency currency0, BillPayAmountFieldFragment billPayAmountFieldFragment0) {
        this.a = s;
        this.b = s1;
        this.c = currency0;
        this.d = billPayAmountFieldFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PayBillDialogFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PayBillDialogFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((PayBillDialogFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((PayBillDialogFragment)object0).c) ? j.a(this.d, ((PayBillDialogFragment)object0).d) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "PayBillDialogFragment(__typename=" + this.a + ", id=" + this.b + ", currency=" + this.c + ", billPayAmountFieldFragment=" + this.d + ")";
    }
}

