package com.sendwave.backend.fragment;

import Nb.j;
import Y8.o;
import a9.M7;
import a9.N7;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.SettlementFailureReason;
import com.sendwave.backend.type.SettlementPriority;
import com.sendwave.backend.type.SettlementStatus;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;

public final class SettlementFragment implements Data {
    public final String a;
    public final SettlementStatus b;
    public final SettlementPriority c;
    public final Date d;
    public final Date e;
    public final CurrencyAmount f;
    public final CurrencyAmount g;
    public final M7 h;
    public final SettlementFailureReason i;
    public final N7 j;

    public SettlementFragment(String s, SettlementStatus settlementStatus0, SettlementPriority settlementPriority0, Date date0, Date date1, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, M7 m70, SettlementFailureReason settlementFailureReason0, N7 n70) {
        this.a = s;
        this.b = settlementStatus0;
        this.c = settlementPriority0;
        this.d = date0;
        this.e = date1;
        this.f = currencyAmount0;
        this.g = currencyAmount1;
        this.h = m70;
        this.i = settlementFailureReason0;
        this.j = n70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SettlementFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SettlementFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SettlementFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((SettlementFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((SettlementFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((SettlementFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((SettlementFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((SettlementFragment)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((SettlementFragment)object0).h)) {
            return false;
        }
        return j.a(this.i, ((SettlementFragment)object0).i) ? j.a(this.j, ((SettlementFragment)object0).j) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = o.n(this.f, ((this.d.hashCode() + ((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F, 0x1F);
        int v2 = this.g == null ? 0 : this.g.hashCode();
        int v3 = this.h.hashCode();
        int v4 = this.i == null ? 0 : this.i.hashCode();
        N7 n70 = this.j;
        if(n70 != null) {
            v = n70.hashCode();
        }
        return ((v3 + (v1 + v2) * 0x1F) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "SettlementFragment(id=" + this.a + ", status=" + this.b + ", priority=" + this.c + ", whenCreated=" + this.d + ", whenSettled=" + this.e + ", idealBalance=" + this.f + ", amountToSettle=" + this.g + ", agent=" + this.h + ", failureReason=" + this.i + ", details=" + this.j + ")";
    }
}

