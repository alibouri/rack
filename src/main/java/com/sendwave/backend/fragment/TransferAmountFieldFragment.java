package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import Y8.o;
import a9.S8;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;
import g9.h;
import java.util.List;
import m5.b;

public final class TransferAmountFieldFragment implements Data {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final S8 d;
    public final h e;
    public final h f;
    public final List g;
    public final List h;
    public final PartnerOrg i;
    public final LimitFragment j;

    public TransferAmountFieldFragment(String s, String s1, CurrencyAmount currencyAmount0, S8 s80, h h0, h h1, List list0, List list1, PartnerOrg partnerOrg0, LimitFragment limitFragment0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = s80;
        this.e = h0;
        this.f = h1;
        this.g = list0;
        this.h = list1;
        this.i = partnerOrg0;
        this.j = limitFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransferAmountFieldFragment)) {
            return false;
        }
        if(!j.a(this.a, ((TransferAmountFieldFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((TransferAmountFieldFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((TransferAmountFieldFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((TransferAmountFieldFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((TransferAmountFieldFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((TransferAmountFieldFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((TransferAmountFieldFragment)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((TransferAmountFieldFragment)object0).h)) {
            return false;
        }
        return j.a(this.i, ((TransferAmountFieldFragment)object0).i) ? j.a(this.j, ((TransferAmountFieldFragment)object0).j) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
        int v1 = this.d.hashCode();
        int v2 = 0;
        int v3 = this.e == null ? 0 : this.e.hashCode();
        h h0 = this.f;
        if(h0 != null) {
            v2 = h0.hashCode();
        }
        return this.j.hashCode() + (this.i.hashCode() + b.q(this.h, b.q(this.g, (((v1 + v) * 0x1F + v3) * 0x1F + v2) * 0x1F, 0x1F), 0x1F)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "TransferAmountFieldFragment(__typename=" + this.a + ", id=" + this.b + ", balance=" + this.c + ", transferDescription=" + this.d + ", sendFeeFormula=" + this.e + ", receiveFeeFormula=" + this.f + ", internationalFeeFormulas=" + this.g + ", multicurrencyFeeFormulas=" + this.h + ", aimedPartnerOrg=" + this.i + ", limitFragment=" + this.j + ")";
    }
}

