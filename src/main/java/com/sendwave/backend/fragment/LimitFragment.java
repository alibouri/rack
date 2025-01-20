package com.sendwave.backend.fragment;

import Nb.j;
import Y8.o;
import a9.u3;
import a9.v3;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;

public final class LimitFragment implements Data {
    public final String a;
    public final CurrencyAmount b;
    public final CurrencyAmount c;
    public final CurrencyAmount d;
    public final u3 e;
    public final v3 f;
    public final CurrencyAmount g;

    public LimitFragment(String s, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, CurrencyAmount currencyAmount2, u3 u30, v3 v30, CurrencyAmount currencyAmount3) {
        this.a = s;
        this.b = currencyAmount0;
        this.c = currencyAmount1;
        this.d = currencyAmount2;
        this.e = u30;
        this.f = v30;
        this.g = currencyAmount3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LimitFragment)) {
            return false;
        }
        if(!j.a(this.a, ((LimitFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((LimitFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((LimitFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((LimitFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((LimitFragment)object0).e)) {
            return false;
        }
        return j.a(this.f, ((LimitFragment)object0).f) ? j.a(this.g, ((LimitFragment)object0).g) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.b, this.a.hashCode() * 0x1F, 0x1F);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f == null ? 0 : this.f.hashCode();
        CurrencyAmount currencyAmount0 = this.g;
        if(currencyAmount0 != null) {
            v1 = currencyAmount0.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "LimitFragment(id=" + this.a + ", balance=" + this.b + ", limitBalMin=" + this.c + ", perTransferLimit=" + this.d + ", dayLimit=" + this.e + ", monthLimit=" + this.f + ", overdraftMaxLimit=" + this.g + ")";
    }
}

