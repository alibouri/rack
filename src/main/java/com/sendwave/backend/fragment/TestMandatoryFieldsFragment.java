package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import Y8.o;
import a9.u8;
import a9.v8;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;
import java.util.List;
import m5.b;

public final class TestMandatoryFieldsFragment implements Data {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final List d;
    public final v8 e;
    public final u8 f;

    public TestMandatoryFieldsFragment(String s, String s1, CurrencyAmount currencyAmount0, List list0, v8 v80, u8 u80) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = list0;
        this.e = v80;
        this.f = u80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TestMandatoryFieldsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((TestMandatoryFieldsFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((TestMandatoryFieldsFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((TestMandatoryFieldsFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((TestMandatoryFieldsFragment)object0).d)) {
            return false;
        }
        return j.a(this.e, ((TestMandatoryFieldsFragment)object0).e) ? j.a(this.f, ((TestMandatoryFieldsFragment)object0).f) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.f.a.hashCode() + e.s(b.q(this.d, o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F), 0x1F), 0x1F, this.e.a);
    }

    @Override
    public final String toString() {
        return "TestMandatoryFieldsFragment(id=" + this.a + ", name=" + this.b + ", paymentCardActivationFee=" + this.c + ", requestedDocuments=" + this.d + ", paymentCardActivationMessage=" + this.e + ", kycInfo=" + this.f + ")";
    }
}

